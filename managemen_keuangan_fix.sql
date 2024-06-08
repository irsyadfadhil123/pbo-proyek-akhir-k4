-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 08, 2024 at 03:42 AM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `pengatur_keuangan`
--

-- --------------------------------------------------------

--
-- Table structure for table `laporankeuangan`
--

CREATE TABLE `laporankeuangan` (
  `id_laporan` int(11) NOT NULL,
  `tanggal` date DEFAULT NULL,
  `total_penjualan` decimal(15,2) DEFAULT NULL,
  `total_pembelian` decimal(15,2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `pelanggan`
--

CREATE TABLE `pelanggan` (
  `id_pelanggan` int(11) NOT NULL,
  `nama_pelanggan` varchar(100) DEFAULT NULL,
  `kontak_pelanggan` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `pelanggan`
--

INSERT INTO `pelanggan` (`id_pelanggan`, `nama_pelanggan`, `kontak_pelanggan`) VALUES
(1, 'Kalfin Syah', '1234567890');

-- --------------------------------------------------------

--
-- Table structure for table `pembelian`
--

CREATE TABLE `pembelian` (
  `id_pembelian` int(11) NOT NULL,
  `tanggal` date DEFAULT current_timestamp(),
  `id_barang` int(11) DEFAULT NULL,
  `jumlah_barang` int(11) DEFAULT NULL,
  `uang_keluar` int(20) NOT NULL,
  `catatan` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `pembelian`
--

INSERT INTO `pembelian` (`id_pembelian`, `tanggal`, `id_barang`, `jumlah_barang`, `uang_keluar`, `catatan`) VALUES
(1, '2024-05-29', 1, 0, 10000, NULL),
(2, '2024-05-30', 1, 10, 50000, 'ini tes');

--
-- Triggers `pembelian`
--
DELIMITER $$
CREATE TRIGGER `after_pembelian_delete` AFTER DELETE ON `pembelian` FOR EACH ROW BEGIN
    UPDATE stokbarang
    SET jumlah = jumlah - OLD.jumlah_barang
    WHERE id_barang = OLD.id_barang;
END
$$
DELIMITER ;
DELIMITER $$
CREATE TRIGGER `after_pembelian_insert` AFTER INSERT ON `pembelian` FOR EACH ROW BEGIN
    UPDATE stokbarang SET jumlah = jumlah + NEW.jumlah_barang
    WHERE id_barang = NEW.id_barang;
END
$$
DELIMITER ;
DELIMITER $$
CREATE TRIGGER `after_pembelian_update` AFTER UPDATE ON `pembelian` FOR EACH ROW BEGIN
    UPDATE stokbarang
    SET jumlah = jumlah - OLD.jumlah_barang
    WHERE id_barang = OLD.id_barang;

    UPDATE stokbarang
    SET jumlah = jumlah + NEW.jumlah_barang
    WHERE id_barang = NEW.id_barang;
END
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Table structure for table `pemilikusaha`
--

CREATE TABLE `pemilikusaha` (
  `id_pemilik` int(11) NOT NULL,
  `nama` varchar(100) DEFAULT NULL,
  `username` varchar(100) DEFAULT NULL,
  `password` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `pemilikusaha`
--

INSERT INTO `pemilikusaha` (`id_pemilik`, `nama`, `username`, `password`) VALUES
(1, 'Admin', 'admin', 'admin');

-- --------------------------------------------------------

--
-- Table structure for table `penjualan`
--

CREATE TABLE `penjualan` (
  `id_penjualan` int(11) NOT NULL,
  `tanggal` date DEFAULT current_timestamp(),
  `id_barang` int(11) DEFAULT NULL,
  `jumlah_barang` int(11) DEFAULT NULL,
  `uang_masuk` int(20) NOT NULL,
  `catatan` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `penjualan`
--

INSERT INTO `penjualan` (`id_penjualan`, `tanggal`, `id_barang`, `jumlah_barang`, `uang_masuk`, `catatan`) VALUES
(1, '2024-05-30', 3, 5, 10000, 'tes1234'),
(2, '2024-05-26', 3, 5, 15000, 'roti 5'),
(9, '2024-05-29', 1, 3, 25000, 'tes123'),
(11, '2024-06-05', 3, 10, 30000, NULL);

--
-- Triggers `penjualan`
--
DELIMITER $$
CREATE TRIGGER `after_penjualan_delete` AFTER DELETE ON `penjualan` FOR EACH ROW BEGIN
    UPDATE stokbarang
    SET jumlah = jumlah + OLD.jumlah_barang
    WHERE id_barang = OLD.id_barang;
END
$$
DELIMITER ;
DELIMITER $$
CREATE TRIGGER `after_penjualan_insert` AFTER INSERT ON `penjualan` FOR EACH ROW BEGIN
    UPDATE stokbarang SET jumlah = jumlah - NEW.jumlah_barang
    WHERE id_barang = NEW.id_barang;
END
$$
DELIMITER ;
DELIMITER $$
CREATE TRIGGER `after_penjualan_update` AFTER UPDATE ON `penjualan` FOR EACH ROW BEGIN
    UPDATE stokbarang
    SET jumlah = jumlah + OLD.jumlah_barang
    WHERE id_barang = OLD.id_barang;

    UPDATE stokbarang
    SET jumlah = jumlah - NEW.jumlah_barang
    WHERE id_barang = NEW.id_barang;
END
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Table structure for table `piutang`
--

CREATE TABLE `piutang` (
  `id_piutang` int(11) NOT NULL,
  `id_pelanggan` int(11) NOT NULL,
  `tanggal` date NOT NULL,
  `jumlah` int(11) NOT NULL,
  `catatan` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `piutang`
--

INSERT INTO `piutang` (`id_piutang`, `id_pelanggan`, `tanggal`, `jumlah`, `catatan`) VALUES
(1, 1, '2024-06-07', 9000, 'soto besar');

-- --------------------------------------------------------

--
-- Table structure for table `stokbarang`
--

CREATE TABLE `stokbarang` (
  `id_barang` int(11) NOT NULL,
  `nama_barang` varchar(100) DEFAULT NULL,
  `jumlah` int(11) DEFAULT NULL,
  `harga_satuan` decimal(15,2) DEFAULT NULL,
  `peringatan_minimum` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `stokbarang`
--

INSERT INTO `stokbarang` (`id_barang`, `nama_barang`, `jumlah`, `harga_satuan`, `peringatan_minimum`) VALUES
(1, 'snack', 100, 5000.00, 10),
(3, 'Roti', 0, 3000.00, 5);

-- --------------------------------------------------------

--
-- Table structure for table `supplier`
--

CREATE TABLE `supplier` (
  `id_supplier` int(11) NOT NULL,
  `nama_supplier` varchar(100) DEFAULT NULL,
  `kontak_supplier` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `supplier`
--

INSERT INTO `supplier` (`id_supplier`, `nama_supplier`, `kontak_supplier`) VALUES
(1, 'Kalfin', 'kalpinkenjeran@gmail.com');

-- --------------------------------------------------------

--
-- Table structure for table `targetkeuangan`
--

CREATE TABLE `targetkeuangan` (
  `id_target` int(11) NOT NULL,
  `target_pendapatan` decimal(15,2) DEFAULT NULL,
  `periode` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `utang`
--

CREATE TABLE `utang` (
  `id_utang` int(11) NOT NULL,
  `id_supplier` int(11) NOT NULL,
  `tanggal` date DEFAULT NULL,
  `jumlah` int(11) NOT NULL,
  `catatan` varchar(150) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `utang`
--

INSERT INTO `utang` (`id_utang`, `id_supplier`, `tanggal`, `jumlah`, `catatan`) VALUES
(2, 1, '2024-06-08', 100000, 'testing123');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `laporankeuangan`
--
ALTER TABLE `laporankeuangan`
  ADD PRIMARY KEY (`id_laporan`);

--
-- Indexes for table `pelanggan`
--
ALTER TABLE `pelanggan`
  ADD PRIMARY KEY (`id_pelanggan`);

--
-- Indexes for table `pembelian`
--
ALTER TABLE `pembelian`
  ADD PRIMARY KEY (`id_pembelian`),
  ADD KEY `id_barang` (`id_barang`);

--
-- Indexes for table `pemilikusaha`
--
ALTER TABLE `pemilikusaha`
  ADD PRIMARY KEY (`id_pemilik`);

--
-- Indexes for table `penjualan`
--
ALTER TABLE `penjualan`
  ADD PRIMARY KEY (`id_penjualan`),
  ADD KEY `id_barang` (`id_barang`) USING BTREE;

--
-- Indexes for table `piutang`
--
ALTER TABLE `piutang`
  ADD PRIMARY KEY (`id_piutang`),
  ADD KEY `id_pelanggan` (`id_pelanggan`);

--
-- Indexes for table `stokbarang`
--
ALTER TABLE `stokbarang`
  ADD PRIMARY KEY (`id_barang`),
  ADD UNIQUE KEY `nama_barang` (`nama_barang`);

--
-- Indexes for table `supplier`
--
ALTER TABLE `supplier`
  ADD PRIMARY KEY (`id_supplier`);

--
-- Indexes for table `targetkeuangan`
--
ALTER TABLE `targetkeuangan`
  ADD PRIMARY KEY (`id_target`);

--
-- Indexes for table `utang`
--
ALTER TABLE `utang`
  ADD PRIMARY KEY (`id_utang`),
  ADD KEY `id_supplier` (`id_supplier`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `laporankeuangan`
--
ALTER TABLE `laporankeuangan`
  MODIFY `id_laporan` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `pelanggan`
--
ALTER TABLE `pelanggan`
  MODIFY `id_pelanggan` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `pembelian`
--
ALTER TABLE `pembelian`
  MODIFY `id_pembelian` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `pemilikusaha`
--
ALTER TABLE `pemilikusaha`
  MODIFY `id_pemilik` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `penjualan`
--
ALTER TABLE `penjualan`
  MODIFY `id_penjualan` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT for table `piutang`
--
ALTER TABLE `piutang`
  MODIFY `id_piutang` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `stokbarang`
--
ALTER TABLE `stokbarang`
  MODIFY `id_barang` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `supplier`
--
ALTER TABLE `supplier`
  MODIFY `id_supplier` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `targetkeuangan`
--
ALTER TABLE `targetkeuangan`
  MODIFY `id_target` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `utang`
--
ALTER TABLE `utang`
  MODIFY `id_utang` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `piutang`
--
ALTER TABLE `piutang`
  ADD CONSTRAINT `piutang_ibfk_1` FOREIGN KEY (`id_pelanggan`) REFERENCES `pelanggan` (`id_pelanggan`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `utang`
--
ALTER TABLE `utang`
  ADD CONSTRAINT `utang_ibfk_1` FOREIGN KEY (`id_supplier`) REFERENCES `supplier` (`id_supplier`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

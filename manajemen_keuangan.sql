-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 25 Bulan Mei 2024 pada 03.03
-- Versi server: 10.4.21-MariaDB
-- Versi PHP: 7.3.31

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `manajemen_keuangan`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `detilpembelian`
--

CREATE TABLE `detilpembelian` (
  `id_detil_pembelian` int(11) NOT NULL,
  `id_pembelian` int(11) DEFAULT NULL,
  `id_barang` int(11) DEFAULT NULL,
  `jumlah` int(11) DEFAULT NULL,
  `harga_satuan` decimal(15,2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Struktur dari tabel `detilpenjualan`
--

CREATE TABLE `detilpenjualan` (
  `id_detil_penjualan` int(11) NOT NULL,
  `id_penjualan` int(11) DEFAULT NULL,
  `id_barang` int(11) DEFAULT NULL,
  `jumlah` int(11) DEFAULT NULL,
  `harga_satuan` decimal(15,2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Struktur dari tabel `laporankeuangan`
--

CREATE TABLE `laporankeuangan` (
  `id_laporan` int(11) NOT NULL,
  `id_pemilik` int(11) DEFAULT NULL,
  `tanggal` date DEFAULT NULL,
  `total_penjualan` decimal(15,2) DEFAULT NULL,
  `total_pembelian` decimal(15,2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Struktur dari tabel `panduanpengguna`
--

CREATE TABLE `panduanpengguna` (
  `id_panduan` int(11) NOT NULL,
  `id_pemilik` int(11) DEFAULT NULL,
  `konten` text DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Struktur dari tabel `pelanggan`
--

CREATE TABLE `pelanggan` (
  `id_pelanggan` int(11) NOT NULL,
  `nama_pelanggan` varchar(100) DEFAULT NULL,
  `kontak_pelanggan` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Struktur dari tabel `pembelian`
--

CREATE TABLE `pembelian` (
  `id_pembelian` int(11) NOT NULL,
  `id_pemilik` int(11) DEFAULT NULL,
  `tanggal` date DEFAULT NULL,
  `total_harga` decimal(15,2) DEFAULT NULL,
  `id_supplier` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Struktur dari tabel `pemilikusaha`
--

CREATE TABLE `pemilikusaha` (
  `id_pemilik` int(11) NOT NULL,
  `nama` varchar(100) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  `no_telepon` varchar(20) DEFAULT NULL,
  `pin` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Struktur dari tabel `penjualan`
--

CREATE TABLE `penjualan` (
  `id_penjualan` int(11) NOT NULL,
  `id_pemilik` int(11) DEFAULT NULL,
  `tanggal` date DEFAULT NULL,
  `total_harga` decimal(15,2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Struktur dari tabel `stokbarang`
--

CREATE TABLE `stokbarang` (
  `id_barang` int(11) NOT NULL,
  `nama_barang` varchar(100) DEFAULT NULL,
  `jumlah` int(11) DEFAULT NULL,
  `harga_satuan` decimal(15,2) DEFAULT NULL,
  `peringatan_minimum` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Struktur dari tabel `supplier`
--

CREATE TABLE `supplier` (
  `id_supplier` int(11) NOT NULL,
  `nama_supplier` varchar(100) DEFAULT NULL,
  `kontak_supplier` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Struktur dari tabel `targetkeuangan`
--

CREATE TABLE `targetkeuangan` (
  `id_target` int(11) NOT NULL,
  `id_pemilik` int(11) DEFAULT NULL,
  `target_pendapatan` decimal(15,2) DEFAULT NULL,
  `periode` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Struktur dari tabel `utangpiutang`
--

CREATE TABLE `utangpiutang` (
  `id_transaksi` int(11) NOT NULL,
  `id_pemilik` int(11) DEFAULT NULL,
  `jenis` enum('utang','piutang') DEFAULT NULL,
  `jumlah` decimal(15,2) DEFAULT NULL,
  `tanggal` date DEFAULT NULL,
  `id_supplier` int(11) DEFAULT NULL,
  `id_pelanggan` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `detilpembelian`
--
ALTER TABLE `detilpembelian`
  ADD PRIMARY KEY (`id_detil_pembelian`),
  ADD KEY `id_pembelian` (`id_pembelian`),
  ADD KEY `id_barang` (`id_barang`);

--
-- Indeks untuk tabel `detilpenjualan`
--
ALTER TABLE `detilpenjualan`
  ADD PRIMARY KEY (`id_detil_penjualan`),
  ADD KEY `id_penjualan` (`id_penjualan`),
  ADD KEY `id_barang` (`id_barang`);

--
-- Indeks untuk tabel `laporankeuangan`
--
ALTER TABLE `laporankeuangan`
  ADD PRIMARY KEY (`id_laporan`),
  ADD KEY `id_pemilik` (`id_pemilik`);

--
-- Indeks untuk tabel `panduanpengguna`
--
ALTER TABLE `panduanpengguna`
  ADD PRIMARY KEY (`id_panduan`),
  ADD KEY `id_pemilik` (`id_pemilik`);

--
-- Indeks untuk tabel `pelanggan`
--
ALTER TABLE `pelanggan`
  ADD PRIMARY KEY (`id_pelanggan`);

--
-- Indeks untuk tabel `pembelian`
--
ALTER TABLE `pembelian`
  ADD PRIMARY KEY (`id_pembelian`),
  ADD KEY `id_pemilik` (`id_pemilik`),
  ADD KEY `id_supplier` (`id_supplier`);

--
-- Indeks untuk tabel `pemilikusaha`
--
ALTER TABLE `pemilikusaha`
  ADD PRIMARY KEY (`id_pemilik`);

--
-- Indeks untuk tabel `penjualan`
--
ALTER TABLE `penjualan`
  ADD PRIMARY KEY (`id_penjualan`),
  ADD KEY `id_pemilik` (`id_pemilik`);

--
-- Indeks untuk tabel `stokbarang`
--
ALTER TABLE `stokbarang`
  ADD PRIMARY KEY (`id_barang`);

--
-- Indeks untuk tabel `supplier`
--
ALTER TABLE `supplier`
  ADD PRIMARY KEY (`id_supplier`);

--
-- Indeks untuk tabel `targetkeuangan`
--
ALTER TABLE `targetkeuangan`
  ADD PRIMARY KEY (`id_target`),
  ADD KEY `id_pemilik` (`id_pemilik`);

--
-- Indeks untuk tabel `utangpiutang`
--
ALTER TABLE `utangpiutang`
  ADD PRIMARY KEY (`id_transaksi`),
  ADD KEY `id_pemilik` (`id_pemilik`),
  ADD KEY `id_supplier` (`id_supplier`),
  ADD KEY `id_pelanggan` (`id_pelanggan`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `detilpembelian`
--
ALTER TABLE `detilpembelian`
  MODIFY `id_detil_pembelian` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT untuk tabel `detilpenjualan`
--
ALTER TABLE `detilpenjualan`
  MODIFY `id_detil_penjualan` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT untuk tabel `laporankeuangan`
--
ALTER TABLE `laporankeuangan`
  MODIFY `id_laporan` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT untuk tabel `panduanpengguna`
--
ALTER TABLE `panduanpengguna`
  MODIFY `id_panduan` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT untuk tabel `pelanggan`
--
ALTER TABLE `pelanggan`
  MODIFY `id_pelanggan` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT untuk tabel `pembelian`
--
ALTER TABLE `pembelian`
  MODIFY `id_pembelian` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT untuk tabel `pemilikusaha`
--
ALTER TABLE `pemilikusaha`
  MODIFY `id_pemilik` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT untuk tabel `penjualan`
--
ALTER TABLE `penjualan`
  MODIFY `id_penjualan` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT untuk tabel `stokbarang`
--
ALTER TABLE `stokbarang`
  MODIFY `id_barang` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT untuk tabel `supplier`
--
ALTER TABLE `supplier`
  MODIFY `id_supplier` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT untuk tabel `targetkeuangan`
--
ALTER TABLE `targetkeuangan`
  MODIFY `id_target` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT untuk tabel `utangpiutang`
--
ALTER TABLE `utangpiutang`
  MODIFY `id_transaksi` int(11) NOT NULL AUTO_INCREMENT;

--
-- Ketidakleluasaan untuk tabel pelimpahan (Dumped Tables)
--

--
-- Ketidakleluasaan untuk tabel `detilpembelian`
--
ALTER TABLE `detilpembelian`
  ADD CONSTRAINT `detilpembelian_ibfk_1` FOREIGN KEY (`id_pembelian`) REFERENCES `pembelian` (`id_pembelian`),
  ADD CONSTRAINT `detilpembelian_ibfk_2` FOREIGN KEY (`id_barang`) REFERENCES `stokbarang` (`id_barang`);

--
-- Ketidakleluasaan untuk tabel `detilpenjualan`
--
ALTER TABLE `detilpenjualan`
  ADD CONSTRAINT `detilpenjualan_ibfk_1` FOREIGN KEY (`id_penjualan`) REFERENCES `penjualan` (`id_penjualan`),
  ADD CONSTRAINT `detilpenjualan_ibfk_2` FOREIGN KEY (`id_barang`) REFERENCES `stokbarang` (`id_barang`);

--
-- Ketidakleluasaan untuk tabel `laporankeuangan`
--
ALTER TABLE `laporankeuangan`
  ADD CONSTRAINT `laporankeuangan_ibfk_1` FOREIGN KEY (`id_pemilik`) REFERENCES `pemilikusaha` (`id_pemilik`);

--
-- Ketidakleluasaan untuk tabel `panduanpengguna`
--
ALTER TABLE `panduanpengguna`
  ADD CONSTRAINT `panduanpengguna_ibfk_1` FOREIGN KEY (`id_pemilik`) REFERENCES `pemilikusaha` (`id_pemilik`);

--
-- Ketidakleluasaan untuk tabel `pembelian`
--
ALTER TABLE `pembelian`
  ADD CONSTRAINT `pembelian_ibfk_1` FOREIGN KEY (`id_pemilik`) REFERENCES `pemilikusaha` (`id_pemilik`),
  ADD CONSTRAINT `pembelian_ibfk_2` FOREIGN KEY (`id_supplier`) REFERENCES `supplier` (`id_supplier`);

--
-- Ketidakleluasaan untuk tabel `penjualan`
--
ALTER TABLE `penjualan`
  ADD CONSTRAINT `penjualan_ibfk_1` FOREIGN KEY (`id_pemilik`) REFERENCES `pemilikusaha` (`id_pemilik`);

--
-- Ketidakleluasaan untuk tabel `targetkeuangan`
--
ALTER TABLE `targetkeuangan`
  ADD CONSTRAINT `targetkeuangan_ibfk_1` FOREIGN KEY (`id_pemilik`) REFERENCES `pemilikusaha` (`id_pemilik`);

--
-- Ketidakleluasaan untuk tabel `utangpiutang`
--
ALTER TABLE `utangpiutang`
  ADD CONSTRAINT `utangpiutang_ibfk_1` FOREIGN KEY (`id_pemilik`) REFERENCES `pemilikusaha` (`id_pemilik`),
  ADD CONSTRAINT `utangpiutang_ibfk_2` FOREIGN KEY (`id_supplier`) REFERENCES `supplier` (`id_supplier`),
  ADD CONSTRAINT `utangpiutang_ibfk_3` FOREIGN KEY (`id_pelanggan`) REFERENCES `pelanggan` (`id_pelanggan`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

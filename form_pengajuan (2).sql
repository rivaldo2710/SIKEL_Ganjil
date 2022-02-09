-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 09 Feb 2022 pada 08.05
-- Versi server: 10.4.18-MariaDB
-- Versi PHP: 8.0.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `projek_sistemkeuanganlab`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `form_pengajuan`
--

CREATE TABLE `form_pengajuan` (
  `id_ail` int(11) NOT NULL,
  `nama_barang` varchar(50) NOT NULL,
  `jumlah_barang` int(50) NOT NULL,
  `tanggal_pengajuan` date NOT NULL,
  `deskripsi` varchar(100) NOT NULL,
  `status` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `form_pengajuan`
--

INSERT INTO `form_pengajuan` (`id_ail`, `nama_barang`, `jumlah_barang`, `tanggal_pengajuan`, `deskripsi`, `status`) VALUES
(69, 'mouse', 3, '2022-02-06', 'ddsadw', 'Tidak mendadak'),
(99, 'ter', 2, '2022-03-01', 'dddddddddd', 'Tidak mendadak'),
(1111, 'Mouse Pad', 1, '2022-02-21', 'Yang warna hitam', 'Sangat Penting'),
(1323, 'asd', 3, '2022-03-04', 'ddd', 'Penting'),
(88956, 'dc', 6, '2022-02-05', 'ee', 'Sangat Penting');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `form_pengajuan`
--
ALTER TABLE `form_pengajuan`
  ADD PRIMARY KEY (`id_ail`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

-- phpMyAdmin SQL Dump
-- version 4.6.5.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 05, 2017 at 09:20 PM
-- Server version: 10.1.21-MariaDB
-- PHP Version: 7.1.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `keuanganuniversitas`
--

-- --------------------------------------------------------

--
-- Table structure for table `adminfakultas`
--

CREATE TABLE `adminfakultas` (
  `idFakultas` varchar(30) NOT NULL,
  `namaFakultas` varchar(30) NOT NULL,
  `password` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `adminfakultas`
--

INSERT INTO `adminfakultas` (`idFakultas`, `namaFakultas`, `password`) VALUES
('FKFIF', 'Fakultas Teknik Informatika', 'ifjayaraga');

-- --------------------------------------------------------

--
-- Table structure for table `mahasiswa`
--

CREATE TABLE `mahasiswa` (
  `idMahasiswa` varchar(30) NOT NULL,
  `idFakultas` varchar(30) NOT NULL,
  `nama` varchar(30) NOT NULL,
  `password` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `mahasiswa`
--

INSERT INTO `mahasiswa` (`idMahasiswa`, `idFakultas`, `nama`, `password`) VALUES
('MHSIF0001', 'FKFIF', 'Raden Kiang Santang', 'kitakansaudara');

-- --------------------------------------------------------

--
-- Table structure for table `pembagiandana`
--

CREATE TABLE `pembagiandana` (
  `idPembagian` varchar(30) NOT NULL,
  `idFakultas` varchar(30) NOT NULL,
  `TotalDana` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `pembayaran`
--

CREATE TABLE `pembayaran` (
  `idPembayaran` varchar(30) NOT NULL,
  `idMahasiswa` varchar(30) NOT NULL,
  `ajaran` varchar(30) NOT NULL,
  `total` int(15) NOT NULL,
  `status` int(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `pengajuandana`
--

CREATE TABLE `pengajuandana` (
  `idPengajuan` varchar(30) NOT NULL,
  `idFakultas` varchar(30) NOT NULL,
  `tujuan` varchar(100) NOT NULL,
  `total` int(20) NOT NULL,
  `keterangan` int(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `pengeluarandana`
--

CREATE TABLE `pengeluarandana` (
  `idPengeluaran` varchar(30) NOT NULL,
  `idFakultas` varchar(30) NOT NULL,
  `tujuan` varchar(255) NOT NULL,
  `waktu` date NOT NULL,
  `total` int(15) NOT NULL,
  `keterangan` varchar(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 ROW_FORMAT=COMPACT;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `adminfakultas`
--
ALTER TABLE `adminfakultas`
  ADD PRIMARY KEY (`idFakultas`);

--
-- Indexes for table `mahasiswa`
--
ALTER TABLE `mahasiswa`
  ADD PRIMARY KEY (`idMahasiswa`),
  ADD KEY `fk_idFakultas` (`idFakultas`);

--
-- Indexes for table `pembagiandana`
--
ALTER TABLE `pembagiandana`
  ADD PRIMARY KEY (`idPembagian`),
  ADD KEY `fk_pembagianDana` (`idFakultas`);

--
-- Indexes for table `pembayaran`
--
ALTER TABLE `pembayaran`
  ADD PRIMARY KEY (`idPembayaran`),
  ADD KEY `fk_pembayaran` (`idMahasiswa`);

--
-- Indexes for table `pengajuandana`
--
ALTER TABLE `pengajuandana`
  ADD PRIMARY KEY (`idPengajuan`),
  ADD KEY `fk_pembagianDana` (`idFakultas`);

--
-- Indexes for table `pengeluarandana`
--
ALTER TABLE `pengeluarandana`
  ADD PRIMARY KEY (`idPengeluaran`),
  ADD KEY `fk_pengeluaran` (`idFakultas`),
  ADD KEY `idFakultas` (`idFakultas`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `mahasiswa`
--
ALTER TABLE `mahasiswa`
  ADD CONSTRAINT `mahasiswa_ibfk_1` FOREIGN KEY (`idFakultas`) REFERENCES `adminfakultas` (`idFakultas`) ON DELETE CASCADE;

--
-- Constraints for table `pembagiandana`
--
ALTER TABLE `pembagiandana`
  ADD CONSTRAINT `pembagiandana_ibfk_1` FOREIGN KEY (`idFakultas`) REFERENCES `adminfakultas` (`idFakultas`) ON DELETE CASCADE;

--
-- Constraints for table `pembayaran`
--
ALTER TABLE `pembayaran`
  ADD CONSTRAINT `pembayaran_ibfk_1` FOREIGN KEY (`idMahasiswa`) REFERENCES `mahasiswa` (`idMahasiswa`) ON DELETE CASCADE;

--
-- Constraints for table `pengajuandana`
--
ALTER TABLE `pengajuandana`
  ADD CONSTRAINT `pengajuandana_ibfk_1` FOREIGN KEY (`idFakultas`) REFERENCES `adminfakultas` (`idFakultas`) ON DELETE CASCADE;

--
-- Constraints for table `pengeluarandana`
--
ALTER TABLE `pengeluarandana`
  ADD CONSTRAINT `pengeluarandana_ibfk_1` FOREIGN KEY (`idFakultas`) REFERENCES `adminfakultas` (`idFakultas`) ON DELETE CASCADE;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

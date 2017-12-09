-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 09, 2017 at 11:42 AM
-- Server version: 10.1.28-MariaDB
-- PHP Version: 7.1.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
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
  `password` varchar(50) NOT NULL,
  `danafakultas` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `adminfakultas`
--

INSERT INTO `adminfakultas` (`idFakultas`, `namaFakultas`, `password`, `danafakultas`) VALUES
('FKFIF', 'Fakultas Teknik Informatika', 'ifjayaraga', 10155679),
('FKFIK', 'Fakultas Industri Kreatif', 'aaa123', 150000);

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

--
-- Dumping data for table `pembagiandana`
--

INSERT INTO `pembagiandana` (`idPembagian`, `idFakultas`, `TotalDana`) VALUES
('PBG123', 'FKFIF', 600000),
('PBG124', 'FKFIF', 900000),
('PBG181', 'FKFIF', 100000),
('PBG357', 'FKFIF', 55556),
('PBG480', 'FKFIF', 50000);

-- --------------------------------------------------------

--
-- Table structure for table `pembayaran`
--

CREATE TABLE `pembayaran` (
  `idPembayaran` varchar(30) NOT NULL,
  `idMahasiswa` varchar(30) NOT NULL,
  `ajaran` varchar(30) NOT NULL,
  `total` int(15) NOT NULL,
  `status` varchar(3) NOT NULL,
  `statusbayar` varchar(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `pembayaran`
--

INSERT INTO `pembayaran` (`idPembayaran`, `idMahasiswa`, `ajaran`, `total`, `status`, `statusbayar`) VALUES
('PMB123', 'MHSIF0001', '2016/2017', 1500000, '1', '1'),
('PMB124', 'MHSIF0001', '2017/2018', 1600000, '0', '1'),
('PMB125', 'MHSIF0001', '2018/2019', 5000000, '1', '1');

-- --------------------------------------------------------

--
-- Table structure for table `pengajuandana`
--

CREATE TABLE `pengajuandana` (
  `idPengajuan` varchar(30) NOT NULL,
  `idFakultas` varchar(30) NOT NULL,
  `tujuan` varchar(100) NOT NULL,
  `total` int(20) NOT NULL,
  `status` varchar(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `pengajuandana`
--

INSERT INTO `pengajuandana` (`idPengajuan`, `idFakultas`, `tujuan`, `total`, `status`) VALUES
('PGJ123', 'FKFIF', 'makan', 12345, '-1'),
('PGJ124', 'FKFIF', 'MINUM', 5432123, '-1'),
('PGJ453', 'FKFIF', 'main', 123, '1');

-- --------------------------------------------------------

--
-- Table structure for table `pengeluarandana`
--

CREATE TABLE `pengeluarandana` (
  `idPengeluaran` varchar(30) NOT NULL,
  `idFakultas` varchar(30) NOT NULL,
  `tahun ajar` varchar(10) NOT NULL,
  `keterangan` varchar(255) NOT NULL,
  `total` int(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 ROW_FORMAT=COMPACT;

--
-- Dumping data for table `pengeluarandana`
--

INSERT INTO `pengeluarandana` (`idPengeluaran`, `idFakultas`, `tahun ajar`, `keterangan`, `total`) VALUES
('PGL123', 'FKFIF', '2016/2017', 'makan banyak', 100000),
('PGL124', 'FKFIF', '2017/2018', 'jalan jalan ke meikarta', 500000);

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
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

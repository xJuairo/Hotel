-- phpMyAdmin SQL Dump
-- version 5.0.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 15, 2021 at 03:42 AM
-- Server version: 10.4.14-MariaDB
-- PHP Version: 7.2.34

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `hotel`
--
DROP DATABASE IF EXISTS `hotel`;
CREATE DATABASE IF NOT EXISTS `hotel` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `hotel`;

-- --------------------------------------------------------

--
-- Table structure for table `credenciales`
--

CREATE TABLE `credenciales` (
  `Usr` varchar(10) DEFAULT NULL,
  `Pass` varchar(32) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `credenciales`
--

INSERT INTO `credenciales` (`Usr`, `Pass`) VALUES
('root', '21232f297a57a5a743894a0e4a801fc3'),
('xJuairo', 'e10adc3949ba59abbe56e057f20f883e'),
('Sebai', 'e10adc3949ba59abbe56e057f20f883e'),
('sergio', '619ac44a2da678e8a7fc0e776250df6c');

-- --------------------------------------------------------

--
-- Table structure for table `customers`
--

CREATE TABLE `customers` (
  `Nombre` varchar(50) DEFAULT NULL,
  `NumTel` varchar(15) DEFAULT NULL,
  `Correo` varchar(30) DEFAULT NULL,
  `MetodoP` varchar(40) DEFAULT NULL,
  `NumH` int(2) NOT NULL,
  `Sexo` varchar(10) NOT NULL,
  `CiudaddeOrigen` varchar(50) DEFAULT NULL,
  `dias` int(3) DEFAULT NULL,
  `Tpersonas` int(2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `galeria`
--

CREATE TABLE `galeria` (
  `RutaImagen` varchar(20) DEFAULT NULL,
  `Id` int(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `galeria`
--

INSERT INTO `galeria` (`RutaImagen`, `Id`) VALUES
('H1.jpg', 1),
('H2.jpg', 2),
('H3.jpg', 3),
('H4.jpg', 4),
('H5.jpg', 5),
('H6.jpg', 6),
('H7.jpg', 7),
('H8.jpg', 8);

-- --------------------------------------------------------

--
-- Table structure for table `habitacion`
--

CREATE TABLE `habitacion` (
  `THab` int(1) NOT NULL,
  `FInic` date DEFAULT NULL,
  `Cupo` int(1) DEFAULT NULL,
  `NumH` int(3) NOT NULL,
  `Piso` int(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `habitacion`
--

INSERT INTO `habitacion` (`THab`, `FInic`, `Cupo`, `NumH`, `Piso`) VALUES
(1, NULL, 0, 101, 1),
(1, NULL, 0, 111, 1),
(1, NULL, 0, 112, 1),
(1, NULL, 0, 121, 1),
(1, NULL, 0, 131, 1),
(1, NULL, 0, 141, 1),
(1, NULL, 0, 151, 1),
(1, NULL, 0, 161, 2),
(2, NULL, 0, 181, 2),
(2, NULL, 0, 191, 2),
(3, NULL, 0, 201, 2),
(1, NULL, 0, 212, 1),
(1, NULL, 0, 221, 2),
(2, NULL, 0, 224, 2),
(1, NULL, 0, 231, 2),
(1, NULL, 0, 241, 2),
(1, NULL, 0, 251, 2),
(2, NULL, 0, 257, 2),
(1, NULL, 0, 261, 2),
(1, NULL, 0, 271, 2),
(1, NULL, 0, 281, 2),
(1, NULL, 0, 291, 2),
(1, NULL, 0, 301, 2),
(3, NULL, 0, 311, 1),
(3, NULL, 0, 411, 1),
(2, NULL, 0, 511, 1),
(2, NULL, 0, 611, 1),
(1, NULL, 0, 711, 1),
(3, NULL, 0, 811, 1),
(1, NULL, 0, 911, 1);

-- --------------------------------------------------------

--
-- Table structure for table `info`
--

CREATE TABLE `info` (
  `Nombre` varchar(10) DEFAULT NULL,
  `TipoHotel` varchar(20) DEFAULT NULL,
  `Lema` varchar(20) DEFAULT NULL,
  `Logotipo` varchar(20) DEFAULT NULL,
  `Ubicacion` varchar(50) DEFAULT NULL,
  `dineros` int(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `info`
--

INSERT INTO `info` (`Nombre`, `TipoHotel`, `Lema`, `Logotipo`, `Ubicacion`, `dineros`) VALUES
('Hotel', '5 Estrellas', 'Tu hotel ideal', 'Logotipo.png', 'Mexico, Guerrero, Acapulco', NULL);

-- --------------------------------------------------------

--
-- Table structure for table `tipohab`
--

CREATE TABLE `tipohab` (
  `Precio` int(4) DEFAULT NULL,
  `THab` int(1) NOT NULL,
  `nombre` varchar(20) DEFAULT NULL,
  `Personas` int(2) DEFAULT NULL,
  `Ruta` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tipohab`
--

INSERT INTO `tipohab` (`Precio`, `THab`, `nombre`, `Personas`, `Ruta`) VALUES
(2000, 1, 'Sencilla', 1, 'H6.jpg'),
(2500, 2, 'Doble', 2, 'H5.jpg'),
(3000, 3, 'Triple', 3, 'H7.jpg');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `customers`
--
ALTER TABLE `customers`
  ADD PRIMARY KEY (`NumH`);

--
-- Indexes for table `galeria`
--
ALTER TABLE `galeria`
  ADD PRIMARY KEY (`Id`);

--
-- Indexes for table `habitacion`
--
ALTER TABLE `habitacion`
  ADD PRIMARY KEY (`NumH`,`THab`);

--
-- Indexes for table `tipohab`
--
ALTER TABLE `tipohab`
  ADD PRIMARY KEY (`THab`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

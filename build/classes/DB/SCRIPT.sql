-- phpMyAdmin SQL Dump
-- version 5.0.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 16, 2021 at 04:33 AM
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
('sergio', '619ac44a2da678e8a7fc0e776250df6c'),
('Aram', 'e10adc3949ba59abbe56e057f20f883e');

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

--
-- Dumping data for table `customers`
--

INSERT INTO `customers` (`Nombre`, `NumTel`, `Correo`, `MetodoP`, `NumH`, `Sexo`, `CiudaddeOrigen`, `dias`, `Tpersonas`) VALUES
('Anderson Vaca', '4493333336', 'AndersonArmas@hotmail.com', 'Tarjeta', 131, 'Masculino', 'Chihuahua', 6, 1),
('Gabriel Ochoa', '4492467356', 'GabrielOchoa@hotmail.com', 'Tarjeta', 141, 'Masculino', 'Sonora', 4, 1),
('Jose Duarte', '4498835576', 'JoseDuarte@gmail.com ', 'Efectivo', 151, 'Masculino', 'Yucatan', 8, 1),
('Erick Benitez', '4491334876', 'ErickBenitez@gmail.com', 'Tarjeta', 161, 'Masculino', 'Ixmiquilpan', 7, 1),
('David Esparza', '4493784576', 'DavidEsparza@hotmail.com', 'Efectivo', 181, 'Masculino', 'Aguascalientes', 6, 2),
('Vicente Juarez', '4495573456', 'VicenteJuarez@gmail.com', 'Tarjeta', 191, 'Masculino', 'Zacatecas', 5, 2),
('Teofilo', '4493463325', 'nose@gmail.com', 'Paypal', 201, 'Masculino', 'Sinaloa', 1, 5),
('Pedro', '4493463325', 'correo@gmail.com', 'Tarjeta de Credito', 212, 'Masculino', 'Hidalgo', 1, 2),
('Sarahi', '4493215654', 'correo@gmail.com', 'Chicles', 221, 'Femenino', 'Aguascalientes', 1, 1),
('Samantha', '5465498', 'correo', 'paypal', 224, 'Femenino', 'tamaulipas', 1, 4),
('Juanito', '64848465', 'correo@live.com', 'efectivo', 411, 'Masculino', 'Sonora', 3, 4);

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
('H8.jpg', 8),
('H9.jpg', 9),
('H10.jpg', 10);

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
(1, '2021-06-16', 1, 131, 1),
(1, '2021-06-16', 1, 141, 1),
(1, '2021-06-16', 1, 151, 1),
(1, '2021-06-16', 1, 161, 2),
(2, '2021-06-16', 1, 181, 2),
(2, '2021-06-16', 1, 191, 2),
(3, '2021-06-15', 1, 201, 2),
(1, '2021-06-15', 1, 212, 1),
(1, '2021-06-15', 1, 221, 2),
(2, '2021-06-15', 1, 224, 2),
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
(3, '2021-06-15', 1, 411, 1),
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
  `dineros` int(10) DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `info`
--

INSERT INTO `info` (`Nombre`, `TipoHotel`, `Lema`, `Logotipo`, `Ubicacion`, `dineros`) VALUES
('Hotel', '5 Estrellas', 'Tu hotel ideal', 'Logotipo.png', 'Mexico, Guerrero, Acapulco', 18700);

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

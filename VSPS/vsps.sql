-- phpMyAdmin SQL Dump
-- version 4.8.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 20, 2019 at 06:47 PM
-- Server version: 10.1.33-MariaDB
-- PHP Version: 7.2.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `vsps`
--

-- --------------------------------------------------------

--
-- Table structure for table `booking`
--

CREATE TABLE `booking` (
  `id` varchar(100) NOT NULL,
  `pname` varchar(100) NOT NULL,
  `organization` varchar(100) NOT NULL,
  `town` varchar(100) NOT NULL,
  `fAmount` varchar(100) NOT NULL,
  `advance` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `booking`
--

INSERT INTO `booking` (`id`, `pname`, `organization`, `town`, `fAmount`, `advance`) VALUES
('B01', 'Sarath Ranaweera', 'Thamalu pvt', 'akuressa', '35400.00', '15000.00'),
('B02', 'daham', 'sliit', 'akuressa', '35400.00', '15000.00');

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE `customer` (
  `id` varchar(100) NOT NULL,
  `fname` varchar(100) NOT NULL,
  `lname` varchar(100) NOT NULL,
  `town` varchar(100) NOT NULL,
  `nic` varchar(100) NOT NULL,
  `mobile` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`id`, `fname`, `lname`, `town`, `nic`, `mobile`) VALUES
('Cus01', 'Chamika', 'Subasingha', 'kegalle', '945568598V', '0711927017'),
('Cus02', 'Naduni', 'Yapa', 'Matara', '892383529V', '711927017');

-- --------------------------------------------------------

--
-- Table structure for table `employee`
--

CREATE TABLE `employee` (
  `id` varchar(100) NOT NULL,
  `fname` varchar(100) NOT NULL,
  `lname` varchar(100) NOT NULL,
  `dob` varchar(100) NOT NULL,
  `nic` varchar(100) NOT NULL,
  `mobile` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `employee`
--

INSERT INTO `employee` (`id`, `fname`, `lname`, `dob`, `nic`, `mobile`) VALUES
('Emp01', 'Kavindu', 'Geesara', '1998-01-03', '980033454V', '711927017'),
('Emp02', 'saman', 'Gunawardana', ' 1998-01-03', '892383529V', '711927017');

-- --------------------------------------------------------

--
-- Table structure for table `inventry`
--

CREATE TABLE `inventry` (
  `code` varchar(100) NOT NULL,
  `name` varchar(100) NOT NULL,
  `manufacture` varchar(100) NOT NULL,
  `qty` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `inventry`
--

INSERT INTO `inventry` (`code`, `name`, `manufacture`, `qty`) VALUES
('In01', 'Pastry', 'P&S', '100'),
('In02', 'Bread', 'P&S', '200'),
('In03', 'Donets', 'P&S', '100'),
('In04', 'Rolls', 'P&S', '100'),
('In05', 'Rolls', 'P&S', '100'),
('In06', 'Bread', 'pns', '100');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `booking`
--
ALTER TABLE `booking`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `customer`
--
ALTER TABLE `customer`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `employee`
--
ALTER TABLE `employee`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `inventry`
--
ALTER TABLE `inventry`
  ADD PRIMARY KEY (`code`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 19, 2022 at 11:29 AM
-- Server version: 10.4.27-MariaDB
-- PHP Version: 8.1.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `college`
--

-- --------------------------------------------------------

--
-- Table structure for table `exam`
--

CREATE TABLE `exam` (
  `id` int(11) NOT NULL,
  `q1` varchar(500) NOT NULL,
  `a1` varchar(10) NOT NULL,
  `q2` varchar(500) NOT NULL,
  `a2` varchar(10) NOT NULL,
  `q3` varchar(500) NOT NULL,
  `a3` varchar(10) NOT NULL,
  `q4` varchar(500) NOT NULL,
  `a4` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `exam`
--

INSERT INTO `exam` (`id`, `q1`, `a1`, `q2`, `a2`, `q3`, `a3`, `q4`, `a4`) VALUES
(1, 'dfgfdh', 't', 'hfghfgh', 't', 'fjhfjghj', 't', 'fhjhgjh', 'f'),
(2, 'ghhhhhhhhhhhhhhhhhhh', 't', 'jjjjjjjjjjjjjjjjjjjjjjjjjj', 'f', 'hhhhhhhhhhhhhhhhhhhh', 'f', 'tttttttttttttttttttttttttttt', 'f');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `exam`
--
ALTER TABLE `exam`
  ADD PRIMARY KEY (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

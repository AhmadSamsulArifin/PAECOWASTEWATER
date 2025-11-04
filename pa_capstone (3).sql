-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 04, 2025 at 03:11 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.0.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `pa_capstone`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `id_user` int(11) NOT NULL,
  `jobdesk` varchar(150) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`id_user`, `jobdesk`) VALUES
(1, 'Manajemen sistem laporan'),
(2, 'Validasi data pengguna'),
(3, 'Monitoring laporan harian'),
(4, 'Koordinasi petugas lapangan'),
(5, 'Penyusunan laporan bulanan');

-- --------------------------------------------------------

--
-- Table structure for table `laporan`
--

CREATE TABLE `laporan` (
  `id_laporan` int(11) NOT NULL,
  `tanggal_laporan` datetime NOT NULL,
  `status` varchar(250) NOT NULL,
  `foto` varchar(255) NOT NULL,
  `tanggapan_admin` longtext NOT NULL,
  `admin_id_user` int(11) NOT NULL,
  `wilayah_kode_wilayah` int(11) NOT NULL,
  `masyarakat_id_user` int(11) NOT NULL,
  `layanan_id_layanan` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `laporan`
--

INSERT INTO `laporan` (`id_laporan`, `tanggal_laporan`, `status`, `foto`, `tanggapan_admin`, `admin_id_user`, `wilayah_kode_wilayah`, `masyarakat_id_user`, `layanan_id_layanan`) VALUES
(1, '2021-12-02 00:00:00', 'Dihapus', 'C:\\Users\\MSi-GAMING\\iCloudPhotos\\Photos\\0E10ADE1-EC20-4687-90AF-0D15F9FDE276.mp4', '', 1, 4, 66, 3),
(2, '2021-02-15 00:00:00', 'Selesai', 'C:\\Users\\MSi-GAMING\\iCloudPhotos\\Photos\\1BEAE582-E19E-409C-A0B8-4E3D4849A8F6.jpg', '', 1, 3, 66, 4),
(3, '2021-09-20 00:00:00', 'Dihapus', 'C:\\Users\\MSi-GAMING\\iCloudPhotos\\Photos\\1BEAE582-E19E-409C-A0B8-4E3D4849A8F6.jpg', '', 1, 3, 67, 38),
(4, '2021-01-26 00:00:00', 'Dihapus', 'C:\\Users\\MSi-GAMING\\iCloudPhotos\\Photos\\1BEAE582-E19E-409C-A0B8-4E3D4849A8F6.jpg', '', 1, 3, 67, 36),
(5, '2021-12-21 00:00:00', 'Dihapus', 'C:\\Users\\MSi-GAMING\\iCloudPhotos\\Photos\\3D05F80E-CC13-4D8C-B85A-658B95F27AE0.jpg', '', 1, 5, 67, 39),
(6, '2025-11-02 00:00:00', 'Dihapus', 'C:\\Users\\MSi-GAMING\\iCloudPhotos\\Photos\\0FDC196E-44A5-4029-9614-49AA0BD80626.jpg', '', 1, 6, 70, 31),
(12, '2021-12-21 00:00:00', 'Selesai', 'C:\\Users\\Ahmad samuel\\Pictures\\foto cesa.jpg', '', 1, 3, 61, 4),
(13, '2021-12-21 00:00:00', 'Menunggu', 'C:\\Users\\Ahmad samuel\\Pictures\\foto fahri.jpg', '', 1, 3, 35, 8);

-- --------------------------------------------------------

--
-- Table structure for table `layanan`
--

CREATE TABLE `layanan` (
  `id_layanan` int(11) NOT NULL,
  `jenis_layanan` varchar(150) NOT NULL,
  `total_harga` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `layanan`
--

INSERT INTO `layanan` (`id_layanan`, `jenis_layanan`, `total_harga`) VALUES
(1, 'Pembersihan Saluran Air', 200000),
(2, 'Perbaikan Pipa Bocor', 350000),
(3, 'Pembersihan Limbah Padat', 250000),
(4, 'Perbaikan Saluran Drainase', 300000),
(5, 'Pembuangan Lumpur Limbah', 400000),
(6, 'Pembersihan Got Umum', 180000),
(7, 'Perbaikan Pipa Air Limbah', 320000),
(8, 'Pembersihan Parit', 220000),
(9, 'Pembuangan Air Kotor', 260000),
(10, 'Perbaikan Pipa Rumah', 300000),
(11, 'Pembersihan Drainase Utama', 280000),
(12, 'Perbaikan Tutup Got', 190000),
(13, 'Pembersihan Limbah Cair', 350000),
(14, 'Perbaikan Pipa PVC', 270000),
(15, 'Pembersihan Lumpur', 250000),
(16, 'Perbaikan Saluran Air', 310000),
(17, 'Pembuangan Limbah Rumah Tangga', 400000),
(18, 'Pembersihan Got Lingkungan', 210000),
(19, 'Perbaikan Pipa Rusak', 330000),
(20, 'Pembersihan Parit Sekitar', 260000),
(21, 'Pembuangan Air Limbah', 340000),
(22, 'Perbaikan Saluran Pembuangan', 300000),
(23, 'Pembersihan Drainase', 220000),
(24, 'Pembuangan Lumpur Limbah', 400000),
(25, 'Perbaikan Pipa Tersumbat', 280000),
(26, 'Pembersihan Got Utama', 200000),
(27, 'Pembuangan Air Kotor', 240000),
(28, 'Perbaikan Pipa Saluran', 310000),
(29, 'Pembersihan Limbah Rumah Tangga', 270000),
(30, 'Pembersihan Drainase', 250000),
(31, 'Pembuangan Air Limbah', 290000),
(32, 'Perbaikan Pipa Bocor', 360000),
(33, 'Pembersihan Parit', 230000),
(34, 'Perbaikan Pipa Utama', 390000),
(35, 'Pembersihan Saluran Air', 210000),
(36, 'Pembuangan Lumpur Limbah', 400000),
(37, 'Perbaikan Pipa Air Limbah', 320000),
(38, 'Pembersihan Got Umum', 180000),
(39, 'Perbaikan Drainase', 300000),
(40, 'Pembuangan Limbah Rumah Tangga', 420000);

-- --------------------------------------------------------

--
-- Table structure for table `masyarakat`
--

CREATE TABLE `masyarakat` (
  `id_user` int(11) NOT NULL,
  `alamat` longtext NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `masyarakat`
--

INSERT INTO `masyarakat` (`id_user`, `alamat`) VALUES
(26, 'Jl. Pemuda No. 10, Samarinda Ulu'),
(27, 'Jl. Antasari No. 21, Samarinda Kota'),
(28, 'Jl. Lambung Mangkurat, Sungai Kunjang'),
(29, 'Jl. Juanda No. 5, Samarinda Ilir'),
(30, 'Jl. Pahlawan No. 18, Samarinda Seberang'),
(31, 'Jl. Gatot Subroto, Loa Janan Ilir'),
(32, 'Jl. M. Yamin, Samarinda Ulu'),
(33, 'Jl. Ahmad Dahlan, Sungai Pinang'),
(34, 'Jl. Dr. Sutomo, Palaran'),
(35, 'Jl. Suryanata, Samarinda Utara'),
(36, 'Jl. Untung Suropati, Sungai Kunjang'),
(37, 'Jl. Kesuma Bangsa, Samarinda Kota'),
(38, 'Jl. Imam Bonjol, Samarinda Ilir'),
(39, 'Jl. Merdeka, Samarinda Seberang'),
(40, 'Jl. Pangeran Suryanata, Samarinda Utara'),
(41, 'Jl. Trunojoyo, Sungai Kunjang'),
(42, 'Jl. Damai, Palaran'),
(43, 'Jl. Rajawali, Sungai Pinang'),
(44, 'Jl. Cendana, Samarinda Kota'),
(45, 'Jl. Bhayangkara, Loa Janan Ilir'),
(46, 'Jl. Mulawarman, Samarinda Ilir'),
(47, 'Jl. Basuki Rahmat, Samarinda Seberang'),
(48, 'Jl. P. Antasari, Samarinda Ulu'),
(49, 'Jl. S. Parman, Samarinda Kota'),
(50, 'Jl. A. Wahab Syahranie, Samarinda Utara'),
(51, 'Jl. Puspita, Sungai Kunjang'),
(52, 'Jl. Kenanga, Samarinda Seberang'),
(53, 'Jl. Hasan Basri, Samarinda Kota'),
(54, 'Jl. Mawar, Samarinda Ilir'),
(55, 'Jl. Dahlia, Loa Janan Ilir'),
(56, 'Jl. Kenari, Sungai Pinang'),
(57, 'Jl. Merpati, Samarinda Kota'),
(58, 'Jl. Cipto Mangunkusumo, Samarinda Ulu'),
(59, 'Jl. Flores, Samarinda Seberang'),
(60, 'Jl. Belimbing, Samarinda Ilir'),
(61, 'Jl. Tarmidi, Palaran'),
(62, 'Jl. Harapan Baru, Samarinda Ulu'),
(63, 'Jl. Diponegoro, Samarinda Kota'),
(64, 'Jl. Pelita, Samarinda Seberang'),
(65, 'Jl. Damai Sejahtera, Sungai Kunjang'),
(66, 'jl cumi'),
(67, 'jl.sebrang'),
(70, 'jl.....'),
(78, 'Jlllll'),
(79, 'jl gunung kelua');

-- --------------------------------------------------------

--
-- Table structure for table `petugas`
--

CREATE TABLE `petugas` (
  `id_user` int(11) NOT NULL,
  `wilayah_penugasan` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `petugas`
--

INSERT INTO `petugas` (`id_user`, `wilayah_penugasan`) VALUES
(6, 'Samarinda Utara'),
(7, 'Samarinda Utara'),
(8, 'Samarinda Ulu'),
(9, 'Samarinda Ulu'),
(10, 'Samarinda Seberang'),
(11, 'Samarinda Seberang'),
(12, '10 - Sambutan'),
(13, 'Samarinda Kota'),
(14, 'Sungai Kunjang'),
(15, 'Sungai Kunjang'),
(16, 'Loa Janan Ilir'),
(17, '2 - Samarinda Ilir'),
(18, 'Palaran'),
(19, 'Palaran'),
(20, 'Sambutan'),
(21, 'Sambutan'),
(22, 'Sungai Pinang'),
(23, 'Sungai Pinang'),
(24, 'Samarinda Ilir'),
(25, 'Samarinda Ilir'),
(68, 'Samarinda Ulu'),
(69, '-- Pilih Wilayah --'),
(71, 'Samarinda Kota'),
(72, 'Loa Janan Ilir'),
(73, 'Samarinda Ilir'),
(74, 'Loa Janan Ilir'),
(75, 'Samarinda Ilir'),
(76, 'Samarinda Kota'),
(77, 'Samarinda Ilir');

-- --------------------------------------------------------

--
-- Table structure for table `tindaklanjut`
--

CREATE TABLE `tindaklanjut` (
  `id_tindaklanjut` int(11) NOT NULL,
  `tanggal_tindaklanjut` datetime NOT NULL,
  `hasil_tindakan` longtext NOT NULL,
  `foto_hasil` varchar(255) NOT NULL,
  `petugas_id_user` int(11) NOT NULL,
  `laporan_id_laporan` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tindaklanjut`
--

INSERT INTO `tindaklanjut` (`id_tindaklanjut`, `tanggal_tindaklanjut`, `hasil_tindakan`, `foto_hasil`, `petugas_id_user`, `laporan_id_laporan`) VALUES
(1, '2025-11-02 00:00:00', 'Selesai', 'C:\\Users\\MSi-GAMING\\iCloudPhotos\\Photos\\0FDC196E-44A5-4029-9614-49AA0BD80626.jpg', 68, 3),
(2, '2025-11-02 00:00:00', 'Sudah selesai', 'C:\\Users\\MSi-GAMING\\iCloudPhotos\\Photos\\0FDC196E-44A5-4029-9614-49AA0BD80626.jpg', 72, 5),
(3, '2025-11-04 00:00:00', 'selesai', 'C:\\Users\\Ahmad samuel\\Pictures\\foto cesa.jpg', 0, 2),
(4, '2025-11-04 00:00:00', 'selesai', 'C:\\Users\\Ahmad samuel\\Pictures\\foto bersama aslab.jpg', 0, 2),
(5, '2025-11-04 00:00:00', 'selesai', 'C:\\Users\\Ahmad samuel\\Pictures\\foto cesa.jpg', 0, 6),
(6, '2025-11-04 00:00:00', 'Sudah selesai', 'C:\\Users\\Ahmad samuel\\Pictures\\foto cesa.jpg', 77, 12);

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `id_user` int(11) NOT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(255) NOT NULL,
  `no_telepon` varchar(15) NOT NULL,
  `nama` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`id_user`, `username`, `password`, `no_telepon`, `nama`) VALUES
(1, 'admin_scoups', 'admin123', '0812345001', 'S.Coups'),
(2, 'admin_jeonghan', 'admin123', '0812345002', 'Jeonghan'),
(3, 'admin_joshua', 'admin123', '0812345003', 'Joshua'),
(4, 'admin_jun', 'admin123', '0812345004', 'Jun'),
(5, 'admin_hoshi', 'admin123', '0812345005', 'Hoshi'),
(6, 'petugas_wonwoo', 'petugas123', '0812345006', 'Wonwoo'),
(7, 'petugas_woozi', 'petugas123', '0812345007', 'Woozi'),
(8, 'petugas_dk', 'petugas123', '0812345008', 'DK'),
(9, 'petugas_mingyu', 'petugas123', '0812345009', 'Mingyu'),
(10, 'petugas_the8', 'petugas123', '0812345010', 'The8'),
(11, 'petugas_vernon', 'petugas123', '0812345011', 'Vernon'),
(12, 'petugasdino', '123', '0812345012', 'Dino'),
(13, 'petugas_samuel', 'petugas123', '0812345013', 'Samuel'),
(14, 'petugas_jisoo', 'petugas123', '0812345014', 'Jisoo'),
(15, 'petugas_seokmin', 'petugas123', '0812345015', 'Seokmin'),
(16, 'petugas_minghao', 'petugas123', '0812345016', 'Minghao'),
(17, 'paros', '123', '12345', 'Han'),
(18, 'petugas_leechan', 'petugas123', '0812345018', 'Lee Chan'),
(19, 'petugas_soonyoung', 'petugas123', '0812345019', 'Soonyoung'),
(20, 'petugas_seungkwan', 'petugas123', '0812345020', 'Seungkwan'),
(21, 'petugas_dokyeom', 'petugas123', '0812345021', 'Dokyeom'),
(22, 'petugas_jihoon', 'petugas123', '0812345022', 'Jihoon'),
(23, 'petugas_yoon', 'petugas123', '0812345023', 'Yoon'),
(24, 'petugas_wenjunhui', 'petugas123', '0812345024', 'Wen Junhui'),
(25, 'petugas_hong', 'petugas123', '0812345025', 'Hong Jisoo'),
(26, 'user_rina', 'user123', '0812345026', 'Rina Amelia'),
(27, 'user_budi', 'user123', '0812345027', 'Budi Santoso'),
(28, 'user_siti', 'user123', '0812345028', 'Siti Nurhaliza'),
(29, 'user_dimas', 'user123', '0812345029', 'Dimas Anggara'),
(30, 'user_ayu', 'user123', '0812345030', 'Ayu Kartika'),
(31, 'user_nanda', 'user123', '0812345031', 'Nanda Pratama'),
(32, 'user_wulan', 'user123', '0812345032', 'Wulan Safitri'),
(33, 'user_rudi', 'user123', '0812345033', 'Rudi Hartono'),
(34, 'user_tika', 'user123', '0812345034', 'Tika Maharani'),
(35, 'user_yoga', 'user123', '0812345035', 'Yoga Saputra'),
(36, 'user_rizky', 'user123', '0812345036', 'Rizky Ramadhan'),
(37, 'user_sari', 'user123', '0812345037', 'Sari Dewi'),
(38, 'user_ilham', 'user123', '0812345038', 'Ilham Maulana'),
(39, 'user_fajar', 'user123', '0812345039', 'Fajar Nugroho'),
(40, 'user_putri', 'user123', '0812345040', 'Putri Aisyah'),
(41, 'user_dina', 'user123', '0812345041', 'Dina Pertiwi'),
(42, 'user_arif', 'user123', '0812345042', 'Arif Rahman'),
(43, 'user_maya', 'user123', '0812345043', 'Maya Oktaviani'),
(44, 'user_eka', 'user123', '0812345044', 'Eka Lestari'),
(45, 'user_bella', 'user123', '0812345045', 'Bella Andriani'),
(46, 'user_rio', 'user123', '0812345046', 'Rio Firmansyah'),
(47, 'user_novi', 'user123', '0812345047', 'Novi Wulandari'),
(48, 'user_fani', 'user123', '0812345048', 'Fani Prameswari'),
(49, 'user_dewi', 'user123', '0812345049', 'Dewi Sartika'),
(50, 'user_andi', 'user123', '0812345050', 'Andi Prasetyo'),
(51, 'user_adi', 'user123', '0812345051', 'Adi Kurniawan'),
(52, 'user_karina', 'user123', '0812345052', 'Karina Putri'),
(53, 'user_gilang', 'user123', '0812345053', 'Gilang Permana'),
(54, 'user_lina', 'user123', '0812345054', 'Lina Marlina'),
(55, 'user_hendra', 'user123', '0812345055', 'Hendra Wijaya'),
(56, 'user_dwi', 'user123', '0812345056', 'Dwi Anggraini'),
(57, 'user_tono', 'user123', '0812345057', 'Tono Susanto'),
(58, 'user_miko', 'user123', '0812345058', 'Miko Saputra'),
(59, 'user_aziz', 'user123', '0812345059', 'Aziz Fathur'),
(60, 'user_citra', 'user123', '0812345060', 'Citra Rahmawati'),
(61, 'user_rina2', 'user123', '0812345061', 'Rina Dewi'),
(62, 'user_dodi', 'user123', '0812345062', 'Dodi Setiawan'),
(63, 'user_febri', 'user123', '0812345063', 'Febri Yuliani'),
(64, 'user_yuni', 'user123', '0812345064', 'Yuni Astuti'),
(65, 'user_rifki', 'user123', '0812345065', 'Rifki Maulana'),
(66, 'samsul123', '123', '0987', 'samsul'),
(67, 'faros123', '123', '123', 'faros anand'),
(68, 'petugas_sebrang', '123', '123', 'petugas_sebrang'),
(69, '', '', '', 'Muhammad Farros Anand'),
(70, 'masyarakat1', '123', '123', 'masyarakat satu'),
(72, 'faros12345', '123', '123', 'faros anand'),
(73, '1ii1ii1', '1ii1ii1i1', '1019110101', '11n1n'),
(74, 'asu', '123456', '09122', 'samsusa'),
(75, 'qomarul123', '123123', '123', 'qomarul arifin'),
(76, 'ariel123', '123456', '0987654', 'ahmad ariel saputra'),
(77, 'zaina123', '123', '123', 'zaina '),
(78, 'QomarulSamsul123', '123123', '123', 'Qomarul Samsul'),
(79, 'ojan123', '123456', '0876124', 'ojanahmad');

-- --------------------------------------------------------

--
-- Table structure for table `wilayah`
--

CREATE TABLE `wilayah` (
  `kode_wilayah` int(11) NOT NULL,
  `nama_wilayah` varchar(100) NOT NULL,
  `keterangan` longtext NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `wilayah`
--

INSERT INTO `wilayah` (`kode_wilayah`, `nama_wilayah`, `keterangan`) VALUES
(1, 'Samarinda Ulu', 'Wilayah padat penduduk dengan banyak pemukiman dan drainase rumah tangga.'),
(2, 'Samarinda Ilir', 'Daerah pusat kota dengan aktivitas pasar dan jalur pembuangan limbah utama.'),
(3, 'Samarinda Seberang', 'Wilayah di seberang Sungai Mahakam dengan area industri dan pemukiman padat.'),
(4, 'Samarinda Utara', 'Wilayah dengan banyak perumahan baru dan sistem sanitasi masih dalam pengembangan.'),
(5, 'Samarinda Kota', 'Wilayah pusat pemerintahan dan bisnis dengan sistem drainase utama kota.'),
(6, 'Sungai Pinang', 'Wilayah dengan sistem pembuangan limbah rumah tangga padat dan saluran besar.'),
(7, 'Sungai Kunjang', 'Daerah industri ringan dan pergudangan yang membutuhkan pemantauan limbah rutin.'),
(8, 'Loa Janan Ilir', 'Wilayah pinggiran dengan akses sanitasi belum merata dan drainase kecil.'),
(9, 'Palaran', 'Wilayah dengan banyak area industri besar dan pemukiman pekerja.'),
(10, 'Sambutan', 'Wilayah perbukitan dengan saluran limbah alami dan beberapa area rawan tersumbat.');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`id_user`);

--
-- Indexes for table `laporan`
--
ALTER TABLE `laporan`
  ADD PRIMARY KEY (`id_laporan`),
  ADD KEY `laporan_admin_FK` (`admin_id_user`),
  ADD KEY `laporan_masyarakat_FK` (`masyarakat_id_user`),
  ADD KEY `laporan_wilayah_FK` (`wilayah_kode_wilayah`),
  ADD KEY `layanan_id_layanan` (`layanan_id_layanan`);

--
-- Indexes for table `layanan`
--
ALTER TABLE `layanan`
  ADD PRIMARY KEY (`id_layanan`);

--
-- Indexes for table `masyarakat`
--
ALTER TABLE `masyarakat`
  ADD PRIMARY KEY (`id_user`);

--
-- Indexes for table `petugas`
--
ALTER TABLE `petugas`
  ADD PRIMARY KEY (`id_user`);

--
-- Indexes for table `tindaklanjut`
--
ALTER TABLE `tindaklanjut`
  ADD PRIMARY KEY (`id_tindaklanjut`),
  ADD KEY `tindaklanjut_laporan_FK` (`laporan_id_laporan`),
  ADD KEY `tindaklanjut_petugas_FK` (`petugas_id_user`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id_user`),
  ADD UNIQUE KEY `username` (`username`);

--
-- Indexes for table `wilayah`
--
ALTER TABLE `wilayah`
  ADD PRIMARY KEY (`kode_wilayah`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `admin`
--
ALTER TABLE `admin`
  MODIFY `id_user` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `laporan`
--
ALTER TABLE `laporan`
  MODIFY `id_laporan` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- AUTO_INCREMENT for table `layanan`
--
ALTER TABLE `layanan`
  MODIFY `id_layanan` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=41;

--
-- AUTO_INCREMENT for table `masyarakat`
--
ALTER TABLE `masyarakat`
  MODIFY `id_user` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=80;

--
-- AUTO_INCREMENT for table `petugas`
--
ALTER TABLE `petugas`
  MODIFY `id_user` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=78;

--
-- AUTO_INCREMENT for table `tindaklanjut`
--
ALTER TABLE `tindaklanjut`
  MODIFY `id_tindaklanjut` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `id_user` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=80;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `admin`
--
ALTER TABLE `admin`
  ADD CONSTRAINT `admin_user_FK` FOREIGN KEY (`id_user`) REFERENCES `user` (`id_user`);

--
-- Constraints for table `laporan`
--
ALTER TABLE `laporan`
  ADD CONSTRAINT `laporan_ibfk_1` FOREIGN KEY (`admin_id_user`) REFERENCES `admin` (`id_user`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `laporan_ibfk_2` FOREIGN KEY (`masyarakat_id_user`) REFERENCES `masyarakat` (`id_user`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `laporan_ibfk_3` FOREIGN KEY (`layanan_id_layanan`) REFERENCES `layanan` (`id_layanan`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `laporan_ibfk_4` FOREIGN KEY (`wilayah_kode_wilayah`) REFERENCES `wilayah` (`kode_wilayah`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `masyarakat`
--
ALTER TABLE `masyarakat`
  ADD CONSTRAINT `masyarakat_user_FK` FOREIGN KEY (`id_user`) REFERENCES `user` (`id_user`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

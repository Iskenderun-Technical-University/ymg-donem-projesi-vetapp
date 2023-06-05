-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Anamakine: localhost
-- Üretim Zamanı: 05 Haz 2023, 17:28:08
-- Sunucu sürümü: 8.0.31
-- PHP Sürümü: 7.4.33

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Veritabanı: `vetapp002`
--

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `giris`
--

CREATE TABLE `giris` (
  `Id` int NOT NULL,
  `Ad` varchar(40) COLLATE utf8mb4_turkish_ci DEFAULT NULL,
  `Soyad` varchar(30) COLLATE utf8mb4_turkish_ci DEFAULT NULL,
  `KullaniciAdi` varchar(20) COLLATE utf8mb4_turkish_ci DEFAULT NULL,
  `Sifre` varchar(50) COLLATE utf8mb4_turkish_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_turkish_ci;

--
-- Tablo döküm verisi `giris`
--

INSERT INTO `giris` (`Id`, `Ad`, `Soyad`, `KullaniciAdi`, `Sifre`) VALUES
(1, 'da', 'da', 'dan', 'gal'),
(2, 'da', 'da', 'dan', 'gal'),
(3, 'da', 'da', 'dan', 'gal');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `hayvan`
--

CREATE TABLE `hayvan` (
  `Id` int NOT NULL,
  `Ad` varchar(50) COLLATE utf8mb4_turkish_ci DEFAULT NULL,
  `Cesit` varchar(15) COLLATE utf8mb4_turkish_ci DEFAULT NULL,
  `Tur` varchar(28) CHARACTER SET utf8mb4 COLLATE utf8mb4_turkish_ci DEFAULT NULL,
  `AltTur` varchar(15) COLLATE utf8mb4_turkish_ci DEFAULT NULL,
  `Notlar` varchar(100) COLLATE utf8mb4_turkish_ci DEFAULT NULL,
  `SaglıkDurumu` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_turkish_ci DEFAULT NULL,
  `Cinsiyet` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_turkish_ci DEFAULT NULL,
  `SaglikDurumuEski` varchar(30) COLLATE utf8mb4_turkish_ci DEFAULT NULL,
  `CanlilikDurumu` bit(1) DEFAULT NULL,
  `OlumZamani` date DEFAULT NULL,
  `OlumNedeni` varchar(30) COLLATE utf8mb4_turkish_ci DEFAULT NULL,
  `Veterineri` varchar(50) COLLATE utf8mb4_turkish_ci DEFAULT NULL,
  `OncekiVeteriner` int DEFAULT NULL,
  `MuayneSon` date DEFAULT NULL,
  `Dogum` date DEFAULT NULL,
  `MuayneEski` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_turkish_ci DEFAULT NULL,
  `Fotograf` varchar(300) CHARACTER SET utf8mb4 COLLATE utf8mb4_turkish_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_turkish_ci;

--
-- Tablo döküm verisi `hayvan`
--

INSERT INTO `hayvan` (`Id`, `Ad`, `Cesit`, `Tur`, `AltTur`, `Notlar`, `SaglıkDurumu`, `Cinsiyet`, `SaglikDurumuEski`, `CanlilikDurumu`, `OlumZamani`, `OlumNedeni`, `Veterineri`, `OncekiVeteriner`, `MuayneSon`, `Dogum`, `MuayneEski`, `Fotograf`) VALUES
(1, 'Örnek1', '1', '1', '1', 'Notlar 1', 'Durum 1', 'Durum 2', 'Durum 3', b'1', '2023-06-01', 'Neden 1', 'Veteriner 1', 2, '2023-06-02', '2023-06-01', '2023-06-01', 'Örnek Fotograf'),
(2, 'Örnek2', '2', '2', '2', 'Notlar 2', 'Durum 4', 'Durum 5', 'Durum 6', b'0', NULL, NULL, 'Veteriner 2', NULL, '2023-06-03', '2023-06-02', '2023-06-02', 'back.jpg'),
(3, 'tavuk', 'kümes hayvanı', 'tavuk', 'americanus', 'şirin kendini bıldırcın sanan tavuk', 'ölü', 'Durum 2', 'Durum 3', b'0', '2023-06-01', 'depremden dolayı susuz kalma', 'yok', 2, '2023-06-02', '2023-06-01', '2023-06-01', 'https://yt3.ggpht.com/-_PGVsT48BlMP2SpM3-xcwWdgoMiRMCGP4yrqqbQXlE0mIXJFacX4WZl43jSSzgdL_Bv9or5vA=s88-c-k-c0x00ffffff-no-rj'),
(4, 'aa', 'Kümes Hayvanı', 'Tavuk', 'aa', 'a', 'a', 'erkek', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 'a'),
(5, 'a', 'Küçükbaş', 'koyun', 'a', 'a', 'a', 'erkek', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 'a'),
(6, 'a', 'Küçükbaş', 'koyun', 'a', 'a', 'a', 'erkek', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 'a'),
(7, 'a', 'Küçükbaş', 'koyun', 'a', 'a', 'a', 'erkek', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 'a'),
(8, 'Q', 'Büyükbaş', 'Manda', 'Q', 'Q', 'Q', 'belirsiz', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 'Q'),
(9, 'aaaaa', 'Kümes Hayvanı', 'Ördek', 'a', 'a', 'a', 'erkek', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 'a'),
(10, 'bbbbbbbb', 'Küçükbaş', 'koyun', 'bbbbbb', 'bbbbbbbbbbbbbbbbb', 'bbbbbbbbbbb', 'erkek', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 'bbbbbbbbbbbbb'),
(11, 'bbbbbbbb', 'Küçükbaş', 'koyun', 'bbbbbb', 'bbbbbbbbbbbbbbbbb', 'bbbbbbbbbbb', 'erkek', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 'bbbbbbbbbbbbb'),
(12, 'bbbbbbbb', 'Küçükbaş', 'koyun', 'bbbbbb', 'bbbbbbbbbbbbbbbbb', 'bbbbbbbbbbb', 'erkek', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 'bbbbbbbbbbbbb'),
(13, 'eeeeeeeeeeeeeee', 'SuÜrünü', 'uskumru', 'eeeeeeeeee', 'eeeeeeeeeee', 'eeeeeeeeee', 'belirsiz', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 'eeeeeeeee'),
(14, 'eeeeeeeeeeeeeee', 'SuÜrünü', 'uskumru', 'eeeeeeeeee', 'eeeeeeeeeee', 'eeeeeeeeee', 'belirsiz', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 'eeeeeeeee'),
(15, 'eeeeeeeeeeeeeee', 'SuÜrünü', 'uskumru', 'eeeeeeeeee', 'eeeeeeeeeee', 'eeeeeeeeee', 'belirsiz', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 'eeeeeeeee'),
(16, 'eeeeeeeeeeeeeee', 'SuÜrünü', 'uskumru', 'eeeeeeeeee', 'eeeeeeeeeee', 'eeeeeeeeee', 'belirsiz', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 'eeeeeeeee'),
(17, 'eeeeeeeeeeeeeee', 'SuÜrünü', 'uskumru', 'eeeeeeeeee', 'eeeeeeeeeee', 'eeeeeeeeee', 'belirsiz', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 'eeeeeeeee'),
(18, 'eeeeeeeeeeeeeee', 'SuÜrünü', 'uskumru', 'eeeeeeeeee', 'eeeeeeeeeee', 'eeeeeeeeee', 'erkek', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 'eeeeeeeee'),
(19, 'eeeeeeeeeeeeeee', 'SuÜrünü', 'uskumru', 'eeeeeeeeee', 'eeeeeeeeeee', 'eeeeeeeeee', 'erkek', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 'eeeeeeeee'),
(20, 'rrrrrrrrrr', 'Küçükbaş', 'keçi', 'rrrrrrrrrr', 'rrrrrrrrrrrrrrrrr', 'rrrrrrrrrrrrrrrrrrrrrrrrrrr', 'erkek', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 'rrrrrrrrrrrrrr'),
(21, 'rrrrrrrrrr', 'Küçükbaş', 'keçi', 'rrrrrrrrrr', 'rrrrrrrrrrrrrrrrr', 'rrrrrrrrrrrrrrrrrrrrrrrrrrr', 'dişi', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 'rrrrrrrrrrrrrr'),
(22, 'rrrrrrrrrr', 'Küçükbaş', 'keçi', 'rrrrrrrrrr', 'rrrrrrrrrrrrrrrrr', 'rrrrrrrrrrrrrrrrrrrrrrrrrrr', 'dişi', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 'rrrrrrrrrrrrrr'),
(23, 'rrrrrrrrrr', 'Küçükbaş', 'keçi', 'rrrrrrrrrr', 'rrrrrrrrrrrrrrrrr', 'rrrrrrrrrrrrrrrrrrrrrrrrrrr', 'dişi', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 'rrrrrrrrrrrrrr'),
(24, 'aaaaaaaaaaaaaaaaaaa', 'Büyükbaş', 'Manda', 'aa', 'aaaaaaaaaaaaaaaaaaaaaa', 'aa', 'erkek', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 'aaaaaaaaa'),
(25, 'aaaaaaaaaaaaaaaaaaa', 'Büyükbaş', 'Manda', 'aa', 'aaaaaaaaaaaaaaaaaaaaaa', 'aa', 'erkek', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 'aaaaaaaaa'),
(26, 'aaaaaaaaaaaaaaaaaaa', 'Büyükbaş', 'Manda', 'aa', 'aaaaaaaaaaaaaaaaaaaaaa', 'aa', 'erkek', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 'aaaaaaaaa'),
(27, 'aaaaaaaaaaaaaaaaaaa', 'Büyükbaş', 'Manda', 'aa', 'aaaaaaaaaaaaaaaaaaaaaa', 'aa', 'erkek', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 'aaaaaaaaa'),
(28, 'aa', 'Büyükbaş', 'Manda', 'aaaaaaa', 'aaaaaaaaaaaaaaaa', 'aaaaaaaaa', 'erkek', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 'aaaaaaaaa'),
(29, 'gggggggggg', 'Küçükbaş', 'keçi', 'gggggggggg', 'gggggggggggg', 'gggggggggg', 'erkek', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 'gggggggggg'),
(30, 'aafd3d3', 'Küçükbaş', 'keçi', '3ddd', 'ddd', 'ddd', 'erkek', NULL, NULL, NULL, NULL, NULL, NULL, '2023-06-02', '2023-06-03', NULL, 'dddd'),
(31, 'aaaaa', 'Küçükbaş', 'keçi', 'aaaaaaaaaaa', 'uuuu', 'aaaaaaaaaa', 'erkek', NULL, NULL, NULL, NULL, NULL, NULL, '2023-06-16', '2023-06-02', NULL, 'aaaaaaaaaaaaaaaa'),
(32, 'Haiti', 'Kümes Hayvanı', 'Tavuk', 'pigme ', 'çok şirin sevimli kaybolan tavuk', 'kayıp', 'dişi', NULL, NULL, NULL, NULL, NULL, NULL, '2022-04-07', '2023-06-05', NULL, 'https://blogger.googleusercontent.com/img/a/AVvXsEjmwF2GqJzpltxo0XuHNT2070uwKLrba42FdMNO7PWLsR0UkGfhboL3u9wtrwrEudms1pqGS7rI6gxkWcWke1JOCnRyv_88bDD6hgULlNYlBbhwXOZTdsPswF0eNlCDiwvJI0Zs9eaWud_sEKZ1IitjYqqA6zaKoxaXebivL85-0ttmuPJpfczfXN6lkA'),
(33, 'mahsun', 'SuÜrünü', 'betta', 'moontail', 'şirin balıktı gayet sağlıklı üremeye hazı', 'öldü', 'erkek', NULL, NULL, NULL, NULL, NULL, NULL, '2022-05-04', '2023-06-05', NULL, 'https://blogger.googleusercontent.com/img/a/AVvXsEgPpzpwo8HexBvRdspJuNGMy5rCynxS3G9pMBKGeVsEJ4aQDoFUauWZWFdjVE8EYT2BOeLKiHZItZYpc6J6-or8ghyp1qYhREk7T9WQ6esCKgDc_RIBb9yORsGzTHuWn2MarpogDAMFJ47Hfu0EUri6rRz7nz0lOsjptO92h0BfEYhXBL3iHUCLDKsz9Q'),
(34, 'gal', 'Ev Hayvanı', 'köpek', 'doberman', 'sevecen şirin bir hayvan', 'iyi', 'erkek', NULL, NULL, NULL, NULL, NULL, NULL, '2023-04-06', '2023-06-05', NULL, 'dd');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `login`
--

CREATE TABLE `login` (
  `Id` int NOT NULL,
  `Ad` varchar(40) COLLATE utf8mb4_turkish_ci DEFAULT NULL,
  `Soyad` varchar(30) COLLATE utf8mb4_turkish_ci DEFAULT NULL,
  `KullaniciAdi` varchar(20) COLLATE utf8mb4_turkish_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_turkish_ci;

--
-- Tablo döküm verisi `login`
--

INSERT INTO `login` (`Id`, `Ad`, `Soyad`, `KullaniciAdi`) VALUES
(1, 'danyel', 'gal', 'dan');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `tabloadi`
--

CREATE TABLE `tabloadi` (
  `Id` int NOT NULL,
  `Ad` varchar(50) COLLATE utf8mb4_turkish_ci DEFAULT NULL,
  `Cesit` tinyint DEFAULT NULL,
  `Tur` tinyint DEFAULT NULL,
  `AltTur` tinyint DEFAULT NULL,
  `Notlar` varchar(100) COLLATE utf8mb4_turkish_ci DEFAULT NULL,
  `SaglikDurumu` varchar(30) COLLATE utf8mb4_turkish_ci DEFAULT NULL,
  `SaglikDurumuIkinci` varchar(30) COLLATE utf8mb4_turkish_ci DEFAULT NULL,
  `SaglikDurumuEski` varchar(30) COLLATE utf8mb4_turkish_ci DEFAULT NULL,
  `CanlilikDurumu` bit(1) DEFAULT NULL,
  `OlumZamani` date DEFAULT NULL,
  `OlumNedeni` varchar(30) COLLATE utf8mb4_turkish_ci DEFAULT NULL,
  `Veterineri` varchar(50) COLLATE utf8mb4_turkish_ci DEFAULT NULL,
  `OncekiVeteriner` int DEFAULT NULL,
  `MuayneSon` date DEFAULT NULL,
  `MuayneOnceki` date DEFAULT NULL,
  `MuayneEski` date DEFAULT NULL,
  `Fotograf` blob
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_turkish_ci;

--
-- Tablo döküm verisi `tabloadi`
--

INSERT INTO `tabloadi` (`Id`, `Ad`, `Cesit`, `Tur`, `AltTur`, `Notlar`, `SaglikDurumu`, `SaglikDurumuIkinci`, `SaglikDurumuEski`, `CanlilikDurumu`, `OlumZamani`, `OlumNedeni`, `Veterineri`, `OncekiVeteriner`, `MuayneSon`, `MuayneOnceki`, `MuayneEski`, `Fotograf`) VALUES
(1, 'Örnek1', 1, 1, 1, 'Notlar 1', 'Durum 1', 'Durum 2', 'Durum 3', b'1', '2023-06-01', 'Neden 1', 'Veteriner 1', 2, '2023-06-02', '2023-06-01', '2023-06-01', 0xc396726e656b20466f746f67726166),
(2, 'Örnek2', 2, 2, 2, 'Notlar 2', 'Durum 4', 'Durum 5', 'Durum 6', b'0', NULL, NULL, 'Veteriner 2', NULL, '2023-06-03', '2023-06-02', '2023-06-02', 0xc396726e656b20466f746f677261662032),
(3, 'Örnek1', 1, 1, 1, 'Notlar 1', 'Durum 1', 'Durum 2', 'Durum 3', b'1', '2023-06-01', 'Neden 1', 'Veteriner 1', 2, '2023-06-02', '2023-06-01', '2023-06-01', 0xc396726e656b20466f746f67726166),
(4, 'Örnek2', 2, 2, 2, 'Notlar 2', 'Durum 4', 'Durum 5', 'Durum 6', b'0', NULL, NULL, 'Veteriner 2', NULL, '2023-06-03', '2023-06-02', '2023-06-02', 0xc396726e656b20466f746f677261662032);

--
-- Dökümü yapılmış tablolar için indeksler
--

--
-- Tablo için indeksler `giris`
--
ALTER TABLE `giris`
  ADD PRIMARY KEY (`Id`);

--
-- Tablo için indeksler `hayvan`
--
ALTER TABLE `hayvan`
  ADD PRIMARY KEY (`Id`);

--
-- Tablo için indeksler `login`
--
ALTER TABLE `login`
  ADD PRIMARY KEY (`Id`);

--
-- Tablo için indeksler `tabloadi`
--
ALTER TABLE `tabloadi`
  ADD PRIMARY KEY (`Id`);

--
-- Dökümü yapılmış tablolar için AUTO_INCREMENT değeri
--

--
-- Tablo için AUTO_INCREMENT değeri `giris`
--
ALTER TABLE `giris`
  MODIFY `Id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- Tablo için AUTO_INCREMENT değeri `hayvan`
--
ALTER TABLE `hayvan`
  MODIFY `Id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=35;

--
-- Tablo için AUTO_INCREMENT değeri `login`
--
ALTER TABLE `login`
  MODIFY `Id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- Tablo için AUTO_INCREMENT değeri `tabloadi`
--
ALTER TABLE `tabloadi`
  MODIFY `Id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

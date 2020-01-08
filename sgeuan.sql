-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 24-Dez-2019 às 22:54
-- Versão do servidor: 10.4.6-MariaDB
-- versão do PHP: 7.3.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `sgeuan`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `arma`
--

CREATE TABLE `arma` (
  `id_arma` int(11) NOT NULL,
  `tipo_arma` varchar(50) NOT NULL,
  `cor` varchar(20) NOT NULL,
  `id_criminoso` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estrutura da tabela `crime`
--

CREATE TABLE `crime` (
  `id_crime` int(11) NOT NULL,
  `local` varchar(30) NOT NULL,
  `tipo_crime` varchar(40) NOT NULL,
  `descricao` text NOT NULL,
  `data` date NOT NULL,
  `hora` time NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `crime`
--

INSERT INTO `crime` (`id_crime`, `local`, `tipo_crime`, `descricao`, `data`, `hora`) VALUES
(1, 'Mayanga', 'Violencia', 'Roubo de MÃ£o Armada', '2019-12-20', '11:24:00'),
(2, 'Golf2', 'Violencia', 'jksakjsakjkjsakjsasakj lksdklsdlkdskldslk lkdslkdlkdslkds', '2019-12-14', '12:23:00'),
(3, 'Golf2', 'Violencia', 'jksakjsakjkjsakjsasakj lksdklsdlkdskldslk lkdslkdlkdslkds', '2019-12-14', '12:23:00'),
(4, 'Mayanga', 'Assassinato', 'a<szdfgh\r\nxcxcxcccx\r\nffggfgfgfg', '2019-12-17', '12:11:00');

-- --------------------------------------------------------

--
-- Estrutura da tabela `crime_criminoso`
--

CREATE TABLE `crime_criminoso` (
  `id_crime_criminoso` int(11) NOT NULL,
  `id_criminoso` int(11) NOT NULL,
  `id_crime` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `crime_criminoso`
--

INSERT INTO `crime_criminoso` (`id_crime_criminoso`, `id_criminoso`, `id_crime`) VALUES
(1, 4, 3);

-- --------------------------------------------------------

--
-- Estrutura da tabela `crime_vitima`
--

CREATE TABLE `crime_vitima` (
  `id_crime_vitima` int(11) NOT NULL,
  `id_vitima` int(11) NOT NULL,
  `id_crime` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `crime_vitima`
--

INSERT INTO `crime_vitima` (`id_crime_vitima`, `id_vitima`, `id_crime`) VALUES
(4, 6, 3);

-- --------------------------------------------------------

--
-- Estrutura da tabela `criminoso`
--

CREATE TABLE `criminoso` (
  `id_criminoso` int(11) NOT NULL,
  `id_pessoa` int(11) NOT NULL,
  `Apelido` varchar(60) NOT NULL,
  `Bairro` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `criminoso`
--

INSERT INTO `criminoso` (`id_criminoso`, `id_pessoa`, `Apelido`, `Bairro`) VALUES
(1, 1, 'nome', 'Femenino'),
(2, 1, '', 'Masculino'),
(3, 1, '', 'Masculino'),
(4, 3, 'Ana Maurico', 'Femenino');

-- --------------------------------------------------------

--
-- Estrutura da tabela `pessoa`
--

CREATE TABLE `pessoa` (
  `idpessoa` int(11) NOT NULL,
  `nome` varchar(400) NOT NULL,
  `dataNascimento` date NOT NULL,
  `genero` varchar(20) NOT NULL,
  `imagem` varchar(300) NOT NULL,
  `BI` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `pessoa`
--

INSERT INTO `pessoa` (`idpessoa`, `nome`, `dataNascimento`, `genero`, `imagem`, `BI`) VALUES
(1, 'JoÃ£o Antonio Miguel', '2019-12-14', 'Masculino', 'aaaaaaaaa', '1111'),
(2, 'JoÃ£o Antonio Miguel', '2019-12-27', 'Masculino', 'aaaaaaaaa', ''),
(3, 'Rodrigues AndrÃ©', '2019-12-15', 'Masculino', 'aaaaaaaaa', '123'),
(5, 'Elvino Michinge', '2019-12-15', 'Masculino', 'aaaaaaaaa', '123'),
(6, 'Anastancia Camnhame', '2019-12-16', 'Femenino', 'aaaaaaaaa', '1111'),
(7, 'JoÃ£o Antonio Miguel', '2019-12-16', 'Femenino', 'aaaaaaaaa', '1111'),
(8, 'JoÃ£o Antonio Miguel', '2019-12-16', 'Masculino', 'aaaaaaaaa', '123');

-- --------------------------------------------------------

--
-- Estrutura da tabela `policial`
--

CREATE TABLE `policial` (
  `id_policial` int(11) NOT NULL,
  `id_pessoa` int(11) NOT NULL,
  `user` varchar(30) NOT NULL,
  `senha` varchar(90) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estrutura da tabela `vitima`
--

CREATE TABLE `vitima` (
  `id_vitima` int(11) NOT NULL,
  `id_pessoa` int(11) NOT NULL,
  `estado` varchar(30) NOT NULL,
  `Bairro` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `vitima`
--

INSERT INTO `vitima` (`id_vitima`, `id_pessoa`, `estado`, `Bairro`) VALUES
(1, 1, 'Morta', 'Morta'),
(5, 7, 'Doente', 'Doente'),
(6, 8, 'Doente', 'Doente');

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `arma`
--
ALTER TABLE `arma`
  ADD PRIMARY KEY (`id_arma`),
  ADD KEY `id_criminoso` (`id_criminoso`);

--
-- Índices para tabela `crime`
--
ALTER TABLE `crime`
  ADD PRIMARY KEY (`id_crime`);

--
-- Índices para tabela `crime_criminoso`
--
ALTER TABLE `crime_criminoso`
  ADD PRIMARY KEY (`id_crime_criminoso`),
  ADD KEY `id_crime` (`id_crime`),
  ADD KEY `id_criminoso` (`id_criminoso`);

--
-- Índices para tabela `crime_vitima`
--
ALTER TABLE `crime_vitima`
  ADD PRIMARY KEY (`id_crime_vitima`),
  ADD KEY `id_crime` (`id_crime`),
  ADD KEY `id_vitima` (`id_vitima`);

--
-- Índices para tabela `criminoso`
--
ALTER TABLE `criminoso`
  ADD PRIMARY KEY (`id_criminoso`),
  ADD KEY `id_pessoa` (`id_pessoa`);

--
-- Índices para tabela `pessoa`
--
ALTER TABLE `pessoa`
  ADD PRIMARY KEY (`idpessoa`);

--
-- Índices para tabela `policial`
--
ALTER TABLE `policial`
  ADD PRIMARY KEY (`id_policial`);

--
-- Índices para tabela `vitima`
--
ALTER TABLE `vitima`
  ADD PRIMARY KEY (`id_vitima`),
  ADD KEY `id_pessoa` (`id_pessoa`);

--
-- AUTO_INCREMENT de tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `arma`
--
ALTER TABLE `arma`
  MODIFY `id_arma` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `crime`
--
ALTER TABLE `crime`
  MODIFY `id_crime` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de tabela `crime_criminoso`
--
ALTER TABLE `crime_criminoso`
  MODIFY `id_crime_criminoso` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de tabela `crime_vitima`
--
ALTER TABLE `crime_vitima`
  MODIFY `id_crime_vitima` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de tabela `criminoso`
--
ALTER TABLE `criminoso`
  MODIFY `id_criminoso` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de tabela `pessoa`
--
ALTER TABLE `pessoa`
  MODIFY `idpessoa` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT de tabela `policial`
--
ALTER TABLE `policial`
  MODIFY `id_policial` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `vitima`
--
ALTER TABLE `vitima`
  MODIFY `id_vitima` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- Restrições para despejos de tabelas
--

--
-- Limitadores para a tabela `arma`
--
ALTER TABLE `arma`
  ADD CONSTRAINT `arma_ibfk_1` FOREIGN KEY (`id_criminoso`) REFERENCES `arma` (`id_arma`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Limitadores para a tabela `crime_criminoso`
--
ALTER TABLE `crime_criminoso`
  ADD CONSTRAINT `crime_criminoso_ibfk_1` FOREIGN KEY (`id_crime`) REFERENCES `crime` (`id_crime`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `crime_criminoso_ibfk_2` FOREIGN KEY (`id_criminoso`) REFERENCES `criminoso` (`id_criminoso`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Limitadores para a tabela `crime_vitima`
--
ALTER TABLE `crime_vitima`
  ADD CONSTRAINT `crime_vitima_ibfk_1` FOREIGN KEY (`id_crime`) REFERENCES `crime` (`id_crime`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `crime_vitima_ibfk_2` FOREIGN KEY (`id_vitima`) REFERENCES `vitima` (`id_vitima`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Limitadores para a tabela `criminoso`
--
ALTER TABLE `criminoso`
  ADD CONSTRAINT `criminoso_ibfk_1` FOREIGN KEY (`id_pessoa`) REFERENCES `pessoa` (`idpessoa`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Limitadores para a tabela `vitima`
--
ALTER TABLE `vitima`
  ADD CONSTRAINT `vitima_ibfk_1` FOREIGN KEY (`id_pessoa`) REFERENCES `pessoa` (`idpessoa`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

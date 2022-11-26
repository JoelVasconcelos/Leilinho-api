-- --------------------------------------------------------
-- Servidor:                     25.3.73.177
-- Versão do servidor:           8.0.31 - MySQL Community Server - GPL
-- OS do Servidor:               Win64
-- HeidiSQL Versão:              12.1.0.6566
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


-- Copiando estrutura do banco de dados para cursos
CREATE DATABASE IF NOT EXISTS `cursos` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `cursos`;

-- Copiando estrutura para tabela cursos.course
CREATE TABLE IF NOT EXISTS `course` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `data_fim` datetime(6) DEFAULT NULL,
  `data_inicio` datetime(6) DEFAULT NULL,
  `descricao` varchar(255) DEFAULT NULL,
  `nome` varchar(255) DEFAULT NULL,
  `professor` varchar(255) DEFAULT NULL,
  `turno` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Copiando dados para a tabela cursos.course: ~6 rows (aproximadamente)
INSERT INTO `course` (`id`, `data_fim`, `data_inicio`, `descricao`, `nome`, `professor`, `turno`) VALUES
	(1, '2022-10-03 22:30:22.534000', '2022-12-05 22:30:22.534000', 'A formação arquiteto de software você vai conhecer boas práticas de código, alguns padrões de projeto, e também uma introdução na arquitetura de software, ...', 'Arquitetura e Design de Projetos Java', 'Rafael Henry Benedito Fernandes', 'Matutino'),
	(2, '2023-05-10 00:00:00.000000', '2022-07-04 00:00:00.000000', 'O ASP.NET Core conta com um middleware para a compressão de respostas em APIs REST, fazendo uso para isto do padrão GZIP. A vantagem deste tipo de prática está ...', 'ASP.NET Core REST APIs', 'Nathan Thales Anthony Assunção', 'Noturno'),
	(3, '2023-01-25 00:00:00.000000', '2022-08-01 00:00:00.000000', 'Os microcontroladores são microprocessadores programados para funções singulares. Geralmente são usados para controlar circuitos embarcados e, por isso, são ...', 'Microcontroladores e Eletrônica Aplicada', 'Carlos Edson Rocha', 'Vespertino'),
	(4, '2022-11-03 00:00:00.000000', '2022-10-03 00:00:00.000000', 'Curso de dados', 'Ciencia de dados', 'Bernardo Otávio da Cunha', 'Vespertino'),
	(5, '2022-11-30 00:00:00.000000', '2022-10-06 00:00:00.000000', 'Curso de como se criar um banco de verdade com dados de verdade', 'Curso de banco de dados', 'Nathan Thales Anthony Assunção', 'Vespertino'),
	(6, '2022-11-10 00:00:00.000000', '2022-11-10 00:00:00.000000', 'Curso de aula única', 'Formação de kamikazes', 'Bernardo Otávio da Cunha', 'Noturno');

/*!40103 SET TIME_ZONE=IFNULL(@OLD_TIME_ZONE, 'system') */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;

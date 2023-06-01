/*
 Navicat Premium Data Transfer

 Source Server         : MySQLConexion
 Source Server Type    : MySQL
 Source Server Version : 100427
 Source Host           : localhost:3306
 Source Schema         : app_java

 Target Server Type    : MySQL
 Target Server Version : 100427
 File Encoding         : 65001

 Date: 01/06/2023 08:18:12
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- Eliminar la base de datos si existe
DROP DATABASE IF EXISTS `app_java`;

-- Crear la base de datos si no existe
CREATE DATABASE IF NOT EXISTS `app_java`;

-- Usar la base de datos recién creada
USE `app_java`;

-- ----------------------------
-- Table structure for personas
-- ----------------------------
DROP TABLE IF EXISTS `personas`;
CREATE TABLE `personas`  (
  `cedula` bigint(20) NULL DEFAULT NULL,
  `nombres` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `apellidos` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `telefono` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `direccion` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `email` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of personas
-- ----------------------------
INSERT INTO `personas` VALUES (108800, 'Juan David', 'Peña Rodriguez', '', 'Calle 01', 'juan@mail.com');
INSERT INTO `personas` VALUES (108802, 'Andres Camilo', 'Gonzalez Perez', '', 'Calle 02', 'andres@mail.com');
INSERT INTO `personas` VALUES (108803, 'Ana Maria', 'Sanchez Soto', '', 'Calle 03', 'ana@mail.com');
INSERT INTO `personas` VALUES (108804, 'Daniel Alberto', 'Gomez Guzman', '', 'Calle 04', 'daniel@mail.com');
INSERT INTO `personas` VALUES (108805, 'Maria Alejandra', 'Guzman Hernandez', '', 'Calle 05', 'maria@mail.com');

SET FOREIGN_KEY_CHECKS = 1;

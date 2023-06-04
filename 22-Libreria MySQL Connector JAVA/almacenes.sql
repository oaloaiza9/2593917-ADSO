/*
 Navicat Premium Data Transfer

 Source Server         : MySQLConexion
 Source Server Type    : MySQL
 Source Server Version : 100427
 Source Host           : localhost:3306
 Source Schema         : almacenes

 Target Server Type    : MySQL
 Target Server Version : 100427
 File Encoding         : 65001

 Date: 04/06/2023 17:57:22
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for clientes
-- ----------------------------
DROP TABLE IF EXISTS `clientes`;
CREATE TABLE `clientes`  (
  `cedula` bigint(20) NOT NULL,
  `nombres` varchar(50) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `apellidos` varchar(50) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `telefono` varchar(50) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `direccion` varchar(50) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `email` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  PRIMARY KEY (`cedula`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of clientes
-- ----------------------------
INSERT INTO `clientes` VALUES (108800, 'Deisi Yuliet', 'Perez Diaz', '3128783672', 'Pereira', 'deisysoy@gmail.com');
INSERT INTO `clientes` VALUES (108801, 'Juan Camilo', 'Taborda', '1233456', 'Turin', 'camilo.@hotmail.com');
INSERT INTO `clientes` VALUES (108802, 'Juan Pa', 'Garcia Montes', '325243534', 'Pereira', 'juan@outlook.com');
INSERT INTO `clientes` VALUES (108803, 'Daniel Santiago', 'Cardenas Galeano', '3024322036', 'Marsella', 'daniel@gmail.com');

-- ----------------------------
-- Table structure for facturas
-- ----------------------------
DROP TABLE IF EXISTS `facturas`;
CREATE TABLE `facturas`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `cedula_cliente` bigint(255) NULL DEFAULT NULL,
  `cedula_vendedor` bigint(255) NULL DEFAULT NULL,
  `fecha` text CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL,
  `total` int(255) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `ced_cliente_fact`(`cedula_cliente`) USING BTREE,
  INDEX `ced_vendedor_fact`(`cedula_vendedor`) USING BTREE,
  CONSTRAINT `ced_cliente_fact` FOREIGN KEY (`cedula_cliente`) REFERENCES `clientes` (`cedula`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `ced_vendedor_fact` FOREIGN KEY (`cedula_vendedor`) REFERENCES `vendedores` (`cedula`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for items_factura
-- ----------------------------
DROP TABLE IF EXISTS `items_factura`;
CREATE TABLE `items_factura`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `id_factura` int(11) NULL DEFAULT NULL,
  `id_producto` int(11) NULL DEFAULT NULL,
  `cantidad` int(11) NULL DEFAULT NULL,
  `subtotal` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `id_fact_item`(`id_factura`) USING BTREE,
  INDEX `id_prod_item`(`id_producto`) USING BTREE,
  CONSTRAINT `id_fact_item` FOREIGN KEY (`id_factura`) REFERENCES `facturas` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `id_prod_item` FOREIGN KEY (`id_producto`) REFERENCES `productos` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for productos
-- ----------------------------
DROP TABLE IF EXISTS `productos`;
CREATE TABLE `productos`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `descripcion` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `precio` int(11) NULL DEFAULT NULL,
  `cantidad` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `nombre`(`nombre`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 12355 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of productos
-- ----------------------------
INSERT INTO `productos` VALUES (1, 'CUADERNOS LC 50', 'Cuaderno Norma de 50 hojas - Linea corriente.', 1500, 73);
INSERT INTO `productos` VALUES (2, 'CUADERNOS LC 100', 'Cuaderno Norma de 100 hojas - Linea corriente.', 2000, 50);
INSERT INTO `productos` VALUES (3, 'CUADERNOS C 50', 'Cuaderno Norma de 50 hojas - Cuadriculado.', 1500, 288);
INSERT INTO `productos` VALUES (4, 'CUADERNOS C 100', 'Cuaderno Norma de 100 hojas - Cuadriculado.', 2500, 390);
INSERT INTO `productos` VALUES (5, 'LAPICERO', 'Kilimetrico - Gris', 810, 445);
INSERT INTO `productos` VALUES (6, 'LAPICERO', 'Kilometrico - Azul', 800, 340);
INSERT INTO `productos` VALUES (7, 'BORRADOR', 'Borrador de Nata blanco', 500, 494);

-- ----------------------------
-- Table structure for vendedores
-- ----------------------------
DROP TABLE IF EXISTS `vendedores`;
CREATE TABLE `vendedores`  (
  `cedula` bigint(20) NOT NULL,
  `nombres` varchar(50) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `apellidos` varchar(50) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `telefono` varchar(50) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `direccion` varchar(50) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `email` varchar(100) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  PRIMARY KEY (`cedula`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of vendedores
-- ----------------------------
INSERT INTO `vendedores` VALUES (109900, 'OSCAR ANDRES', 'LOAIZA PABON', '3333333', 'CARRERA 8', 'oscar@email.com');
INSERT INTO `vendedores` VALUES (109901, 'JUAN DAVID', 'MONSALVE PEREZ', '3222222', 'CARRERA 20', 'monsalve@mail.com');

SET FOREIGN_KEY_CHECKS = 1;

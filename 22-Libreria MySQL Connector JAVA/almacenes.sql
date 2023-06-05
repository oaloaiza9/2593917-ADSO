-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 05-06-2023 a las 15:37:13
-- Versión del servidor: 10.4.27-MariaDB
-- Versión de PHP: 8.0.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `almacenes`
--

-- --------------------------------------------------------

-- Eliminar la base de datos si existe
DROP DATABASE IF EXISTS `almacenes`;

-- Crear la base de datos si no existe
CREATE DATABASE IF NOT EXISTS `almacenes`;

-- Usar la base de datos recién creada
USE `almacenes`;

--
-- Estructura de tabla para la tabla `clientes`
--

CREATE TABLE `clientes` (
  `cedula` bigint(20) NOT NULL,
  `nombres` varchar(50) DEFAULT NULL,
  `apellidos` varchar(50) DEFAULT NULL,
  `telefono` varchar(50) DEFAULT NULL,
  `direccion` varchar(50) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci ROW_FORMAT=DYNAMIC;

--
-- Volcado de datos para la tabla `clientes`
--

INSERT INTO `clientes` (`cedula`, `nombres`, `apellidos`, `telefono`, `direccion`, `email`) VALUES
(108800, 'Deisi Yuliet', 'Perez Diaz', '3128783672', 'Pereira', 'deisysoy@gmail.com'),
(108801, 'Juan Camilo', 'Taborda', '1233456', 'Turin', 'camilo.@hotmail.com'),
(108802, 'Juan Pa', 'Garcia Montes', '325243534', 'Pereira', 'juan@outlook.com'),
(108803, 'Daniel Santiago', 'Cardenas Galeano', '3024322036', 'Marsella', 'daniel@gmail.com');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `facturas`
--

CREATE TABLE `facturas` (
  `id` int(11) NOT NULL,
  `cedula_cliente` bigint(255) DEFAULT NULL,
  `cedula_vendedor` bigint(255) DEFAULT NULL,
  `fecha` text DEFAULT NULL,
  `total` int(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci ROW_FORMAT=DYNAMIC;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `items_factura`
--

CREATE TABLE `items_factura` (
  `id` int(11) NOT NULL,
  `id_factura` int(11) DEFAULT NULL,
  `id_producto` int(11) DEFAULT NULL,
  `cantidad` int(11) DEFAULT NULL,
  `subtotal` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci ROW_FORMAT=DYNAMIC;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `productos`
--

CREATE TABLE `productos` (
  `id` int(11) NOT NULL,
  `nombre` varchar(50) DEFAULT NULL,
  `descripcion` varchar(255) DEFAULT NULL,
  `precio` int(11) DEFAULT NULL,
  `cantidad` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci ROW_FORMAT=DYNAMIC;

--
-- Volcado de datos para la tabla `productos`
--

INSERT INTO `productos` (`id`, `nombre`, `descripcion`, `precio`, `cantidad`) VALUES
(1, 'CUADERNOS LC 50', 'Cuaderno Norma de 50 hojas - Linea corriente.', 1500, 73),
(2, 'CUADERNOS LC 100', 'Cuaderno Norma de 100 hojas - Linea corriente.', 2000, 50),
(3, 'CUADERNOS C 50', 'Cuaderno Norma de 50 hojas - Cuadriculado.', 1500, 288),
(4, 'CUADERNOS C 100', 'Cuaderno Norma de 100 hojas - Cuadriculado.', 2500, 390),
(5, 'LAPICERO', 'Kilimetrico - Gris', 810, 445),
(6, 'LAPICERO', 'Kilometrico - Azul', 800, 340),
(7, 'BORRADOR', 'Borrador de Nata blanco', 500, 494);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `vendedores`
--

CREATE TABLE `vendedores` (
  `cedula` bigint(20) NOT NULL,
  `nombres` varchar(50) DEFAULT NULL,
  `apellidos` varchar(50) DEFAULT NULL,
  `telefono` varchar(50) DEFAULT NULL,
  `direccion` varchar(50) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci ROW_FORMAT=DYNAMIC;

--
-- Volcado de datos para la tabla `vendedores`
--

INSERT INTO `vendedores` (`cedula`, `nombres`, `apellidos`, `telefono`, `direccion`, `email`) VALUES
(109900, 'OSCAR ANDRES', 'LOAIZA PABON', '3333333', 'CARRERA 8', 'oscar@email.com'),
(109901, 'JUAN DAVID', 'MONSALVE PEREZ', '3222222', 'CARRERA 20', 'monsalve@mail.com');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `clientes`
--
ALTER TABLE `clientes`
  ADD PRIMARY KEY (`cedula`) USING BTREE;

--
-- Indices de la tabla `facturas`
--
ALTER TABLE `facturas`
  ADD PRIMARY KEY (`id`) USING BTREE,
  ADD KEY `ced_cliente_fact` (`cedula_cliente`) USING BTREE,
  ADD KEY `ced_vendedor_fact` (`cedula_vendedor`) USING BTREE;

--
-- Indices de la tabla `items_factura`
--
ALTER TABLE `items_factura`
  ADD PRIMARY KEY (`id`) USING BTREE,
  ADD KEY `id_fact_item` (`id_factura`) USING BTREE,
  ADD KEY `id_prod_item` (`id_producto`) USING BTREE;

--
-- Indices de la tabla `productos`
--
ALTER TABLE `productos`
  ADD PRIMARY KEY (`id`) USING BTREE,
  ADD KEY `nombre` (`nombre`) USING BTREE;

--
-- Indices de la tabla `vendedores`
--
ALTER TABLE `vendedores`
  ADD PRIMARY KEY (`cedula`) USING BTREE;

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `facturas`
--
ALTER TABLE `facturas`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `items_factura`
--
ALTER TABLE `items_factura`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `productos`
--
ALTER TABLE `productos`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12355;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `facturas`
--
ALTER TABLE `facturas`
  ADD CONSTRAINT `ced_cliente_fact` FOREIGN KEY (`cedula_cliente`) REFERENCES `clientes` (`cedula`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `ced_vendedor_fact` FOREIGN KEY (`cedula_vendedor`) REFERENCES `vendedores` (`cedula`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `items_factura`
--
ALTER TABLE `items_factura`
  ADD CONSTRAINT `id_fact_item` FOREIGN KEY (`id_factura`) REFERENCES `facturas` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `id_prod_item` FOREIGN KEY (`id_producto`) REFERENCES `productos` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 26-01-2024 a las 15:01:35
-- Versión del servidor: 10.4.32-MariaDB
-- Versión de PHP: 8.1.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `preguntas_v2_db`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cuestionarios`
--

CREATE TABLE `cuestionarios` (
  `id` int(11) NOT NULL,
  `id_usuario` int(11) UNSIGNED NOT NULL,
  `cant_preguntas` int(11) NOT NULL,
  `cant_ok` int(11) NOT NULL,
  `cant_error` int(11) NOT NULL,
  `fecha_inicio` datetime NOT NULL DEFAULT current_timestamp(),
  `fecha_fin` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;

--
-- Volcado de datos para la tabla `cuestionarios`
--

INSERT INTO `cuestionarios` (`id`, `id_usuario`, `cant_preguntas`, `cant_ok`, `cant_error`, `fecha_inicio`, `fecha_fin`) VALUES
(1, 1, 0, 0, 0, '2024-01-25 20:32:56', NULL),
(2, 1, 0, 0, 0, '2024-01-25 23:41:44', '2024-01-25 23:47:44'),
(38, 1, 0, 0, 0, '2024-01-26 12:18:46', NULL),
(39, 1, 0, 0, 0, '2024-01-26 12:26:09', NULL);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `opciones`
--

CREATE TABLE `opciones` (
  `id` int(10) UNSIGNED NOT NULL,
  `id_pregunta` int(10) UNSIGNED DEFAULT NULL,
  `descripcion` varchar(255) CHARACTER SET utf8 COLLATE utf8_spanish2_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Volcado de datos para la tabla `opciones`
--

INSERT INTO `opciones` (`id`, `id_pregunta`, `descripcion`) VALUES
(1, 1, 'HyperText Markup Language'),
(2, 1, 'Hyperlink '),
(3, 1, 'High-Level'),
(4, 2, 'C'),
(5, 2, 'C++'),
(6, 2, 'Ruby'),
(7, 3, 'Cascaded S'),
(8, 3, 'Cascading Style Sheets'),
(9, 3, 'Cascaded S'),
(10, 4, '->'),
(11, 4, '='),
(12, 4, '==='),
(13, 5, 'Crear las '),
(14, 5, 'Almacenar '),
(15, 5, 'Lenguaje de consulta estructurada para gestionar bases de datos'),
(16, 6, 'Modelo-Visa'),
(17, 6, 'Modelo-Vista-Controlador'),
(18, 6, 'Microservi'),
(19, 7, 'Java'),
(20, 7, 'PHP'),
(21, 7, 'C'),
(22, 8, 'Instrucción'),
(23, 8, 'Estructura de control de iteración'),
(24, 8, 'Comando de'),
(25, 9, 'SVN'),
(26, 9, 'Mercurial'),
(27, 9, 'GitHub'),
(28, 10, 'Un conjunt'),
(29, 10, 'Un disposi'),
(30, 10, 'Un conjunto de instrucciones paso a paso para realizar una tarea'),
(31, 9, 'Git');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `preguntas`
--

CREATE TABLE `preguntas` (
  `id` int(10) UNSIGNED NOT NULL,
  `descripcion` varchar(255) CHARACTER SET utf8 COLLATE utf8_spanish2_ci DEFAULT NULL,
  `id_correcta` varchar(100) CHARACTER SET utf8 COLLATE utf8_spanish2_ci DEFAULT NULL,
  `url_imagen` varchar(255) CHARACTER SET utf8 COLLATE utf8_spanish2_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Volcado de datos para la tabla `preguntas`
--

INSERT INTO `preguntas` (`id`, `descripcion`, `id_correcta`, `url_imagen`) VALUES
(1, '¿Qué significa HTML?', '1', 'https://www.oxfordwebstudio.com/user/pages/06.da-li-znate/sta-je-html/sta-je-html.jpg'),
(2, '¿En qué lenguaje est? escrito Python?', '4', 'https://www.solvetic.com/uploads/monthly_01_2016/tutorials-1415-0-60642300-1452279191.jpg'),
(3, '¿Qué es CSS?', '8', 'https://1000marcas.net/wp-content/uploads/2021/02/CSS-Logo.png'),
(4, '¿Cuál es el símbolo de asignación en JavaScript?', '11', 'https://upload.wikimedia.org/wikipedia/commons/thumb/9/99/Unofficial_JavaScript_logo_2.svg/1200px-Unofficial_JavaScript_logo_2.svg.png'),
(5, '¿Cuál es el propósito de SQL?', '15', 'https://www.bigbaydata.com/wp-content/uploads/2022/11/sql_ejercicios.png'),
(6, '¿Qué significa MVC en el contexto del desarrollo web?', '17', 'https://estradawebgroup.com/ImagesUpload/File_Upload_202331310241646_U_7.webp'),
(7, '¿Cuál es el lenguaje de programación más utilizado para el desarrollo de aplicaciones Android?', '19', 'https://developer.android.com/static/training/basics/firstapp/images/first_app.svg?hl=es-419'),
(8, '¿Qué es un bucle \"for\" en la programación?', '23', 'https://sistemasumma.files.wordpress.com/2012/10/ciclos.png?w=1140'),
(9, '¿Cuál es el sistema de control de versiones más utilizado?', '31', 'https://victorroblesweb.es/wp-content/uploads/2018/04/git.png'),
(10, '¿Qué es un algoritmo?', '30', 'https://cdn.openwebinars.net/media/featured_images/blog-que-es-un-algoritmo-informatico.jpg');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `respuestas`
--

CREATE TABLE `respuestas` (
  `id_respuesta` int(10) UNSIGNED NOT NULL,
  `id_cuestionario` int(11) NOT NULL,
  `id_pregunta` int(10) UNSIGNED DEFAULT NULL,
  `respuesta` varchar(100) CHARACTER SET utf8 COLLATE utf8_spanish2_ci DEFAULT NULL,
  `estado` enum('OK','ERROR') CHARACTER SET utf8 COLLATE utf8_spanish2_ci NOT NULL,
  `fecha` datetime DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Volcado de datos para la tabla `respuestas`
--

INSERT INTO `respuestas` (`id_respuesta`, `id_cuestionario`, `id_pregunta`, `respuesta`, `estado`, `fecha`) VALUES
(3, 1, 1, 'Hyperlink Text Markup Language', 'OK', '2024-01-25 20:38:55'),
(5, 1, 5, 'Crear las bases de datos', 'ERROR', '2024-01-25 20:40:15'),
(6, 2, 7, 'Java', 'OK', '2024-01-25 23:43:42'),
(7, 2, 9, 'Git', 'OK', '2024-01-25 23:43:42'),
(8, 2, 4, '=', 'OK', '2024-01-25 23:44:08'),
(9, 2, 10, 'Un conjunto de instrucciones paso a paso para realizar una tarea', 'OK', '2024-01-25 23:44:35'),
(44, 38, 6, 'Microservices-Virtual Container', 'ERROR', '2024-01-26 07:18:53'),
(45, 38, 10, 'Un dispositivo de almacenamiento de datos', 'ERROR', '2024-01-26 07:18:55'),
(46, 38, 8, 'InstrucciÃƒÂ³n de salida', 'ERROR', '2024-01-26 07:18:58'),
(47, 38, 5, 'Almacenar grandes cantidades de datos', 'ERROR', '2024-01-26 07:19:01'),
(48, 39, 6, 'MÃƒÂ¡quina Virtual de Control', 'ERROR', '2024-01-26 07:26:56'),
(49, 39, 10, 'Un dispositivo de almacenamiento de datos', 'ERROR', '2024-01-26 07:29:01'),
(50, 39, 4, '==', 'ERROR', '2024-01-26 07:31:30'),
(51, 39, 5, 'Almacenar grandes cantidades de datos', 'ERROR', '2024-01-26 07:32:29'),
(52, 39, 3, 'Cascading Styling Sheets', 'ERROR', '2024-01-26 07:32:31'),
(53, 39, 1, 'Hyperlink Text Markup Language', 'ERROR', '2024-01-26 07:32:33'),
(54, 39, 9, 'Mercurial', 'ERROR', '2024-01-26 07:32:48'),
(55, 39, 2, 'C++', 'ERROR', '2024-01-26 07:32:50'),
(56, 39, 8, 'Estructura de selecciÃƒÂ³n', 'OK', '2024-01-26 07:32:52');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `id_usuario` int(10) UNSIGNED NOT NULL,
  `nombres` varchar(80) CHARACTER SET utf8 COLLATE utf8_spanish2_ci DEFAULT NULL,
  `correo` varchar(120) CHARACTER SET utf8 COLLATE utf8_spanish2_ci DEFAULT NULL,
  `password` varchar(255) CHARACTER SET utf8 COLLATE utf8_spanish2_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`id_usuario`, `nombres`, `correo`, `password`) VALUES
(1, 'Oscar Andres Loaiza Pabon', 'andres@gmail.com', '827ccb0eea8a706c4c34a16891f84e7b');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `cuestionarios`
--
ALTER TABLE `cuestionarios`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_usuario` (`id_usuario`);

--
-- Indices de la tabla `opciones`
--
ALTER TABLE `opciones`
  ADD PRIMARY KEY (`id`),
  ADD KEY `pregunta` (`id_pregunta`);

--
-- Indices de la tabla `preguntas`
--
ALTER TABLE `preguntas`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `respuestas`
--
ALTER TABLE `respuestas`
  ADD PRIMARY KEY (`id_respuesta`),
  ADD KEY `pregunta` (`id_pregunta`),
  ADD KEY `id_cuestionarios` (`id_cuestionario`);

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`id_usuario`),
  ADD UNIQUE KEY `correo` (`correo`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `cuestionarios`
--
ALTER TABLE `cuestionarios`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=40;

--
-- AUTO_INCREMENT de la tabla `opciones`
--
ALTER TABLE `opciones`
  MODIFY `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=32;

--
-- AUTO_INCREMENT de la tabla `preguntas`
--
ALTER TABLE `preguntas`
  MODIFY `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT de la tabla `respuestas`
--
ALTER TABLE `respuestas`
  MODIFY `id_respuesta` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=57;

--
-- AUTO_INCREMENT de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  MODIFY `id_usuario` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `cuestionarios`
--
ALTER TABLE `cuestionarios`
  ADD CONSTRAINT `cuestionarios_ibfk_1` FOREIGN KEY (`id_usuario`) REFERENCES `usuarios` (`id_usuario`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `opciones`
--
ALTER TABLE `opciones`
  ADD CONSTRAINT `opciones_ibfk_1` FOREIGN KEY (`id_pregunta`) REFERENCES `preguntas` (`id`);

--
-- Filtros para la tabla `respuestas`
--
ALTER TABLE `respuestas`
  ADD CONSTRAINT `respuestas_ibfk_3` FOREIGN KEY (`id_cuestionario`) REFERENCES `cuestionarios` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `respuestas_ibfk_4` FOREIGN KEY (`id_pregunta`) REFERENCES `preguntas` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

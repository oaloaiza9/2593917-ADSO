<?php

$servidor = 'localhost';
$usuario = 'root';
$contrasena = '';
$nombre_de_base = 'app_java';

try{
   $base_de_datos = new PDO("mysql:host=$servidor;dbname=$nombre_de_base", $usuario, $contrasena);
}catch(Exception $e){
   echo 'Ha surgido un error y no se puede conectar a la base de datos. Detalle: ' . $e->getMessage();
   exit;
}
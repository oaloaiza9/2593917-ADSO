<?php 
    header("Access-Control-Allow-Origin: *"); // Permite el acceso desde cualquier origen, o usa "http://localhost" si solo quieres permitirlo desde localhost.
    header("Access-Control-Allow-Methods: GET, POST, OPTIONS");
    header("Access-Control-Allow-Headers: Content-Type");
    
    include 'Conexion.php';

    if (!empty($_POST['cedula']) and !empty($_POST['nombres']) and !empty($_POST['apellidos']) ) {

        $documento = $_POST['cedula'];
        $nombres = $_POST['nombres'];
        $apellidos = $_POST['apellidos'];

        $consulta = $base_de_datos->prepare("INSERT INTO personas (cedula, nombres, apellidos) VALUES(:doc, :nom, :ape) ");

        $consulta->bindParam(':doc', $documento);
        $consulta->bindParam(':nom', $nombres);
        $consulta->bindParam(':ape', $apellidos);
        
        $respuesta = $consulta->execute();

        if( $respuesta ){
            $respuesta['respuesta'] = [
                                        'status' => true,
                                        'mesagge' => "OK##Cliente##Insert",
                                      ];
            echo json_encode($respuesta);
        }else{
            $respuesta['respuesta'] = [
                                        'status' => false,
                                        'mesagge' => "ERROR##Cliente##Insert",
                                      ];
            echo json_encode($respuesta);
        }
        
    }else{
        $respuesta['respuesta'] = [
                                    'status' => false,
                                    'mesagge' => "ERROR##DATOS##POST",
                                  ];
        echo json_encode($respuesta);
    }
?>

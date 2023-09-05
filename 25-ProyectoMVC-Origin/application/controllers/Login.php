<?php
defined('BASEPATH') OR exit('No direct script access allowed');

class Login extends CI_Controller {

	public function index(){
		$this->load->view('iniciar_session');
	}

	public function validarIngreso(){
		$email = $this->input->post('campo_email');
		$password = $this->input->post('campo_password');

		if ($email!="" && $password!="") {
			$this->load->model('PersonasModel');
			$this->load->model('UsuariosModel');
			$validacion = $this->UsuariosModel->validarIngreso($email, $password);

			if ($validacion) {
				// EXTRAER LOS DATOS DE LA PERSONA Y USUARIO
				$datosPersona = $this->PersonasModel->getPersonaByEmail($email);
				$datosUsuario = $this->UsuariosModel->getUsuarioByEmail($email);

				// CREAR LA VARIABLE DE SESION
				$dataSession = [
								  "cedula" => $datosPersona->cedula,
								  "nombres" => $datosPersona->nombres,
								  "apellidos" => $datosPersona->apellidos,
								  "telefono" => $datosPersona->telefono,
								  "direccion" => $datosPersona->direccion,
								  "email" => $datosPersona->email,
								  "foto" => $datosPersona->foto,
								  "tipo" => $datosUsuario->tipo,
								  "estado" => $datosUsuario->estado,
							   ];
				$this->session->set_userdata("session-mvc", $dataSession);

				// REDIRECCIONAR AL CONTROLADOR INICIAL SEGUN EL TIPO DE USUARIO
				if ( $datosUsuario->tipo == "ADMIN" ) {
					redirect('admin/Inicio','refresh');
				}else if( $datosUsuario->tipo == "VENDEDOR" ){
					redirect('vendedor/Inicio','refresh');
				}else{
					redirect('Login','refresh');
				}
			}else{
				$data['datosInvalidos'] = true;
				$this->load->view('iniciar_session', $data);
			}		
		}else{
			$data['errorInData'] = true;
			$data['valueEmail'] = $email;
			$data['valuePassword'] = $password;
			$this->load->view('iniciar_session', $data);
		}
	}
	
	public function cerrarSession(){
		$this->session->sess_destroy();
		redirect('Login','refresh');
	}

}

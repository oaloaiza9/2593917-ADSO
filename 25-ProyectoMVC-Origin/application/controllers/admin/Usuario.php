<?php
defined('BASEPATH') OR exit('No direct script access allowed');

class Usuario extends CI_Controller {

	public function __construct(){
		parent::__construct();
		$validacion = $this->session->has_userdata("session-mvc");
		if ($validacion) {
			$session = $this->session->userdata("session-mvc");
			if ($session['tipo']=="ADMIN" && $session['estado']=="ACTIVO") {
				return false;
			}else{
				redirect('Login/cerrarSession','refresh');
				die();
			}
		}else{
			redirect('Login/cerrarSession','refresh');
			die();
		}
	}

	public function index(){
		// Ninguna accion.
	}

	public function createUser(){
		$cedula = $this->input->post('new_cedula');
		$nombres = $this->input->post('new_nombres');
		$apellidos = $this->input->post('new_apellidos');
		$telefono = $this->input->post('new_telefono');
		$direccion = $this->input->post('new_direccion');
		$correo = $this->input->post('new_correo');
		$password = $this->input->post('new_password');
		$tipo = $this->input->post('new_tipo');

		if ($cedula!="" && $nombres!="" && $apellidos!="" && $telefono!="" && $direccion!="" && $correo!="" && $password!="" && $tipo!="") {
			
			$this->load->model('PersonasModel');
			$this->load->model('UsuariosModel');
			
			$cedulaValida = $this->PersonasModel->validarCedula($cedula);
			$emailValido = $this->PersonasModel->validarEmail($correo);

			if ($cedulaValida && $emailValido) {
				$this->PersonasModel->insertar($cedula, $nombres, $apellidos, $telefono, $direccion, $correo);
				$this->UsuariosModel->insertar($cedula, $correo, $password, $tipo);
				
				$data['session'] = $this->session->userdata("session-mvc");
				$data['date_validos'] = true;
				$this->load->view('admin/crearUsuario', $data);
			}else{
				$data['session'] = $this->session->userdata("session-mvc");
				$data['datosRepetidos'] = true;
				$data['cedulaRepetida'] = $cedulaValida ;
				$data['emailRepetido'] = $emailValido ;
				$this->load->view('admin/crearUsuario', $data);
			}
		}else{
			$data['session'] = $this->session->userdata("session-mvc");
			$data['dateIncompletos'] = true;
			$this->load->view('admin/crearUsuario', $data);
		}
	}
	
	// Funcion de la API
	public function getListaUsuarios(){
		$this->load->model('PersonasModel');
		$datos = $this->PersonasModel->getListaPersonas();
		echo json_encode(  $datos );
	}
	
}

/* End of file Usuario.php */
/* Location: ./application/controllers/admin/Usuario.php */
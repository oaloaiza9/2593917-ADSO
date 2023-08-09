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
			

		}else{
			$data['errorInData'] = true;
			$data['valueEmail'] = $email;
			$data['valuePassword'] = $password;
			$this->load->view('iniciar_session', $data);
		}
	}

	public function registroUsuario(){
		echo "Cargando vista para registrar al usuario";
	}

}

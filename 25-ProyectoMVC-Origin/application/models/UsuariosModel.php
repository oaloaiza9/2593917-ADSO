<?php
defined('BASEPATH') OR exit('No direct script access allowed');

class UsuariosModel extends CI_Model {

	public function validarIngreso($email, $password){
		$this->db->select('cedula, email, tipo');
		$this->db->where('email', $email);
		$this->db->where('password', md5($password) );
		$this->db->where('estado', 'ACTIVO');
		$registros = $this->db->get('usuarios')->result();

		if (sizeof($registros)==0) {
			return false;
		}else{
			return true;
		}
	}

	public function getUsuarioByEmail($email){
		$this->db->select("cedula, tipo, estado");
		$this->db->where('email', $email);
		$registros = $this->db->get('usuarios')->result();

		if (sizeof($registros)!=0) {
			return $registros[0];
		}else{
			return null;
		}
	}

	public function insertar($cedula, $correo, $password, $tipo){
		$data = [
					'cedula' => $cedula,
					'email' => $correo,
					'password' => md5($password),
					'tipo' => $tipo,
					'estado' => 'ACTIVO'
				];
		return $this->db->insert('usuarios', $data);
	}

}

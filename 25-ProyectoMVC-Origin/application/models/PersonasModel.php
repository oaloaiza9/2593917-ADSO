<?php
defined('BASEPATH') OR exit('No direct script access allowed');

class PersonasModel extends CI_Model {

	public function getPersonaByEmail($email){
		$this->db->where('email', $email);
		$registros = $this->db->get('personas')->result();

		if (sizeof($registros)!=0) {
			return $registros[0];
		}else{
			return null;
		}
	}

	public function validarRegistro($cedula, $email){
		$this->db->select('*');
		$this->db->where("cedula", $cedula);
		$this->db->or_where("email", $email);
		$registros = $this->db->get('personas')->result();

		return (sizeof($registros)==0);
	}

	public function validarCedula($cedula){
		$this->db->select('*');
		$this->db->where("cedula", $cedula);
		$registros = $this->db->get('personas')->result();

		return (sizeof($registros)==0);
	}

	public function validarEmail($email){
		$this->db->select('*');
		$this->db->where("email", $email);
		$registros = $this->db->get('personas')->result();

		return (sizeof($registros)==0);
	}

	public function insertar($cedula, $nombres, $apellidos, $telefono, $direccion, $correo){
		$data = [
					'cedula' => $cedula,
					'nombres' => $nombres,
					'apellidos' => $apellidos,
					'telefono' => $telefono,
					'direccion' => $direccion,
					'email' => $correo,
					'foto' => 'default.png'
				];
				
		return $this->db->insert('personas', $data);
	}

	public function getListaPersonas(){
		return $this->db->get('personas')->result();
	}

}

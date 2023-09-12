<?php 
  $dataHeader['titulo'] = "Crear Usuarios";
  $this->load->view('layouts/header', $dataHeader); 
?>
  <?php 
    $dataSidebar['session'] = $session;
    $dataSidebar['optionSelected'] = 'openCrudAjax';
    $this->load->view('layouts/sidebar', $dataSidebar); 
  ?>
  <!-- Content Wrapper. Contains page content -->
  <div class="content-wrapper">
    <div class="col-12 m-0 p-2 bg-white">
      <div class="row justify-content-end">
        <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#modalCrearUsuario">CREAR USUARIO</button>
      </div>
      <table class="table table-bordered">
        <thead>
          <tr>
            <th>CEDULA</th>
            <th>NOMBRES</th>
            <th>APELLIDOS</th>
            <th>TELEFONO</th>
            <th>DIRECCION</th>
            <th>CORREO</th>
            <th></th>
          </tr>
        </thead>
        <tbody id="tbodyPersonas">
          
        </tbody>
      </table> 
    </div>
  </div>

  <div class="modal fade" id="modalCrearUsuario">
    <div class="modal-dialog">
      <form id="formularioCrearUsuario" action="#" method="POST">
        <div class="modal-content">
          <div class="modal-header">
            <h4 class="modal-title">CREAR USUARIO</h4>
            <button type="button" class="close" data-dismiss="modal" aria-label="Close">
              <span aria-hidden="true">&times;</span>
            </button>
          </div>
          <div class="modal-body">
            
            <label class="form-label" for="campo_cedula">CEDULA:</label>
            <input id="campo_cedula" class="form-control" type="number" required name="campo_cedula">

            <label class="form-label" for="campo_nombres">NOMBRES:</label>
            <input id="campo_nombres" class="form-control" type="text" required name="campo_nombres">

            <label class="form-label" for="campo_apellidos">APELLIDOS:</label>
            <input id="campo_apellidos" class="form-control" type="text" required name="campo_apellidos">

            <label class="form-label" for="campo_telefono">TELEFONO:</label>
            <input id="campo_telefono" class="form-control" type="text" required name="campo_telefono">

            <label class="form-label" for="campo_direccion">DIRECCION:</label>
            <input id="campo_direccion" class="form-control" type="text" required name="campo_direccion">

            <label class="form-label" for="campo_email">E-MAIL:</label>
            <input id="campo_email" class="form-control" type="text" required name="campo_email">

            <label class="form-label" for="campo_tipo">TIPO:</label>
            <select class="form-control" id="campo_tipo" required name="campo_tipo">
              <option value="----">----</option>
              <option value="ADMIN">ADMIN</option>
              <option value="VENDEDOR">VENDEDOR</option>
            </select>
          </div>
          <div class="modal-footer justify-content-center">
            <button type="button" class="btn btn-default" data-dismiss="modal">CERRAR</button>
            <button type="submit" class="btn btn-primary">REGISTRAR</button>
          </div>
        </div>
        <!-- /.modal-content -->
      </form>
    </div>
    <!-- /.modal-dialog -->
  </div>
  <script src="<?= base_url('dist/js/my_script.js') ?>"></script>
<?php 
  $this->load->view('layouts/footer'); 
?>
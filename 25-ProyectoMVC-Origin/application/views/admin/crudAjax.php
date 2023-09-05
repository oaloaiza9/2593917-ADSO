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
      <div class="modal-content">
        <div class="modal-header">
          <h4 class="modal-title">Default Modal</h4>
          <button type="button" class="close" data-dismiss="modal" aria-label="Close">
            <span aria-hidden="true">&times;</span>
          </button>
        </div>
        <div class="modal-body">
          <p>One fine body&hellip;</p>
        </div>
        <div class="modal-footer justify-content-between">
          <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
          <button type="button" class="btn btn-primary">Save changes</button>
        </div>
      </div>
      <!-- /.modal-content -->
    </div>
    <!-- /.modal-dialog -->
  </div>
  <script src="<?= base_url('dist/js/my_script.js') ?>"></script>
<?php 
  $this->load->view('layouts/footer'); 
?>
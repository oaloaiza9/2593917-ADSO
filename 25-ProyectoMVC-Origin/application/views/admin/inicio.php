<?php 
  $dataHeader['titulo'] = "INICIO";
  $this->load->view('layouts/header', $dataHeader); 
?>
  <?php 
    $dataSidebar['session'] = $session;
    $dataSidebar['optionSelected'] = '';
    $this->load->view('layouts/sidebar', $dataSidebar); 
  ?>
  <!-- Content Wrapper. Contains page content -->
  <div class="content-wrapper">
    <div class="col-12 m-0 p-3">
      <h1 class="text-primary text-center"> INICIO DEL USUARIO </h1>
    </div>
  </div>
<?php 
  $this->load->view('layouts/footer'); 
?>
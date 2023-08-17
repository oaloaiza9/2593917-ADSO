<!DOCTYPE html>
<html>
	<head>
		<title>INICIAR SESION</title>
		<meta charset="utf-8">
    	<meta name="viewport" content="width=device-width, initial-scale=1">
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
		<link href="https://cdn.jsdelivr.net/npm/sweetalert2@11.7.20/dist/sweetalert2.min.css" rel="stylesheet">

		<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
		<script src="https://cdn.jsdelivr.net/npm/sweetalert2@11.7.20/dist/sweetalert2.all.min.js"></script>
	</head>
	<body>

		<div class="container">
			<div class="col-12 row m-0 p-0 justify-content-center">
				<div class="col-12 col-lg-5 mt-3 p-3 px-5 border">
					<h3 class="text-center text-primary text-uppercase mb-3"><b>Inicio de Sesión</b></h3>

					<?php if (isset($errorInData)){ ?>
						<div class="alert alert-danger">
							DATOS INCOMPLETOS
						</div>
					<?php } ?>

					<?php if (isset($datosInvalidos)){ ?>
						<div class="alert alert-danger">
							NO EXISTE UN USUARIO CON ESOS DATOS
						</div>
					<?php } ?>

					<form action="<?= base_url('index.php/Login/validarIngreso') ?>" method="POST">
						<label for="campo_email" class="form-label m-0"><b>E-mail:</b></label>
						<input class="form-control <?= (isset($valueEmail) && $valueEmail!='')? 'is-valid': ((isset($errorInData))? 'is-invalid':'') ?>" id="campo_email" type="email" name="campo_email" value="<?= (isset($valueEmail))? $valueEmail : '' ?>">

						<label for="campo_password" class="form-label m-0 mt-3"><b>Password:</b></label>
						<input class="form-control <?= (isset($valueEmail) && $valuePassword!='')? 'is-valid': ((isset($errorInData))? 'is-invalid':'') ?>" id="campo_password" type="password" name="campo_password" value="<?= (isset($valuePassword))? $valuePassword : '' ?>">

						<div class="row m-0 mt-3 p-0 justify-content-center">
							<div class="col-12 col-lg-6 m-0 p-0">
								<button class="col-12 btn btn-primary" type="submit">INICIAR</button>
							</div>
						</div>
					</form>

					<div class="col-12 m-0 mt-3 p-0">
						<div class="col-12 m-0 p-0">
							<p class="m-0 p-0">
								¿Deseas ser parte del sistema?
								<a href="#" title="Crear Nuevo Usuario">Click aquí</a>
							</p>
						</div>
						<div class="col-12 m-0 p-0">
							<p class="m-0 p-0">
								¿Has olvidado la contraseña?
								<a href="#" title="Crear Nuevo Usuario">Recuperar aquí</a>
							</p>
						</div>
					</div>

				</div>
			</div>
		</div>

		<?php if (isset($errorInData)): ?>
			<script>
				Swal.fire({
					title: 'DATOS INVALIDOS',
					text: 'El correo y contraseña son obligatorios.',
					icon: 'error',
				});
			</script>
		<?php endif ?>
	</body>
</html>
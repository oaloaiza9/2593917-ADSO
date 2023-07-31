let waitContent = null;

window.onload = function(){
	waitContent = document.getElementById("waitContent");
	getClientes();
}

function getClientes(){
	let endpointLocal = "http://localhost/ProyectoPHP/Obtener.php";
	waitContent.style.display = 'block';
	fetch( endpointLocal )
	.then( res => res.json() )
	.then( data => {
		console.log("Datos servidor:");
		console.log(data);
		waitContent.style.display = 'none';
	});
}

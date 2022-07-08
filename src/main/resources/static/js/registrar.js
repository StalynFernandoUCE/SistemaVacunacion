// Call the dataTables jQuery plugin
$(document).ready(function() {
    //
});

async function registrarUsuarios() {
  let datos={};

  datos.nombre=document.getElementById('txtNombre').value;
  datos.apellido=document.getElementById('txtApellido').value;
  datos.email=document.getElementById('txtEmail').value;
  datos.password=document.getElementById('txtPassword').value;
  datos.cedula=document.getElementById('txtCedula').value;

  //let repetirPassword=document.getElementById('txtRepetirPassword').value;

  //if (repetirPassword != datos.password){
  //  alert('La contraseña que escribiste es diferente.');
  //  return;
  //}

  const request = await fetch('api/usuarios', {
    method: 'POST',
    headers: {
      'Accept': 'application/json',
      'Content-Type': 'application/json'
    },
    body: JSON.stringify(datos)
  });

  alert("usuario registrado")
  window.location.href = 'usuarios.html'

}


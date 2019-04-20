window.addEventListener('load',function (){
    document.getElementById('BtnRegistrar').addEventListener('click', function (){
        var nombre=document.getElementById('Usuario').value;
        var contraseña=document.getElementById('Password').value;
        var nacimiento=document.getElementById('Fecha').value;
        var correo=document.getElementById('Correo').value;
        var tipo_user=document.getElementById('Tipo_user').value;
        
        var bandera=false;
        
        if(nombre.length>0 && contraseña.length>0 && nacimiento.length>0 && correo.length>0 && tipo_user.length>0){
            bandera=true;
        }
        
        if(bandera){
            document.getElementById('formregistro').submit();
        }else{
            alert('Porfavor Ingrese todos los campos');
        }
    });
});


window.addEventListener('load',function (){
    document.getElementById('btniniciar').addEventListener('click', function (){
        var nombre=document.getElementById('txtUsuario').value;
        var contraseña=document.getElementById('txtPassword').value;
        
        var bandera=false;
        
        if(nombre.length>0 && contraseña.length>0){
            bandera=true;
        }
        
        if(bandera){
            document.getElementById('forminiciosesion').submit();
        }else{
            alert('Porfavor Ingrese todos los campos');
        }
    });
});



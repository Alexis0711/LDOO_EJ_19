$(document).ready(function(){
	var altura = $('.menu').offset().top;

	$(window).on('scroll', function() {
		if($(window).scrollTop()>altura){
				$('.menu').addClass('menu-fixed');
		}
		else{
				$('.menu').removeClass('menu-fixed');
		}
	});
});
function mostrarMensaje(){
	alert("Información enviada")
}
function mostrarCancelar() {
	alert("Información cancelada")
}
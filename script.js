$(document).ready(function() {
	$(".content").click(
	
	function() {
		$(".content").addClass(".darker");
		//$(".content").fadeTo("slow", 1);
	}/*,
	
	function() {
		$(".content").removeClass(".darker");
	
	}*/
	
	);
	$(window).scroll(function() { 
	
		if($(window).scrollTop() > 542) { //541
			$(".header").css("top", "74%");
			$(".header").css("position", "absolute");
			$(".header").css("z-index", 0);
			
		} else {
			$(".header").css("top", 0);
			$(".header").css("position", "fixed");
			$(".header").css("z-index", -1);
		}
	
	});

});
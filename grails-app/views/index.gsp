<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="home"/>
		<title>Mameluco Gonzalez</title>
		<r:require modules="bootstrap"/>
	</head>
	<body>

		<div id="fb-root"></div>
		<script>(function(d, s, id) {
		  var js, fjs = d.getElementsByTagName(s)[0];
		  if (d.getElementById(id)) return;
		  js = d.createElement(s); js.id = id;
		  js.src = "//connect.facebook.net/es_LA/all.js#xfbml=1&appId=598299120203004";
		  fjs.parentNode.insertBefore(js, fjs);
		}(document, 'script', 'facebook-jssdk'));</script>

		<div class="container">

			<div class="hero-unit main">
	  			<h1>Mameluco Gonzalez</h1>
	  			<p>Un equipo distinto...</p>
	  			<p></p>
			</div>

			<div class="row" id="features">
			  	<div class="span3 divider">
			    	<div class="featureicon"><i class="icon-user"></i></div>
			        <h3><a href="/equipo">Plantel</a></h3>
			        <p>Conoce en detalle a cada uno de los jugadores.</p>
			    </div>
			    <div class="span3 divider">
			    	<div class="featureicon"><i class="icon-th-large"></i></div>
			    	<h3><a href="/fixture/fecha/1">Fixture</a></h3>
			        <p>Enterate de todos los resultados de la fecha.</p>
			    </div>       
			    <div class="span3 divider">
			    	<div class="featureicon"><i class="icon-th-list"></i></div>
			    	<h3><a href="/posiciones">Tabla</a></h3>
			        <p>Descubrí las posiciones en la tabla general del torneo.</p>
			    </div>
			    <div class="span3 lastdivider">
			    	<div class="featureicon"><i class="icon-pencil"></i></div>
			        <h3><a href="/cronicas">Crónicas</a></h3>
			        <p>No te pierdas la visión de nuestro cronista independiente.</p>
			    </div>
			</div>

			<div class="row-fluid" id="footer">
				<div id="social" class="span6">
					<div class="footericon">
						<a href="https://www.facebook.com/MamelucoGonzalez" target="_blank">
							<img src="images/fb.png">
						</a>
						&nbsp;Seguinos en facebook
					</div>
				</div>
				<div class="fb-like span6" data-href="http://www.mamelucogonzalez.com.ar" data-send="false" data-width="450" data-show-faces="false" id="homelikebutton"></div>
			</div>

		</div>
	</body>
</html>
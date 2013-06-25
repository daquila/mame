<div class="navbar" id="navbar">
	<div class="navbar-inner" style="padding-left:55px;">
		<a class="brand" href="/">Mameluco</a>
		<ul class="nav">
			<!--
			<li <g:if test="${selected==com.mame.constants.Constants.NAV_BAR_NEWS}">class="active"</g:if>>
				<a href="/mame/novedades">Novedades</a>
			</li>
			-->
			<li <g:if test="${selected==com.mame.constants.Constants.NAV_BAR_TEAM}">class="active"</g:if>>
				<a href="/equipo">Plantel</a>
			</li>
			<!--
			<li <g:if test="${selected==com.mame.constants.Constants.NAV_BAR_INSCRIPTION}">class="active"</g:if>>
				<a href="/mame/inscripcion">Inscripción</a>
			</li>
			<li <g:if test="${selected==com.mame.constants.Constants.NAV_BAR_REQUEST}">class="active"</g:if>>
				<a href="/mame/convocatoria">Convocatoria</a>
			</li>
			-->
			<li <g:if test="${selected==com.mame.constants.Constants.NAV_BAR_FIXTURE}">class="active"</g:if>>
				<a href="/fixture/fecha/1">Fixture</a>
			</li>
			<li <g:if test="${selected==com.mame.constants.Constants.NAV_BAR_TABLE}">class="active"</g:if>>
				<a href="/posiciones">Tabla</a>
			</li>
			<li <g:if test="${selected==com.mame.constants.Constants.NAV_BAR_CHRONICS}">class="active"</g:if>>
				<a href="/cronicas">Crónicas</a>
			</li>
			<li <g:if test="${selected==com.mame.constants.Constants.NAV_BAR_GALLERY}">class="active"</g:if>>
				<a href="/fotos">Fotos</a>
			</li>
		</ul>
	</div>
</div>
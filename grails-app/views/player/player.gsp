<html>
	<head>
		<meta name="layout" content="main"/>
		<title>Mameluco Gonzalez - Jugador</title>
		<r:require modules="bootstrap"/>
	</head>
	<body>

		<g:render template="/navBar" model="['selected': com.mame.constants.Constants.NAV_BAR_TEAM]" />

		<form class="form-horizontal">
			<fieldset>
				<legend><strong>${player.alias}</strong> | ${player.lastname}, ${player.name}</legend>

				<blockquote>
					<p>${player.description}</p>
					<br>
					<small>${player.email}</small>
				</blockquote>

				<!--
				<div class="row-fluid">
					<div class="control-group">
						<label class="control-label" for="inputAlias">Alias:</label>
						<div class="controls">
							<input type="text" id="inputAlias" value="${player.alias}" class="input-xlarge" readonly="true">
						</div>
					</div>

					<div class="control-group">
						<label class="control-label" for="inputLastname">Apellido:</label>
						<div class="controls">
							<input type="text" id="inputLastname" value="${player.lastname}" class="input-xlarge" readonly="true">
					</div>

					<div class="control-group">
						<label class="control-label" for="inputName">Nombre:</label>
						<div class="controls">
							<input type="text" id="inputName" value="${player.name}" class="input-xlarge" readonly="true">
						</div>
					</div>

					<div class="control-group">
						<label class="control-label" for="inputEmail">Email:</label>
						<div class="controls">
							<input type="text" id="inputEmail" value="${player.email}" class="input-xlarge" readonly="true">
						</div>
					</div>
				</div>
				<div class="row-fluid">
					<div class="control-group">
						<label class="control-label" for="inputDescription">Descripción:</label>
						<div class="controls">
							<textarea rows="7" class="span10" readonly="true"></textarea>
						</div>
					</div>
				</div>
				<div class="row-fluid">
					<div class="control-group">
						<div class="controls">
							<a href="/mame/equipo" class="btn">Volver</a>
						</div>
					</div>
				</div>

				<br>
				<a href="/mame/equipo" class="btn btn-mini">Volver al plantel</a>
				-->

			</fieldset>
			
		</form>
			
	</body>
</html>
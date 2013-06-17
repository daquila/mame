<html>
	<head>
		<meta name="layout" content="main"/>
		<title>Mameluco Gonzalez - Equipo</title>
		<r:require modules="bootstrap"/>
		<r:require modules="team"/>
	</head>
	<body>
			
		<g:render template="/navBar" model="['selected': com.mame.constants.Constants.NAV_BAR_TEAM]" />

		<br>

		<!--
		<table class="table table-striped">
			<thead>
				<tr>
					<th>Jugador</th>
					<th>Email</th>
				</tr>
			</thead>
			<tbody>
				<g:each var="dto" in="${players}">
				<tr>
					<td>
						<strong>${dto.alias}</strong> | 
						<g:link controller="player" id="${dto.id}">${dto.lastname}, ${dto.name}</g:link>
					 </td>
					<td>${dto.email}</td>
				</tr>
				</g:each>
			</tbody>
		</table>
		-->

		<g:render template="thumbnails" model="['players': players]" />
		
	</body>
</html>
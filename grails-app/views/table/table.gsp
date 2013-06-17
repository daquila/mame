<html>
	<head>
		<meta name="layout" content="main"/>
		<title>Mameluco Gonzalez - Posiciones</title>
		<r:require modules="bootstrap"/>
	</head>
	<body>
			
		<g:render template="/navBar" model="['selected': com.mame.constants.Constants.NAV_BAR_TABLE]" />

		<br>

		<table class="table table-striped">
			<thead>
				<tr>
					<th>#</th>
					<th>Equipo</th>
					<th>PJ</th>
					<th>PG</th>
					<th>PE</th>
					<th>PP</th>
					<th>GF</th>
					<th>GE</th>
					<th>Dif</th>
					<th>Pts</th>
				</tr>
			</thead>
			<tbody>
				<g:each var="dto" in="${table}" status="pos">
				<tr>
					<td>${pos+1}</td>
					<td>${dto.team.name}</td>
					<td>${dto.pj}</td>
					<td>${dto.pg}</td>
					<td>${dto.pe}</td>
					<td>${dto.pp}</td>
					<td>${dto.gf}</td>
					<td>${dto.ge}</td>
					<td>${dto.gf-dto.ge}</td>
					<td><b>${dto.pts}</b></td>
				</tr>
				</g:each>
			</tbody>
		</table>
			
	</body>
</html>
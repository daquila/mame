<html>
	<head>
		<meta name="layout" content="main"/>
		<title>Mameluco Gonzalez - Convocatoria</title>
		<r:require modules="bootstrap"/>
	</head>
	<body>
		<div class="container" style="margin-top: 20px;">
			
			<g:render template="/navBar" model="['selected': com.mame.constants.Constants.NAV_BAR_REQUEST]" />

			<div class="row-fluid">
				<div class="span4">
					<div class="pagination">
						<ul>
							<g:each var="pos" in="${1..8}">
								<li <g:if test="${current==pos}">class="active"</g:if>>
									<g:link controller="fixture" action="matches" id="${pos}">${pos}</g:link>
								</li>
							</g:each>
						</ul>
					</div>
				</div>
			</div>

			<g:if test="${players}">

				<div>
					<table class="table table-striped">
						<thead>
							<tr>
								<th>Equipo</th>
								<th>Asistencia</th>
								<th>Comentario</td>
							</tr>
						</thead>
						<tbody>
							<g:each var="player" in="${players}">
							<tr>
								<td>${player.alias}</td>
								<td></td>
								<td></td>
							</tr>
							</g:each>
						</tbody>
					</table>
				</div>

			</g:if>
			
		</div>
	</body>
</html>
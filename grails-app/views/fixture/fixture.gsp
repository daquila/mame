<html>
	<head>
		<meta name="layout" content="main"/>
		<title>Mameluco Gonzalez - Fixture</title>
		<r:require modules="bootstrap"/>
	</head>
	<body>
			
		<g:render template="/navBar" model="['selected': com.mame.constants.Constants.NAV_BAR_FIXTURE]" />

		<div class="row-fluid">
			<div class="span4">
				<div class="pagination">
					<ul>
						<g:each var="pos" in="${1..8}">
							<li <g:if test="${current==pos}">class="active"</g:if>>
								<g:link controller="fixture" action="fecha" id="${pos}">${pos}</g:link>
							</li>
						</g:each>
					</ul>
				</div>
			</div>
			<!--
			<div class="span4 offset4 pagination" style="text-align:right;">
				<g:link controller="fixture" action="edit" id="${current}" class="btn">Editar</g:link>
			</div>
			-->
		</div>

		<g:if test="${matches}">

			<g:form controller="fixture" action="save" id="${current}" method="post">
				<div>
					<table class="table table-striped">
						<tbody>
							<g:each var="match" in="${matches}">
							<tr>
								<td class="span6">${match.teamOne.name}</td>
								<td class="span1" style="text-align: right;">
									<g:if test="${action=='edit'}">
										<g:field type="text" name="match-${match.id}-one" value="${match.scoreTeamOne}" class="span1"/>
									</g:if>
									<g:else>
										${match.scoreTeamOne!=null?match.scoreTeamOne:'-'}
									</g:else>
								</td>
								<td class="span1" style="text-align: center;">|</td>
								<td class="span1">
									<g:if test="${action=='edit'}">
										<g:field type="text" name="match-${match.id}-two" value="${match.scoreTeamTwo}" class="span1"/>
									</g:if>
									<g:else>
										${match.scoreTeamTwo!=null?match.scoreTeamTwo:'-'}
									</g:else>
								</td>
								<td class="span6" style="text-align: right;">${match.teamTwo.name}</td>
							</tr>
							</g:each>
						</tbody>
					</table>
				</div>

				<g:if test="${action=='edit'}">
					<div class="row-fluid">
						<g:submitButton name="save" value="Guardar" class="btn btn-success" />
						<g:link controller="fixture" action="matches" id="${current}" class="btn">Cancelar</g:link>
					</div>
				</g:if>
			</g:form>

		</g:if>
		<g:else>
		<div>
			No hay fixture para la fecha ${current}
		</div>
		</g:else>

		<g:if test="${match?.chronic}">
			<hr>
			<span class="icon-align-justify"></span>&nbsp;
			<a href="/partido/${match.id}/cronica">Ver la crónica del partido</a>
		</g:if>
			
	</body>
</html>
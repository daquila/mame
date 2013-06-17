<html>
	<head>
		<meta name="layout" content="main"/>
		<title>Mameluco Gonzalez - Crónica</title>
		<r:require modules="bootstrap"/>
	</head>
	<body>

		<g:set var="selected" value="${params.action=='chronic'?com.mame.constants.Constants.NAV_BAR_CHRONICS:com.mame.constants.Constants.NAV_BAR_FIXTURE}"/>

		<g:render template="/navBar" model="['selected': selected]" />

		<fieldset>
			<legend>${match.chronic.title}</legend>
			<br>

			<blockquote>
				<p>${match?.chronic?.description?.encodeAsHTML()?.replaceAll('\n','<br/>\n')}</p>
				<br>
				<small>${match?.chronic?.author?.alias}</small>
				<small>${match?.chronic?.date?.format("dd/MM/yyyy")}</small>
			</blockquote>

		</fieldset>
		
	</body>
</html>
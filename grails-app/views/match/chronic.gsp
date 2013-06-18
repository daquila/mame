<html>
	<head>
		<meta name="layout" content="main"/>
		<title>Mameluco Gonzalez - Crónica</title>
		<r:require modules="bootstrap"/>
	</head>
	<body>

		<g:set var="selected" value="${params.action=='chronic'?com.mame.constants.Constants.NAV_BAR_CHRONICS:com.mame.constants.Constants.NAV_BAR_FIXTURE}"/>

		<g:render template="/navBar" model="['selected': selected]" />

		<mame:chronic chronic="${match.chronic}" />
		
	</body>
</html>
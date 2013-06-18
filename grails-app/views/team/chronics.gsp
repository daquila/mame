<html>
	<head>
		<meta name="layout" content="main"/>
		<title>Mameluco Gonzalez - Crónicas</title>
		<r:require modules="bootstrap"/>
	</head>
	<body>
		<div class="container">

			<g:render template="/navBar" model="['selected': com.mame.constants.Constants.NAV_BAR_CHRONICS]" />
			<br>

			<g:each var="chronic" in="${chronics}" status="pos">
				<mame:chronic chronic="${chronic}" />
			</g:each>
		</div>
	</body>
</html>
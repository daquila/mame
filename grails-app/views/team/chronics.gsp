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
			
			<g:each var="dto" in="${chronics}" status="pos">
				<fieldset>
					<legend>${dto.title}</legend>
					<br>

					<blockquote>
						<p>${dto?.description?.encodeAsHTML()?.replaceAll('\n','<br/>\n')}</p>
						<br>
						<small>${dto?.author?.alias}</small>
						<small>${dto?.date?.format("dd/MM/yyyy")}</small>
					</blockquote>
				</fieldset>
				<br>
			</g:each>
			
		</div>
	</body>
</html>
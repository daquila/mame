<fieldset>
	<legend>${chronic.title}</legend>
	<br>
		<blockquote>
			<g:if test="${!chronic?.picture}">
				<p>${chronic?.description?.encodeAsHTML()?.replaceAll('\n','<br/>\n')}</p>
			</g:if>
			<g:elseif test="${chronic?.position=='right'}">
				<div class="row-fluid">
					<div class="span8">
						<p>${chronic?.description?.encodeAsHTML()?.replaceAll('\n','<br/>\n')}</p>
					</div>
					<div class="span4">
						<img src="/images/gallery/${chronic?.picture}" class="img-polaroid">
					</div>
				</div>
			</g:elseif>
			<g:elseif test="${chronic?.position=='bottom'}">
				<p>${chronic?.description?.encodeAsHTML()?.replaceAll('\n','<br/>\n')}</p>
				<br>
				<center><img src="/images/gallery/${chronic?.picture}" class="img-polaroid"></center>
				<br>
			</g:elseif>
			<br>
			<small>${chronic?.author?.alias}</small>
			<small>${chronic?.date?.format("dd/MM/yyyy")}</small>
		</blockquote>
		<br>
</fieldset>
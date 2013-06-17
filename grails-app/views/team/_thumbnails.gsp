<div class="row" style="margin-left:0px;">  
  <ul class="thumbnails">
    <g:each var="dto" in="${players}">
    
      <li class="span3" id="playerbox">
        <g:link controller="player" id="${dto.id}">
          <div class="thumbnail">
            <div class="caption">
              <h4>${dto.alias}</h4>
              <p>${dto.lastname}, ${dto.name}</p>
              <p></p>
            </div>
          </div>
        </g:link>
      </li>

    </g:each>
  </ul>
</div>
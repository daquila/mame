<div class="row" style="margin-left:0px;">  
  <div id="gallery">
    <ul class="thumbnails" id="tiles">
      <g:each var="dto" in="${players}">
      
        <li class="span3" id="playerbox">
          <!--<g:link controller="player" id="${dto.id}">-->
            <div class="thumbnail">
              <div class="caption">
                <p><strong style="font-size:17px;">${dto.alias}</strong> - ${dto.lastname}, ${dto.name}</p>
                <hr>
                <p>${dto.description}</p>
              </div>
            </div>
          <!--</g:link>-->
        </li>

      </g:each>
    </ul>
  </div>
</div>
<br>

<script type="text/javascript">
  (function ($){
      $('#tiles').imagesLoaded(function() {
          var options = {
              autoResize: true, // This will auto-update the layout when the browser window is resized.
              container: $('#gallery'), // Optional, used for some extra CSS styling
              offset: 10, // Optional, the distance between grid items
              itemWidth: 280 // Optional, the width of a grid item
          };
          var handler = $('#tiles li');
          handler.wookmark(options);
      });
  })(jQuery);
</script>
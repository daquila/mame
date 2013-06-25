<html>
    <head>
        <meta name="layout" content="main"/>
        <title>Mameluco Gonzalez - Gallería de fotos</title>
        <r:require modules="bootstrap"/>
        <r:require modules="gallery"/>
    </head>
    <body>
            
        <g:render template="/navBar" model="['selected': com.mame.constants.Constants.NAV_BAR_GALLERY]" />

        <br>

        <div id="gallery">
            <ul id="tiles" class="thumbnails">
                <g:each var="index" in="${1..12}">
                    <li>
                        <img src="/images/gallery/img_${index}.jpg" height="250" width="380"/>
                    </li>
                </g:each>
            </ul>
        </div>
        <br><br>

        <script type="text/javascript">
            (function ($){
                $('#tiles').imagesLoaded(function() {
            
                    // Prepare layout options.
                    var options = {
                        autoResize: true, // This will auto-update the layout when the browser window is resized.
                        container: $('#gallery'), // Optional, used for some extra CSS styling
                        offset: 10, // Optional, the distance between grid items
                        itemWidth: 380 // Optional, the width of a grid item
                    };

                    // Get a reference to your grid items.
                    var handler = $('#tiles li');

                    // Call the layout function.
                    handler.wookmark(options);

                    /*
                    // Capture clicks on grid items.
                    handler.click(function(){
                        // Randomize the height of the clicked item.
                        var newHeight = $('img', this).height() + Math.round(Math.random()*300+30);
                        $(this).css('height', newHeight+'px');
                        // Update the layout.
                        handler.wookmark();
                    });
                    */
                });

    

            })(jQuery);

            $('.thumbnail').click(function(e) {
                $("#mdlPic").attr('src', $(this.getElementsByTagName('img')[0]).attr('src'));
                $('#pictureModal').modal({show:true,keyboard:true});
            });

        </script>
        
            
    </body>
</html>
modules = {
    application {
        resource url:'js/application.js'
        
    }

    mame {
    	resource url:'css/mame.css', disposition: 'head'
    }

    team {
    	resource url:'css/team.css', disposition: 'head'
        resource url:'js/wookmark.min.js', disposition: 'head'
        resource url:'js/jquery.imagesloaded.js', disposition: 'head'
    }

    home {
    	resource url:'css/home.css', disposition: 'head'
    }

    gallery {
        resource url:'js/wookmark.min.js', disposition: 'head'
        resource url:'js/jquery.imagesloaded.js', disposition: 'head'
    }
}
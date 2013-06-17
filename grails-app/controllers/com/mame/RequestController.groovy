package com.mame

import com.mame.Player

class RequestController {

    def index() { 
    	render(view: "request", model: [players: Player.list()])
    }
}

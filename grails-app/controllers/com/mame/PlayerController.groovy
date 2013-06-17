package com.mame

class PlayerController {

    def index() { 
    	if (params.id) {
    		render(view: "player", model:[player: Player.findById(params.id)])
		}
    }
}

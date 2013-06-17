package com.mame

class TeamController {

    def index() { 
    	render(view: "team", model:[players: Player.list()?.sort{it.alias}])
    }

    def chronics() {
    	render(view: "chronics", model:[chronics: Chronic.list()])
    }

}

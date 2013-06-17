package com.mame

import com.mame.Tournament
import com.mame.dto.TeamTableDto

class TableController {

    def commonService

    def index() { 
    	Tournament tournament = Tournament.findByName("Sokol")
    	if (tournament){
	    	def table = commonService.getTable(tournament)
	    	render(view: "table", model: [table: table])
	    }
    }
}

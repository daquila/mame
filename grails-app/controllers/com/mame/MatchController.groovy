package com.mame

class MatchController {

    def matchChronic() { 
    	if (params.id){
    		Match match = Match.findById(params.id)
    		render(view:"chronic", model:[match: match])
    	}

    }

	def chronic() { 
    	if (params.id){
    		Chronic chronic = Chronic.findById(params.id)
    		render(view:"chronic", model:[match: chronic.match])
    	}

    }

}

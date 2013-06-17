package com.mame

import com.mame.Tournament

class FixtureController {

    def index() {
    	Tournament tournament = Tournament.findByName("Sokol")
	    if (tournament) {
    		def matches = tournament.fixture.find{it.index == 1}?.matches?.sort{it.id}
	    	render(view: "fixture", model: [matches: matches, current: 1])
    	}
    }

    def matches() {

    	if (params.id){
	    	Tournament tournament = Tournament.findByName("Sokol")
	    	if (tournament) {
	    		def matches = tournament.fixture.find{it.index == params.int('id')}?.matches?.sort{it.id}
	    		Team mame = Team.findByName("Mameluco Gonzalez")
	    		def match = matches.find{it.teamOne==mame || it.teamTwo==mame}
	    		render(view: "fixture", model: [matches: matches, current: params.int('id'), match: match])
	    	}
	    }

    }

    def edit() {
    	if (params.id){
	    	Tournament tournament = Tournament.findByName("Sokol")
	    	if (tournament) {
	    		def matches = tournament.fixture.find{it.index == params.int('id')}?.matches?.sort{it.id}
	    		render(view: "fixture", model: [matches: matches, current: params.int('id'), action: 'edit'])
	    	}
	    }
    }

    def save() {
    	if (params.id){
	    	Tournament tournament = Tournament.findByName("Sokol")
	    	if (tournament) {
	    		def matches = tournament.fixture.find{it.index == params.int('id')}?.matches?.sort{it.id}
	    		matches.each{ match ->
	    			match.scoreTeamOne = params.int("match-${match.id}-one".toString())
	    			match.scoreTeamTwo = params.int("match-${match.id}-two".toString())
	    			match.save()
	    		}
	    		render(view: "fixture", model: [matches: matches, current: params.int('id'), action: null])
	    	}
	    }
    }

}

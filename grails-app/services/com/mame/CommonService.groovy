package com.mame

import com.mame.Tournament
import com.mame.dto.TeamTableDto

class CommonService {

    def getTable(Tournament tournament) {

    	def table = []

    	tournament.teams.each{ team ->
    		table.add(new TeamTableDto(team: team))
    	}
    	
    	tournament.fixture?.each{ fixture ->
    		fixture?.matches?.each{ match ->

                if (match.scoreTeamOne!=null && match.scoreTeamTwo!=null){
    			
        			def teamOneDto = table.find{it.team.name==match.teamOne.name}
        			teamOneDto.pj++
        			teamOneDto.gf = teamOneDto.gf + match.scoreTeamOne 
        			teamOneDto.ge = teamOneDto.ge + match.scoreTeamTwo 
        			
        			def teamTwoDto = table.find{it.team.name==match.teamTwo.name}
        			teamTwoDto.pj++
        			teamTwoDto.gf = teamTwoDto.gf + match.scoreTeamTwo 
        			teamTwoDto.ge = teamTwoDto.ge + match.scoreTeamOne 


        			if (match.scoreTeamOne == match.scoreTeamTwo) {
        				teamOneDto.pts++
        				teamTwoDto.pts++
        				teamOneDto.pe++
                        teamTwoDto.pe++
        			}else if (match.scoreTeamOne > match.scoreTeamTwo) {
        				teamOneDto.pts = teamOneDto.pts + 3
        				teamOneDto.pg++
        				teamTwoDto.pp++
        			}else{
        				teamTwoDto.pts = teamTwoDto.pts + 3
        				teamTwoDto.pg++
        				teamOneDto.pp++
        			}
                }
    			
    		}
    	}

    	return table.sort{[-it.pts, -(it.gf-it.ge)]}

    }

}

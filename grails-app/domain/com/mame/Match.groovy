package com.mame

class Match {

	Team teamOne
	Team teamTwo
	Integer scoreTeamOne
	Integer scoreTeamTwo
	Date date

	static hasOne = [chronic: Chronic]

    static constraints = {
    	scoreTeamTwo(nullable:true)
    	scoreTeamOne(nullable:true)
    	chronic(nullable:true)
    	date(nullable:true)
    }
    
}

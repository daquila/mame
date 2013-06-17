package com.mame

class Tournament {

	String name

	static hasMany = [fixture: Fixture, teams: Team]

    static constraints = {
    }

}

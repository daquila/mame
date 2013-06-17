package com.mame

class Team {

	String name

	static hasMany = [players: Player]

    static constraints = {
    }
}

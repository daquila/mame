package com.mame

class Player {

	String name
	String lastname
	String alias
	String email
	String description

    static constraints = {
    	description (nullable:true, maxSize: 5000)
    }
}

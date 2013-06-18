package com.mame

class Chronic {

	Date date
	Player author
	String description
	String title
	Match match
	String picture
	String position

    static constraints = {
    	description(maxSize:25000)
    	picture(nullable:true)
    	position(nullable:true)
    }
}

package com.mame

class Chronic {

	Date date
	Player author
	String description
	String title
	Match match

    static constraints = {
    	description(maxSize:25000)
    }
}

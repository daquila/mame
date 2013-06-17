package com.mame

class CommonTagLib {

	static namespace = "mame"

	def gatrackpage = { attrs, body ->
		out << render(template: "/analytics/gatrack")
	}

}

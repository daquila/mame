package com.mame

class CommonTagLib {

	static namespace = "mame"

	def gatrackpage = { attrs, body ->
		out << render(template: "/analytics/gatrack")
	}

	def chronic = { attrs, body ->
		out << render(template: "/match/chronic", model:[chronic: attrs.chronic])
	}

}

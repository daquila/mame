class UrlMappings {

	static mappings = {
		"/$controller/$action?/$id?"{
			constraints {
				// apply constraints here
			}
		}
		"/novedades"(controller: "news", action:"index")
		"/equipo"(controller: "team", action:"index")
		"/inscripcion"(controller: "inscription", action:"index")
		"/convocatoria"(controller: "request", action:"index")
		"/fixture"(controller: "fixture", action:"index")
		"/fixture/fecha/$id"(controller: "fixture", action:"matches")
		"/posiciones"(controller: "table", action:"index")
		"/jugador/$id"(controller: "player", action:"index")
		"/partido/$id/cronica"(controller: "match", action:"matchChronic")
		"/cronicas"(controller: "team", action:"chronics")
		"/cronicas/$id"(controller: "match", action:"chronic")
		"/fotos"(controller: "team", action:"gallery")

		"/"(view:"/index")
		"500"(view:'/error')
	}
}

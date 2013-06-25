import com.mame.Player
import com.mame.Team
import com.mame.Tournament
import com.mame.Fixture
import com.mame.Match
import com.mame.Chronic

class BootStrap {

    def init = { servletContext ->

        Calendar cal

    	Player p1 = new Player(
                name:"Andres", 
                lastname:"Boselli", 
                alias:"Sanchez chiño", 
                email:"andres_boselli@hotmail.com",
            ).save(flush:true)
    	Player p2 = new Player(
                name:"Jose", 
                lastname:"DAquila", 
                alias:"Peska", 
                email:"jose.daquila@gmail.com"
            ).save(flush:true)
    	Player p3 = new Player(
                name:"Guillermo", 
                lastname:"Bolo Bolaño", 
                alias:"Koinhor", 
                email:"guillebolo@hotmail.com"
            ).save(flush:true)
        Player p4 = new Player(
                name:"Agustin", 
                lastname:"Cesio", 
                alias:"Goyco", 
                email:"agustincesio@gmail.com"
            ).save(flush:true)
        Player p5 = new Player(
                name:"Francisco", 
                lastname:"Torino", 
                alias:"Mago", 
                email:"torinofrancisco@hotmail.com"
            ).save(flush:true)
        Player p6 = new Player(
                name:"Alvaro", 
                lastname:"Gaona", 
                alias:"Alvarito", 
                email:"agaona23@yahoo.com.ar"
            ).save(flush:true)
        Player p7 = new Player(
                name:"Maurizio", 
                lastname:"Pastine", 
                alias:"Mauri", 
                email:"mjp_arg@hotmail.com"
            ).save(flush:true)
        Player p8 = new Player(
                name:"Ignacio", 
                lastname:"Caputo", 
                alias:"Nacho", 
                email:"nachocap@hotmail.com"
            ).save(flush:true)
        Player p9 = new Player(
                name:"Nicolas", 
                lastname:"Torino", 
                alias:"Nico", 
                email:"agrobusiness@unitedbrokers.com.ar"
            ).save(flush:true)
        Player p10 = new Player(
                name:"Fernando", 
                lastname:"Almeida", 
                alias:"Fer", 
                email:"fernandoal31@hotmail.com"
            ).save(flush:true)
        Player p11 = new Player(
                name:"Maximo", 
                lastname:"Miguens", 
                alias:"Chimi", 
                email:"maximomiguens@gmail.com"
            ).save(flush:true)
        Player p12 = new Player(
                name:"Alejo", 
                lastname:"Blasco", 
                alias:"Alejo", 
                email:"alejoblasco@hotmail.com"
            ).save(flush:true)
        Player p13 = new Player(
                name:"Eduardo", 
                lastname:"Malbran", 
                alias:"Machi", 
                email:"emmalbran@gmail.com"
            ).save(flush:true)
        Player p14 = new Player(
                name:"Lucio", 
                lastname:"Fernandez Madero", 
                alias:"Burbu", 
                email:"lfernandezmadero@hotmail.com"
            ).save(flush:true)
        Player p15 = new Player(
                name:"Diego", 
                lastname:"Bolo Bolaño", 
                alias:"Majestuoso", 
                email:"lacuencadelpetardo@hotmail.com"
            ).save(flush:true)

    	Team mamelucoGonzales = new Team(name:"Mameluco Gonzalez", players:[p1,p2,p3,p4,p5,p6,p7,p8,p9,p10,p11,p12,p13,p14,p15]).save(flush:true)
    	Team pasaGustavo = new Team(name:"Pasa Gustavo").save(flush:true)
    	Team bernabeu = new Team(name:"Bernabeu FC").save(flush:true)
    	Team pacheco = new Team(name:"Pacheco FC").save(flush:true)
    	Team astonBirra = new Team(name:"Aston Birra").save(flush:true)
    	Team mataJuniors = new Team(name:"Mata Juniors").save(flush:true)
    	Team cirujas = new Team(name:"Cirujas").save(flush:true)
    	Team flowerPower = new Team(name:"Flower Power").save(flush:true)

    	Match f1m1 = new Match(teamOne:mamelucoGonzales, scoreTeamOne:4, teamTwo:cirujas, scoreTeamTwo:1).save(flush:true)
    	Match f1m2 = new Match(teamOne:pasaGustavo, scoreTeamOne:4, teamTwo:astonBirra, scoreTeamTwo:0).save(flush:true)
    	Match f1m3 = new Match(teamOne:flowerPower, scoreTeamOne:2, teamTwo:pacheco, scoreTeamTwo:3).save(flush:true)
    	Match f1m4 = new Match(teamOne:mataJuniors, scoreTeamOne:2, teamTwo:bernabeu, scoreTeamTwo:0).save(flush:true)
    	Fixture f1 = new Fixture(index:1, matches:[f1m1, f1m2, f1m3, f1m4]).save(flush:true)

        cal = Calendar.getInstance()
        cal.set(Calendar.DAY_OF_MONTH, 13)
        cal.set(Calendar.MONTH, 4)
        cal.set(Calendar.YEAR, 2013)
        Chronic f1Chronic = new Chronic(
                description: "Este cronista independiente estuvo con su mirada sagaz y atenta sobre los valijeros Sanchez Chiño, el Majestuoso y Agustín Cesio pero hoy voy por el pez gordo, más que pez gordo, ballena o monstruo del lago. Si, hablo de GUILLE BOLO BOLAÑO. NO TE TENGO MIEDO, ni aunq me corras con penales inventados o te adjudiques goles al Goyco q sabemos que los hacía hasta Machi. \n\n Semana tras semana llegan a la casa de Guille jugadores de mameluco con bolsos. Si, escuchaste bien: BOLSOS QUE SE PUEDEN PESAR. La excusa: Guille los lleva a la cancha y en esos bolsos habría \"botines y remeras de mameluco\". Ahora somos todos boludos! A mi no me jodan!! esos bolsos van cargados de EUROS!!!de \n\n Guille tiene casa nueva, que más q una cueva financiera es una gruta, las dimensiones bien no las se pero pongamos que tiene mas de 40 metros cuadrados (seguro mucho más), ponele que el techo tiene 3 metros de altura. Vos te das una idea de la cantidad de billetes de 500 EUROS q se pueden guardar en esa casa? Ponele un 9 adelante y los ceros de atrás no entrarían en este mail. Digamos, con esa plata se podría cancelar la deuda de todos los países de latinoamérica, la de Grecia y transformar la economía de los países del Africa subsahariana en Suiza. El Banco mundial estaría imprimiendo más euros para saciar la sed corruptiva de este muchacho. \n\n Esto no es nada. La acumulación de Euros sería con fines afrodisíacos. SI, a guille le calienta hacerse masajes con euros. Para q te hagas una idea, 10 billetes de 500 euros frotados sobre la frente de Guille, sería como que vos te tomes 20 pastillas de viagra para pasar un fin de semana con Luciana Salazar, Pampita y la niña Loly. \n\n GUILLE NO TIENE LÍMITES. Guille quiere borrar del equipo a los q se ausentan por compromisos políticos; a los que se clavaron un par de ginebras la noche anterior y por la resaca no pueden despegarse de la almohada; o a los que tienen malos rendimientos, que se entienda, VA POR TODOS. La ecuación es clara muchachos, es GUILLE O VOS. Es hora de que VOS hagas algo. \n\n Carta abierta de la cronica independiente. \n\n PD: Ganamos 4-1 con hat-trick de Guille, algo bueno tiene que aportar el muchacho.",
                date: cal.getTime(),
                author: p1,
                match: f1m1,
                title: "El fin del relato"
            ).save(flush:true)

        Match f2m1 = new Match(teamOne:mamelucoGonzales, scoreTeamOne:5, teamTwo:mataJuniors, scoreTeamTwo:2).save(flush:true)
        Match f2m2 = new Match(teamOne:bernabeu, scoreTeamOne:0, teamTwo:pacheco, scoreTeamTwo:2).save(flush:true)
        Match f2m3 = new Match(teamOne:flowerPower, scoreTeamOne:2, teamTwo:astonBirra, scoreTeamTwo:3).save(flush:true)
        Match f2m4 = new Match(teamOne:cirujas, scoreTeamOne:3, teamTwo:pasaGustavo, scoreTeamTwo:3).save(flush:true)
        Fixture f2 = new Fixture(index:2, matches:[f2m1, f2m2, f2m3, f2m4]).save(flush:true)

        cal = Calendar.getInstance()
        cal.set(Calendar.DAY_OF_MONTH, 23)
        cal.set(Calendar.MONTH, 4)
        cal.set(Calendar.YEAR, 2013)
        Chronic f2Chronic = new Chronic(
                description: "¿Como llego este petiso ignoto a ser el mayor referente en la historia de Mameluco Gonzalez?\nEntro en la historia de Mame bajo el ala de Blas Grondonaño, se lo recuerda como un chiquitin tímido q nunca metía la patita para marcar (por lo menos se mantiene fiel a sus principios). Se fue haciendo lugar entre varios popes hasta desbancar a varios referentes de Mame (incluído Blas Grondonaño)  para armar su propio equipo.\n\n ¿Como jugaba?\n Según sus palabras habría sido una mezcla del burrito Ortega con Cristiano Ronaldo. Los que lo vieron jugar afirman que era una cruza entre un flojo Keko Villalba y el uruguayo Canales, y que en sus tardes inspiradas definía como Funes Mori.\n\nPero ¿como es que amaso su fortuna y fue acumulando poder junto a su fiel ladero \"el mago sin piernas\"? \n Cuando me entere que la diGtadura había decidido mover el partido para el domingo, sabiendo es que mi momento de inspiración para las cronicas, note el temor dirigencial porque mis mails estan causando revuelo (ya me entere que Lilita llevo varios a la justicia). Ahí fue cuando me decidí a hablar de lo que VOS estas esperando: LA RUTA DEL DINERO G.",
                date: cal.getTime(),
                author: p1,
                match: f2m1,
                title: "La ruta del dinero G"
            ).save(flush:true)


        Match f3m1 = new Match(teamOne:mamelucoGonzales, scoreTeamOne:1, teamTwo:pacheco, scoreTeamTwo:1).save(flush:true)
        Match f3m2 = new Match(teamOne:flowerPower, scoreTeamOne:1, teamTwo:pasaGustavo, scoreTeamTwo:5).save(flush:true)
        Match f3m3 = new Match(teamOne:astonBirra, scoreTeamOne:2, teamTwo:bernabeu, scoreTeamTwo:0).save(flush:true)
        Match f3m4 = new Match(teamOne:cirujas, scoreTeamOne:null, teamTwo:mataJuniors, scoreTeamTwo:null).save(flush:true)
        Fixture f3 = new Fixture(index:3, matches:[f3m1, f3m2, f3m3, f3m4]).save(flush:true)

        cal = Calendar.getInstance()
        cal.set(Calendar.DAY_OF_MONTH, 27)
        cal.set(Calendar.MONTH, 4)
        cal.set(Calendar.YEAR, 2013)
        Chronic f3Chronic = new Chronic(
                description: "Es una noche de neblina crispada en el Rosedal. Veo como la nube de humo de mi cigarro se disipa en la intemperie. Estoy esperando a Leo Cesio, testigo clave en la investigación de la ruta del dinero G. Este excentrico millonario, personaje mediático conocido sobre todo por su famosa relación con la reconocida artista del maipo: Zulma Lobato. Me pide gentilmente que nos encontremos en el rosedal porque es una zona que frecuenta asiduamente. Lo espero mientras un par de transformistas me dicen \"Ay cariño, te quieres divertir esta noche?\". Yo hago un leve gesto de negación mientras veo aparecer a Leo Cesio en una esquina con su rodete habitual. Cuando se me acerca hasta chocar con el humo de mi cigarrillo enciendo la cámara oculta. \n\n Leo Cesio: Ante todo quiero declarar que yo a Zulma la amo... \n Cronista independiente: ... Yo vengo a hablar de otra cosa... de su relación con Lazaro Torino, conocido también como \"el mago sin piernas\"... \n LC: Yo con el no tengo más trato, yo me siento totalmente afectado y traicionado por Lazaro… yo pase a ser un fusible de ellos… La primera vez que me encuentro con vos, yo recíbi una llamada amenazante… me dijeron que Van Lauchen se iba a quedar con mi puesto… \n CI: Aja… \nLC: Yo me mude al centro para estar más cerca de tigre center, es la verdad. La guita de los partidos la llevaba a Belice Jose “tiramisú” deaguila… El boludo abrió la sociedad en Panama… Yo soy prolijo… No podes tener cinco mil kilos de locro no declarados y meterlos en mameluco que no lo va a ver ni Goyo Almeida… \n CI: Vos me decis que el tipo simpático, que siempre invita a comidas en su casa, Jose “tiramisú” del águila era el nexo en Panama? El cuñado de Sanchez Chiño y marido de Ileana Boselli, que siempre llevaba el tiramisú al programa de Marcelo Nico Torinelli? \n LC: Todas las cosas que saltaron son de estos desprolijos de ahora… Averigua con Majestuoleaskar… \n CI: Vos manejaste guita de Blas Bolaño? \n LC: No, yo maneje guita de el “mago sin piernas” que era de la EL en realidad… Yo con Blas nunca trate… \n CI: Y con Guille tratabas? Como era? \n LC: De primera… de primera B, nunca hizo un gol importante… Yo planteaba soluciones y El mago me decía si o no… Nunca tuve nada blanco con “el mago sin piernas”… La financiera “la amarillita” (como la ex remera de Mame) es la cueva del establishment G… \n\n Me voy por esta calle solitaria con muchos pensamientos en mi cabeza, con esta investigación que recién comienza y solo pienso en dos cosas “Mame empato 1-1 con Pacheco y el Mago sin piernas es EL. EL es Guille… (adjunto una imagen de la camara oculta)",
                date: cal.getTime(),
                author: p1,
                match: f3m1,
                title: "La ruta del dinero G (2da parte)",
                picture: "img_10.jpg",
                position: "bottom"
            ).save(flush:true)


        Match f4m1 = new Match(teamOne:mamelucoGonzales, scoreTeamOne:3, teamTwo:pasaGustavo, scoreTeamTwo:2).save(flush:true)
        Match f4m2 = new Match(teamOne:bernabeu, scoreTeamOne:0, teamTwo:cirujas, scoreTeamTwo:2).save(flush:true)
        Match f4m3 = new Match(teamOne:astonBirra, scoreTeamOne:0, teamTwo:pacheco, scoreTeamTwo:0).save(flush:true)
        Match f4m4 = new Match(teamOne:mataJuniors, scoreTeamOne:2, teamTwo:flowerPower, scoreTeamTwo:1).save(flush:true)
        Fixture f4 = new Fixture(index:4, matches:[f4m1, f4m2, f4m3, f4m4]).save(flush:true)
        
        cal = Calendar.getInstance()
        cal.set(Calendar.DAY_OF_MONTH, 6)
        cal.set(Calendar.MONTH, 5)
        cal.set(Calendar.YEAR, 2013)
        Chronic f4Chronic = new Chronic(
                description: "Antes una aclaración: Me hackearon el google-chat, NO PUEDO MANDAR EMOTICONES. Si, escuchaste bien. Guille me quiere hacer desaparecer. Yo les pido que si esto llega a pasar, por favor, HAGAN ALGO. Ahora si, va el informe. \n\n El sol abrasador arrasaba con su irradiación mi piel blanca y sensible pero nada podía detenerme en mi afan de investigador independiente, más aún después de que Leo Cesio se arrepintiera de sus denuncias en el programa de Lucio Ventura, diciendo \"el cronista quería ficción, yo le di ficción\". Si es por ficción prefiero las de Natalia Oreiro. \n\n Me encontraba frente al ascensor q me iba llevar directo hasta \"la amarillita\" para hablar con un testigo clave: Majestuolaskar. El mismo se encontraba fumando un habano en la gruta financiera, cómodamente repantigando sobre un sillón de marfil con diamantes esmerilados incrustados, bordeados por finos cordones de oro. Lucía inquieto como si hubiese recibido amenazas. \n\n Cronista independiente: Leo Cesio llegaba a tu oficina con mucha plata? \n Majestuolaskar: Llegaba con bolsos y bolsos, con los guantes llenos de euros, algunas ex paquitas de xuxa y alfajarores guaymallen, cantando \"como me gusta la noche…\" \n C.I: Y de quien era la guita? \n M: La guita era del mago sin piernas. Te digo más, compraron el pase de Sanchez Chiño en 20 millones de euros. Todo el que lo vio jugar sabe q ese pase no puede valer más que un puñado de caramelos media hora. Ahora, donde fue a parar ese guita? Factura trucha, papá... \n C.I: Vos podes confirmar la ruta del dinero... \n M: La guita se la llevaba en bolsos, desde lo de Guille, Leo Cesio. Venía para acá a \"la amarillita\" y se triangulaba a Belice por Jose \"tiramisú\" del Aguila... Eso fue hasta q lo borraron a Leo y apareció en escena Alvaro Gaona Perez Garquin... \n C.I: Se rumorea tiene terrenos en uruguay... \n M: Terrenos? Es dueño de medio uruguay! Allá sus transfugueadas son más conocidas que el mate y Artigas. Artigas \n C.I: Podes confirmar quien es el cabecilla de todo esta operación. \n M: Es EL. \n C.I: EL es Guille. \n\n Me asiente silencioso con un gesto en la cabeza. Ya tengo la información necesaria recabada, ahora que Lilita Carrio lo lleve a la justicia.",
                date: cal.getTime(),
                author: p1,
                match: f4m1,
                title: "La ruta del dinero G (3ra parte)"
            ).save(flush:true)

        Match f5m1 = new Match(teamOne:mamelucoGonzales, scoreTeamOne:7, teamTwo:astonBirra, scoreTeamTwo:1).save(flush:true)
        Match f5m2 = new Match(teamOne:pacheco, scoreTeamOne:4, teamTwo:cirujas, scoreTeamTwo:6).save(flush:true)
        Match f5m3 = new Match(teamOne:mataJuniors, scoreTeamOne:1, teamTwo:pasaGustavo, scoreTeamTwo:1).save(flush:true)
        Match f5m4 = new Match(teamOne:flowerPower, scoreTeamOne:2, teamTwo:bernabeu, scoreTeamTwo:0).save(flush:true)
        Fixture f5 = new Fixture(index:5, matches:[f5m1, f5m2, f5m3, f5m4]).save(flush:true)
        
        cal = Calendar.getInstance()
        cal.set(Calendar.DAY_OF_MONTH, 11)
        cal.set(Calendar.MONTH, 5)
        cal.set(Calendar.YEAR, 2013)
        Chronic f5Chronic = new Chronic(
                description: "LA AFIP ALLANA LA CASA DEL CRONISTA INDEPENDIENTE \n\n En la propiedad se encontraron banderas, remeras y vinchas de Gloriosos. Además de polémicas fotos con buñuelito y el arbitro que siempre nos dirige. \n\n Entre el material confiscado se cuenta: Un video con goles de Machi jugando de 9. Lo quería promocionar para ese puesto. \n\n La pasión secreta del mago por Osvaldo Laport, en especial en el papel de Catriel, debe ser por la caballera abultada que lucía. \n\n Un video en que se lo ve a Guille perdiendo en la play contra su mujer. El jugando con el Barsa y ella con el Celtic de escocia. \n\n Fotos de Fer viendo a Temperley con la barra, en el mismo horario en que decía estar cuidando a Goyo. \n\n Las vacaciones de Burbu en Chivilcoy mientras decía estar lesionado. \n\n Lo más polémico de todo: fotos de una orgía en que estaría involucrado el plantel completo de Mameluco Gonzalez. En esta participarían también: la enana Noelia, el mini de duro de domar, Guido y Tomasito Suller, el dinosaurio Bernardo, la hermana melliza de Mirtha Legrand y algunos ex integrantes de titanes en el ring. \n\n Estamos salvados!!! Adjunto parte del material encontrado.",
                date: cal.getTime(),
                author: p1,
                match: f5m1,
                title: "Ultimo momento",
                picture: "img_12.jpg",
                position: "right"
            ).save(flush:true)

        Match f6m1 = new Match(teamOne:mamelucoGonzales, scoreTeamOne:2, teamTwo:flowerPower, scoreTeamTwo:0).save(flush:true)
        Match f6m2 = new Match(teamOne:astonBirra, scoreTeamOne:3, teamTwo:cirujas, scoreTeamTwo:4).save(flush:true)
        Match f6m3 = new Match(teamOne:mataJuniors, scoreTeamOne:6, teamTwo:pacheco, scoreTeamTwo:0).save(flush:true)
        Match f6m4 = new Match(teamOne:pasaGustavo, scoreTeamOne:2, teamTwo:bernabeu, scoreTeamTwo:0).save(flush:true)
        Fixture f6 = new Fixture(index:6, matches:[f6m1, f6m2, f6m3, f6m4]).save(flush:true)

        Match f7m1 = new Match(teamOne:mamelucoGonzales, scoreTeamOne:2, teamTwo:bernabeu, scoreTeamTwo:0).save(flush:true)
        Fixture f7 = new Fixture(index:7, matches:[f7m1]).save(flush:true)

    	Tournament sokol = new Tournament(
			name:"Sokol", 
			teams:[mamelucoGonzales, pasaGustavo, bernabeu, pacheco, astonBirra, mataJuniors, cirujas, flowerPower],
			fixture:[f1,f2,f3,f4,f5,f6,f7]
		).save(flush:true)

    }

    def destroy = {
    }

}

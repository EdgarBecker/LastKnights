import java.lang.Exception

fun gegnerlist(diablo: Diablo, rowenaDieHexe: RowenaDieHexe):MutableList<Person>{
    var gegnerliste= mutableListOf<Person>(rowenaDieHexe,diablo)

    for (gegner in gegnerliste){
        if (gegner.hp <=0)
            gegnerliste.remove(gegner)
    }
    return gegnerliste
}
fun heldenlist(heracles: Heracles,karDerGrosse: KarDerGrosse,conan: Conan):MutableList<Person>{
    var heldenliste= mutableListOf<Person>(heracles,karDerGrosse,conan)

    for (helden in heldenliste){
        if (helden.hp <=0)
            heldenliste.remove(helden)
    }
    return heldenliste
}

fun zufallsAngriff(alle: MutableList<Person>):Person{
    var auswahlgegner = alle.random()
    return auswahlgegner

}
fun angriffwaehlenConan(conan: Conan,gegner : Person){

    do {
        var richtigeEingabe = false

    println("wähle einer deiner Fähigkeiten\n" +
            "1. Der Hieb \n" +
            "2. Axt der Uhrahnen\n" +
            "3. Spalten\n" +
            "4. Seismisches Schmettern\n" +
            "5. heiltrank \n" +
            "6. vitamine")

    try {

        var eingabe = readln().toInt()
        when (eingabe){
            1 -> {
                conan.derHieb(gegner)

                println()
            }
            2 -> {

                conan.axtDerUhrahnen(gegner)
            }
            3 -> {

                conan.spalten(gegner)
            }
            4 -> {

                conan.seismischesSchmettern(gegner)

            }
            5 -> {
              if  (!beutel.heiltrank(conan)) {
                  richtigeEingabe = true
                  println("Heiltränke aufgebraucht")
              }
            }
            6 -> {
            if    (!beutel.vitamine(conan)){
            richtigeEingabe= true

            }
            }
        }
    }
    catch (e: Exception) {
        println("Ungülitige Eingabe")
        //richtigeEingabe= true
        var eingabe = readln().toInt()
        when (eingabe)
        {
            1 -> {
            conan.derHieb(gegner)

            println()
        }
            2 -> {

                conan.axtDerUhrahnen(gegner)
            }
            3 -> {

                conan.spalten(gegner)
            }
            4 -> {

                conan.seismischesSchmettern(gegner)

            }
            5 -> {
                beutel.heiltrank(conan)

            }
            6 -> {
                println("Vitamine aufgebraucht.")
                beutel.vitamine(conan)
            }
        }
    }
}
        while (richtigeEingabe)
}
fun angriffwaehlenHeracles(heracles: Heracles,gegner : Person) {

    do {
        var richtigeEingabe = false
        println(
            "wähle einer deiner Fähigkeiten\n" +
                    "1. Blitzschlag \n" +
                    "2. Göttlicher Schlag\n" +
                    "3. Kriegsschrei\n" +
                    "4. Zeus Zorn \n" +
                    "5. heiltrank \n" +
                    "6. vitamine"
        )
        try {
            var eingabe = readln().toInt()
            when (eingabe) {
                1 -> {
                    heracles.blitzschlag(gegner)
                }

                2 -> {

                    heracles.goettlicherSchlag(gegner)
                }

                3 -> {

                    heracles.kriegsschrei(gegner)
                }

                4 -> {

                    heracles.zeusZorn(gegner)
                }

                5 -> {
                   if (!beutel.heiltrank(heracles)){
                    richtigeEingabe = true
                    println("Heiltränke aufgebraucht")
                }}

                6 -> {
                   if (!beutel.vitamine(heracles)){
                       richtigeEingabe= true
                       println("vitamine aufgebraucht.")
                   }

                }
            }
        } catch (e: Exception) {
            println("Ungülitige Eingabe")
            var eingabe = readln().toInt()
            when (eingabe) {
                1 -> {
                    heracles.blitzschlag(gegner)
                }

                2 -> {

                    heracles.goettlicherSchlag(gegner)
                }

                3 -> {

                    heracles.kriegsschrei(gegner)
                }

                4 -> {

                    heracles.zeusZorn(gegner)
                }

                5 -> {

                    beutel.heiltrank(heracles)
                }

                6 -> {

                    beutel.vitamine(heracles)
                }
            }
        }
    }
        while (richtigeEingabe)
}
fun angriffwaehlenKarlDerGrosse(karlDerGrosse: KarDerGrosse,gegner : Person) {
    do {
        var richtigeEingabe = false

        println(
            "wähle einer deiner Fähigkeiten\n" +
                    "1. Niederstrecken \n" +
                    "2. Ansturm\n" +
                    "3. Heiliger Schield\n" +
                    "4. Macht \n" +
                    "5. heiltrank \n" +
                    "6. vitamine"
        )

        try {
            var eingabe = readln().toInt()
            when (eingabe) {
                1 -> {
                    karlDerGrosse.niederstrecken(gegner)
                    println()
                }

                2 -> {

                    karlDerGrosse.ansturm(gegner)
                }

                3 -> {

                    karlDerGrosse.heiligerSchield(gegner)
                }

                4 -> {

                    karlDerGrosse.macht(gegner)
                }

                5 -> {
                   if (beutel.heiltrank(karlDerGrosse)){
                    richtigeEingabe = true
                    println("Heiltränke aufgebraucht")
                }}

                6 -> {
                   if (!beutel.vitamine(karlDerGrosse)){
                       richtigeEingabe= true
                    println("vitamine aufgebraucht.")}
                }
            }
        } catch (e: Exception) {
            println("Ungülitige Eingabe")
            var eingabe = readln().toInt()
            when (eingabe) {
                1 -> {
                    karlDerGrosse.niederstrecken(gegner)
                    println()
                }

                2 -> {

                    karlDerGrosse.ansturm(gegner)
                }

                3 -> {

                    karlDerGrosse.heiligerSchield(gegner)
                }

                4 -> {

                    karlDerGrosse.macht(gegner)
                }

                5 -> {

                    beutel.heiltrank(karlDerGrosse)
                }

                6 -> {

                    beutel.vitamine(karlDerGrosse)
                }
            }
        }
    }
        while (richtigeEingabe)
}
fun angriffwaehlenRowena(rowenaDieHexe: RowenaDieHexe,helden : Person){
    var werte = listOf<Int>(1,2,3,4)

    var eingabe = werte.random()
    when (eingabe){
        1 -> {
            rowenaDieHexe.siegelDerBosheit(helden)
            println()
        }
        2 -> {

            rowenaDieHexe.energieWelle(helden)
        }
        3 -> {

            rowenaDieHexe.kugelDerLeere(helden)
        }
        4 -> {

            rowenaDieHexe.verkrueppeln(helden)
        }


    }
}

fun angriffwaehlenDiablo(diablo: Diablo,helden : Person) {
    var werte = listOf<Int>(1, 2, 3, 4, 5, 6)

    var zufaellig = werte.random()
    when (zufaellig) {
        1 -> {
            diablo.unheilvollerschlag(helden)
            println()
        }

        2 -> {

            diablo.verwuesten(helden)
        }

        3 -> {

            diablo.dieKlingeDesDuesteren(helden)
        }

        4 -> {

            diablo.infernalischeKetten(helden)
        }

        5 -> {

            diablo.dezimieren(helden)
        }

        6 -> {

            diablo.weltenvernichter(helden)
        }
    }
}
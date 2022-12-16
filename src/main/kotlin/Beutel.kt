class Beutel {

    var begrenzt : Int = 3
    var begrenzt1 : Int = 1


    fun heiltrank(ziel: Person) : Boolean{
// gibt 100 leben
        if (begrenzt > 0) {

            var heilung: Int = 100
            ziel.hp += heilung
            begrenzt -= 1
            return true
        }
            return false
    }

    fun vitamine(ziel: Person): Boolean {
// erhöht den  nächsten Angriff um 200
        if (begrenzt1 > 0) {
            var schadenerhoehen: Int = 200
            ziel.zusatzschaden += schadenerhoehen
            begrenzt1 -= 1
            return true
        }
            return false
    }
}


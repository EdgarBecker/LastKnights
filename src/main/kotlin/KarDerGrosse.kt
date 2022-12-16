class KarDerGrosse(name : String,hp : Int):Person(name,hp, zusatzschaden = 0) {

    fun niederstrecken(ziel: Person){
        var schaden : Int = 20 + zusatzschaden
        ziel.hp-= schaden
        ziel.zusatzschaden=0

    }
    fun ansturm(ziel: Person){
        var schaden : Int = 20 + zusatzschaden
        ziel.hp-= schaden
        ziel.zusatzschaden=0

    }
    fun heiligerSchield(ziel: Person){
        var schaden : Int = 20 + zusatzschaden
        ziel.hp-= schaden
        ziel.zusatzschaden=0

    }
    fun macht(ziel: Person){
        var schaden : Int = 100 + zusatzschaden
        ziel.hp-= schaden
        ziel.zusatzschaden=0

    }


}

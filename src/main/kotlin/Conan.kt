class Conan (name : String,hp : Int):Person(name,hp, zusatzschaden = 0){

fun derHieb(ziel: Person){
    var schaden : Int = 20 + zusatzschaden
    ziel.hp-= schaden
    ziel.zusatzschaden=0

}
fun axtDerUhrahnen(ziel: Person){
    var schaden : Int = 20 + zusatzschaden
    ziel.hp-= schaden
    ziel.zusatzschaden
    // überall eintragen

}
fun spalten(ziel: Person){
    var schaden : Int = 20 + zusatzschaden
    ziel.hp-= schaden
    ziel.zusatzschaden=0



}
fun seismischesSchmettern(ziel: Person){
    var schaden : Int = 10 + zusatzschaden
    ziel.hp-= schaden
    ziel.zusatzschaden



}

}


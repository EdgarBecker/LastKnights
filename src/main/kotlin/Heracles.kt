class Heracles ( name : String, hp : Int):Person(name,hp, zusatzschaden = 0){

fun blitzschlag(ziel:Person){
    var schaden: Int = 150 + zusatzschaden
    ziel.hp -= schaden
    ziel.zusatzschaden=0
}
fun goettlicherSchlag(ziel: Person){
    var schaden: Int = 120 + zusatzschaden
    ziel.hp -= schaden
    ziel.zusatzschaden=0

}
fun kriegsschrei(ziel: Person){
    var schaden: Int = 100 + zusatzschaden
    ziel.hp -= schaden
    ziel.zusatzschaden=0

}
fun zeusZorn(ziel: Person) {
    var schaden: Int = 200 + zusatzschaden
    ziel.hp -= schaden
    ziel.zusatzschaden=0

}

}
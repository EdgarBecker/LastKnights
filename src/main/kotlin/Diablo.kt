


class Diablo(name : String,hp : Int): Person(name,hp, zusatzschaden = 0) {

fun unheilvollerschlag(ziel: Person){
    var schaden: Int = 30
    ziel.hp -= schaden


}
fun verwuesten(ziel: Person){
    var schaden: Int = 20
    ziel.hp -= schaden


}
fun dieKlingeDesDuesteren(ziel: Person){
    var schaden: Int = 20
    ziel.hp -= schaden


}
fun infernalischeKetten(ziel: Person){
    var schaden: Int = 20
    ziel.hp -= schaden


}
fun dezimieren(ziel: Person){
    var schaden: Int = 30
    ziel.hp -= schaden


}
fun weltenvernichter(ziel: Person){
    var schaden: Int = 50
    ziel.hp -= schaden


}
}
import java.lang.Exception
var beutel = Beutel()

// if und when sind die verzweigungen
// do/ while sind die schleifen
fun main() {
    val rowenaDieHexe = RowenaDieHexe(name = "rowena", hp = 200)
    val diablo = Diablo(name = "diablo", hp = 1000)
    val conan = Conan(name = "conan", hp = 200)
    val karlDerGrossee = KarDerGrosse(name = "KarlDerGroße", 200)
    val heracles = Heracles("Heracles", 300)
    val gegnerliste = mutableListOf<Person>(diablo,rowenaDieHexe)
    val heldenliste = mutableListOf<Person>(conan,heracles,karlDerGrossee)
    var istGutTot: Boolean = false
    var istBoeseTot: Boolean = false



    do {

        if (conan.hp > 0) {
            angriffwaehlenConan(conan, zufallsAngriff(gegnerlist(diablo,rowenaDieHexe)))
            if (diablo.hp >= 0)
                println("Diablo hat noch ${diablo.hp} leben.")
            if (rowenaDieHexe.hp >= 0)
                println("Rowena hat noch ${rowenaDieHexe.hp} leben.")
            if (diablo.hp <=0 && rowenaDieHexe.hp <=0){
                istBoeseTot = true
                break
        }}


println("")
            if (heracles.hp>0){
            angriffwaehlenHeracles(heracles, zufallsAngriff(gegnerlist(diablo,rowenaDieHexe)))
            if (diablo.hp >= 0)
                println("Diablo hat noch ${diablo.hp} leben.")
            if (rowenaDieHexe.hp >= 0)
                println("Rowena hat noch ${rowenaDieHexe.hp} leben.")
            if (diablo.hp <=0 && rowenaDieHexe.hp <=0){
                istBoeseTot = true
                break
        }}

println("")
            if (karlDerGrossee.hp>0){
            angriffwaehlenKarlDerGrosse(karlDerGrossee, zufallsAngriff(gegnerlist(diablo,rowenaDieHexe)))
            if (diablo.hp >= 0)
                println("Diablo hat noch ${diablo.hp} leben.")
            if (rowenaDieHexe.hp >= 0)
                println("Rowena hat noch ${rowenaDieHexe.hp} leben.")
            if (diablo.hp <=0 && rowenaDieHexe.hp <=0){
                istBoeseTot = true
                break
        }}

println("")

        if (diablo.hp>0){
        angriffwaehlenDiablo(diablo, zufallsAngriff(heldenlist(heracles,karlDerGrossee,conan)))
        println("Conan hat noch ${conan.hp} leben.")
        println("Karl hat noch ${karlDerGrossee.hp} leben.")
        println("Heracles hat noch ${heracles.hp} leben.")
        if (heracles.hp <=0 && conan.hp <=0 && karlDerGrossee.hp <=0){
            istGutTot = true
            break
        }}
println("")

        if (rowenaDieHexe.hp>0){
        angriffwaehlenRowena(rowenaDieHexe, zufallsAngriff(heldenlist(heracles,karlDerGrossee,conan)))
        println("Conan hat noch ${conan.hp} leben.")
        println("Karl hat noch ${karlDerGrossee.hp} leben.")
        println("Heracles hat noch ${heracles.hp} leben.")
        if (heracles.hp <=0 && conan.hp <=0 && karlDerGrossee.hp <=0){
            istGutTot = true
            break

        }}
println("")


    }
    while (istGutTot == false && istBoeseTot == false)

    if (istGutTot == true)
        println("Das Böse hat gesiegt.")
    else if (istBoeseTot == true)
        println("Das Gute hat gesiegt.")
}







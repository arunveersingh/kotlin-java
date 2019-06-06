package misc

enum class BandMemberWithDescription(val desc : String) {

    TOM("guitar"){
        // overriden sings function for this enum i.e TOM
        override fun sings() = "plaintively"
    },
    JIM("electronic board"),
    KIM("flute");

    // this function is available with all the enum values
    open fun sings() = "occasionally"

}

fun main(){
    var selectedBandMember : BandMemberWithDescription = BandMemberWithDescription.JIM
    println("desc of selected band member's instrument ${selectedBandMember.desc}")
}


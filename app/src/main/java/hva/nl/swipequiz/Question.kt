package hva.nl.swipequiz

data class Question(
    var name: String,
    var answer: Boolean
) {
    companion object {
        val QUESTIONS = arrayOf(
            "An amount of 20 liter equals to three cans of water.",
            "AZ Alkmaar has better results than AFC Ajax.",
            "The eiffeltoren has a total length of 650 meter"
        )
        val ANSWERS = arrayOf(
            false,
            true,
            false
        )
    }
}

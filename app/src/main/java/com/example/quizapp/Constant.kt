package com.example.quizapp

object Constant {


    // TODO  Create a constant variables which we required in the result screen
    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"
    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        // 1
        val que1 = Question(
            1, "What was the first name of the ancient Kotor?",
            R.drawable.k1kotor,
            "Cattaro", "Qatari",
            "Ascrivium", "Kotor", 3
        )

        questionsList.add(que1)

        // 2
        val que2 = Question(
            2, "If you could stretch the walls that are surrounding the Old town of Kotor, how much km would it be?",
            R.drawable.k2kotor,
            "4.5km", "7.8km",
            "15km", "2km", 1
        )

        questionsList.add(que2)

        // 3
        val que3 = Question(
            3, "The Cathedral of Saint Tryphon is one of the oldest churches in the Balkans, in which century it was built?",
            R.drawable.k3kotor,
            "5th century", "3rd century",
            "9th century", "12th century", 4
        )

        questionsList.add(que3)

        // 4
        val que4 = Question(
            4, "What was the year when the town of Kotor was almost destroyed by an earthquake?",
            R.drawable.k4kotor,
            "1914.", "1785.",
            "1979.", "1999.", 3
        )

        questionsList.add(que4)

        // 5
        val que5 = Question(
            5, "What is the name of one of the most prominent artists from Kotor?",
            R.drawable.k5kotor,
            "Leonardo da Vinci", "Vincent Van Gogh",
            "Salvador Dali", "Tripo Kokolja", 4
        )

        questionsList.add(que5)

        // 6
        val que6 = Question(
            6, "For which animal/pet Kotor is well known?",
            R.drawable.k6kotor,
            "Rats", "Cows",
            "Cats", "Dogs", 3
        )

        questionsList.add(que6)

        // 7
        val que7 = Question(
            7, "What is the name of the settlement/fortress above the mountain side of the Old town of Kotor?",
            R.drawable.k7kotor,
            "Saint Giovanni", "Saint  Eustachius",
            "Saint Tryphon", "Saint Nikola", 1
        )

        questionsList.add(que7)

        // 8
        val que8 = Question(
            8, "What is the most known sweet delicacy you can try in Kotor?",
            R.drawable.k8kotor,
            "Bajadera", "Napolitanka",
            "Krempita", "Tulumba", 3
        )

        questionsList.add(que8)

        // 9
        val que9 = Question(
            9, "For which manifestation during the winter and summer period Kotor is most known?",
            R.drawable.k9kotor,
            "Kotorska musuljada", "Kotorski karneval",
            "Kotorska pasticada", "None of these", 2
        )

        questionsList.add(que9)

        // 10
        val que10 = Question(
            10, "For which manifestation during the summer Kotor is most known, this manifestation also represents the ending of the summer festivities?",
            R.drawable.k10kotor,
            "Djeciji festival", "Karneval",
            "Bokeljska noc", "Vece klapa", 3
        )

        questionsList.add(que10)

        return questionsList
    }
}
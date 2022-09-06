package com.example.quizapp

object Constants {


    const val USER_NAME:String = "user_name"
    const val TOTAL_QUESTIONS:String = "total_questions"
    const val CORRECT_ANSWERS:String = "correct_answers"

    fun getQuestions():ArrayList<Question>{
        val questionList = ArrayList<Question>()
        val que1 = Question(
            1,
            "what country this flag belong to ?",
            R.drawable.ic_flag_of_argentina,
            "Argentina",
            "Australia",
            "America",
            "Peru",
            1

        )
        questionList.add(que1)

        val que2 = Question(
            1,
            "what country this flag belong to ?",
            R.drawable.ic_flag_of_australia,
            "Denmark",
            "Australia",
            "China",
            "Brazil",
            2

        )
        questionList.add(que2)

        val que3 = Question(
            1,
            "what country this flag belong to ?",
            R.drawable.ic_flag_of_belgium,
            "England",
            "India",
            "China",
            "Belgium",
            4

        )
        questionList.add(que3)

        val que4 = Question(
            1,
            "what country this flag belong to ?",
            R.drawable.ic_flag_of_brazil,
            "Sri Lanka",
            "Italy",
            "Brazil",
            "German",
            3

        )
        questionList.add(que4)

        val que5 = Question(
            1,
            "what country this flag belong to ?",
            R.drawable.ic_flag_of_denmark,
            "Denmark",
            "Palestine",
            "Jordan",
            "Kuwait",
            1

        )
        questionList.add(que5)

        val que6 = Question(
            1,
            "what country this flag belong to ?",
            R.drawable.ic_flag_of_fiji,
            "Iran",
            "Australia",
            "Hungary",
            "Fiji",
            4

        )
        questionList.add(que6)

        val que7 = Question(
            1,
            "what country this flag belong to ?",
            R.drawable.ic_flag_of_germany,
            "Switzerland",
            "Germany",
            "China",
            "Ireland",
            2

        )
        questionList.add(que7)

        val que8 = Question(
            1,
            "what country this flag belong to ?",
            R.drawable.ic_flag_of_kuwait,
            "Saudi",
            "Japan",
            "Japan",
            "Kuwait",
            4

        )
        questionList.add(que8)

        val que9 = Question(
            1,
            "what country this flag belong to ?",
            R.drawable.ic_flag_of_india,
            "India",
            "Russia",
            "Pakistan",
            "Chile",
            1

        )
        questionList.add(que9)

        return questionList
    }
}
fun main(args: Array<String>){
    //Arrays
    val evenNumbers = arrayOf(1,2,3,4)
    val evenNumbers2 : Array<Int> = arrayOf(1,2,3,4)
    val intNumbers = intArrayOf(1,2,3,4)

    var players = arrayOf("Alice", "Bob", "Dan", "Eli", "Frank")
    for (name in players){
        if (name == "Dan") println(players.indexOf("Dan"))
    }

    val scores = arrayOf(2,2,8,6,1)

    var index = 0
    for (names in players){
        println("${index+1}. $names - ${scores[index]}")
        index+=1
    }

//List
    val names = listOf("Anna", "Brian", "Craig", "Donna")
    println(names)

    val teamNames = mutableListOf<String>()
    teamNames.addAll(names)
    teamNames.add("Sam")
    teamNames.add("George")
    println(teamNames)

    println(teamNames[0])
    println(teamNames.indexOf("Anna"))

    teamNames.remove("George")
    println(teamNames)

    for (member in teamNames){
        println("Team Member: $member")
    }

    //Challenge List
    val myStates = mutableListOf<String>()
    val states = listOf("Lima", "Trujillo", "Arequipa", "Cuzco", "Piura", "Cañete")
    myStates.addAll(states)
    myStates.add("Ica")
    println(myStates)

    fun printStates(states : List<String>){
        for (index in 0..states.size-1){
            if (index != 3){
                println("State: ${index+1} ${states[index]}")
            }
        }
    }

    printStates(states)

    var variables = listOf("Roy", 30, 2018, "Psycologhy")
    println(variables)

//Maps
    var namesAndScores = mapOf("Anna" to 2, "Brian" to 2, "Craig" to 8, "Donna" to 6)
    println(namesAndScores)
    println(namesAndScores["Anna"])
    println(namesAndScores["Greg"])
    println(namesAndScores.isEmpty())
    println(namesAndScores.count())

    val royData = mutableMapOf("Name" to "Roy", "Age" to "30", "Profession" to "Fireman", "City" to "Oakland")
    println(royData)

    royData["Profession"] = "Pilot"
    println(royData)

    royData.remove("City")
    println(royData)

    for ((player, score) in namesAndScores){
        println("$player - $score")
    }

    for (player in namesAndScores.keys){
        println("$player, ${namesAndScores[player]}")
    }

    //Challenge Maps
    val myMap = mutableMapOf("name" to "Roy", "profession" to "programmer", "country" to "peru", "state" to "lima", "city" to "lima")
    println(myMap)

    myMap["city"] = "buenos aires"
    myMap["country"] = "argentina"
    println(myMap)

    fun printPlayers(person : Map<String, String>){
        val state = if (person.containsKey("state")) person["state"] else ""
        val city = if (person.containsKey("city")) person["city"] else ""
        println("Person lives in $city, $state")
    }
    val person1 = mapOf("state" to "AA", "city" to "OAK")
    printPlayers(myMap)

    /*
    Rules of thumb
    Big collections:
        Array: if order matters
        Maps: if need to frequently search
        List: if you need to add and remove items
    Small collections:
        Choose what feels natural
    */
}
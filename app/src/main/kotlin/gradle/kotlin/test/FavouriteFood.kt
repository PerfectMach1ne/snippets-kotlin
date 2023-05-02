package gradle.kotlin.test

/*class*/object FavouriteFood /*private constructor()*/ {
//    companion object {
//        val instance = // idk
//
//        fun instance(): FavouriteFood {
//            // create instance
//        } = FavouriteFood()
//    }

    var name = "unknown"
    var ingredients = mutableListOf<String>()

    fun numberOfIngredients(): Int {
        return ingredients.size
    }
}
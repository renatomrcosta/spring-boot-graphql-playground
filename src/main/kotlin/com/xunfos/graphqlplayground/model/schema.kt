package com.xunfos.graphqlplayground.model

import com.expediagroup.graphql.annotations.GraphQLDescription
import kotlinx.coroutines.delay

enum class Color {
    Red,
    Yellow,
    Green;
}

interface Fruit {
    @GraphQLDescription("Name of the Fruit Variety")
    val name: String

    @GraphQLDescription("Primary color of the fruit that a toddler would use to describe it")
    val color: Color
}

data class Apple(
    override val name: String, override val color: Color,
    @GraphQLDescription("Is this apple sour?")
    @Deprecated("You know what? Sourness should be a spectrum, not a binary answer, therefore we wanna remove this from the schema")
    val isSour: Boolean
) : Fruit

data class Banana(override val name: String, val origin: String) : Fruit {
    override val color: Color
        get() = Color.Yellow
}

data class Crate(
    val id: String, val fruits: List<Fruit>
) {
    // fun fruits(color: String?): List<Fruit> = listOf(
    //     Apple("Granny Smith", Color.Green, true),
    //     Banana("Nanica", "Zanzibar")
    // ).filter { fruit ->
    //     Thread.sleep(2000)
    //     // Matches the color or any color when parameter is null
    //     color?.let {
    //         Color.valueOf(it) == fruit.color
    //     } ?: true
    // }

    // suspend fun fruits(color: String?): List<Fruit> = listOf(
    //     Apple("Granny Smith", Color.Green, true),
    //     Banana("Nanica", "Zanzibar")
    // ).filter { fruit ->
    //     delay(2000)
    //     // Matches the color or any color when parameter is null
    //     color?.let {
    //         Color.valueOf(it) == fruit.color
    //     } ?: true
    // }
}

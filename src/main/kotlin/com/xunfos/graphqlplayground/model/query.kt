package com.xunfos.graphqlplayground.model

import com.expediagroup.graphql.spring.operations.Query
import org.springframework.stereotype.Component

@Component
class FruitQuery : Query {
    fun banana(): Banana = Banana("Prata", "Brazil")
    fun crate(color: String?): Crate = Crate(
        "1",
        listOf(
            Apple("Granny Smith", Color.Green, true),
            Banana("Nanica", "Zanzibar")
        ).filter { fruit ->
            // Thread.sleep(2000)
            // Matches the color or any color when parameter is null
            color?.let {
                Color.valueOf(it) == fruit.color
            } ?: true
        }
    )
}

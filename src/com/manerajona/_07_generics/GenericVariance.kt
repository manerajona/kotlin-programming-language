package com.manerajona._07_generics

fun main(args: Array<String>) {

    val garden = CovariantGarden(RedRose())
    val flower = garden.pickFlower(0)
    println(flower.color)

    //tendGarden(garden) ERROR
    tendGarden(CovariantGarden(WhiteRose()))

    val flowerCare = object : FlowerCare<Flower> {
        override fun prune(flower: Flower) = println("pruning a ${flower.color} flower...")
    }

    val whiteRoseGarden = ContravariantGarden(listOf(WhiteRose(), WhiteRose()), flowerCare)
    whiteRoseGarden.tendFlower(0)

    val redRoseGarden = ContravariantGarden(listOf(RedRose(), RedRose()), flowerCare)
    redRoseGarden.tendFlower(1)

    val whiteRoses = mutableListOf(WhiteRose(), WhiteRose())
    val redRoses = mutableListOf(RedRose(), RedRose())
    val flowersCopy = mutableListOf<Flower>()

    copyFlowers(whiteRoses, flowersCopy)
    copyFlowers(redRoses, flowersCopy)

}

open class Flower(val color: String)

class RedRose : Flower("Red")

class WhiteRose : Flower("White")


// co-variant = out
data class CovariantGarden<out T : Flower>(val flower: T) {
    private val flowers: List<T> = listOf(flower)
    fun pickFlower(i: Int): T = flowers[i]
}

fun tendGarden(roseGarden: CovariantGarden<WhiteRose>) = waterGarden(roseGarden)

fun waterGarden(garden: CovariantGarden<Flower>) = println(garden.pickFlower(0).color)


// contra-variant = in
interface FlowerCare<in T> {
    fun prune(flower: T)
}

data class ContravariantGarden<T: Flower>(val flowers: List<T>, val flowerCare: FlowerCare<T>) {
    fun pickFlower(i: Int): T = flowers[i]
    fun tendFlower(i: Int) = flowerCare.prune(pickFlower(i))
}

// covariant (in) : only reads
// contravariant (out) : only writes
fun <T: Flower> copyFlowers(source: MutableList<out T>, target: MutableList<in T>) = source.forEach{target.add(it)}

package model

abstract class Animal(id: Int=0, nome: String="") {
    abstract fun brincar()
}

class Cachorro(private val id: Int=0, private val nome: String="") : Animal(id, nome) {
    override fun brincar() {
        println("${this.nome} está latindo e girando!")
    }
}

class Gato(val id: Int=0, val nome: String="") : Animal(id, nome) {
    override fun brincar() {
        println("${this.nome} está miando e pulando!")
    }
}

class Passaro(val id: Int=0, val nome: String="") : Animal(id, nome) {
    override fun brincar() {
        println("${this.nome} está cantando!")
    }
}

class Peixe(val id: Int=0, val nome: String="") : Animal(id, nome) {
    override fun brincar() {
        println("${this.nome} está pulando o anel!")
    }
}
package model

abstract class Animal(open var id: Int=0, open var nome: String="") {
    abstract fun brincar()

    override fun toString(): String {
        return "ID: $id - Nome: $nome"
    }
}

class Cachorro(override var id: Int=0, override var nome: String="") : Animal(id, nome) {
    override fun brincar() {
        println("${this.nome} está latindo e girando!")
    }
}

class Gato(override var id: Int=0, override var nome: String="") : Animal(id, nome) {
    override fun brincar() {
        println("${this.nome} está miando e pulando!")
    }
}

class Passaro(override var id: Int=0, override var nome: String="") : Animal(id, nome) {
    override fun brincar() {
        println("${this.nome} está cantando!")
    }
}

class Peixe(override var id: Int=0, override var nome: String="") : Animal(id, nome) {
    override fun brincar() {
        println("${this.nome} está pulando o anel!")
    }
}
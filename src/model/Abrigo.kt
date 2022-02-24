package model

import auxiliar.AuxiliarModel
import auxiliar.Texto

class Abrigo(
    var id: Int = 0, var nome: String = "aaa", var endereco: String = "bbb",
    private val listaAnimais: MutableMap<String, MutableList<Animal>> = mutableMapOf()
) {
    init {
        listaAnimais["Cachorro"] = mutableListOf()
        listaAnimais["Gato"] = mutableListOf()
        listaAnimais["Passaro"] = mutableListOf()
        listaAnimais["Peixe"] = mutableListOf()
    }

    companion object {
        fun cadastrarAbrigo(lista: MutableList<Abrigo>) {
            val abrigo = Abrigo()
            print("Digite o ID do Abrigo: ")
            val id: Int = readln().toInt()

            if (AuxiliarModel.retornaAbrigo(id, lista) == null) {
                abrigo.id = id
                print("Digite o nome do Abrigo: ")
                abrigo.nome = readln()
                print("Digite o endereço do Abrigo: ")
                abrigo.endereco = readln()
                lista.add(abrigo)

                println("Abrigo ${abrigo.nome} cadastrado com sucesso! ")
            } else {
                println("O ID $id já existe, não é posssível criar um novo Abrigo com esse ID.")
            }
        }

        fun cadastrarPet(lista: MutableList<Abrigo>) {
            print("Digite o ID do Abrigo: ")
            val id: Int = readln().toInt()
            val abrigo = AuxiliarModel.retornaAbrigo(id, lista)

            if (abrigo != null) {
                val pet: Animal
                print("Digite o ID do Pet: ")
                val idPet: Int = readln().toInt()

                if (AuxiliarModel.retornaPet(idPet, abrigo.listaAnimais) == null) {
                    while (true) {
                        val opcao = Texto.menuOpcoes(
                            "1-Cachorro",
                            "2-Gato",
                            "3-Pássaro",
                            "4-Peixe",
                        )
                        when (opcao) {
                            1 -> {
                                pet = Cachorro()
                                break
                            }
                            2 -> {
                                pet = Gato()
                                break
                            }
                            3 -> {
                                pet = Passaro()
                                break
                            }
                            4 -> {
                                pet = Peixe()
                                break
                            }
                            else -> println("Digite uma opção válida!")
                        }
                    }
                    val especie: String = pet.javaClass.simpleName
                    //println(especie)
                    pet.id = idPet
                    print("Digite o nome do Pet: ")
                    pet.nome = readln()
                    if (especie !in abrigo.listaAnimais.keys) {
                        abrigo.listaAnimais[especie] = mutableListOf(pet)
                    } else {
                        abrigo.listaAnimais[especie]!!.add(pet)
                    }
                    println("Pet ID: ${pet.id} - Nome: ${pet.nome} cadastrado no Abrigo: ${abrigo.nome} com sucesso!")
                } else {
                    println("Pet ID $idPet já existe, não é possível criar um novo Pet com este ID.")
                }
            } else {
                println("Abrigo ID $id inexistente.")
            }
        }

        fun exibirPets(lista: MutableList<Abrigo>) {
            print("Digite o ID do Abrigo: ")
            val id: Int = readln().toInt()
            val abrigo = AuxiliarModel.retornaAbrigo(id, lista)

            if (abrigo != null) {
                println("Lista de Pets do Abrigo ${abrigo.nome}: ")
                for (especie in abrigo.listaAnimais.keys) {
                    println("${" $especie"}:")
                    val listaEspecie: MutableList<Animal>? = abrigo.listaAnimais[especie]
                    if (listaEspecie!!.isNotEmpty()) {
                        for (animal in listaEspecie) {
                            println("   $animal")
                        }
                    } else {
                        println("   Não existem animais dessa espécie cadastrados.")
                    }
                }
            } else {
                println("ID $id inexistente.")
            }
        }

        fun apagarPet(lista: MutableList<Abrigo>) {
            print("Digite o ID do Abrigo: ")
            val id: Int = readln().toInt()
            val abrigo = AuxiliarModel.retornaAbrigo(id, lista)

            if (abrigo != null) {
                print("Digite o ID do Pet: ")
                val idPet: Int = readln().toInt()

                val pet: Animal? = AuxiliarModel.retornaPet(idPet, abrigo.listaAnimais)
                if (pet != null) {
                    val especie: String = pet.javaClass.simpleName
                    abrigo.listaAnimais[especie]!!.remove(pet)
                    println("Pet ID: ${pet.id} - Nome: ${pet.nome} do Abrigo: ${abrigo.nome} apagado com sucesso!")
                } else {
                    println("Pet ID $idPet inexistente.")
                }
            } else {
                println("Abrigo ID $id inexistente.")
            }
        }

        fun brincarPet(lista: MutableList<Abrigo>) {
            print("Digite o ID do Abrigo: ")
            val id: Int = readln().toInt()
            val abrigo = AuxiliarModel.retornaAbrigo(id, lista)

            if (abrigo != null) {
                print("Digite o ID do Pet: ")
                val idPet: Int = readln().toInt()

                val pet: Animal? = AuxiliarModel.retornaPet(idPet, abrigo.listaAnimais)
                if (pet != null) {
                   pet.brincar()
                } else {
                    println("Pet ID $idPet inexistente.")
                }
            } else {
                println("Abrigo ID $id inexistente.")
            }
        }
    }

    override fun toString(): String {
        return "ID: ${this.id} - Nome: ${this.nome} - Endereço: ${this.endereco}"
    }




}
package auxiliar

import model.Abrigo
import model.Animal

class AuxiliarModel {

    companion object {
        fun retornaAbrigo(id: Int, lista: MutableList<Abrigo>): Abrigo? {
            for (abrigo in lista) {
                if (id == abrigo.id) {
                    return abrigo
                }
            }
            return null
        }

        fun exibirAbrigos(lista : MutableList<Abrigo>) {
            Texto.linha()
            if (lista.isEmpty()) {
                println("Não existe nenhum Abrigo cadastrado.")
            } else {
                for (abrigo in lista) {
                    println(abrigo.toString())
                }
            }
        }

        fun apagarAbrigo(lista : MutableList<Abrigo>) {
            print("Digite o ID do Abrigo: ")
            val id: Int = readln().toInt()
            val abrigo = retornaAbrigo(id, lista)
            if (abrigo != null) {
                lista.remove(abrigo)
                println("Abrigo ID: ${abrigo.id} - Nome: ${abrigo.nome} removido com sucesso!")
            } else {
                println("ID: $id inexistente.")
            }
        }

        fun retornaPet(id: Int, map: MutableMap<String, MutableList<Animal>>): Animal? {
            for (lista in map.values) {
                for (animal in lista) {
                    if (id == animal.id) {
                        return animal
                    }
                }
            }
            return null
        }
    }

}
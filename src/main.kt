import auxiliar.AuxiliarModel
import auxiliar.Texto
import model.Abrigo

fun main() {
    val listaAbrigos: MutableList<Abrigo> = mutableListOf()

    Texto.titulo("Sistema AbrigoPets!")

    while (true) {
        val tarefa: Int = Texto.menuOpcoes(
            "1-Cadastrar Abrigo",
            "2-Exibir Abrigos",
            "3-Apagar Abrigo",
            "4-Cadastrar Pet",
            "5-Exibir Pets",
            "6-Apagar Pet",
            "7-Brincar com Pet",
            "8-Sair do Sistema",
        )
        when(tarefa) {
            // Cadastra o abrigo
            1 -> Abrigo.cadastrarAbrigo(listaAbrigos)

            // Exibe os Abrigos
            2 -> AuxiliarModel.exibirAbrigos(listaAbrigos)

            // Apaga o Abrigo
            3 -> AuxiliarModel.apagarAbrigo(listaAbrigos)

            // Cadastra o Pet
            4 -> Abrigo.cadastrarPet(listaAbrigos)

            // Exibe os Pets de um Abrigo
            5 -> Abrigo.exibirPets(listaAbrigos)

            // Apaga o Pet de um Abrigo
            6 -> Abrigo.apagarPet(listaAbrigos)

            // Brinca com um Pet de um Abrigo
            7 -> Abrigo.brincarPet(listaAbrigos)

            // Sai do loop e deixa o programa finalizar naturalmente.
            8 -> {
                println("Finalizando o Sistema...")
                break
            }
        }
        Texto.linha()
    }
}
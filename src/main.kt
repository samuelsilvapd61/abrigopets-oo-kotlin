import auxiliar.Texto
import model.Abrigo
import model.Animal

fun main() {
    var listaAbrigos: MutableList<Abrigo>

    Texto.titulo("Sistema AbrigoPets!")

    while (true) {
        val tarefa: Int = Texto.menuOpcoes(
            "1 - Cadastrar Abrigo",
            "2 - Exibir Abrigos",
            "3 - Apagar Abrigo",
            "4 - Cadastrar Pet",
            "5 - Exibir Pets",
            "6 - Apagar Pet",
            "7 - Brincar com Pet",
            "8 - Sair do Sistema",
        )
        when(tarefa) {
            // Cadastra o abrigo
            //1 -> Abrigo.cadastrarAbrigo(listaAbrigos)

            // Cadastra o abrigo
            //2 -> Abrigo.exibirAbrigos(listaAbrigos)

            // Cadastra o abrigo
            //3 -> Abrigo.apagarAbrigo(listaAbrigos)

            // Cadastra o abrigo
            //4 -> Abrigo.cadastrarPet(listaAbrigos)

            // Cadastra o abrigo
            //5 -> Abrigo.exibirPets(listaAbrigos)

            // Cadastra o abrigo
            //6 -> Abrigo.apagarPet(listaAbrigos)

            // Cadastra o abrigo
            //7 -> Abrigo.brincarPet(listaAbrigos)

            // Sai do loop e deixa o programa finalizar naturalmente.
            8 -> {
                println("Finalizando o Sistema...")
                break
            }
        }
    }
}
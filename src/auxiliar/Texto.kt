package auxiliar

class Texto {
    companion object {
        fun linha() {
            for (i in 1..100) {
                print('-')
            }
            println()
        }

        fun titulo(mensagem: String = "Mensagem Inexistente") {
            linha()
            println(mensagem)
            linha()
        }

        fun menuOpcoes(vararg opcoes: String): Int {
            var mensagem: String = ""
            for (opcao in opcoes) {
                mensagem += ("$opcao | ")
            }
            mensagem = mensagem.substring(0, mensagem.length-3)

            print("Digite a opção desejada: ")
            return readln().toInt()
        }
    }

}
package business

import entity.Convidado

class ConvidadoBusiness {
    fun tipoValido(tipo: String): Boolean = (tipo == "comum" || tipo == "premium" || tipo == "luxo")

    fun maiorDeIdade(idade: Int): Boolean = idade >= 18

    fun convidadoValido(convidado: Convidado) = when (convidado.tipo) {
        "comum" -> convidado.codigo.startsWith("xt")
        "premium", "luxo" -> convidado.codigo.startsWith("xl")
        else -> false
    }
}

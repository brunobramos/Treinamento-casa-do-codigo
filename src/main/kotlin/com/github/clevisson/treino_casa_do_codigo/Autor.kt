package com.github.clevisson.treino_casa_do_codigo

import java.time.Instant

class Autor(val email: String, val nome: String, val descricao: String) {
        val instante = Instant.now()

    override fun toString(): String {
        return ("Nome: $nome, Email: $email, Descrição: $descricao, Instante da criação: $instante")
    }
}
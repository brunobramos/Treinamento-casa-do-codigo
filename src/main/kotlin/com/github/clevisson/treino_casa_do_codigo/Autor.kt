package com.github.clevisson.treino_casa_do_codigo

import jakarta.persistence.*
import java.time.Instant

@Entity
class Autor(
    @Id
    val email: String,

    @Column(nullable = false)
    val nome: String,

    @Column
    val descricao: String) {

        @Column(nullable = false)
        val instante = Instant.now()

    override fun toString(): String {
        return ("Nome: $nome, Email: $email, Descrição: $descricao, Instante da criação: $instante")
    }
}
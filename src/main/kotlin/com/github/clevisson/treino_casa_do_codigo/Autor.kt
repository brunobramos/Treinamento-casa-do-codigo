package com.github.clevisson.treino_casa_do_codigo

import jakarta.persistence.*
import java.time.Instant

@Entity
class Autor(
    val email: String,

    @Column(nullable = false)
    val nome: String,

    @Column(nullable = false)
    val descricao: String) {

        @Id
        val emailFormatado = email.lowercase().trim()

        @Column(nullable = false)
        val instante = Instant.now()

    override fun toString(): String {
        return ("Nome: $nome, Email: $emailFormatado, Descrição: $descricao, Instante da criação: $instante")
    }
}
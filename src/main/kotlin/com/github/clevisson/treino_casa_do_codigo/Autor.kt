package com.github.clevisson.treino_casa_do_codigo

import jakarta.persistence.*
import java.time.Instant

@Entity
class Autor(
    email: String,

    @Column(nullable = false)
    val nome: String,

    @Column(nullable = false)
    val descricao: String) {

        @Id
        val emailFormatado = regexEmail(email.lowercase().trim())

        @Column(nullable = false)
        val instante = Instant.now()

    override fun toString(): String {
        return ("Nome: $nome, Email: $emailFormatado, Descrição: $descricao, Instante da criação: $instante")
    }

    companion object{
        private fun regexEmail(email: String): Regex {
            val regex = "^[a-z0-9._+-]+[@][a-z0-9.-]+[.][a-z]{2,}([.][a-z0-9]+)?$"
            return Regex(regex)
        }
    }
}
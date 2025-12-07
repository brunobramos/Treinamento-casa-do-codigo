package com.github.clevisson.treino_casa_do_codigo

import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class TreinoCasaDoCodigoApplication {

    @Bean
    fun TestePersistencia(repositorio: AutorRepository) = CommandLineRunner {
        val autor = Autor("brunobramos@gmail.com", "Bruno Bernardo Ramos", "Aluno do treinamento")
        repositorio.save(autor)
        println("Autor salvo: $autor")
    }
}

fun main(args: Array<String>) {
    runApplication<TreinoCasaDoCodigoApplication>(*args)

    val autor = Autor("brunobramos@gmail.com", "Bruno Bernardo Ramos", "Aluno do treinamento")
    println(autor)
    // val autor2 = Autor("brunobramos@gmail", "Autor2", "teste validacao email")
    // println(autor2)
}

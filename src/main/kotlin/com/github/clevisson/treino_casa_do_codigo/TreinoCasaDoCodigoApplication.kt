package com.github.clevisson.treino_casa_do_codigo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TreinoCasaDoCodigoApplication

fun main(args: Array<String>) {
	runApplication<TreinoCasaDoCodigoApplication>(*args)

    val autor = Autor("brunobramos@gmail.com", "Bruno Bernardo Ramos", "Aluno do treinamento")
    print(autor)
    val autor2 = Autor("brunobramos@gmail", "Autor2", "teste validacao email")
    print(autor2)


}

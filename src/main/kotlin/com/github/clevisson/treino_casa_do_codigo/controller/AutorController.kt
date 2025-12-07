package com.github.clevisson.treino_casa_do_codigo.controller

import com.github.clevisson.treino_casa_do_codigo.*
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/Autores")
class AutorController(val repositorio : AutorRepository) {
    @PostMapping
    fun cadastrarAutor(@RequestBody autor: Autor): Autor = repositorio.save(autor)

}
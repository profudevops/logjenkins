package mx.com.profutruro.logjenkins.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;


import mx.com.profutruro.logjenkins.model.ProyectoRama;
import mx.com.profutruro.logjenkins.repository.ProyectoRamaRepository;

@RestController
public class ProyectoRamaController {

    private ProyectoRamaRepository proyectoRama;

    @Autowired
    public ProyectoRamaController(ProyectoRamaRepository proyectoRama) {
        this.proyectoRama = proyectoRama;
    }

    @GetMapping("/proyectorama/all")
    Iterable<ProyectoRama> all() {
        return proyectoRama.findAll();
    }

    @GetMapping("/proyectorama/{id}")
    ProyectoRama userById(@PathVariable Long id) {
        return proyectoRama.findById(id).orElseThrow(() -> new ResponseStatusException(
                HttpStatus.NOT_FOUND));
    }

    @PostMapping("/proyectorama/save")
    ProyectoRama save(@RequestBody ProyectoRama user) {
        return proyectoRama.save(user);
    }

}

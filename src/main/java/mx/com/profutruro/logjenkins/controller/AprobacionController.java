package mx.com.profutruro.logjenkins.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import mx.com.profutruro.logjenkins.model.Aprobacion;
import mx.com.profutruro.logjenkins.repository.AprobacionRespository;

@RestController
public class AprobacionController {

    private AprobacionRespository aprobacion;

    @Autowired
    public AprobacionController(AprobacionRespository aprobacion) {
        this.aprobacion = aprobacion;
    }

    @GetMapping("/aprobacion/all")
    Iterable<Aprobacion> all() {
        return aprobacion.findAll();
    }

    @GetMapping("/aprobacion/{id}")
    Aprobacion userById(@PathVariable Long id) {
        return aprobacion.findById(id).orElseThrow(() -> new ResponseStatusException(
                HttpStatus.NOT_FOUND));
    }

    @PostMapping("/aprobacion/save")
	Aprobacion save(@RequestBody Aprobacion user) {
        return aprobacion.save(user);
    }

}

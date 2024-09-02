package co.edu.uceva.celularservice.controller;


import co.edu.uceva.celularservice.model.entities.Celular;
import co.edu.uceva.celularservice.model.service.CelularServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("/api/v1/celular-service")
public class CelularRestController {

    @Autowired
    private CelularServiceImpl celularService;

    @GetMapping("/celulares")
    public List<Celular> getAllCelulares() {
        return this.celularService.listar();
    }

    @GetMapping("/celular/{id}")
    public Celular getCelular(@PathVariable Long id) {
        return this.celularService.findById(id);
    }

    @PostMapping("/celular")
    public Celular createCelular(@RequestBody Celular celular) {
        return this.celularService.save(celular);
    }

    @PutMapping("/celular")
    public Celular updateCelular(@RequestBody Celular celular) {
        return this.celularService.save(celular);
    }

    @DeleteMapping("/paises/{id}")
    public void deleteCelular(@PathVariable Long id) {
        Celular celular = this.celularService.findById(id);
        this.celularService.delete(celular);
    }
}

package hacks.controller;

import hacks.model.Bin;
import hacks.repository.BinRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/bins")
public class BinController {
    private final BinRepository binRepository;

    public BinController(BinRepository binRepository) {
        this.binRepository = binRepository;

    }

    @GetMapping
    public List<Bin> getAllItems() {
        return this.binRepository.findAll();

    }

}

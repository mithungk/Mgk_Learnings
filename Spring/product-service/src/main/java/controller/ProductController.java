package controller;


import lombok.RequiredArgsConstructor;
import model.Product;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import repository.ProductRepository;

import java.util.List;

@RestController
@RequestMapping("/api/product")
@RequiredArgsConstructor
public class ProductController {

    private final ProductRepository productRepository;
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Product> findAll(){
        return productRepository.findAll();
    }

    @GetMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createProduct(@RequestBody Product product){
        productRepository.save(product);
    }
}

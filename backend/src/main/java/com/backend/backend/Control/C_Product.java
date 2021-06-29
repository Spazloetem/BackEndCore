package com.backend.backend.Control;

import com.backend.backend.Service.S_Product;
import com.backend.backend.Model.Product;
import com.backend.backend.Systemtool.QueryParameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(value = "/products", produces = MediaType.APPLICATION_JSON_VALUE)
public class C_Product {

    @Autowired
    private S_Product ServiceProduct;

    @GetMapping("/{id}")//查詢
    public ResponseEntity<Product> getProduct(@PathVariable("id") Long id) {
        Product product = ServiceProduct.getProduct(id);
        return ResponseEntity.ok(product);
    }

    @GetMapping//條件查詢
    public ResponseEntity<List<Product>> getProducts(@ModelAttribute QueryParameter param) {
        List<Product> products = ServiceProduct.getProducts(param);
        return ResponseEntity.ok(products);
    }

    @PostMapping//建立
    public ResponseEntity<Product> createProduct(@RequestBody Product request) {
        Product product = ServiceProduct.createProduct(request);
        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(product.getP_ID())
                .toUri();
        return ResponseEntity.created(location).body(product);
    }

    @PutMapping//修改
    public ResponseEntity<Product> replaceProduct(@RequestBody Product request) {
        Product product = ServiceProduct.replaceProduct(request);
        return ResponseEntity.ok(product);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProduct(@PathVariable("id") Long id) {
        ServiceProduct.deleteProduct(id);
        return ResponseEntity.noContent().build();
    }

}

package com.example.ch7_javasky.controler;

import com.example.ch7_javasky.model.Product;
import com.example.ch7_javasky.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ProductController {
    private final ProductService productService ;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }
    @GetMapping(value = "/products")
    public String vievProduct(Model model){
        var product =productService.findAll();
        model.addAttribute("products",product);
        return "products.html";

    }
    @PostMapping("/products")
    public String addProduct(
            @RequestParam String name,
            @RequestParam double price,
            Model model
    ){
        Product product = new Product();
        product.setName(name);
        product.setPrice(price);
        productService.addProduck(product);

//        var  products =productService.findAll();
//        model.addAttribute("products",products);
        vievProduct(model);

        return "products.html";

    }
}

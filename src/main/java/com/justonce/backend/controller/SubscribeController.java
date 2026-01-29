package com.justonce.backend.controller;

import com.justonce.backend.model.Subscriber;
import com.justonce.backend.repository.SubscriberRepository;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
@RequestMapping("/api")
@CrossOrigin(
    origins = {
        "http://localhost:3000",
        "https://justonce-frontend.vercel.app"
    },
    allowedHeaders = "*",
    methods = {
        RequestMethod.POST,
        RequestMethod.OPTIONS
    }
)
public class SubscribeController {

    private final SubscriberRepository repository;

    public SubscribeController(SubscriberRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/")
    public String home() {
        return "JustOnce backend is running";
    }

    @PostMapping("/subscribe")
    public String subscribe(@RequestBody SubscribeRequest request) {

        if (repository.existsByEmail(request.email())) {
            System.out.println("⚠️ Duplicate email ignored: " + request.email());
            return "already_exists";
        }

        repository.save(new Subscriber(request.email()));
        System.out.println("📩 Email saved: " + request.email());

        return "saved";
    }

    record SubscribeRequest(
            @NotBlank
            @Email
            String email
    ) {}
}

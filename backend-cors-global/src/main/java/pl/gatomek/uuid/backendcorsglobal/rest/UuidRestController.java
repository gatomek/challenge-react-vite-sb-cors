package pl.gatomek.uuid.backendcorsglobal.rest;

import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api")
public class UuidRestController {

    @GetMapping("/uuid")
    public String getUuid() {
        return UUID.randomUUID().toString();
    }

    @PostMapping("/uuid")
    public String postUuid( @RequestBody UuidVersion version) {
        return UUID.randomUUID().toString();
    }
}
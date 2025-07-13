package pl.gatomek.uuid.backendcorscontroller.rest;

import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api")
public class UuidRestController {

    @CrossOrigin(
            origins = {"http://localhost:5174", "http://localhost:5175"}
    )
    @GetMapping("/uuid")
    public String getUuid() {
        return UUID.randomUUID().toString();
    }

    @CrossOrigin(
            origins = {"http://localhost:5174", "http://localhost:5175"},
            maxAge = 1
    )
    @PostMapping("/uuid")
    public String getUuid(@RequestBody UuidVersion version) {
        return UUID.randomUUID().toString();
    }
}

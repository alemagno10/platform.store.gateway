package insper.store.gateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class GatewayResource {

    @GetMapping("/hello")
    public String hello() {
        return "Hello from Gateway!";
    }

}

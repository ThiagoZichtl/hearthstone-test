package zichtlthiago.hearthstonecards.rest.api.control;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatusCheck {

    @GetMapping(path = "/api/status")
    public String check(){
        return "online";
    }


}
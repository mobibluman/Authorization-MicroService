package sample.web.secure.jdbc;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/customer")
public class CustomerController {

    private static final String template = "Customer: %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping(method=RequestMethod.GET)
    public @ResponseBody Customer postCustomerInfo(@RequestParam(value="name", required=false, defaultValue="Default Resource") String name, String content) {
        return new Customer(counter.incrementAndGet(), String.format(template, name), String.format(name, " ", content));
    }

}

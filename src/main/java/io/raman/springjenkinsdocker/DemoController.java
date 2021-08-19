package io.raman.springjenkinsdocker;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	@RequestMapping("/demo/{name}")
	public String demo(@PathVariable String name) {
		return "demo on "+name;
	}

}

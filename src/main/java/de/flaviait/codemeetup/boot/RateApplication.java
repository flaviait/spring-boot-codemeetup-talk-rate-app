package de.flaviait.codemeetup.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.IntSummaryStatistics;

@SpringBootApplication
public class RateApplication {

    public static void main(String[] args) {
        SpringApplication.run(RateApplication.class, args);
    }
    
    @RestController
    public static class RateController {
        
        private IntSummaryStatistics summaryStatistics = new IntSummaryStatistics();
        
        @RequestMapping("/rates")
        public String rates() {
            return summaryStatistics.toString();
        }
        
        @RequestMapping("/rate/{value}")
        public String rate(@PathVariable Integer value) {
            if (value <= 0 || value > 10) {
                return "ungültige bewertung";
            }
            
            summaryStatistics.accept(value);
            return value.toString();
        }
    }
}

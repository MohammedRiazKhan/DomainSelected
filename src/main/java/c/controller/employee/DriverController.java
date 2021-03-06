package c.controller.employee;

import c.Factory.employee.DriverFactory;
import c.domain.employee.Driver;
import c.service.employee.impl.DriverServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

public class DriverController {

    @RestController
    @RequestMapping("driver")
    public class CleanerController {

        @Autowired
        private DriverServiceImpl service;

        @PostMapping("/new")
        public Driver create(@RequestBody Driver driver){

            //Driver driver = DriverFactory.getDriver(1, "Paul", "Red", "driver", "21 there","021", "29/05/19", "code B");

            return service.create(driver);

        }

        @GetMapping(path = "/find/{id}")
        public Driver findById(@PathVariable int id){

            Driver driver = service.read(id);

            return driver;
        }

        @PutMapping("/update")
        public void update(@RequestBody Driver driver){

            service.update(driver);

        }

        @DeleteMapping(path = "/delete/{id}")
        public void delete(@PathVariable int id) {

            service.delete(id);

        }

        @GetMapping("/getAll")
        public Set<Driver> getAll(){

            return service.getAll();

        }

    }

}

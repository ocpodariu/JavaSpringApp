package ro.teamnet.zth.app.controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ro.teamnet.zth.app.domain.Employee;
import ro.teamnet.zth.app.service.EmployeeService;
import ro.teamnet.zth.app.service.EmployeeServiceImpl;

import java.util.List;

/**
 * Author: Ovidiu
 * Date:   5/6/2015
 */
@Controller
@RequestMapping(value = "/employees")
public class EmployeeController {

    private EmployeeService employeeService = new EmployeeServiceImpl();

    @RequestMapping(method = RequestMethod.GET)
    public @ResponseBody List<Employee> getAllEmployees() {
        return employeeService.findAllEmployees();
    }

    @RequestMapping(value = "/{idEmployee}", method = RequestMethod.GET)
    public @ResponseBody Employee getOneEmployee(@PathVariable("idEmployee") String idEmployee) {
        Integer id = Integer.valueOf(idEmployee);
        return employeeService.findOneEmployee(id);
    }

    @RequestMapping(value = "/{idEmployee}", method = RequestMethod.DELETE)
    @ResponseStatus(value = HttpStatus.OK) // necesar deoarce metoda intoarce void
    public void delete(@PathVariable("idEmployee") String idEmployee) {
        Integer id = Integer.valueOf(idEmployee);
        employeeService.deleteEmployee(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.OK) // necesar deoarce metoda intoarce void
    public void insert(@RequestBody Employee employee) {
        employeeService.insertEmployee(employee);
    }

    @RequestMapping(method = RequestMethod.PUT)
    @ResponseStatus(HttpStatus.OK) // necesar deoarce metoda intoarce void
    public void update(@RequestBody Employee employee) {
        employeeService.updateEmployee(employee);
    }

}

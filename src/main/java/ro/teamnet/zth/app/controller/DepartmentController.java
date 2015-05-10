package ro.teamnet.zth.app.controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ro.teamnet.zth.app.domain.Department;
import ro.teamnet.zth.app.service.DepartmentService;
import ro.teamnet.zth.app.service.DepartmentServiceImpl;

import java.util.List;

/**
 * Author: Ovidiu
 * Date:   5/6/2015
 */
@Controller
@RequestMapping(value = "/departments")
public class DepartmentController {

    private DepartmentService departmentService = new DepartmentServiceImpl();

    @RequestMapping(method = RequestMethod.GET)
    public @ResponseBody List<Department> getAllDepartments() {
        return departmentService.findAllDepartments();
    }

    @RequestMapping(value = "/{idDepartment}", method = RequestMethod.GET)
    public @ResponseBody Department getOneDepartment(@PathVariable("idDepartment") String idDepartment) {
        Integer id = Integer.valueOf(idDepartment);
        return departmentService.findOneDepartment(id);
    }

    @RequestMapping(value = "/{idDepartment}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable("idDepartment") String idDepartment) {
        Integer id = Integer.valueOf(idDepartment);
        departmentService.deleteDepartment(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.OK)
    public void insert(@RequestBody Department department) {
        departmentService.insertDepartment(department);
    }

    @RequestMapping(method = RequestMethod.PUT)
    @ResponseStatus(HttpStatus.OK)
    public void update(@RequestBody Department department) {
        departmentService.updateDepartment(department);
    }

}

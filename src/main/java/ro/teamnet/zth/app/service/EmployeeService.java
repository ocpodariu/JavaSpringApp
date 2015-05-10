package ro.teamnet.zth.app.service;

import ro.teamnet.zth.app.domain.Employee;

import java.util.List;

/**
 * Author: Ovidiu
 * Date:   5/7/2015
 */
public interface EmployeeService {

    List<Employee> findAllEmployees();

    Employee findOneEmployee(Integer id);

    void deleteEmployee(Integer id);

    void insertEmployee(Employee employee);

    void updateEmployee(Employee employee);

}

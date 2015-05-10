package ro.teamnet.zth.app.service;

import ro.teamnet.zth.app.domain.Department;

import java.util.List;

/**
 * Author: Ovidiu
 * Date:   5/10/2015
 */
public interface DepartmentService {

    List<Department> findAllDepartments();

    Department findOneDepartment(Integer id);

    void deleteDepartment(Integer id);

    void insertDepartment(Department department);

    void updateDepartment(Department department);


}

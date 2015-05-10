package ro.teamnet.zth.app.service;

import ro.teamnet.zth.app.dao.DepartmentDao;
import ro.teamnet.zth.app.domain.Department;

import java.util.List;

/**
 * Author: Ovidiu
 * Date:   5/10/2015
 */
public class DepartmentServiceImpl implements DepartmentService {

    private DepartmentDao departmentDao = new DepartmentDao();

    @Override
    public List<Department> findAllDepartments() {
        return departmentDao.getAllDepartments();
    }

    @Override
    public Department findOneDepartment(Integer id) {
        return departmentDao.getDepartmentById(id);
    }

    @Override
    public void deleteDepartment(Integer id) {
        Department department = departmentDao.getDepartmentById(id);
        departmentDao.deleteDepartment(department);
    }

    @Override
    public void insertDepartment(Department department) {
        departmentDao.insertDepartment(department);
    }

    @Override
    public void updateDepartment(Department department) {
        departmentDao.updateDepartment(department);
    }
}

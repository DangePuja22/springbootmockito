package com.csi.dao.test;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.csi.dao.EmployeeDaoImpl;
import com.csi.model.Employee;
import com.csi.repo.EmployeeRepo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootTest
@RunWith(SpringRunner.class)
public class EmployeeDaoImplTest {


    @Autowired
    EmployeeDaoImpl employeeDaoImpl;

    @MockBean
    EmployeeRepo employeeRepoImpl;

    @Test
    public void saveDataTest() {
        Employee employee=new Employee(121,"SWARA","SANGALI",65000.0,new Date(),"SWARA@CSI.com");

        employeeDaoImpl.saveData(employee);

        verify(employeeRepoImpl, times(1)).save(employee);
    }



    @Test
    public void getAllDataTest() {

    when(employeeRepoImpl.findAll()).thenReturn(Stream.of(new Employee(121,"SWARA","SANGALI",65000.0,new Date(),"SWARA@CSI.com"),
            new Employee(122,"PREMA","PUNE",85000.0,new Date(),"PREMA@CSI.com"),
        new Employee(123,"KAJAL","PCMC",55000.0,new Date(),"KAJAL@CSI.com"),
        new Employee(124,"SEJAL","SATARA",75000.0,new Date(),"SEJAL@CSI.com")
        ).collect(Collectors.toList()));


    assertEquals(5,employeeDaoImpl.getAllData().size());
    }

    @Test
    public void updateDataTest() {
        Employee employee=new Employee(121,"SWARA","SANGALI",65000.0,new Date(),"SWARA@CSI.com");

        employeeDaoImpl.udpdateData(employee);

        verify(employeeRepoImpl, times(1)).save(employee);

    }

    @Test
    public void deleteDataByIdTest() {
        Employee employee=new Employee(121,"SWARA","SANGALI",65000.0,new Date(),"SWARA@CSI.com");

        employeeDaoImpl.deleteDataById(employee.getEmpId());

        verify(employeeRepoImpl, times(1)).deleteById(employee.getEmpId());

    }
}




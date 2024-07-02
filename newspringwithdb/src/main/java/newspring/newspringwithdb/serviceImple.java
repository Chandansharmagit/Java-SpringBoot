package newspring.newspringwithdb;

import java.util.ArrayList;
import java.util.List;

public class serviceImple implements service {
    List<Employee> employees = new ArrayList<>();



    @Override
    public List<Employee> reademployee() {
        return employees;
       
    }

    @Override
    public boolean deleteepmploye(Long id) {
       employees.remove(id);
       return true;
    }

    @Override
    public String createemployee(Employee employee) {
        employees.add(employee);
        return "saved sucess";
       
    }

 

    

}

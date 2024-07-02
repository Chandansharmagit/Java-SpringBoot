package newspring.newspringwithdb;

import java.util.List;

public interface service {
  
    List<Employee> reademployee();
    boolean deleteepmploye(Long id);
   
    String createemployee(Employee employee);
    
} 
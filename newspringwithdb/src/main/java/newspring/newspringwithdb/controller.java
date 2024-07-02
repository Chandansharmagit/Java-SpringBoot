package newspring.newspringwithdb;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

    // List<Employee> nn = new ArrayList<>();
    @Autowired
    service newsService = new serviceImple();
   

    @GetMapping("emp")
    public List<Employee> getallemployee() {

        // making the objects
       
        return newsService.reademployee();
    }

    //creating the post method which is actually getting the data from the ui 
    @PostMapping("data")
    public String createemployee(@RequestBody Employee employee){
        return newsService.createemployee(employee);
        
    }

    //deleting the data
    @DeleteMapping("delete-event/{id}")
    public String deleteemployee(@PathVariable Long id){
        if(newsService.deleteepmploye(id)){
            return "deleted";
        }else{
            return "not found";
        }
    }

    
}

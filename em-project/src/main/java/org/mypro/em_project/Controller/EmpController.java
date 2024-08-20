package org.mypro.em_project.Controller;

import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.bson.types.ObjectId;
import org.mypro.em_project.Services.EmpServices;
import org.mypro.em_project.Services.EmpServicesimple;
import org.mypro.em_project.entity.Emplyoee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PutMapping;



//performing CRUD 
@RestController
@RequestMapping("employees")
public class EmpController {

            // List<Emplyoee> employees = new ArrayList<>();
            // IOC container will make object by its own (Inversion of Control)
            
            // dependency Injection
            //for good  practice whenever use  dependency Injection
          
            @Autowired    
           private EmpServicesimple empServices;
            
            // EmpServices empServices=  new EmpServicesimple() ;

                @GetMapping//for reading all entries
                public List<Emplyoee> getAllEmployees() {
                    
                    return empServices.getAllEmployee();
                }
                 

                @PostMapping//for creating
                public String createEmplyoee(@RequestBody Emplyoee employee) {
                        
                    // employees.add(employee);
                    employee.setDate(LocalDateTime.now());
                    return empServices.createEmployee(employee);

                    
                }

                
                @GetMapping("id/{myId}")
                public Emplyoee getMethodName(@PathVariable ObjectId myId) {
                   
                    
                    return  empServices.findById(myId).orElse(null);
                }
                


                @DeleteMapping("id/{myId}")
                public String deleteEmployee(@PathVariable ObjectId myId){

                   empServices.deleteEmployeeById(myId);
                   
                   return "Delete Succesfully";
                       
                    
                }
                
                @PutMapping("id/{myId}")
                public Emplyoee updatEmplyoeeById(@PathVariable ObjectId myId, @RequestBody Emplyoee newEntry) {
                    //TODO: process PUT request

                    Emplyoee old =  empServices.findById(myId).orElse(null);

                    if(old!=null){
                        old.setName(newEntry.getName() !=null && !newEntry.getName().equals("") ? newEntry.getName() : old.getName());
                        old.setEmail(newEntry.getEmail() !=null && !newEntry.getEmail().equals("") ? newEntry.getEmail() : old.getEmail());
                        old.setPhone(newEntry.getPhone() !=null && !newEntry.getPhone().equals("") ? newEntry.getPhone() : old.getPhone());
                        
                    }

                    empServices.createEmployee(old);
                    
                    return old;
                }
                
    
}

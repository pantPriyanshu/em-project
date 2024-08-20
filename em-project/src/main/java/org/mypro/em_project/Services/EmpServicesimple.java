package org.mypro.em_project.Services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.bson.types.ObjectId;
import org.mypro.em_project.entity.Emplyoee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

@Component
public class EmpServicesimple   {

    // List<Emplyoee> employees = new ArrayList<>();

    
    @Autowired
    private EmpServices employ;

    
    public String createEmployee(Emplyoee emplyoee) {

       employ.save(emplyoee);

        return "succesfully added";

    }

 
    public List<Emplyoee> getAllEmployee() { 
        return employ.findAll();
        
    }

    public Optional<Emplyoee> findById(ObjectId id){

                return employ.findById(id);
            }

    
    public void deleteEmployeeById(ObjectId id) {
            
        employ.deleteById(id);

        

       
    }

    



   

}






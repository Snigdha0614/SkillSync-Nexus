package com.talenttrade;
import org.springframework.web.bind.annotation.*;import java.util.*;
@RestController @RequestMapping("/api") @CrossOrigin(origins="http://localhost:5173") public class ApiController{
 private final UserRepository users; private final ServiceRepository services; private final ProjectRepository projects;
 public ApiController(UserRepository u,ServiceRepository s,ProjectRepository p){users=u;services=s;projects=p;}
 @GetMapping("/users") public List<User> users(){return users.findAll();}
 @PostMapping("/users") public User addUser(@RequestBody User u){return users.save(u);}
 @GetMapping("/services") public List<Service> services(){return services.findAll();}
 @PostMapping("/services") public Service addService(@RequestBody Service s){return services.save(s);}
 @GetMapping("/projects") public List<Project> projects(){return projects.findAll();}
 @PostMapping("/projects") public Project addProject(@RequestBody Project p){if(p.status==null)p.status="PENDING";return projects.save(p);}
}

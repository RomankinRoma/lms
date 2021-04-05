package kz.iitu.lms.controller;

import kz.iitu.lms.model.Book;
import kz.iitu.lms.model.User;
import kz.iitu.lms.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private IUserService iUserService;

    @RequestMapping(value = "/create",method = RequestMethod.POST)
    public User create(@RequestBody User o){
        return iUserService.create(o);
    }
    @RequestMapping(value = "/get/{id}",method = RequestMethod.GET)
    public User get(@PathVariable Long id){
        return iUserService.getById(id);
    }
    @RequestMapping(value = "/update",method = RequestMethod.PUT)
    public User update(@RequestBody User o){
        return iUserService.update(o);
    }
    @RequestMapping(value = "/get/all",method = RequestMethod.GET)
    public List<User> get(){
        return iUserService.getAll();
    }
    @RequestMapping(value = "/get/name",method = RequestMethod.GET)
    public List<User> getByName(@Param(value = "fullName")String name){
        return iUserService.getAllByName(name);
    }
    @RequestMapping(value = "/delete/{id}",method = RequestMethod.DELETE)
    public void delete(@PathVariable Long id){
        iUserService.delete(id);
    }
}

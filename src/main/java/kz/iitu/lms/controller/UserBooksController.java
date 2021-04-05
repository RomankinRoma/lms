package kz.iitu.lms.controller;

import kz.iitu.lms.model.UserBooks;
import kz.iitu.lms.service.IUserBooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user/books")
public class UserBooksController {
    
    @Autowired
    private IUserBooksService iUserBooksService;

    @RequestMapping(value = "/create",method = RequestMethod.POST)
    public UserBooks create(@RequestBody UserBooks o){
        return iUserBooksService.create(o);
    }
    @RequestMapping(value = "/get/{id}",method = RequestMethod.GET)
    public UserBooks get(@PathVariable Long id){
        return iUserBooksService.getById(id);
    }
    @RequestMapping(value = "/update",method = RequestMethod.PUT)
    public UserBooks update(@RequestBody UserBooks o){
        return iUserBooksService.update(o);
    }
    @RequestMapping(value = "/get/all",method = RequestMethod.GET)
    public List<UserBooks> get(){
        return iUserBooksService.getAll();
    }
    @RequestMapping(value = "/get/user/{id}",method = RequestMethod.GET)
    public List<UserBooks> getByUser(@PathVariable Long id){
        return iUserBooksService.getAllByUser(id);
    }
    @RequestMapping(value = "/get/book/{id}",method = RequestMethod.GET)
    public List<UserBooks> getByBook(@PathVariable Long id){
        return iUserBooksService.getAllByBook(id);
    }
    @RequestMapping(value = "/delete",method = RequestMethod.DELETE)
    public void delete(@RequestBody UserBooks o){
        iUserBooksService.delete(o);
    }
}

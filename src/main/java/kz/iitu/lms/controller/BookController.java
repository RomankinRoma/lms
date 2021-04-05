package kz.iitu.lms.controller;

import kz.iitu.lms.model.Book;
import kz.iitu.lms.service.IBookService;
import kz.iitu.lms.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private IBookService iBookService;

    @RequestMapping(value = "/create",method = RequestMethod.POST)
    public Book create(@RequestBody Book o){
        return iBookService.create(o);
    }
    @RequestMapping(value = "/get/{id}",method = RequestMethod.GET)
    public Book get(@PathVariable Long id){
        return iBookService.getById(id);
    }
    @RequestMapping(value = "/get/all",method = RequestMethod.GET)
    public List<Book> get(){
        return iBookService.getAll();
    }
    @RequestMapping(value = "/update",method = RequestMethod.PUT)
    public Book update(@RequestBody Book o){
        return iBookService.update(o);
    }
    @RequestMapping(value = "/get/author/{id}",method = RequestMethod.GET)
    public List<Book> getAllByAuthor(@PathVariable Long id){
        return iBookService.getAllByAuthor(id);
    }
    @RequestMapping(value = "/get/name",method = RequestMethod.GET)
    public List<Book> getByName(@Param(value = "fullName")String name){
        return iBookService.getAllByName(name);
    }
    @RequestMapping(value = "/get/desc",method = RequestMethod.GET)
    public List<Book> getByDesc(@Param(value = "desc")String desc){
        return iBookService.getAllByDesc(desc);
    }
    @RequestMapping(value = "/delete/{id}",method = RequestMethod.DELETE)
    public void delete(@PathVariable Long id){
        iBookService.delete(id);
    }
}

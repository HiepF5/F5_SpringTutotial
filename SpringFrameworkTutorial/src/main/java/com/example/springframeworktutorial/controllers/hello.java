package com.example.springframeworktutorial.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class hello {
    @GetMapping("/hello")
    public String helloWord(){
        return "hello";
    }
    /*
    pa1 và pa2 là 2 giá trị trên URL http://localhost:8080/hellos?pa1=a&pa2=b
    p1, p2 là 2 tương tự 2 biến trong hàm và sẽ trả về giá trị cho 2 pa1,pa2 truyền vào ở trên
    */
    @GetMapping("/hellos")
    public String getDetails(
            @RequestParam(value="pa1", required=true) String p1,
            @RequestParam(value="pa2", required=false) String p2)
            {
                return "hello";

            }

}



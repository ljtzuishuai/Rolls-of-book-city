import book.manager.entity.Book;
import org.junit.jupiter.api.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import book.manager.service.BookService;
import book.manager.entity.Book;
import book.manager.entity.Borrow;
import book.manager.entity.BorrowDetails;
import book.manager.mapper.BookMapper;
import book.manager.mapper.UserMapper;
import book.manager.service.BookService;

import book.manager.service.AuthService;
import book.manager.service.BookService;
import book.manager.service.StatService;

import book.manager.service.AuthService;
import book.manager.service.BookService;
import book.manager.service.StatService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import javax.annotation.Resource;
import java.util.List;

public class MainTest {

    //加密测试
    @Test
    public void test_password_hide1(){
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        System.out.println(encoder.encode("123456"));
    }

    @Test
    public void test_password_hide2(){
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        System.out.println(encoder.encode("pzh"));
    }

    @Test
    public void test_password_hide3(){
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        System.out.println(encoder.encode("pzh_1212"));
    }

    @Test
    public void test_password_hide4(){
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        System.out.println(encoder.encode("....."));
    }

    @Test
    public void test_password_hide5(){
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        System.out.println(encoder.encode(" "));
    }

    @Test
    public void test_password_hide6(){
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        System.out.println(encoder.encode(" "));
    }


}
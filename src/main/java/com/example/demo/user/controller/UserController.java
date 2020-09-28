package com.example.demo.user.controller;
import com.example.demo.enums.GradeEnum;
import com.example.demo.user.entity.User;
import com.example.demo.user.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author jobob
 * @since 2020-09-28
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @PostMapping()
    public void saveStudent(){
        User user=new User();
        user.setAge(1).setEmail("120@qq.com").setName("小米").setGrade(GradeEnum.HIGH);
        int insert = userMapper.insert(user);
        System.out.println(insert);


    }

    @DeleteMapping()
    public void deleteStudent(){
        int row = userMapper.deleteById(1);
        System.out.println(row);

    }
    @GetMapping()
    public List<User> getStudent(){
        return userMapper.selectList(null);
    }

}

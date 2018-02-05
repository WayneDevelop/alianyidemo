package com.wayne.daliylife.test;

import com.wayne.daliylife.dao.UserDao;
import com.wayne.daliylife.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class UserController {

    @Autowired
    private UserDao userRepos;

    @RequestMapping("/hello")
    @ResponseBody
    public String index() {
        return "Hello Worldsfdasfdasfgasrfwq";
    }

    @RequestMapping("/")
    @ResponseBody
    public String indexs() {
        return "Hello Worldsfdasfdasfgasdfsadasdasdadasdadasdarfwq";
    }

   @RequestMapping(value="/hello",method= RequestMethod.GET)
    public String hello(){
        return "index";
    }

    @RequestMapping(value="/qq", method= RequestMethod.GET)
    public ModelAndView login(){
        ModelAndView mv = new ModelAndView("index");
        return mv;
    }

   @RequestMapping(value="/saveUser")
   public User saveUser(){
        return userRepos.save(new User("324234","34234" ,"45r435" ,"weqe" ,"sdadd"));
    }

  /*  @RequestMapping(value="findByUserName")
    public List<User> findByUserName(String userName){
        return userRepos.findByUserName(userName);
    }

    @RequestMapping(value="findByUserNameLike")
    public List<User> findByUserNameLkie(String userName){
        return userRepos.findByUserNameLike(userName);
    }

    @RequestMapping(value="findByPage")
    public Page<User> findByPage(Integer userType){
        return userRepos.findByUserType(userType, new PageRequest(1, 5));
    }

    @RequestMapping(value="findByPageSort")
    public List<User> findByPageSort(String userName){
        return userRepos.findByUserName(userName, new Sort(Direction.DESC, "registerTime"));
    }*/

}

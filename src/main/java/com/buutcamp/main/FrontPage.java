package com.buutcamp.main;

import com.buutcamp.objects.SimpleUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class FrontPage {

    @Autowired
    @Qualifier("sessionUser")
    private SimpleUser sessionUser;

    @Autowired
    @Qualifier("requestUser")
    private SimpleUser requestUser;

    @RequestMapping(value="/",method= RequestMethod.GET)
    public String frontPageGET(Model model) {

        model.addAttribute("webBeans", "Session user age " + sessionUser.getAge() +
                            "     Request user age " + requestUser.getAge());

        return "front-page";
    }
    @RequestMapping(value="/",method= RequestMethod.POST)
    public String frontPagePOST(Model model) {

        return "front-page";
    }
}

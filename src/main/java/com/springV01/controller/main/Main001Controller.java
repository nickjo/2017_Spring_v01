package com.springV01.controller.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by nick on 17. 3. 20.
 */

@Controller
public class Main001Controller {
    private static final Logger log = LoggerFactory.getLogger(Main001Controller.class);

    @RequestMapping(value = "mainPage.do")
    public String mainPage(){
        return "main/mainPage";
    }

    @RequestMapping("/selectMainPageData.do")
    public void selectMainPage(Model model){
//        model.addAttribute("board", boardDao.findAll());

//        log.info("###selectMainPage: " + model.toString());

        log.info("####selectMainPage.do controller");
    }

//
    @RequestMapping(value = "mv_boardPage.do")
    public String mv_boardPage(){
        log.info("####mv_boardPage.do controller");

        return "board/boardPage";
    }
}

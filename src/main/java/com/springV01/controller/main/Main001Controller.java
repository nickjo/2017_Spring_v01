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

    @RequestMapping(value = "mv_restBoard.do")
    public String mv_restBoard(){
        log.info("####mv_restBoard.do controller");

        return "board/restBoard001R1";
    }

    @RequestMapping(value = "mv_loginPage.do")
    public String mv_loginPage(){
        log.info("####mv_loginPage.do controller");

        return "login/loginPage001R1";
    }

    @RequestMapping(value = "mv_aboutPage.do")
    public String mv_aboutPage(){
        log.info("###mv_aboutPage.do controller");

        return "login/aboutPage001R1";
    }

    @RequestMapping(value = "mv_indexPage.do")
    public String mv_indexPage(){
        log.info("###mv_aboutPage.do controller");

        return "main/indexPage";
    }

    @RequestMapping(value = "boardList.do")
    public String boardList(Model model) throws Exception{
        log.info("###boardList.do");

        return "main/boardList";
    }

    @RequestMapping(value = "mainTiles.do")
    public String mainTiles(Model model) throws Exception{
        log.info("###mainTiles.do");

        return "/tiles/mainTiles";
    }

    @RequestMapping(value = "mv_joinPage.do")
    public String mv_joinPage(Model model) throws Exception{
        log.info("###mv_joinPage.do");

        return "/tiles/joinTiles";
    }
}

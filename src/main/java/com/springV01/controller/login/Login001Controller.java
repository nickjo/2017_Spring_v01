package com.springV01.controller.login;

import com.framework.util.RequestUtil;
import net.sf.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * Created by nick on 17. 9. 4.
 */

@Controller
public class Login001Controller {
    private static final Logger log = LoggerFactory.getLogger(Login001Controller.class);

    @RequestMapping(value = "join.do", method = RequestMethod.POST)
    public String memeber_join(HttpServletRequest request, HttpServletResponse response){
        log.info("----join.do----");

        JSONObject result  = new JSONObject();

        //Map<?, ?> inData = RequestUtil.getParameterMap(request);

        String name = request.getParameter("userName");
        String email = request.getParameter("userEmail");
        String password = request.getParameter("userPw");

        log.info("##name: " + name + ", email: " + email + ", password: " + password);



        return "/tiles/mainTiles";
    }




}

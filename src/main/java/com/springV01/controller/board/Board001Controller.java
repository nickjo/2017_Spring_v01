package com.springV01.controller.board;

import com.framework.util.Constant;
import com.framework.util.RequestUtil;
import com.google.gson.Gson;
import com.springV01.service.board.Board001Service;
import com.springV01.util.AjaxResponseUtil;
import net.sf.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * Created by nick on 17. 3. 20.
 */
@Controller
public class Board001Controller {
    private static final Logger log = LoggerFactory.getLogger(Board001Controller.class);

    @Resource(name = "board001Service")
    private Board001Service board001Serv;

    @RequestMapping(value = "selectBoard.do")
    public void selectBoard(HttpServletRequest request, HttpServletResponse response) throws Exception{
        log.info("#####selectBoard.do##########");
        JSONObject result = new JSONObject();
        Gson gson  = new Gson();

        Map<String, Object> inData = RequestUtil.getParameterMap(request);
        Map<String, Object> outData = board001Serv.board001R1((StringBuilder)request.getAttribute("logStr"), inData);
        log.info("#####selectBoard.do: " + outData.toString());
        log.info("#####selectBoard.do >> OUT_DATA: " + outData.get(Constant.OUT_DATA));
        log.info("#####selectBoard.do >> gson: " + gson.toJson(outData.get(Constant.OUT_DATA)));
//        log.info("#####selectBoard.do: " + outData.get(Constant.OUT_DATA));

        result.put(Constant.RESULT, Constant.RESULT_SUCCESS);
        result.put("BOARD_DATA", gson.toJson(outData.get(Constant.OUT_DATA)));

        response.setContentType("application/x-json; charset=UTF-8");
        response.getWriter().print(result);
    }

    @RequestMapping(value = "mv_readBoardpage.do")
    public String mv_readBoardpage(HttpServletRequest request, HttpServletResponse response) throws Exception{
        Map<String, Object> inData = RequestUtil.getParameterMap(request);

        log.info("####mv_readBoardpage: " + inData.toString());

        return "board/board001R2";
    }
}










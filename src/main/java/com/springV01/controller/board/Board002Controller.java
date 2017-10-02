package com.springV01.controller.board;

import org.apache.commons.collections.map.HashedMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * Created by nick on 17. 6. 18.
 */

@RestController
public class Board002Controller {
    @RequestMapping(value = "board002_n01", method = RequestMethod.GET)
    public Map<String, Object> board002_n01(){
        Map<String, Object> inData = new HashedMap();

        inData.put("Number01", "Number01Data");
        return inData;
    }
}

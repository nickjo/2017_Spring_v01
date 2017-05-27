package com.springV01.service.board;

import com.framework.service.BaseService;
import com.framework.util.Constant;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by nick on 17. 3. 20.
 */

@Service("board001Service")
public class Board001Service extends BaseService{
    /*
    * select tb_board
    * */
    public Map<String, Object> board001R1(StringBuilder logStr, Map<String, Object> inData) throws Exception{
        Map<String, Object> result = new HashMap<>();

        log.info("###Board001Service####");
        result.put(Constant.OUT_DATA, mtDao.queryForList("com.springV01.mapper.Board001Mapper.board001R1", inData));
        log.info("###Board001Service: " + result.toString());

        return result;
    }
}

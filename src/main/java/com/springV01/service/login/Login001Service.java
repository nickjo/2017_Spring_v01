package com.springV01.service.login;

import com.framework.service.BaseService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by nick on 17. 9. 23.
 */

@Service("login001Service")
public class Login001Service extends BaseService{

    /*
    * New Member Infomation Insert into DB
    * */
    public Map<?,?> login001C1(StringBuilder logStr, Map<?,?> inData) throws Exception{
        Map<?,?> result = new HashMap<>();

        mtDao.queryForInsert("com.springV01.mapper.Login001Mapper.login001C1", inData);

        return result;
    }
}

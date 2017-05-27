package com.springV01.util;

import com.framework.util.Constant;
import net.sf.json.JSONObject;

import java.util.Map;

/**
 * Created by nick on 17. 5. 12.
 */
public class AjaxResponseUtil {
    /**
     * controller의 json 형식 출력 형식을 자동 지정하는 메서드
	 * @param result 출력 jsonObject 객체
	 * @param inData request객체의 파라미터 Map 객체
	 * @param outData service에서 반환된 Map 결과 객체
    * */
    public static void setResObjAuto(JSONObject result, Map<String, Object> inData, Map<String, Object> outData){
        if (Constant.RESULT_SUCCESS.equals(outData.get(Constant.RESULT))){
            setResObj(result, outData);
        }
        else{
            AjaxResponseUtil.setResErrObj(result, outData, outData.get(Constant.RESULT_MSG).toString());
        }
    }

    /**
     * json오브젝트에 처리 성공과 데이터 메시지를 적용하는 메서드<br>
     * 아래와 같이 json이 추가된다.<p>
     * <pre>
     * {
     *     RESULT: "RESULT_SUCCESS",
     *     OUT_DATA: outData.get("OUT_DATA"),
     *     OUT_DATA_CNT: outData.get("OUT_DATA_CNT)
     * }
     * </pre>
     * @param result 출력 jsonObject 객체
     * @param outData service에서 반환된 Map 결과 객체
     */
    public static void setResObj(JSONObject result, Map<String, Object> outData){
        result.put(Constant.RESULT, Constant.RESULT_SUCCESS);
        result.put(Constant.OUT_DATA, outData.get(Constant.OUT_DATA));
    }

    /**
     * json오브젝트에 서비스단의 처리 실패에 대한 메시지를 적용하는 메서드<br>
     * 아래와 같이 json이 추가된다.<p>
     * <pre>
     * {
     *     RESULT: "RESULT_FAILURE",
     *     RESULT_MSG: msg,
     *     RESULT_ERRNM: outData.get(RESULT_ERRNM)
     * }
     * </pre>
     * @param result 출력 jsonObject 객체
     * @param outData service에서 반환된 Map 결과 객체
     * @param msg 화면에 출력할 에러 메시지
     */
    public static void setResErrObj(JSONObject result, Map<String, Object> outData, String msg){
        result.put(Constant.RESULT, Constant.RESULT_FAILURE);
        result.put(Constant.RESULT_MSG, msg);
        result.put(Constant.RESULT_ERRNM, outData.get(Constant.RESULT_ERRNM));
    }



}

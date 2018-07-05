package cn.licoy.scl.productservice.utils;


import cn.licoy.scl.productservice.vo.ResultVO;

/**
 * @author licoy.cn
 * @version 2018/7/5
 */
public class ResultVOUtil {

    public static ResultVO success(Object object) {
        ResultVO resultVO = new ResultVO();
        resultVO.setData(object);
        resultVO.setCode(0);
        resultVO.setMsg("成功");
        return resultVO;
    }
}

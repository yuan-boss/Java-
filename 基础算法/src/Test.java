import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


/**
 * @module:
 * @description:
 * @author: yuan_boss
 * @create: 2022-08-30 15:47
 **/
public class Test {
    public static void main(String[] args) {
    }
    /**
     * @Author yuan_boss
     * @Description 编码格式： 前缀 + 数字
     * @Date 10:16 2022/9/6
     * @Param codeMax 最大编码
     * @Param prefix 编码前缀
     * @Param len 编码数字长度
     * @return
     **/
    public static String generatorCode(String codeMax,String prefix,int len){
        String res = null;
        //如果为空,设置为 prefix + (len-1)个0 + 1
        if (codeMax.isEmpty()){
            res = prefix + String.format("%0"+len + "d",1);
        }else {
            //截取前缀后的数字编码
            String codeNumber = codeMax.substring(prefix.length());
            int i = Integer.parseInt(codeNumber) + 1;
            res = prefix + String.format("%0"+len + "d",i);
        }
        return res;
    }
}

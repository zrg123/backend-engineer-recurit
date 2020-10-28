
import java.util.List;

public class Max {
    /**
     * 得到list的最大值
     * @param valueList 传入包含整数的list
     * @return
     */
    public static Integer getMaxValue (List valueList)  {
        if (valueList == null || valueList.isEmpty()){
            throw new NullPointerException("参数valueList集合为空");
        }
        Integer tempMaxValue = null;
        for (Object getValue : valueList) {
            if (getValue instanceof Integer) {
                Integer temp = (Integer)getValue ;
                if(tempMaxValue==null||temp>tempMaxValue){
                    tempMaxValue = temp;
                }
            }
        }

        if (tempMaxValue == null) {
            throw new NullPointerException("getMaxValue没有找到最大值,valueList不包含整数");
        }
        return  tempMaxValue;
    }
}

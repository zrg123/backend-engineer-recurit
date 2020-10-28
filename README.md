# 双链科技java后台工程师招聘

因为业务发展需要，双链科技正在招聘工程师。但每天收到大量内容非常相似的简历，简历筛选让我们头痛不已，而软件工程师还是要靠代码说话的，所以不如看代码直接一些。


请完成下列函数，从一个List中取得最大整型值：

```java

pulic static Integer getMaxValue(List valueList){
    return  null;
}

```

## 要求：

* Java 8可编译通过并运行
* 把您这样做的原因写下来
* **严谨**! **严谨**! **严谨**! 设想这段代码需要在航天器上运行

## 提示：
* 这是一个公用函数，请考虑这个函数的安全性，健壮性，在小规模数据量下10000条的性能；
* 不要使用Collections.max等函数来实现
* 函数命名对于长期维护非常重要，就像希腊语之于数学，英语是计算机的母语，故请使用美式英语命名变量；
* 本考题看似简单，但是考到的知识点非常多，我们需要基础知识扎实并且严谨的软件工程师；
* 请在**一个小时内完成**本函数，不同水平的程序员做到的程度会不一样，这很正常；
* 您可以fork本项目，在您自己的github账号的本页面完成，您的答案属于您；
* 完成之后，请使用您在github的账号邮箱（可能您需要把该邮箱设置为公开)发送通知到 zhangxilai#doublechaintech.com，通知中请包含你的github repo地址和您的答案(方便我查看）
* 可以封装额外的函数
* 错误消息友好

## 邮件要求

* 邮件标题中格式如下  渠道-Java工程师-姓名
* 函数实现直接写到邮件正文中，**不要**使用附件来写答案，也**不要**发送链接，以便于在移动环境中查看
* 您这么做的理由

```
//在您自己的READ.md中，答案写到下面的位置
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


//这样做的原因写到下面
首先这段代码的主体是查询最大整数值，先把主体代码写出来，在考虑传参问题，如：1、集合是否存在整数（因为没有指定集合类型所以任何数据类型都可以），2、集合如果是为空那么直接报错，
我也有考虑代码不断地使用Integer会不会导致GC频繁的问题，但是想到传递的都是Integer对象而不是int就不会造成这种现象。
```

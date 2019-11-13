package com.bw.utils;
/*1.字符串工具类的编写
 要求:封装一个工具类DateUtil,包含以下方法
方法1：根据传入的日期获取年龄
//示例:
public static int getAge (Date src) {
//TODO
}
方法2：根据传入的参数获取该日期的月初日期，例如给定的日期为“2019-09-19 19:29:39”，返回“2019-09-01 00:00:00”
//示例:
public static Date getDateByMonthInit (Date src) {
//TODO
}
方法3 :根据传入的参数获取该日器的月末日期，例如给定的日期为“2019-09-19 19:29:39”，返回“2019-09-30 23:59:59”，注意月大月小以及闰年。
//示例:
public static Date getDateByMonthLast(Date src) {
//TODO
}
方法4：求未来日期离今天还剩的天数
//示例:
public static int getDaysByFuture (Date future) {
//TODO
}
方法5：求过去日期离今天过去的天数
//示例:
public static int getDaysByDeparted (Date departed) {
//TODO
}
*/
public class Utils {
	public static void main(String[] args) {
		//查看年龄
		System.out.println(DateUtils.getAge("1999-01-17"));
		//月初第一天
		System.out.println(DateUtils.getMonthBegin("2019-11-13"));
		//月末最后一天
		System.out.println(DateUtils.getMonthLastBegin("2019-11-13"));
		//未来到今天
		System.out.println(DateUtils.getFutureDays("2020-11-13"));
		//过去到今天
		System.out.println(DateUtils.getFutureDay("1999-01-17"));
	}

}

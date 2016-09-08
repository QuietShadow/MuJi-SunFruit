package muji.fruit.utils;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 日期和时间转换工具类
 * @author CHW
 *
 */
public class TimeUtils
{
	/**
	 * 私有构造器，令其无法实例化
	 */
	private TimeUtils()	{}
	/**
	 * 获取日期
	 * @param  dateStr String类型日期，格式yyyyMMdd，例20160818
	 * @return Date:Date类型时间
	 * @throws Exception
	 */
	public static Date string2Date(String dateStr) throws Exception{
		SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMdd");
		return sdf.parse(dateStr);
	}
	/**
	 * 获取日期时间
	 * @param  dateStr String类型日期，格式yyyyMMddHHmmSS，例20160818155623
	 * @return Date:Date类型时间
	 * @throws Exception
	 */
	public static Date string2DateTime(String dateStr)throws Exception{
		SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMddHHmmSS");
		return sdf.parse(dateStr);
	}
	/**
	 * 获取表达式格式的日期
	 * @param dateStr String类型日期
	 * @param expression 表达式，例yyyyMMdd、yyyyMMddHHmmSS
	 * @return Date:Date类型时间
	 * @throws Exception 
	 */
	public static Date string2Date(String dateStr,String expression) throws Exception{
		SimpleDateFormat sdf=new SimpleDateFormat(expression);
		return sdf.parse(dateStr);
	}
	/**
	 * 获取String类型的日期
	 * @param date Date类型时间，格式：yyyyMMdd
	 * @return String类型日期
	 */
	public static String date2String(Date date) throws Exception{
		SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMdd");
		return sdf.format(date);
	}
	/**
	 * 获取String类型的日期
	 * @param date Date类型时间，格式：yyyyMMddHHmmSS
	 * @return String类型日期
	 */
	public static String date2StringTime(Date date) throws Exception{
		SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMddHHmmSS");
		return sdf.format(date);
	}
	/**
	 * 获取String类型的日期时间
	 * @param date Date类型时间，格式：yyyyMMdd
	 * @return String类型日期时间
	 */
	public static String date2String(Date date,String expression) throws Exception{
		SimpleDateFormat sdf=new SimpleDateFormat(expression);
		return sdf.format(date);
	}
}

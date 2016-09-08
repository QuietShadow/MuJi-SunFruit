package muji.fruit.utils;
import java.math.BigDecimal;
/**
 * 利用BigDecimal精确运算Double的工具类
 * @author CHW
 *
 */
public class DoubleUtils
{
	/** 默认除法运算精度 */
	private static final int DEF_DIV_SCALE = 10;
	/**
	 * 构造器私有，让这个类不能实例化
	 */
	private DoubleUtils()	{}
	/**
	 * 提供精确的加法运算。
	 * @param v1 加数
	 * @param v2 被加数
	 * @return double类型结果
	 */
	public static double add(double v1,double v2)
	{
		BigDecimal b1 = BigDecimal.valueOf(v1);
		BigDecimal b2 = BigDecimal.valueOf(v2);
		return b1.add(b2).doubleValue();
	}
	/**
	 * 提供精确的减法运算。
	 * @param v1 减数
	 * @param v2 被减数
	 * @return double类型结果
	 */
	public static double sub(double v1,double v2)
	{
		BigDecimal b1 = BigDecimal.valueOf(v1);
		BigDecimal b2 = BigDecimal.valueOf(v2);
		return b1.subtract(b2).doubleValue();
	}
	/**
	 * 提供精确的乘法运算。
	 * @param v1 乘数
	 * @param v2 被乘数
	 * @return double类型结果
	 */
	public static double mul(double v1,double v2)
	{
		BigDecimal b1 = BigDecimal.valueOf(v1);
		BigDecimal b2 = BigDecimal.valueOf(v2);
		return b1.multiply(b2).doubleValue();
	}
	/**
	 *  提供（相对）精确的除法运算，当发生除不尽的情况时，精确到小数点以后10位的数字四舍五入。
	 * @param v1 除数
	 * @param v2 被除数
	 * @return double类型结果
	 */
	public static double div(double v1,double v2)
	{
		BigDecimal b1 = BigDecimal.valueOf(v1);
		BigDecimal b2 = BigDecimal.valueOf(v2);
		return b1.divide(b2 , DEF_DIV_SCALE
			, BigDecimal.ROUND_HALF_UP).doubleValue();
	}

}

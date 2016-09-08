package muji.fruit.utils;
import java.math.BigDecimal;
/**
 * ����BigDecimal��ȷ����Double�Ĺ�����
 * @author CHW
 *
 */
public class DoubleUtils
{
	/** Ĭ�ϳ������㾫�� */
	private static final int DEF_DIV_SCALE = 10;
	/**
	 * ������˽�У�������಻��ʵ����
	 */
	private DoubleUtils()	{}
	/**
	 * �ṩ��ȷ�ļӷ����㡣
	 * @param v1 ����
	 * @param v2 ������
	 * @return double���ͽ��
	 */
	public static double add(double v1,double v2)
	{
		BigDecimal b1 = BigDecimal.valueOf(v1);
		BigDecimal b2 = BigDecimal.valueOf(v2);
		return b1.add(b2).doubleValue();
	}
	/**
	 * �ṩ��ȷ�ļ������㡣
	 * @param v1 ����
	 * @param v2 ������
	 * @return double���ͽ��
	 */
	public static double sub(double v1,double v2)
	{
		BigDecimal b1 = BigDecimal.valueOf(v1);
		BigDecimal b2 = BigDecimal.valueOf(v2);
		return b1.subtract(b2).doubleValue();
	}
	/**
	 * �ṩ��ȷ�ĳ˷����㡣
	 * @param v1 ����
	 * @param v2 ������
	 * @return double���ͽ��
	 */
	public static double mul(double v1,double v2)
	{
		BigDecimal b1 = BigDecimal.valueOf(v1);
		BigDecimal b2 = BigDecimal.valueOf(v2);
		return b1.multiply(b2).doubleValue();
	}
	/**
	 *  �ṩ����ԣ���ȷ�ĳ������㣬�����������������ʱ����ȷ��С�����Ժ�10λ�������������롣
	 * @param v1 ����
	 * @param v2 ������
	 * @return double���ͽ��
	 */
	public static double div(double v1,double v2)
	{
		BigDecimal b1 = BigDecimal.valueOf(v1);
		BigDecimal b2 = BigDecimal.valueOf(v2);
		return b1.divide(b2 , DEF_DIV_SCALE
			, BigDecimal.ROUND_HALF_UP).doubleValue();
	}

}

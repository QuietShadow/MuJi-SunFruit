package muji.fruit.utils;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * ���ں�ʱ��ת��������
 * @author CHW
 *
 */
public class TimeUtils
{
	/**
	 * ˽�й������������޷�ʵ����
	 */
	private TimeUtils()	{}
	/**
	 * ��ȡ����
	 * @param  dateStr String�������ڣ���ʽyyyyMMdd����20160818
	 * @return Date:Date����ʱ��
	 * @throws Exception
	 */
	public static Date string2Date(String dateStr) throws Exception{
		SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMdd");
		return sdf.parse(dateStr);
	}
	/**
	 * ��ȡ����ʱ��
	 * @param  dateStr String�������ڣ���ʽyyyyMMddHHmmSS����20160818155623
	 * @return Date:Date����ʱ��
	 * @throws Exception
	 */
	public static Date string2DateTime(String dateStr)throws Exception{
		SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMddHHmmSS");
		return sdf.parse(dateStr);
	}
	/**
	 * ��ȡ���ʽ��ʽ������
	 * @param dateStr String��������
	 * @param expression ���ʽ����yyyyMMdd��yyyyMMddHHmmSS
	 * @return Date:Date����ʱ��
	 * @throws Exception 
	 */
	public static Date string2Date(String dateStr,String expression) throws Exception{
		SimpleDateFormat sdf=new SimpleDateFormat(expression);
		return sdf.parse(dateStr);
	}
	/**
	 * ��ȡString���͵�����
	 * @param date Date����ʱ�䣬��ʽ��yyyyMMdd
	 * @return String��������
	 */
	public static String date2String(Date date) throws Exception{
		SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMdd");
		return sdf.format(date);
	}
	/**
	 * ��ȡString���͵�����
	 * @param date Date����ʱ�䣬��ʽ��yyyyMMddHHmmSS
	 * @return String��������
	 */
	public static String date2StringTime(Date date) throws Exception{
		SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMddHHmmSS");
		return sdf.format(date);
	}
	/**
	 * ��ȡString���͵�����ʱ��
	 * @param date Date����ʱ�䣬��ʽ��yyyyMMdd
	 * @return String��������ʱ��
	 */
	public static String date2String(Date date,String expression) throws Exception{
		SimpleDateFormat sdf=new SimpleDateFormat(expression);
		return sdf.format(date);
	}
}

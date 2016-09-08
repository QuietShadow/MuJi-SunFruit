package muji.fruit.utils;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * ��ȡSpringFactory�е�bean
 * @author CHW
 *
 */

public class SpringContextUtil implements ApplicationContextAware {  
	  

    private static ApplicationContext applicationContext;  
    /**
	 * ������˽�У�������಻��ʵ����
	 */
    private SpringContextUtil() {}
  
    public void setApplicationContext(ApplicationContext applicationContext) {  
        SpringContextUtil.applicationContext = applicationContext;  
    }  
  
    public static ApplicationContext getApplicationContext() {  
        return applicationContext;  
    }  
  
  /**
   * ��ȡBEAN
   * @param name BEAN����
   * @return BEAN��
   * @throws BeansException
   */
    public static Object getBean(String name) throws BeansException {  
        return applicationContext.getBean(name);  
    }  
}


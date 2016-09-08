package muji.fruit.utils;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * 获取SpringFactory中的bean
 * @author CHW
 *
 */

public class SpringContextUtil implements ApplicationContextAware {  
	  

    private static ApplicationContext applicationContext;  
    /**
	 * 构造器私有，让这个类不能实例化
	 */
    private SpringContextUtil() {}
  
    public void setApplicationContext(ApplicationContext applicationContext) {  
        SpringContextUtil.applicationContext = applicationContext;  
    }  
  
    public static ApplicationContext getApplicationContext() {  
        return applicationContext;  
    }  
  
  /**
   * 获取BEAN
   * @param name BEAN名称
   * @return BEAN类
   * @throws BeansException
   */
    public static Object getBean(String name) throws BeansException {  
        return applicationContext.getBean(name);  
    }  
}


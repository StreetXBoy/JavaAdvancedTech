package CGLibProxy;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author 重新做人idea基础学习
 * @date 2020-12-02
 */

//https://blog.csdn.net/qq_32532321/article/details/81874990

public class HelloInterceptor implements MethodInterceptor {

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("begin time---->"+System.currentTimeMillis());
        Object o1=methodProxy.invokeSuper(o,objects);
        System.out.println("end time------>" +System.currentTimeMillis());
        return o1;
    }
}

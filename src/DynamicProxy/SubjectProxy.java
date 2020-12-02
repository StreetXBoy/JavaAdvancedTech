package DynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author 重新做人idea基础学习
 * @date 2020-12-02
 */
public class SubjectProxy implements InvocationHandler {
    private Subject subject;
    public SubjectProxy(Subject subject){
        this.subject=subject;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("-----begin--------");
        Object invoke=method.invoke(subject,args);
        System.out.println("-------end----------");
        return invoke;
    }
}

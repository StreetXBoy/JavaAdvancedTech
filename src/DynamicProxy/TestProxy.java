package DynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author 重新做人idea基础学习
 * @date 2020-12-02
 */
public class TestProxy {
    public static void main(String[] args) {
        Subject subject=new SubjectImpl();
        InvocationHandler subjectProxy=new SubjectProxy(subject);
        Subject proxyInstance=(Subject) Proxy.newProxyInstance(subject.getClass().getClassLoader(),subject.getClass().getInterfaces(),subjectProxy);
        //解释：
        // subject.getClass().getClassLoader()------->  代理类加载器
        // subject.getClass().getInterfaces() --------->被代理的接口，如果有多个就是数组方式传入
        // subjectProxy ------>代理类实例！！
        proxyInstance.hello("fuck yours");
    }
}

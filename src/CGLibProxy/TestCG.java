package CGLibProxy;

import net.sf.cglib.proxy.Enhancer;

/**
 * @author 重新做人idea基础学习
 * @date 2020-12-02
 */

//需要asm.jar!!!!


public class TestCG {
    public static void main(String[] args) {
        Enhancer enhancer =new Enhancer();
        enhancer.setSuperclass(CGSubject.class);
        enhancer.setCallback(new HelloInterceptor());
        CGSubject cgSubject=(CGSubject)enhancer.create();
        cgSubject.sayhello();
    }
}

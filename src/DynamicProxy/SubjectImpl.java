package DynamicProxy;

/**
 * @author 重新做人idea基础学习
 * @date 2020-12-02
 */
public class SubjectImpl implements Subject{
    @Override
    public void hello(String param) {
        System.out.println("hello : "+param);
    }
}

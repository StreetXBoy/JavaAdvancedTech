package Reflect;

import java.io.File;
import java.lang.reflect.*;

/**
 * @author 重新做人idea基础学习
 * @date 2020-12-01
 */

//1、获取Class对象的三种方式
//
//1.1 Object ——> getClass();
//1.2 任何数据类型（包括基本数据类型）都有一个“静态”的class属性
//1.3 通过Class类的静态方法：forName（String  className）(常用)



//参考https://www.cnblogs.com/chanshuyi/p/head_first_of_reflection.html


public class reflectTest {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        example example=new example(1,"2","g",12);
        Class ex=example.getClass();
        System.out.println(ex);
//        class Reflect.example

        System.out.println(example.getClass());
//        class Reflect.example

        Class ex1=Class.forName("Reflect.example");
        System.out.println(ex1);
//        class Reflect.example

        Method method=ex1.getMethod("setAge", int.class);
        Constructor constructor=ex1.getConstructor();
        Object object =constructor.newInstance();

//      ????  什么意思就是 -----》 new ex1 setAge（4）
        method.invoke(object,4);
        Method getAgeMethod=ex1.getMethod("getAge");

        System.out.println(getAgeMethod.invoke(object));

        Field[] fileds =ex1.getDeclaredFields();

        Constructor[] constructors=ex1.getDeclaredConstructors();

        for (Field filed:fileds){
            System.out.println(filed.getName());
//            age
//            name
//            sex
        }

        for (Constructor constructor1:constructors){
            System.out.print(Modifier.toString(constructor1.getModifiers()));
            Class[] params=constructor1.getParameterTypes();
            for(Class param:params){
                System.out.print(" "+param.getName()+"  ");
            }
            System.out.println("");
        }

//        public int
//        public
//        public int   java.lang.String   java.lang.String   int 如何获取构造函数！！！！


         Method privateMethod =ex1.getDeclaredMethod("xprint", int.class);
        privateMethod.setAccessible(true);
         privateMethod.invoke(object,1);




    }

}

/**
 * @Author Maw
 * @Date 2021/3/7 16:45
 * @Version 1.0
 */
//懒汉模式
public class LazySingle {

    //初始化实例对象为空
    private static LazySingle instance = null;

    //私有化构造方法 不对外调用
    private LazySingle(){
    }

    //公有化获取实例对象方法
    public LazySingle getInstance(){
        if(instance==null){
            return new LazySingle();
        }else {
            return instance;
        }
    }
}

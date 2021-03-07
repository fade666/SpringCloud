/**
 * @Author Maw
 * @Date 2021/3/7 16:44
 * @Version 1.0
 */
//饿汉模式
public class HungarySingle {

    private static HungarySingle instance = new HungarySingle();

    private HungarySingle(){

    }

    public HungarySingle getInstance(){
        return instance;
    }
}

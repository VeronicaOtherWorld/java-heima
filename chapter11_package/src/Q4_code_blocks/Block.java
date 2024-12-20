package Q4_code_blocks;

/**
 * 局部代码块
 * 构造代码块
 * 静态代码块
 *
 * 用来节约内村
 * */
public class Block {
    public static void main(String[] args) {
        // 局部代码块
        {
            int a = 10;
            System.out.println(a);
        }
        BlockBean blockBean = new BlockBean();
        BlockBean blockBean2 = new BlockBean();
        BlockBean blockBean3 = new BlockBean();
        System.out.println(blockBean);
        System.out.println(blockBean2);
        System.out.println(blockBean3);
    }
    public void print() {

    }
}

// 静态代码块
/***
 * static{}
 * 特点: 通过static 关键字修饰,随着类的加载而加载,
 * 并且自动触发,只执行一次
 * */

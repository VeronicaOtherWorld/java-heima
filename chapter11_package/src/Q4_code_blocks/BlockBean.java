package Q4_code_blocks;

import java.util.ArrayList;

/**
 * 2构造代码块
 * 写在成员位置的代码块
 * 作用:把重复的代码从构造方法中抽取出来
 * 执行时机:创建本类对象的时候,先执行构造代码块,再执行构造器
 * */



public class BlockBean {
    /*
     *
     * 静态 代码块*/
    static ArrayList<BlockBean> blocks = new ArrayList<BlockBean>();
    static {
        System.out.println("static block");
        blocks.add(new BlockBean(1));
    }
    {
        System.out.println("BlockBean");
    }
    private int id;
    public BlockBean() {
    }

    public BlockBean(int id) {
        this.id = id;
    }
}

package cn.qt.bean;

import java.util.ArrayList;

/**
 * Created by qiantao
 * Date: 2019/3/1
 * Time: 11:06
 */
public class Customer
{
    private String name;
    private ArrayList list=new ArrayList();

    //psfi && psfs && prsf
    public static final int NUM = 200;
    public static final String CITY = "Beijing";
    private static final String ADDRESS = "Zhong Shan Rd.";

    //自定义模板test
    public void test(){
        
    }
    public void testUpdate(){
        System.out.println("1");
    }

    //带注释的变量模板pric
   /**
    * 客户的id
    */
   private int id;


    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public ArrayList getList()
    {
        return list;
    }

    public void setList(ArrayList list)
    {
        this.list = list;
    }
}

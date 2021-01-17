package com.example.demo;

/**
 * @author lingnill
 */
public enum ColorEnum {
    /**
     * 枚举
     */
    RED("红色", 1),
    GREEN("绿色", 2),
    BLANK("白色", 3),
    YELLOW("黄色", 4);

    private String name;
    private int index;

    private ColorEnum(String name,int index){
        this.name = name;
        this.index = index;
    }
    public static String getName(int index){
        for (ColorEnum colorEnum:ColorEnum.values()){
            if (colorEnum.getIndex()==index){
                return colorEnum.name;
            }
        }
        return null;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getIndex(){
        return this.index;
    }
    public void setIndex(int index){
        this.index=index;
    }
}

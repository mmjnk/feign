package com.mybatis_plus2.mybatis_plus2.base.ok;

public enum Color {
    RED(0,"绿色"),
    BLUE(1,"红色"),
    GREEN(2,"蓝色");

    private int code;
private String desc;


    Color(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public  static Color getValue(int code){
        for (Color color:values()){
            if (color.getCode()==code){
                return color;
            }
        }
        return null;
    }
}

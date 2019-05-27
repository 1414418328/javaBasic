package com.neuedu.b;

abstract class Car {
    private String mark;//汽车品牌

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public abstract void drive();
}

class SubCar extends Car {
    private int price;
    private int speed;

    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    @Override
    public void drive() {
        System.out.println("本车正在驾驶");
    }
    public void driving(String mark){
        System.out.println(mark+"车正在驾驶");
    }
    //自身类的方法，（改变速度）
    public void speedChange(int newSpeed){
        this.speed=newSpeed;
        System.out.println(this.getMark()+"现在的速度是："+newSpeed+"公里/小时");
    }

}

class E {

    public static void main(String[] args) {
        SubCar benchi=new SubCar();
        SubCar aodi=new SubCar();
        aodi.setMark("奥迪");
        aodi.setPrice(50);
        aodi.setSpeed(80);
        System.out.println("本车的品牌是"+aodi.getMark());
        System.out.println(aodi.getMark()+"车的价格是"+aodi.getPrice()+"万");
        System.out.println(aodi.getMark()+"车原来的速度是："+aodi.getSpeed()+"公里/小时");
        aodi.driving(aodi.getMark());
        aodi.speedChange(90);

        System.out.println("****************************************");

        benchi.setMark("奔驰");
        benchi.setPrice(100);
        benchi.setSpeed(120);
        System.out.println("本车的品牌是"+benchi.getMark());
        System.out.println(benchi.getMark()+"车的价格是"+benchi.getPrice()+"万");
        System.out.println(benchi.getMark()+"车原来的速度是："+benchi.getSpeed()+"公里/小时");
        benchi.driving(benchi.getMark());
        benchi.speedChange(130);

    }

}

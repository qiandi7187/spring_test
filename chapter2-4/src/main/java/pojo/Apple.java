package pojo;


public class Apple implements Fruit {

    private int count;

    public void setCount(int count) {
        this.count = count;
    }

    public void grow() {
        System.out.println("Apple is growing!!!");
        System.out.println(count++);
    }
}

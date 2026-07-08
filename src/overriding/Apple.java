package overriding;

class Apple extends Fruit {

    Apple(String name, String taste, String size) {
        super(name, taste, size);
    }

    @Override
    void eat() {
        System.out.println(name + " tastes sweet and juicy");
    }
}
package overriding;

class Fruit {
    String name;
    String taste;
    String size;

    Fruit(String name, String taste, String size) {
        this.name = name;
        this.taste = taste;
        this.size = size;
    }

    void eat() {
        System.out.println(name + " tastes " + taste);
    }

    public static void main(String[] args) {
        Apple a = new Apple("Apple", "Sweet", "Medium");
        Orange o = new Orange("Orange", "Sour", "Round");

        a.eat();
        o.eat();
    }
}
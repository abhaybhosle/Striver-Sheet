package Programs;

interface Age {
    int x = 34;
    void getAge();
}

interface Speak {
    String name = "Abhay";
    void sleep();
}

public class AnonymousClass {
    public static void main(String[] args) {
        Age a = new Age() {
            public void getAge() {
                System.out.print("Age: " + x);
            }
        };

        Speak s = new Speak() {
            public void sleep() {
                System.out.print(name + " is Sleeping");
            }
        };

        a.getAge();
        System.out.println();
        s.sleep();
    }
}

class DataTypeOverloading {

    // Method with int parameter
    void display(int number) {
        System.out.println("Integer value: " + number);
    }

    // Method with double parameter
    void display(double number) {
        System.out.println("Double value: " + number);
    }

    // Method with String parameter
    void display(String text) {
        System.out.println("String value: " + text);
    }

    public static void main(String[] args) {
        DataTypeOverloading obj = new DataTypeOverloading();

        obj.display(25);
        obj.display(25.75);
        obj.display("Java Programming");
    }
}
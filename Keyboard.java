// Class Name: Keyboard

// Properties:
//   * String layout
//   * String brand
//   * int percentSize
 
// Methods:
//   * void hitKey(String key);
//   * void charge();
//   * void connectThroughUSB();
 
// Constructors:
//   * Keyboard(String layout, String brand, int percentSize);
//   * Keyboard(String layout, int percentSize);

public class Keyboard {
    String layout;
    String brand;
    int percentSize;

    public static void main(String[] args) {
        Keyboard myDellKeyboard = new Keyboard("qwerty", "Dell", 60);
        Keyboard myCorsairKeyboard = new Keyboard("qwerty", "Corsair", 100);
    }

    public Keyboard(String layout, String brand, int percentSize) {
        this.layout = layout;
        this.brand = brand;
        this.percentSize = percentSize;
    }

    public Keyboard(String layout, int percentSize) {
        this.layout = layout;
        this.percentSize = percentSize;
    }

    public void hitKey(String key) {
        // Input key
    }

    public void charge() {
        // Charge
    }

    public void connectThroughUSB() {
        // Connect the keyboard to whatever computer it is connected to through USB
    }
}
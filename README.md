# Bridge Pattern Example (Java)

## Description
This project demonstrates the **Bridge Design Pattern** implementation in Java.  
The main purpose of the pattern is to **decouple abstraction from implementation** so that they can evolve independently.

## Project Structure
src/
└── bridge/
├── Device.java # Device abstraction (interface)
├── TV.java # Device implementation (TV)
├── Radio.java # Device implementation (Radio)
├── Remote.java # Abstract remote controller
├── BasicRemote.java # Concrete remote controller
└── BridgeDemo.java # Client code (main)

## How to Run
1. Clone the project or copy the files into your IDE (IntelliJ IDEA / Eclipse).  
2. Make sure all files are inside the `bridge` package.  
3. Run the `BridgeDemo` class.  

Example console output:
```TV is on
TV is off
Radio is on```


---

## 📐 UML Diagram
```text
                +-------------------+
                |   Device (interface) |
                |-------------------|
                | + turnOn()        |
                | + turnOff()       |
                +---------^---------+
                          |
          +---------------+---------------+
          |                               |
+-------------------+           +-------------------+
|       TV          |           |      Radio        |
|-------------------|           |-------------------|
| + turnOn()        |           | + turnOn()        |
| + turnOff()       |           | + turnOff()       |
+-------------------+           +-------------------+

                 +-------------------+
                 |   Remote (abstract) |
                 |-------------------|
                 | - device: Device  |
                 |-------------------|
                 | + togglePower()   |
                 +---------^---------+
                           |
                 +-------------------+
                 |   BasicRemote     |
                 |-------------------|
                 | - on: boolean     |
                 |-------------------|
                 | + togglePower()   |
                 +-------------------+

                 +-------------------+
                 |   BridgeDemo      |
                 |-------------------|
                 | + main(String[])  |
                 +-------------------+

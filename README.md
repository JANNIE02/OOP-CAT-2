     
ADM No - 168275



 QUESTION 1

(a) Encapsulation
  The Student class encapsulates its attributes (name and grade) by marking them as private and providing public getter and setter methods to access or modify these attributes.
   Validation ensures that grade remains within the range 0–100. If invalid, it defaults to 0.



(b) Method Overloading and Overriding
Method Overloading:
   The MathOperations class demonstrates method overloading with two multiply methods:
    One multiplies two integers.
   Another multiplies three integers.


Method Overriding:
   The Animal class has a makeSound() method that is overridden in its subclasses Dog and Cat. Polymorphism is demonstrated by calling makeSound() on Animal references pointing to Dog and Cat objects.

QUESTION 2

(a)Abstraction
     The Appliance abstract class defines an abstract method turnOn(). This method is implemented in its subclasses Fan and TV.


(b)The DivisionExample class demonstrates exception handling by dividing two numbers provided by the user. 
       If the second number is zero, an ArithmeticException is caught, and a meaningful message is displayed.
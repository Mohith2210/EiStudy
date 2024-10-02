Design Patterns in Java

This folder contains Java implementations of various design patterns categorized under Behavioral, Creational, and Structural patterns.

Behavioral Design Patterns

1. Observer Pattern (Weather Station)
- Purpose: Implements the Observer pattern where the `Weather Station` notifies multiple `Observers` (displays) of changes in weather conditions.
- Key Classes:
  - WeatherStation: The subject that maintains weather data.
  - Observer: An interface for the observers (e.g., display units).
  - CurrentConditionsDisplay, StatisticsDisplay: Concrete observer implementations that update when weather data changes.

2. Strategy Pattern (Payment Methods)
- Purpose: Demonstrates the Strategy pattern by implementing different payment methods (like `CreditCard` and `PayPal`) that can be used interchangeably at runtime.
- Key Classes:
  - PaymentStrategy: An interface for payment methods.
  - CreditCardPayment, PayPalPayment: Concrete implementations of the payment strategies.
  - ShoppingCart: Uses a payment strategy to process payments.

Creational Design Patterns

1. Singleton Pattern (Database Connection)
- Purpose: Ensures a single instance of a DatabaseConnection class is created and shared across the application to manage database connections.
- Key Class:
  - DatabaseConnection: Implements the Singleton pattern to control the creation of a single instance.

2. Factory Method Pattern (Document Creator)
- Purpose: Uses the Factory Method pattern to create different types of documents (e.g., `PDFDocument`, `WordDocument`) without specifying the concrete classes.
- Key Classes:
  - DocumentFactory: An abstract factory that defines the method for creating documents.
  - PDFDocument, WordDocument: Concrete classes for specific document types.

Structural Design Patterns

1. Adapter Pattern (Legacy System Integration)
- Purpose: Implements the Adapter pattern to allow a `LegacySystem` to work with new code without modifying its structure.
- Key Classes:
  - LegacySystem: Represents the old system with incompatible interfaces.
  - NewSystemAdapter: Adapts the legacy system to make it compatible with the new system.

2. Decorator Pattern (Coffee Shop)
- Purpose: Demonstrates the Decorator pattern by dynamically adding features (e.g., `Milk`, `Sugar`) to a basic `Coffee` class.
- Key Classes:
  - Coffee: The base class for a simple coffee.
  - CoffeeDecorator: An abstract decorator that adds functionality.
  - Milk, Sugar: Concrete decorators that add specific features to the coffee.
  
## How to Run

Each pattern has its own Java class with an entry point. To run a specific pattern example, compile and run the corresponding Java file.


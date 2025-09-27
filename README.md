# System-Design

### 📖 What are Design Patterns?

Design pattern is a standard solution to a common software design problem. It provides a proven approach to structuring code for better reusability, scalability, and maintainability.

---
### Types of Design Patterns

1. Creational Patterns
 ```
  Singleton 
  Factory
  Abstract Factory
  Builder
  Prototype
```

2. Behavioral Patterns

3. Structural Patterns

Creational Design patterns 
-----------------------------
 
## 🔁 1. Singleton Pattern – **Centralized Logger Service**
 
### 🧩 Use Case (Detailed):
You are developing a large-scale enterprise application with multiple independent modules such as:
- **User Management**
- **Payment Processing**
- **Notification System**
- **Audit Trail**
 
Each module needs to log events like errors, warnings, and info messages. If each module creates its own logger instance, it could lead to:
- Inconsistent logging formats
- Difficulty in managing log files
- Performance issues due to multiple I/O streams
 
To solve this, you decide to implement a **centralized logger** that ensures:
- Only **one instance** of the logger exists throughout the application
- All modules use the **same logger instance**
- Thread-safe access to the logger
 
### ❓ Question:
Design a `Logger` class using the **Singleton pattern** in Java. Ensure that:
- Only one instance of the logger is created (even in multi-threaded environments)
- The logger provides a method like `log(String message)` to write logs
- Simulate usage by creating 3 modules (UserModule, PaymentModule, NotificationModule) that all use the same logger instance to log messages
 
---
 
## 🏭 2. Factory Method – **Notification System**
 
### 🧩 Use Case (Detailed):
You are building a **notification service** for an e-commerce platform. Based on user preferences, the system should send:
- **Email notifications** for order confirmations
- **SMS notifications** for delivery updates
- **Push notifications** for promotional offers
 
The client code should not be tightly coupled with the specific notification types. Instead, it should rely on a **factory** to get the appropriate notification object.
 
### ❓ Question:
Design a `NotificationFactory` using the **Factory Method pattern** that:
- Returns an object of type `Notification` (interface)
- Has concrete implementations: `EmailNotification`, `SMSNotification`, `PushNotification`
- Accepts a string input like `"EMAIL"`, `"SMS"`, or `"PUSH"` and returns the appropriate object
- Demonstrate usage by sending different types of notifications using the factory
 
---
 
🧰 6. Abstract Factory – Laptop Manufacturing Kit
🧩 Use Case (Detailed):
You are designing a laptop manufacturing system that supports multiple product lines:
Gaming Laptop
Business Laptop
Each product line has its own set of hardware components:
Processor
GraphicsCard
Display
You want to ensure that the components assembled for a laptop are compatible and interchangeable within the same product line. The client should be able to switch between product lines without changing the assembly logic.
❓ Question:
Design an Abstract Factory pattern that:
Defines interfaces for laptop components: Processor, GraphicsCard, Display
Provides concrete factories: GamingLaptopFactory, BusinessLaptopFactory
Each factory creates product-line-specific components
Demonstrate usage by assembling laptops from both product lines and showing how the components differ
 
---
 
## 🧱 4. Builder – **Custom PC Configuration System**
 
### 🧩 Use Case (Detailed):
You are building a **PC configuration tool** for a hardware store. Customers can build custom PCs by selecting:
- CPU (required)
- RAM (required)
- GPU (optional)
- SSD (optional)
- Liquid Cooling (optional)
- Power Supply (required)
 
The object creation should be:
- **Step-by-step**
- **Readable and flexible**
- Able to create different configurations like **Gaming PC**, **Office PC**, or **Budget PC**
 
### ❓ Question:
Design a `PCBuilder` class using the **Builder pattern** that:
- Allows step-by-step construction of a `PC` object
- Supports optional and required components
- Demonstrates creation of at least two PC configurations (e.g., Gaming PC with GPU and cooling, Office PC without GPU)
 
---
 
## 🧬 5. Prototype – **Game Character Cloning**
 
### 🧩 Use Case (Detailed):
You are developing a **role-playing game (RPG)** where players can create characters with attributes like:
- Name
- Health
- Armor
- Weapon
- Skills
 
Creating each character from scratch is time-consuming. Instead, you want to:
- Create **prototype characters** (e.g., Warrior, Mage)
- Clone them and modify only a few attributes (e.g., name, weapon)
 
This will improve performance and simplify character creation.
 
### ❓ Question:
Design a `GameCharacter` class using the **Prototype pattern** that:
- Implements a `clone()` method
- Allows creating prototype characters and cloning them
- Demonstrates cloning a Warrior prototype to create multiple warriors with different names and weapons
 
---
 
Behavioral Design Patterns

--------------------------

## 🔁 1. **Chain of Responsibility** – *Customer Support System*
 
### ✅ Use Case:

You’re building a customer support system for an online service. Support requests vary in complexity:

- Level 1: Basic account issues

- Level 2: Technical problems

- Level 3: Billing or legal concerns
 
Each support level should decide whether it can handle the request or pass it to the next level.
 
### 🧩 Problem:

You want to avoid hardcoding conditional logic like `if-else` or `switch-case` for request handling. Instead, you want a flexible chain of handlers.
 
### ❓ Question:

Design a `SupportHandler` interface with a method `handleRequest(SupportRequest request)`. Implement concrete handlers (`Level1Support`, `Level2Support`, `Level3Support`) that form a chain. Demonstrate how a request flows through the chain until it is handled.
 
---
 
## 🧭 2. **Command Pattern** – *Smart Home Remote Control*
 
### ✅ Use Case:

You’re building a smart home system. A remote control can:

- Turn lights on/off

- Open/close garage door

- Play/stop music
 
You want to encapsulate each action as a command so that:

- Commands can be queued, undone, or logged

- The remote doesn’t need to know device internals
 
### 🧩 Problem:

You want to decouple the invoker (remote) from the receiver (devices) and support undo/redo functionality.
 
### ❓ Question:

Create a `Command` interface with `execute()` and `undo()` methods. Implement concrete commands like `LightOnCommand`, `GarageOpenCommand`. Design a `RemoteControl` class that stores and executes commands. Demonstrate command execution and undo.
 
---
 
## 🧠 3. **Interpreter Pattern** – *Simple Expression Evaluator*
 
### ✅ Use Case:

You’re building a calculator that evaluates expressions like:

- `"5 + 3"`

- `"10 - 2"`

- `"7 + 2 - 1"`
 
You want to parse and evaluate these using a grammar-based approach.
 
### 🧩 Problem:

You want to represent grammar rules as classes and interpret expressions recursively.
 
### ❓ Question:

Define an `Expression` interface with a method `interpret()`. Implement `NumberExpression`, `AddExpression`, and `SubtractExpression`. Build a parser that converts strings into expression trees and evaluates them.
 
---
 
## 🔄 4. **Iterator Pattern** – *Custom Book Collection Traversal*
 
### ✅ Use Case:

You’re building a `BookCollection` class that stores `Book` objects. You want clients to iterate over the collection without exposing its internal structure.
 
### 🧩 Problem:

You want to provide a clean way to traverse a collection without exposing its implementation.
 
### ❓ Question:

Create a `BookIterator` interface with `hasNext()` and `next()` methods. Implement a concrete iterator for `BookCollection`. Demonstrate how a client uses the iterator to traverse books.
 
---
 
## 🧩 5. **Mediator Pattern** – *Chat Room Communication*
 
### ✅ Use Case:

You’re building a chat application. Users send messages to each other, but instead of direct communication, a `ChatRoom` mediator handles message delivery.
 
### 🧩 Problem:

You want to reduce tight coupling between user objects and centralize communication logic.
 
### ❓ Question:

Create a `ChatRoom` class that manages communication between `User` objects. Implement a `sendMessage(String message, User sender)` method. Demonstrate how users communicate via the mediator.
 
---
 
## 🧠 6. **Memento Pattern** – *Text Editor Undo Feature*
 
### ✅ Use Case:

You’re building a text editor with undo functionality. Every time the user types or deletes text, the editor should be able to restore the previous state.
 
### 🧩 Problem:

You want to save and restore object state without violating encapsulation.
 
### ❓ Question:

Create a `TextEditor` class (originator), a `Memento` class to store state, and a `History` class (caretaker) to manage undo. Demonstrate how the editor can undo changes step-by-step.
 
---
 
## 👀 7. **Observer Pattern** – *Stock Price Monitoring*
 
### ✅ Use Case:

You’re building a stock monitoring system. Multiple investors subscribe to stock updates. When the stock price changes, all subscribed investors should be notified.
 
### 🧩 Problem:

You want to implement a publish-subscribe mechanism where observers react to changes in the subject.
 
### ❓ Question:

Create a `Stock` class (subject) and `Investor` classes (observers). Implement methods to `subscribe()`, `unsubscribe()`, and `notifyObservers()`. Demonstrate how investors receive updates when the stock price changes.
 
---
 
## 🔄 8. **State Pattern** – *Document Workflow System*
 
### ✅ Use Case:

You’re building a document workflow system. A document can be in different states:

- Draft

- Moderation

- Published
 
Each state has different behavior for actions like `edit()`, `publish()`, and `archive()`.
 
### 🧩 Problem:

You want to change object behavior based on its internal state without using conditionals.
 
### ❓ Question:

Create a `DocumentState` interface with methods like `edit()`, `publish()`. Implement `DraftState`, `ModerationState`, and `PublishedState`. The `Document` class should delegate behavior to its current state. Demonstrate state transitions and behavior changes.
 
---
 
## 🧠 9. **Strategy Pattern** – *Payment Processing System*
 
### ✅ Use Case:

You’re building a payment system that supports:

- Credit Card

- PayPal

- UPI
 
You want to encapsulate each payment method as a strategy so the client can choose dynamically.
 
### 🧩 Problem:

You want to define a family of algorithms and make them interchangeable at runtime.
 
### ❓ Question:

Create a `PaymentStrategy` interface with a method `pay(double amount)`. Implement strategies like `CreditCardPayment`, `PayPalPayment`, `UPIPayment`. Use a `PaymentContext` class to switch strategies. Demonstrate dynamic strategy selection.
 
---
 
## 🧠 10. **Template Method Pattern** – *Data Exporter*
 
### ✅ Use Case:

You’re building a data exporter that can export data in formats like:

- CSV

- JSON

- XML
 
The steps for exporting are mostly the same, but format-specific logic differs.
 
### 🧩 Problem:

You want to define the skeleton of an algorithm and let subclasses fill in specific steps.
 
### ❓ Question:

Create an abstract class `DataExporter` with a template method `exportData()`. Implement concrete classes like `CSVExporter`, `JSONExporter`, and `XMLExporter`. Demonstrate how the template method ensures consistent export flow.
 
---
 
## 🧠 11. **Visitor Pattern** – *Tax Calculator for Products*
 
### ✅ Use Case:

You’re building a tax calculator for an e-commerce platform. Products like `Electronics`, `Groceries`, and `Clothing` have different tax rules.
 
You want to separate tax logic from product classes.
 
### 🧩 Problem:

You want to add new operations to existing object structures without modifying them.
 
### ❓ Question:

Create a `Product` interface with an `accept(Visitor visitor)` method. Implement product types and a `TaxVisitor` that calculates tax. Demonstrate how the visitor applies different logic to each product type.

 
Structural Design Pattern

-------------------------
 
## 🧩 1. **Adapter Pattern** – *Legacy Payment Gateway Integration*
 
### ✅ Use Case (Detailed):

You are developing a modern e-commerce platform that uses a new `PaymentProcessor` interface with a method `processPayment(double amount)`. However, your company has an old payment system (`OldPaymentSystem`) that uses a method `makePayment(String amount)` and expects the amount as a string.
 
You cannot modify the legacy system, but you need to integrate it with your new platform.
 
### ❓ Question:

Design an `Adapter` class (`OldPaymentAdapter`) that implements the `PaymentProcessor` interface and internally uses the `OldPaymentSystem`. Demonstrate how the adapter allows the new system to work with the legacy code without changes.
 
---
 
## 🧩 2. **Bridge Pattern** – *Remote Control for Multiple Devices*
 
### ✅ Use Case (Detailed):

You are building a universal remote control system that should work with multiple devices like TVs and Radios. Each device has its own implementation of `turnOn()`, `turnOff()`, and `setVolume()`.
 
You want to decouple the abstraction (`RemoteControl`) from the implementation (`Device`) so that:

- You can add new devices without changing the remote

- You can create advanced remotes (e.g., `SmartRemote`) without modifying device code
 
### ❓ Question:

Implement the **Bridge pattern** with:

- An interface `Device` (TV, Radio)

- An abstract class `RemoteControl` that uses a `Device`

- A concrete class `SmartRemote` that extends `RemoteControl`

Demonstrate how the remote can control different devices independently.
 
---
 
## 🧩 3. **Composite Pattern** – *File System Hierarchy*
 
### ✅ Use Case (Detailed):

You are building a file explorer. In your system:

- A `File` has a name and size

- A `Folder` can contain multiple `File` or `Folder` objects
 
You want to treat both files and folders uniformly when performing operations like `display()` or `getSize()`.
 
### ❓ Question:

Design a `FileSystemComponent` interface with methods like `display()` and `getSize()`. Implement `File` and `Folder` classes using the **Composite pattern**. Demonstrate how nested folders and files can be managed and displayed recursively.
 
---
 
## 🧩 4. **Decorator Pattern** – *Text Formatting in Editor*
 
### ✅ Use Case (Detailed):

You are developing a text editor that allows users to apply formatting like:

- **Bold**

- **Italic**

- **Underline**
 
Users can apply multiple formats in any combination. You want to avoid creating a separate class for every combination (e.g., `BoldItalicUnderlineText`).
 
### ❓ Question:

Use the **Decorator pattern** to design a system where formatting options can be added dynamically to a `Text` object. Implement decorators like `BoldDecorator`, `ItalicDecorator`, and `UnderlineDecorator`. Demonstrate how multiple decorators can be stacked to apply combined formatting.
 
---
 
## 🧩 5. **Facade Pattern** – *Media Conversion System*
 
### ✅ Use Case (Detailed):

You are building a media conversion tool that involves multiple complex subsystems:

- `AudioDecoder`

- `VideoDecoder`

- `FormatConverter`

- `CompressionEngine`
 
The client should not interact with these subsystems directly. Instead, you want to provide a **simple interface** to convert media files.
 
### ❓ Question:

Design a `MediaConverterFacade` class that hides the complexity of the underlying subsystems. Demonstrate how the facade simplifies media conversion for the client with a single method like `convert(String sourceFile, String targetFormat)`.
 
---
 
## 🧩 6. **Flyweight Pattern** – *Text Rendering Optimization*
 
### ✅ Use Case (Detailed):

You are building a word processor that renders thousands of characters. Each character has:

- Intrinsic state: font, size, color (shared)

- Extrinsic state: position (unique)
 
To optimize memory, you want to share intrinsic data and store only extrinsic data separately.
 
### ❓ Question:

Implement the **Flyweight pattern** to manage character rendering. Create a `CharacterFactory` that reuses shared character objects. Demonstrate how memory usage is reduced by sharing intrinsic data while rendering a document.
 
---
 
## 🧩 7. **Proxy Pattern** – *Image Viewer with Lazy Loading*
 
### ✅ Use Case (Detailed):

You are building an image viewer application. High-resolution images are expensive to load. You want to:

- Load images only when they are actually viewed

- Control access to image loading
 
This improves performance and resource usage.
 
### ❓ Question:

Use the **Proxy pattern** to create an `ImageProxy` that implements the same interface as `RealImage`. The proxy should load the image only when `display()` is called. Demonstrate how the proxy delays loading and controls access.

 

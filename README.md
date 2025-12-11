# 🏗️ System Design & Design Patterns

This repository explains **System Design** concepts and **Design Patterns** with real-world **use cases, problems, and coding questions**.

The aim is to make design patterns easy to understand with practical examples.

---

## 📖 What are Design Patterns?

A **Design Pattern** is a standard solution to a common software design problem.
It provides a **proven approach** to structuring code for better **reusability, scalability, and maintainability**.

---

## 📑 Types of Design Patterns

1. **Creational Patterns**

   ```
   Singleton
   Factory
   Abstract Factory
   Builder
   Prototype
   ```

2. **Behavioral Patterns**

   ```
   Chain of Responsibility
   Command
   Iterator
   Mediator
   Memento
   Observer
   State
   Strategy
   Template Method
   Visitor
   Interpreter -- Optional
   ```

3. **Structural Patterns**

   ```
   Adapter
   Bridge
   Composite
   Decorator
   Facade
   Flyweight
   Proxy
   ```

---

# Creational Design Patterns

## 🔁 1. Singleton Pattern – Centralized Logger Service

**Definition:** **Singleton** is a creational design pattern that lets you ensure that a class has only one instance, while providing a global access point to this instance.

🧩 **Use Case (Detailed):**
You are developing a large-scale enterprise application with multiple modules:

- User Management
- Payment Processing
- Notification System
- Audit Trail

Each module needs logging. If each creates its own logger instance, it may cause:

- Inconsistent logging formats
- Difficulty managing log files
- Performance issues

✅ **Problem:**
Need a centralized logger where only one instance exists and is thread-safe.

❓ **Question:**
Design a Logger class using the Singleton pattern in Java. Ensure that:

- Only one instance of the logger exists (even in multi-threaded environments)
- Provides a method `log(String message)`
- Demonstrate usage in 3 modules (User, Payment, Notification)

---

## 🏭 2. Factory Method – Notification System

**Definition:** **Factory Method** is a creational design pattern that provides an interface for creating objects in a superclass, but allows subclasses to alter the type of objects that will be created.

🧩 **Use Case (Detailed):**
An e-commerce platform sends notifications:

- Email → Order confirmation
- SMS → Delivery updates
- Push → Promotions

✅ **Problem:**
Client code should not depend on specific notification types.

❓ **Question:**
Design a NotificationFactory using Factory Method that:

- Returns an object of type `Notification` (interface)
- Has `EmailNotification`, `SMSNotification`, `PushNotification` implementations
- Accepts `"EMAIL"`, `"SMS"`, `"PUSH"` and returns the right object
- Demonstrates sending different notifications

---

## 🧰 3. Abstract Factory – Laptop Manufacturing Kit

**Definition:** **Abstract Factory** is a creational design pattern that lets you produce families of related objects without specifying their concrete classes.

🧩 **Use Case (Detailed):**
Laptop lines: Gaming and Business.
Each has its own Processor, GraphicsCard, Display.

✅ **Problem:**
Ensure components are compatible and allow switching product lines easily.

❓ **Question:**
Design an Abstract Factory that:

- Defines interfaces for `Processor`, `GraphicsCard`, `Display`
- Provides `GamingLaptopFactory` & `BusinessLaptopFactory`
- Demonstrates assembling laptops from both product lines

---

## 🧱 4. Builder Pattern – Custom PC Configuration

**Definition:** **Builder** is a creational design pattern that lets you construct complex objects step by step. The pattern allows you to produce different types and representations of an object using the same construction code.

🧩 **Use Case (Detailed):**
PC builder lets customers choose:

- Required: CPU, RAM, Power Supply
- Optional: GPU, SSD, Liquid Cooling

✅ **Problem:**
Need a step-by-step, flexible object creation process.

❓ **Question:**
Design a `PCBuilder` class using Builder Pattern that:

- Builds a PC object step by step
- Supports optional and required components
- Demonstrates Gaming PC and Office PC builds

---

## 🧬 5. Prototype Pattern – Game Character Cloning

**Definition:** **Prototype** is a creational design pattern that lets you copy existing objects without making your code dependent on their classes.

🧩 **Use Case (Detailed):**
RPG game with characters: Name, Health, Armor, Weapon, Skills.
Creating from scratch is costly.

✅ **Problem:**
Need cloning of prototype characters (Warrior, Mage).

❓ **Question:**
Design a `GameCharacter` class using Prototype Pattern that:

- Implements `clone()`
- Allows prototype creation and cloning
- Demonstrates cloning Warrior with different names/weapons

---

# Behavioral Design Patterns

## 🔗 1. Chain of Responsibility – Customer Support

**Definition:** **Chain of Responsibility** is a behavioral design pattern that lets you pass requests along a chain of handlers. Upon receiving a request, each handler decides either to process the request or to pass it to the next handler in the chain.

🧩 **Use Case (Detailed):**
A software company provides customer support at multiple levels:

- L1 → Basic queries
- L2 → Technical issues
- L3 → Critical problems

Instead of using long `if-else` conditions, requests should pass through a chain until handled.

✅ **Problem:**
Need a flexible system where requests flow through handlers until resolved.

❓ **Question:**
Design a `SupportHandler` interface with `handleRequest()`.
Create `L1Handler`, `L2Handler`, `L3Handler` and demonstrate a request flowing through the chain.

---

## 🎮 2. Command Pattern – Smart Home Remote

**Definition:** **Command** is a behavioral design pattern that turns a request into a stand-alone object that contains all information about the request. This transformation lets you pass requests as a method arguments, delay or queue a request’s execution, and support undoable operations.

🧩 **Use Case (Detailed):**
In a smart home:

- Turn lights ON/OFF
- Open garage
- Play music

Each action should be encapsulated as a command. Undo/redo should also be supported.

✅ **Problem:**
Need to decouple request from execution while supporting undo/redo.

❓ **Question:**
Design a `Command` interface with `execute()` and `undo()`.
Create commands for Light, Garage, and Music. Demonstrate using a remote control.
<!--
---

## 🧮 3. Interpreter Pattern – Expression Evaluator

**Definition:**

🧩 **Use Case (Detailed):**
You need to evaluate expressions like:

```
5 + 3 - 2
10 - 4 + 2
```

✅ **Problem:**
Implement a grammar-based parser that interprets mathematical expressions.

❓ **Question:**
Design an `Expression` interface with `interpret()`.
Implement `NumberExpression`, `AddExpression`, `SubtractExpression` and evaluate expressions.
-->
---

## 📚 3. Iterator Pattern – Book Collection

**Definition:** **Iterator** is a behavioral design pattern that lets you traverse elements of a collection without exposing its underlying representation (list, stack, tree, etc.).

🧩 **Use Case (Detailed):**
You have a `BookCollection` class storing books internally in a list.
External users should iterate without exposing internal details.

✅ **Problem:**
Need a clean way to traverse the collection sequentially.

❓ **Question:**
Design a `BookIterator` with `hasNext()` & `next()`.
Demonstrate iterating through books without exposing the internal list.

---

## 💬 4. Mediator Pattern – Chat Room

**Definition:** **Mediator** is a behavioral design pattern that lets you reduce chaotic dependencies between objects. The pattern restricts direct communications between the objects and forces them to collaborate only via a mediator object.

🧩 **Use Case (Detailed):**
In a group chat system:

- Users should not directly reference each other
- All communication should pass through a central ChatRoom

✅ **Problem:**
Need centralized control for communication between objects.

❓ **Question:**
Design a `ChatRoom` mediator class.
Users send messages via mediator. Demonstrate communication between 3 users.

---

## ✏️ 5. Memento Pattern – Text Editor Undo

**Definition:** **Memento** is a behavioral design pattern that lets you save and restore the previous state of an object without revealing the details of its implementation.

🧩 **Use Case (Detailed):**
A text editor allows:

- Writing text
- Undo last change
- Restore previous state

✅ **Problem:**
Need to capture and restore object state without exposing implementation.

❓ **Question:**
Design a `TextEditor`, `Memento`, and `History` class.
Demonstrate typing text and performing undo/redo operations.

---

## 👀 6. Observer Pattern – Stock Monitoring

**Definition:** **Observer** is a behavioral design pattern that lets you define a subscription mechanism to notify multiple objects about any events that happen to the object they’re observing.

🧩 **Use Case (Detailed):**
A stock market app notifies multiple investors when stock price changes.

✅ **Problem:**
Need a publish/subscribe system for automatic updates.

❓ **Question:**
Design `Stock` as Subject and `Investor` as Observers.
When price changes, notify all investors.

---

## 🔄 7. State Pattern – Document Workflow

**Definition:** **State** is a behavioral design pattern that lets an object alter its behavior when its internal state changes. It appears as if the object changed its class.

🧩 **Use Case (Detailed):**
Document lifecycle:

- Draft → can be edited
- Moderation → waiting for approval
- Published → read-only

✅ **Problem:**
Behavior should change based on the state of the object.

❓ **Question:**
Design a `DocumentState` interface with states Draft, Moderation, Published.
Demonstrate state transitions with behaviors.

---

## 💳 8. Strategy Pattern – Payment Processing

**Definition:** **Strategy** is a behavioral design pattern that lets you define a family of algorithms, put each of them into a separate class, and make their objects interchangeable.

🧩 **Use Case (Detailed):**
E-commerce platform supports:

- Credit Card
- PayPal
- UPI

✅ **Problem:**
Need flexible way to switch payment algorithms at runtime.

❓ **Question:**
Design a `PaymentStrategy` interface with `pay()`.
Implement `CreditCardPayment`, `PayPalPayment`, `UPIPayment`. Demonstrate dynamic selection at runtime.

---

## 📂 9. Template Method – Data Exporter

**Definition:** **Template Method** is a behavioral design pattern that defines the skeleton of an algorithm in the superclass but lets subclasses override specific steps of the algorithm without changing its structure.

🧩 **Use Case (Detailed):**
Data export functionality supports multiple formats:

- CSV
- JSON
- XML

✅ **Problem:**
Need a common skeleton while letting subclasses define specific export logic.

❓ **Question:**
Design abstract `DataExporter` with template method `exportData()`.
Create CSVExporter, JSONExporter, XMLExporter. Demonstrate exporting in each format.

---

## 🧾 10. Visitor Pattern – Tax Calculator

**Definition:** **Visitor** is a behavioral design pattern that lets you separate algorithms from the objects on which they operate.

🧩 **Use Case (Detailed):**
Different items (Electronics, Groceries, Clothing) have different tax rules.

✅ **Problem:**
Need to separate tax logic from item classes.

❓ **Question:**
Design `Visitor` interface for tax calculation.
Implement `Electronics`, `Groceries`, `Clothing` items and apply Visitor to calculate tax.

---

# Structural Design Patterns

## 🔌 1. Adapter Pattern – Legacy Payment Gateway

**Definition:** **Adapter** is a structural design pattern that allows objects with incompatible interfaces to collaborate.

🧩 **Use Case (Detailed):**
You have:

 - A new PaymentProcessor interface with processPayment(double amount)
 - A legacy OldPaymentSystem with makePayment(String amount)
You cannot modify the old system but need to integrate it with the new one.

✅ **Problem:**
Direct integration creates tight coupling and breaks design principles. You need a way to adapt the old interface to the new one without changing existing code.

❓ **Question:**
Create `OldPaymentAdapter` that implements `PaymentProcessor` and internally uses `OldPaymentSystem`.
Demonstrate processing payments through the adapter.

---

## 🌉 2. Bridge Pattern – Remote Control

**Definition:** **Bridge** is a structural design pattern that lets you split a large class or a set of closely related classes into two separate hierarchies—abstraction and implementation—which can be developed independently of each other.

🧩 **Use Case (Detailed):**
You need a remote control system for:

 - TV
 - Radio
Remote should work with any device without modifying code.

✅ **Problem:**
Tightly coupling remote and device classes makes adding new devices or remotes hard. You need flexibility.

❓ **Question:**
Design `RemoteControl` abstraction and `Device` implementations (TV, Radio).
Create `SmartRemote` extending `RemoteControl`. Demonstrate turning devices on/off.
<!--
---

## 🗂️ 3. Composite Pattern – File System

**Definition:** **Composite** is a structural design pattern that lets you compose objects into tree structures and then work with these structures as if they were individual objects.

🧩 **Use Case (Detailed):**
File system contains:

- Files
- Folders (that may contain files or other folders)

✅ **Problem:**
Need to treat files and folders uniformly for operations like display() and getSize().

❓ **Question:**
Design `FileSystemComponent` interface with `File` and `Folder` classes.
Demonstrate recursive structure traversal.

---

## 🎨 4. Decorator Pattern – Text Formatting

**Definition:** **Decorator** is a structural design pattern that lets you attach new behaviors to objects by placing these objects inside special wrapper objects that contain the behaviors.

🧩 **Use Case (Detailed):**
Text editor applies multiple styles:

- Bold
- Italic
- Underline

✅ **Problem:**
Avoid creating separate classes for every combination of styles.

❓ **Question:**
Design a `TextDecorator` class.
Apply multiple styles dynamically to text using decorators like `BoldDecorator`, `ItalicDecorator`, `UnderlineDecorator`.

---

## 🎬 5. Facade Pattern – Media Converter

**Definition:** **Facade** is a structural design pattern that provides a simplified interface to a library, a framework, or any other complex set of classes.

🧩 **Use Case (Detailed):**
A media converter requires calling multiple subsystems:

 - AudioDecoder
 - VideoDecoder
 - Compressor

✅ **Problem:**
User should have a simple interface for conversion.

❓ **Question:**
Design `MediaConverterFacade` that simplifies conversion process.
Demonstrate converting a file from MP4 → MP3.

---

## 🪶 6. Flyweight Pattern – Text Rendering

**Definition:** **Flyweight** is a structural design pattern that lets you fit more objects into the available amount of RAM by sharing common parts of state between multiple objects instead of keeping all of the data in each object.

🧩 **Use Case (Detailed):**
A document has thousands of characters with repeating fonts and styles.

✅ **Problem:**
Creating separate objects for each character wastes memory.

❓ **Question:**
Design `CharacterFactory` that reuses Character objects (intrinsic state).
Demonstrate rendering repeated characters efficiently.

---

## 🛡️ 7. Proxy Pattern – Image Viewer

**Definition:** **Proxy** is a structural design pattern that lets you provide a substitute or placeholder for another object. A proxy controls access to the original object, allowing you to perform something either before or after the request gets through to the original object.

🧩 **Use Case (Detailed):**
An image viewer loads high-resolution images.

✅ **Problem:**
Loading all images upfront is slow and memory-intensive.

❓ **Question:**
Design `ImageProxy` that loads images lazily only when requested.
Demonstrate viewing multiple images efficiently.

-->
---

## 🚀 How to Use

1. Clone the repo

   ```bash
   git clone https://github.com/PramodhKumar3/System-Design.git
   cd System-Design
   ```

2. Open in your IDE
3. Run examples for each pattern

---

## 📌 Contribution

Pull requests are welcome! Feel free to add new examples or improve explanations.

---

## 📬 Contact

Created with 💻 by [Pramodh Kumar](https://www.linkedin.com/in/tamminaina-pramodh-kumar-6433a4242)

---

## ⭐ Support

If this repo helped you, don’t forget to **star ⭐ the repo**!

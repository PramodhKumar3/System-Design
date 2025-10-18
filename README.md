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
   Interpreter
   Iterator
   Mediator
   Memento
   Observer
   State
   Strategy
   Template Method
   Visitor
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
<!--
---

# Behavioral Design Patterns

## 🔗 1. Chain of Responsibility – Customer Support

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

---

## 🧮 3. Interpreter Pattern – Expression Evaluator

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

---

## 📚 4. Iterator Pattern – Book Collection

🧩 **Use Case (Detailed):**
You have a `BookCollection` class storing books internally in a list.
External users should iterate without exposing internal details.

✅ **Problem:**
Need a clean way to traverse the collection sequentially.

❓ **Question:**
Design a `BookIterator` with `hasNext()` & `next()`.
Demonstrate iterating through books without exposing the internal list.

---

## 💬 5. Mediator Pattern – Chat Room

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

## ✏️ 6. Memento Pattern – Text Editor Undo

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

## 👀 7. Observer Pattern – Stock Monitoring

🧩 **Use Case (Detailed):**
A stock market app notifies multiple investors when stock price changes.

✅ **Problem:**
Need a publish/subscribe system for automatic updates.

❓ **Question:**
Design `Stock` as Subject and `Investor` as Observers.
When price changes, notify all investors.

---

## 🔄 8. State Pattern – Document Workflow

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

## 💳 9. Strategy Pattern – Payment Processing

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

## 📂 10. Template Method – Data Exporter

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

## 🧾 11. Visitor Pattern – Tax Calculator

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

🧩 **Use Case (Detailed):**
A company has an old payment gateway (`OldPaymentAPI`) but now uses a new `PaymentProcessor` interface.

✅ **Problem:**
New system should work with old gateway without changing its code.

❓ **Question:**
Design a `PaymentAdapter` class that adapts `OldPaymentAPI` to `PaymentProcessor`.
Demonstrate processing payments through the adapter.

---

## 🌉 2. Bridge Pattern – Remote Control

🧩 **Use Case (Detailed):**
You need a remote control system for devices:

- TV
- Radio

✅ **Problem:**
Remote should work with any device without modifying code.

❓ **Question:**
Design `RemoteControl` abstraction and `Device` implementations (TV, Radio).
Demonstrate turning devices on/off.

---

## 🗂️ 3. Composite Pattern – File System

🧩 **Use Case (Detailed):**
File system contains:

- Files
- Folders (that may contain files or other folders)

✅ **Problem:**
Need to treat files and folders uniformly.

❓ **Question:**
Design `FileComponent` interface with `File` and `Folder` classes.
Demonstrate recursive structure traversal.

---

## 🎨 4. Decorator Pattern – Text Formatting

🧩 **Use Case (Detailed):**
Text editor applies multiple styles:

- Bold
- Italic
- Underline

✅ **Problem:**
Need to add responsibilities dynamically without altering base class.

❓ **Question:**
Design a `TextDecorator` class.
Apply multiple styles dynamically to text.

---

## 🎬 5. Facade Pattern – Media Converter

🧩 **Use Case (Detailed):**
A media converter requires calling multiple subsystems (AudioDecoder, VideoDecoder, Compressor).

✅ **Problem:**
User should have a simple interface for conversion.

❓ **Question:**
Design `MediaConverterFacade` that simplifies conversion process.
Demonstrate converting a file from MP4 → MP3.

---

## 🪶 6. Flyweight Pattern – Text Rendering

🧩 **Use Case (Detailed):**
A document has thousands of characters with repeating fonts and styles.

✅ **Problem:**
Creating separate objects for each character wastes memory.

❓ **Question:**
Design `CharacterFactory` that reuses Character objects (intrinsic state).
Demonstrate rendering repeated characters efficiently.

---

## 🛡️ 7. Proxy Pattern – Image Viewer

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

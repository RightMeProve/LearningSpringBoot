# 🚀 LearningSpringBoot

This repository is a my hands-on journey through Spring Boot's **Dependency Injection (DI)** capabilities.
It includes **detailed exercises**, **step-by-step solutions**, and **concept breakdowns** to solidify your Spring fundamentals.

---

## 📜 What You'll Learn

* Basics of Dependency Injection
* Constructor vs Setter Injection
* Interface-based Injection
* Manual Bean Configuration with `@Bean`
* Strategy Pattern via Config
* Optional Dependencies
* Singleton vs Prototype Scope
* Nested Dependency Chains
* Cleaner Config without `@Qualifier`

---

## 📂 Structure

```
LearningSpringBoot/
├── 1.LearningDependencyInjection-Exercises/
│   ├── task1/      # Basic Constructor Injection
│   ├── task2/      # Interface Injection
│   ├── task3/      # Multiple Interface Injection
│   ├── task4/      # Setter Injection
│   ├── task5/      # Manual Bean Config
│   ├── task6/      # Config-based Strategy Injection
│   ├── task7/      # Nested Dependencies
│   ├── task8/      # Optional Dependencies
│   ├── task9/      # Singleton/Prototype Scope
│   └── task10/     # Interface Strategy via Config
├── Spring_DI_Exercises_Notes.pdf   # Summary notes with key concepts
└── README.md
```

---

## 📌 Exercise Index

| #  | Topic                         | Description                                          |
| -- | ----------------------------- | ---------------------------------------------------- |
| 1  | Constructor Injection         | Injecting simple class using constructor             |
| 2  | Interface Injection           | Inject interface with multiple implementations       |
| 3  | Multiple Interface Injection  | CakeBaker with Frosting + Syrup                      |
| 4  | Setter Injection              | Learn setter-based injection                         |
| 5  | Manual Bean Config            | Wiring beans manually with `@Configuration`          |
| 6  | Strategy without `@Qualifier` | Choose implementation via config                     |
| 7  | Nested Dependencies           | FuelPump → Engine → Car injection chain              |
| 8  | Optional Dependency Injection | Handle missing beans gracefully                      |
| 9  | Singleton Scope               | Reuse one bean across multiple classes               |
| 10 | Strategy Pattern via Config   | Use interface injection to implement strategy design |

---

## 💠 How to Run

1. **Clone the repository**

```bash
git clone https://github.com/yourusername/LearningSpringBoot.git
cd LearningSpringBoot
```

2. **Open in IntelliJ IDEA**
   Make sure Lombok and Spring Boot plugins are enabled (if used).

3. **Build and Run**

Each task has a separate `main()` method in its own `taskApplication` class.
You can run them independently using your IDE.

---

## 📒 Summary Notes PDF

You can also check out the complete [📄 PDF Summary of (task1 - task10) DI exercises](./SummaryNotes.pdf), including:

* What each exercise teaches
* Key takeaways
* Questions and concepts I discussed during practice

---

## 🤝 Contributing

If you're also learning Spring and want to contribute more exercises or improve explanations:

1. Fork the repo
2. Create a branch: `git checkout -b feature/new-exercise`
3. Commit your changes
4. Submit a Pull Request

---

## 🧠 Credits

Practiced and refined through iterative learning on ChatGPT, guided by real debugging and hands-on exploration.

---

Happy Springing! 🌱

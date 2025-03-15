# JADE Multi-Agent System

## Overview
This project demonstrates a **JADE-based multi-agent system** with a main container that initializes multiple agents, including **SenderAgent**, **ReceiverAgent**, **CyclicAgent**, **OneShotAgent**, **TaskAgent**, and **SimpleAgent**. The system enables communication between agents using the **JADE framework**.

## Prerequisites
Ensure you have the following installed before running the project:
- **Java JDK 21** (or compatible version)
- **JADE 4.6.0** (Java Agent Development Framework)
- **IntelliJ IDEA Ultimate** (or any Java-compatible IDE)
- **Git** (for version control)

## Project Structure
```
Damim_Project/
│── src/
│   ├── Main.java  (Starts the JADE platform and creates agents)
│   ├── CyclicAgent.java  (Agent that performs cyclic tasks)
│   ├── OneShotAgent.java  (Agent that performs a single action)
│   ├── TaskAgent.java  (Agent responsible for task execution)
│   ├── SenderAgent.java  (Agent responsible for sending messages)
│   ├── ReceiverAgent.java  (Agent responsible for receiving messages)
│   ├── SimpleAgent.java  (Basic agent example)
│── out/production/Damim/ (Compiled output directory)
│── .gitignore
│── README.md  (This file)
│── jade.jar  (JADE library - ensure it is added to classpath)
```

## How to Run
1. Clone the repository:
   ```sh
   git clone https://github.com/Damim-03/JADE-MultiAgent-System.git
   cd JADE-MultiAgent-System
   ```
2. Open the project in **IntelliJ IDEA**.
3. Add **JADE** to the project dependencies:
   - Navigate to `File > Project Structure > Libraries`
   - Add the `jade.jar` file
4. Run the `Main` class.

## Code Explanation
### **Main.java** (JADE Platform Setup)
```java
Profile profile = new ProfileImpl();
profile.setParameter(Profile.GUI, "true"); // Enables JADE GUI

AgentContainer mainContainer = runtime.createMainContainer(profile);
AgentController senderAgent = mainContainer.createNewAgent("SenderAgent", "SenderAgent", new Object[]{});
AgentController receiverAgent = mainContainer.createNewAgent("ReceiverAgent", "ReceiverAgent", new Object[]{});
AgentController cyclicAgent = mainContainer.createNewAgent("CyclicAgent", "CyclicAgent", new Object[]{});
AgentController oneShotAgent = mainContainer.createNewAgent("OneShotAgent", "OneShotAgent", new Object[]{});
AgentController taskAgent = mainContainer.createNewAgent("TaskAgent", "TaskAgent", new Object[]{});

senderAgent.start();
receiverAgent.start();
cyclicAgent.start();
oneShotAgent.start();
taskAgent.start();
```
- **Creates a JADE platform** with a GUI.
- **Initializes a container** for the agents.
- **Creates and starts** multiple agents.

## Contribution
Feel free to fork the repository and submit **pull requests** if you want to improve the project.

## License
This project is open-source under the **MIT License**.

For any issues, contact **Damim-03** on GitHub.


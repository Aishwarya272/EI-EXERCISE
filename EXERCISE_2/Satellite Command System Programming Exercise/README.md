# **SATELLITE COMMAND SYSTEM**

## **Problem Statement**
The task is to develop a Satellite Command System that simulates controlling a satellite in orbit. 
The system should allow for a series of commands to change the satellite's orientation, control solar panel status, and manage data collection.

## **Functionalities**

- Initializing the Satellite
- Rotate
- Activate/Deactivate Solar Panels
- Collect Data

## **Implementation**
The implementation involves several classes to handle the satellite state and command execution:

**Satellite**: Represents the satellite with attributes for orientation, solar panel status, and data collected.

**Command Interface**: Defines a common interface for all commands with an execute method.

**Concrete Command Classes**: Specific commands like RotateCommand, ActivatePanelsCommand, DeactivatePanelsCommand, and CollectDataCommand.

**CommandInvoker**: Stores and executes the sequence of commands.

**Main Class**: Initializes the satellite and command invoker, and processes user input for commands.

Appropriate **logging and exception handling** are added in each class to ensure robust operation.

The Satellite Command System uses the **Command Pattern** to manage state transitions and command execution for a satellite. 
This solution adheres to SOLID principles, ensuring maintainability and scalability. 

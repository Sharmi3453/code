# Virtual Classroom Manager

The Virtual Classroom Manager is a terminal-based application designed to handle class scheduling, student attendance, and assignment submissions. This project is a backend for an EdTech platform that aims to host virtual classrooms.

## Features

- **Classroom Management**: Create and manage virtual classrooms.
- **Student Management**: Enroll students into classrooms.
- **Assignment Management**: Schedule assignments for classrooms and allow students to submit them.

## Usage

The application supports the following commands:

1. **Add Classroom**:
   - Command: `add_classroom [class name]`
   - Example: `add_classroom Math101`
   - Output: `Classroom Math101 has been created.`

2. **Add Student**:
   - Command: `add_student [student ID] [class name]`
   - Example: `add_student S001 Math101`
   - Output: `Student S001 has been enrolled in Math101.`

3. **Schedule Assignment**:
   - Command: `schedule_assignment [class name] [assignment details]`
   - Example: `schedule_assignment Math101 Homework 1`
   - Output: `Assignment for Math101 has been scheduled.`

4. **Submit Assignment**:
   - Command: `submit_assignment [student ID] [class name] [assignment details]`
   - Example: `submit_assignment S001 Math101 Homework 1`
   - Output: `Assignment submitted by Student S001 in Math101.`

## Running the Application

1. Save the code into a file named `VirtualClassroomManager.java`.

2. Open a terminal or command prompt.

3. Navigate to the directory where the file is saved.

4. Compile the Java file using `javac`:
    ```bash
    javac VirtualClassroomManager.java
    ```

5. Run the compiled Java program:
    ```bash
    java VirtualClassroomManager
    ```

6. Follow the on-screen instructions to enter commands and manage your virtual classrooms.



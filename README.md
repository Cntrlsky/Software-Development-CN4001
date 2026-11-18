# Repton Attendance System (CN4001)

Java console application for taking attendance at Repton school (Egypt).
Teachers log in to mark attendance for their own classes. Admins manage teachers, students, classes and sessions.

## Features
- Login and logout for teachers and an admin
- Role-based permissions (admin has all; teacher has only what's needed)
- Mark attendance for a class session
- View class records and student records
- Create teachers, students, classes, sessions (admin)

## Compile and run (from the repo root, PowerShell)
    javac -d out (Get-ChildItem -Recurse SRC -Filter *.java).FullName
    java -cp out SRC.Main

## Structure
- SRC/Model: data classes (User, Admin, Teacher, Student, ClassGroup, ClassSession, AttendanceRecord, Status, Role, Action)
- SRC/Service: rules (AuthService, StudentService, ClassService, SessionService, AttendanceService)
- SRC/Storage: repositories (CSV files in /Data)
- SRC/UserInterface: console menu (GUI is a placeholder, not planned)
- Test: tests

## Team and ownership
- Person 1, Users and login: <Yasser>
- Person 2, Students and classes: <Adham>
- Person 3, Attendance and sessions: <Mohanned>
- Person 4, Storage and tests: <Davied>
- Person 5, App flow and integration: <Hamza>

## Decisions
- Lookups that find nothing return null or an empty list.
- SecurityException = not allowed, IllegalArgumentException = bad input, IllegalStateException = already marked or enrolled.
- Attendance is for today only. Teachers can't edit a record after submitting.
- A student belongs to exactly one class. IDs are int, assigned by the repository (highest + 1).
- Every model has getters for all fields.
- Services receive their repositories in the constructor. Main wires everything.
- 3 login attempts. Passwords are stored hashed.

## Rules
- One branch per person. Open a pull request into main. Never push to main or force push.
- Only edit your own files. Ask the owner for changes in others.
- Commit messages say what changed.

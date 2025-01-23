Vehicle Rental System

Project Description

The Vehicle Rental System is a Java-based application that manages the rental process for vehicles such as cars and bikes. The system provides functionality to add vehicles, rent them, and calculate rental costs while demonstrating key Object-Oriented Programming (OOP) concepts such as inheritance, polymorphism, and encapsulation.

Features

Classes and Attributes:

Vehicle (Base class):

Attributes: model, type, availability.

Abstract method: calculateRentalCost().

Car and Bike:

Inherit from Vehicle and implement cost calculation.

Rental:

Attributes: startDate, endDate, totalCost.

Methods: Calculate rental cost and complete rental.

Methods:

Add a vehicle to the system.

Rent a vehicle by specifying the model and rental period.

Display all available vehicles.

Calculate rental costs dynamically based on vehicle type and rental duration.

OOP Concepts Used:

Inheritance: Car and Bike inherit from Vehicle.

Polymorphism: Rent different types of vehicles using the same interface.

Encapsulation: Use of private fields with public getters and setters.

Getting Started

Prerequisites

Java Development Kit (JDK) 8 or higher.

A Java IDE such as IntelliJ IDEA, Eclipse, or VS Code.

Installation

Clone the repository:

git clone <repository-url>

Open the project in your preferred Java IDE.

Compile and run the VehicleRentalSystem class.

Usage

Adding Vehicles:

Add vehicles to the system using the addVehicle() method in the VehicleRentalSystem class.

Displaying Available Vehicles:

Use the displayAvailableVehicles() method to list all available vehicles.

Renting a Vehicle:

Rent a vehicle using the rentVehicle() method by providing the model name and rental dates.

Example Interaction:

Available Vehicles:
Toyota Corolla (Car)
Yamaha R15 (Bike)
Honda Civic (Car)

Rental Successful!
Vehicle: Toyota Corolla (Car)
Start Date: 2025-01-25
End Date: 2025-01-28
Total Cost: $150.0

Available Vehicles:
Yamaha R15 (Bike)
Honda Civic (Car)

Future Enhancements

User management for tracking who rents which vehicle.

Late fee calculations for overdue returns.

Payment integration for processing rental payments.

A web or GUI-based interface for enhanced usability.

Booking history and maintenance tracking for vehicles.

Skills Demonstrated

Core Java (OOP principles, abstract classes, inheritance, polymorphism).

Basic data handling using lists.

Console-based application development.

Author

Developed by Jamshed.

Feel free to contribute by submitting pull requests or suggesting features!


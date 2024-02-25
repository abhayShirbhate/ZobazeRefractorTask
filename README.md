# Zobaze Refactor Task

## Overview
This repository hosts the refactored codebase for the Zobaze Refactor Task, an Android code refactoring challenge. The objective of this task was to modernize and enhance an existing Android application that displays a list of employees fetched from an external API. The original codebase suffered from outdated practices, poor architecture, and confusing naming conventions, thus requiring significant improvements for better maintainability, performance, and user experience.

## Key Changes Made
The following key changes were implemented during the refactoring process:

1. **Migration to MVVM Architecture**: The application architecture was refactored to follow the Model-View-ViewModel (MVVM) pattern, ensuring a clear separation of concerns and improved maintainability.
   
2. **Adoption of Modern Data Binding Techniques**: Outdated manual UI updates were replaced with modern data binding techniques, enhancing code readability and reducing boilerplate.

3. **Optimization of Network Operations**: Network calls were migrated from performing on the UI thread to asynchronous operations using Retrofit, improving app responsiveness and preventing ANRs (Application Not Responding errors).

4. **Enhanced JSON Handling**: Manual JSON parsing was replaced with serialization techniques, simplifying data parsing and improving code clarity.

5. **Introduction of LiveData for Data Observation**: LiveData was utilized for observing data changes and updating the UI accordingly, ensuring robust error handling and efficient UI updates.

6. **Comprehensive Error Handling**: Error handling mechanisms were implemented for network requests, providing appropriate feedback to users during loading states and error scenarios.

7. **Code Cleanup and Optimization**: The codebase underwent extensive cleanup and optimization, ensuring adherence to best practices for Android development, improved readability, and maintainability.

## Repository Structure
- **app**: Contains the refactored Android application codebase.
- **report**: Includes the brief report outlining the changes made, architectural decisions, and any challenges encountered during the refactoring process.

## Evaluation Criteria
The refactored codebase will be evaluated based on the following criteria:
- Adherence to modern Android development practices and architectural patterns.
- Code quality, readability, and maintainability.
- Performance optimizations, particularly in UI responsiveness and network operations.
- Effective use of modern data binding and asynchronous programming patterns.

## How to Run the Application
To run the refactored application:
1. Clone this repository to your local machine.
2. Open the project in Android Studio.
3. Build and run the application on an Android emulator or device.

## Acknowledgments
We would like to thank all contributors who participated in the Zobaze Refactor Task and helped improve the quality of the Android application codebase.

---
**Note**: This README provides an overview of the Zobaze Refactor Task repository and the key changes made during the refactoring process. For detailed information, please refer to the report in the `report` directory.

**GitHub Repository**: [ZobazeRefactorTask](https://github.com/abhayShirbhate/ZobazeRefractorTask.git)

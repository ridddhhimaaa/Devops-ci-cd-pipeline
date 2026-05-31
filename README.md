<h1 align="center">Automated CI/CD Pipeline for Modern DevOps Infrastructure</h1>

<h2 align="center">Table of Contents</h2>
- [Project Overview](#project-overview)
- [STAR Analysis](#star-analysis)
- [Technologies Used](#technologies-used)
- [Project Architecture](#project-architecture)
- [Installation and Local Setup](#installation-and-local-setup)
- [How to Access and Use](#how-to-access-and-use)
- [Use Cases](#use-cases)
- [Future Scope](#future-scope)
- [Project Objectives and Key Learnings](#project-objectives-and-key-learnings)
- [License](#license)

<h2 align="center">Project Overview</h2>

### Purpose
The primary purpose of this project is to demonstrate a robust, automated DevOps lifecycle for a Java-based web application. It showcases the integration of continuous integration and continuous deployment (CI/CD) practices using industry-standard tools to streamline software delivery and ensure operational excellence.

### Features and Functionality
- Automated Build Process: Utilizes Maven for consistent and repeatable builds.
- Containerization: Leverages Docker to package the application with all its dependencies, ensuring "it works on my machine" translates to the production environment.
- CI/CD Orchestration: Implements a Jenkins pipeline to automate the transition from source code to deployable container images.
- Responsive Web Interface: Includes a Spring Boot-driven frontend serving a professional, modern landing page.
- Infrastructure as Code: Defines the build and deployment environment through a Dockerfile and Jenkinsfile.

<h2 align="center">STAR Analysis</h2>

### Situation
In contemporary software engineering, manual build and deployment processes often lead to inconsistencies, human error, and delayed release cycles. The goal was to modernize the deployment workflow for a Java Spring Boot application to meet enterprise standards for automation and reliability.

### Task
The objective was to design and implement an end-to-end CI/CD pipeline that automates the compilation, testing, and containerization of the application, thereby reducing manual overhead and ensuring environment consistency across the development lifecycle.

### Action
- Spring Boot Development: Engineered a robust web application using Java 17 and Spring Boot 3.3.0.
- Dependency Management: Configured Maven to handle complex dependency trees and manage the project lifecycle.
- Docker Integration: Authored a Dockerfile using the Eclipse Temurin JDK 21 image for optimized container performance and security.
- Automation Scripting: Developed a custom Jenkinsfile following the Pipeline-as-Code principle to automate the 'Build' and 'Package' stages.
- UI Enhancement: Designed a futuristic, high-performance web interface using HTML5, CSS3, and JavaScript.

### Result
Success was achieved through the creation of a seamless automation pipeline. The project significantly reduced the time from code commit to container image availability, eliminated configuration drift through containerization, and established a scalable foundation for high-frequency deployments.

<h2 align="center">Technologies Used</h2>

- Programming Languages: Java 17, HTML5, CSS3, JavaScript
- Frameworks: Spring Boot 3.3.0
- Build Tools: Apache Maven
- Containerization: Docker
- CI/CD Tools: Jenkins
- Version Control: Git / GitHub
- Base Image: Eclipse Temurin (JDK 21)

<h2 align="center">Project Architecture</h2>

1. Source Code Management: Developers push code updates to the GitHub repository.
2. Continuous Integration: Jenkins detects changes and initiates the pipeline defined in the Jenkinsfile.
3. Build Stage: Maven compiles the source code and packages it into a JAR file.
4. Containerization: Docker takes the build artifact and wraps it into a lightweight, portable container image.
5. Deployment Readiness: The final image is tagged and ready for orchestration via Kubernetes or standalone Docker environments.

<h2 align="center">Installation and Local Setup</h2>

Follow these steps to set up and run the project on your local machine.

### Prerequisites
- Java 17 or higher
- Maven 3.6 or higher
- Docker Desktop
- Git

### Step-by-Step Instructions
1. Clone the Repository:
   ```bash
   git clone https://github.com/ridddhhimaaa/Devops-ci-cd-pipeline.git
   cd Devops-ci-cd-pipeline
   ```
2. Build the Application:
   ```bash
   mvn clean package
   ```
3. Build the Docker Image:
   ```bash
   docker build -t devops-project .
   ```
4. Run the Container:
   ```bash
   docker run -p 8080:8080 devops-project
   ```
5. Access the Application:
   Open your browser and navigate to `http://localhost:8080`.

<h2 align="center">How to Access and Use</h2>

### Live Website URL
[View Live Demo](https://devops-ci-cd-pipeline-demo.onrender.com)

### Usage Guide
- Home Dashboard: Once accessed, the main dashboard provides an overview of the DevOps infrastructure.
- Pipeline Status: (If integrated) View real-time status of the build and deployment stages.
- Responsiveness: Navigate the site on various devices to experience the fluid UI/UX design.

<h2 align="center">Use Cases</h2>

- Portfolio Demonstration: Showcasing DevOps and Full-Stack engineering skills to recruiters and hiring managers.
- Enterprise Template: Serving as a blueprint for setting up automated pipelines for legacy or new Java applications.
- Educational Reference: Using the repository as a learning resource for understanding Jenkins pipelines and Docker integration.

<h2 align="center">Future Scope</h2>

- Orchestration with Kubernetes: Implement K8s manifests for automated scaling and self-healing.
- Advanced Monitoring: Integrate Prometheus and Grafana for real-time application and infrastructure monitoring.
- Infrastructure as Code (IaC): Incorporate Terraform to automate the provisioning of cloud infrastructure.
- Security Scanning: Add SonarQube and Snyk into the CI/CD pipeline for static code analysis and vulnerability scanning.
- Automated Testing: Expand the pipeline to include comprehensive integration and end-to-end tests.

<h2 align="center">Project Objectives and Key Learnings</h2>

### Objectives
- Establish a zero-touch deployment workflow.
- Ensure environment parity using containerization.
- Deliver a high-performance, aesthetically pleasing web interface.

### Key Learnings
- Mastery of Jenkins Pipeline-as-Code syntax and Maven lifecycle management.
- Deep understanding of multi-stage Docker builds and image optimization.
- Proficiency in blending backend robust logic with modern frontend aesthetics.
- Experience in resolving complex integration issues within a CI/CD environment.

<h2 align="center">License</h2>
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

<h1 align="center">Modern DevOps Infrastructure Automation</h1>

<h2 align="center">Situation</h2>
<p align="center">
In the current fast-paced software development landscape, manual intervention in build and deployment processes often leads to inconsistencies, environmental drift, and increased time-to-market. The challenge was to bridge the gap between development and operations by creating a seamless, automated pathway from source code to a production-ready containerized environment.
</p>

<h2 align="center">Task</h2>
<p align="center">
The objective was to design and implement a comprehensive CI/CD pipeline for a Java-based web application. This involved establishing a robust build system, containerizing the application for platform independence, and orchestrating the entire lifecycle to ensure that every code change is automatically validated and packaged for deployment.
</p>

<h2 align="center">Action</h2>
<p align="center">
To achieve this, I implemented the following solutions:
<br>1. <b>Backend Development:</b> Built a scalable web service using Spring Boot 3.3 and Java 17.
<br>2. <b>Build Management:</b> Integrated Apache Maven to handle dependency management and standardized build cycles.
<br>3. <b>Containerization:</b> Developed a custom Dockerfile based on the Eclipse Temurin JDK 21 image, ensuring a lightweight and secure runtime environment.
<br>4. <b>Pipeline Orchestration:</b> Defined a Jenkins Pipeline (Jenkinsfile) to automate the build and container image creation stages.
<br>5. <b>Frontend Dashboard:</b> Created an interactive, futuristic web dashboard to visualize the DevOps metrics and system health.
</p>

<h2 align="center">Result</h2>
<p align="center">
Successfully developed a "zero-touch" deployment pipeline that automates the migration of code from repository to container image. This implementation ensures structural consistency across development, testing, and production environments, significantly reducing manual overhead and providing real-time visibility into the system's operational status.
</p>

<h2 align="center">Technology Stack</h2>
<p align="center">
<b>Backend:</b> Java 17, Spring Boot 3.3
<br><b>Build Tool:</b> Maven
<br><b>Containerization:</b> Docker
<br><b>CI/CD:</b> Jenkins
<br><b>Frontend:</b> HTML5, CSS3 (Modern UI)
</p>

<h2 align="center">Access the Application</h2>
<p align="center">
The application can be accessed via the local server port 8081:
<br><a href="http://localhost:8081">http://localhost:8081</a>
</p>

<h2 align="center">Future Scope</h2>
<p align="center">
<b>Orchestration:</b> Migrating from standalone Docker containers to Kubernetes for horizontal auto-scaling and self-healing capabilities.
<br><b>Security Analysis:</b> Integrating Static Application Security Testing (SAST) tools like SonarQube into the Jenkins pipeline.
<br><b>Cloud Infrastructure:</b> Implementation of Infrastructure as Code (IaC) using Terraform for automated resource provisioning on cloud providers.
<br><b>Monitoring:</b> Setting up a centralized observability stack using Prometheus, Grafana, and the ELK stack for real-time performance tracking.
</p>

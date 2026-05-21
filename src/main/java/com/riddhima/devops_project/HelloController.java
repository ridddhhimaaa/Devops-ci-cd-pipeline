package com.riddhima.devops_project;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String home() {
        return """
        <html>
        <head>
            <title>DevOps Pipeline Dashboard</title>
        </head>

        <body style="font-family: Arial; padding: 40px; background-color: #f4f6f8;">

            <div style="max-width: 900px; margin: auto; background: white; padding: 30px; border-radius: 10px; box-shadow: 0px 0px 10px rgba(0,0,0,0.1);">

                <h1 style="color: #2c3e50;">
                    Complete DevOps CI/CD Pipeline
                </h1>

                <hr>

                <h2>Project Overview</h2>

                <p>
                    This project demonstrates automated CI/CD pipeline implementation
                    using Spring Boot, Maven, Jenkins, Docker, and GitHub.
                </p>

                <h2>Tools Used</h2>

                <ul>
                    <li>GitHub</li>
                    <li>Jenkins</li>
                    <li>Maven</li>
                    <li>Docker</li>
                    <li>Spring Boot</li>
                </ul>

                <h2>Workflow</h2>

                <p>
                    Developer → GitHub → Jenkins → Maven Build → Docker Image → Deployment
                </p>

                <h2>Pipeline Status</h2>

                <p>✔ Build Successful</p>
                <p>✔ Docker Container Running</p>
                <p>✔ CI/CD Pipeline Working</p>

                <hr>

                <h3>
                    Developed by Riddhima Rai
                </h3>

            </div>

        </body>
        </html>
        """;
    }
}

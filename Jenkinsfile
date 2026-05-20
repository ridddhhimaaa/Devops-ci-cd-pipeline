pipeline {
    agent any

    tools {
        maven 'Maven'
    }

    stages {

        stage('Build Application') {
            steps {
                bat 'mvn clean package'
            }
        }

        stage('Build Docker Image') {
            steps {
                bat 'docker build -t devops-project .'
            }
        }

    }
}
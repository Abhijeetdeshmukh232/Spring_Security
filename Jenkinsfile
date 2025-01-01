pipeline {
    agent any

    tools {
        jdk 'JDK17' // Configure Java in Jenkins Global Tool Configuration
        maven 'Maven3' // Configure Maven in Jenkins Global Tool Configuration
    }

    environment {
        DEPLOY_DIR = 'C:\\Deployment' // Define the deployment directory
    }

    stages {
        stage('Checkout Code') {
            steps {
                git branch: 'main', url: 'https://github.com/Abhijeetdeshmukh232/Spring_Security.git'
            }
        }

        stage('Build with Maven') {
            steps {
                echo "Building the project with Maven"
                sh 'mvn clean install'
            }
        }
    }

    post {
        success {
            echo 'Build Successful!'
        }
        failure {
            echo 'Build Failed. Check logs for details.'
        }
    }
}

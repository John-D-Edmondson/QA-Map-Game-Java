pipeline {
    agent any

    environment {
        // Define any environment variables, such as Maven settings
        MAVEN_HOME = tool 'M3'
    }

    stages {
        stage('Checkout') {
            steps {
                // Checkout the code from the repository
                git branch: 'main', url: 'https://github.com/John-D-Edmondson/QA-Map-Game-Java.git'
            }
        }
        
        stage('Compile') {
            steps {
                // Compile the Maven project
                sh "${MAVEN_HOME}/bin/mvn clean compile"
            }
        }
        
        stage('Package') {
            steps {
                // Package the application
                sh "${MAVEN_HOME}/bin/mvn package"
            }
        }
        
        stage('Archive Artifact') {
            steps {
                // Archive the build artifact
                archiveArtifacts artifacts: 'target/*.jar', fingerprint: true
            }
        }
    }

    post {
        // Notifications or clean-up steps
        always {
            echo 'Pipeline completed'
        }
        success {
            echo 'Pipeline succeeded'
        }
        failure {
            echo 'Pipeline failed'
        }
    }
}

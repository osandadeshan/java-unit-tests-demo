pipeline {
    agent any

    tools {
        maven "Maven"
    }

    stages {
        stage('Build') {
            steps {
                bat "mvn clean install -DskipTests"
            }
        }
        stage('Test') {
            steps {
                bat "mvn clean test"
            }
        }
    }
}

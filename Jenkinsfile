pipeline {
    agent any

    tools {
        maven 'Maven-3.9' // Manage Jenkins -> Tools lo pettina peru idhe
    }

    stages {
        stage('Checkout Code') {
            steps {
                echo 'Code ni GitHub nunchi pull chestunna...'
                checkout scm
            }
        }

        stage('Build & Test') {
            steps {
                echo 'Maven tho clean package run chestunna...'
                bat 'mvn clean package'
            }
        }

        stage('Archive Jar') {
            steps {
                echo 'Jar file ni save chestunna...'
                archiveArtifacts artifacts: 'target/*.jar', fingerprint: true
            }
        }
    }

    post {
        success {
            echo 'Pipeline SUCCESS! ✅'
            mail to: 'kishorepamarthi001@gmail.com', // Ikkada nee mail ID pettu
                 subject: "Jenkins Pipeline SUCCESS: ${env.JOB_NAME} #${env.BUILD_NUMBER}",
                 body: "Build successful ra KISHORE! Jar file ready. \nCheck: ${env.BUILD_URL}"
        }
        failure {
            echo 'Pipeline FAILED! ❌'
            mail to: 'kishorepamarthi001@gmail.com', // Ikkada nee mail ID pettu
                 subject: "Jenkins Pipeline FAILED: ${env.JOB_NAME} #${env.BUILD_NUMBER}",
                 body: "Build fail ayyindi ra. Console check cheyi: ${env.BUILD_URL}"
        }
    }
}

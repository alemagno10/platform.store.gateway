pipeline {
    agent any
    stages {
        stage('Jenkins Gateway') {
            steps {
                echo 'Gateway'
            }
        }
        stage('Build') { 
            steps {
                sh 'mvn clean package'
            }
        }  
        stage('Build Image'){
            steps {
                script {
                    gateway = docker.build("alemagno10/gateway:${env.BUILD_ID}", "-f Dockerfile .")
                }
            }
        }    
        stage('Push Image'){
            steps {
                script {
                    docker.withRegistry('https://registry.hub.docker.com', 'dockerhub') {
                        gateway.push("${env.BUILD_ID}")
                        gateway.push("latest")
                    }
                }
            }
        }
    }
}
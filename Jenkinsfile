pipeline {
    agent any
    tools {
        gradle "gradle-8.7"
        'org.jenkinsci.plugins.docker.commons.tools.DockerTool' 'docker'
    }
    stages {
        stage('Git checkout') {
            steps {
                echo 'checkout...'
                git branch: 'main',
//                        credentialsId: '12345-1234-4696-af25-123455',
                        url: 'https://github.com/nadia-hipster/nc-docker-demo.git/'
            }
        }
        stage('build') {
            steps {
                echo 'building...'
                sh 'gradle clean build'
            }
        }
        stage('test') {
            steps {
                echo 'testing...'
                sh 'gradle test'
            }
        }
        stage('build image') {
            steps {
                echo 'building image docker...'
                sh 'docker build -t nc/nc-docker-demo  -v $(which docker):/usr/bin/docker .'
            }
        }
        stage('push image') {
            steps {
                echo 'pushing image docker...'
            }
        }
    }
}

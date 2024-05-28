pipeline {
    agent any
    tool {
        gradle '8.7'
    }
    stages {
        stage('build') {
            steps {
                echo 'building...'
                sh 'gradle clean build'
            }
        }
        stage('test') {
            steps {
               echo 'testing...'
            }
        }
        stage('build image') {
             steps {
                 echo 'building image docker...'
             }
        }
        stage('push image') {
              steps {
                    echo 'pushing image docker...'
              }
        }
    }
}

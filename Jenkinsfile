pipeline {
    agent {
        docker {
            image 'richardqa:mcs-servicio-renhice:1.0.0'
            args '-v /home/usr_linux/proyecto-test/test1/mcs-minsa:/opt/data/mcs-minsa'
        }
    }
    stages {
        stage('Test') {
            steps {
                sh 'jarsigner -verify /app.jar'
            }
        }
        stage('Deliver') {
            steps {
                sh './jenkins/scripts/deliver.sh'
            }
        }
    }
}

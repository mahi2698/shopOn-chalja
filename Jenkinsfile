pipeline {
    agent any
    stages {
        stage('Build'){
            steps {
                echo "Build Project"
                sh label: '', script: 'mvn clean install'
                sh label: '', script: 'mvn clean install -Dmaven.repo.local=$WORKSPACE/target/test-classes'
            }
        }
    }
}

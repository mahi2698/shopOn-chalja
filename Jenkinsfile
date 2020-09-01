pipeline {
    agent any
    stages {
        stage('Build'){
            steps {
                echo "Build Project"
                sh label: '', script: 'mvn clean install'
            }
        }
        stage('HTML REPORT'){
            steps{
                echo "HTML Report"
                publishHTML([allowMissing: false, alwaysLinkToLastBuild: false, keepAll: false, reportDir: '$WORKSPACE', reportFiles: '*.html', reportName: 'HTML Report', reportTitles: ''])
            }
        }
        stage('JUnit REPORT'){
            steps{
                echo "JUNIT Reports"
                junit '$WORKSPACE/target/surefire-reports/*.xml'
            }
        }
    }
}

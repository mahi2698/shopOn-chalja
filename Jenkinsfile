pipeline {
    agent any
    stages {
        stage('Build'){
            steps {
                echo "Build Project"
                sh label: '', script: 'mvn clean install'
            }
        }
        stage('JAVA RUN'){
            steps{
                echo "JAVA RUN"
                //sh label: '', script: 'javac ./src/test/java/com/ShopOn/TestRunner/TestRunner.java'
                //sh label: '', script: 'java ./src/test/java/com/ShopOn/TestRunner/TestRunner'
                //sh label: '', script: '''ProjectPath=$WORKSPACE && classpath=$WORKSPACE/target/test-classes;$WORKSPACE/target/test-classes/* && java com.ShopOn.TestRunner.TestRunner'''
                //sh label: '', script: 'java $WORKSPACE/target/test-classes/com/ShopOn/TestRunner/TestRunner'
                sh label: '', script: '''MavenDirectory='/usr/share/maven/repository'
find . -name $MavenDirectory/*.jar -exec cp {} $WORKSPACE/target/test-classes/ ;
ProjectPath=$WORKSPACE
classpath=$WORKSPACE/target/test-classes;$WORKSPACE/target/test-classes/*
java com.ShopOn.TestRunner.TestRunner'''
            }
        }
    }
}

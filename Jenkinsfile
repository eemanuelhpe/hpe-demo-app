pipeline {
    agent any
    tools {
        maven 'maven'
    }
    stages {
        stage ('Compile Stage') {

            steps {                
                    bat 'mvn clean compile'                
            }
        }

        stage ('Testing Stage') {

            steps {                
                   bat 'mvn -Dmaven.test.failure.ignore test'         
            }
        }        
       
    }    
    post {         
         always {
             junit '**/target/surefire-reports/TEST-*.xml'
        }              
    }
}
© 2020 GitHub, Inc.

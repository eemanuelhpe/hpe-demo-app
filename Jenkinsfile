pipeline {
    agent any
    tools {
        maven 'maven'
    }
    stages {
        stage ('Compile Stage') {

            steps {       
                withSonarQubeEnv('my_sonar_instance') {
                	addALMOctaneSonarQubeListener pushCoverage: true, pushVulnerabilities:true, sonarToken:env.SONAR_AUTH_TOKEN, sonarServerUrl:env.SONAR_HOST_URL
	                bat 'mvn clean install $SONAR_MAVEN_GOAL -Dmaven.test.failure.ignore -Dsonar.host.url=$SONAR_HOST_URL -Dsonar.login=$SONAR_AUTH_TOKEN -Dsonar.analysis.buildNumber=${BUILD_NUMBER} -Dsonar.analysis.jobName=${JOB_NAME}'
                }
            }
        }     
       
    }    
    post {         
         always {
             junit '**/target/surefire-reports/TEST-*.xml'
        }              
    }
}


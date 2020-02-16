pipeline {
    agent any
    tools {
        maven 'maven'
    }
    stages {
        stage ('Compile Stage') {

            steps {       
                withSonarQubeEnv('sonar') {
                	addALMOctaneSonarQubeListener pushCoverage: true, pushVulnerabilities:true, sonarToken:env.SONAR_AUTH_TOKEN, sonarServerUrl:env.SONAR_HOST_URL
	               	bat(returnStatus: true, script: "mvn clean install $SONAR_MAVEN_GOAL -Dsonar.host.url=$SONAR_HOST_URL -Dsonar.login=$SONAR_AUTH_TOKEN -Dsonar.analysis.buildNumber=${BUILD_NUMBER} -Dsonar.analysis.jobName=${JOB_NAME}  -Dmaven.test.failure.ignore")
                }
            }
        }            
    }       
}

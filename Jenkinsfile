pipeline {
    agent any

    tools {
         maven 'apache-maven-3.8.6'
        jdk 'JAVA_HOME'
  }
  
    stages {
	stage('Checkout code') {
        	steps {
		// Get some code from a GitHub repository
    	checkout([$class: 'GitSCM',
        branches: [[name: '*/master']],
        extensions: [[$class: 'CloneOption', timeout: 120]],
        gitTool: 'Default', 
        userRemoteConfigs: [[url: 'https://github.com/amrimukh1/CucumberDemo']]
    ])
           	checkout scm
           	echo 'I am in Checkout code'
        }
    } 
		
	stage ('Build') {
		steps {
		
		
        withMaven {
      	bat "mvn clean verify"  
    } // withMaven will discover the generated Maven artifacts, JUnit Surefire & FailSafe reports and FindBugs reports
    
    echo 'I am in Build'
		}}
	
            
          stage('Cucumber Report'){
		steps{
			// Get some code from a GitHub repository
    	checkout([$class: 'GitSCM',
       	branches: [[name: '*/master']],
        	extensions: [[$class: 'CloneOption', timeout: 120]],
        	gitTool: 'Default', 
        	userRemoteConfigs: [[url: 'https://github.com/amrimukh1/CucumberDemo']]
			 ]) 
		cucumber buildStatus: 'UNSTABLE',
		fileIncludePattern: '**/*.json',
               jsonReportDirectory: 'target/JSONReports'}}
      
	   
}

 }   
 
 



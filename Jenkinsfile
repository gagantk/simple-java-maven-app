pipeline {
	agent any
	
	stages {
		stage('Clean') {
			steps {
				bat 'mvn clean'
			}
		stage('Compile') {
			steps {
				bat 'mvn compile'
			}
		stage('Test') {
			steps {
				bat 'mvn resources:testResources'
				bat 'mvn compiler:testCompile'
				bat 'mvn surefire:test'
			}
		stage('Code Coverage') {
			steps {
				bat 'mvn sonar:sonar'
				publishCoverage adapters: [jacocoAdapter(path: 'target/site/jacoco/jacoco.xml', thresholds: [[failUnhealthy: true, thresholdTarget: 'Aggregated Report', unhealthyThreshold: 50.0, unstableThreshold: 80.0]])], failUnhealthy: true, sourceFileResolver: sourceFiles('NEVER_STORE')
			}
		}
		stage('Build') {
			steps {
				bat 'mvn install:install'
			}
		}
	}
}
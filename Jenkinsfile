stage('continuous integration') {
    node {
    	checkout scm
    	// git branch: 'jenkins-task', url: 'https://github.com/gagantk/simple-java-maven-app.git'
    	
    	bat 'mvn clean test'
    }
}
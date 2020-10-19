node {
    stage('Checkout SCM') {
        checkout scm
    }
    stage('Compile') {
        bat 'mvn compile'
    }
    stage('Test') {
        bat 'mvn resources:testResources'
        bat 'mvn compiler:testCompile'
        bat 'mvn surefire:test'
    }
    stage('Code Coverage') {
        bat 'mvn sonar:sonar'
        publishCoverage adapters: [jacocoAdapter(path: 'target/site/jacoco/jacoco.xml', thresholds: [[failUnhealthy: true, thresholdTarget: 'Aggregated Report', unhealthyThreshold: 80.0, unstableThreshold: 80.0]])], failUnhealthy: true, sourceFileResolver: sourceFiles('NEVER_STORE')
    }
    stage('Build') {
        bat 'mvn jar:jar install:install'
    }
}

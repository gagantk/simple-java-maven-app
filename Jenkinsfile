node {
    stage('Checkout SCM') {
        checkout scm
    }
    stage('Compile') {
        sh 'mvn compile'
    }
    stage('Test') {
        sh 'mvn resources:testResources'
        sh 'mvn compiler:testCompile'
        sh 'mvn surefire:test'
    }
    stage('Code Coverage') {
        sh 'mvn sonar:sonar'
        publishCoverage adapters: [jacocoAdapter(path: 'target/site/jacoco/jacoco.xml', thresholds: [[failUnhealthy: true, thresholdTarget: 'Aggregated Report', unhealthyThreshold: 80.0, unstableThreshold: 80.0]])], failUnhealthy: true, sourceFileResolver: sourceFiles('NEVER_STORE')
    }
    stage('Build') {
        sh 'mvn jar:jar install:install'
    }
}

pipeline {

agent any

stages {

stage('Checkout') {
steps {
checkout scm
}
}

stage('Run Playwright Tests') {
steps {
bat 'mvn test'
}
}
}

post {
always {
junit allowEmptyResults: false, testResults: '**/target/surefire-reports/*.xml'
}
}
}
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
stage('Check Generated Files') {
steps {
bat 'echo ===== TARGET FOLDER ====='
bat 'dir target /s'
}
}
}

post {
always {
archiveArtifacts artifacts:
'target/screenshots/**/*.png,' +
'target/videos/**/*.webm',
allowEmptyArchive: true

junit 'target/surefire-reports/*.xml'	
}
}
}
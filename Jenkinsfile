import groovy.json.JsonSlurperClassic
pipeline {
    agent any
    stages {
        stage('Bitrise executor') {
            when {
                branch 'develop'
            steps {
                echo 'Connecting to Bitrise project'
                sh 'curl --version'
                sh '-X POST -H "https://api.bitrise.io/v0.1/apps/c6aaf08b56227d8f/builds"'
                script{
                    def jsonFile = readFile(file:'bitriseCurl/curl.json')
                }
        }
    }
    
  }
}
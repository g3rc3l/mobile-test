import groovy.json.JsonSlurperClassic
pipeline {
    agent any
    stages {
        stage('Bitrise executor') {
            steps {
                echo 'Connecting to Bitrise project'
                sh 'curl --version'
                sh curl curl -X POST -H "Content-Type: application/json" -d @req.json "https://api.bitrise.io/v0.1/apps/c6aaf08b56227d8f/builds/BUILD-SLUG"
                script{
                    def jsonFile = readFile(file:'bitriseCurl/curl.json')
                }
        }
    }
    
   }
}

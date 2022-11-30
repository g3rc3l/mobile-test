@Library ("shared-library-NC-validation") _
import groovy.json.JsonSlurperClassic
pipeline {
    agent any
    stages {
        stage('Bitrise executor') {
            steps {
                script{
                    final String url = "https://app.bitrise.io/app/c6aaf08b56227d8f/build/start.json"
                    final String response = sh(script: "curl -s $url", returnStdout:true).trim()

                    echo response
                    }
                }
            }

        }


    }

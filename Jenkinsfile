import groovy.json.JsonSlurperClassic
pipeline {
    agent any
    stages {
        stage('Bitrise executor') {
            steps {
                echo 'Connecting to Bitrise project'
                sh 'curl --version'
                sh curl --fail -H "Authorization: $tJYY5MWhRIrAmcfP7syzGiTVYNHo65V8ZsupLZkIFOdjRgkKoTQXbL3PNfaMOiRLQqwa6dlX_bYVbckSXHzLjg" "https://app.bitrise.io/app/c6aaf08b56227d8f/build/start.json"
                script{
                    def jsonFile = readFile(file:'bitriseCurl/curl.json')
                }
        }
    }
    
   }
}

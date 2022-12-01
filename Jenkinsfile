pipeline {
    agent any
    stages {
        stage('Bitrise executor') {
            steps {
                echo 'Connecting to Bitrise project'
                sh 'curl --version'
                script{
                    def jsonFile = readFile(file:'bitriseCurl/curl.json')
                     sh 'curl -X POST -H "Authorization: $tJYY5MWhRIrAmcfP7syzGiTVYNHo65V8ZsupLZkIFOdjRgkKoTQXbL3PNfaMOiRLQqwa6dlX_bYVbckSXHzLjg" "https://api.bitrise.io/v0.1/apps/$c6aaf08b56227d8f/builds"'
                     echo "Status: ${response.status} "
                }
        }
    }
    
   }
}

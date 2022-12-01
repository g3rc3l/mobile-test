pipeline {
    agent any
    stages {
        stage('Bitrise executor') {
            steps {
                echo 'Connecting to Bitrise project'
                sh 'curl --version'
                script{
                    def jsonFile = readFile(file:'bitriseCurl/curl.json')
                    echo $ {jsonFile} 
                }
        }
    }
    
   }
}

pipeline {
    agent any
    stages {
        stage('Bitrise executor') {
            steps {
                echo 'Connecting to Bitrise project'
                sh 'curl --version'
                script{
                    def jsonBitrise = '{"name":"gercel", "age":10}'
                    def jsonObj = readJson text: jsonString

                    assert jsonObj['name']== 'gercel'
                    sh "echo ${jsonObj.name}"
                    sh "echo ${jsonObj.age}" 
                }
        }
    }
    
   }
}

pipeline {
    agent any
    stages {
        stage('Bitrise build executor') {
            steps {
                $ curl https://app.bitrise.io/app/c6aaf08b56227d8f/build/start.json -L --data '{"hook_info":{"type":"bitrise","build_trigger_token":"WNZmF9mslpOi2myAVOlUug"},"build_params":{"branch":"develop"},"triggered_by":"curl"}'
             
            }
        }
        
    }
    
}
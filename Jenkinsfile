pipeline {
    agent any

    stages {
        stage('Bitrise Build Executor') {
            steps {
               httpRequest acceptType: 'APPLICATION_JSON', contentType: 'APPLICATION_JSON', customHeaders: [[maskValue: false, name: 'Authorization', value: 'tJYY5MWhRIrAmcfP7syzGiTVYNHo65V8ZsupLZkIFOdjRgkKoTQXbL3PNfaMOiRLQqwa6dlX_bYVbckSXHzLjg']], httpMode: 'POST', requestBody: '''{
 "build_params":{
      "branch":"develop",
      "workflow_id":"android-test"
     }, 
    "hook_info":{
      "type":"bitrise"
    }

}''', responseHandle: 'NONE', url: ' https://api.bitrise.io/v0.1/apps/c6aaf08b56227d8f/builds', wrapAsMultipart: false
            }
        }
    }
}
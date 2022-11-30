def call() {
    echo "Deploy To K8s"
    /*
    sh "echo parameters"
    container(name: 'kubectl', shell: '/bin/bash') {
        script {
            echo "[DEBUG] deploy.yaml generado"
            sh 'cat deploy.yaml'
            if(!env.TEST.toBoolean() && env.DEPLOY_TO_K8S.toBoolean()) {
                echo "Desplegando en k8s"
                sh """kubectl -n $NAMESPACE patch configmap apm-config --type merge --patch '{"data":{"$APP_NAME-enable-apm":"$ENABLE_APM"}}' """
                sh 'kubectl apply -f deploy.yaml'
                sleep 10
                sh "kubectl -n ${NAMESPACE} rollout status deployment.apps/${env.APP_NAME}-v1"
            }
        }
        
    }
    

    dir('.') {
        git branch: 'main',
        credentialsId: 'github-ssh',
        url: 'git@github.com:EC-AMX/am-infra-newrelic-agent.git'

        echo "Configurando etiquetas del deployment en newrelic"
        script {
            if(env.TEST.toBoolean()) {
                echo "java -jar newrelic/newrelic.jar deployment --appname=${env.NR_APP_NAME} --environment=${ENVIRONMENT} --user=${COMMITER} --revision=${env.AM_TAG} --changes"
            }
            else {
                sh "java -jar newrelic/newrelic.jar deployment --appname=${env.NR_APP_NAME} --environment=${ENVIRONMENT} --user=${COMMITER} --revision=${env.AM_TAG} --changes"
            }
        }
    }
    */    
}
    
      
    
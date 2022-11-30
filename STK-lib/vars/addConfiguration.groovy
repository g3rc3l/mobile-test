def call() {
  echo 'Add Configuration'
  /*
  //docker and k8s sources
  dir('config') {
    git branch: "${env.CICD_BRANCH_PIPELINE}",
    credentialsId: 'github-ssh',
    url: 'git@github.com:EC-AMX/CI-CD.git'

    script {
      sh  "cp ${env.CONF_PIPELINE_PATH}/template_Dockerfile ${WORKSPACE}/Dockerfile"
      sh "sed -i 's%__IMAGE_BASE__%${env.IMAGE_BASE}%g' ${WORKSPACE}/Dockerfile"
      sh "sed -i 's%__TARGET_PATH__%${env.TARGET_PATH}%g' ${WORKSPACE}/Dockerfile"
      sh "sed -i 's/__SERVICE_NAME__/${env.SERVICE_NAME}/g' ${WORKSPACE}/Dockerfile"
      sh "sed -i 's/__GIT_COMMITER__/${COMMITER}/g' ${WORKSPACE}/Dockerfile"
      sh "sed -i 's/__GIT_COMMIT_MSG__/${COMMIT_MSG}/g' ${WORKSPACE}/Dockerfile"
      sh "sed -i 's/__POM_VERSION__/${AM_TAG}/g' ${WORKSPACE}/Dockerfile"

      sh "cp ${env.CONF_PIPELINE_PATH}/template_deploy.yaml ${WORKSPACE}/deploy.yaml"

      sh '''
        FILE=_pipelines/mount-configs/${APP_NAME}.yaml
          if [ -f "$FILE" ]; then
            sed -i "/__CUSTOM_VOLUMES__/{
            s/__CUSTOM_VOLUMES__//g
            r $FILE
            }" ${WORKSPACE}/deploy.yaml
            sed -i "/__CUSTOM_ENV__/{
            s/__CUSTOM_ENV__//g
            r _pipelines/env-configs/${APP_NAME}.yaml
            }" ${WORKSPACE}/deploy.yaml
          else
            sed -i '/__CUSTOM_VOLUMES__\$/d' ${WORKSPACE}/deploy.yaml
            sed -i '/__CUSTOM_ENV__\$/d' ${WORKSPACE}/deploy.yaml
          fi
      '''

      if(env.ENABLE_LOGGING.toBoolean()) {
        sh """
          sed -i '/__FLUENTD_SECTION__/{
          s/__FLUENTD_SECTION__//g
          r ${env.CONF_PIPELINE_PATH}/fluentd_deploy_section.yaml
          }' ${WORKSPACE}/deploy.yaml
        """
      }
      else {
        sh "sed -i '/__FLUENTD_SECTION__\$/d' ${WORKSPACE}/deploy.yaml"
      }

      sh "sed -i 's/__APP_NAME__/${env.APP_NAME}/g' ${WORKSPACE}/deploy.yaml"
      sh "sed -i 's/__NAMESPACE__/${NAMESPACE}/g' ${WORKSPACE}/deploy.yaml"
      sh "sed -i 's%__IMAGE_NAME__%${IMAGE_NAME}%g' ${WORKSPACE}/deploy.yaml"
      sh "sed -i 's/__ENABLE_APM__/${ENABLE_APM}/g' ${WORKSPACE}/deploy.yaml"
      sh "sed -i 's/__VERSION__/${AM_TAG}/g' ${WORKSPACE}/deploy.yaml"
      sh "sed -i 's/__BUILD__/${env.TRIGGER_BUILD_NUMBER}/g' ${WORKSPACE}/deploy.yaml"
      sh "sed -i 's%__READINESS_PROBE__%${env.READINESS_PROBE_PATH}%g' ${WORKSPACE}/deploy.yaml"

    }
  }

  sh 'rm -rf config'
  echo '[DEBUG] Target sources'
  sh "ls -lah ${env.TARGET_PATH}"
  echo "[DEBUG] Sources"
  sh 'ls -lah'
  */
}
    
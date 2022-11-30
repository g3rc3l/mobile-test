import groovy.json.JsonSlurperClassic
def call(String jsonFile) {
        def data = new JsonSlurperClassic().parseText(jsonFile)
        echo "${data.params.LAX.BRANCH[0]}"
        
        //Parameters as variables
        env.NAME = "${data.params.LAX.NAME[0]}"
        env.BRANCH = "${data.params.LAX.BRANCH[0]}"
        env.APP_NAME = "${data.params.LAX.APP_NAME[0]}"
        env.ENVIRONMENT = "${data.params.LAX.ENVIRONMENT[0]}"
        env.SERVICE_NAME = "${data.params.LAX.SERVICE_NAME[0]}"
        env.BUILD_DEPENDENCY = "${data.params.LAX.BUILD_DEPENDENCY[0]}"
        env.TRIGGER_BUILD_NUMBER = "$BUILD_NUMBER"
        env.ENABLE_LOGGING = "${data.params.LAX.ENABLE_LOGGING[0]}"
        env.ENABLE_APM = "${data.params.LAX.ENABLE_APAM[0]}"
        env.DEPLOY_TO_K8S = "${data.params.LAX.DEPLOY_TO_K8S[0]}"
        env.TEST = "${data.params.LAX.TEST[0]}"
        env.READINESS_PROBE = "${data.params.LAX.READINESS_PROBE[0]}"
        env.CICD_BRANCH_PIPELINE = "${data.params.LAX.CICD_BRANCH_PIPELINE[0]}"
        env.TARGET_PATH = "${data.params.LAX.TARGET_PATH[0]}"
        env.IMAGE_BASE = "${data.params.LAX.IMAGE_BASE[0]}"

        //Constructed variables
        env.IMAGE_NAME = "harbor-aerokub.aero-phoenix.com/am-migration/"+"${env.APP_NAME}"
        env.NAMESPACE = "am-environment-"+"${env.ENVIRONMENT}"
        env.NR_APP_NAME = "${env.ENVIRONMENT}"+"-"+"${env.ENVIRONMENT}"+"-qa-k8s"
        env.FLUENTD_CONF_NAME = "fluentd-"+"${env.APP_NAME}"+"-config"
        env.BRANCH = "${env.BRANCH}".replace("origin/","")
        env.CONF_PIPELINE_PATH = '_pipelines/monoservices'
        env.READINESS_PROBE_PATH = "${env.READINESS_PROBE}" ? "${env.READINESS_PROBE}" : "/${env.SERVICE_NAME}"
        //env.SONAR_LOGIN = sh (script: 'cat /tmp/sonar-login', returnStdout: true).trim()
}
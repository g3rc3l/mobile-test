def call() {
    echo "Publish Docker Images"
    /*
    container(name: 'kaniko', shell: '/busybox/sh') {
            script {
                env.CURRENT_DOCKER_PUBLISH = 0
                echo '[DEBUG] Dockerfile generado'
                sh 'cat Dockerfile'
                echo '[DEBUG] Creando y Publicando imagen docker'
                if (env.TEST.toBoolean()) {
                echo "[TEST] /kaniko/executor --context=`pwd` --skip-tls-verify --skip-tls-verify-pull --insecure --insecure-pull --insecure-registry --verbosity=debug --destination=${env.IMAGE_NAME}:${env.AM_TAG}"
                }
                else {
                retry(3) {
                        timeout(time: 240, unit: 'SECONDS', activity: true) {
                            sh "/kaniko/executor --context=`pwd` --skip-tls-verify --skip-tls-verify-pull --insecure --insecure-pull --insecure-registry --verbosity=debug --destination=${env.IMAGE_NAME}:${env.AM_TAG}"
                        }
                }
                }
                sleep 10
            }
    }
    */
}

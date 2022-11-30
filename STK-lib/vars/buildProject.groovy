def call() {
    echo "Build project"
    /*dir('.') {
        git branch: "${env.BRANCH}",
            credentialsId: 'gitlab-ssh',
            url: "git@gitlab.com:AMITDeveloper/${env.SERVICE_NAME}.git"

        container(name: 'builderjdk8') {
            script {

                sh 'mvn -Dmaven.test.skip=true package'

                sh '''
                    FILE=${TARGET_PATH}/${SERVICE_NAME}.war
                    if [ -f "$FILE" ]; then
                        echo "$FILE exists."
                    else
                        for f in $(find target -type f -name *.war); do
                            mv $f ${TARGET_PATH}/${SERVICE_NAME}.war
                        done
                    fi
                '''

                env.AM_POM_VERSION = sh(script: "echo \$(mvn -q -Dexec.executable=echo -Dexec.args='\${project.version}' --non-recursive exec:exec)", returnStdout: true, ).trim()
                echo "[DEBUG] AM_POM_VERSION: ${env.AM_POM_VERSION}"

                env.AM_TAG = sh(script: "echo ${env.AM_POM_VERSION}.${env.ENVIRONMENT}", returnStdout: true).trim()
                echo "[DEBUG] AM_TAG: ${env.AM_TAG}"

                env.AUTHOR = sh (script: 'git log -1 --pretty=%ae',  returnStdout: true).trim()
                echo "[DEBUG] AUTHOR: ${env.AUTHOR}"

                env.COMMITER = sh (script: 'git log -1 --pretty=%ce ',  returnStdout: true).trim()
                echo "[DEBUG] COMMITER: ${env.COMMITER}"

                env.COMMIT_MSG = sh (script: """
                    git log -1 --pretty="%h %B" > msg.txt
                    sed -i \
                    -e "s/\\"//g; s/'//g; s/#/ /g; s,/, ,g" \
                    -e ":a; N; \$!ba; s/\\r/./g; s/\\n/./g; s/\\.\\{2,\\}/. /g;" \
                    -e "/^\$/d" \
                    msg.txt
                    head -n 1 msg.txt
                """,returnStdout: true).trim()
                echo "[DEBUG] COMMIT_MSG: ${env.COMMIT_MSG}"

            }
        }
    }*/
}
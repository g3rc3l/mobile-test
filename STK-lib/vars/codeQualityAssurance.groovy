def call() {
  echo "Code Quality Assurance"
  /*container(name: 'builderjdk8') {
    sh '''
      mvn -B sonar:sonar \
      -Dsonar.projectKey=rax.latamps.tech:${env.SERVICE_NAME} \
      -Dsonar.host.url=http://sonarqube-sonarqube.sonarqube.svc.cluster.local:9000 \
      -Dsonar.verbose=true \
      -Dsonar.login=${env.SONAR_LOGIN}
    '''
  }*/
}
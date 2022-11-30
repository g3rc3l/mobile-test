@Library ("shared-library-NC-validation") _
import groovy.json.JsonSlurperClassic
pipeline {
    agent any
    stages {
        stage('NC validation') {
            steps {
                script{
                    echo "BRANCH NAME: ${env.BRANCH_NAME}"
                    env.VALIDATION_FLAG = branchValidation(branchName:"${env.BRANCH_NAME}")
                    if ("${env.VALIDATION_FLAG}".toBoolean() == true)
                    {
                        echo "The naming convention is being respected"
                    }
                    else
                    {
                        currentBuild.result = 'ABORTED'
                        error('Stopping early due naming convention is not being respected')
                    }
                }
            }
        }
        stage('Config Vars') {
            /*when {
                branch 'develop'
         	}*/
            steps {
                script{
                    def jsonFile = readFile(file:'STK-lib/resources/params.json')
                    configVars("${jsonFile}")
                }
            }
        }
        stage('Build Project') {
            when {
                branch 'develop'
         	}
            steps {
                buildProject()
            }
        }
        stage('Code Quality Assurance') {
            when {
                branch 'develop'
         	}
            steps {
                codeQualityAssurance()
            }
        }
        stage('Add Configuration') {
            when {
                branch 'develop'
         	}
            steps {
                addConfiguration()
            }
        }
        stage('Image Scanning')
        {
            steps{
                sh 'trivy image ubuntu'
            }
        }
        stage('Publish Docker Image') {
            when {
                branch 'develop'
         	}
            steps {
                publishDockerImage()
            }
        }
        stage('Deploy To K8s') {
            when {
                branch 'develop'
         	}
            options {
                timeout(time: 5, unit: "MINUTES")
            }
            steps {
                deployToK8s()
            }
        }
    }
    /*post {
        always {
            deleteDir()//clean up our workspace
        }
    }*/
}
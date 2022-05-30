#!/usr/bin/env groovy
def call() {
    echo 'Building docker image ...'
    sh 'docker build -t abdelrahmangaber/test-repo:jmvn-2.0 .'
    sh "echo ${PASS} | docker login -u $USER --password-stdin"
    sh 'docker push abdelrahmangaber/test-repo:jmvn-2.0'

}
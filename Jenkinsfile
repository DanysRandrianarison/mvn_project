pipeline {
    
  agent any
  tools {
    maven 'M3'
}
  stages {
    stage('Checkout') {
    steps {
        git branch: 'main',
            url: 'git@github.com:DanysRandrianarison/mvn_project.git'
    }

}
stage('Build the application') {
    steps {
        sh 'mvn clean install'
    }
}

stage('Unit Test Execution') {
steps{
sh 'mvn test'
}
}

stage('Build the docker image') {
steps{
    sh 'docker build -t stephano0017/triang7:1.0.0 .'
    
}
}

  stage('Docker Login') {
            steps {
                withCredentials([usernamePassword(
                    credentialsId: 'dockerhub-cred',
                    usernameVariable: 'DOCKER_USER',
                    passwordVariable: 'DOCKER_PASS'
                )]) {
                    bat 'echo %DOCKER_PASS% | docker login -u %DOCKER_USER% --password-stdin'
                }
            }
        }
        
        stage('Docker Push') {
            steps {
                bat 'docker push stephano0017/triang7:1.0.0'
            }
        }
    
    
    


        


    }

    
}
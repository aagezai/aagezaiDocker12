pipeline {
    agent any

    environment {
        DOCKER_HUB_USERNAME = 'aagezai'
        DOCKER_HUB_PASSWORD = 'Aa@611252'
        DOCKER_IMAGE_NAME = 'aagezai/aagezaidocker'
        DOCKER_IMAGE_TAG = '9.8.9'
    }

    stages {
        stage('Build') {
            steps {
                script {
                    // Add build commands here
                    echo 'Building Hello World project'
                  "cd aagezaidockera12 && docker build -t aagezai/aagezaidocker:9.8.9 ."
                }
            }
        }

        stage('Push to Docker Hub') {
            steps {
                script {
                    // Add deployment commands here
                    echo 'Pushing image to Docker Hub'
                    "docker login -u $DOCKER_HUB_USERNAME -p $DOCKER_HUB_PASSWORD"
                    echo 'Login to Docker Hub successful'
                    "docker push $DOCKER_IMAGE_NAME:$DOCKER_IMAGE_TAG"
                    echo 'Image pushed to Docker Hub'
                }
            }
        }
    }
}


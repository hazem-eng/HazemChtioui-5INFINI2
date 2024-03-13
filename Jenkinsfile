pipeline {
    agent any

    environment {

     DOCKER_IMAGE_NAME = 'hazemchtioui'
      DOCKER_IMAGE_TAG = "v${BUILD_NUMBER}"
//         DOCKER_IMAGE_NAME = "hazemchtioui/alpine"
//         DOCKER_IMAGE_TAG = "1.0.0"

    }

    stages {
        stage('Hello') {
            steps {
                echo 'Hello World'
            }
        }

        stage('GIT') {
            steps {
                echo "Getting Project from Git"
                git branch: 'hazemchtioui',
                url: 'https://github.com/hazem-eng/Hazemchtioui-5INFINI2.git'
            }
        }

        stage('MVN CLEAN') {
            steps {
                sh 'mvn -version'
            }
        }

        stage('DockerHub') {
            steps {
                script {
                    // Étape de connexion à Docker Hub
                    sh "docker login -u hazemchtioui -p 191JMT5435docker"

                    // Étape de re-tagging de l'image
                    sh "docker tag $DOCKER_IMAGE_NAME:$DOCKER_IMAGE_TAG hazemchtioui/alpine:1.0.0"

                    // Étape de poussée de la nouvelle image vers Docker Hub
                    sh "docker push hazemchtioui/alpine:1.0.0"
                }
            }
        }

//          stage('Test Junit/Mockito') {
//                                         steps {
//                                                 sh 'mvn test'
//
//                                               }
//                                         }


//         stage('sonarqube hazem'){
//            steps{
//            sh 'mvn sonar:sonar -Dsonar.login=admin -Dsonar.password=sonar'
//            }
//
//         }
          stage('Building Docker Image') {
                      steps {
                          script {
                              sh 'docker build -t $DOCKER_IMAGE_NAME1:$DOCKER_IMAGE_TAG1 -f Dockerfile ./'
                          }
                                  }
    }
    }
}



// pipeline {
//     agent any
//     environment {
//         DOCKER_IMAGE_NAME = 'dhiabensaada-5infini2-g3-stationski'
//         DOCKER_IMAGE_TAG = "v${BUILD_NUMBER}"
//     }
//     stages {
//         stage('Checkout') {
//             steps {
//                 checkout scm
//             }
//         }
//
//         stage('Build with Maven') {
//             steps {
//                 sh 'mvn clean package -DskipTests '
//             }
//         }
//      stage('Test Junit/Mockito') {
//                                steps {
//                                        sh 'mvn test'
//                                        sh 'mvn jacoco:report'
//                                      }
//                                  }
//
//         stage('dhia SonarQube ') {
//              steps {
//                     sh 'mvn sonar:sonar -Dsonar.login=admin -Dsonar.password=sonar'
//                    }
//              }
//
//         stage('Deploy to Nexus') {
//              steps {
//                     sh 'mvn deploy -DskipTests=true'
//                          }
//                          }
//
//         stage('building docker image')
//         {
//              steps {
//                 sh ' docker build -t $DOCKER_IMAGE_NAME:$DOCKER_IMAGE_TAG -f Dockerfile ./'
//                       }
//         }
//
//            stage('dockerhub') {
//                                   steps {
//
//                              sh "docker login -u bensaadadhia -p 123456789"
//                              sh "docker tag $DOCKER_IMAGE_NAME:$DOCKER_IMAGE_TAG bensaadadhia/dhiabensaada-5infini2-g3-stationski:$DOCKER_IMAGE_TAG"
//                              sh "docker push  bensaadadhia/dhiabensaada-5infini2-g3-stationski:$DOCKER_IMAGE_TAG"
//                                   }
//             }
//              stage('Run Spring && MySQL Containers') {
//                                  steps {
//
//                                    sh 'docker compose up -d'
//
//                                    echo 'Run Spring && MySQL Containers'
//                                         }
//                                     }
//              }
//
//     post {
//         success {
//             mail to: "bensaadadhia9@gmail.com",
//             subject: "Pipeline Backend Success",
//             body: " project StationSki  Backend : Success on job ${env.JOB_NAME}, Build Num: ${env.BUILD_NUMBER}"
//         }
//         failure {
//             mail to: "bensaadadhia9@gmail.com",
//              subject: "Pipeline backend Failure",
//              body: "project StationSki  Backend : Failure on job ${env.JOB_NAME}, Build Num: ${env.BUILD_NUMBER}} "
//         }
//     }
//     }

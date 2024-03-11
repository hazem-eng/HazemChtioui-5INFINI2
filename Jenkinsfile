pipeline {
    agent any

    stages {
        stage('Hello') {
            steps {
                echo 'Hello World'
            }
        }
         stage('GIT'){
            steps {
                echo "Getting Project from Git"
                git branch: 'hazemchtioui',
                url: 'https://github.com/hazem-eng/Hazemchtioui-5INFINI2.git',

            }
        }

        stage('MVN CLEAN'){
            steps {
                sh 'mvn -version'
            }
        }
    }
}

pipeline {
    agent any

    parameters{
        string(name: 'environment',description: 'Enter your first name')
        string(name: 'appname',description: 'Enter your second name')
    }


    stages {
        stage("echo"){
            steps {
                script {
                    echo "Going to run a shell script:"
                    sh """
                    chmod +x assin1.sh
                    ./assin1.sh "${params.environment}" "${params.appname}" """
                }

            }
        }
    }
}

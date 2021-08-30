
pipeline {
    agent any

    parameters{
        string(name: 'environment',description: 'Select your Environment')
        string(name: 'appname',description: 'Select your Application Name')
    }


    stages {
        stage("echo"){
            steps {
                script {
                    echo "Going to run a shell script:"
                    sh """
                    chmod +x Assin1.Sh
                    ./Assin1.Sh "${params.environment}" "${params.appname}" """
                }

            }
        }
    }
}

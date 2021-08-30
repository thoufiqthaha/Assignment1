
pipeline {
    agent any

    parameters{
        string(name: 'FirstName',description: 'Select your Environment')
        string(name: 'SecondName',description: 'Select your Application Name')
    }


    stages {
        stage("echo"){
            steps {
                script {
                    echo "Going to run a shell script:"
                    sh """
                    chmod +x Assin1.sh
                    pwd
                    ./Assin1.sh "${params.FirstName}" "${params.SecondName}" """
                }

            }
        }
    }
}

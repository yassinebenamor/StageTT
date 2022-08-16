pipeline {
    agent any

    stages {

        stage ('Compile Stage') {

            steps {
                withMaven(maven : 'maven-latest') {
                    echo "Maven compile";
                    bat 'mvn compile';
                }
            }
        }
        stage ('Deployment Stage') {
            steps {
                withMaven(maven : 'maven-latest') {
                    echo "Maven Deploy";
                    bat 'mvn Deploy';
                }
            }
        }
    }
}
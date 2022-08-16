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
         stage ('install Stage') {
             steps {
                  withMaven(maven : 'maven-latest') {
                            echo "Maven install";
                            bat 'mvn install';
                  }
              }
         }
        stage ('Deployment Stage') {
            steps {
                withMaven(maven : 'maven-latest') {
                    echo "Maven deploy";
                    bat 'mvn deploy';
                }
            }
        }
    }
}
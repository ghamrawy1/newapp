pipeline {
 def NEW_VERSION = '1.3.0' 
  agent any
 
stages {

  stage ("bulid") {

steps {
       echo 'build the application'
       echo "building version ${NEW_VERSION}"
       }

     }
     
  stage ("test") {

steps {
       echo 'test the application'
      
       }

     }
     
  stage ("deploy") {

steps{
       echo 'deploying the application'
       }

     }

  }
}

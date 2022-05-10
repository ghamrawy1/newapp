pipeline {

  agent any
 parameters{
  choice(name: 'version', choices[1.1.0,1.2.0,1.3.0], description: '')
  booleanparam(name: 'executetest', defalutvalue: true, description: '')
 }
stages {

  stage ("bulid") {

steps {
       echo 'build the application'
     
       }

     }
     
  stage ("test") {
   when{
    experssion{
    params.executetest
    }
   }
steps {
       echo 'test the application'
      
       }

     }
     
  stage ("deploy") {

steps{
       echo 'deploying the application'   
       echo "deploying version ${params.version}"
       }

     }

  }
}

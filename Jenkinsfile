pipeline {

  agent any
 parameters{
  choice(name: 'version', choices:['1.1.0','1.2.0','1.3.0'], description: '')
  booleanParam(name: 'executetest', defaultValue: true, description: '')
 }
stages {

  stage ("bulid") {

steps {
       echo 'build the application'
     
       }

     }
     
  stage ("test") {
   when {
    expression {
    params.executetest
    }
   }
steps {
       echo 'test the application'
      
       }

     }
     
  stage ("deploy") {
    input{
    message'select type of enviroment'
      ok'Done'
      parameters{
        choice(name: 'env', choices['dev','prod','test'], description: '')
      }
    }

steps{
       echo 'deploying the application'
  echo "the environment is ${env}"
      
       }

     }

  }
}

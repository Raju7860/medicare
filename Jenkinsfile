pipeline{
  agent any 
  stages{
    stage('Source'){
      steps{
         git branch:'master',url:'https://github.com/Raju7860/medicare.git'
      } 
    }

    stage('Clean'){
      steps{
        bat "mvn clean "
    }
      } 
    
      stage('Compile'){
      steps{
        bat "mvn compile"
    }
      } 
    
     stage('Test'){
      steps{
        bat "mvn test"
    }
      } 
    
  }
}

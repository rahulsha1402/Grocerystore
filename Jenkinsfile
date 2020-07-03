node{
    stage('SCM Checkout'){
      tool name: 'maven-3', type: 'maven'
      git 'https://github.com/rahulsha1402/Grocerystore'
     }
    stage('Compile-packagee){
      sh 'mvn package'
     }
}

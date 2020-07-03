node{
    stage('SCM Checkout'){
      git 'https://github.com/rahulsha1402/Grocerystore'
     }
    stage('Compile-packagee'){
      def mvnHome = tool name: '', type: 'maven'
      sh "${mvnHome}/bin/mvn package"
     }
}

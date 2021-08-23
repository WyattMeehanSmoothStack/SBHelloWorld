node{
    stage("checkout"){
        git 'https://github.com/WyattMeehanSmoothStack/SBHelloWorld.git'
    }
    stage("build"){
        sh 'mvn clean package'
    }
    stage("archive"){
        archiveArtifacts artifacts: 'target/*.jar', followSymlinks: false
    }
    stage("deploy"){
        sh 'nohup java -jar target/helloworldspring-0.0.1-SNAPSHOT.jar &'
    }
}
node{
    stage("checkout"){
        git 'https://github.com/WyattMeehanSmoothStack/SBHelloWorld.git'
    }
    stage("build"){
            bat 'mvn clean package'
    }
    stage("archive"){
        archiveArtifacts artifacts: 'target/*.jar', followSymlinks: false
    }
}
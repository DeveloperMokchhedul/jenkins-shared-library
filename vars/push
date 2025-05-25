def cal(String username, String imagename, String tagname){
        echo 'Pushing the image to Docker Hub'
        withCredentials([usernamePassword(credentialsId: 'dockerhub-cred', passwordVariable: 'dockerHubPassword', usernameVariable: 'dockerHubUser')]) {
        sh 'docker login -u $dockerHubUser -p $dockerHubPassword'
        sh 'docker tag nodeapp:latest mokchhedul/nodeapp:latest'
        sh 'docker push "${username}"/"${imagename}":"${tagname}"'
}

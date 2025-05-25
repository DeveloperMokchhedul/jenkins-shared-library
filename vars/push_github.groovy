def call(String username, String imagename, String tagname) {
    echo "🔄 Pushing Docker image: ${username}/${imagename}:${tagname}"

    withCredentials([usernamePassword(credentialsId: 'dockerhub-cred', passwordVariable: 'dockerHubPassword', usernameVariable: 'dockerHubUser')]) {
        sh """
            echo "\$dockerHubPassword" | docker login -u \$dockerHubUser --password-stdin
            docker tag nodeapp:latest \$dockerHubUser/${imagename}:${tagname}
            docker push \$dockerHubUser/${imagename}:${tagname}
        """
    }
}

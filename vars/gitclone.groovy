def call(string url, string branch){
  echo "hey this is cloning git code"
  git url: "https://github.com/DeveloperMokchhedul/auto_deployment_with_aws.git", branch: "main"
  echo "complate cloning code"
}

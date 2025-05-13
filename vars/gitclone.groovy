def call(string url, string branch){
  echo "hey this is cloning git code"
  git url: "${url}", branch: "${branch}"
  echo "complate cloning code"
}

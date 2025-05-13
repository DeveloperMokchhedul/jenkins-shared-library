def call(String url, String branch) {
    echo "Hey, this is cloning git code..."
    git url: "${url}", branch: "${branch}"
    echo "Completed cloning code."
}

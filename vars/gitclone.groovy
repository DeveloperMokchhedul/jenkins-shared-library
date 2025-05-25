def call(String branch, String url) {
        echo 'This is git cloning stage'
        git branch: "${branch}", url: "${url}"
        echo 'GitHub code cloned successfully'
}

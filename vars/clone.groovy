def call(String url, String branch) {
    echo "Cloning the code from ${url} (branch: ${branch})"
    git url: "${GitUrl}", branch: "${GitBranch}"
    echo "Code cloning successful"
}


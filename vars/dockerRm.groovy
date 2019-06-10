def call(Map args) {
    sh(script:"docker rm -f ${args.containerName}")
}

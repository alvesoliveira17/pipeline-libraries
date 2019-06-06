def call(Map args) {
    sh(script:"docker run -d -p ${args.hostPort}:${args.containerPort} ${args.image}")
}

def call(Map args) {
    sh(script:"docker run -d --name ${args.containerName} -p ${args.hostPort}:${args.containerPort} ${args.image}")
}

def call(Map config) {

    echo "Deploying Application"

    echo "Environment: ${config.env}"
    echo "Namespace: ${config.namespace}"
    echo "Image: ${config.image}"

    sh """
       kubectl set image deployment/${config.app} \
       ${config.app}=${config.image} \
       -n ${config.namespace}
    """

}

/**
 * Deploy the built Docker images
 */
// Registering decommissioning poststep
MPLPostStep('always') {
  echo "Sample Post Step"
  sh "docker stop \$(docker ps -a -q)"
  sh "docker rm \$(docker ps -a -q)"
  sh "docker run --name mynginx1 -p 80:80 -d ${params.docker_tag}"
}

echo 'Executing Docker Deploy process'

echo"test deploy"
sh "docker push ${params.docker_tag}"


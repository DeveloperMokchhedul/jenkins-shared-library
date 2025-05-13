def call(String containername, String imagename, String imagetag){
  echo "deploy start"
  sh """
  docker rm -f ${containername} || true
  docker run -d --name ${containername} -p 80:5000 ${imagename}:${imagetag}
  """
  echo "deployment complete"
}


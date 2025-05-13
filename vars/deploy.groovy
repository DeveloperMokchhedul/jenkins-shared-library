def call(String containername, int port, String imagename, String imagetag){
  echo "deploy start"
  sh """
  docker rm -f ${containername} || true
  docker run -d --name ${containername} -p ${port}:3000 ${imagename}:${imagetag}
  """
  echo "deployment complate"
}

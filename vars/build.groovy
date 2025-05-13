def call(String imagename, String imagetag){
  echo "docker build"
  sh "docker build -t ${imagename}:${imagetag}"
  echo "docker build complate"

  

  
}

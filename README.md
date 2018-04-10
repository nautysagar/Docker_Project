# Docker_Project

To Build....
docker build -f <Dockerfile_name> -t <image_name_In_docker_repository> .

 Example: docker build -f Dockerfile -t person-0.0.1-SNAPSHOT.jar .
 
 To Run..
  docker run -p 7890:7890 person-image

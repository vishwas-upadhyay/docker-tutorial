
### **Docker build (consider location where Dockerfile is present)**

docker build -t docker-springboot:1.0 .

### **Docker Run**

docker run -p <machine port>:<docker image port> <image name:tag>
  
docker run -p 8085:8080 docker-springboot:1.0

References : https://www.youtube.com/watch?v=FlSup_eelYE&list=PLaiKlbxGCkKEhOMaO0-BonBs6JoTlmg_P&index=5





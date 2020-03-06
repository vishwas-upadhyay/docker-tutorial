This project includes the use of spring boot + thymeleaf template engine + docker. 
We will also explain how to push this docker image to docker hub and spin same image 
in AWS EC2 instance. 

#Run steps
1. you can start this app as normal spring boot application by checking codebase and run as 
spring boot application. Try to hit http://localhost:8080/vishudolu to check home page. 

2. To run as docker image in local : 

 2.1 take the code base in local machine where you have docker installed.
 
 2.2 Build docker image via docker build -t vishudolu:1.0 . 
 
 2.3 check image build successfully via docker images 
 
 2.4 create container out of image via docker run -p 8080:8080 --name vishudolu vishudolu:1.0
 
 2.5 check container status via docker ps -a
 
 2.6 if container vishudolu is up then you should be able to get response via  http://localhost:8080/vishudolu
 
 
 3. To pull image from docker hub and run in local 
 
 3.1 login into docker hub via terminal by typing docker login 
 
 3.2 pull image from docker hub : docker pull vishwas13485/vishudolu
 
 3.3 follow steps from 2.4
 
#  How to spin image on EC2 instance 

1. Create the aws free tier account and follow below link to connect with your terminal https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/AccessingInstancesLinux.html
 
2. once connected update yum package manager via sudo yum update 

3. install docker via sudo yum install docker 
 
4. In order to user docker command without root privileges (sudo), we need to add ec2-user to the docker group:  sudo usermod -aG docker ec2-user

5. follow steps from 3.1 

Reference : https://hackernoon.com/running-docker-on-aws-ec2-83a14b780c56 
 
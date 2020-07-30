# spring-okteto-k8s
Kubernetes for Developers

Okteto(https://okteto.com/) is a great tool and you don't need docker or k8s installed in your machine.
You don't even need now them. \
To start, you just need to install the Okteto CLI to use your preferred IDE and focus just on the code. \
Below are the steps to start with it.

**First step** \
Install Okteto CLI \
Mac: `brew install okteto` \
Linux: `curl https://get.okteto.com -sSfL | sh` \
Windows: `scoop install okteto`

**Second step** \
To Log into it: `okteto login` \
_*Make sure you have an account there_

**Configuration** \
You just need an `okteto.yml` file with all the required configuration to the root directory of your application and the Okteto will take care of the rest. \
To run this application we need and MongoDB running, and you can use Okteto as well. Below are some pictures on how to do this.

**Ready?** \
Just exec `okteto up` \
That's it, now you can open you browser http://localhost:8080, and debugging as well.

# running...
<p align="center">  
  <img src="https://github.com/java-tips/spring-okteto-k8s/blob/development/assets/deploy-mongo.png?raw=true" width="800">
  <img src="https://github.com/java-tips/spring-okteto-k8s/blob/development/assets/mongo-logs.png?raw=true" width="800">  
  <img src="https://github.com/java-tips/spring-okteto-k8s/blob/development/assets/java-app-okteto-logs.png?raw=true" width="800">
  <img src="https://github.com/java-tips/spring-okteto-k8s/blob/development/assets/idea-logs.png?raw=true" width="800">
  
  <img src="https://github.com/java-tips/spring-okteto-k8s/blob/development/assets/request1.png?raw=true" width="800">
  <img src="https://github.com/java-tips/spring-okteto-k8s/blob/development/assets/request2.png?raw=true" width="800">
  <img src="https://github.com/java-tips/spring-okteto-k8s/blob/development/assets/request3.png?raw=true" width="800">  

</p>

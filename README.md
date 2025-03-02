## Steps to set up Spring Boot application to use Spring AI with ollama

### Download and install ollama from !https://ollama.com/download

### Download and run the model
```
# download model
> ollama pull deepseek-r1:1.5b
list model 
> ollama list
#run model 
> ollama run deepseek-r1:1.5b
# ch eck running model 
> ollama ps
# Stop running moeld 
> ollama stopm deepseek-r1:1.5b
```


### Build this application using Maven
> mvn clean install

### Run this application
> java -jar .\target\spring-boot-ollama-ai-model-0.0.1-SNAPSHOT.jar


# OSGiAOT
POC for OSGi Connect Native Builds.

&nbsp;
&nbsp;

### Content  
1. `./greeting`  
   A simple OSGi application using Declarative Services.  


### Prerequisites  
1. [Install](https://www.graalvm.org/getting-started/) [GraalVM CE Java 11](https://github.com/graalvm/graalvm-ce-builds/releases) and Native Image `gu install native-image`
2. Clone [Atomos](https://github.com/apache/felix-atomos) to local directory and install  
   `cd [local directory]`  
   `./mvnw clean install -Psubstrate`  


### Build  
1. Clone [OSGiAOT](https://github.com/joerg-wille/OSGiAOT) to local directory
2. `cd [local directory]`
3. Build `./mvnw clean package`


### Run Java App
1. Run greeting uber-jar  
   `java -jar ./greeting/greeting.launch/target/run.jar`
2. Test by entering `hello [name]` and `hallo [name]`

### Run Native App
1. Run greeting uber-jar  
   `./greeting/greeting.native/target/native_image_build/[random]/bin/greeting-native`
2. Test by entering `hello [name]` and `hallo [name]`
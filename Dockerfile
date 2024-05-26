FROM openjdk:17-oracle

WORKDIR /app
COPY .mvn/ .mvn
COPY mvnw pom.xml ./

RUN chmod +x ./mvnw

#Convert
RUN apt-get update && apt-get install -y dos2unix
RUN dos2unix ./mvnw

RUN ./mvnw dependency:resolve

COPY src ./src

CMD ["./mvnw","spring-boot:run"]
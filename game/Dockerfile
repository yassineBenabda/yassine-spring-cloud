#Start with a base image containing Java runtime
FROM openjdk:21-ea

#Information around who maintains the image
LABEL "org.opencontainers.image.authors"="yassine.com"

# Add the application's jar to the image
COPY target/game-0.0.1-SNAPSHOT.jar game-0.0.1-SNAPSHOT.jar


# execute the application
ENTRYPOINT ["java", "-jar", "game-0.0.1-SNAPSHOT.jar"]
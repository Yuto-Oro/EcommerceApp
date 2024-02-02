# Step 1: Use an official Java runtime as a parent image
FROM openjdk:17-jdk-alpine

# Step 2: Set the working directory inside the container
WORKDIR /app

# Step 3: Copy the JAR file from your target directory to the container
COPY build/libs/*.jar app.jar

# Step 4: Run the JAR file
ENTRYPOINT ["java","-jar","/app/app.jar"]

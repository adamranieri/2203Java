# script for creating an image

# always starts with FROM base-image. used to specify the environment we want the final to container to have
# Java will be available in the container that is created
FROM openjdk

# copy all files in the current folder. Then put them in a hypothetical virtual environment under the path /workspace
COPY . /workspace

# what port does the application run on
EXPOSE 5000

# Specify the directory in the environment you want your commands to work in
WORKDIR /workspace

# The command to run when you create a container from this image
ENTRYPOINT [ "java", "-jar", "HelloWebApp-1.0-SNAPSHOT.jar" ]
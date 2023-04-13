# Use the Alpine Linux 3.10.2 base image
FROM alpine:3.10.2

# Update package repositories and install necessary packages
RUN apk update && \
    apk upgrade && \
    apk add --no-cache bash curl openssl=1.1.1c-r0

# Set the working directory
WORKDIR /app

# Copy your application into the container
COPY . .

# Set the command to run when the container starts
CMD ["bash"]

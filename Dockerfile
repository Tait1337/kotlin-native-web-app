############################################################################
# OpenJDK binaries built by Eclipse Temurin.
#
# build from project root dir with: docker build -t kotlin-native-web-app:1.0.0-SNAPSHOT .
# run with: docker run -p 8080:8080 -d kotlin-native-web-app:1.0.0-SNAPSHOT
############################################################################
FROM eclipse-temurin:17-jdk as builder
WORKDIR /builddir
COPY . .
RUN ./gradlew build

FROM ubuntu:latest
LABEL maintainer="tait1337"

# App
WORKDIR /app
COPY --from=builder /builddir/build/bin/native/releaseExecutable/kotlin-native-web-app.kexe /app/app.kexe
EXPOSE $PORT
ENTRYPOINT [ "./app.kexe" ]
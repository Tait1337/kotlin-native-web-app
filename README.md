# Ktor Native Server
[![build status](https://github.com/Tait1337/kotlin-native-web-app/workflows/build/badge.svg)](https://github.com/Tait1337/kotlin-native-web-app/actions)
[![quality gate status](https://sonarcloud.io/api/project_badges/measure?project=Tait1337_kotlin-native-web-app&metric=alert_status)](https://sonarcloud.io/dashboard?id=Tait1337_kotlin-native-web-app)
[![license](https://img.shields.io/github/license/Tait1337/kotlin-native-web-app)](LICENSE)

Web Application using kotlin native Ktor.

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See deployment for notes on how to deploy the project on a live system.

### Prerequisites

Install Kotlin 1.6 or higher.

```
https://kotlinlang.org
```

### Installing

Clone the Repository.
```
git clone https://github.com/tait1337/kotlin-native-web-app.git
```

Build the Web Application.
```
./gradlew build
```
⚠️No support for Windows up to now. See https://ktor.io/docs/native-server.html#targets

Run the Web Application.
```
./kotlin-native-web-app.kexe
```

Navigate to http://localhost:8080/.

### Configuration

No Configuration exists.

## Running the tests

No Tests exist.

## Deployment

The most basic option to run the Application is by building the Dockerimage.

```
docker build -t kotlin-native-web-app:1.0.0-SNAPSHOT .
docker run -p 8080:8080 -d kotlin-native-web-app:1.0.0-SNAPSHOT
```

## Contributing

I encourage all the developers out there to contribute to the repository and help me to update or expand it.

To contribute just create an issue together with the pull request that contains your features or fixes.

## Versioning

We use [GitHub](https://github.com/) for versioning. For the versions available, see the [tags on this repository](https://github.com/tait1337/kotlin-native-web-app/tags).

## Authors

* **Oliver Tribess** - *Initial work* - [tait1337](https://github.com/tait1337)

## License

This project is licensed under the Apache 2 - see the [LICENSE](LICENSE) file for details

## Acknowledgments

* [Jetbrains](https://www.jetbrains.com/) for providing the great Kotlin language
* [Ktor](https://ktor.io/) Team for providing an asynchronous framework for creating microservices, web applications, and more
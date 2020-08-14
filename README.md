# seabatlle
Sea battle game
./gradlew build && java -agentlib:jdwp=transport=dt_socket,address=8000,server=y,suspend=n -Dfile.encoding=UTF8 -jar webapp-runner-9.0.27.0.jar --port 8080 build/libs/*.war
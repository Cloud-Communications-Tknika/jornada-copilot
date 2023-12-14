@echo off
SETLOCAL
SET DIRNAME=%~dp0%
IF "%DIRNAME%" == "" SET DIRNAME=.
SET APP_BASE_NAME=%~n0%
SET APP_HOME=%DIRNAME%
SET MAVEN_JAR=%APP_HOME%\.mvn\wrapper\maven-wrapper.jar
IF NOT EXIST "%MAVEN_JAR%" (
  echo "Couldn't find %MAVEN_JAR%, downloading it ..."
  powershell -Command "& {[Net.ServicePointManager]::SecurityProtocol = [Net.SecurityProtocolType]::Tls12; Invoke-WebRequest http://central.maven.org/maven2/io/takari/maven-wrapper/0.5.6/maven-wrapper-0.5.6.jar -OutFile %MAVEN_JAR%}"
)
FOR /F "tokens=1,2 delims==" %%A IN ("%APP_HOME%\.mvn\wrapper\maven-wrapper.properties") DO (
  IF "%%A"=="wrapperUrl" SET DOWNLOAD_URL=%%B
)
powershell -Command "& {[Net.ServicePointManager]::SecurityProtocol = [Net.SecurityProtocolType]::Tls12; Invoke-WebRequest %DOWNLOAD_URL% -OutFile %MAVEN_JAR%}"
java -jar "%MAVEN_JAR%" %*
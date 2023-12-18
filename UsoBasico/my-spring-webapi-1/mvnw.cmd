@echo off
SETLOCAL
SET DIRNAME=%~dp0%
SET APP_BASE_NAME=%~n0%
SET APP_HOME=%DIRNAME%
PUSHD "%APP_HOME%"
SET MAVEN_PROJECTBASEDIR=%MAVEN_BASEDIR%
IF NOT DEFINED MAVEN_PROJECTBASEDIR SET MAVEN_PROJECTBASEDIR=%APP_HOME%
CALL "%MAVEN_PROJECTBASEDIR%\.mvn\jvm.config"
SET MAVEN_JAVA_EXE="%JAVA_HOME%\bin\java"
SET WRAPPER_JAR="%APP_HOME%\.mvn\wrapper\maven-wrapper.jar"
%MAVEN_JAVA_EXE% %JVM_CONFIG_MAVEN_PROFILES_ARGS% -classpath %WRAPPER_JAR% org.apache.maven.wrapper.MavenWrapperMain %MAVEN_CONFIG% %*
POPD
ENDLOCAL
@echo off
SETLOCAL
SET DIRNAME=%~dp0%
SET APP_BASE_NAME=%~n0%
SET APP_HOME=%DIRNAME%
PUSHD "%APP_HOME%"
REM Execute the correct Maven command
CALL "%JAVACMD%" %MAVEN_OPTS% -classpath "%MAVEN_PROJECTBASEDIR%\.mvn\wrapper\maven-wrapper.jar" "-Dmaven.home=%M2_HOME%" "-Dmaven.multiModuleProjectDirectory=%MAVEN_PROJECTBASEDIR%" "%WRAPPER_LAUNCHER%" %MAVEN_CONFIG% %*
POPD
ENDLOCAL
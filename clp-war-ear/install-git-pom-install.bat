@echo off
echo %M2_HOME%\bin\mvn -f pom-install.xml clean install -Dmaven.test.skip=true -Drun.env=%package_env% -DdlsVersion=%dlsVersion% -DbuildTime=%buildTime% -DCOOKIE-NAME=%COOKIE-NAME% -DfinalName=%JOB_NAME%-%dlsVersion%.stable-%buildTime%
%M2_HOME%\bin\mvn -f pom-install.xml clean install -Dmaven.test.skip=true -Drun.env=%package_env% -DclpVersion=%clpVersion% -DbuildTime=%buildTime% -DCOOKIE-NAME=%COOKIE-NAME% -DfinalName=%JOB_NAME%-%clpVersion%.stable-%buildTime%
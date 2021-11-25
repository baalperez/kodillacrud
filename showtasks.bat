call runcrud.bat
if "%ERRORLEVEL%" == "0" goto open
echo.

:open
start firefox http://localhost:8080/crud/v1/task/getTasks

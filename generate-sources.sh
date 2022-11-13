rm -r ./target/generated-sources/ws
mkdir -p ./target/generated-sources/ws
wsimport -d ./target/generated-sources/ws \
-p ru.ais.courses.integration.ws.client \
-verbose \
-extension -Xnocompile \
"http://localhost:1212/hello?wsdl"

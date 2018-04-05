gradle clean bootRepackage
rm -rf io-algorithm-service
rm -rf io-algorithm-service.tar
mkdir -p io-algorithm-service/lib
cp build/libs/* io-algorithm-service/lib/
mkdir -p io-algorithm-service/lib
cp build/libs/* io-algorithm-service/lib/
mkdir -p io-algorithm-service/etc
cp build/resources/main/* io-algorithm-service/etc/
cp run.sh io-algorithm-service/
tar -cvf io-algorithm-service.tar io-algorithm-service
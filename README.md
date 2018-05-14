# First deploy the services using the script
```
./deploy.sh
```

# Steps required after deploying the services

```
we shell -s liferay -p liberty
cd /wedeploy-container/data
cp -r * /opt/liferay/data/document_library
exit
we restart -s liferay -p liberty
```
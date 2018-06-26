restart:
	mvn clean package
	docker-compose restart app
	sleep 5
	xdg-open http://0.0.0.0:8180/clientsvc-1.0-SNAPSHOT/ &
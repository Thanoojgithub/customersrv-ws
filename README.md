# customersrv-ws
multi module project (using Spring, cxf RESTFul, Spring Data, MongoDB)


Added 

- cutomersrv-beans (beans - where we define pojos)
- cutomersrv-client (client - any outer application can access 'cutomersrv' by added client as dependency, in this case customer-ws should be up and running)
- cutomersrv-dao (dao - calling MongoOperations, mongoDB using spring-data-mongodb)
- cutomersrv-blogic (service - having user defind logic, calling DAO methods)
- cutomersrv-ws (ws - war file, which has RESTFul service resouce paths and congiguring cxf, mongoDB using spring-data-mongodb)



Prerequisites

- JDK
- maven
- MongoDB installer
  - just using installer, we can have MOngoDB server as a system service (start/stop)
  - we do use default properties to access MongoDB

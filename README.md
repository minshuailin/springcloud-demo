springcloud学习--demo

cloud-api-commons : 公共类

cloud-eureka-server7001 : 注册中心 eureka

cloud-provider8001 : 服务生产者
cloud-provider8002 : 服务生产者

cloud-consumer9000 : 服务消费者
cloud-consumer-order80 : 服务消费者

cloud-consumer-histrix-dashboard : 熔断器可视化

cloud-config-server/client : 配置中心，服务的配置放到仓库，每一个服务调用这个配置的时候，要么直接从仓库中调用，
                             要么将这个配置中心的服务，注册到注册中心，供其他服务调用这个配置。
                             但是这种配置，每一次更新的时候，客户端都得重新refresh。

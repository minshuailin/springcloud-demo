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
                             
cloud-gateway-zuul : 网关功能，类似于前端和后端之间的一扇门，服务请求代理，对于每一个服务的调用，每一个请求，
                     都通过在zuul中配置的path，指定重定向到相应的服务的url，管理每一个服务的请求
                     当服务增加的时候，就得在zuul中配置一条相关的路由配置，为了简化这个配置过程，我们也可以将
                     zuul这个服务注册到eureka注册中心，去发现其他服务
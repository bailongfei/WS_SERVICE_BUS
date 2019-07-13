#项目结构

        ├── pom.xml  
        └── src  
            └── main  
                ├── java  
                │   └── com
                │       └── xdh
                │           ├── common
                │           ├── dao     各个接口数据库处理
                │           ├── info    入参和结果包装类
                │           │   ├── request 入参的实体类
                │           │   └── response 出参的实体类
                │           ├── quartz  定时任务
                │           ├── utils   工具类
                │           │   ├── commons 数据库连接池
                │           │   └── strings string的自定义操作类
                │           ├── Executable  所有dao层必须实现的接口
                │           ├── ServiceRESTFul 暴露的接口
                │           ├── ServiceRESTFulImpl 暴露接口的实现
                │           └── ... 还没写  
                ├── resources
                │   ├── config 配置文件
                │   │   ├── database 数据库
                │   │   ├── message  处理结果消息
                │   │   └── methods  处理方法
                │   └──services spring配置
                └── webapp
                    └── WEB-INF
                        └── web.xml 

#项目说明
。。。不知道说啥

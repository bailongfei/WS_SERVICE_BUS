# 2019年07月14日13:03:29
       1.更新数据库连接池，使用静态内部类保持数据库连接池的单例性默认加载
           resources/config/database/jdbc 的属性详情见PoolConfig.java,
           ConnectionPool.InnerClass.java。
       2.修复接口return 空字符串，删除了ResponseResult.java,更换为Result.java
           和ResultDataList.java。
       3.LoginDao 执行数据库操作,自己的数据库用自己的存储过程。
       
       
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




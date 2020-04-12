package FactoryModel;

//编写如下客户端测试代码：
class Client {
    public static void main(String args[]) {
        LoggerFactory factory1,factory2;
        Logger logger1,logger2;
        factory1 = new FileLoggerFactory();
        //可引入配置文件实现
        logger1 = factory1.createLogger();
        logger1.writeLog();
        factory2 = new DatabaseLoggerFactory();
        logger2 = factory2.createLogger();
        logger2.writeLog();;
    }
    }



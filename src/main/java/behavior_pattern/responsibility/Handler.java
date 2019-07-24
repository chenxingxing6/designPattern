package behavior_pattern.responsibility;

/**
 * User: lanxinghua
 * Date: 2019/7/24 14:48
 * Desc:
 */
public abstract class Handler {

    protected int level;
    protected Handler nextHandler;


    public void info(String msg){
        log(LevelEnum.INFO.getLevel(), msg);
    }

    public void debug(String msg){
        log(LevelEnum.DEBUG.getLevel(), msg);
    }

    public void warn(String msg){
        log(LevelEnum.WARN.getLevel(), msg);
    }

    public void error(String msg){
        log(LevelEnum.ERROR.getLevel(), msg);
    }

    /* 处理方法*/
    private void log(int lv, String message){
        this.level = lv;
        log(message);
        if (nextHandler != null){
            nextHandler.log(lv, message);
        }
    }

    /* 获取日志级别 */
    protected LevelEnum getLevel(){
       return LevelEnum.getInstanceByLevel(level);
    }

    /* 指定下一个处理者*/
    public void setNextHandler(Handler handler){
        this.nextHandler = handler;
    }

    abstract protected void log(String msg);
}

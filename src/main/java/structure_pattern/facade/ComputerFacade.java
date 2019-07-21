package structure_pattern.facade;

import java.util.concurrent.TimeUnit;

/**
 * User: lanxinghua
 * Date: 2019/7/21 22:43
 * Desc: 电脑
 */
public class ComputerFacade {
    private CPU cpu;
    private Memory memory;
    private Disk disk;

    public ComputerFacade(CPU cpu, Memory memory, Disk disk){
        this.cpu = cpu;
        this.memory = memory;
        this.disk = disk;
    }

    public void startup(){
        System.out.println("电脑启动");
        cpu.startup();
        memory.startup();
        disk.startup();
        System.out.println("电脑启动成功");
    }

    public void shutdown(){
        System.out.println("电脑关闭");
        cpu.shutdown();
        memory.shutdown();
        disk.shutdown();
        System.out.println("电脑关闭成功");
    }

    public static void main(String[] args) {
        ComputerFacade facade = new ComputerFacade(new CPU(), new Memory(), new Disk());
        facade.startup();
        try {
            TimeUnit.SECONDS.sleep(2);
        }catch (Exception e){
            e.printStackTrace();
        }
        facade.shutdown();
    }
}

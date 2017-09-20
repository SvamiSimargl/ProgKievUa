package lesson3.blinov_ch4_vA_7;

/*Создать  объект  класса Компьютер,  используя  классы  Винчестер,
Дисковод, Оперативная память, Процессор. Методы: включить, выключить,
проверить на вирусы, вывести на консоль размер винчестера.*/


public class Computer {
    private String proc;
    private String hd;
    private String ram;
    private String dvd_rom;


    public Computer() {
        this.hd = (new HD().getSizeHD());
        this.dvd_rom = (new DVD_ROM().getTypeOfDVD());
        this.proc = (new PROC().getProcessorBaseFrequency() + " " + new PROC().getProcessorNumber());
        this.ram = (new RAM().getMemoryTypes() + " " + new RAM().getMemorySize());
    }

    public void on() {
        String isON = " is Online";
        System.out.println("Your PC is set to start");
        System.out.println(proc + isON);
        System.out.println(hd + isON);
        System.out.println(ram + isON);
        System.out.println(dvd_rom + isON);

    }

    public void off() {
        String off = " off";
        System.out.println("Your PC is set to shut down");
        System.out.println(proc + off);
        System.out.println(hd + off);
        System.out.println(ram + off);
        System.out.println(dvd_rom + off);
    }

    public void virusScan() throws InterruptedException {
        int random = 1 + (int) (Math.random() * ((10 - 1)) + 1);
        System.out.println("Wait a bit, your system checks for viruses");
        for (int i = 0; i < 5; i++) {
            Thread.sleep(1000);
            System.out.println("Wait a little more...");
            Thread.sleep(2000);
            System.out.println("a little bit more...");
            Thread.sleep(1000);
            System.out.println("I'm almost done...");
            Thread.sleep(1000);
            break;
        }
        if (random % 2 == 0) {
            System.out.println("No viruses detected on your computer.");
        } else {
            System.out.println("DANGER !!! An army of dangerous viruses has been detected!");
        }

    }
    public void showSizeHD(){
        System.out.println("HardDrive size = " + hd);
    }

}

package org.kodluyoruz;

/**
 * Bu sınıf bir bilgisayarı temsil eder.
 * Bilgisayarın beş adet donamımı vardır:
 *      - Anakart
 *      - CPU
 *      - RAM
 *      - SSD
 *      - Ekran kartı
 *
 * TODO Bu alanların getter ve setter metotlarını oluşturun.
 */
public class Computer {

    /**
     * anakart
     */
    private Hardware motherboard;

    public Hardware getMotherboard() {
        return motherboard;
    }

    public void setMotherboard(Hardware motherboard) {
        this.motherboard = motherboard;
    }
    //------------------------------------------------------------------------//
    /**
     * işlemci
     */
    private Hardware cpu;

    public Hardware getCpu() {
        return cpu;
    }

    public void setCpu(Hardware cpu) {
        this.cpu = cpu;
    }
    //------------------------------------------------------------------------//
    /**
     * RAM
     */
    private Hardware ram;

    public Hardware getRam() {
        return ram;
    }

    public void setRam(Hardware ram) {
        this.ram = ram;
    }

    //------------------------------------------------------------------------//
    /**
     * SSD
     * İsteğe bağlı: Her bilgisayarda SSD olmayabilir
     */
    private Hardware ssd;

    public Hardware getSsd() {
        return ssd;
    }

    public void setSsd(Hardware ssd) {
        this.ssd = ssd;
    }

    //------------------------------------------------------------------------//
    /**
     * ekran kartı
     * İsteğe bağlı: Her bilgisayarda ekran kartı olmayabilir
     */
    private Hardware gpu;

    public Hardware getGpu() {
        return gpu;
    }

    public void setGpu(Hardware gpu) {
        this.gpu = gpu;
    }

    //------------------------------------------------------------------------//


    public double getTotalPrice() {
        // Bu metot bilgisayarın donanımlarına bakarak toplam fiyatını hesaplar.
        // TODO metodu doldurun

        double pcPrice = cpu.price() + ram.price() + motherboard.price() + ssd.price() + gpu.price();

        return pcPrice;
    }

    public int getTotalPower() {
        // Bu metot bilgisayarın donanımlarına bakarak toplamda ne kadar güç tüketeceğini hesaplar.
        // TODO metodu doldurun
        int pcPower = cpu.power() + ram.power() + motherboard.power() + ssd.power() + gpu.power();
        return pcPower;
    }

}

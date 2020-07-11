package org.kodluyoruz;

/**
 * Bu sınıf bir işlemciyi temsil eder.
 * TODO Bu sınıfı Hardware sınıfının alt sınıfı haline getirin.
 * <p>
 * Her işlemcinin Hardware sınıfındakilere ek olarak 2 özelliği vardır:
 * - Çekirdek sayısı (cores) (int türünde)
 * - Thread sayısı (threads) (int türünde)
 * <p>
 * TODO Bu 2 özellik ve bunların metotları için gereken kodları bu sınıfın içine yazın
 */
public class CPU extends Hardware {
    /*
     * Çekirdek sayısı 6 veya daha fazlaysa CPU'nun fiyatı %30 oranında artar.
     * TODO buna göre Hardware sınıfındaki fiyat hesaplayan metodu bu sınıfta yeniden yazın
     */

    public int cores;
    public int threads;

    public void setCores(int cores) {
        this.cores = cores;
    }

    public void setThreads(int threads) {
        this.threads = threads;
    }

    @Override
    public String brand() {
        return null;
    }

    @Override
    public double price() {
        double total = getPrice();
        if (cores >= 6) {
            total = total + (getPrice() * 0.30);
        } else if (cores < 6) {
            total = getPrice();
        }
        return total;
    }

    @Override
    public int power() {
        int cpuPower = getPower();
        return cpuPower;
    }
}

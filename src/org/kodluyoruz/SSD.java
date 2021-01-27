package org.kodluyoruz;

/**
 * Bu sınıf bir SSD'yi temsil eder.
 * TODO Bu sınıfı Hardware sınıfının alt sınıfı haline getirin.
 * <p>
 * Her SSD'nin Hardware sınıfındakilere ek olarak 1 özelliği vardır:
 * - Hafıza boyutu, GB cinsinden (memory) (int türünde) Örnek: 500 GB, 750 GB vs.
 * <p>
 * TODO Bu özellik ve metotları için gereken kodları bu sınıfın içine yazın
 */
public class SSD extends Hardware {

    private int memory;

    public void setMemory(int memory) {
        this.memory = memory;
    }


    @Override
    public String brand() {
        return null;
    }

    /*
     * Eğer SSD'nin hafızası 750 GB'tan fazlaysa, her 250 GB için fiyatı 275 TL artar.
     * TODO buna göre Hardware sınıfındaki fiyat hesaplayan metodu bu sınıfta yeniden yazın
     */

    @Override
    public double price() {
        double total = getPrice();
        if (memory > 750) {
            for (int i = 250; i <= memory - 750; i += 250) {
                total = total + 275;
            }
        } else {
            total = total;
        }
        return total;
    }

    @Override
    public int power() {
        int ssdPower = getPower();
        return ssdPower;
    }


}

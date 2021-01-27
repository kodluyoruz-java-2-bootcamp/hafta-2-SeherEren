package org.kodluyoruz;

/**
 * Bu sınıf bir RAM'i temsil eder.
 * TODO Bu sınıfı Hardware sınıfının alt sınıfı haline getirin.
 * <p>
 * Her RAM'in Hardware sınıfındakilere ek olarak 2 özelliği vardır:
 * - Hafıza boyutu (memory) (int türünde) Örnek: 8 GB, 16 GB vs.
 * - Frekansı (frequency) (int türünde) Örnek: 3200 MHz, 3600 Mhz vs.
 * <p>
 * TODO Bu 2 özellik ve bunların metotları için gereken kodları bu sınıfın içine yazın
 */
public class RAM extends Hardware {
    private int memory;
    private int frequency;

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    @Override
    public String brand() {
        return null;
    }

    /*
     * Eğer RAM'in hafızası 16 GB'tan fazlaysa, her 4 GB için fiyatı 100 TL artar.
     * Eğer RAM'in frekansı 3600 MHz'den fazlaysa, her 400 MHz için fiyatı 200 TL artar.
     * TODO buna göre Hardware sınıfındaki fiyat hesaplayan metodu bu sınıfta yeniden yazın
     */

    @Override
    public double price() {
        double total = getPrice();
        if (memory > 16) {
            for (int i = 4; i <= memory - 16; i += 4) {
                total = total + 100;
            }
        } else {
            total = total;
        }
        if (frequency > 3600) {
            for (int i = 400; i <= frequency - 3600; i += 400) {
                total = total + 200;
            }
        } else {
            total = total;
        }
        return total;
    }

    @Override
    public int power() {
        int ramPower = getPower();
        return ramPower;
    }


}

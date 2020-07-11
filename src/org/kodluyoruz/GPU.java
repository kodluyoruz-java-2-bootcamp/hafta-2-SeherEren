package org.kodluyoruz;

/**
 * Bu sınıf bir ekran kartını temsil eder.
 * TODO Bu sınıfı Hardware sınıfının alt sınıfı haline getirin.
 * <p>
 * Her ekran kartının Hardware sınıfındakilere ek olarak 2 özelliği vardır:
 * - Hafıza boyutu (memory) (int türünde) Örnek: 4 GB, 8 GB vs.
 * - Renk skalası (bits) (int türünde) Örnek: 128 bits, 256 bits vs.
 * <p>
 * TODO Bu 2 özellik ve bunların metotları için gereken kodları bu sınıfın içine yazın
 */
public class GPU extends Hardware {

    private int memory;
    private int bits;

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public void setBits(int bits) {
        this.bits = bits;
    }


    @Override
    public String brand() {
        return null;
    }

    /*
     * Eğer ekran kartının hafızası 8 GB'tan fazlaysa, her 2 GB için fiyatı 250 TL artar.
     * Eğer ekran kartının renk skalası 128 bits'ten fazlaysa, her 64 bits için fiyatı 400 TL artar.
     * TODO buna göre Hardware sınıfındaki fiyat hesaplayan metodu bu sınıfta yeniden yazın
     */


    @Override
    public double price() {
        double total = getPrice();

        if (memory > 8) {
            for (int i = 2; i <= (memory - 8); i += 2) {
                double tutar = (total + 250);
                total = tutar;
            }
        } else if (memory <= 8) {
            total = getPrice();
        }

        if (bits > 128) {
            for (int i = 64; i <= bits - 128; i += 64) {
                double bitsTotal = total + 400;
                total = bitsTotal;
            }
        } else {
            total = total;
        }
        return total;
    }

    @Override
    public int power() {
        int gpuPower = getPower();
        return gpuPower;
    }


}

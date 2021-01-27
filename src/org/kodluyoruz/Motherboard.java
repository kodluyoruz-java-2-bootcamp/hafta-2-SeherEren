package org.kodluyoruz;

/**
 * Bu sınıf bir anakartı temsil eder.
 * TODO Bu sınıfı Hardware sınıfının alt sınıfı haline getirin.
 *
 * Her anakartın Hardware sınıfındakilere ek olarak 3 özelliği vardır:
 *      - İşlemci mimarisi, yani hangi marka işlemcilere uygun olduğu (cpuArchitect) (String türünde) Örnek: AMD veya Intel
 *      - WiFi olup olmadığı (wifiIncluded) (boolean türünde)
 *      - Bluetooth olup olmadığı (bluetoothIncluded) (boolean türünde)
 *
 * TODO Bu 3 özellik ve bunların metotları için gereken kodları bu sınıfın içine yazın
 */
public class Motherboard extends Hardware {


    private String cpuArchitect;
    private boolean wifiIncluded;
    private boolean bluetoothIncluded;

    public void setCpuArchitect(String cpuArchitect) {
        this.cpuArchitect = cpuArchitect;
    }

    public void setWifiIncluded(boolean wifiIncluded) {
        this.wifiIncluded = wifiIncluded;
    }

    public void setBluetoothIncluded(boolean bluetoothIncluded) {
        this.bluetoothIncluded = bluetoothIncluded;
    }

    @Override
    public String brand() {
        return null;
    }
    /*
     * Eğer anakartın üzerinde WiFi chipset'i varsa anakartın fiyatı 250 TL artar.
     * Eğer anakartın üzerinde bluetooth chipset'i varsa anakartın fiyatı 100 TL artar.
     * TODO buna göre Hardware sınıfındaki fiyat hesaplayan metodu bu sınıfta yeniden yazın
     */


    @Override
    public double price() {
        double total = getPrice();

        if (wifiIncluded == true) {
            total = total + 250;
        } else if (wifiIncluded == false)
            total = total;

        if (bluetoothIncluded == true) {
            total = total + 100;
        } else {
            total = total;
        }
        return total;
    }

    @Override
    public int power() {
        int motherPower = getPower();
        return motherPower;
    }


}

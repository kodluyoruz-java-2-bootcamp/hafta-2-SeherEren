package org.kodluyoruz;

/**
 * Bu sınıf bilgisayar donanımları için hazırlanmış bir üst sınıftır.
 *
 * Her donanım için ortak olan 3 özellik vardır:
 *      - Markası (brand) (String türünde) Örnek: AMD, Intel, Nvidia, Samsung vs.
 *      - Fiyatı (price) (double türünde)
 *      - Çalışırken harcayacağı güç (power) (int türünde) Not: 1 ile 150 arasında bir değer verebilirsiniz.
 *
 * TODO Bu 3 özellik ve bunların metotları için gereken kodları bu sınıfın içine yazın
 */
public abstract class Hardware {
    private String brand;
    private double price;
    private int power = 150;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }


    public abstract String brand();

    public abstract double price();

    public abstract int power();


}

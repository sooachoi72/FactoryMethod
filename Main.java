package ch04;

import ch04.framework.Factory;
import ch04.framework.Product;
import ch04.idcard.IDCardFactory;
import ch04.license.LicenseCardFactory;

public class Main {
    public static void main(String[] args) {

        System.out.println("\n20240904 최수아 - Factory Method Pattern\n");
        // Step 1 테스트: IDCard 확장
        Factory factory1 = new IDCardFactory("2026-01-15");
        Product card1 = factory1.create("Kim Youngjin");
        Product card2 = factory1.create("Son Heungmin");
        card1.use();
        card2.use();

        System.out.println(); // 구분선

        // Step 2 테스트: LicenseCard 추가
        Factory factory2 = new LicenseCardFactory("2026-03-20");
        Product license1 = factory2.create("Park Jisung");
        Product license2 = factory2.create("Lee Min-jae");
        license1.use();
        license2.use();
    }
}
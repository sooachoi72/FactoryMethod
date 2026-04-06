package ch04.license;

import ch04.license.LicenseCard;
import ch04.framework.Factory;
import ch04.framework.Product;

public class LicenseCardFactory extends Factory {
    private int licenseCounter = 100; // 면허번호 카운터
    private String baseDate;

    public LicenseCardFactory(String baseDate) {
        this.baseDate = baseDate;
    }

    @Override
    protected synchronized Product createProduct(String owner) {
        // 만료일은 발급일로부터 5년 뒤로 설정 (간이 구현)
        String expiryDate = baseDate.replace("2026", "2031"); 
        return new LicenseCard(owner, licenseCounter++, baseDate, expiryDate);
    }

    @Override
    protected void registerProduct(Product product) {
        System.out.println(product + "을 등록했습니다.");
    }
}
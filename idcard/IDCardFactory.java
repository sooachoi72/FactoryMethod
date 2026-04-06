package ch04.idcard;

import ch04.framework.Factory;
import ch04.framework.Product;

public class IDCardFactory extends Factory {
    private int serial = 100;
    private String baseDate; // 카드 발급 기준 날짜

    // 기준 날짜를 받는 생성자 추가
    public IDCardFactory(String baseDate) {
        this.baseDate = baseDate;
    }

    @Override
    protected synchronized Product createProduct(String owner) {
        // 생성된 IDCard에 baseDate 전달
        return new IDCard(owner, serial++, baseDate);
    }

    @Override
    protected void registerProduct(Product product) {
        System.out.println(product + "을 등록했습니다.");
    }
}
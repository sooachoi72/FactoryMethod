package ch04.license;

import ch04.framework.Product;

public class LicenseCard extends Product {
    private String holder;
    private int licenseNumber;
    private String issuedDate;
    private String expiryDate;

    // 운전면허증 정보 초기화 생성자
    LicenseCard(String holder, int licenseNumber, String issuedDate, String expiryDate) {
        System.out.println(holder + "의 운전면허증을 " + licenseNumber + "번으로 만듭니다.");
        this.holder = holder;
        this.licenseNumber = licenseNumber;
        this.issuedDate = issuedDate;
        this.expiryDate = expiryDate;
    }

    @Override
    public void use() {
        System.out.println(this + "을 사용합니다.");
    }

    @Override
    public String toString() {
        // 운전면허증 정보를 포함하도록 수정
        return "[LicenseCard:" + holder + "(" + licenseNumber + ")] - 유효기간: " + issuedDate + "~" + expiryDate;
    }
}
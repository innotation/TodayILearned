package com.ino.section04.dto;

public class Application {
    public static void main(String[] args) {
        UserDTO user1 = new UserDTO("user01", "1234");
        CosmeticDTO cosmetic1 = new CosmeticDTO();
        cosmetic1.setBrand("아벤느");
        cosmetic1.setName("젠틀토닝로션");
        cosmetic1.setPrice(23000);
        cosmetic1.setCategory("스킨케어");
        cosmetic1.setDC(false);

        CosmeticDTO cosmetic2 = new CosmeticDTO("펜라이너", 15000, "클리오", "아이메이크업", true);
    }
}

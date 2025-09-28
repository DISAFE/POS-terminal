package model;

import java.util.ArrayList;

/**
 * 메뉴판 클래스 입니다
 * 메뉴 추가, 조회, 업데이트, 삭제 기능을 지원할 예정입니다.
 *
 * @author 강규빈
 * @version 1.0
 * @since 2025-09-27
 */
public class MenuBoard {
    private ArrayList<Menu> menus;

    public MenuBoard() { this.menus = new ArrayList<>(); }

    /**
     * 새로운 메뉴를 생성하는 메소드입니다.
     *
     * @param name: 메뉴 이름입니다. 중복될 수 없습니다.
     * @param price: 메뉴 가격입니다.
     * @param discountable: 할인 적용 여부입니다.
     * @throws IllegalArgumentException: 이미 등록된 메뉴이름(name)이 중복될 시 throw합니다.
     */
    public void createMenu(String name, int price, boolean discountable) throws IllegalArgumentException{

    }

    /**
     * 기존 메뉴를 삭제하는 메소드입니다.
     *
     * @param name: 메뉴 이름입니다.
     * @throws IllegalArgumentException: menus배열에 name이 존재하지 않을 시 throw합니다.
     */
    public void deleteMenu(String name) throws IllegalArgumentException {

    }

    /**
     * 기존 메뉴를 업데이트 하는 메소드입니다.
     *
     * @param name: 수정할 이름입니다.
     * @param price: 수정할 가격입니다.
     * @param discountable: 수정할 할인 적용 여부
     * @throws IllegalArgumentException: menus배열에 동일 name이 존재하지 않을 시 throw합니다.
     */
    public void updateMenu(String name, int price, boolean discountable) throws IllegalArgumentException {

    }

    /**
     * menus를 ArrayList<MenuDTO>로 변환시켜 반환하는 메소드입니다.
     *
     * @return ArrayList<MenuDTO>
     */
    public ArrayList<MenuDTO> getList() {

    }

    /**
     *
     * Menu 클래스입니다.
     * 메뉴의 기본 정보를 담고 있습니다.
     * 이 클래스는 MenuBoard 내부에서만 사용됩니다.
     *
     * @author 강규빈
     * @version 1.0
     * @since 2025-09-27
     */
    private class Menu {
        private String name; // 메뉴 이름
        private Integer price; //메뉴 가격
        private boolean discountable; // 할인가능 품목

        /**
         *
         * @param name: 메뉴 이름입니다. 중복될 수 없습니다.
         * @param price: 메뉴 가격입니다.
         * @param discountable: 할인 적용 상품인지 여부입니다.
         */
        public Menu(String name, int price, boolean discountable) {
            this.name = name;
            this.price = price;
            this.discountable = discountable;
        }

        /**
         * DTO로 변환하는 메소드 입니다.
         */
        public MenuDTO toMenuDTO() {

            return null;
        }

        //Setter와 Getter 정의
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getPrice() {
            return price;
        }

        public void setPrice(Integer price) {
            this.price = price;
        }

        public boolean isDiscountable() {
            return discountable;
        }

        public void setDiscountable(boolean discountable) {
            this.discountable = discountable;
        }
    }
}

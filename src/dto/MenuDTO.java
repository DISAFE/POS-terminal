package dto;

/**
 * MenuBoard(model)와 Controller 사이에서 사용되는 DTO를 만드는 정적 팩토리 클래스
 *
 * Crea
 */
public class MenuDTO {
    /**
     * 메뉴를 생성할 때 사용되는 DTO
     * Controller -> MenuBoard
     *
     * @param name
     * @param price
     * @param discountable
     */
    public record CreateDTO(String name, int price, boolean discountable) {}

    /**
     * 메뉴를 업데이트할 때 사용되는 DTO
     * Controller -> MenuBoard
     * @param name
     * @param price
     * @param discountable
     */
    public record UpdateDTO(String name, int price, boolean discountable) {}

    /**
     * 메뉴를 삭제할 때 사용되는 DTO
     * Controller -> MenuBoard
     * @param name
     */
    public record DeleteDTO(String name) {}

    /**
     * 메뉴 정보를 반환할 때 사용되는 DTO
     * @param name
     * @param price
     * @param discountable
     */
    public record InfoDTO(String name, int price, boolean discountable) {}

    private MenuDTO() {}

    // 정적 펙토리 메서드 -------------------------------------------
    public static CreateDTO createOf(String name, int price, boolean discountable) {
        return new CreateDTO(name, price, discountable);
    }

    public static UpdateDTO updateOf(String name, int price, boolean discountable) {
        return new UpdateDTO(name, price, discountable);
    }
    public static DeleteDTO deleteOf(String name) {
        return new DeleteDTO(name);
    }
    public static InfoDTO infoOf(String name, int price, boolean discountable) {
        return new InfoDTO(name, price, discountable);
    }

}

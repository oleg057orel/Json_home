public class Main {
    public static void main(String[] args ) {
        Post post = new Post();
        post.birthday = new FormDate();

        post.name = "Олег";
        post.surname = "Лазаров";
        post.patronymic = "Михайлович";
        post.phone = "+79105556677";
        post.passport = "0055 446644";
        post.subscription = true;
        post.birthday.day = 13;
        post.birthday.month = 6;
        post.birthday.year = 1999;

    }
}

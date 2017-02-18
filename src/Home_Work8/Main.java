package Home_Work8;

public class Main {
    public static void main(String[] args) {
        UserDAO DAO = new UserDAO();
        User user = null;
        for (int i = 0; i < 10; i++){
            User u = new User("User " + i);
            DAO.save(u);
            if (i == 5) user = u;
        }

        System.out.println(DAO.get(3));
        DAO.deleteById(3);
        DAO.delete(user);
    }
}

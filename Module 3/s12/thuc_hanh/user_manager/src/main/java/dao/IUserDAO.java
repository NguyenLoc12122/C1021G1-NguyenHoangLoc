package dao;

import model.User;

import java.sql.SQLException;
import java.util.List;

public interface IUserDAO {
    public void insertUsers(User user)throws SQLException;
    public User selectUser(int id);
    public List<User> selectAllUser();
    public List<User> selectAllUserSort();
    public boolean deleteUser(int id)throws SQLException;
    public boolean updateUser(User user)throws SQLException;
    User getUserById(int id);

    void insertUserStore(User user) throws SQLException;
    public void insertUpdateWithoutTransaction();
}

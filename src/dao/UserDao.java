package dao;

import java.sql.SQLException;
import model.User;

public interface UserDao {
    public User findBySsn(String ssn) throws SQLException;
}

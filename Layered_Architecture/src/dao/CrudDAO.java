package dao;

import java.sql.SQLException;
import java.util.ArrayList;

public interface CrudDAO<T,ID> extends SuperDAO{
     ArrayList<T> getAll() throws SQLException, ClassNotFoundException ;
     boolean save(T dao) throws SQLException, ClassNotFoundException ;
     boolean update(T dao) throws SQLException, ClassNotFoundException ;
     boolean exist(ID id) throws SQLException, ClassNotFoundException ;
     boolean delete(ID id) throws SQLException, ClassNotFoundException;
     String generateNewID() throws SQLException, ClassNotFoundException ;
     T search(ID id) throws SQLException, ClassNotFoundException ;
}

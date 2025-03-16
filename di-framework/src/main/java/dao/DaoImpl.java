package dao;
import org.springframework.stereotype.Repository;


/**
 * @author achraf
 * @date 3/16/25
 */
@dao.Repository("dao")
public class DaoImpl implements IDao {
    @Override
    public double getData() {
        System.out.println("Version Base de données");
        return 25;
    }
}

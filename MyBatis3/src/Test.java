
import Entidades.Ciudad;
import java.io.Reader;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;


public class Test {
    public static void main(String[] args) {
        Reader reader = null;
        SqlSessionFactory sqlSessionFactory = null ;
        SqlSession sqlSession =null;
        String resourse = "Configuracion/configuration.xml";
        try {
            reader = Resources.getResourceAsReader(resourse);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
            sqlSession = sqlSessionFactory.openSession();
            
            Ciudad ciudad= (Ciudad) (sqlSession.selectOne("Ciudad.SeleccionarCiudad",4));
            System.out.println("ciudad :"+ciudad.getNombre());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally{
            if (sqlSession!=null) {
                sqlSession.close();
            }
        }
        
    }
}


import Entidades.Ciudad;
import Entidades.Cliente;
import Entidades.Pais;
import java.io.Reader;
import java.util.List;
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
////            
////            Ciudad ciudad= (Ciudad) (sqlSession.selectOne("Ciudad.SeleccionarCiudad",4));
////            System.out.println("ciudad :"+ciudad.getNombre());
            
            List<Cliente> clientes  = sqlSession.selectList("Cliente.SeleccionarClientes","%%");
            for (int i = 0; i < clientes.size(); i++) {
                System.out.println(clientes.get(i).getNombre()+" \t\t "+clientes.get(i).getoCiudad().getNombre()+" \t \t\t"+clientes.get(i).getoCiudad().getoPais().getNombre());
            }
            
            //////
            
//            List<Ciudad> ciudades  = sqlSession.selectList("Ciudad.SeleccionarCiudades","%%");
//            for (int i = 0; i < ciudades.size(); i++) {
//                System.out.println("CIUDAD : "+ciudades.get(i).getNombre());
//                System.out.println("CLIENTES");
//                for (int j = 0; j < ciudades.get(i).getlCliente().size(); j++) {
//                    System.out.println(ciudades.get(i).getlCliente().get(j).getNombre());
//                }
//            }
//            
            
            //////
//             List<Pais> paises  = sqlSession.selectList("Pais.SeleccionarPaises","%%");
//            for (int i = 0; i < paises.size(); i++) {
//                System.out.println("PAIS : "+paises.get(i).getNombre());
//                System.out.println("***ciudades**");
//                
//                for (int j = 0; j < paises.get(i).getlCiudad().size(); j++) {
//                    System.out.println(paises.get(i).getlCiudad().get(j).getNombre());
//                    System.out.println("**Clientes***");
//                    
//                    for (int k = 0; k < paises.get(i).getlCiudad().get(j).getlCliente().size(); k++) {
//                    System.out.println(paises.get(i).getlCiudad().get(j).getlCliente().get(k).getNombre());                    
//                }
//                    
//                    
//                }
//            }
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


package datos.interfaces;

import java.util.List;


public interface CrudPaginadoInterface<T> {
    public List<T> listar(String texto, int totalPorPagina, int numPagina);
    public boolean insertar(T obj);
    public boolean actualizar(T obj);
    public boolean desactivar(int id);
    public boolean eliminar(int id);
    public int total();
    public boolean existe(int clave, String claveAlterna);
}

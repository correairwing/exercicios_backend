package Test;


import org.junit.Assert;
import org.junit.Test;

import DAO.ClientDAO;
import DAO.ClientDAOMock;
import DAO.IClientDAO;
import Service.ClientService;

public class ClientServiceTest {
    @Test
    public void salvarTest() {
        IClientDAO mockDAO = new ClientDAOMock();
        ClientService service = new ClientService(mockDAO);
        String retorno = service.Salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperaErroNoSalvarTest() {
        IClientDAO mockDAO = new ClientDAO();
        ClientService service = new ClientService(mockDAO);
        String retorno = service.Salvar();
        Assert.assertEquals("Sucesso", retorno);
    }
}
 
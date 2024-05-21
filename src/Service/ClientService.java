package Service;

import DAO.ClientDAO;
import DAO.IClientDAO;

public class ClientService {
    private IClientDAO clientDAO;

    public ClientService(IClientDAO clientDAO) {
        //clientDAO = new ClientDAO();
        this.clientDAO = clientDAO;
    }

    public String Salvar() {
        clientDAO.Salvar();
        return "Sucesso";
    }
}

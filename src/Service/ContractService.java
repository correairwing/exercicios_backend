package Service;

import DAO.IContractDAO;

public class ContractService implements IContractService {

    IContractDAO contractDAO;

    public ContractService(IContractDAO contractDAO) {
        this.contractDAO = contractDAO;
    }

    @Override
    public String salvar() {
        contractDAO.salvar();
        return "Sucesso";
    }

    @Override
    public String search() {
        contractDAO.search();
        return "Positive";
    }

    @Override
    public String update() {
        contractDAO.update();
        return "Done";
    }

    @Override
    public String delete() {
        contractDAO.delete();
        return "Erased";
    }
    
}
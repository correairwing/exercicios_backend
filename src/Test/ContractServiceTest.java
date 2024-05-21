package Test;

import org.junit.Assert;
import org.junit.Test;

import DAO.ContractDAO;
import DAO.IContractDAO;
import DAO.Mock.ContratoDAOMock;
import Service.ContractService;
import Service.IContractService;

public class ContractServiceTest {
    
    // SAVE TEST AND EXCEPTION
    @Test
    public void saveContract() {
        IContractDAO contractDAOMock = new ContratoDAOMock();
        IContractService contractService = new ContractService(contractDAOMock);
        String retorno = contractService.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }
    
    @Test(expected = UnsupportedOperationException.class)
    public void expectErrorNoDatabaseSaveContract() {
        IContractDAO contractDAO = new ContractDAO();
        IContractService contractService = new ContractService(contractDAO);
        String retorno = contractService.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }
    
    //SEARCH TEST AND EXCEPTION
    @Test
    public void searchContract() {
        IContractDAO contractDAOMock = new ContratoDAOMock();
        IContractService contractService = new ContractService(contractDAOMock);
        String retorno = contractService.search();
        Assert.assertEquals("Positive", retorno);
    }
    
    @Test(expected = UnsupportedOperationException.class)
    public void expectErrorNoDatabaseSearchContract() {
        IContractDAO contractDAO = new ContractDAO();
        IContractService contractService = new ContractService(contractDAO);
        String retorno = contractService.search();
        Assert.assertEquals("Positive", retorno);
    }

    //UPDATE TEST AND EXCEPTION
    @Test
    public void updateContract() {
        IContractDAO contractDAOMock = new ContratoDAOMock();
        IContractService contractService = new ContractService(contractDAOMock);
        String retorno = contractService.update();
        Assert.assertEquals("Done", retorno);
    }
    
    @Test(expected = UnsupportedOperationException.class)
    public void expectErrorNoDatabaseUpdateContract() {
        IContractDAO contractDAO = new ContractDAO();
        IContractService contractService = new ContractService(contractDAO);
        String retorno = contractService.update();
        Assert.assertEquals("Done", retorno);
    }
    

    //DELETE TEST AND EXCEPTION
    @Test
    public void deleteContract() {
        IContractDAO contractDAOMock = new ContratoDAOMock();
        IContractService contractService = new ContractService(contractDAOMock);
        String retorno = contractService.delete();
        Assert.assertEquals("Erased", retorno);
    }
    
    @Test(expected = UnsupportedOperationException.class)
    public void expectErrorNoDatabaseDeleteContract() {
        IContractDAO contractDAO = new ContractDAO();
        IContractService contractService = new ContractService(contractDAO);
        String retorno = contractService.delete();
        Assert.assertEquals("Erased", retorno);
    }




}

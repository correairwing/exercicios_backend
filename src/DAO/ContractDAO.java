package DAO;

public class ContractDAO implements IContractDAO {

    @Override
    public void salvar() {
        throw new UnsupportedOperationException("There is no Database");        
    }

    @Override
    public void search() {
        throw new UnsupportedOperationException("There is no Database");        
        
    }
    
    @Override
    public void update() {
        throw new UnsupportedOperationException("There is no Database");        
        
    }
    
    @Override
    public void delete() {
        throw new UnsupportedOperationException("There is no Database");        
        
    }
    
}
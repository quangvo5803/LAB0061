package Repository;

import DataAccess.CalculateDao;

public class CalculateRepository implements ICalculateReopsitory {
    public CalculateRepository(){

    }

    @Override
    public void calculatorCirlce(){
        CalculateDao.Instance().calculatorCirlce();
    }
    @Override
    public void calculatorRectangle(){
        CalculateDao.Instance().calculatorRectangle();
    }
    @Override
    public void calculatorTriangle(){
        CalculateDao.Instance().calculatorTriangle();
    }
}

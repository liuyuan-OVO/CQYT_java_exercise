package LSL_EX_14.LSL_EX_14_2;

public class Machine {
    public void checkBag(Goods goods) throws DangerException {
        if(goods.isDanger()) {
            DangerException danger=new DangerException();
            throw danger;
        }
        else {
            System.out.print(goods.getName()+"不是危险品! ");
        }
    }
}

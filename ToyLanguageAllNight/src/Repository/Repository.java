package Repository;

import Model.ADT.List.MyIList;
import Model.ADT.List.MyList;
import Model.ADT.Stack.MyIStack;
import Model.PrgState.PrgState;

public class Repository implements IRepository{
    private MyIList<PrgState> prgState;
    int length = 0;

    public Repository(){
        prgState = new MyList<PrgState>();
    }

    @Override
    public void addPrg(PrgState p) {
        prgState.add(p);
        length++;
    }

    @Override
    public PrgState getCrtPrg() {
        return prgState.get(length - 1);
    }
}

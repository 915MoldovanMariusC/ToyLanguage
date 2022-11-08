package Model.PrgState;

import Model.ADT.Dictionary.MyIDictionary;
import Model.ADT.List.MyIList;
import Model.ADT.Stack.MyIStack;
import Model.Statement.IStmt;
import Model.Value.Value;

public class PrgState{
    MyIStack<IStmt> exeStack;

    public MyIStack<IStmt> getExeStack() {
        return exeStack;
    }

    public MyIDictionary<String, Value> getSymTable() {
        return symTable;
    }

    public MyIList<Value> getOut() {
        return out;
    }

    public IStmt getOriginalProgram() {
        return originalProgram;
    }

    MyIDictionary<String, Value> symTable;
    MyIList<Value> out;
    IStmt   originalProgram;
    public PrgState(MyIStack<IStmt> stk, MyIDictionary<String, Value> symtbl, MyIList<Value> ot, IStmt prg){
        exeStack=stk;
        symTable=symtbl;
        out = ot;
        //TODO: ceva
       // originalProgram=deepCopy(prg);
        stk.push(prg);
    }
}
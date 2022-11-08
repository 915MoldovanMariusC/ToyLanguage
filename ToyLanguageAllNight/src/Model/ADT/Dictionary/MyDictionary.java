package Model.ADT.Dictionary;

import java.util.Dictionary;
import java.util.HashMap;
import java.util.Map;

public class MyDictionary<Key, Value> implements MyIDictionary<Key, Value>{
    HashMap<Key, Value> dictionary;


    public MyDictionary(){
        this.dictionary = new HashMap<Key, Value>();
    }
    @Override
    public void add(Key key, Value value) {
        dictionary.put(key, value);
    }

    @Override
    public boolean isDefined(Key id) {
        return dictionary.get(id) != null;
    }

    @Override
    public Value lookup(Key id) {
        return dictionary.get(id);
    }

    @Override
    public void update(Key id, Value val) {
        dictionary.put(id, val);
    }
}

import java.util.Map;

public class SwitchKeyValue {

    public void switchKey(Map<Object,Object> map, Object key){
        Object value  = map.get(key);
        map.remove(key);
        map.put(value,key);
    }
}

package Reducing;

import java.util.List;
import java.util.Objects;

public class GroupPair {
    String key;
    List<Integer> value;

    public GroupPair(String key, List<Integer> value) {
        this.key = key;
        this.value = value;
    }
    public String getKey() {

        return key;
    }
    public void setKey(String key)
    {
        this.key = key;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GroupPair groupPair = (GroupPair) o;
        return key.equals(groupPair.key) &&
                value.equals(groupPair.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, value);
    }

    public List<Integer> getValue() {

        return value;
    }
    public void setValue(List<Integer> value) {

        this.value = value;
    }
//< a , [1, 1, 1, 1] >
    @Override
    public String toString() {
        return "< "+this.key+" , "+this.getValue().get(0)+" >";
    }
}
//< a , 4 >
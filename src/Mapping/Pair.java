package Mapping;

import java.util.Objects;

public class Pair  {
    long key;
    String value;

    public Pair(long key, String  value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return "< "+this.value+" , "+this.key+" >";
//        < are , 1 >
    }

    public long getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }

    public void setKey(long key) {
        this.key = key;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pair pair = (Pair) o;
        return key == pair.key &&
                value.equals(pair.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, value);
    }
}

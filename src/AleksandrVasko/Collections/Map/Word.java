package AleksandrVasko.Collections.Map;

import java.util.Objects;

public class Word implements Comparable<Word> {
    private final String key;
    private final Integer value;

    public Word(String key, Integer value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public Integer getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Word word = (Word) o;
        return key.equals(word.key) && value.equals(word.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, value);
    }

    @Override
    public String toString() {
        return  key + " " + value;
    }

    @Override
    public int compareTo(Word o) {
        if(value>o.getValue()){return 1;}
        if(value<o.getValue()){return -1;}
        if(value.equals(o.getValue())){
            return key.compareTo(o.getKey());}
        return 0;
    }
}

package dictionary;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by home-folder on 6/14/17.
 */
public class PersonalMultipleEntryDictionary implements  MultipleEntryDictionary{

    private final Map<String, Set<String>> dictionary;

    public PersonalMultipleEntryDictionary() {
        this.dictionary = new HashMap<String, Set<String>>();
    }

    @Override
    public void add(String word, String entry) {
        if(!(this.dictionary.containsKey(word))){
            this.dictionary.put(word, new HashSet<String>());
        }
        Set<String> meaning = this.dictionary.get(word);
        meaning.add(entry);
    }

    @Override
    public Set<String> translate(String word) {

        if(this.dictionary.containsKey(word)){
            return this.dictionary.get(word);
        } else{
            return null;
        }
    }

    @Override
    public void remove(String word) {
        if(this.dictionary.containsKey(word)){
            this.dictionary.remove(word);
        }
    }
}

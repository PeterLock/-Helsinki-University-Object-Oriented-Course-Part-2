package tools;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by home-folder on 6/19/17.
 */
public class PersonalDuplicateRemover implements DuplicateRemover{

    private final List<String> duplicates;
    private int duplicatesDetected;

    public PersonalDuplicateRemover() {
        this.duplicates = new ArrayList<>();
        this.duplicatesDetected = 0;
    }

    @Override
    public void add(String characterString) {
        if(!(this.duplicates.contains(characterString))){
            this.duplicates.add(characterString);
        }else{
            this.duplicatesDetected++;
        }
    }

    @Override
    public int getNumberOfDetectedDuplicates() {
        return this.duplicatesDetected;
    }

    @Override
    public Set<String> getUniqueCharacterStrings() {

        Set<String> unique = new HashSet<>();
        for(String buffer : this.duplicates){
            if(!unique.contains(buffer)){
                unique.add(buffer);
            }
        }
        return unique;
    }

    @Override
    public void empty() {
        this.duplicates.clear();
        this.duplicatesDetected = 0;
    }
}

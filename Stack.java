/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lemon
 */

import java.util.ArrayList;

public class Stack {

    private ArrayList<String> stringList;
    public String testString;

    
    public Stack() {
    this.stringList = new ArrayList<>();
}

    public boolean isEmpty() {
        return stringList.isEmpty() == true;
    }

    public void add(String value) {
        stringList.add(value);
    }

    public ArrayList<String> values() {
        return stringList;
    }
    
    public String take() {
        
        testString = stringList.get(stringList.size() - 1);
        
        if(stringList.size() > 0) {
            stringList.remove(stringList.get(stringList.size() - 1));
        }
        
return testString;


        

    }
}

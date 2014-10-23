package com.techiedb.app.j8recipes.oops;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Larry Pham
 * @since 25.10.2014
 */
public class Person implements Serializable{
    private static final long serialVersionUUID = 1L;
    private static volatile Person mInstance = new Person();
    private List<String> mJoinedTeams = new ArrayList<String>();

    private Person(){

    }

}

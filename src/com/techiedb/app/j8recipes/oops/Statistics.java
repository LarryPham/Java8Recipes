package com.techiedb.app.j8recipes.oops;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Statistics implements Serializable{
    private static final long serialVersionUID = 1L;

    // Definition for the class instance
    private static volatile  Statistics mInstance = new Statistics();
    private List mTeams = new ArrayList();

    /**
     * Constructor has been made private so that outside classes do not have access to instantiate more instances of
     * Statistics.
     */
    private Statistics(){

    }
    /**
     * Accessor for the Statistics Class. Only allows for one instance of the class to be created.
     */
    public static Statistics getInstance(){
        synchronized (Statistics.class){
            if (mInstance == null){
                mInstance = new Statistics();
            }
            return mInstance;
        }
    }

    public List getTeams(){
        return mTeams;
    }

    public void setTeams(List teams){
        this.mTeams = teams;
    }

    protected Object readResolve(){
        return mInstance;
    }
}

package com.techiedb.app.j8recipes.oops;

import java.util.ArrayList;
import java.util.List;

public enum  Statistics2 {
    INSTANCE;
    private List mTeams = new ArrayList();
    public List getTeams(){
        return this.mTeams;
    }
    public void setTeams(List teams){
        this.mTeams = teams;
    }
}

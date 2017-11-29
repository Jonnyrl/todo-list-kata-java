package edu.inlab.katas;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 1183942 on 29/11/2017.
 */
public class ListTask {

    List<String> tasks;

    public ListTask() {
        tasks=new ArrayList<String>();
    }

    public void addTask(String task) {
        tasks.add(task);
    }

    public List<String> getList() {
        return tasks;
    }

}

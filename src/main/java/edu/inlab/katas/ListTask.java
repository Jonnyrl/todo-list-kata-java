package edu.inlab.katas;

import com.sun.istack.internal.NotNull;
import com.sun.istack.internal.Nullable;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 1183942 on 29/11/2017.
 */
public class ListTask {


    private class Task {
        String name;
        boolean done;
    }

    List<Task> tasks;

    public ListTask() {
        tasks=new ArrayList<Task>();
    }

    public void addTask(String name) {
        Task task = new Task();
        task.name = name;

        tasks.add(task);
    }


    public void markAsDone(String taskName) {
        for (Task task: tasks) {
            if(taskName.equals(task.name)) {
                task.done = true;
            }
        }
    }

    public boolean isDone(String taskName) {
        for (Task task: tasks) {
            if(taskName.equals(task.name)) {
                return task.done;
            }
        }
        return false;
    }

    public List<String> getList() {
        List<String> toRet = new ArrayList<>();

        for (Task task: tasks) {
            toRet.add(task.name);
        }

        return toRet;
    }

}

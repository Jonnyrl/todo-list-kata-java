package edu.inlab.katas;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by 1183942 on 29/11/2017.
 */
public class ListTasks {

    ListTask taskerLister;

    @Test
    public void whenGetListOfTasksWithOneElementTaskThenReturnsThisTask() {
        //Arrange
        List<String> testTasks = new ArrayList<String>();
        testTasks.add("task1");
        taskerLister = new ListTask();

        //Act
        taskerLister.addTask("task1");
        List<String> returnedTasks = taskerLister.getList();

        //Assert
        assertEquals(testTasks,returnedTasks);
    }

    @Test
    public void whenGetListOfTasksWithTwoElementsTaskThenReturnsThisTask() {
        //Arrange
        List<String> testTasks = new ArrayList<String>();
        testTasks.add("task1");
        testTasks.add("task2");
        taskerLister = new ListTask();

        //Act
        taskerLister.addTask("task1");
        taskerLister.addTask("task2");
        List<String> returnedTasks = taskerLister.getList();


        //Assert
        assertEquals(testTasks,returnedTasks);
    }

    @Test
    public void whenGetListOfTasksWithDifferentOrderThenReturnsThisTask() {
        //Arrange
        List<String> testTasks = new ArrayList<String>();
        testTasks.add("task2");
        testTasks.add("task1");
        taskerLister = new ListTask();

        //Act
        taskerLister.addTask("task2");
        taskerLister.addTask("task1");
        List<String> returnedTasks = taskerLister.getList();

        //Assert
        assertEquals(testTasks,returnedTasks);
    }
}

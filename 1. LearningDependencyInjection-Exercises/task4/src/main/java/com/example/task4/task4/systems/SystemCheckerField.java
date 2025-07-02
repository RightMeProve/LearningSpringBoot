package com.example.task4.task4.systems;

import com.example.task4.task4.checkers.CpuChecker;
import com.example.task4.task4.checkers.DiskChecker;
import com.example.task4.task4.checkers.MemoryChecker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SystemCheckerField {
    @Autowired
    private CpuChecker cpuChecker;

    @Autowired
    private DiskChecker diskChecker;

    @Autowired
    private MemoryChecker memoryChecker;

    public void runChecks(){
        System.out.println("Running checks using Field Injections!");
        cpuChecker.check();
        diskChecker.check();
        memoryChecker.check();
    }
}

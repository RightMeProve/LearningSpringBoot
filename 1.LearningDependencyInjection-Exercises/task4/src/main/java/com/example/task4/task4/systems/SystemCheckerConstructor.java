package com.example.task4.task4.systems;

import com.example.task4.task4.checkers.CpuChecker;
import com.example.task4.task4.checkers.DiskChecker;
import com.example.task4.task4.checkers.MemoryChecker;
import org.springframework.stereotype.Component;

@Component
public class SystemCheckerConstructor {
    private final CpuChecker cpuChecker;
    private final DiskChecker diskChecker;
    private final MemoryChecker memoryChecker;

    public SystemCheckerConstructor(CpuChecker cpuChecker,DiskChecker diskChecker,MemoryChecker memoryChecker){
        this.cpuChecker = cpuChecker;
        this.diskChecker = diskChecker;
        this.memoryChecker = memoryChecker;
    }

    public void runChecks(){
        System.out.println("Running checks using Constructor Injection");
        cpuChecker.check();
        diskChecker.check();
        memoryChecker.check();
    }
}

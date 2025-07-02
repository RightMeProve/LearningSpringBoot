package com.example.task4.task4.systems;

import com.example.task4.task4.checkers.CpuChecker;
import com.example.task4.task4.checkers.DiskChecker;
import com.example.task4.task4.checkers.MemoryChecker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SystemCheckerSetter {
    private CpuChecker cpuChecker;
    private DiskChecker diskChecker;
    private MemoryChecker memoryChecker;

    @Autowired
    public void setCpuChecker(CpuChecker cpuChecker){
        this.cpuChecker = cpuChecker;
    }

    @Autowired
    public void setDiskChecker(DiskChecker diskChecker){
        this.diskChecker = diskChecker;
    }

    @Autowired
    public void setMemoryChecker(MemoryChecker memoryChecker){
        this.memoryChecker = memoryChecker;
    }

    public void runCheck(){
        System.out.println("Running checks using Setter Injection!");
        cpuChecker.check();
        memoryChecker.check();
        diskChecker.check();
    }
}

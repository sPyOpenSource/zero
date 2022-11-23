package jx.zero;

import jx.zero.debug.MonitorCommand;

public interface DebugSupport extends Portal {
    void dumpDomain(Domain domain);
    void dumpObject(Object o);
    void sendBinary(String name, Memory data, int size);
    void registerMonitorCommand(String name, MonitorCommand cmd);
    void breakpoint();
}

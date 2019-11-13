package jx.zero;

public interface AtomicVariable extends Portal {
    Object get();
    
    void set(Object value);
    void atomicUpdateUnblock(Object value, CPUState state);
    void blockIfEqual(Object testValue);
    void blockIfNotEqual(Object testValue);
    
    /** activates the ListMode: several Threads can block, all of them are awaken if the value is changed.*/
    void activateListMode();
}

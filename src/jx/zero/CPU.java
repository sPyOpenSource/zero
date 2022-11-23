package jx.zero;

public interface CPU extends Portal {
    /**
     * Save current state into oldState object
     * and load state from newState object
     * @param oldState
     * @param newState
     */
    void load(CPUState oldState, CPUState newState);

    /**
     * Save current state into state object 
     * @param state
     */
    void save(CPUState state);
    
    void dump(CPUState state);

    /** Returns the ID of the current CPU-Objec
     * @return t*/
    int getID();
    
    @Override
    String toString();
}

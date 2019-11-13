package jx.zero;

public interface VMClass {
    String getName();

    boolean isPrimitive();
    boolean equals(VMClass vmcls);

    /**
     * @return size as number of fields.
     * Each field is 32 Bits.
     */
    int getInstanceSize();

    Object newInstance();

    VMMethod[] getMethods();
}

// AID-GENERATED
// =========================================================================
// This class was generated by AID - Abstract Interface Definition          
// DO NOT MODIFY, but use the org.freehep.aid.Aid utility to regenerate it. 
// =========================================================================

// Copyright 2000-2005, FreeHEP.
package hep.graphics.heprep;

import java.util.List;


import java.util.Set;
/**
 * HepRepTypeTree interface.
 *
 * @author Mark Donszelmann
 */
public interface HepRepTypeTree extends HepRepTreeID {

    /**
     * Adds a type to this typetree.
     *
     * @param type to be added.
     */
    public void addType(HepRepType type);


    /**
     * Returns a collection of all types in this tree.
     *
     * @deprecated use getTypeList()
     * @return collection of HepRepTypes.
     */
    Set/*<HepRepType>*/ getTypes();
    /**
     * Returns a collection of all types in this tree.
     *
     * @return collection of HepRepTypes.
     */
    public List/*<HepRepType>*/ getTypeList();

    /**
     * Returns type for full type name
     * @param fullName full type name
     * @return type
     */
    public HepRepType getType(String fullName);

    /**
     * Returns a deep copy of this typetree.
     *
     * @return copy of this typetree.
     * @throws CloneNotSupportedException if copying is not possible.
     */
    public HepRepTypeTree copy() throws CloneNotSupportedException;

//          
} // class or interface

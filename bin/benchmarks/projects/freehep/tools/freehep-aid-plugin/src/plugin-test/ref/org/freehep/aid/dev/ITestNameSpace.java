// AID-GENERATED
// =========================================================================
// This class was generated by AID - Abstract Interface Definition          
// DO NOT MODIFY, but use the org.freehep.aid.Aid utility to regenerate it. 
// =========================================================================

// Copyright 2002, SLAC, Stanford University, U.S.A.
// AID - Compiler Test File
package org.freehep.aid.test.dev;

import org.freehep.aid.test.ITestInterface;
import org.freehep.aid.test.ITestPrimitives;

/**
 * TestInterface to test the aid compiler.
 *
 * @author Mark Donszelmann
 */
public interface ITestNameSpace extends ITestInterface {

    public ITestPrimitives returnPrimitives();

    public ITestNameSpace instance();
} // class or interface

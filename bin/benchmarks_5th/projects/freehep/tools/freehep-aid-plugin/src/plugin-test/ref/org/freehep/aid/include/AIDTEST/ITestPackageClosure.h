// -*- C++ -*-
// AID-GENERATED
// =========================================================================
// This class was generated by AID - Abstract Interface Definition          
// DO NOT MODIFY, but use the org.freehep.aid.Aid utility to regenerate it. 
// =========================================================================
#ifndef AIDTEST_ITESTPACKAGECLOSURE_H
#define AIDTEST_ITESTPACKAGECLOSURE_H 1

// Copyright 2002, SLAC, Stanford University, U.S.A.
// AID - Compiler Test File

#include <ios>

namespace AIDTEST {

/** @interface
 * TestInterface to test the aid compiler.
 *
 * @author Mark Donszelmann
 */
class ITestPackageClosure {

public: 
    /// Destructor.
    virtual ~ITestPackageClosure() { /* nop */; }

    /**
     * noargs method
     */
    virtual void noargs() = 0;

    /**
     * Method with different exception
     *
     * @throws IOException in case of error
     */
    virtual void commit() throw (ios::ios_base::failure)  = 0;

    /**
     * EndOfClass comment
     */
}; // class

/**
 * EndOfPackage comment
 */

} // namespace AIDTEST

/**
 * EndOfFile comment
 */
#endif /* ifndef AIDTEST_ITESTPACKAGECLOSURE_H */
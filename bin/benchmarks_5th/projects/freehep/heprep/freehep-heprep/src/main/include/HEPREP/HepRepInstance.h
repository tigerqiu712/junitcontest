// -*- C++ -*-
// AID-GENERATED
// =========================================================================
// This class was generated by AID - Abstract Interface Definition          
// DO NOT MODIFY, but use the org.freehep.aid.Aid utility to regenerate it. 
// =========================================================================
#ifndef HEPREP_HEPREPINSTANCE_H
#define HEPREP_HEPREPINSTANCE_H 1

// Copyright 2000-2005, FreeHEP.

#include <vector>

#include "HEPREP/HepRepAttribute.h"

namespace HEPREP {

class HepRepInstanceTree;
class HepRepPoint;
class HepRepSelectFilter;
class HepRepType;
class HepRepTypeTree;

/**
 * HepRepInstance interface.
 *
 * @author Mark Donszelmann
 */
class HepRepInstance : virtual public HepRepAttribute {

public: 
    /// Destructor.
    virtual ~HepRepInstance() { /* nop */; }

    /**
     * Overlays the instance on the current instance.
     *
     * Attributes of the instance override or are added to the current instance.
     * Sub-instances of the instance are added only if the current instance has no sub-instances.
     * Points of the instance are added only if the current instance has no points.
     * @param instance instance to overlay
     */
    virtual void overlay(HepRepInstance * instance) = 0;

    /**
     * Adds an sub-instance to this instance.
     *
     * @param instance sub-instance.
     */
    virtual void addInstance(HepRepInstance * instance) = 0;

    /**
     * Removes a sub-instance from this instance.
     *
     * @param instance sub-instance.
     */
    virtual void removeInstance(HepRepInstance * instance) = 0;

    /**
     * Returns a collection of all sub-instances this instance keeps.
     *
     * @return collection of HepRepInstances.
     */
    virtual std::vector<HepRepInstance *>  getInstances() = 0;

    /**
     * Returns the associated type for this instance.
     *
     * @return associated HepRepType.
     */
    virtual HepRepType * getType() = 0;

    /**
     * Adds a point to this instance.
     *
     * @param point to be added.
     */
    virtual void addPoint(HepRepPoint * point) = 0;

    /**
     * Returns a collection of all points this instance keeps.
     *
     * @return collection of HepRepPoints.
     */
    virtual std::vector<HepRepPoint *>  getPoints() = 0;

    /**
     * Fills a double[3][n] array with the coordinates of all points, if
     * none of the points have any attributes defined on them.
     * The actual number of points filled is returned. 
     * 
     * If any points have attributes, or returning a list is not possible
     * -1 is returned.
     * 
     * One could then call getPoint().
     *
     * If the number of points is larger than n, 
     * the array is filled (either with the first n points or a mix of points)
     * and -numberOfPoints is returned.
     *
     * @param xyz a double[3][n] array to be filled with points.
     * @return number of points filled in xyz, or -1 in case of error or non-implementation
     * or -number of points that were available (xyz is filled but too small). 
     *
     * ONLY in JAVA
     */
    /**
     * Returns true if this instance has a frame. Speedy access for iterator.
     * @return tue if instance should have frame
     * ONLY in JAVA
     */
    /**
     * Returns String layername. Speedy access for iterator.
     * @return layer name
     * ONLY in JAVA
     */
    /**
     * Returns the parent of this instance.
     *
     * @return parent of instance, or null if top-level.
     */
    virtual HepRepInstance * getSuperInstance() = 0;

    /**
     * Returns a deep copy of this instance.
     *
     * @param typeTree needed to find the associated type.
     * @param parent to which the copy is added.
     * @param filter run on all instances before copying.
     * @return copy of this instance.
     */
    virtual HepRepInstance * copy(HepRepTypeTree * typeTree, HepRepInstance * parent, HepRepSelectFilter * filter = NULL) = 0;

    /**
     * Returns a deep copy of this instance.
     *
     * @param typeTree needed to find the associated type.
     * @param parent to which the copy is added.
     * @param filter run on all instances before copying.
     * @return copy of this instance.
     */
    virtual HepRepInstance * copy(HepRepTypeTree * typeTree, HepRepInstanceTree * parent, HepRepSelectFilter * filter = NULL) = 0;
}; // class
} // namespace HEPREP
#endif /* ifndef HEPREP_HEPREPINSTANCE_H */
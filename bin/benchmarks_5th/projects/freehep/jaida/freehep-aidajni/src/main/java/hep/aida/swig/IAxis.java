/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.31
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package hep.aida.swig;
 
import hep.aida.jni.AIDAJNIUtil;

public class IAxis implements hep.aida.IAxis {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public IAxis(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(hep.aida.IAxis obj) {
    if (obj instanceof IAxis) {
      return (obj == null) ? 0 : ((IAxis)obj).swigCPtr;
    } else {
      long cPtr = AIDAJNI.new_IAxis();
      // FIXME, memory leak if Java class gets finalized, since C++ director is not freed.
      AIDAJNI.IAxis_director_connect(obj, cPtr, true, true);
      return cPtr;
    }
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if(swigCPtr != 0 && swigCMemOwn) {
      swigCMemOwn = false;
      AIDAJNI.delete_IAxis(swigCPtr);
    }
    swigCPtr = 0;
  }

  protected void swigDirectorDisconnect() {
    swigCMemOwn = false;
    delete();
  }

  public void swigReleaseOwnership() {
    swigCMemOwn = false;
    AIDAJNI.IAxis_change_ownership(this, swigCPtr, false);
  }

  public void swigTakeOwnership() {
    swigCMemOwn = true;
    AIDAJNI.IAxis_change_ownership(this, swigCPtr, true);
  }

  public boolean isFixedBinning() {
    return AIDAJNI.IAxis_isFixedBinning(swigCPtr, this);
  }

  public double lowerEdge() {
    return AIDAJNI.IAxis_lowerEdge(swigCPtr, this);
  }

  public double upperEdge() {
    return AIDAJNI.IAxis_upperEdge(swigCPtr, this);
  }

  public int bins() {
    return AIDAJNI.IAxis_bins(swigCPtr, this);
  }

  public double binLowerEdge(int index) {
    return AIDAJNI.IAxis_binLowerEdge(swigCPtr, this, index);
  }

  public double binUpperEdge(int index) {
    return AIDAJNI.IAxis_binUpperEdge(swigCPtr, this, index);
  }

  public double binWidth(int index) {
    return AIDAJNI.IAxis_binWidth(swigCPtr, this, index);
  }

  public int coordToIndex(double coord) {
    return AIDAJNI.IAxis_coordToIndex(swigCPtr, this, coord);
  }

  public IAxis() {
    this(AIDAJNI.new_IAxis(), true);
    AIDAJNI.IAxis_director_connect(this, swigCPtr, swigCMemOwn, true);
  }

  public final static int UNDERFLOW_BIN = AIDAJNI.IAxis_UNDERFLOW_BIN_get();
  public final static int OVERFLOW_BIN = AIDAJNI.IAxis_OVERFLOW_BIN_get();

}
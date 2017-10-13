/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.31
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package hep.aida.swig;
 
import hep.aida.jni.AIDAJNIUtil;

public class ITupleFactory implements hep.aida.ITupleFactory {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public ITupleFactory(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(hep.aida.ITupleFactory obj) {
    if (obj instanceof ITupleFactory) {
      return (obj == null) ? 0 : ((ITupleFactory)obj).swigCPtr;
    } else {
      long cPtr = AIDAJNI.new_ITupleFactory();
      // FIXME, memory leak if Java class gets finalized, since C++ director is not freed.
      AIDAJNI.ITupleFactory_director_connect(obj, cPtr, true, true);
      return cPtr;
    }
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if(swigCPtr != 0 && swigCMemOwn) {
      swigCMemOwn = false;
      AIDAJNI.delete_ITupleFactory(swigCPtr);
    }
    swigCPtr = 0;
  }

  protected void swigDirectorDisconnect() {
    swigCMemOwn = false;
    delete();
  }

  public void swigReleaseOwnership() {
    swigCMemOwn = false;
    AIDAJNI.ITupleFactory_change_ownership(this, swigCPtr, false);
  }

  public void swigTakeOwnership() {
    swigCMemOwn = true;
    AIDAJNI.ITupleFactory_change_ownership(this, swigCPtr, true);
  }

  public hep.aida.ITuple create(String path, String title, String[] columnNames, Class[] columnType, String options) {
    long cPtr = AIDAJNI.ITupleFactory_create__SWIG_0(swigCPtr, this, path, title, AIDAJNIUtil.toPtr(columnNames), AIDAJNIUtil.toPtr(columnType), options);
    return (cPtr == 0) ? null : new ITuple(cPtr, false);
  }

  public hep.aida.ITuple create(String path, String title, String[] columnNames, Class[] columnType) {
    long cPtr = AIDAJNI.ITupleFactory_create__SWIG_1(swigCPtr, this, path, title, AIDAJNIUtil.toPtr(columnNames), AIDAJNIUtil.toPtr(columnType));
    return (cPtr == 0) ? null : new ITuple(cPtr, false);
  }

  public hep.aida.ITuple create(String path, String title, String columns, String options) {
    long cPtr = AIDAJNI.ITupleFactory_create__SWIG_2(swigCPtr, this, path, title, columns, options);
    return (cPtr == 0) ? null : new ITuple(cPtr, false);
  }

  public hep.aida.ITuple create(String path, String title, String columns) {
    long cPtr = AIDAJNI.ITupleFactory_create__SWIG_3(swigCPtr, this, path, title, columns);
    return (cPtr == 0) ? null : new ITuple(cPtr, false);
  }

  public hep.aida.ITuple createChained(String path, String title, hep.aida.ITuple[] set) {
    long cPtr = AIDAJNI.ITupleFactory_createChained__SWIG_0(swigCPtr, this, path, title, AIDAJNIUtil.toPtr(set));
    return (cPtr == 0) ? null : new ITuple(cPtr, false);
  }

  public hep.aida.ITuple createChained(String path, String title, String[] set) {
    long cPtr = AIDAJNI.ITupleFactory_createChained__SWIG_1(swigCPtr, this, path, title, AIDAJNIUtil.toPtr(set));
    return (cPtr == 0) ? null : new ITuple(cPtr, false);
  }

  public hep.aida.ITuple createFiltered(String path, hep.aida.ITuple tuple, hep.aida.IFilter filter) {
    long cPtr = AIDAJNI.ITupleFactory_createFiltered__SWIG_0(swigCPtr, this, path, ITuple.getCPtr(tuple), (hep.aida.ITuple)tuple, IFilter.getCPtr(filter), (hep.aida.IFilter)filter);
    return (cPtr == 0) ? null : new ITuple(cPtr, false);
  }

  public hep.aida.ITuple createFiltered(String path, hep.aida.ITuple tuple, hep.aida.IFilter filter, String[] columns) {
    long cPtr = AIDAJNI.ITupleFactory_createFiltered__SWIG_1(swigCPtr, this, path, ITuple.getCPtr(tuple), (hep.aida.ITuple)tuple, IFilter.getCPtr(filter), (hep.aida.IFilter)filter, AIDAJNIUtil.toPtr(columns));
    return (cPtr == 0) ? null : new ITuple(cPtr, false);
  }

  public hep.aida.IFilter createFilter(String expression) {
    long cPtr = AIDAJNI.ITupleFactory_createFilter__SWIG_0(swigCPtr, this, expression);
    return (cPtr == 0) ? null : new IFilter(cPtr, false);
  }

  public hep.aida.IFilter createFilter(String expression, int rowsToProcess, int startingRow) {
    long cPtr = AIDAJNI.ITupleFactory_createFilter__SWIG_1(swigCPtr, this, expression, rowsToProcess, startingRow);
    return (cPtr == 0) ? null : new IFilter(cPtr, false);
  }

  public hep.aida.IFilter createFilter(String expression, int rowsToProcess) {
    long cPtr = AIDAJNI.ITupleFactory_createFilter__SWIG_2(swigCPtr, this, expression, rowsToProcess);
    return (cPtr == 0) ? null : new IFilter(cPtr, false);
  }

  public hep.aida.IEvaluator createEvaluator(String expression) {
    long cPtr = AIDAJNI.ITupleFactory_createEvaluator(swigCPtr, this, expression);
    return (cPtr == 0) ? null : new IEvaluator(cPtr, false);
  }

  public ITupleFactory() {
    this(AIDAJNI.new_ITupleFactory(), true);
    AIDAJNI.ITupleFactory_director_connect(this, swigCPtr, swigCMemOwn, true);
  }

}
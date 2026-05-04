package org.mozilla.javascript;

import ix.l1;
import java.util.Iterator;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class NativeIterator extends IdScriptableObject {
    public static final String ITERATOR_PROPERTY_NAME = "__iterator__";
    private static final Object ITERATOR_TAG = "Iterator";
    private static final int Id___iterator__ = 3;
    private static final int Id_constructor = 1;
    private static final int Id_next = 2;
    private static final int MAX_PROTOTYPE_ID = 3;
    private static final String STOP_ITERATION = "StopIteration";
    private static final long serialVersionUID = -4136968203581667681L;
    private Object objectIterator;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class StopIteration extends NativeObject {
        private static final long serialVersionUID = 2485151085722377663L;

        @Override // org.mozilla.javascript.NativeObject, org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.Scriptable
        public String getClassName() {
            return NativeIterator.STOP_ITERATION;
        }

        @Override // org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.Scriptable
        public boolean hasInstance(Scriptable scriptable) {
            return scriptable instanceof StopIteration;
        }
    }

    private NativeIterator() {
    }

    public static Object getStopIterationObject(Scriptable scriptable) {
        return ScriptableObject.getTopScopeValue(ScriptableObject.getTopLevelScope(scriptable), ITERATOR_TAG);
    }

    public static void init(ScriptableObject scriptableObject, boolean z11) {
        new NativeIterator().exportAsJSClass(3, scriptableObject, z11);
        NativeGenerator.init(scriptableObject, z11);
        StopIteration stopIteration = new StopIteration();
        stopIteration.setPrototype(ScriptableObject.getObjectPrototype(scriptableObject));
        stopIteration.setParentScope(scriptableObject);
        if (z11) {
            stopIteration.sealObject();
        }
        ScriptableObject.defineProperty(scriptableObject, STOP_ITERATION, stopIteration, 2);
        scriptableObject.associateValue(ITERATOR_TAG, stopIteration);
    }

    private static Object jsConstructor(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Object obj;
        boolean z11 = false;
        if (objArr.length == 0 || (obj = objArr[0]) == null || obj == Undefined.instance) {
            throw ScriptRuntime.typeError1("msg.no.properties", ScriptRuntime.toString(objArr.length == 0 ? Undefined.instance : objArr[0]));
        }
        Scriptable object = ScriptRuntime.toObject(scriptable, obj);
        if (objArr.length > 1 && ScriptRuntime.toBoolean(objArr[1])) {
            z11 = true;
        }
        if (scriptable2 != null) {
            Iterator<?> javaIterator = VMBridge.instance.getJavaIterator(context, scriptable, object);
            if (javaIterator != null) {
                Scriptable topLevelScope = ScriptableObject.getTopLevelScope(scriptable);
                return context.getWrapFactory().wrap(context, topLevelScope, new WrappedJavaIterator(javaIterator, topLevelScope), WrappedJavaIterator.class);
            }
            Scriptable iterator = ScriptRuntime.toIterator(context, scriptable, object, z11);
            if (iterator != null) {
                return iterator;
            }
        }
        Object enumInit = ScriptRuntime.enumInit(object, context, z11 ? 3 : 5);
        ScriptRuntime.setEnumNumbers(enumInit, true);
        NativeIterator nativeIterator = new NativeIterator(enumInit);
        nativeIterator.setPrototype(ScriptableObject.getClassPrototype(scriptable, nativeIterator.getClassName()));
        nativeIterator.setParentScope(scriptable);
        return nativeIterator;
    }

    private Object next(Context context, Scriptable scriptable) {
        if (ScriptRuntime.enumNext(this.objectIterator).booleanValue()) {
            return ScriptRuntime.enumId(this.objectIterator, context);
        }
        throw new JavaScriptException(getStopIterationObject(scriptable), null, 0);
    }

    @Override // org.mozilla.javascript.IdScriptableObject, org.mozilla.javascript.IdFunctionCall
    public Object execIdCall(IdFunctionObject idFunctionObject, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        if (!idFunctionObject.hasTag(ITERATOR_TAG)) {
            return super.execIdCall(idFunctionObject, context, scriptable, scriptable2, objArr);
        }
        int methodId = idFunctionObject.methodId();
        if (methodId == 1) {
            return jsConstructor(context, scriptable, scriptable2, objArr);
        }
        if (!(scriptable2 instanceof NativeIterator)) {
            throw IdScriptableObject.incompatibleCallError(idFunctionObject);
        }
        NativeIterator nativeIterator = (NativeIterator) scriptable2;
        if (methodId == 2) {
            return nativeIterator.next(context, scriptable);
        }
        if (methodId == 3) {
            return scriptable2;
        }
        throw new IllegalArgumentException(String.valueOf(methodId));
    }

    @Override // org.mozilla.javascript.IdScriptableObject
    public int findPrototypeId(String str) {
        String str2;
        int i11;
        int length = str.length();
        if (length == 4) {
            str2 = l1.b.f62938h;
            i11 = 2;
        } else if (length == 11) {
            str2 = "constructor";
            i11 = 1;
        } else if (length == 12) {
            str2 = ITERATOR_PROPERTY_NAME;
            i11 = 3;
        } else {
            str2 = null;
            i11 = 0;
        }
        if (str2 == null || str2 == str || str2.equals(str)) {
            return i11;
        }
        return 0;
    }

    @Override // org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.Scriptable
    public String getClassName() {
        return "Iterator";
    }

    @Override // org.mozilla.javascript.IdScriptableObject
    public void initPrototypeId(int i11) {
        String str;
        String str2;
        int i12 = 2;
        int i13 = 1;
        if (i11 == 1) {
            str = "constructor";
        } else {
            if (i11 != 2) {
                if (i11 != 3) {
                    throw new IllegalArgumentException(String.valueOf(i11));
                }
                str2 = ITERATOR_PROPERTY_NAME;
                initPrototypeMethod(ITERATOR_TAG, i11, str2, i13);
            }
            i12 = 0;
            str = l1.b.f62938h;
        }
        String str3 = str;
        i13 = i12;
        str2 = str3;
        initPrototypeMethod(ITERATOR_TAG, i11, str2, i13);
    }

    private NativeIterator(Object obj) {
        this.objectIterator = obj;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class WrappedJavaIterator {
        private Iterator<?> iterator;
        private Scriptable scope;

        public WrappedJavaIterator(Iterator<?> it, Scriptable scriptable) {
            this.iterator = it;
            this.scope = scriptable;
        }

        public Object next() {
            if (this.iterator.hasNext()) {
                return this.iterator.next();
            }
            throw new JavaScriptException(NativeIterator.getStopIterationObject(this.scope), null, 0);
        }

        public Object __iterator__(boolean z11) {
            return this;
        }
    }
}

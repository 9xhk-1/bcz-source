package org.mozilla.javascript;

import androidx.collection.SieveCacheKt;
import com.igexin.push.config.c;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import org.mozilla.javascript.TopLevel;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class NativeArray extends IdScriptableObject implements List {
    private static final int ConstructorId_concat = -13;
    private static final int ConstructorId_every = -17;
    private static final int ConstructorId_filter = -18;
    private static final int ConstructorId_forEach = -19;
    private static final int ConstructorId_indexOf = -15;
    private static final int ConstructorId_isArray = -24;
    private static final int ConstructorId_join = -5;
    private static final int ConstructorId_lastIndexOf = -16;
    private static final int ConstructorId_map = -20;
    private static final int ConstructorId_pop = -9;
    private static final int ConstructorId_push = -8;
    private static final int ConstructorId_reduce = -22;
    private static final int ConstructorId_reduceRight = -23;
    private static final int ConstructorId_reverse = -6;
    private static final int ConstructorId_shift = -10;
    private static final int ConstructorId_slice = -14;
    private static final int ConstructorId_some = -21;
    private static final int ConstructorId_sort = -7;
    private static final int ConstructorId_splice = -12;
    private static final int ConstructorId_unshift = -11;
    private static final int DEFAULT_INITIAL_CAPACITY = 10;
    private static final double GROW_FACTOR = 1.5d;
    private static final int Id_concat = 13;
    private static final int Id_constructor = 1;
    private static final int Id_every = 17;
    private static final int Id_filter = 18;
    private static final int Id_forEach = 19;
    private static final int Id_indexOf = 15;
    private static final int Id_join = 5;
    private static final int Id_lastIndexOf = 16;
    private static final int Id_length = 1;
    private static final int Id_map = 20;
    private static final int Id_pop = 9;
    private static final int Id_push = 8;
    private static final int Id_reduce = 22;
    private static final int Id_reduceRight = 23;
    private static final int Id_reverse = 6;
    private static final int Id_shift = 10;
    private static final int Id_slice = 14;
    private static final int Id_some = 21;
    private static final int Id_sort = 7;
    private static final int Id_splice = 12;
    private static final int Id_toLocaleString = 3;
    private static final int Id_toSource = 4;
    private static final int Id_toString = 2;
    private static final int Id_unshift = 11;
    private static final int MAX_INSTANCE_ID = 1;
    private static final int MAX_PRE_GROW_SIZE = 1431655764;
    private static final int MAX_PROTOTYPE_ID = 23;
    static final long serialVersionUID = 7331366857676127338L;
    private Object[] dense;
    private boolean denseOnly;
    private long length;
    private int lengthAttr;
    private static final Object ARRAY_TAG = "Array";
    private static final Integer NEGATIVE_ONE = -1;
    private static int maximumInitialCapacity = 10000;

    public NativeArray(long j11) {
        this.lengthAttr = 6;
        boolean z11 = j11 <= ((long) maximumInitialCapacity);
        this.denseOnly = z11;
        if (z11) {
            int i11 = (int) j11;
            Object[] objArr = new Object[i11 < 10 ? 10 : i11];
            this.dense = objArr;
            Arrays.fill(objArr, Scriptable.NOT_FOUND);
        }
        this.length = j11;
    }

    private ScriptableObject defaultIndexPropertyDescriptor(Object obj) {
        Scriptable parentScope = getParentScope();
        if (parentScope == null) {
            parentScope = this;
        }
        NativeObject nativeObject = new NativeObject();
        ScriptRuntime.setBuiltinProtoAndParent(nativeObject, parentScope, TopLevel.Builtins.Object);
        nativeObject.defineProperty("value", obj, 0);
        Boolean bool = Boolean.TRUE;
        nativeObject.defineProperty("writable", bool, 0);
        nativeObject.defineProperty("enumerable", bool, 0);
        nativeObject.defineProperty("configurable", bool, 0);
        return nativeObject;
    }

    private static void deleteElem(Scriptable scriptable, long j11) {
        int i11 = (int) j11;
        if (i11 == j11) {
            scriptable.delete(i11);
        } else {
            scriptable.delete(Long.toString(j11));
        }
    }

    private boolean ensureCapacity(int i11) {
        if (i11 <= this.dense.length) {
            return true;
        }
        if (i11 > MAX_PRE_GROW_SIZE) {
            this.denseOnly = false;
            return false;
        }
        int max = Math.max(i11, (int) (r0.length * GROW_FACTOR));
        Object[] objArr = new Object[max];
        Object[] objArr2 = this.dense;
        System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
        Arrays.fill(objArr, this.dense.length, max, Scriptable.NOT_FOUND);
        this.dense = objArr;
        return true;
    }

    private static Object getElem(Context context, Scriptable scriptable, long j11) {
        return j11 > SieveCacheKt.NodeLinkMask ? ScriptRuntime.getObjectProp(scriptable, Long.toString(j11), context) : ScriptRuntime.getObjectIndex(scriptable, (int) j11, context);
    }

    public static long getLengthProperty(Context context, Scriptable scriptable) {
        return scriptable instanceof NativeString ? ((NativeString) scriptable).getLength() : scriptable instanceof NativeArray ? ((NativeArray) scriptable).getLength() : ScriptRuntime.toUint32(ScriptRuntime.getObjectProp(scriptable, "length", context));
    }

    public static int getMaximumInitialCapacity() {
        return maximumInitialCapacity;
    }

    private static Object getRawElem(Scriptable scriptable, long j11) {
        return j11 > SieveCacheKt.NodeLinkMask ? ScriptableObject.getProperty(scriptable, Long.toString(j11)) : ScriptableObject.getProperty(scriptable, (int) j11);
    }

    private Object indexOfHelper(Context context, Scriptable scriptable, Object[] objArr, boolean z11) {
        long integer;
        Object obj = objArr.length > 0 ? objArr[0] : Undefined.instance;
        long lengthProperty = getLengthProperty(context, scriptable);
        if (z11) {
            if (objArr.length < 2) {
                integer = lengthProperty - 1;
            } else {
                integer = (long) ScriptRuntime.toInteger(objArr[1]);
                if (integer >= lengthProperty) {
                    integer = lengthProperty - 1;
                } else if (integer < 0) {
                    integer += lengthProperty;
                }
                if (integer < 0) {
                    return NEGATIVE_ONE;
                }
            }
        } else if (objArr.length < 2) {
            integer = 0;
        } else {
            integer = (long) ScriptRuntime.toInteger(objArr[1]);
            if (integer < 0) {
                integer += lengthProperty;
                if (integer < 0) {
                    integer = 0;
                }
            }
            if (integer > lengthProperty - 1) {
                return NEGATIVE_ONE;
            }
        }
        if (scriptable instanceof NativeArray) {
            NativeArray nativeArray = (NativeArray) scriptable;
            if (nativeArray.denseOnly) {
                if (!z11) {
                    int i11 = (int) integer;
                    while (true) {
                        long j11 = i11;
                        if (j11 >= lengthProperty) {
                            break;
                        }
                        Object obj2 = nativeArray.dense[i11];
                        if (obj2 != Scriptable.NOT_FOUND && ScriptRuntime.shallowEq(obj2, obj)) {
                            return Long.valueOf(j11);
                        }
                        i11++;
                    }
                } else {
                    for (int i12 = (int) integer; i12 >= 0; i12--) {
                        Object obj3 = nativeArray.dense[i12];
                        if (obj3 != Scriptable.NOT_FOUND && ScriptRuntime.shallowEq(obj3, obj)) {
                            return Long.valueOf(i12);
                        }
                    }
                }
                return NEGATIVE_ONE;
            }
        }
        if (z11) {
            while (integer >= 0) {
                Object rawElem = getRawElem(scriptable, integer);
                if (rawElem != Scriptable.NOT_FOUND && ScriptRuntime.shallowEq(rawElem, obj)) {
                    return Long.valueOf(integer);
                }
                integer--;
            }
        } else {
            while (integer < lengthProperty) {
                Object rawElem2 = getRawElem(scriptable, integer);
                if (rawElem2 != Scriptable.NOT_FOUND && ScriptRuntime.shallowEq(rawElem2, obj)) {
                    return Long.valueOf(integer);
                }
                integer++;
            }
        }
        return NEGATIVE_ONE;
    }

    public static void init(Scriptable scriptable, boolean z11) {
        new NativeArray(0L).exportAsJSClass(23, scriptable, z11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x008a, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.Object iterativeMethod(org.mozilla.javascript.Context r21, int r22, org.mozilla.javascript.Scriptable r23, org.mozilla.javascript.Scriptable r24, java.lang.Object[] r25) {
        /*
            r20 = this;
            r0 = r21
            r1 = r22
            r2 = r23
            r3 = r24
            r4 = r25
            int r5 = r4.length
            r6 = 0
            if (r5 <= 0) goto L11
            r5 = r4[r6]
            goto L13
        L11:
            java.lang.Object r5 = org.mozilla.javascript.Undefined.instance
        L13:
            if (r5 == 0) goto L9a
            boolean r7 = r5 instanceof org.mozilla.javascript.Function
            if (r7 == 0) goto L9a
            org.mozilla.javascript.Function r5 = (org.mozilla.javascript.Function) r5
            org.mozilla.javascript.Scriptable r7 = org.mozilla.javascript.ScriptableObject.getTopLevelScope(r5)
            int r8 = r4.length
            r9 = 2
            if (r8 < r9) goto L32
            r8 = 1
            r4 = r4[r8]
            if (r4 == 0) goto L32
            java.lang.Object r8 = org.mozilla.javascript.Undefined.instance
            if (r4 != r8) goto L2d
            goto L32
        L2d:
            org.mozilla.javascript.Scriptable r4 = org.mozilla.javascript.ScriptRuntime.toObject(r0, r2, r4)
            goto L33
        L32:
            r4 = r7
        L33:
            long r8 = getLengthProperty(r0, r3)
            r10 = 20
            if (r1 != r10) goto L3d
            int r10 = (int) r8
            goto L3e
        L3d:
            r10 = r6
        L3e:
            org.mozilla.javascript.Scriptable r2 = r0.newArray(r2, r10)
            r10 = 0
            r12 = r10
        L45:
            int r14 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r14 >= 0) goto L8d
            java.lang.Object r14 = getRawElem(r3, r10)
            java.lang.Object r15 = org.mozilla.javascript.Scriptable.NOT_FOUND
            r16 = 1
            if (r14 != r15) goto L54
            goto L8a
        L54:
            java.lang.Long r15 = java.lang.Long.valueOf(r10)
            java.lang.Object[] r14 = new java.lang.Object[]{r14, r15, r3}
            java.lang.Object r15 = r5.call(r0, r7, r4, r14)
            switch(r1) {
                case 17: goto L81;
                case 18: goto L71;
                case 19: goto L63;
                case 20: goto L6d;
                case 21: goto L64;
                default: goto L63;
            }
        L63:
            goto L8a
        L64:
            boolean r14 = org.mozilla.javascript.ScriptRuntime.toBoolean(r15)
            if (r14 == 0) goto L8a
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            return r0
        L6d:
            setElem(r0, r2, r10, r15)
            goto L8a
        L71:
            boolean r15 = org.mozilla.javascript.ScriptRuntime.toBoolean(r15)
            if (r15 == 0) goto L8a
            long r18 = r12 + r16
            r14 = r14[r6]
            setElem(r0, r2, r12, r14)
            r12 = r18
            goto L8a
        L81:
            boolean r14 = org.mozilla.javascript.ScriptRuntime.toBoolean(r15)
            if (r14 != 0) goto L8a
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            return r0
        L8a:
            long r10 = r10 + r16
            goto L45
        L8d:
            switch(r1) {
                case 17: goto L97;
                case 18: goto L96;
                case 19: goto L90;
                case 20: goto L96;
                case 21: goto L93;
                default: goto L90;
            }
        L90:
            java.lang.Object r0 = org.mozilla.javascript.Undefined.instance
            return r0
        L93:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            return r0
        L96:
            return r2
        L97:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            return r0
        L9a:
            java.lang.RuntimeException r0 = org.mozilla.javascript.ScriptRuntime.notFunctionError(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mozilla.javascript.NativeArray.iterativeMethod(org.mozilla.javascript.Context, int, org.mozilla.javascript.Scriptable, org.mozilla.javascript.Scriptable, java.lang.Object[]):java.lang.Object");
    }

    private static Object jsConstructor(Context context, Scriptable scriptable, Object[] objArr) {
        if (objArr.length == 0) {
            return new NativeArray(0L);
        }
        if (context.getLanguageVersion() == 120) {
            return new NativeArray(objArr);
        }
        Object obj = objArr[0];
        if (objArr.length > 1 || !(obj instanceof Number)) {
            return new NativeArray(objArr);
        }
        long uint32 = ScriptRuntime.toUint32(obj);
        if (uint32 == ((Number) obj).doubleValue()) {
            return new NativeArray(uint32);
        }
        throw ScriptRuntime.constructError("RangeError", ScriptRuntime.getMessage0("msg.arraylength.bad"));
    }

    private static Scriptable js_concat(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        long j11;
        long j12;
        Scriptable topLevelScope = ScriptableObject.getTopLevelScope(scriptable);
        Function existingCtor = ScriptRuntime.getExistingCtor(context, topLevelScope, "Array");
        Scriptable construct = existingCtor.construct(context, topLevelScope, ScriptRuntime.emptyArgs);
        int i11 = 0;
        if ((scriptable2 instanceof NativeArray) && (construct instanceof NativeArray)) {
            NativeArray nativeArray = (NativeArray) scriptable2;
            NativeArray nativeArray2 = (NativeArray) construct;
            if (nativeArray.denseOnly && nativeArray2.denseOnly) {
                int i12 = (int) nativeArray.length;
                boolean z11 = true;
                for (int i13 = 0; i13 < objArr.length && z11; i13++) {
                    Object obj = objArr[i13];
                    if (obj instanceof NativeArray) {
                        NativeArray nativeArray3 = (NativeArray) obj;
                        z11 = nativeArray3.denseOnly;
                        i12 = (int) (i12 + nativeArray3.length);
                    } else {
                        i12++;
                    }
                }
                if (z11 && nativeArray2.ensureCapacity(i12)) {
                    System.arraycopy(nativeArray.dense, 0, nativeArray2.dense, 0, (int) nativeArray.length);
                    int i14 = (int) nativeArray.length;
                    for (int i15 = 0; i15 < objArr.length && z11; i15++) {
                        Object obj2 = objArr[i15];
                        if (obj2 instanceof NativeArray) {
                            NativeArray nativeArray4 = (NativeArray) obj2;
                            System.arraycopy(nativeArray4.dense, 0, nativeArray2.dense, i14, (int) nativeArray4.length);
                            i14 += (int) nativeArray4.length;
                        } else {
                            nativeArray2.dense[i14] = obj2;
                            i14++;
                        }
                    }
                    nativeArray2.length = i12;
                    return construct;
                }
            }
        }
        long j13 = 0;
        long j14 = 1;
        if (ScriptRuntime.instanceOf(scriptable2, existingCtor, context)) {
            long lengthProperty = getLengthProperty(context, scriptable2);
            j11 = 0;
            while (j11 < lengthProperty) {
                Object rawElem = getRawElem(scriptable2, j11);
                if (rawElem != Scriptable.NOT_FOUND) {
                    setElem(context, construct, j11, rawElem);
                }
                j11++;
            }
        } else {
            setElem(context, construct, 0L, scriptable2);
            j11 = 1;
        }
        while (i11 < objArr.length) {
            if (ScriptRuntime.instanceOf(objArr[i11], existingCtor, context)) {
                Scriptable scriptable3 = (Scriptable) objArr[i11];
                long lengthProperty2 = getLengthProperty(context, scriptable3);
                while (j13 < lengthProperty2) {
                    Object rawElem2 = getRawElem(scriptable3, j13);
                    long j15 = j14;
                    if (rawElem2 != Scriptable.NOT_FOUND) {
                        setElem(context, construct, j11, rawElem2);
                    }
                    j13 += j15;
                    j11 += j15;
                    j14 = j15;
                }
                j12 = j14;
            } else {
                j12 = j14;
                setElem(context, construct, j11, objArr[i11]);
                j11 += j12;
            }
            i11++;
            j14 = j12;
            j13 = 0;
        }
        setLengthProperty(context, construct, j11);
        return construct;
    }

    private static String js_join(Context context, Scriptable scriptable, Object[] objArr) {
        Object obj;
        Object obj2;
        long lengthProperty = getLengthProperty(context, scriptable);
        int i11 = (int) lengthProperty;
        if (lengthProperty != i11) {
            throw Context.reportRuntimeError1("msg.arraylength.too.big", String.valueOf(lengthProperty));
        }
        int i12 = 0;
        String scriptRuntime = (objArr.length < 1 || (obj2 = objArr[0]) == Undefined.instance) ? "," : ScriptRuntime.toString(obj2);
        if (scriptable instanceof NativeArray) {
            NativeArray nativeArray = (NativeArray) scriptable;
            if (nativeArray.denseOnly) {
                StringBuilder sb2 = new StringBuilder();
                while (i12 < i11) {
                    if (i12 != 0) {
                        sb2.append(scriptRuntime);
                    }
                    Object[] objArr2 = nativeArray.dense;
                    if (i12 < objArr2.length && (obj = objArr2[i12]) != null && obj != Undefined.instance && obj != Scriptable.NOT_FOUND) {
                        sb2.append(ScriptRuntime.toString(obj));
                    }
                    i12++;
                }
                return sb2.toString();
            }
        }
        if (i11 == 0) {
            return "";
        }
        String[] strArr = new String[i11];
        int i13 = 0;
        for (int i14 = 0; i14 != i11; i14++) {
            Object elem = getElem(context, scriptable, i14);
            if (elem != null && elem != Undefined.instance) {
                String scriptRuntime2 = ScriptRuntime.toString(elem);
                i13 += scriptRuntime2.length();
                strArr[i14] = scriptRuntime2;
            }
        }
        StringBuilder sb3 = new StringBuilder(i13 + ((i11 - 1) * scriptRuntime.length()));
        while (i12 != i11) {
            if (i12 != 0) {
                sb3.append(scriptRuntime);
            }
            String str = strArr[i12];
            if (str != null) {
                sb3.append(str);
            }
            i12++;
        }
        return sb3.toString();
    }

    private static Object js_pop(Context context, Scriptable scriptable, Object[] objArr) {
        Object obj;
        if (scriptable instanceof NativeArray) {
            NativeArray nativeArray = (NativeArray) scriptable;
            if (nativeArray.denseOnly) {
                long j11 = nativeArray.length;
                if (j11 > 0) {
                    long j12 = j11 - 1;
                    nativeArray.length = j12;
                    Object[] objArr2 = nativeArray.dense;
                    Object obj2 = objArr2[(int) j12];
                    objArr2[(int) j12] = Scriptable.NOT_FOUND;
                    return obj2;
                }
            }
        }
        long lengthProperty = getLengthProperty(context, scriptable);
        if (lengthProperty > 0) {
            lengthProperty--;
            obj = getElem(context, scriptable, lengthProperty);
        } else {
            obj = Undefined.instance;
        }
        setLengthProperty(context, scriptable, lengthProperty);
        return obj;
    }

    private static Object js_push(Context context, Scriptable scriptable, Object[] objArr) {
        int i11 = 0;
        if (scriptable instanceof NativeArray) {
            NativeArray nativeArray = (NativeArray) scriptable;
            if (nativeArray.denseOnly && nativeArray.ensureCapacity(((int) nativeArray.length) + objArr.length)) {
                while (i11 < objArr.length) {
                    Object[] objArr2 = nativeArray.dense;
                    long j11 = nativeArray.length;
                    nativeArray.length = 1 + j11;
                    objArr2[(int) j11] = objArr[i11];
                    i11++;
                }
                return ScriptRuntime.wrapNumber(nativeArray.length);
            }
        }
        long lengthProperty = getLengthProperty(context, scriptable);
        while (i11 < objArr.length) {
            setElem(context, scriptable, i11 + lengthProperty, objArr[i11]);
            i11++;
        }
        return context.getLanguageVersion() == 120 ? objArr.length == 0 ? Undefined.instance : objArr[objArr.length - 1] : setLengthProperty(context, scriptable, lengthProperty + objArr.length);
    }

    private static Scriptable js_reverse(Context context, Scriptable scriptable, Object[] objArr) {
        if (scriptable instanceof NativeArray) {
            NativeArray nativeArray = (NativeArray) scriptable;
            if (nativeArray.denseOnly) {
                int i11 = 0;
                for (int i12 = ((int) nativeArray.length) - 1; i11 < i12; i12--) {
                    Object[] objArr2 = nativeArray.dense;
                    Object obj = objArr2[i11];
                    objArr2[i11] = objArr2[i12];
                    objArr2[i12] = obj;
                    i11++;
                }
                return scriptable;
            }
        }
        long lengthProperty = getLengthProperty(context, scriptable);
        long j11 = lengthProperty / 2;
        for (long j12 = 0; j12 < j11; j12++) {
            long j13 = (lengthProperty - j12) - 1;
            Object rawElem = getRawElem(scriptable, j12);
            setRawElem(context, scriptable, j12, getRawElem(scriptable, j13));
            setRawElem(context, scriptable, j13, rawElem);
        }
        return scriptable;
    }

    private static Object js_shift(Context context, Scriptable scriptable, Object[] objArr) {
        Object obj;
        if (scriptable instanceof NativeArray) {
            NativeArray nativeArray = (NativeArray) scriptable;
            if (nativeArray.denseOnly) {
                long j11 = nativeArray.length;
                if (j11 > 0) {
                    long j12 = j11 - 1;
                    nativeArray.length = j12;
                    Object[] objArr2 = nativeArray.dense;
                    Object obj2 = objArr2[0];
                    System.arraycopy(objArr2, 1, objArr2, 0, (int) j12);
                    Object[] objArr3 = nativeArray.dense;
                    int i11 = (int) nativeArray.length;
                    Object obj3 = Scriptable.NOT_FOUND;
                    objArr3[i11] = obj3;
                    return obj2 == obj3 ? Undefined.instance : obj2;
                }
            }
        }
        long lengthProperty = getLengthProperty(context, scriptable);
        if (lengthProperty > 0) {
            lengthProperty--;
            obj = getElem(context, scriptable, 0L);
            if (lengthProperty > 0) {
                for (long j13 = 1; j13 <= lengthProperty; j13++) {
                    setRawElem(context, scriptable, j13 - 1, getRawElem(scriptable, j13));
                }
            }
        } else {
            obj = Undefined.instance;
        }
        setLengthProperty(context, scriptable, lengthProperty);
        return obj;
    }

    private Scriptable js_slice(Context context, Scriptable scriptable, Object[] objArr) {
        long sliceIndex;
        Scriptable newArray = context.newArray(ScriptableObject.getTopLevelScope(this), 0);
        long lengthProperty = getLengthProperty(context, scriptable);
        if (objArr.length == 0) {
            sliceIndex = 0;
        } else {
            sliceIndex = toSliceIndex(ScriptRuntime.toInteger(objArr[0]), lengthProperty);
            if (objArr.length != 1) {
                lengthProperty = toSliceIndex(ScriptRuntime.toInteger(objArr[1]), lengthProperty);
            }
        }
        for (long j11 = sliceIndex; j11 < lengthProperty; j11++) {
            Object rawElem = getRawElem(scriptable, j11);
            if (rawElem != Scriptable.NOT_FOUND) {
                setElem(context, newArray, j11 - sliceIndex, rawElem);
            }
        }
        setLengthProperty(context, newArray, Math.max(0L, lengthProperty - sliceIndex));
        return newArray;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003c A[LOOP:1: B:11:0x003a->B:12:0x003c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d A[LOOP:0: B:7:0x002b->B:8:0x002d, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static org.mozilla.javascript.Scriptable js_sort(org.mozilla.javascript.Context r8, final org.mozilla.javascript.Scriptable r9, org.mozilla.javascript.Scriptable r10, java.lang.Object[] r11) {
        /*
            int r0 = r11.length
            r1 = 0
            if (r0 <= 0) goto L1d
            java.lang.Object r0 = org.mozilla.javascript.Undefined.instance
            r11 = r11[r1]
            if (r0 == r11) goto L1d
            org.mozilla.javascript.Callable r4 = org.mozilla.javascript.ScriptRuntime.getValueFunctionAndThis(r11, r8)
            org.mozilla.javascript.Scriptable r7 = org.mozilla.javascript.ScriptRuntime.lastStoredScriptable(r8)
            r11 = 2
            java.lang.Object[] r3 = new java.lang.Object[r11]
            org.mozilla.javascript.NativeArray$1 r2 = new org.mozilla.javascript.NativeArray$1
            r5 = r8
            r6 = r9
            r2.<init>()
            goto L23
        L1d:
            r5 = r8
            org.mozilla.javascript.NativeArray$2 r2 = new org.mozilla.javascript.NativeArray$2
            r2.<init>()
        L23:
            long r8 = getLengthProperty(r5, r10)
            int r8 = (int) r8
            java.lang.Object[] r9 = new java.lang.Object[r8]
            r11 = r1
        L2b:
            if (r11 == r8) goto L37
            long r3 = (long) r11
            java.lang.Object r0 = getElem(r5, r10, r3)
            r9[r11] = r0
            int r11 = r11 + 1
            goto L2b
        L37:
            java.util.Arrays.sort(r9, r2)
        L3a:
            if (r1 >= r8) goto L45
            long r2 = (long) r1
            r11 = r9[r1]
            setElem(r5, r10, r2, r11)
            int r1 = r1 + 1
            goto L3a
        L45:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mozilla.javascript.NativeArray.js_sort(org.mozilla.javascript.Context, org.mozilla.javascript.Scriptable, org.mozilla.javascript.Scriptable, java.lang.Object[]):org.mozilla.javascript.Scriptable");
    }

    private static Object js_splice(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        NativeArray nativeArray;
        boolean z11;
        boolean z12;
        long j11;
        long j12;
        long j13;
        long j14;
        Object obj;
        Object obj2;
        if (scriptable2 instanceof NativeArray) {
            nativeArray = (NativeArray) scriptable2;
            z11 = nativeArray.denseOnly;
        } else {
            nativeArray = null;
            z11 = false;
        }
        Scriptable topLevelScope = ScriptableObject.getTopLevelScope(scriptable);
        int length = objArr.length;
        if (length == 0) {
            return context.newArray(topLevelScope, 0);
        }
        long lengthProperty = getLengthProperty(context, scriptable2);
        long sliceIndex = toSliceIndex(ScriptRuntime.toInteger(objArr[0]), lengthProperty);
        int i11 = length - 1;
        if (objArr.length == 1) {
            j12 = lengthProperty - sliceIndex;
            z12 = z11;
            j11 = 0;
        } else {
            double integer = ScriptRuntime.toInteger(objArr[1]);
            if (integer < 0.0d) {
                z12 = z11;
                j12 = 0;
                j11 = 0;
            } else {
                z12 = z11;
                long j15 = lengthProperty - sliceIndex;
                j11 = 0;
                if (integer <= j15) {
                    j15 = (long) integer;
                }
                j12 = j15;
            }
            i11 = length - 2;
        }
        long j16 = j12;
        long j17 = sliceIndex + j16;
        if (j16 == j11) {
            j13 = j16;
            j14 = j17;
            obj = context.getLanguageVersion() == 120 ? Undefined.instance : context.newArray(topLevelScope, 0);
        } else if (j16 == 1 && context.getLanguageVersion() == 120) {
            j13 = j16;
            j14 = j17;
            obj = getElem(context, scriptable2, sliceIndex);
        } else if (z12) {
            j13 = j16;
            int i12 = (int) (j17 - sliceIndex);
            Object[] objArr2 = new Object[i12];
            System.arraycopy(nativeArray.dense, (int) sliceIndex, objArr2, 0, i12);
            j14 = j17;
            obj = context.newArray(topLevelScope, objArr2);
        } else {
            j13 = j16;
            Scriptable newArray = context.newArray(topLevelScope, 0);
            j14 = j17;
            long j18 = sliceIndex;
            while (j18 != j14) {
                Object rawElem = getRawElem(scriptable2, j18);
                long j19 = j18;
                if (rawElem != Scriptable.NOT_FOUND) {
                    setElem(context, newArray, j19 - sliceIndex, rawElem);
                }
                j18 = j19 + 1;
            }
            setLengthProperty(context, newArray, j14 - sliceIndex);
            obj = newArray;
        }
        long j21 = i11;
        long j22 = j21 - j13;
        if (z12) {
            Object obj3 = obj;
            long j23 = lengthProperty + j22;
            if (j23 < SieveCacheKt.NodeLinkMask) {
                obj2 = obj3;
                int i13 = (int) j23;
                if (nativeArray.ensureCapacity(i13)) {
                    Object[] objArr3 = nativeArray.dense;
                    System.arraycopy(objArr3, (int) j14, objArr3, (int) (j21 + sliceIndex), (int) (lengthProperty - j14));
                    if (i11 > 0) {
                        System.arraycopy(objArr, 2, nativeArray.dense, (int) sliceIndex, i11);
                    }
                    if (j22 < j11) {
                        Arrays.fill(nativeArray.dense, i13, (int) lengthProperty, Scriptable.NOT_FOUND);
                    }
                    nativeArray.length = j23;
                    return obj2;
                }
            } else {
                obj2 = obj3;
            }
        } else {
            obj2 = obj;
        }
        if (j22 > j11) {
            for (long j24 = lengthProperty - 1; j24 >= j14; j24--) {
                setRawElem(context, scriptable2, j24 + j22, getRawElem(scriptable2, j24));
            }
        } else if (j22 < j11) {
            for (long j25 = j14; j25 < lengthProperty; j25++) {
                setRawElem(context, scriptable2, j25 + j22, getRawElem(scriptable2, j25));
            }
        }
        int length2 = objArr.length - i11;
        for (int i14 = 0; i14 < i11; i14++) {
            setElem(context, scriptable2, i14 + sliceIndex, objArr[i14 + length2]);
        }
        setLengthProperty(context, scriptable2, lengthProperty + j22);
        return obj2;
    }

    private static Object js_unshift(Context context, Scriptable scriptable, Object[] objArr) {
        int i11 = 0;
        if (scriptable instanceof NativeArray) {
            NativeArray nativeArray = (NativeArray) scriptable;
            if (nativeArray.denseOnly && nativeArray.ensureCapacity(((int) nativeArray.length) + objArr.length)) {
                Object[] objArr2 = nativeArray.dense;
                System.arraycopy(objArr2, 0, objArr2, objArr.length, (int) nativeArray.length);
                while (i11 < objArr.length) {
                    nativeArray.dense[i11] = objArr[i11];
                    i11++;
                }
                long length = nativeArray.length + objArr.length;
                nativeArray.length = length;
                return ScriptRuntime.wrapNumber(length);
            }
        }
        long lengthProperty = getLengthProperty(context, scriptable);
        int length2 = objArr.length;
        if (objArr.length <= 0) {
            return ScriptRuntime.wrapNumber(lengthProperty);
        }
        if (lengthProperty > 0) {
            for (long j11 = lengthProperty - 1; j11 >= 0; j11--) {
                setRawElem(context, scriptable, length2 + j11, getRawElem(scriptable, j11));
            }
        }
        while (i11 < objArr.length) {
            setElem(context, scriptable, i11, objArr[i11]);
            i11++;
        }
        return setLengthProperty(context, scriptable, lengthProperty + objArr.length);
    }

    private Object reduceMethod(Context context, int i11, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Object obj = objArr.length > 0 ? objArr[0] : Undefined.instance;
        if (obj == null || !(obj instanceof Function)) {
            throw ScriptRuntime.notFunctionError(obj);
        }
        Function function = (Function) obj;
        Scriptable topLevelScope = ScriptableObject.getTopLevelScope(function);
        long lengthProperty = getLengthProperty(context, scriptable2);
        boolean z11 = i11 == 22;
        Object obj2 = objArr.length > 1 ? objArr[1] : Scriptable.NOT_FOUND;
        for (long j11 = 0; j11 < lengthProperty; j11++) {
            long j12 = z11 ? j11 : (lengthProperty - 1) - j11;
            Object rawElem = getRawElem(scriptable2, j12);
            Object obj3 = Scriptable.NOT_FOUND;
            if (rawElem != obj3) {
                obj2 = obj2 == obj3 ? rawElem : function.call(context, topLevelScope, topLevelScope, new Object[]{obj2, rawElem, Long.valueOf(j12), scriptable2});
            }
        }
        if (obj2 != Scriptable.NOT_FOUND) {
            return obj2;
        }
        throw ScriptRuntime.typeError0("msg.empty.array.reduce");
    }

    private static void setElem(Context context, Scriptable scriptable, long j11, Object obj) {
        if (j11 > SieveCacheKt.NodeLinkMask) {
            ScriptRuntime.setObjectProp(scriptable, Long.toString(j11), obj, context);
        } else {
            ScriptRuntime.setObjectIndex(scriptable, (int) j11, obj, context);
        }
    }

    private void setLength(Object obj) {
        if ((this.lengthAttr & 1) != 0) {
            return;
        }
        double number = ScriptRuntime.toNumber(obj);
        long uint32 = ScriptRuntime.toUint32(number);
        double d11 = uint32;
        if (d11 != number) {
            throw ScriptRuntime.constructError("RangeError", ScriptRuntime.getMessage0("msg.arraylength.bad"));
        }
        if (this.denseOnly) {
            long j11 = this.length;
            if (uint32 < j11) {
                Object[] objArr = this.dense;
                Arrays.fill(objArr, (int) uint32, objArr.length, Scriptable.NOT_FOUND);
                this.length = uint32;
                return;
            } else {
                if (uint32 < 1431655764 && d11 < j11 * GROW_FACTOR && ensureCapacity((int) uint32)) {
                    this.length = uint32;
                    return;
                }
                this.denseOnly = false;
            }
        }
        long j12 = this.length;
        if (uint32 < j12) {
            if (j12 - uint32 > 4096) {
                for (Object obj2 : getIds()) {
                    if (obj2 instanceof String) {
                        String str = (String) obj2;
                        if (toArrayIndex(str) >= uint32) {
                            delete(str);
                        }
                    } else {
                        int intValue = ((Integer) obj2).intValue();
                        if (intValue >= uint32) {
                            delete(intValue);
                        }
                    }
                }
            } else {
                for (long j13 = uint32; j13 < this.length; j13++) {
                    deleteElem(this, j13);
                }
            }
        }
        this.length = uint32;
    }

    private static Object setLengthProperty(Context context, Scriptable scriptable, long j11) {
        return ScriptRuntime.setObjectProp(scriptable, "length", (Object) ScriptRuntime.wrapNumber(j11), context);
    }

    public static void setMaximumInitialCapacity(int i11) {
        maximumInitialCapacity = i11;
    }

    private static void setRawElem(Context context, Scriptable scriptable, long j11, Object obj) {
        if (obj == Scriptable.NOT_FOUND) {
            deleteElem(scriptable, j11);
        } else {
            setElem(context, scriptable, j11, obj);
        }
    }

    private static long toArrayIndex(Object obj) {
        if (obj instanceof String) {
            return toArrayIndex((String) obj);
        }
        if (obj instanceof Number) {
            return toArrayIndex(((Number) obj).doubleValue());
        }
        return -1L;
    }

    private static int toDenseIndex(Object obj) {
        long arrayIndex = toArrayIndex(obj);
        if (0 > arrayIndex || arrayIndex >= SieveCacheKt.NodeLinkMask) {
            return -1;
        }
        return (int) arrayIndex;
    }

    private static long toSliceIndex(double d11, long j11) {
        if (d11 >= 0.0d) {
            return d11 > ((double) j11) ? j11 : (long) d11;
        }
        double d12 = d11 + j11;
        if (d12 < 0.0d) {
            return 0L;
        }
        return (long) d12;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String toStringHelper(org.mozilla.javascript.Context r20, org.mozilla.javascript.Scriptable r21, org.mozilla.javascript.Scriptable r22, boolean r23, boolean r24) {
        /*
            Method dump skipped, instructions count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mozilla.javascript.NativeArray.toStringHelper(org.mozilla.javascript.Context, org.mozilla.javascript.Scriptable, org.mozilla.javascript.Scriptable, boolean, boolean):java.lang.String");
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object obj) {
        return indexOf(obj) > -1;
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // org.mozilla.javascript.ScriptableObject
    public void defineOwnProperty(Context context, Object obj, ScriptableObject scriptableObject, boolean z11) {
        Object[] objArr = this.dense;
        if (objArr != null) {
            this.dense = null;
            this.denseOnly = false;
            for (int i11 = 0; i11 < objArr.length; i11++) {
                Object obj2 = objArr[i11];
                if (obj2 != Scriptable.NOT_FOUND) {
                    put(i11, this, obj2);
                }
            }
        }
        long arrayIndex = toArrayIndex(obj);
        if (arrayIndex >= this.length) {
            this.length = arrayIndex + 1;
        }
        super.defineOwnProperty(context, obj, scriptableObject, z11);
    }

    @Override // org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.Scriptable
    public void delete(int i11) {
        Object[] objArr = this.dense;
        if (objArr == null || i11 < 0 || i11 >= objArr.length || isSealed() || (!this.denseOnly && isGetterOrSetter(null, i11, true))) {
            super.delete(i11);
        } else {
            this.dense[i11] = Scriptable.NOT_FOUND;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Failed to find switch 'out' block (already processed)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.calcSwitchOut(SwitchRegionMaker.java:202)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:61)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:115)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:281)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:64)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:100)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    @Override // org.mozilla.javascript.IdScriptableObject, org.mozilla.javascript.IdFunctionCall
    public java.lang.Object execIdCall(org.mozilla.javascript.IdFunctionObject r8, org.mozilla.javascript.Context r9, org.mozilla.javascript.Scriptable r10, org.mozilla.javascript.Scriptable r11, java.lang.Object[] r12) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mozilla.javascript.NativeArray.execIdCall(org.mozilla.javascript.IdFunctionObject, org.mozilla.javascript.Context, org.mozilla.javascript.Scriptable, org.mozilla.javascript.Scriptable, java.lang.Object[]):java.lang.Object");
    }

    @Override // org.mozilla.javascript.IdScriptableObject
    public void fillConstructorProperties(IdFunctionObject idFunctionObject) {
        Object obj = ARRAY_TAG;
        addIdFunctionProperty(idFunctionObject, obj, -5, "join", 1);
        addIdFunctionProperty(idFunctionObject, obj, -6, "reverse", 0);
        addIdFunctionProperty(idFunctionObject, obj, -7, "sort", 1);
        addIdFunctionProperty(idFunctionObject, obj, -8, c.f37565x, 1);
        addIdFunctionProperty(idFunctionObject, obj, -9, "pop", 0);
        addIdFunctionProperty(idFunctionObject, obj, -10, "shift", 0);
        addIdFunctionProperty(idFunctionObject, obj, -11, "unshift", 1);
        addIdFunctionProperty(idFunctionObject, obj, -12, "splice", 2);
        addIdFunctionProperty(idFunctionObject, obj, -13, "concat", 1);
        addIdFunctionProperty(idFunctionObject, obj, -14, "slice", 2);
        addIdFunctionProperty(idFunctionObject, obj, -15, "indexOf", 1);
        addIdFunctionProperty(idFunctionObject, obj, -16, "lastIndexOf", 1);
        addIdFunctionProperty(idFunctionObject, obj, -17, "every", 1);
        addIdFunctionProperty(idFunctionObject, obj, -18, "filter", 1);
        addIdFunctionProperty(idFunctionObject, obj, -19, "forEach", 1);
        addIdFunctionProperty(idFunctionObject, obj, -20, "map", 1);
        addIdFunctionProperty(idFunctionObject, obj, -21, "some", 1);
        addIdFunctionProperty(idFunctionObject, obj, ConstructorId_reduce, "reduce", 1);
        addIdFunctionProperty(idFunctionObject, obj, ConstructorId_reduceRight, "reduceRight", 1);
        addIdFunctionProperty(idFunctionObject, obj, ConstructorId_isArray, "isArray", 1);
        super.fillConstructorProperties(idFunctionObject);
    }

    @Override // org.mozilla.javascript.IdScriptableObject
    public int findInstanceIdInfo(String str) {
        return str.equals("length") ? IdScriptableObject.instanceIdInfo(this.lengthAttr, 1) : super.findInstanceIdInfo(str);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // org.mozilla.javascript.IdScriptableObject
    public int findPrototypeId(String str) {
        String str2;
        int length = str.length();
        int i11 = 1;
        if (length == 11) {
            char charAt = str.charAt(0);
            if (charAt == 'c') {
                str2 = "constructor";
            } else if (charAt == 'l') {
                str2 = "lastIndexOf";
                i11 = 16;
            } else {
                if (charAt == 'r') {
                    str2 = "reduceRight";
                    i11 = 23;
                }
                str2 = null;
                i11 = 0;
            }
        } else if (length != 14) {
            switch (length) {
                case 3:
                    char charAt2 = str.charAt(0);
                    if (charAt2 == 'm') {
                        if (str.charAt(2) == 'p' && str.charAt(1) == 'a') {
                            return 20;
                        }
                    } else if (charAt2 == 'p' && str.charAt(2) == 'p' && str.charAt(1) == 'o') {
                        return 9;
                    }
                    str2 = null;
                    i11 = 0;
                    break;
                case 4:
                    char charAt3 = str.charAt(2);
                    if (charAt3 == 'i') {
                        str2 = "join";
                        i11 = 5;
                        break;
                    } else if (charAt3 == 'm') {
                        str2 = "some";
                        i11 = 21;
                        break;
                    } else if (charAt3 == 'r') {
                        str2 = "sort";
                        i11 = 7;
                        break;
                    } else {
                        if (charAt3 == 's') {
                            str2 = c.f37565x;
                            i11 = 8;
                            break;
                        }
                        str2 = null;
                        i11 = 0;
                        break;
                    }
                case 5:
                    char charAt4 = str.charAt(1);
                    if (charAt4 != 'h') {
                        if (charAt4 != 'l') {
                            if (charAt4 == 'v') {
                                str2 = "every";
                                i11 = 17;
                                break;
                            }
                            str2 = null;
                            i11 = 0;
                            break;
                        } else {
                            str2 = "slice";
                            i11 = 14;
                            break;
                        }
                    } else {
                        str2 = "shift";
                        i11 = 10;
                        break;
                    }
                case 6:
                    char charAt5 = str.charAt(0);
                    if (charAt5 != 'c') {
                        if (charAt5 != 'f') {
                            if (charAt5 != 's') {
                                if (charAt5 == 'r') {
                                    str2 = "reduce";
                                    i11 = 22;
                                    break;
                                }
                                str2 = null;
                                i11 = 0;
                                break;
                            } else {
                                str2 = "splice";
                                i11 = 12;
                                break;
                            }
                        } else {
                            str2 = "filter";
                            i11 = 18;
                            break;
                        }
                    } else {
                        str2 = "concat";
                        i11 = 13;
                        break;
                    }
                case 7:
                    char charAt6 = str.charAt(0);
                    if (charAt6 == 'f') {
                        str2 = "forEach";
                        i11 = 19;
                        break;
                    } else if (charAt6 == 'i') {
                        str2 = "indexOf";
                        i11 = 15;
                        break;
                    } else if (charAt6 == 'r') {
                        str2 = "reverse";
                        i11 = 6;
                        break;
                    } else {
                        if (charAt6 == 'u') {
                            str2 = "unshift";
                            i11 = 11;
                            break;
                        }
                        str2 = null;
                        i11 = 0;
                        break;
                    }
                case 8:
                    char charAt7 = str.charAt(3);
                    if (charAt7 != 'o') {
                        if (charAt7 == 't') {
                            str2 = "toString";
                            i11 = 2;
                            break;
                        }
                        str2 = null;
                        i11 = 0;
                        break;
                    } else {
                        str2 = "toSource";
                        i11 = 4;
                        break;
                    }
                default:
                    str2 = null;
                    i11 = 0;
                    break;
            }
        } else {
            str2 = "toLocaleString";
            i11 = 3;
        }
        if (str2 == null || str2 == str || str2.equals(str)) {
            return i11;
        }
        return 0;
    }

    @Override // org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.Scriptable
    public Object get(int i11, Scriptable scriptable) {
        if (!this.denseOnly && isGetterOrSetter(null, i11, false)) {
            return super.get(i11, scriptable);
        }
        Object[] objArr = this.dense;
        return (objArr == null || i11 < 0 || i11 >= objArr.length) ? super.get(i11, scriptable) : objArr[i11];
    }

    @Override // org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.debug.DebuggableObject
    public Object[] getAllIds() {
        LinkedHashSet linkedHashSet = new LinkedHashSet(Arrays.asList(getIds()));
        linkedHashSet.addAll(Arrays.asList(super.getAllIds()));
        return linkedHashSet.toArray();
    }

    @Override // org.mozilla.javascript.ScriptableObject
    public int getAttributes(int i11) {
        Object[] objArr = this.dense;
        if (objArr == null || i11 < 0 || i11 >= objArr.length || objArr[i11] == Scriptable.NOT_FOUND) {
            return super.getAttributes(i11);
        }
        return 0;
    }

    @Override // org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.Scriptable
    public String getClassName() {
        return "Array";
    }

    @Override // org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.Scriptable
    public Object getDefaultValue(Class<?> cls) {
        return (cls == ScriptRuntime.NumberClass && Context.getContext().getLanguageVersion() == 120) ? Long.valueOf(this.length) : super.getDefaultValue(cls);
    }

    @Override // org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.Scriptable
    public Object[] getIds() {
        Object[] ids = super.getIds();
        Object[] objArr = this.dense;
        if (objArr != null) {
            int length = objArr.length;
            long j11 = this.length;
            if (length > j11) {
                length = (int) j11;
            }
            if (length != 0) {
                int length2 = ids.length;
                Object[] objArr2 = new Object[length + length2];
                int i11 = 0;
                for (int i12 = 0; i12 != length; i12++) {
                    if (this.dense[i12] != Scriptable.NOT_FOUND) {
                        objArr2[i11] = Integer.valueOf(i12);
                        i11++;
                    }
                }
                if (i11 != length) {
                    Object[] objArr3 = new Object[i11 + length2];
                    System.arraycopy(objArr2, 0, objArr3, 0, i11);
                    objArr2 = objArr3;
                }
                System.arraycopy(ids, 0, objArr2, i11, length2);
                return objArr2;
            }
        }
        return ids;
    }

    public Integer[] getIndexIds() {
        Object[] ids = getIds();
        ArrayList arrayList = new ArrayList(ids.length);
        for (Object obj : ids) {
            int int32 = ScriptRuntime.toInt32(obj);
            if (int32 >= 0 && ScriptRuntime.toString(int32).equals(ScriptRuntime.toString(obj))) {
                arrayList.add(Integer.valueOf(int32));
            }
        }
        return (Integer[]) arrayList.toArray(new Integer[arrayList.size()]);
    }

    @Override // org.mozilla.javascript.IdScriptableObject
    public String getInstanceIdName(int i11) {
        return i11 == 1 ? "length" : super.getInstanceIdName(i11);
    }

    @Override // org.mozilla.javascript.IdScriptableObject
    public Object getInstanceIdValue(int i11) {
        return i11 == 1 ? ScriptRuntime.wrapNumber(this.length) : super.getInstanceIdValue(i11);
    }

    public long getLength() {
        return this.length;
    }

    @Override // org.mozilla.javascript.IdScriptableObject
    public int getMaxInstanceId() {
        return 1;
    }

    @Override // org.mozilla.javascript.IdScriptableObject, org.mozilla.javascript.ScriptableObject
    public ScriptableObject getOwnPropertyDescriptor(Context context, Object obj) {
        int denseIndex;
        Object obj2;
        if (this.dense != null && (denseIndex = toDenseIndex(obj)) >= 0) {
            Object[] objArr = this.dense;
            if (denseIndex < objArr.length && (obj2 = objArr[denseIndex]) != Scriptable.NOT_FOUND) {
                return defaultIndexPropertyDescriptor(obj2);
            }
        }
        return super.getOwnPropertyDescriptor(context, obj);
    }

    @Override // org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.Scriptable
    public boolean has(int i11, Scriptable scriptable) {
        if (!this.denseOnly && isGetterOrSetter(null, i11, false)) {
            return super.has(i11, scriptable);
        }
        Object[] objArr = this.dense;
        return (objArr == null || i11 < 0 || i11 >= objArr.length) ? super.has(i11, scriptable) : objArr[i11] != Scriptable.NOT_FOUND;
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        long j11 = this.length;
        if (j11 > SieveCacheKt.NodeLinkMask) {
            throw new IllegalStateException();
        }
        int i11 = (int) j11;
        int i12 = 0;
        if (obj == null) {
            while (i12 < i11) {
                if (get(i12) == null) {
                    return i12;
                }
                i12++;
            }
            return -1;
        }
        while (i12 < i11) {
            if (obj.equals(get(i12))) {
                return i12;
            }
            i12++;
        }
        return -1;
    }

    @Override // org.mozilla.javascript.IdScriptableObject
    public void initPrototypeId(int i11) {
        String str;
        String str2;
        int i12 = 1;
        switch (i11) {
            case 1:
                str = "constructor";
                initPrototypeMethod(ARRAY_TAG, i11, str, i12);
                return;
            case 2:
                str = "toString";
                i12 = 0;
                initPrototypeMethod(ARRAY_TAG, i11, str, i12);
                return;
            case 3:
                str = "toLocaleString";
                i12 = 0;
                initPrototypeMethod(ARRAY_TAG, i11, str, i12);
                return;
            case 4:
                str = "toSource";
                i12 = 0;
                initPrototypeMethod(ARRAY_TAG, i11, str, i12);
                return;
            case 5:
                str = "join";
                initPrototypeMethod(ARRAY_TAG, i11, str, i12);
                return;
            case 6:
                str = "reverse";
                i12 = 0;
                initPrototypeMethod(ARRAY_TAG, i11, str, i12);
                return;
            case 7:
                str = "sort";
                initPrototypeMethod(ARRAY_TAG, i11, str, i12);
                return;
            case 8:
                str = c.f37565x;
                initPrototypeMethod(ARRAY_TAG, i11, str, i12);
                return;
            case 9:
                str = "pop";
                i12 = 0;
                initPrototypeMethod(ARRAY_TAG, i11, str, i12);
                return;
            case 10:
                str = "shift";
                i12 = 0;
                initPrototypeMethod(ARRAY_TAG, i11, str, i12);
                return;
            case 11:
                str = "unshift";
                initPrototypeMethod(ARRAY_TAG, i11, str, i12);
                return;
            case 12:
                str2 = "splice";
                i12 = 2;
                str = str2;
                initPrototypeMethod(ARRAY_TAG, i11, str, i12);
                return;
            case 13:
                str = "concat";
                initPrototypeMethod(ARRAY_TAG, i11, str, i12);
                return;
            case 14:
                str2 = "slice";
                i12 = 2;
                str = str2;
                initPrototypeMethod(ARRAY_TAG, i11, str, i12);
                return;
            case 15:
                str = "indexOf";
                initPrototypeMethod(ARRAY_TAG, i11, str, i12);
                return;
            case 16:
                str = "lastIndexOf";
                initPrototypeMethod(ARRAY_TAG, i11, str, i12);
                return;
            case 17:
                str = "every";
                initPrototypeMethod(ARRAY_TAG, i11, str, i12);
                return;
            case 18:
                str = "filter";
                initPrototypeMethod(ARRAY_TAG, i11, str, i12);
                return;
            case 19:
                str = "forEach";
                initPrototypeMethod(ARRAY_TAG, i11, str, i12);
                return;
            case 20:
                str = "map";
                initPrototypeMethod(ARRAY_TAG, i11, str, i12);
                return;
            case 21:
                str = "some";
                initPrototypeMethod(ARRAY_TAG, i11, str, i12);
                return;
            case 22:
                str = "reduce";
                initPrototypeMethod(ARRAY_TAG, i11, str, i12);
                return;
            case 23:
                str = "reduceRight";
                initPrototypeMethod(ARRAY_TAG, i11, str, i12);
                return;
            default:
                throw new IllegalArgumentException(String.valueOf(i11));
        }
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return listIterator(0);
    }

    public long jsGet_length() {
        return getLength();
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        long j11 = this.length;
        if (j11 > SieveCacheKt.NodeLinkMask) {
            throw new IllegalStateException();
        }
        int i11 = (int) j11;
        if (obj == null) {
            for (int i12 = i11 - 1; i12 >= 0; i12--) {
                if (get(i12) == null) {
                    return i12;
                }
            }
            return -1;
        }
        for (int i13 = i11 - 1; i13 >= 0; i13--) {
            if (obj.equals(get(i13))) {
                return i13;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // org.mozilla.javascript.IdScriptableObject, org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.Scriptable
    public void put(String str, Scriptable scriptable, Object obj) {
        super.put(str, scriptable, obj);
        if (scriptable == this) {
            long arrayIndex = toArrayIndex(str);
            if (arrayIndex >= this.length) {
                this.length = arrayIndex + 1;
                this.denseOnly = false;
            }
        }
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public Object set(int i11, Object obj) {
        throw new UnsupportedOperationException();
    }

    public void setDenseOnly(boolean z11) {
        if (z11 && !this.denseOnly) {
            throw new IllegalArgumentException();
        }
        this.denseOnly = z11;
    }

    @Override // org.mozilla.javascript.IdScriptableObject
    public void setInstanceIdAttributes(int i11, int i12) {
        if (i11 == 1) {
            this.lengthAttr = i12;
        }
    }

    @Override // org.mozilla.javascript.IdScriptableObject
    public void setInstanceIdValue(int i11, Object obj) {
        if (i11 == 1) {
            setLength(obj);
        } else {
            super.setInstanceIdValue(i11, obj);
        }
    }

    @Override // org.mozilla.javascript.ScriptableObject, java.util.List, java.util.Collection
    public int size() {
        long j11 = this.length;
        if (j11 <= SieveCacheKt.NodeLinkMask) {
            return (int) j11;
        }
        throw new IllegalStateException();
    }

    @Override // java.util.List
    public List subList(int i11, int i12) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return toArray(ScriptRuntime.emptyArgs);
    }

    @Override // java.util.List
    public void add(int i11, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public boolean addAll(int i11, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public ListIterator listIterator(int i11) {
        long j11 = this.length;
        if (j11 > SieveCacheKt.NodeLinkMask) {
            throw new IllegalStateException();
        }
        int i12 = (int) j11;
        if (i11 >= 0 && i11 <= i12) {
            return new ListIterator(i11, i12) { // from class: org.mozilla.javascript.NativeArray.3
                int cursor;
                final /* synthetic */ int val$len;
                final /* synthetic */ int val$start;

                {
                    this.val$start = i11;
                    this.val$len = i12;
                    this.cursor = i11;
                }

                @Override // java.util.ListIterator
                public void add(Object obj) {
                    throw new UnsupportedOperationException();
                }

                @Override // java.util.ListIterator, java.util.Iterator
                public boolean hasNext() {
                    return this.cursor < this.val$len;
                }

                @Override // java.util.ListIterator
                public boolean hasPrevious() {
                    return this.cursor > 0;
                }

                @Override // java.util.ListIterator, java.util.Iterator
                public Object next() {
                    int i13 = this.cursor;
                    if (i13 == this.val$len) {
                        throw new NoSuchElementException();
                    }
                    NativeArray nativeArray = NativeArray.this;
                    this.cursor = i13 + 1;
                    return nativeArray.get(i13);
                }

                @Override // java.util.ListIterator
                public int nextIndex() {
                    return this.cursor;
                }

                @Override // java.util.ListIterator
                public Object previous() {
                    int i13 = this.cursor;
                    if (i13 == 0) {
                        throw new NoSuchElementException();
                    }
                    NativeArray nativeArray = NativeArray.this;
                    int i14 = i13 - 1;
                    this.cursor = i14;
                    return nativeArray.get(i14);
                }

                @Override // java.util.ListIterator
                public int previousIndex() {
                    return this.cursor - 1;
                }

                @Override // java.util.ListIterator, java.util.Iterator
                public void remove() {
                    throw new UnsupportedOperationException();
                }

                @Override // java.util.ListIterator
                public void set(Object obj) {
                    throw new UnsupportedOperationException();
                }
            };
        }
        throw new IndexOutOfBoundsException("Index: " + i11);
    }

    @Override // java.util.List
    public Object remove(int i11) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray(Object[] objArr) {
        long j11 = this.length;
        if (j11 > SieveCacheKt.NodeLinkMask) {
            throw new IllegalStateException();
        }
        int i11 = (int) j11;
        if (objArr.length < i11) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i11);
        }
        for (int i12 = 0; i12 < i11; i12++) {
            objArr[i12] = get(i12);
        }
        return objArr;
    }

    private static long toArrayIndex(String str) {
        long arrayIndex = toArrayIndex(ScriptRuntime.toNumber(str));
        if (Long.toString(arrayIndex).equals(str)) {
            return arrayIndex;
        }
        return -1L;
    }

    public Object get(long j11) {
        if (j11 >= 0 && j11 < this.length) {
            Object rawElem = getRawElem(this, j11);
            if (rawElem == Scriptable.NOT_FOUND || rawElem == Undefined.instance) {
                return null;
            }
            return rawElem instanceof Wrapper ? ((Wrapper) rawElem).unwrap() : rawElem;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.Scriptable
    public void put(int i11, Scriptable scriptable, Object obj) {
        if (scriptable == this && !isSealed() && this.dense != null && i11 >= 0 && (this.denseOnly || !isGetterOrSetter(null, i11, true))) {
            Object[] objArr = this.dense;
            if (i11 < objArr.length) {
                objArr[i11] = obj;
                long j11 = i11;
                if (this.length <= j11) {
                    this.length = j11 + 1;
                    return;
                }
                return;
            }
            if (this.denseOnly && i11 < objArr.length * GROW_FACTOR && ensureCapacity(i11 + 1)) {
                this.dense[i11] = obj;
                this.length = i11 + 1;
                return;
            }
            this.denseOnly = false;
        }
        super.put(i11, scriptable, obj);
        if (scriptable == this && (this.lengthAttr & 1) == 0) {
            long j12 = i11;
            if (this.length <= j12) {
                this.length = j12 + 1;
            }
        }
    }

    public NativeArray(Object[] objArr) {
        this.lengthAttr = 6;
        this.denseOnly = true;
        this.dense = objArr;
        this.length = objArr.length;
    }

    private static long toArrayIndex(double d11) {
        if (d11 != d11) {
            return -1L;
        }
        long uint32 = ScriptRuntime.toUint32(d11);
        if (uint32 != d11 || uint32 == 4294967295L) {
            return -1L;
        }
        return uint32;
    }

    @Override // java.util.List
    public Object get(int i11) {
        return get(i11);
    }
}

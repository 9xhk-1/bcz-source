package org.mozilla.javascript.optimizer;

import org.mozilla.javascript.Callable;
import org.mozilla.javascript.ConsString;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.ContextAction;
import org.mozilla.javascript.ContextFactory;
import org.mozilla.javascript.JavaScriptException;
import org.mozilla.javascript.NativeFunction;
import org.mozilla.javascript.NativeGenerator;
import org.mozilla.javascript.NativeIterator;
import org.mozilla.javascript.Script;
import org.mozilla.javascript.ScriptRuntime;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class OptRuntime extends ScriptRuntime {
    public static final Double zeroObj = new Double(0.0d);
    public static final Double oneObj = new Double(1.0d);
    public static final Double minusOneObj = new Double(-1.0d);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class GeneratorState {
        static final String CLASS_NAME = "org/mozilla/javascript/optimizer/OptRuntime$GeneratorState";
        static final String resumptionPoint_NAME = "resumptionPoint";
        static final String resumptionPoint_TYPE = "I";
        static final String thisObj_NAME = "thisObj";
        static final String thisObj_TYPE = "Lorg/mozilla/javascript/Scriptable;";
        Object[] localsState;
        int maxLocals;
        int maxStack;
        public int resumptionPoint;
        Object[] stackState;
        public Scriptable thisObj;

        public GeneratorState(Scriptable scriptable, int i11, int i12) {
            this.thisObj = scriptable;
            this.maxLocals = i11;
            this.maxStack = i12;
        }
    }

    public static Object add(Object obj, double d11) {
        if (obj instanceof Scriptable) {
            obj = ((Scriptable) obj).getDefaultValue(null);
        }
        return !(obj instanceof CharSequence) ? wrapDouble(ScriptRuntime.toNumber(obj) + d11) : new ConsString((CharSequence) obj, ScriptRuntime.toString(d11));
    }

    public static Object call0(Callable callable, Scriptable scriptable, Context context, Scriptable scriptable2) {
        return callable.call(context, scriptable2, scriptable, ScriptRuntime.emptyArgs);
    }

    public static Object call1(Callable callable, Scriptable scriptable, Object obj, Context context, Scriptable scriptable2) {
        return callable.call(context, scriptable2, scriptable, new Object[]{obj});
    }

    public static Object call2(Callable callable, Scriptable scriptable, Object obj, Object obj2, Context context, Scriptable scriptable2) {
        return callable.call(context, scriptable2, scriptable, new Object[]{obj, obj2});
    }

    public static Object callN(Callable callable, Scriptable scriptable, Object[] objArr, Context context, Scriptable scriptable2) {
        return callable.call(context, scriptable2, scriptable, objArr);
    }

    public static Object callName(Object[] objArr, String str, Context context, Scriptable scriptable) {
        return ScriptRuntime.getNameFunctionAndThis(str, context, scriptable).call(context, scriptable, ScriptRuntime.lastStoredScriptable(context), objArr);
    }

    public static Object callName0(String str, Context context, Scriptable scriptable) {
        return ScriptRuntime.getNameFunctionAndThis(str, context, scriptable).call(context, scriptable, ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.emptyArgs);
    }

    public static Object callProp0(Object obj, String str, Context context, Scriptable scriptable) {
        return ScriptRuntime.getPropFunctionAndThis(obj, str, context, scriptable).call(context, scriptable, ScriptRuntime.lastStoredScriptable(context), ScriptRuntime.emptyArgs);
    }

    public static Object callSpecial(Context context, Callable callable, Scriptable scriptable, Object[] objArr, Scriptable scriptable2, Scriptable scriptable3, int i11, String str, int i12) {
        return ScriptRuntime.callSpecial(context, callable, scriptable, objArr, scriptable2, scriptable3, i11, str, i12);
    }

    public static Scriptable createNativeGenerator(NativeFunction nativeFunction, Scriptable scriptable, Scriptable scriptable2, int i11, int i12) {
        return new NativeGenerator(scriptable, nativeFunction, new GeneratorState(scriptable2, i11, i12));
    }

    private static int[] decodeIntArray(String str, int i11) {
        if (i11 == 0) {
            if (str == null) {
                return null;
            }
            throw new IllegalArgumentException();
        }
        if (str.length() != (i11 * 2) + 1 && str.charAt(0) != 1) {
            throw new IllegalArgumentException();
        }
        int[] iArr = new int[i11];
        for (int i12 = 0; i12 != i11; i12++) {
            int i13 = i12 * 2;
            iArr[i12] = str.charAt(i13 + 2) | (str.charAt(i13 + 1) << 16);
        }
        return iArr;
    }

    public static Object elemIncrDecr(Object obj, double d11, Context context, int i11) {
        return ScriptRuntime.elemIncrDecr(obj, new Double(d11), context, i11);
    }

    public static String encodeIntArray(int[] iArr) {
        if (iArr == null) {
            return null;
        }
        int length = iArr.length;
        char[] cArr = new char[(length * 2) + 1];
        cArr[0] = 1;
        for (int i11 = 0; i11 != length; i11++) {
            int i12 = iArr[i11];
            int i13 = i11 * 2;
            cArr[i13 + 1] = (char) (i12 >>> 16);
            cArr[i13 + 2] = (char) i12;
        }
        return new String(cArr);
    }

    public static Object[] getGeneratorLocalsState(Object obj) {
        GeneratorState generatorState = (GeneratorState) obj;
        if (generatorState.localsState == null) {
            generatorState.localsState = new Object[generatorState.maxLocals];
        }
        return generatorState.localsState;
    }

    public static Object[] getGeneratorStackState(Object obj) {
        GeneratorState generatorState = (GeneratorState) obj;
        if (generatorState.stackState == null) {
            generatorState.stackState = new Object[generatorState.maxStack];
        }
        return generatorState.stackState;
    }

    public static void initFunction(NativeFunction nativeFunction, int i11, Scriptable scriptable, Context context) {
        ScriptRuntime.initFunction(context, scriptable, nativeFunction, i11, false);
    }

    public static void main(final Script script, final String[] strArr) {
        ContextFactory.getGlobal().call(new ContextAction() { // from class: org.mozilla.javascript.optimizer.OptRuntime.1
            @Override // org.mozilla.javascript.ContextAction
            public Object run(Context context) {
                ScriptableObject global = ScriptRuntime.getGlobal(context);
                String[] strArr2 = strArr;
                Object[] objArr = new Object[strArr2.length];
                System.arraycopy(strArr2, 0, objArr, 0, strArr2.length);
                global.defineProperty("arguments", context.newArray(global, objArr), 2);
                script.exec(context, global);
                return null;
            }
        });
    }

    public static Scriptable newArrayLiteral(Object[] objArr, String str, int i11, Context context, Scriptable scriptable) {
        return ScriptRuntime.newArrayLiteral(objArr, decodeIntArray(str, i11), context, scriptable);
    }

    public static Object newObjectSpecial(Context context, Object obj, Object[] objArr, Scriptable scriptable, Scriptable scriptable2, int i11) {
        return ScriptRuntime.newSpecial(context, obj, objArr, scriptable, i11);
    }

    public static Object[] padStart(Object[] objArr, int i11) {
        Object[] objArr2 = new Object[objArr.length + i11];
        System.arraycopy(objArr, 0, objArr2, i11, objArr.length);
        return objArr2;
    }

    public static void throwStopIteration(Object obj) {
        throw new JavaScriptException(NativeIterator.getStopIterationObject((Scriptable) obj), "", 0);
    }

    public static Double wrapDouble(double d11) {
        if (d11 == 0.0d) {
            if (1.0d / d11 > 0.0d) {
                return zeroObj;
            }
        } else {
            if (d11 == 1.0d) {
                return oneObj;
            }
            if (d11 == -1.0d) {
                return minusOneObj;
            }
            if (d11 != d11) {
                return ScriptRuntime.NaNobj;
            }
        }
        return new Double(d11);
    }

    public static Object add(double d11, Object obj) {
        if (obj instanceof Scriptable) {
            obj = ((Scriptable) obj).getDefaultValue(null);
        }
        if (!(obj instanceof CharSequence)) {
            return wrapDouble(ScriptRuntime.toNumber(obj) + d11);
        }
        return new ConsString(ScriptRuntime.toString(d11), (CharSequence) obj);
    }
}

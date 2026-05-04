package org.mozilla.javascript;

import androidx.collection.SieveCacheKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.io.Serializable;
import java.text.MessageFormat;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import l50.b;
import org.junit.jupiter.api.j2;
import org.mozilla.javascript.TopLevel;
import org.mozilla.javascript.v8dtoa.FastDtoa;
import org.mozilla.javascript.xml.XMLLib;
import org.mozilla.javascript.xml.XMLObject;
import pn.j;
import s3.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class ScriptRuntime {
    private static final String DEFAULT_NS_TAG = "__default_namespace__";
    public static final int ENUMERATE_ARRAY = 2;
    public static final int ENUMERATE_ARRAY_NO_ITERATOR = 5;
    public static final int ENUMERATE_KEYS = 0;
    public static final int ENUMERATE_KEYS_NO_ITERATOR = 3;
    public static final int ENUMERATE_VALUES = 1;
    public static final int ENUMERATE_VALUES_NO_ITERATOR = 4;
    public static final double NaN;
    public static final Double NaNobj;
    private static BaseFunction THROW_TYPE_ERROR;
    public static final Object[] emptyArgs;
    public static final String[] emptyStrings;
    public static MessageProvider messageProvider;
    public static final double negativeZero;
    public static final Class<?> BooleanClass = Kit.classOrNull("java.lang.Boolean");
    public static final Class<?> ByteClass = Kit.classOrNull("java.lang.Byte");
    public static final Class<?> CharacterClass = Kit.classOrNull("java.lang.Character");
    public static final Class<?> ClassClass = Kit.classOrNull("java.lang.Class");
    public static final Class<?> DoubleClass = Kit.classOrNull("java.lang.Double");
    public static final Class<?> FloatClass = Kit.classOrNull("java.lang.Float");
    public static final Class<?> IntegerClass = Kit.classOrNull("java.lang.Integer");
    public static final Class<?> LongClass = Kit.classOrNull("java.lang.Long");
    public static final Class<?> NumberClass = Kit.classOrNull("java.lang.Number");
    public static final Class<?> ObjectClass = Kit.classOrNull("java.lang.Object");
    public static final Class<?> ShortClass = Kit.classOrNull("java.lang.Short");
    public static final Class<?> StringClass = Kit.classOrNull("java.lang.String");
    public static final Class<?> DateClass = Kit.classOrNull("java.util.Date");
    public static final Class<?> ContextClass = Kit.classOrNull("org.mozilla.javascript.Context");
    public static final Class<?> ContextFactoryClass = Kit.classOrNull("org.mozilla.javascript.ContextFactory");
    public static final Class<?> FunctionClass = Kit.classOrNull("org.mozilla.javascript.Function");
    public static final Class<?> ScriptableObjectClass = Kit.classOrNull("org.mozilla.javascript.ScriptableObject");
    public static final Class<Scriptable> ScriptableClass = Scriptable.class;
    public static Locale ROOT_LOCALE = new Locale("");
    private static final Object LIBRARY_SCOPE_KEY = "LIBRARY_SCOPE";

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class DefaultMessageProvider implements MessageProvider {
        private DefaultMessageProvider() {
        }

        @Override // org.mozilla.javascript.ScriptRuntime.MessageProvider
        public String getMessage(String str, Object[] objArr) {
            Context currentContext = Context.getCurrentContext();
            try {
                return new MessageFormat(ResourceBundle.getBundle("org.mozilla.javascript.resources.Messages", currentContext != null ? currentContext.getLocale() : Locale.getDefault()).getString(str)).format(objArr);
            } catch (MissingResourceException unused) {
                throw new RuntimeException("no message resource found for message property " + str);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class IdEnumeration implements Serializable {
        private static final long serialVersionUID = 1;
        Object currentId;
        boolean enumNumbers;
        int enumType;
        Object[] ids;
        int index;
        Scriptable iterator;
        Scriptable obj;
        ObjToIntMap used;

        private IdEnumeration() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface MessageProvider {
        String getMessage(String str, Object[] objArr);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class NoSuchMethodShim implements Callable {
        String methodName;
        Callable noSuchMethodMethod;

        public NoSuchMethodShim(Callable callable, String str) {
            this.noSuchMethodMethod = callable;
            this.methodName = str;
        }

        @Override // org.mozilla.javascript.Callable
        public Object call(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
            return this.noSuchMethodMethod.call(context, scriptable, scriptable2, new Object[]{this.methodName, ScriptRuntime.newArrayLiteral(objArr, null, context, scriptable)});
        }
    }

    static {
        double longBitsToDouble = Double.longBitsToDouble(9221120237041090560L);
        NaN = longBitsToDouble;
        negativeZero = Double.longBitsToDouble(Long.MIN_VALUE);
        NaNobj = new Double(longBitsToDouble);
        messageProvider = new DefaultMessageProvider();
        emptyArgs = new Object[0];
        emptyStrings = new String[0];
    }

    public static Object add(Object obj, Object obj2, Context context) {
        Object addValues;
        Object addValues2;
        if ((obj instanceof Number) && (obj2 instanceof Number)) {
            return wrapNumber(((Number) obj).doubleValue() + ((Number) obj2).doubleValue());
        }
        if ((obj instanceof XMLObject) && (addValues2 = ((XMLObject) obj).addValues(context, true, obj2)) != Scriptable.NOT_FOUND) {
            return addValues2;
        }
        if ((obj2 instanceof XMLObject) && (addValues = ((XMLObject) obj2).addValues(context, false, obj)) != Scriptable.NOT_FOUND) {
            return addValues;
        }
        if (obj instanceof Scriptable) {
            obj = ((Scriptable) obj).getDefaultValue(null);
        }
        if (obj2 instanceof Scriptable) {
            obj2 = ((Scriptable) obj2).getDefaultValue(null);
        }
        return ((obj instanceof CharSequence) || (obj2 instanceof CharSequence)) ? new ConsString(toCharSequence(obj), toCharSequence(obj2)) : ((obj instanceof Number) && (obj2 instanceof Number)) ? wrapNumber(((Number) obj).doubleValue() + ((Number) obj2).doubleValue()) : wrapNumber(toNumber(obj) + toNumber(obj2));
    }

    public static void addInstructionCount(Context context, int i11) {
        int i12 = context.instructionCount + i11;
        context.instructionCount = i12;
        if (i12 > context.instructionThreshold) {
            context.observeInstructionCount(i12);
            context.instructionCount = 0;
        }
    }

    public static Object applyOrCall(boolean z11, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Object[] objArr2;
        int length = objArr.length;
        Callable callable = getCallable(scriptable2);
        Scriptable objectOrNull = length != 0 ? toObjectOrNull(context, objArr[0]) : null;
        if (objectOrNull == null) {
            objectOrNull = getTopCallScope(context);
        }
        if (z11) {
            objArr2 = length <= 1 ? emptyArgs : getApplyArguments(context, objArr[1]);
        } else if (length <= 1) {
            objArr2 = emptyArgs;
        } else {
            int i11 = length - 1;
            objArr2 = new Object[i11];
            System.arraycopy(objArr, 1, objArr2, 0, i11);
        }
        return callable.call(context, scriptable, objectOrNull, objArr2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002e, code lost:
    
        r5 = r0;
        r1 = r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static org.mozilla.javascript.Scriptable bind(org.mozilla.javascript.Context r4, org.mozilla.javascript.Scriptable r5, java.lang.String r6) {
        /*
            org.mozilla.javascript.Scriptable r0 = r5.getParentScope()
            r1 = 0
            if (r0 == 0) goto L47
            r2 = r1
        L8:
            boolean r1 = r5 instanceof org.mozilla.javascript.NativeWith
            if (r1 == 0) goto L35
            org.mozilla.javascript.Scriptable r5 = r5.getPrototype()
            boolean r1 = r5 instanceof org.mozilla.javascript.xml.XMLObject
            if (r1 == 0) goto L21
            org.mozilla.javascript.xml.XMLObject r5 = (org.mozilla.javascript.xml.XMLObject) r5
            boolean r1 = r5.has(r4, r6)
            if (r1 == 0) goto L1d
            return r5
        L1d:
            if (r2 != 0) goto L28
            r2 = r5
            goto L28
        L21:
            boolean r1 = org.mozilla.javascript.ScriptableObject.hasProperty(r5, r6)
            if (r1 == 0) goto L28
            return r5
        L28:
            org.mozilla.javascript.Scriptable r5 = r0.getParentScope()
            if (r5 != 0) goto L31
        L2e:
            r5 = r0
            r1 = r2
            goto L47
        L31:
            r3 = r0
            r0 = r5
            r5 = r3
            goto L8
        L35:
            boolean r1 = org.mozilla.javascript.ScriptableObject.hasProperty(r5, r6)
            if (r1 == 0) goto L3c
            return r5
        L3c:
            org.mozilla.javascript.Scriptable r5 = r0.getParentScope()
            if (r5 != 0) goto L43
            goto L2e
        L43:
            r3 = r0
            r0 = r5
            r5 = r3
            goto L35
        L47:
            boolean r0 = r4.useDynamicScope
            if (r0 == 0) goto L51
            org.mozilla.javascript.Scriptable r4 = r4.topCallScope
            org.mozilla.javascript.Scriptable r5 = checkDynamicScope(r4, r5)
        L51:
            boolean r4 = org.mozilla.javascript.ScriptableObject.hasProperty(r5, r6)
            if (r4 == 0) goto L58
            return r5
        L58:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mozilla.javascript.ScriptRuntime.bind(org.mozilla.javascript.Context, org.mozilla.javascript.Scriptable, java.lang.String):org.mozilla.javascript.Scriptable");
    }

    public static Object call(Context context, Object obj, Object obj2, Object[] objArr, Scriptable scriptable) {
        if (!(obj instanceof Function)) {
            throw notFunctionError(toString(obj));
        }
        Function function = (Function) obj;
        Scriptable objectOrNull = toObjectOrNull(context, obj2);
        if (objectOrNull != null) {
            return function.call(context, scriptable, objectOrNull, objArr);
        }
        throw undefCallError(objectOrNull, "function");
    }

    public static Ref callRef(Callable callable, Scriptable scriptable, Object[] objArr, Context context) {
        if (!(callable instanceof RefCallable)) {
            throw constructError("ReferenceError", getMessage1("msg.no.ref.from.function", toString(callable)));
        }
        RefCallable refCallable = (RefCallable) callable;
        Ref refCall = refCallable.refCall(context, scriptable, objArr);
        if (refCall != null) {
            return refCall;
        }
        throw new IllegalStateException(refCallable.getClass().getName() + ".refCall() returned null");
    }

    public static Object callSpecial(Context context, Callable callable, Scriptable scriptable, Object[] objArr, Scriptable scriptable2, Scriptable scriptable3, int i11, String str, int i12) {
        Context context2;
        Object[] objArr2;
        Scriptable scriptable4;
        if (i11 != 1) {
            context2 = context;
            objArr2 = objArr;
            scriptable4 = scriptable2;
            if (i11 != 2) {
                throw Kit.codeBug();
            }
            if (NativeWith.isWithFunction(callable)) {
                throw Context.reportRuntimeError1("msg.only.from.new", "With");
            }
        } else {
            if (scriptable.getParentScope() == null && NativeGlobal.isEvalFunction(callable)) {
                return evalSpecial(context, scriptable2, scriptable3, objArr, str, i12);
            }
            context2 = context;
            objArr2 = objArr;
            scriptable4 = scriptable2;
        }
        return callable.call(context2, scriptable4, scriptable, objArr2);
    }

    public static void checkDeprecated(Context context, String str) {
        int languageVersion = context.getLanguageVersion();
        if (languageVersion >= 140 || languageVersion == 0) {
            String message1 = getMessage1("msg.deprec.ctor", str);
            if (languageVersion != 0) {
                throw Context.reportRuntimeError(message1);
            }
            Context.reportWarning(message1);
        }
    }

    public static Scriptable checkDynamicScope(Scriptable scriptable, Scriptable scriptable2) {
        if (scriptable != scriptable2) {
            Scriptable scriptable3 = scriptable;
            do {
                scriptable3 = scriptable3.getPrototype();
                if (scriptable3 == scriptable2) {
                }
            } while (scriptable3 != null);
            return scriptable2;
        }
        return scriptable;
    }

    public static RegExpProxy checkRegExpProxy(Context context) {
        RegExpProxy regExpProxy = getRegExpProxy(context);
        if (regExpProxy != null) {
            return regExpProxy;
        }
        throw Context.reportRuntimeError0("msg.no.regexp");
    }

    public static boolean cmp_LE(Object obj, Object obj2) {
        double number;
        double number2;
        if ((obj instanceof Number) && (obj2 instanceof Number)) {
            number = ((Number) obj).doubleValue();
            number2 = ((Number) obj2).doubleValue();
        } else {
            if (obj instanceof Scriptable) {
                obj = ((Scriptable) obj).getDefaultValue(NumberClass);
            }
            if (obj2 instanceof Scriptable) {
                obj2 = ((Scriptable) obj2).getDefaultValue(NumberClass);
            }
            if ((obj instanceof CharSequence) && (obj2 instanceof CharSequence)) {
                return obj.toString().compareTo(obj2.toString()) <= 0;
            }
            number = toNumber(obj);
            number2 = toNumber(obj2);
        }
        return number <= number2;
    }

    public static boolean cmp_LT(Object obj, Object obj2) {
        double number;
        double number2;
        if ((obj instanceof Number) && (obj2 instanceof Number)) {
            number = ((Number) obj).doubleValue();
            number2 = ((Number) obj2).doubleValue();
        } else {
            if (obj instanceof Scriptable) {
                obj = ((Scriptable) obj).getDefaultValue(NumberClass);
            }
            if (obj2 instanceof Scriptable) {
                obj2 = ((Scriptable) obj2).getDefaultValue(NumberClass);
            }
            if ((obj instanceof CharSequence) && (obj2 instanceof CharSequence)) {
                return obj.toString().compareTo(obj2.toString()) < 0;
            }
            number = toNumber(obj);
            number2 = toNumber(obj2);
        }
        return number < number2;
    }

    public static EcmaError constructError(String str, String str2) {
        int[] iArr = new int[1];
        return constructError(str, str2, Context.getSourcePositionFromStack(iArr), iArr[0], null, 0);
    }

    public static Scriptable createFunctionActivation(NativeFunction nativeFunction, Scriptable scriptable, Object[] objArr) {
        return new NativeCall(nativeFunction, scriptable, objArr);
    }

    private static XMLLib currentXMLLib(Context context) {
        Scriptable scriptable = context.topCallScope;
        if (scriptable == null) {
            throw new IllegalStateException();
        }
        XMLLib xMLLib = context.cachedXMLLib;
        if (xMLLib != null) {
            return xMLLib;
        }
        XMLLib extractFromScope = XMLLib.extractFromScope(scriptable);
        if (extractFromScope == null) {
            throw new IllegalStateException();
        }
        context.cachedXMLLib = extractFromScope;
        return extractFromScope;
    }

    public static String defaultObjectToSource(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        boolean has;
        boolean z11;
        Object obj;
        ObjToIntMap objToIntMap = context.iterating;
        if (objToIntMap == null) {
            context.iterating = new ObjToIntMap(31);
            z11 = true;
            has = false;
        } else {
            has = objToIntMap.has(scriptable2);
            z11 = false;
        }
        StringBuffer stringBuffer = new StringBuffer(128);
        if (z11) {
            stringBuffer.append(j.f81006c);
        }
        stringBuffer.append(b.f69927i);
        if (!has) {
            try {
                context.iterating.intern(scriptable2);
                Object[] ids = scriptable2.getIds();
                for (int i11 = 0; i11 < ids.length; i11++) {
                    Object obj2 = ids[i11];
                    if (obj2 instanceof Integer) {
                        int intValue = ((Integer) obj2).intValue();
                        obj = scriptable2.get(intValue, scriptable2);
                        if (obj != Scriptable.NOT_FOUND) {
                            if (i11 > 0) {
                                stringBuffer.append(j2.O);
                            }
                            stringBuffer.append(intValue);
                            stringBuffer.append(':');
                            stringBuffer.append(uneval(context, scriptable, obj));
                        }
                    } else {
                        String str = (String) obj2;
                        obj = scriptable2.get(str, scriptable2);
                        if (obj != Scriptable.NOT_FOUND) {
                            if (i11 > 0) {
                                stringBuffer.append(j2.O);
                            }
                            if (isValidIdentifierName(str)) {
                                stringBuffer.append(str);
                            } else {
                                stringBuffer.append('\'');
                                stringBuffer.append(escapeString(str, '\''));
                                stringBuffer.append('\'');
                            }
                            stringBuffer.append(':');
                            stringBuffer.append(uneval(context, scriptable, obj));
                        }
                    }
                }
            } catch (Throwable th2) {
                if (z11) {
                    context.iterating = null;
                }
                throw th2;
            }
        }
        if (z11) {
            context.iterating = null;
        }
        stringBuffer.append(b.f69928j);
        if (z11) {
            stringBuffer.append(')');
        }
        return stringBuffer.toString();
    }

    public static String defaultObjectToString(Scriptable scriptable) {
        return "[object " + scriptable.getClassName() + b.f69930l;
    }

    public static Object delete(Object obj, Object obj2, Context context) {
        return delete(obj, obj2, context, false);
    }

    public static boolean deleteObjectElem(Scriptable scriptable, Object obj, Context context) {
        boolean has;
        String stringIdOrIndex = toStringIdOrIndex(context, obj);
        if (stringIdOrIndex == null) {
            int lastIndexResult = lastIndexResult(context);
            scriptable.delete(lastIndexResult);
            has = scriptable.has(lastIndexResult, scriptable);
        } else {
            scriptable.delete(stringIdOrIndex);
            has = scriptable.has(stringIdOrIndex, scriptable);
        }
        return !has;
    }

    private static Object doScriptableIncrDecr(Scriptable scriptable, String str, Scriptable scriptable2, Object obj, int i11) {
        double number;
        boolean z11 = (i11 & 2) != 0;
        if (obj instanceof Number) {
            number = ((Number) obj).doubleValue();
        } else {
            number = toNumber(obj);
            if (z11) {
                obj = wrapNumber(number);
            }
        }
        Number wrapNumber = wrapNumber((i11 & 1) == 0 ? number + 1.0d : number - 1.0d);
        scriptable.put(str, scriptable2, wrapNumber);
        return z11 ? obj : wrapNumber;
    }

    public static Object doTopCall(Callable callable, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        if (scriptable == null) {
            throw new IllegalArgumentException();
        }
        if (context.topCallScope != null) {
            throw new IllegalStateException();
        }
        context.topCallScope = ScriptableObject.getTopLevelScope(scriptable);
        context.useDynamicScope = context.hasFeature(7);
        try {
            Object doTopCall = context.getFactory().doTopCall(callable, context, scriptable, scriptable2, objArr);
            context.topCallScope = null;
            context.cachedXMLLib = null;
            if (context.currentActivationCall == null) {
                return doTopCall;
            }
            throw new IllegalStateException();
        } catch (Throwable th2) {
            context.topCallScope = null;
            context.cachedXMLLib = null;
            if (context.currentActivationCall != null) {
                throw new IllegalStateException();
            }
            throw th2;
        }
    }

    public static Object elemIncrDecr(Object obj, Object obj2, Context context, int i11) {
        double number;
        Object objectElem = getObjectElem(obj, obj2, context);
        boolean z11 = (i11 & 2) != 0;
        if (objectElem instanceof Number) {
            number = ((Number) objectElem).doubleValue();
        } else {
            number = toNumber(objectElem);
            if (z11) {
                objectElem = wrapNumber(number);
            }
        }
        Number wrapNumber = wrapNumber((i11 & 1) == 0 ? number + 1.0d : number - 1.0d);
        setObjectElem(obj, obj2, wrapNumber, context);
        return z11 ? objectElem : wrapNumber;
    }

    public static void enterActivationFunction(Context context, Scriptable scriptable) {
        if (context.topCallScope == null) {
            throw new IllegalStateException();
        }
        NativeCall nativeCall = (NativeCall) scriptable;
        nativeCall.parentActivationCall = context.currentActivationCall;
        context.currentActivationCall = nativeCall;
    }

    public static Scriptable enterDotQuery(Object obj, Scriptable scriptable) {
        if (obj instanceof XMLObject) {
            return ((XMLObject) obj).enterDotQuery(scriptable);
        }
        throw notXmlError(obj);
    }

    public static Scriptable enterWith(Object obj, Context context, Scriptable scriptable) {
        Scriptable objectOrNull = toObjectOrNull(context, obj);
        if (objectOrNull != null) {
            return objectOrNull instanceof XMLObject ? ((XMLObject) objectOrNull).enterWith(scriptable) : new NativeWith(scriptable, objectOrNull);
        }
        throw typeError1("msg.undef.with", toString(obj));
    }

    private static void enumChangeObject(IdEnumeration idEnumeration) {
        Object[] objArr;
        Object[] objArr2 = null;
        while (true) {
            Scriptable scriptable = idEnumeration.obj;
            if (scriptable == null) {
                break;
            }
            objArr2 = scriptable.getIds();
            if (objArr2.length != 0) {
                break;
            } else {
                idEnumeration.obj = idEnumeration.obj.getPrototype();
            }
        }
        if (idEnumeration.obj != null && (objArr = idEnumeration.ids) != null) {
            int length = objArr.length;
            if (idEnumeration.used == null) {
                idEnumeration.used = new ObjToIntMap(length);
            }
            for (int i11 = 0; i11 != length; i11++) {
                idEnumeration.used.intern(objArr[i11]);
            }
        }
        idEnumeration.ids = objArr2;
        idEnumeration.index = 0;
    }

    public static Object enumId(Object obj, Context context) {
        IdEnumeration idEnumeration = (IdEnumeration) obj;
        if (idEnumeration.iterator != null) {
            return idEnumeration.currentId;
        }
        int i11 = idEnumeration.enumType;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 != 4) {
                            if (i11 != 5) {
                                throw Kit.codeBug();
                            }
                        }
                    }
                }
                return context.newArray(ScriptableObject.getTopLevelScope(idEnumeration.obj), new Object[]{idEnumeration.currentId, enumValue(obj, context)});
            }
            return enumValue(obj, context);
        }
        return idEnumeration.currentId;
    }

    public static Object enumInit(Object obj, Context context, boolean z11) {
        return enumInit(obj, context, z11 ? 1 : 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0094, code lost:
    
        return java.lang.Boolean.TRUE;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Boolean enumNext(java.lang.Object r5) {
        /*
            org.mozilla.javascript.ScriptRuntime$IdEnumeration r5 = (org.mozilla.javascript.ScriptRuntime.IdEnumeration) r5
            org.mozilla.javascript.Scriptable r0 = r5.iterator
            if (r0 == 0) goto L39
            java.lang.String r1 = "next"
            java.lang.Object r0 = org.mozilla.javascript.ScriptableObject.getProperty(r0, r1)
            boolean r1 = r0 instanceof org.mozilla.javascript.Callable
            if (r1 != 0) goto L13
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            return r5
        L13:
            org.mozilla.javascript.Callable r0 = (org.mozilla.javascript.Callable) r0
            org.mozilla.javascript.Context r1 = org.mozilla.javascript.Context.getContext()
            org.mozilla.javascript.Scriptable r2 = r5.iterator     // Catch: org.mozilla.javascript.JavaScriptException -> L2c
            org.mozilla.javascript.Scriptable r2 = r2.getParentScope()     // Catch: org.mozilla.javascript.JavaScriptException -> L2c
            org.mozilla.javascript.Scriptable r3 = r5.iterator     // Catch: org.mozilla.javascript.JavaScriptException -> L2c
            java.lang.Object[] r4 = org.mozilla.javascript.ScriptRuntime.emptyArgs     // Catch: org.mozilla.javascript.JavaScriptException -> L2c
            java.lang.Object r0 = r0.call(r1, r2, r3, r4)     // Catch: org.mozilla.javascript.JavaScriptException -> L2c
            r5.currentId = r0     // Catch: org.mozilla.javascript.JavaScriptException -> L2c
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch: org.mozilla.javascript.JavaScriptException -> L2c
            return r5
        L2c:
            r5 = move-exception
            java.lang.Object r0 = r5.getValue()
            boolean r0 = r0 instanceof org.mozilla.javascript.NativeIterator.StopIteration
            if (r0 == 0) goto L38
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            return r5
        L38:
            throw r5
        L39:
            org.mozilla.javascript.Scriptable r0 = r5.obj
            if (r0 != 0) goto L40
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            return r5
        L40:
            int r1 = r5.index
            java.lang.Object[] r2 = r5.ids
            int r3 = r2.length
            if (r1 != r3) goto L51
            org.mozilla.javascript.Scriptable r0 = r0.getPrototype()
            r5.obj = r0
            enumChangeObject(r5)
            goto L39
        L51:
            int r0 = r1 + 1
            r5.index = r0
            r0 = r2[r1]
            org.mozilla.javascript.ObjToIntMap r1 = r5.used
            if (r1 == 0) goto L62
            boolean r1 = r1.has(r0)
            if (r1 == 0) goto L62
            goto L39
        L62:
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L74
            java.lang.String r0 = (java.lang.String) r0
            org.mozilla.javascript.Scriptable r1 = r5.obj
            boolean r1 = r1.has(r0, r1)
            if (r1 != 0) goto L71
            goto L39
        L71:
            r5.currentId = r0
            goto L92
        L74:
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            org.mozilla.javascript.Scriptable r1 = r5.obj
            boolean r1 = r1.has(r0, r1)
            if (r1 != 0) goto L83
            goto L39
        L83:
            boolean r1 = r5.enumNumbers
            if (r1 == 0) goto L8c
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L90
        L8c:
            java.lang.String r0 = java.lang.String.valueOf(r0)
        L90:
            r5.currentId = r0
        L92:
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mozilla.javascript.ScriptRuntime.enumNext(java.lang.Object):java.lang.Boolean");
    }

    public static Object enumValue(Object obj, Context context) {
        IdEnumeration idEnumeration = (IdEnumeration) obj;
        String stringIdOrIndex = toStringIdOrIndex(context, idEnumeration.currentId);
        if (stringIdOrIndex != null) {
            Scriptable scriptable = idEnumeration.obj;
            return scriptable.get(stringIdOrIndex, scriptable);
        }
        int lastIndexResult = lastIndexResult(context);
        Scriptable scriptable2 = idEnumeration.obj;
        return scriptable2.get(lastIndexResult, scriptable2);
    }

    public static boolean eq(Object obj, Object obj2) {
        Object equivalentValues;
        Object equivalentValues2;
        Object equivalentValues3;
        Object equivalentValues4;
        Object equivalentValues5;
        if (obj == null || obj == Undefined.instance) {
            if (obj2 == null || obj2 == Undefined.instance) {
                return true;
            }
            if (!(obj2 instanceof ScriptableObject) || (equivalentValues = ((ScriptableObject) obj2).equivalentValues(obj)) == Scriptable.NOT_FOUND) {
                return false;
            }
            return ((Boolean) equivalentValues).booleanValue();
        }
        if (obj instanceof Number) {
            return eqNumber(((Number) obj).doubleValue(), obj2);
        }
        if (obj == obj2) {
            return true;
        }
        if (obj instanceof CharSequence) {
            return eqString((CharSequence) obj, obj2);
        }
        if (obj instanceof Boolean) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            if (obj2 instanceof Boolean) {
                return booleanValue == ((Boolean) obj2).booleanValue();
            }
            if (!(obj2 instanceof ScriptableObject) || (equivalentValues5 = ((ScriptableObject) obj2).equivalentValues(obj)) == Scriptable.NOT_FOUND) {
                return eqNumber(booleanValue ? 1.0d : 0.0d, obj2);
            }
            return ((Boolean) equivalentValues5).booleanValue();
        }
        if (!(obj instanceof Scriptable)) {
            warnAboutNonJSObject(obj);
            return obj == obj2;
        }
        if (!(obj2 instanceof Scriptable)) {
            if (obj2 instanceof Boolean) {
                if (!(obj instanceof ScriptableObject) || (equivalentValues2 = ((ScriptableObject) obj).equivalentValues(obj2)) == Scriptable.NOT_FOUND) {
                    return eqNumber(((Boolean) obj2).booleanValue() ? 1.0d : 0.0d, obj);
                }
                return ((Boolean) equivalentValues2).booleanValue();
            }
            if (obj2 instanceof Number) {
                return eqNumber(((Number) obj2).doubleValue(), obj);
            }
            if (obj2 instanceof CharSequence) {
                return eqString((CharSequence) obj2, obj);
            }
            return false;
        }
        if ((obj instanceof ScriptableObject) && (equivalentValues4 = ((ScriptableObject) obj).equivalentValues(obj2)) != Scriptable.NOT_FOUND) {
            return ((Boolean) equivalentValues4).booleanValue();
        }
        if ((obj2 instanceof ScriptableObject) && (equivalentValues3 = ((ScriptableObject) obj2).equivalentValues(obj)) != Scriptable.NOT_FOUND) {
            return ((Boolean) equivalentValues3).booleanValue();
        }
        if (!(obj instanceof Wrapper) || !(obj2 instanceof Wrapper)) {
            return false;
        }
        Object unwrap = ((Wrapper) obj).unwrap();
        Object unwrap2 = ((Wrapper) obj2).unwrap();
        return unwrap == unwrap2 || (isPrimitive(unwrap) && isPrimitive(unwrap2) && eq(unwrap, unwrap2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0064, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean eqNumber(double r5, java.lang.Object r7) {
        /*
        L0:
            r0 = 0
            if (r7 == 0) goto L64
            java.lang.Object r1 = org.mozilla.javascript.Undefined.instance
            if (r7 != r1) goto L8
            goto L64
        L8:
            boolean r1 = r7 instanceof java.lang.Number
            r2 = 1
            if (r1 == 0) goto L19
            java.lang.Number r7 = (java.lang.Number) r7
            double r3 = r7.doubleValue()
            int r5 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r5 != 0) goto L18
            return r2
        L18:
            return r0
        L19:
            boolean r1 = r7 instanceof java.lang.CharSequence
            if (r1 == 0) goto L27
            double r3 = toNumber(r7)
            int r5 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r5 != 0) goto L26
            return r2
        L26:
            return r0
        L27:
            boolean r1 = r7 instanceof java.lang.Boolean
            if (r1 == 0) goto L3e
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L36
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            goto L38
        L36:
            r3 = 0
        L38:
            int r5 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r5 != 0) goto L3d
            return r2
        L3d:
            return r0
        L3e:
            boolean r1 = r7 instanceof org.mozilla.javascript.Scriptable
            if (r1 == 0) goto L61
            boolean r0 = r7 instanceof org.mozilla.javascript.ScriptableObject
            if (r0 == 0) goto L5c
            java.lang.Number r0 = wrapNumber(r5)
            r1 = r7
            org.mozilla.javascript.ScriptableObject r1 = (org.mozilla.javascript.ScriptableObject) r1
            java.lang.Object r0 = r1.equivalentValues(r0)
            java.lang.Object r1 = org.mozilla.javascript.Scriptable.NOT_FOUND
            if (r0 == r1) goto L5c
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r5 = r0.booleanValue()
            return r5
        L5c:
            java.lang.Object r7 = toPrimitive(r7)
            goto L0
        L61:
            warnAboutNonJSObject(r7)
        L64:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mozilla.javascript.ScriptRuntime.eqNumber(double, java.lang.Object):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0088, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean eqString(java.lang.CharSequence r5, java.lang.Object r6) {
        /*
        L0:
            r0 = 0
            if (r6 == 0) goto L88
            java.lang.Object r1 = org.mozilla.javascript.Undefined.instance
            if (r6 != r1) goto L9
            goto L88
        L9:
            boolean r1 = r6 instanceof java.lang.CharSequence
            r2 = 1
            if (r1 == 0) goto L2a
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            int r1 = r5.length()
            int r3 = r6.length()
            if (r1 != r3) goto L29
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = r6.toString()
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L29
            return r2
        L29:
            return r0
        L2a:
            boolean r1 = r6 instanceof java.lang.Number
            if (r1 == 0) goto L42
            java.lang.String r5 = r5.toString()
            double r3 = toNumber(r5)
            java.lang.Number r6 = (java.lang.Number) r6
            double r5 = r6.doubleValue()
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 != 0) goto L41
            return r2
        L41:
            return r0
        L42:
            boolean r1 = r6 instanceof java.lang.Boolean
            if (r1 == 0) goto L61
            java.lang.String r5 = r5.toString()
            double r3 = toNumber(r5)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r5 = r6.booleanValue()
            if (r5 == 0) goto L59
            r5 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            goto L5b
        L59:
            r5 = 0
        L5b:
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 != 0) goto L60
            return r2
        L60:
            return r0
        L61:
            boolean r1 = r6 instanceof org.mozilla.javascript.Scriptable
            if (r1 == 0) goto L85
            boolean r0 = r6 instanceof org.mozilla.javascript.ScriptableObject
            if (r0 == 0) goto L7f
            r0 = r6
            org.mozilla.javascript.ScriptableObject r0 = (org.mozilla.javascript.ScriptableObject) r0
            java.lang.String r1 = r5.toString()
            java.lang.Object r0 = r0.equivalentValues(r1)
            java.lang.Object r1 = org.mozilla.javascript.Scriptable.NOT_FOUND
            if (r0 == r1) goto L7f
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r5 = r0.booleanValue()
            return r5
        L7f:
            java.lang.Object r6 = toPrimitive(r6)
            goto L0
        L85:
            warnAboutNonJSObject(r6)
        L88:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mozilla.javascript.ScriptRuntime.eqString(java.lang.CharSequence, java.lang.Object):boolean");
    }

    private static RuntimeException errorWithClassName(String str, Object obj) {
        return Context.reportRuntimeError1(str, obj.getClass().getName());
    }

    public static String escapeAttributeValue(Object obj, Context context) {
        return currentXMLLib(context).escapeAttributeValue(obj);
    }

    public static String escapeString(String str) {
        return escapeString(str, '\"');
    }

    public static String escapeTextValue(Object obj, Context context) {
        return currentXMLLib(context).escapeTextValue(obj);
    }

    public static Object evalSpecial(Context context, Scriptable scriptable, Object obj, Object[] objArr, String str, int i11) {
        if (objArr.length < 1) {
            return Undefined.instance;
        }
        Object obj2 = objArr[0];
        if (!(obj2 instanceof CharSequence)) {
            if (context.hasFeature(11) || context.hasFeature(9)) {
                throw Context.reportRuntimeError0("msg.eval.nonstring.strict");
            }
            Context.reportWarning(getMessage0("msg.eval.nonstring"));
            return obj2;
        }
        if (str == null) {
            int[] iArr = new int[1];
            String sourcePositionFromStack = Context.getSourcePositionFromStack(iArr);
            if (sourcePositionFromStack != null) {
                i11 = iArr[0];
                str = sourcePositionFromStack;
            } else {
                str = "";
            }
        }
        String makeUrlForGeneratedScript = makeUrlForGeneratedScript(true, str, i11);
        ErrorReporter forEval = DefaultErrorReporter.forEval(context.getErrorReporter());
        Evaluator createInterpreter = Context.createInterpreter();
        if (createInterpreter == null) {
            throw new JavaScriptException("Interpreter not present", str, i11);
        }
        Script compileString = context.compileString(obj2.toString(), createInterpreter, forEval, makeUrlForGeneratedScript, 1, null);
        createInterpreter.setEvalScriptFlag(compileString);
        return ((Callable) compileString).call(context, scriptable, (Scriptable) obj, emptyArgs);
    }

    public static void exitActivationFunction(Context context) {
        NativeCall nativeCall = context.currentActivationCall;
        context.currentActivationCall = nativeCall.parentActivationCall;
        nativeCall.parentActivationCall = null;
    }

    public static NativeCall findFunctionActivation(Context context, Function function) {
        for (NativeCall nativeCall = context.currentActivationCall; nativeCall != null; nativeCall = nativeCall.parentActivationCall) {
            if (nativeCall.function == function) {
                return nativeCall;
            }
        }
        return null;
    }

    public static Object[] getApplyArguments(Context context, Object obj) {
        if (obj == null || obj == Undefined.instance) {
            return emptyArgs;
        }
        if ((obj instanceof NativeArray) || (obj instanceof Arguments)) {
            return context.getElements((Scriptable) obj);
        }
        throw typeError0("msg.arg.isnt.array");
    }

    public static Object[] getArrayElements(Scriptable scriptable) {
        long lengthProperty = NativeArray.getLengthProperty(Context.getContext(), scriptable);
        if (lengthProperty > SieveCacheKt.NodeLinkMask) {
            throw new IllegalArgumentException();
        }
        int i11 = (int) lengthProperty;
        if (i11 == 0) {
            return emptyArgs;
        }
        Object[] objArr = new Object[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            Object property = ScriptableObject.getProperty(scriptable, i12);
            if (property == Scriptable.NOT_FOUND) {
                property = Undefined.instance;
            }
            objArr[i12] = property;
        }
        return objArr;
    }

    public static Callable getCallable(Scriptable scriptable) {
        if (scriptable instanceof Callable) {
            return (Callable) scriptable;
        }
        Object defaultValue = scriptable.getDefaultValue(FunctionClass);
        if (defaultValue instanceof Callable) {
            return (Callable) defaultValue;
        }
        throw notFunctionError(defaultValue, scriptable);
    }

    public static Callable getElemFunctionAndThis(Object obj, Object obj2, Context context) {
        String stringIdOrIndex = toStringIdOrIndex(context, obj2);
        if (stringIdOrIndex != null) {
            return getPropFunctionAndThis(obj, stringIdOrIndex, context);
        }
        int lastIndexResult = lastIndexResult(context);
        Scriptable objectOrNull = toObjectOrNull(context, obj);
        if (objectOrNull == null) {
            throw undefCallError(obj, String.valueOf(lastIndexResult));
        }
        Object property = ScriptableObject.getProperty(objectOrNull, lastIndexResult);
        if (!(property instanceof Callable)) {
            throw notFunctionError(property, obj2);
        }
        storeScriptable(context, objectOrNull);
        return (Callable) property;
    }

    public static Function getExistingCtor(Context context, Scriptable scriptable, String str) {
        Object property = ScriptableObject.getProperty(scriptable, str);
        if (property instanceof Function) {
            return (Function) property;
        }
        if (property == Scriptable.NOT_FOUND) {
            throw Context.reportRuntimeError1("msg.ctor.not.found", str);
        }
        throw Context.reportRuntimeError1("msg.not.ctor", str);
    }

    public static ScriptableObject getGlobal(Context context) {
        Class<?> classOrNull = Kit.classOrNull("org.mozilla.javascript.tools.shell.Global");
        if (classOrNull != null) {
            try {
                return (ScriptableObject) classOrNull.getConstructor(ContextClass).newInstance(context);
            } catch (RuntimeException e11) {
                throw e11;
            } catch (Exception unused) {
            }
        }
        return new ImporterTopLevel(context);
    }

    public static Object getIndexObject(String str) {
        long indexFromString = indexFromString(str);
        return indexFromString >= 0 ? Integer.valueOf((int) indexFromString) : str;
    }

    public static ScriptableObject getLibraryScopeOrNull(Scriptable scriptable) {
        return (ScriptableObject) ScriptableObject.getTopScopeValue(scriptable, LIBRARY_SCOPE_KEY);
    }

    public static String getMessage(String str, Object[] objArr) {
        return messageProvider.getMessage(str, objArr);
    }

    public static String getMessage0(String str) {
        return getMessage(str, null);
    }

    public static String getMessage1(String str, Object obj) {
        return getMessage(str, new Object[]{obj});
    }

    public static String getMessage2(String str, Object obj, Object obj2) {
        return getMessage(str, new Object[]{obj, obj2});
    }

    public static String getMessage3(String str, Object obj, Object obj2, Object obj3) {
        return getMessage(str, new Object[]{obj, obj2, obj3});
    }

    public static String getMessage4(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        return getMessage(str, new Object[]{obj, obj2, obj3, obj4});
    }

    public static Callable getNameFunctionAndThis(String str, Context context, Scriptable scriptable) {
        Scriptable parentScope = scriptable.getParentScope();
        if (parentScope != null) {
            return (Callable) nameOrFunction(context, scriptable, parentScope, str, true);
        }
        Object obj = topScopeName(context, scriptable, str);
        if (obj instanceof Callable) {
            storeScriptable(context, scriptable);
            return (Callable) obj;
        }
        if (obj == Scriptable.NOT_FOUND) {
            throw notFoundError(scriptable, str);
        }
        throw notFunctionError(obj, str);
    }

    public static Object getObjectElem(Object obj, Object obj2, Context context) {
        return getObjectElem(obj, obj2, context, getTopCallScope(context));
    }

    public static Object getObjectIndex(Object obj, double d11, Context context) {
        Scriptable objectOrNull = toObjectOrNull(context, obj);
        if (objectOrNull == null) {
            throw undefReadError(obj, toString(d11));
        }
        int i11 = (int) d11;
        return ((double) i11) == d11 ? getObjectIndex(objectOrNull, i11, context) : getObjectProp(objectOrNull, toString(d11), context);
    }

    public static Object getObjectProp(Object obj, String str, Context context) {
        Scriptable objectOrNull = toObjectOrNull(context, obj);
        if (objectOrNull != null) {
            return getObjectProp(objectOrNull, str, context);
        }
        throw undefReadError(obj, str);
    }

    public static Object getObjectPropNoWarn(Object obj, String str, Context context) {
        Scriptable objectOrNull = toObjectOrNull(context, obj);
        if (objectOrNull == null) {
            throw undefReadError(obj, str);
        }
        Object property = ScriptableObject.getProperty(objectOrNull, str);
        return property == Scriptable.NOT_FOUND ? Undefined.instance : property;
    }

    public static Callable getPropFunctionAndThis(Object obj, String str, Context context) {
        return getPropFunctionAndThisHelper(obj, str, context, toObjectOrNull(context, obj));
    }

    private static Callable getPropFunctionAndThisHelper(Object obj, String str, Context context, Scriptable scriptable) {
        if (scriptable == null) {
            throw undefCallError(obj, str);
        }
        Object property = ScriptableObject.getProperty(scriptable, str);
        if (!(property instanceof Callable)) {
            Object property2 = ScriptableObject.getProperty(scriptable, "__noSuchMethod__");
            if (property2 instanceof Callable) {
                property = new NoSuchMethodShim((Callable) property2, str);
            }
        }
        if (!(property instanceof Callable)) {
            throw notFunctionError(scriptable, property, str);
        }
        storeScriptable(context, scriptable);
        return (Callable) property;
    }

    public static RegExpProxy getRegExpProxy(Context context) {
        return context.getRegExpProxy();
    }

    public static Scriptable getTopCallScope(Context context) {
        Scriptable scriptable = context.topCallScope;
        if (scriptable != null) {
            return scriptable;
        }
        throw new IllegalStateException();
    }

    public static Object getTopLevelProp(Scriptable scriptable, String str) {
        return ScriptableObject.getProperty(ScriptableObject.getTopLevelScope(scriptable), str);
    }

    public static String[] getTopPackageNames() {
        return "Dalvik".equals(System.getProperty("java.vm.name")) ? new String[]{"java", "javax", "org", "com", "edu", com.alipay.sdk.m.k.b.f10651k, "android"} : new String[]{"java", "javax", "org", "com", "edu", com.alipay.sdk.m.k.b.f10651k};
    }

    public static Callable getValueFunctionAndThis(Object obj, Context context) {
        if (!(obj instanceof Callable)) {
            throw notFunctionError(obj);
        }
        Callable callable = (Callable) obj;
        Scriptable parentScope = callable instanceof Scriptable ? ((Scriptable) callable).getParentScope() : null;
        if (parentScope == null && (parentScope = context.topCallScope) == null) {
            throw new IllegalStateException();
        }
        if (parentScope.getParentScope() != null && !(parentScope instanceof NativeWith) && (parentScope instanceof NativeCall)) {
            parentScope = ScriptableObject.getTopLevelScope(parentScope);
        }
        storeScriptable(context, parentScope);
        return callable;
    }

    public static boolean hasObjectElem(Scriptable scriptable, Object obj, Context context) {
        String stringIdOrIndex = toStringIdOrIndex(context, obj);
        return stringIdOrIndex == null ? ScriptableObject.hasProperty(scriptable, lastIndexResult(context)) : ScriptableObject.hasProperty(scriptable, stringIdOrIndex);
    }

    public static boolean hasTopCall(Context context) {
        return context.topCallScope != null;
    }

    public static boolean in(Object obj, Object obj2, Context context) {
        if (obj2 instanceof Scriptable) {
            return hasObjectElem((Scriptable) obj2, obj, context);
        }
        throw typeError0("msg.in.not.object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x005a, code lost:
    
        if (r4 <= (r5 != 0 ? 8 : 7)) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long indexFromString(java.lang.String r12) {
        /*
            int r0 = r12.length()
            r1 = -1
            if (r0 <= 0) goto L68
            r3 = 0
            char r4 = r12.charAt(r3)
            r5 = 45
            r6 = 48
            r7 = 1
            if (r4 != r5) goto L20
            if (r0 <= r7) goto L20
            char r4 = r12.charAt(r7)
            if (r4 != r6) goto L1d
            return r1
        L1d:
            r5 = r7
        L1e:
            r8 = r5
            goto L22
        L20:
            r5 = r3
            goto L1e
        L22:
            int r4 = r4 + (-48)
            if (r4 < 0) goto L68
            r9 = 9
            if (r4 > r9) goto L68
            if (r5 == 0) goto L2f
            r10 = 11
            goto L31
        L2f:
            r10 = 10
        L31:
            if (r0 > r10) goto L68
            int r10 = -r4
            int r8 = r8 + r7
            if (r10 == 0) goto L4b
        L37:
            if (r8 == r0) goto L4b
            char r4 = r12.charAt(r8)
            int r4 = r4 - r6
            if (r4 < 0) goto L4b
            if (r4 > r9) goto L4b
            int r3 = r10 * 10
            int r3 = r3 - r4
            int r8 = r8 + 1
            r11 = r10
            r10 = r3
            r3 = r11
            goto L37
        L4b:
            if (r8 != r0) goto L68
            r12 = -214748364(0xfffffffff3333334, float:-1.4197688E31)
            if (r3 > r12) goto L5c
            if (r3 != r12) goto L68
            if (r5 == 0) goto L59
            r12 = 8
            goto L5a
        L59:
            r12 = 7
        L5a:
            if (r4 > r12) goto L68
        L5c:
            if (r5 == 0) goto L5f
            goto L60
        L5f:
            int r10 = -r10
        L60:
            long r0 = (long) r10
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            return r0
        L68:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mozilla.javascript.ScriptRuntime.indexFromString(java.lang.String):long");
    }

    public static void initFunction(Context context, Scriptable scriptable, NativeFunction nativeFunction, int i11, boolean z11) {
        if (i11 == 1) {
            String functionName = nativeFunction.getFunctionName();
            if (functionName == null || functionName.length() == 0) {
                return;
            }
            if (z11) {
                scriptable.put(functionName, scriptable, nativeFunction);
                return;
            } else {
                ScriptableObject.defineProperty(scriptable, functionName, nativeFunction, 4);
                return;
            }
        }
        if (i11 != 3) {
            throw Kit.codeBug();
        }
        String functionName2 = nativeFunction.getFunctionName();
        if (functionName2 == null || functionName2.length() == 0) {
            return;
        }
        while (scriptable instanceof NativeWith) {
            scriptable = scriptable.getParentScope();
        }
        scriptable.put(functionName2, scriptable, nativeFunction);
    }

    public static void initScript(NativeFunction nativeFunction, Scriptable scriptable, Context context, Scriptable scriptable2, boolean z11) {
        if (context.topCallScope == null) {
            throw new IllegalStateException();
        }
        int paramAndVarCount = nativeFunction.getParamAndVarCount();
        if (paramAndVarCount == 0) {
            return;
        }
        Scriptable scriptable3 = scriptable2;
        while (scriptable3 instanceof NativeWith) {
            scriptable3 = scriptable3.getParentScope();
        }
        while (true) {
            int i11 = paramAndVarCount - 1;
            if (paramAndVarCount == 0) {
                return;
            }
            String paramOrVarName = nativeFunction.getParamOrVarName(i11);
            boolean paramOrVarConst = nativeFunction.getParamOrVarConst(i11);
            if (ScriptableObject.hasProperty(scriptable2, paramOrVarName)) {
                ScriptableObject.redefineProperty(scriptable2, paramOrVarName, paramOrVarConst);
            } else if (z11) {
                scriptable3.put(paramOrVarName, scriptable3, Undefined.instance);
            } else if (paramOrVarConst) {
                ScriptableObject.defineConstProperty(scriptable3, paramOrVarName);
            } else {
                ScriptableObject.defineProperty(scriptable3, paramOrVarName, Undefined.instance, 4);
            }
            paramAndVarCount = i11;
        }
    }

    public static ScriptableObject initStandardObjects(Context context, ScriptableObject scriptableObject, boolean z11) {
        if (scriptableObject == null) {
            scriptableObject = new NativeObject();
        }
        ScriptableObject scriptableObject2 = scriptableObject;
        scriptableObject2.associateValue(LIBRARY_SCOPE_KEY, scriptableObject2);
        new ClassCache().associate(scriptableObject2);
        BaseFunction.init(scriptableObject2, z11);
        NativeObject.init(scriptableObject2, z11);
        Scriptable objectPrototype = ScriptableObject.getObjectPrototype(scriptableObject2);
        ScriptableObject.getClassPrototype(scriptableObject2, "Function").setPrototype(objectPrototype);
        if (scriptableObject2.getPrototype() == null) {
            scriptableObject2.setPrototype(objectPrototype);
        }
        NativeError.init(scriptableObject2, z11);
        NativeGlobal.init(context, scriptableObject2, z11);
        NativeArray.init(scriptableObject2, z11);
        if (context.getOptimizationLevel() > 0) {
            NativeArray.setMaximumInitialCapacity(c.f87471c);
        }
        NativeString.init(scriptableObject2, z11);
        NativeBoolean.init(scriptableObject2, z11);
        NativeNumber.init(scriptableObject2, z11);
        NativeDate.init(scriptableObject2, z11);
        NativeMath.init(scriptableObject2, z11);
        NativeJSON.init(scriptableObject2, z11);
        NativeWith.init(scriptableObject2, z11);
        NativeCall.init(scriptableObject2, z11);
        NativeScript.init(scriptableObject2, z11);
        NativeIterator.init(scriptableObject2, z11);
        boolean z12 = context.hasFeature(6) && context.getE4xImplementationFactory() != null;
        new LazilyLoadedCtor(scriptableObject2, "RegExp", "org.mozilla.javascript.regexp.NativeRegExp", z11, true);
        new LazilyLoadedCtor(scriptableObject2, "Packages", "org.mozilla.javascript.NativeJavaTopPackage", z11, true);
        new LazilyLoadedCtor(scriptableObject2, "getClass", "org.mozilla.javascript.NativeJavaTopPackage", z11, true);
        new LazilyLoadedCtor(scriptableObject2, "JavaAdapter", "org.mozilla.javascript.JavaAdapter", z11, true);
        new LazilyLoadedCtor(scriptableObject2, "JavaImporter", "org.mozilla.javascript.ImporterTopLevel", z11, true);
        new LazilyLoadedCtor(scriptableObject2, "Continuation", "org.mozilla.javascript.NativeContinuation", z11, true);
        for (String str : getTopPackageNames()) {
            new LazilyLoadedCtor(scriptableObject2, str, "org.mozilla.javascript.NativeJavaTopPackage", z11, true);
        }
        if (z12) {
            String implementationClassName = context.getE4xImplementationFactory().getImplementationClassName();
            new LazilyLoadedCtor(scriptableObject2, "XML", implementationClassName, z11, true);
            new LazilyLoadedCtor(scriptableObject2, "XMLList", implementationClassName, z11, true);
            new LazilyLoadedCtor(scriptableObject2, "Namespace", implementationClassName, z11, true);
            new LazilyLoadedCtor(scriptableObject2, "QName", implementationClassName, z11, true);
        }
        if (scriptableObject2 instanceof TopLevel) {
            ((TopLevel) scriptableObject2).cacheBuiltins();
        }
        return scriptableObject2;
    }

    public static boolean instanceOf(Object obj, Object obj2, Context context) {
        if (!(obj2 instanceof Scriptable)) {
            throw typeError0("msg.instanceof.not.object");
        }
        if (obj instanceof Scriptable) {
            return ((Scriptable) obj2).hasInstance((Scriptable) obj);
        }
        return false;
    }

    public static boolean isArrayObject(Object obj) {
        return (obj instanceof NativeArray) || (obj instanceof Arguments);
    }

    public static boolean isGeneratedScript(String str) {
        return str.indexOf("(eval)") >= 0 || str.indexOf("(Function)") >= 0;
    }

    public static boolean isJSLineTerminator(int i11) {
        if ((57296 & i11) != 0) {
            return false;
        }
        return i11 == 10 || i11 == 13 || i11 == 8232 || i11 == 8233;
    }

    public static boolean isJSWhitespaceOrLineTerminator(int i11) {
        return isStrWhiteSpaceChar(i11) || isJSLineTerminator(i11);
    }

    public static boolean isPrimitive(Object obj) {
        return obj == null || obj == Undefined.instance || (obj instanceof Number) || (obj instanceof String) || (obj instanceof Boolean);
    }

    public static boolean isRhinoRuntimeType(Class<?> cls) {
        return cls.isPrimitive() ? cls != Character.TYPE : cls == StringClass || cls == BooleanClass || NumberClass.isAssignableFrom(cls) || ScriptableClass.isAssignableFrom(cls);
    }

    public static boolean isSpecialProperty(String str) {
        return str.equals("__proto__") || str.equals("__parent__");
    }

    public static boolean isStrWhiteSpaceChar(int i11) {
        if (i11 != 32 && i11 != 160 && i11 != 65279 && i11 != 8232 && i11 != 8233) {
            switch (i11) {
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                    break;
                default:
                    if (Character.getType(i11) == 12) {
                    }
                    break;
            }
            return true;
        }
        return true;
    }

    public static boolean isValidIdentifierName(String str) {
        int length = str.length();
        if (length == 0 || !Character.isJavaIdentifierStart(str.charAt(0))) {
            return false;
        }
        for (int i11 = 1; i11 != length; i11++) {
            if (!Character.isJavaIdentifierPart(str.charAt(i11))) {
                return false;
            }
        }
        return !TokenStream.isKeyword(str);
    }

    private static boolean isVisible(Context context, Object obj) {
        ClassShutter classShutter = context.getClassShutter();
        return classShutter == null || classShutter.visibleToScripts(obj.getClass().getName());
    }

    public static boolean jsDelegatesTo(Scriptable scriptable, Scriptable scriptable2) {
        for (Scriptable prototype = scriptable.getPrototype(); prototype != null; prototype = prototype.getPrototype()) {
            if (prototype.equals(scriptable2)) {
                return true;
            }
        }
        return false;
    }

    public static int lastIndexResult(Context context) {
        return context.scratchIndex;
    }

    public static Scriptable lastStoredScriptable(Context context) {
        Scriptable scriptable = context.scratchScriptable;
        context.scratchScriptable = null;
        return scriptable;
    }

    public static long lastUint32Result(Context context) {
        long j11 = context.scratchUint32;
        if ((j11 >>> 32) == 0) {
            return j11;
        }
        throw new IllegalStateException();
    }

    public static Scriptable leaveDotQuery(Scriptable scriptable) {
        return ((NativeWith) scriptable).getParentScope();
    }

    public static Scriptable leaveWith(Scriptable scriptable) {
        return ((NativeWith) scriptable).getParentScope();
    }

    public static String makeUrlForGeneratedScript(boolean z11, String str, int i11) {
        if (z11) {
            return str + '#' + i11 + "(eval)";
        }
        return str + '#' + i11 + "(Function)";
    }

    public static Ref memberRef(Object obj, Object obj2, Context context, int i11) {
        if (obj instanceof XMLObject) {
            return ((XMLObject) obj).memberRef(context, obj2, i11);
        }
        throw notXmlError(obj);
    }

    public static Object name(Context context, Scriptable scriptable, String str) {
        Scriptable parentScope = scriptable.getParentScope();
        if (parentScope != null) {
            return nameOrFunction(context, scriptable, parentScope, str, false);
        }
        Object obj = topScopeName(context, scriptable, str);
        if (obj != Scriptable.NOT_FOUND) {
            return obj;
        }
        throw notFoundError(scriptable, str);
    }

    public static Object nameIncrDecr(Scriptable scriptable, String str, int i11) {
        return nameIncrDecr(scriptable, str, Context.getContext(), i11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0027, code lost:
    
        r6 = r2;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0075 A[LOOP:0: B:2:0x0002->B:12:0x0075, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.Object nameOrFunction(org.mozilla.javascript.Context r5, org.mozilla.javascript.Scriptable r6, org.mozilla.javascript.Scriptable r7, java.lang.String r8, boolean r9) {
        /*
            r0 = 0
            r1 = r6
        L2:
            boolean r2 = r1 instanceof org.mozilla.javascript.NativeWith
            if (r2 == 0) goto L29
            org.mozilla.javascript.Scriptable r1 = r1.getPrototype()
            boolean r2 = r1 instanceof org.mozilla.javascript.xml.XMLObject
            if (r2 == 0) goto L1f
            org.mozilla.javascript.xml.XMLObject r1 = (org.mozilla.javascript.xml.XMLObject) r1
            boolean r2 = r1.has(r8, r1)
            if (r2 == 0) goto L1b
            java.lang.Object r6 = r1.get(r8, r1)
            goto L65
        L1b:
            if (r0 != 0) goto L48
            r0 = r1
            goto L48
        L1f:
            java.lang.Object r2 = org.mozilla.javascript.ScriptableObject.getProperty(r1, r8)
            java.lang.Object r3 = org.mozilla.javascript.Scriptable.NOT_FOUND
            if (r2 == r3) goto L48
        L27:
            r6 = r2
            goto L65
        L29:
            boolean r2 = r1 instanceof org.mozilla.javascript.NativeCall
            if (r2 == 0) goto L3f
            java.lang.Object r1 = r1.get(r8, r1)
            java.lang.Object r2 = org.mozilla.javascript.Scriptable.NOT_FOUND
            if (r1 == r2) goto L48
            if (r9 == 0) goto L3b
            org.mozilla.javascript.Scriptable r6 = org.mozilla.javascript.ScriptableObject.getTopLevelScope(r7)
        L3b:
            r4 = r1
            r1 = r6
            r6 = r4
            goto L65
        L3f:
            java.lang.Object r2 = org.mozilla.javascript.ScriptableObject.getProperty(r1, r8)
            java.lang.Object r3 = org.mozilla.javascript.Scriptable.NOT_FOUND
            if (r2 == r3) goto L48
            goto L27
        L48:
            org.mozilla.javascript.Scriptable r1 = r7.getParentScope()
            if (r1 != 0) goto L75
            java.lang.Object r6 = topScopeName(r5, r7, r8)
            java.lang.Object r1 = org.mozilla.javascript.Scriptable.NOT_FOUND
            if (r6 != r1) goto L64
            if (r0 == 0) goto L5f
            if (r9 != 0) goto L5f
            java.lang.Object r6 = r0.get(r8, r0)
            goto L64
        L5f:
            java.lang.RuntimeException r5 = notFoundError(r7, r8)
            throw r5
        L64:
            r1 = r7
        L65:
            if (r9 == 0) goto L74
            boolean r7 = r6 instanceof org.mozilla.javascript.Callable
            if (r7 == 0) goto L6f
            storeScriptable(r5, r1)
            return r6
        L6f:
            java.lang.RuntimeException r5 = notFunctionError(r6, r8)
            throw r5
        L74:
            return r6
        L75:
            r4 = r1
            r1 = r7
            r7 = r4
            goto L2
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mozilla.javascript.ScriptRuntime.nameOrFunction(org.mozilla.javascript.Context, org.mozilla.javascript.Scriptable, org.mozilla.javascript.Scriptable, java.lang.String, boolean):java.lang.Object");
    }

    public static Ref nameRef(Object obj, Context context, Scriptable scriptable, int i11) {
        return currentXMLLib(context).nameRef(context, obj, scriptable, i11);
    }

    public static Scriptable newArrayLiteral(Object[] objArr, int[] iArr, Context context, Scriptable scriptable) {
        int length = objArr.length;
        int i11 = 0;
        int length2 = iArr != null ? iArr.length : 0;
        int i12 = length + length2;
        if (i12 <= 1 || length2 * 2 >= i12) {
            Scriptable newArray = context.newArray(scriptable, i12);
            int i13 = 0;
            int i14 = 0;
            while (i11 != i12) {
                if (i13 == length2 || iArr[i13] != i11) {
                    ScriptableObject.putProperty(newArray, i11, objArr[i14]);
                    i14++;
                } else {
                    i13++;
                }
                i11++;
            }
            return newArray;
        }
        if (length2 != 0) {
            Object[] objArr2 = new Object[i12];
            int i15 = 0;
            int i16 = 0;
            while (i11 != i12) {
                if (i15 == length2 || iArr[i15] != i11) {
                    objArr2[i11] = objArr[i16];
                    i16++;
                } else {
                    objArr2[i11] = Scriptable.NOT_FOUND;
                    i15++;
                }
                i11++;
            }
            objArr = objArr2;
        }
        return context.newArray(scriptable, objArr);
    }

    public static Scriptable newBuiltinObject(Context context, Scriptable scriptable, TopLevel.Builtins builtins, Object[] objArr) {
        Scriptable topLevelScope = ScriptableObject.getTopLevelScope(scriptable);
        Function builtinCtor = TopLevel.getBuiltinCtor(context, topLevelScope, builtins);
        if (objArr == null) {
            objArr = emptyArgs;
        }
        return builtinCtor.construct(context, topLevelScope, objArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static org.mozilla.javascript.Scriptable newCatchScope(java.lang.Throwable r11, org.mozilla.javascript.Scriptable r12, java.lang.String r13, org.mozilla.javascript.Context r14, org.mozilla.javascript.Scriptable r15) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mozilla.javascript.ScriptRuntime.newCatchScope(java.lang.Throwable, org.mozilla.javascript.Scriptable, java.lang.String, org.mozilla.javascript.Context, org.mozilla.javascript.Scriptable):org.mozilla.javascript.Scriptable");
    }

    public static Scriptable newObject(Context context, Scriptable scriptable, String str, Object[] objArr) {
        Scriptable topLevelScope = ScriptableObject.getTopLevelScope(scriptable);
        Function existingCtor = getExistingCtor(context, topLevelScope, str);
        if (objArr == null) {
            objArr = emptyArgs;
        }
        return existingCtor.construct(context, topLevelScope, objArr);
    }

    public static Scriptable newObjectLiteral(Object[] objArr, Object[] objArr2, Context context, Scriptable scriptable) {
        return newObjectLiteral(objArr, objArr2, null, context, scriptable);
    }

    public static Object newSpecial(Context context, Object obj, Object[] objArr, Scriptable scriptable, int i11) {
        if (i11 == 1) {
            if (NativeGlobal.isEvalFunction(obj)) {
                throw typeError1("msg.not.ctor", "eval");
            }
        } else {
            if (i11 != 2) {
                throw Kit.codeBug();
            }
            if (NativeWith.isWithFunction(obj)) {
                return NativeWith.newWithSpecial(context, scriptable, objArr);
            }
        }
        return newObject(obj, context, scriptable, objArr);
    }

    public static RuntimeException notFoundError(Scriptable scriptable, String str) {
        throw constructError("ReferenceError", getMessage1("msg.is.not.defined", str));
    }

    public static RuntimeException notFunctionError(Object obj) {
        return notFunctionError(obj, obj);
    }

    private static RuntimeException notXmlError(Object obj) {
        throw typeError1("msg.isnt.xml.object", toString(obj));
    }

    public static String numberToString(double d11, int i11) {
        if (d11 != d11) {
            return "NaN";
        }
        if (d11 == Double.POSITIVE_INFINITY) {
            return "Infinity";
        }
        if (d11 == Double.NEGATIVE_INFINITY) {
            return "-Infinity";
        }
        if (d11 == 0.0d) {
            return "0";
        }
        if (i11 < 2 || i11 > 36) {
            throw Context.reportRuntimeError1("msg.bad.radix", Integer.toString(i11));
        }
        if (i11 != 10) {
            return DToA.JS_dtobasestr(i11, d11);
        }
        String numberToString = FastDtoa.numberToString(d11);
        if (numberToString != null) {
            return numberToString;
        }
        StringBuilder sb2 = new StringBuilder();
        DToA.JS_dtostr(sb2, 0, 0, d11);
        return sb2.toString();
    }

    public static Object[] padArguments(Object[] objArr, int i11) {
        if (i11 < objArr.length) {
            return objArr;
        }
        Object[] objArr2 = new Object[i11];
        int i12 = 0;
        while (i12 < objArr.length) {
            objArr2[i12] = objArr[i12];
            i12++;
        }
        while (i12 < i11) {
            objArr2[i12] = Undefined.instance;
            i12++;
        }
        return objArr2;
    }

    public static Object propIncrDecr(Object obj, String str, Context context, int i11) {
        Scriptable objectOrNull = toObjectOrNull(context, obj);
        if (objectOrNull == null) {
            throw undefReadError(obj, str);
        }
        Scriptable scriptable = objectOrNull;
        do {
            Object obj2 = scriptable.get(str, objectOrNull);
            if (obj2 != Scriptable.NOT_FOUND) {
                return doScriptableIncrDecr(scriptable, str, objectOrNull, obj2, i11);
            }
            scriptable = scriptable.getPrototype();
        } while (scriptable != null);
        Double d11 = NaNobj;
        objectOrNull.put(str, objectOrNull, d11);
        return d11;
    }

    public static Object refDel(Ref ref, Context context) {
        return wrapBoolean(ref.delete(context));
    }

    public static Object refGet(Ref ref, Context context) {
        return ref.get(context);
    }

    public static Object refIncrDecr(Ref ref, Context context, int i11) {
        double number;
        Object obj = ref.get(context);
        boolean z11 = (i11 & 2) != 0;
        if (obj instanceof Number) {
            number = ((Number) obj).doubleValue();
        } else {
            number = toNumber(obj);
            if (z11) {
                obj = wrapNumber(number);
            }
        }
        Number wrapNumber = wrapNumber((i11 & 1) == 0 ? number + 1.0d : number - 1.0d);
        ref.set(context, wrapNumber);
        return z11 ? obj : wrapNumber;
    }

    public static Object refSet(Ref ref, Object obj, Context context) {
        return ref.set(context, obj);
    }

    public static Object searchDefaultNamespace(Context context) {
        Scriptable scriptable = context.currentActivationCall;
        if (scriptable == null) {
            scriptable = getTopCallScope(context);
        }
        while (true) {
            Scriptable parentScope = scriptable.getParentScope();
            if (parentScope == null) {
                Object property = ScriptableObject.getProperty(scriptable, DEFAULT_NS_TAG);
                if (property == Scriptable.NOT_FOUND) {
                    return null;
                }
                return property;
            }
            Object obj = scriptable.get(DEFAULT_NS_TAG, scriptable);
            if (obj != Scriptable.NOT_FOUND) {
                return obj;
            }
            scriptable = parentScope;
        }
    }

    public static void setBuiltinProtoAndParent(ScriptableObject scriptableObject, Scriptable scriptable, TopLevel.Builtins builtins) {
        Scriptable topLevelScope = ScriptableObject.getTopLevelScope(scriptable);
        scriptableObject.setParentScope(topLevelScope);
        scriptableObject.setPrototype(TopLevel.getBuiltinPrototype(topLevelScope, builtins));
    }

    public static Object setConst(Scriptable scriptable, Object obj, Context context, String str) {
        if (scriptable instanceof XMLObject) {
            scriptable.put(str, scriptable, obj);
            return obj;
        }
        ScriptableObject.putConstProperty(scriptable, str, obj);
        return obj;
    }

    public static Object setDefaultNamespace(Object obj, Context context) {
        Scriptable scriptable = context.currentActivationCall;
        if (scriptable == null) {
            scriptable = getTopCallScope(context);
        }
        Object defaultXmlNamespace = currentXMLLib(context).toDefaultXmlNamespace(context, obj);
        if (scriptable.has(DEFAULT_NS_TAG, scriptable)) {
            scriptable.put(DEFAULT_NS_TAG, scriptable, defaultXmlNamespace);
        } else {
            ScriptableObject.defineProperty(scriptable, DEFAULT_NS_TAG, defaultXmlNamespace, 6);
        }
        return Undefined.instance;
    }

    public static void setEnumNumbers(Object obj, boolean z11) {
        ((IdEnumeration) obj).enumNumbers = z11;
    }

    public static void setFunctionProtoAndParent(BaseFunction baseFunction, Scriptable scriptable) {
        baseFunction.setParentScope(scriptable);
        baseFunction.setPrototype(ScriptableObject.getFunctionPrototype(scriptable));
    }

    public static Object setName(Scriptable scriptable, Object obj, Context context, Scriptable scriptable2, String str) {
        if (scriptable != null) {
            ScriptableObject.putProperty(scriptable, str, obj);
            return obj;
        }
        if (context.hasFeature(11) || context.hasFeature(8)) {
            Context.reportWarning(getMessage1("msg.assn.create.strict", str));
        }
        Scriptable topLevelScope = ScriptableObject.getTopLevelScope(scriptable2);
        if (context.useDynamicScope) {
            topLevelScope = checkDynamicScope(context.topCallScope, topLevelScope);
        }
        topLevelScope.put(str, topLevelScope, obj);
        return obj;
    }

    public static Object setObjectElem(Object obj, Object obj2, Object obj3, Context context) {
        Scriptable objectOrNull = toObjectOrNull(context, obj);
        if (objectOrNull != null) {
            return setObjectElem(objectOrNull, obj2, obj3, context);
        }
        throw undefWriteError(obj, obj2, obj3);
    }

    public static Object setObjectIndex(Object obj, double d11, Object obj2, Context context) {
        Scriptable objectOrNull = toObjectOrNull(context, obj);
        if (objectOrNull == null) {
            throw undefWriteError(obj, String.valueOf(d11), obj2);
        }
        int i11 = (int) d11;
        return ((double) i11) == d11 ? setObjectIndex(objectOrNull, i11, obj2, context) : setObjectProp(objectOrNull, toString(d11), obj2, context);
    }

    public static Object setObjectProp(Object obj, String str, Object obj2, Context context) {
        Scriptable objectOrNull = toObjectOrNull(context, obj);
        if (objectOrNull != null) {
            return setObjectProp(objectOrNull, str, obj2, context);
        }
        throw undefWriteError(obj, str, obj2);
    }

    public static void setObjectProtoAndParent(ScriptableObject scriptableObject, Scriptable scriptable) {
        Scriptable topLevelScope = ScriptableObject.getTopLevelScope(scriptable);
        scriptableObject.setParentScope(topLevelScope);
        scriptableObject.setPrototype(ScriptableObject.getClassPrototype(topLevelScope, scriptableObject.getClassName()));
    }

    public static void setRegExpProxy(Context context, RegExpProxy regExpProxy) {
        if (regExpProxy == null) {
            throw new IllegalArgumentException();
        }
        context.regExpProxy = regExpProxy;
    }

    public static boolean shallowEq(Object obj, Object obj2) {
        if (obj == obj2) {
            if (!(obj instanceof Number)) {
                return true;
            }
            double doubleValue = ((Number) obj).doubleValue();
            return doubleValue == doubleValue;
        }
        if (obj != null && obj != Undefined.instance) {
            if (obj instanceof Number) {
                return (obj2 instanceof Number) && ((Number) obj).doubleValue() == ((Number) obj2).doubleValue();
            }
            if (obj instanceof CharSequence) {
                if (obj2 instanceof CharSequence) {
                    return obj.toString().equals(obj2.toString());
                }
            } else if (obj instanceof Boolean) {
                if (obj2 instanceof Boolean) {
                    return obj.equals(obj2);
                }
            } else if (!(obj instanceof Scriptable)) {
                warnAboutNonJSObject(obj);
                if (obj == obj2) {
                    return true;
                }
            } else if ((obj instanceof Wrapper) && (obj2 instanceof Wrapper) && ((Wrapper) obj).unwrap() == ((Wrapper) obj2).unwrap()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static Ref specialRef(Object obj, String str, Context context) {
        return SpecialRef.createSpecial(context, obj, str);
    }

    private static void storeIndexResult(Context context, int i11) {
        context.scratchIndex = i11;
    }

    private static void storeScriptable(Context context, Scriptable scriptable) {
        if (context.scratchScriptable != null) {
            throw new IllegalStateException();
        }
        context.scratchScriptable = scriptable;
    }

    public static void storeUint32Result(Context context, long j11) {
        if ((j11 >>> 32) != 0) {
            throw new IllegalArgumentException();
        }
        context.scratchUint32 = j11;
    }

    public static Object strictSetName(Scriptable scriptable, Object obj, Context context, Scriptable scriptable2, String str) {
        if (scriptable != null) {
            ScriptableObject.putProperty(scriptable, str, obj);
            return obj;
        }
        throw constructError("ReferenceError", "Assignment to undefined \"" + str + "\" in strict mode");
    }

    public static double stringToNumber(String str, int i11, int i12) {
        char c11;
        char c12;
        int i13;
        int i14 = i11;
        int length = str.length();
        char c13 = '9';
        char c14 = i12 < 10 ? (char) (i12 + 47) : '9';
        char c15 = 'A';
        if (i12 > 10) {
            c11 = (char) (i12 + 87);
            c12 = (char) (i12 + 55);
        } else {
            c11 = 'a';
            c12 = 'A';
        }
        int i15 = i14;
        double d11 = 0.0d;
        while (i15 < length) {
            char charAt = str.charAt(i15);
            if ('0' <= charAt && charAt <= c14) {
                i13 = charAt - '0';
            } else if ('a' <= charAt && charAt < c11) {
                i13 = charAt - 'W';
            } else {
                if (c15 > charAt || charAt >= c12) {
                    break;
                }
                i13 = charAt - '7';
            }
            d11 = (d11 * i12) + i13;
            i15++;
            c11 = c11;
            c15 = 'A';
        }
        if (i14 == i15) {
            return NaN;
        }
        if (d11 >= 9.007199254740992E15d) {
            if (i12 == 10) {
                try {
                    return Double.parseDouble(str.substring(i14, i15));
                } catch (NumberFormatException unused) {
                    return NaN;
                }
            }
            if (i12 == 2 || i12 == 4 || i12 == 8 || i12 == 16 || i12 == 32) {
                int i16 = 53;
                int i17 = 1;
                double d12 = 0.0d;
                char c16 = 0;
                boolean z11 = false;
                boolean z12 = false;
                int i18 = 0;
                while (true) {
                    if (i17 == 1) {
                        if (i14 == i15) {
                            break;
                        }
                        int i19 = i14 + 1;
                        char charAt2 = str.charAt(i14);
                        i18 = ('0' > charAt2 || charAt2 > c13) ? ('a' > charAt2 || charAt2 > 'z') ? charAt2 - '7' : charAt2 - 'W' : charAt2 - '0';
                        i14 = i19;
                        i17 = i12;
                    }
                    i17 >>= 1;
                    boolean z13 = (i18 & i17) != 0;
                    if (c16 != 0) {
                        if (c16 == 1) {
                            d11 *= 2.0d;
                            if (z13) {
                                d11 += 1.0d;
                            }
                            i16--;
                            if (i16 == 0) {
                                c16 = 2;
                                z12 = z13;
                            }
                        } else if (c16 != 2) {
                            if (c16 != 3) {
                                if (c16 != 4) {
                                }
                            } else if (z13) {
                                c16 = 4;
                            }
                            d12 *= 2.0d;
                        } else {
                            z11 = z13;
                            c16 = 3;
                            d12 = 2.0d;
                        }
                    } else if (z13) {
                        i16--;
                        c16 = 1;
                        d11 = 1.0d;
                    }
                    c13 = '9';
                }
                if (c16 == 0) {
                    return 0.0d;
                }
                if (c16 == 3) {
                    if (z11 & z12) {
                        d11 += 1.0d;
                    }
                    return d11 * d12;
                }
                if (c16 != 4) {
                    return d11;
                }
                if (z11) {
                    d11 += 1.0d;
                }
                return d11 * d12;
            }
        }
        return d11;
    }

    public static long testUint32String(String str) {
        int length = str.length();
        if (1 <= length && length <= 10) {
            int charAt = str.charAt(0) - '0';
            if (charAt == 0) {
                return length == 1 ? 0L : -1L;
            }
            if (1 <= charAt && charAt <= 9) {
                long j11 = charAt;
                for (int i11 = 1; i11 != length; i11++) {
                    int charAt2 = str.charAt(i11) - '0';
                    if (charAt2 < 0 || charAt2 > 9) {
                        return -1L;
                    }
                    j11 = (j11 * 10) + charAt2;
                }
                if ((j11 >>> 32) == 0) {
                    return j11;
                }
            }
        }
        return -1L;
    }

    public static JavaScriptException throwError(Context context, Scriptable scriptable, String str) {
        int[] iArr = {0};
        String sourcePositionFromStack = Context.getSourcePositionFromStack(iArr);
        return new JavaScriptException(newBuiltinObject(context, scriptable, TopLevel.Builtins.Error, new Object[]{str, sourcePositionFromStack, Integer.valueOf(iArr[0])}), sourcePositionFromStack, iArr[0]);
    }

    public static boolean toBoolean(Object obj) {
        while (!(obj instanceof Boolean)) {
            if (obj == null || obj == Undefined.instance) {
                return false;
            }
            if (obj instanceof CharSequence) {
                return ((CharSequence) obj).length() != 0;
            }
            if (obj instanceof Number) {
                double doubleValue = ((Number) obj).doubleValue();
                return doubleValue == doubleValue && doubleValue != 0.0d;
            }
            if (!(obj instanceof Scriptable)) {
                warnAboutNonJSObject(obj);
                return true;
            }
            if ((obj instanceof ScriptableObject) && ((ScriptableObject) obj).avoidObjectDetection()) {
                return false;
            }
            if (Context.getContext().isVersionECMA1()) {
                return true;
            }
            obj = ((Scriptable) obj).getDefaultValue(BooleanClass);
            if (obj instanceof Scriptable) {
                throw errorWithClassName("msg.primitive.expected", obj);
            }
        }
        return ((Boolean) obj).booleanValue();
    }

    public static CharSequence toCharSequence(Object obj) {
        return obj instanceof NativeString ? ((NativeString) obj).toCharSequence() : obj instanceof CharSequence ? (CharSequence) obj : toString(obj);
    }

    public static int toInt32(Object obj) {
        return obj instanceof Integer ? ((Integer) obj).intValue() : toInt32(toNumber(obj));
    }

    public static double toInteger(Object obj) {
        return toInteger(toNumber(obj));
    }

    public static Scriptable toIterator(Context context, Scriptable scriptable, Scriptable scriptable2, boolean z11) {
        if (!ScriptableObject.hasProperty(scriptable2, NativeIterator.ITERATOR_PROPERTY_NAME)) {
            return null;
        }
        Object property = ScriptableObject.getProperty(scriptable2, NativeIterator.ITERATOR_PROPERTY_NAME);
        if (!(property instanceof Callable)) {
            throw typeError0("msg.invalid.iterator");
        }
        Object call = ((Callable) property).call(context, scriptable, scriptable2, new Object[]{z11 ? Boolean.TRUE : Boolean.FALSE});
        if (call instanceof Scriptable) {
            return (Scriptable) call;
        }
        throw typeError0("msg.iterator.primitive");
    }

    public static double toNumber(Object obj) {
        while (!(obj instanceof Number)) {
            if (obj == null) {
                return 0.0d;
            }
            if (obj == Undefined.instance) {
                return NaN;
            }
            if (obj instanceof String) {
                return toNumber((String) obj);
            }
            if (obj instanceof CharSequence) {
                return toNumber(obj.toString());
            }
            if (obj instanceof Boolean) {
                return ((Boolean) obj).booleanValue() ? 1.0d : 0.0d;
            }
            if (!(obj instanceof Scriptable)) {
                warnAboutNonJSObject(obj);
                return NaN;
            }
            obj = ((Scriptable) obj).getDefaultValue(NumberClass);
            if (obj instanceof Scriptable) {
                throw errorWithClassName("msg.primitive.expected", obj);
            }
        }
        return ((Number) obj).doubleValue();
    }

    public static Scriptable toObject(Scriptable scriptable, Object obj) {
        return obj instanceof Scriptable ? (Scriptable) obj : toObject(Context.getContext(), scriptable, obj);
    }

    public static Scriptable toObjectOrNull(Context context, Object obj) {
        if (obj instanceof Scriptable) {
            return (Scriptable) obj;
        }
        if (obj == null || obj == Undefined.instance) {
            return null;
        }
        return toObject(context, getTopCallScope(context), obj);
    }

    public static Object toPrimitive(Object obj) {
        return toPrimitive(obj, null);
    }

    public static String toString(Object obj) {
        while (obj != null) {
            if (obj == Undefined.instance) {
                return "undefined";
            }
            if (obj instanceof String) {
                return (String) obj;
            }
            if (obj instanceof CharSequence) {
                return obj.toString();
            }
            if (obj instanceof Number) {
                return numberToString(((Number) obj).doubleValue(), 10);
            }
            if (!(obj instanceof Scriptable)) {
                return obj.toString();
            }
            obj = ((Scriptable) obj).getDefaultValue(StringClass);
            if (obj instanceof Scriptable) {
                throw errorWithClassName("msg.primitive.expected", obj);
            }
        }
        return "null";
    }

    public static String toStringIdOrIndex(Context context, Object obj) {
        if (obj instanceof Number) {
            double doubleValue = ((Number) obj).doubleValue();
            int i11 = (int) doubleValue;
            if (i11 != doubleValue) {
                return toString(obj);
            }
            storeIndexResult(context, i11);
            return null;
        }
        String scriptRuntime = obj instanceof String ? (String) obj : toString(obj);
        long indexFromString = indexFromString(scriptRuntime);
        if (indexFromString < 0) {
            return scriptRuntime;
        }
        storeIndexResult(context, (int) indexFromString);
        return null;
    }

    public static char toUint16(Object obj) {
        double number = toNumber(obj);
        int i11 = (int) number;
        if (i11 == number) {
            return (char) i11;
        }
        if (number != number || number == Double.POSITIVE_INFINITY || number == Double.NEGATIVE_INFINITY) {
            return (char) 0;
        }
        return (char) Math.IEEEremainder(number >= 0.0d ? Math.floor(number) : Math.ceil(number), 65536);
    }

    public static long toUint32(double d11) {
        long j11 = (long) d11;
        if (j11 == d11) {
            return j11 & 4294967295L;
        }
        if (d11 != d11 || d11 == Double.POSITIVE_INFINITY || d11 == Double.NEGATIVE_INFINITY) {
            return 0L;
        }
        return ((long) Math.IEEEremainder(d11 >= 0.0d ? Math.floor(d11) : Math.ceil(d11), 4.294967296E9d)) & 4294967295L;
    }

    private static Object topScopeName(Context context, Scriptable scriptable, String str) {
        if (context.useDynamicScope) {
            scriptable = checkDynamicScope(context.topCallScope, scriptable);
        }
        return ScriptableObject.getProperty(scriptable, str);
    }

    public static EcmaError typeError(String str) {
        return constructError("TypeError", str);
    }

    public static EcmaError typeError0(String str) {
        return typeError(getMessage0(str));
    }

    public static EcmaError typeError1(String str, String str2) {
        return typeError(getMessage1(str, str2));
    }

    public static EcmaError typeError2(String str, String str2, String str3) {
        return typeError(getMessage2(str, str2, str3));
    }

    public static EcmaError typeError3(String str, String str2, String str3, String str4) {
        return typeError(getMessage3(str, str2, str3, str4));
    }

    public static BaseFunction typeErrorThrower() {
        if (THROW_TYPE_ERROR == null) {
            BaseFunction baseFunction = new BaseFunction() { // from class: org.mozilla.javascript.ScriptRuntime.1
                static final long serialVersionUID = -5891740962154902286L;

                @Override // org.mozilla.javascript.BaseFunction, org.mozilla.javascript.Function, org.mozilla.javascript.Callable
                public Object call(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
                    throw ScriptRuntime.typeError0("msg.op.not.allowed");
                }

                @Override // org.mozilla.javascript.BaseFunction
                public int getLength() {
                    return 0;
                }
            };
            baseFunction.preventExtensions();
            THROW_TYPE_ERROR = baseFunction;
        }
        return THROW_TYPE_ERROR;
    }

    public static String typeof(Object obj) {
        if (obj == null) {
            return "object";
        }
        if (obj == Undefined.instance) {
            return "undefined";
        }
        if (obj instanceof ScriptableObject) {
            return ((ScriptableObject) obj).getTypeOf();
        }
        if (obj instanceof Scriptable) {
            return obj instanceof Callable ? "function" : "object";
        }
        if (obj instanceof CharSequence) {
            return TypedValues.Custom.S_STRING;
        }
        if (obj instanceof Number) {
            return "number";
        }
        if (obj instanceof Boolean) {
            return TypedValues.Custom.S_BOOLEAN;
        }
        throw errorWithClassName("msg.invalid.type", obj);
    }

    public static String typeofName(Scriptable scriptable, String str) {
        Context context = Context.getContext();
        Scriptable bind = bind(context, scriptable, str);
        return bind == null ? "undefined" : typeof(getObjectProp(bind, str, context));
    }

    public static RuntimeException undefCallError(Object obj, Object obj2) {
        return typeError2("msg.undef.method.call", toString(obj), obj2 == null ? "null" : obj2.toString());
    }

    public static RuntimeException undefReadError(Object obj, Object obj2) {
        return typeError2("msg.undef.prop.read", toString(obj), obj2 == null ? "null" : obj2.toString());
    }

    public static RuntimeException undefWriteError(Object obj, Object obj2, Object obj3) {
        return typeError3("msg.undef.prop.write", toString(obj), obj2 == null ? "null" : obj2.toString(), obj3 instanceof Scriptable ? obj3.toString() : toString(obj3));
    }

    public static String uneval(Context context, Scriptable scriptable, Object obj) {
        if (obj == null) {
            return "null";
        }
        if (obj == Undefined.instance) {
            return "undefined";
        }
        if (obj instanceof CharSequence) {
            String escapeString = escapeString(obj.toString());
            StringBuffer stringBuffer = new StringBuffer(escapeString.length() + 2);
            stringBuffer.append('\"');
            stringBuffer.append(escapeString);
            stringBuffer.append('\"');
            return stringBuffer.toString();
        }
        if (obj instanceof Number) {
            double doubleValue = ((Number) obj).doubleValue();
            return (doubleValue != 0.0d || 1.0d / doubleValue >= 0.0d) ? toString(doubleValue) : "-0";
        }
        if (obj instanceof Boolean) {
            return toString(obj);
        }
        if (!(obj instanceof Scriptable)) {
            warnAboutNonJSObject(obj);
            return obj.toString();
        }
        Scriptable scriptable2 = (Scriptable) obj;
        if (ScriptableObject.hasProperty(scriptable2, "toSource")) {
            Object property = ScriptableObject.getProperty(scriptable2, "toSource");
            if (property instanceof Function) {
                return toString(((Function) property).call(context, scriptable, scriptable2, emptyArgs));
            }
        }
        return toString(obj);
    }

    public static Object updateDotQuery(boolean z11, Scriptable scriptable) {
        return ((NativeWith) scriptable).updateDotQuery(z11);
    }

    private static void warnAboutNonJSObject(Object obj) {
        String str = "RHINO USAGE WARNING: Missed Context.javaToJS() conversion:\nRhino runtime detected object " + obj + " of class " + obj.getClass().getName() + " where it expected String, Number, Boolean or Scriptable instance. Please check your code for missing Context.javaToJS() call.";
        Context.reportWarning(str);
        System.err.println(str);
    }

    public static Boolean wrapBoolean(boolean z11) {
        return z11 ? Boolean.TRUE : Boolean.FALSE;
    }

    public static Integer wrapInt(int i11) {
        return Integer.valueOf(i11);
    }

    public static Number wrapNumber(double d11) {
        return d11 != d11 ? NaNobj : new Double(d11);
    }

    public static Scriptable wrapRegExp(Context context, Scriptable scriptable, Object obj) {
        return context.getRegExpProxy().wrapRegExp(context, scriptable, obj);
    }

    public static Object delete(Object obj, Object obj2, Context context, boolean z11) {
        Scriptable objectOrNull = toObjectOrNull(context, obj);
        if (objectOrNull != null) {
            return wrapBoolean(deleteObjectElem(objectOrNull, obj2, context));
        }
        if (z11) {
            return Boolean.TRUE;
        }
        throw typeError2("msg.undef.prop.delete", toString(obj), obj2 == null ? "null" : obj2.toString());
    }

    public static Object enumInit(Object obj, Context context, int i11) {
        IdEnumeration idEnumeration = new IdEnumeration();
        Scriptable objectOrNull = toObjectOrNull(context, obj);
        idEnumeration.obj = objectOrNull;
        if (objectOrNull != null) {
            idEnumeration.enumType = i11;
            idEnumeration.iterator = null;
            if (i11 != 3 && i11 != 4 && i11 != 5) {
                idEnumeration.iterator = toIterator(context, objectOrNull.getParentScope(), idEnumeration.obj, i11 == 0);
            }
            if (idEnumeration.iterator == null) {
                enumChangeObject(idEnumeration);
            }
        }
        return idEnumeration;
    }

    public static String escapeString(String str, char c11) {
        int i11;
        if (c11 != '\"' && c11 != '\'') {
            Kit.codeBug();
        }
        int length = str.length();
        StringBuffer stringBuffer = null;
        for (int i12 = 0; i12 != length; i12++) {
            char charAt = str.charAt(i12);
            int i13 = 32;
            if (' ' > charAt || charAt > '~' || charAt == c11 || charAt == '\\') {
                if (stringBuffer == null) {
                    stringBuffer = new StringBuffer(length + 3);
                    stringBuffer.append(str);
                    stringBuffer.setLength(i12);
                }
                if (charAt != ' ') {
                    if (charAt != '\\') {
                        switch (charAt) {
                            case '\b':
                                i13 = 98;
                                break;
                            case '\t':
                                i13 = 116;
                                break;
                            case '\n':
                                i13 = 110;
                                break;
                            case 11:
                                i13 = 118;
                                break;
                            case '\f':
                                i13 = 102;
                                break;
                            case '\r':
                                i13 = 114;
                                break;
                            default:
                                i13 = -1;
                                break;
                        }
                    } else {
                        i13 = 92;
                    }
                }
                if (i13 >= 0) {
                    stringBuffer.append('\\');
                    stringBuffer.append((char) i13);
                } else if (charAt == c11) {
                    stringBuffer.append('\\');
                    stringBuffer.append(c11);
                } else {
                    if (charAt < 256) {
                        stringBuffer.append("\\x");
                        i11 = 2;
                    } else {
                        stringBuffer.append("\\u");
                        i11 = 4;
                    }
                    for (int i14 = (i11 - 1) * 4; i14 >= 0; i14 -= 4) {
                        int i15 = (charAt >> i14) & 15;
                        stringBuffer.append((char) (i15 < 10 ? i15 + 48 : i15 + 87));
                    }
                }
            } else if (stringBuffer != null) {
                stringBuffer.append(charAt);
            }
        }
        return stringBuffer == null ? str : stringBuffer.toString();
    }

    public static Object getObjectElem(Object obj, Object obj2, Context context, Scriptable scriptable) {
        Scriptable objectOrNull = toObjectOrNull(context, obj, scriptable);
        if (objectOrNull != null) {
            return getObjectElem(objectOrNull, obj2, context);
        }
        throw undefReadError(obj, obj2);
    }

    public static Object nameIncrDecr(Scriptable scriptable, String str, Context context, int i11) {
        do {
            if (context.useDynamicScope && scriptable.getParentScope() == null) {
                scriptable = checkDynamicScope(context.topCallScope, scriptable);
            }
            Scriptable scriptable2 = scriptable;
            do {
                if ((scriptable2 instanceof NativeWith) && (scriptable2.getPrototype() instanceof XMLObject)) {
                    break;
                }
                Object obj = scriptable2.get(str, scriptable);
                if (obj != Scriptable.NOT_FOUND) {
                    return doScriptableIncrDecr(scriptable2, str, scriptable, obj, i11);
                }
                scriptable2 = scriptable2.getPrototype();
            } while (scriptable2 != null);
            scriptable = scriptable.getParentScope();
        } while (scriptable != null);
        throw notFoundError(scriptable, str);
    }

    public static Scriptable newObjectLiteral(Object[] objArr, Object[] objArr2, int[] iArr, Context context, Scriptable scriptable) {
        Scriptable newObject = context.newObject(scriptable);
        int length = objArr.length;
        for (int i11 = 0; i11 != length; i11++) {
            Object obj = objArr[i11];
            int i12 = iArr == null ? 0 : iArr[i11];
            Object obj2 = objArr2[i11];
            if (!(obj instanceof String)) {
                newObject.put(((Integer) obj).intValue(), newObject, obj2);
            } else if (i12 == 0) {
                String str = (String) obj;
                if (isSpecialProperty(str)) {
                    specialRef(newObject, str, context).set(context, obj2);
                } else {
                    newObject.put(str, newObject, obj2);
                }
            } else {
                ((ScriptableObject) newObject).setGetterOrSetter((String) obj, 0, (Callable) obj2, i12 == 1);
            }
        }
        return newObject;
    }

    public static RuntimeException notFunctionError(Object obj, Object obj2) {
        String obj3 = obj2 == null ? "null" : obj2.toString();
        return obj == Scriptable.NOT_FOUND ? typeError1("msg.function.not.found", obj3) : typeError2("msg.isnt.function", obj3, typeof(obj));
    }

    public static double toInteger(double d11) {
        if (d11 != d11) {
            return 0.0d;
        }
        return (d11 == 0.0d || d11 == Double.POSITIVE_INFINITY || d11 == Double.NEGATIVE_INFINITY) ? d11 : d11 > 0.0d ? Math.floor(d11) : Math.ceil(d11);
    }

    public static Object toPrimitive(Object obj, Class<?> cls) {
        if (!(obj instanceof Scriptable)) {
            return obj;
        }
        Object defaultValue = ((Scriptable) obj).getDefaultValue(cls);
        if (defaultValue instanceof Scriptable) {
            throw typeError0("msg.bad.default.value");
        }
        return defaultValue;
    }

    public static Object getIndexObject(double d11) {
        int i11 = (int) d11;
        if (i11 == d11) {
            return Integer.valueOf(i11);
        }
        return toString(d11);
    }

    public static Callable getPropFunctionAndThis(Object obj, String str, Context context, Scriptable scriptable) {
        return getPropFunctionAndThisHelper(obj, str, context, toObjectOrNull(context, obj, scriptable));
    }

    public static Ref nameRef(Object obj, Object obj2, Context context, Scriptable scriptable, int i11) {
        return currentXMLLib(context).nameRef(context, obj, obj2, scriptable, i11);
    }

    public static long toUint32(Object obj) {
        return toUint32(toNumber(obj));
    }

    public static EcmaError constructError(String str, String str2, int i11) {
        int[] iArr = new int[1];
        String sourcePositionFromStack = Context.getSourcePositionFromStack(iArr);
        int i12 = iArr[0];
        if (i12 != 0) {
            iArr[0] = i12 + i11;
        }
        return constructError(str, str2, sourcePositionFromStack, iArr[0], null, 0);
    }

    public static Object getObjectProp(Object obj, String str, Context context, Scriptable scriptable) {
        Scriptable objectOrNull = toObjectOrNull(context, obj, scriptable);
        if (objectOrNull != null) {
            return getObjectProp(objectOrNull, str, context);
        }
        throw undefReadError(obj, str);
    }

    public static Object setObjectElem(Scriptable scriptable, Object obj, Object obj2, Context context) {
        if (scriptable instanceof XMLObject) {
            ((XMLObject) scriptable).put(context, obj, obj2);
            return obj2;
        }
        String stringIdOrIndex = toStringIdOrIndex(context, obj);
        if (stringIdOrIndex == null) {
            ScriptableObject.putProperty(scriptable, lastIndexResult(context), obj2);
            return obj2;
        }
        ScriptableObject.putProperty(scriptable, stringIdOrIndex, obj2);
        return obj2;
    }

    public static Object setObjectProp(Scriptable scriptable, String str, Object obj, Context context) {
        ScriptableObject.putProperty(scriptable, str, obj);
        return obj;
    }

    public static int toInt32(Object[] objArr, int i11) {
        if (i11 < objArr.length) {
            return toInt32(objArr[i11]);
        }
        return 0;
    }

    public static double toInteger(Object[] objArr, int i11) {
        if (i11 < objArr.length) {
            return toInteger(objArr[i11]);
        }
        return 0.0d;
    }

    public static Scriptable toObject(Scriptable scriptable, Object obj, Class<?> cls) {
        if (obj instanceof Scriptable) {
            return (Scriptable) obj;
        }
        return toObject(Context.getContext(), scriptable, obj);
    }

    public static Object getObjectElem(Scriptable scriptable, Object obj, Context context) {
        Object property;
        if (scriptable instanceof XMLObject) {
            property = ((XMLObject) scriptable).get(context, obj);
        } else {
            String stringIdOrIndex = toStringIdOrIndex(context, obj);
            if (stringIdOrIndex == null) {
                property = ScriptableObject.getProperty(scriptable, lastIndexResult(context));
            } else {
                property = ScriptableObject.getProperty(scriptable, stringIdOrIndex);
            }
        }
        return property == Scriptable.NOT_FOUND ? Undefined.instance : property;
    }

    public static Ref memberRef(Object obj, Object obj2, Object obj3, Context context, int i11) {
        if (obj instanceof XMLObject) {
            return ((XMLObject) obj).memberRef(context, obj2, obj3, i11);
        }
        throw notXmlError(obj);
    }

    public static Scriptable newObject(Object obj, Context context, Scriptable scriptable, Object[] objArr) {
        if (obj instanceof Function) {
            return ((Function) obj).construct(context, scriptable, objArr);
        }
        throw notFunctionError(obj);
    }

    public static int toInt32(double d11) {
        int i11 = (int) d11;
        if (i11 == d11) {
            return i11;
        }
        if (d11 != d11 || d11 == Double.POSITIVE_INFINITY || d11 == Double.NEGATIVE_INFINITY) {
            return 0;
        }
        return (int) Math.IEEEremainder(d11 >= 0.0d ? Math.floor(d11) : Math.ceil(d11), 4.294967296E9d);
    }

    public static Scriptable toObjectOrNull(Context context, Object obj, Scriptable scriptable) {
        if (obj instanceof Scriptable) {
            return (Scriptable) obj;
        }
        if (obj == null || obj == Undefined.instance) {
            return null;
        }
        return toObject(context, scriptable, obj);
    }

    public static Object getObjectIndex(Scriptable scriptable, int i11, Context context) {
        Object property = ScriptableObject.getProperty(scriptable, i11);
        return property == Scriptable.NOT_FOUND ? Undefined.instance : property;
    }

    public static RuntimeException notFunctionError(Object obj, Object obj2, String str) {
        int indexOf;
        String scriptRuntime = toString(obj);
        if ((obj instanceof NativeFunction) && (indexOf = scriptRuntime.indexOf(123)) > -1) {
            scriptRuntime = scriptRuntime.substring(0, indexOf + 1) + "...}";
        }
        if (obj2 == Scriptable.NOT_FOUND) {
            return typeError2("msg.function.not.found.in", str, scriptRuntime);
        }
        return typeError3("msg.isnt.function.in", str, scriptRuntime, typeof(obj2));
    }

    public static Object setObjectIndex(Scriptable scriptable, int i11, Object obj, Context context) {
        ScriptableObject.putProperty(scriptable, i11, obj);
        return obj;
    }

    public static Object getObjectProp(Scriptable scriptable, String str, Context context) {
        Object property = ScriptableObject.getProperty(scriptable, str);
        if (property != Scriptable.NOT_FOUND) {
            return property;
        }
        if (context.hasFeature(11)) {
            Context.reportWarning(getMessage1("msg.ref.undefined.prop", str));
        }
        return Undefined.instance;
    }

    public static Scriptable toObject(Context context, Scriptable scriptable, Object obj) {
        if (obj instanceof Scriptable) {
            return (Scriptable) obj;
        }
        if (obj instanceof CharSequence) {
            NativeString nativeString = new NativeString((CharSequence) obj);
            setBuiltinProtoAndParent(nativeString, scriptable, TopLevel.Builtins.String);
            return nativeString;
        }
        if (obj instanceof Number) {
            NativeNumber nativeNumber = new NativeNumber(((Number) obj).doubleValue());
            setBuiltinProtoAndParent(nativeNumber, scriptable, TopLevel.Builtins.Number);
            return nativeNumber;
        }
        if (obj instanceof Boolean) {
            NativeBoolean nativeBoolean = new NativeBoolean(((Boolean) obj).booleanValue());
            setBuiltinProtoAndParent(nativeBoolean, scriptable, TopLevel.Builtins.Boolean);
            return nativeBoolean;
        }
        if (obj != null) {
            if (obj != Undefined.instance) {
                Object wrap = context.getWrapFactory().wrap(context, scriptable, obj, null);
                if (wrap instanceof Scriptable) {
                    return (Scriptable) wrap;
                }
                throw errorWithClassName("msg.invalid.type", obj);
            }
            throw typeError0("msg.undef.to.object");
        }
        throw typeError0("msg.null.to.object");
    }

    public static EcmaError constructError(String str, String str2, String str3, int i11, String str4, int i12) {
        return new EcmaError(str, str2, str3, i11, str4, i12);
    }

    public static String toString(Object[] objArr, int i11) {
        return i11 < objArr.length ? toString(objArr[i11]) : "undefined";
    }

    public static String toString(double d11) {
        return numberToString(d11, 10);
    }

    public static double toNumber(Object[] objArr, int i11) {
        return i11 < objArr.length ? toNumber(objArr[i11]) : NaN;
    }

    public static CharSequence add(CharSequence charSequence, Object obj) {
        return new ConsString(charSequence, toCharSequence(obj));
    }

    public static double toNumber(String str) {
        int i11;
        char charAt;
        char charAt2;
        char charAt3;
        int length = str.length();
        int i12 = 0;
        while (i12 != length) {
            char charAt4 = str.charAt(i12);
            if (!isStrWhiteSpaceChar(charAt4)) {
                if (charAt4 == '0') {
                    int i13 = i12 + 2;
                    if (i13 < length && ((charAt3 = str.charAt(i12 + 1)) == 'x' || charAt3 == 'X')) {
                        return stringToNumber(str, i13, 16);
                    }
                } else if ((charAt4 == '+' || charAt4 == '-') && (i11 = i12 + 3) < length && str.charAt(i12 + 1) == '0' && ((charAt = str.charAt(i12 + 2)) == 'x' || charAt == 'X')) {
                    double stringToNumber = stringToNumber(str, i11, 16);
                    return charAt4 == '-' ? -stringToNumber : stringToNumber;
                }
                do {
                    length--;
                    charAt2 = str.charAt(length);
                } while (isStrWhiteSpaceChar(charAt2));
                if (charAt2 == 'y') {
                    if (charAt4 == '+' || charAt4 == '-') {
                        i12++;
                    }
                    if (i12 + 7 == length && str.regionMatches(i12, "Infinity", 0, 8)) {
                        return charAt4 == '-' ? Double.NEGATIVE_INFINITY : Double.POSITIVE_INFINITY;
                    }
                    return NaN;
                }
                String substring = str.substring(i12, length + 1);
                for (int length2 = substring.length() - 1; length2 >= 0; length2--) {
                    char charAt5 = substring.charAt(length2);
                    if (('0' > charAt5 || charAt5 > '9') && charAt5 != '.' && charAt5 != 'e' && charAt5 != 'E' && charAt5 != '+' && charAt5 != '-') {
                        return NaN;
                    }
                }
                try {
                    return Double.parseDouble(substring);
                } catch (NumberFormatException unused) {
                    return NaN;
                }
            }
            i12++;
        }
        return 0.0d;
    }

    public static CharSequence add(Object obj, CharSequence charSequence) {
        return new ConsString(toCharSequence(obj), charSequence);
    }

    public static Scriptable toObject(Context context, Scriptable scriptable, Object obj, Class<?> cls) {
        return toObject(context, scriptable, obj);
    }
}

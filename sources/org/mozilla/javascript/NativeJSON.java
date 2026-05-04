package org.mozilla.javascript;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import l50.b;
import n6.m;
import okhttp3.i;
import org.mozilla.javascript.json.JsonParser;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class NativeJSON extends IdScriptableObject {
    private static final int Id_parse = 2;
    private static final int Id_stringify = 3;
    private static final int Id_toSource = 1;
    private static final Object JSON_TAG = "JSON";
    private static final int LAST_METHOD_ID = 3;
    private static final int MAX_ID = 3;
    private static final int MAX_STRINGIFY_GAP_LENGTH = 10;
    static final long serialVersionUID = -4567599697595654984L;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class StringifyState {

        /* renamed from: cx, reason: collision with root package name */
        Context f78361cx;
        String gap;
        String indent;
        List<Object> propertyList;
        Callable replacer;
        Scriptable scope;
        Object space;
        Stack<Scriptable> stack = new Stack<>();

        public StringifyState(Context context, Scriptable scriptable, String str, String str2, Callable callable, List<Object> list, Object obj) {
            this.f78361cx = context;
            this.scope = scriptable;
            this.indent = str;
            this.gap = str2;
            this.replacer = callable;
            this.propertyList = list;
            this.space = obj;
        }
    }

    private NativeJSON() {
    }

    public static void init(Scriptable scriptable, boolean z11) {
        NativeJSON nativeJSON = new NativeJSON();
        nativeJSON.activatePrototypeMap(3);
        nativeJSON.setPrototype(ScriptableObject.getObjectPrototype(scriptable));
        nativeJSON.setParentScope(scriptable);
        if (z11) {
            nativeJSON.sealObject();
        }
        ScriptableObject.defineProperty(scriptable, "JSON", nativeJSON, 2);
    }

    private static String ja(NativeArray nativeArray, StringifyState stringifyState) {
        String str;
        if (stringifyState.stack.search(nativeArray) != -1) {
            throw ScriptRuntime.typeError0("msg.cyclic.value");
        }
        stringifyState.stack.push(nativeArray);
        String str2 = stringifyState.indent;
        stringifyState.indent += stringifyState.gap;
        LinkedList linkedList = new LinkedList();
        int length = (int) nativeArray.getLength();
        for (int i11 = 0; i11 < length; i11++) {
            Object str3 = str(Integer.valueOf(i11), nativeArray, stringifyState);
            if (str3 == Undefined.instance) {
                linkedList.add("null");
            } else {
                linkedList.add(str3);
            }
        }
        if (linkedList.isEmpty()) {
            str = i.f77289p;
        } else if (stringifyState.gap.length() == 0) {
            str = '[' + join(linkedList, ",") + b.f69930l;
        } else {
            str = "[\n" + stringifyState.indent + join(linkedList, ",\n" + stringifyState.indent) + '\n' + str2 + b.f69930l;
        }
        stringifyState.stack.pop();
        stringifyState.indent = str2;
        return str;
    }

    private static String jo(Scriptable scriptable, StringifyState stringifyState) {
        String str;
        if (stringifyState.stack.search(scriptable) != -1) {
            throw ScriptRuntime.typeError0("msg.cyclic.value");
        }
        stringifyState.stack.push(scriptable);
        String str2 = stringifyState.indent;
        stringifyState.indent += stringifyState.gap;
        List<Object> list = stringifyState.propertyList;
        Object[] array = list != null ? list.toArray() : scriptable.getIds();
        LinkedList linkedList = new LinkedList();
        for (Object obj : array) {
            Object str3 = str(obj, scriptable, stringifyState);
            if (str3 != Undefined.instance) {
                String str4 = quote(obj.toString()) + ":";
                if (stringifyState.gap.length() > 0) {
                    str4 = str4 + " ";
                }
                linkedList.add(str4 + str3);
            }
        }
        if (linkedList.isEmpty()) {
            str = "{}";
        } else if (stringifyState.gap.length() == 0) {
            str = b.f69927i + join(linkedList, ",") + b.f69928j;
        } else {
            str = "{\n" + stringifyState.indent + join(linkedList, ",\n" + stringifyState.indent) + '\n' + str2 + b.f69928j;
        }
        stringifyState.stack.pop();
        stringifyState.indent = str2;
        return str;
    }

    private static String join(Collection<Object> collection, String str) {
        if (collection == null || collection.isEmpty()) {
            return "";
        }
        Iterator<Object> it = collection.iterator();
        if (!it.hasNext()) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder(it.next().toString());
        while (it.hasNext()) {
            sb2.append(str);
            sb2.append(it.next().toString());
        }
        return sb2.toString();
    }

    private static Object parse(Context context, Scriptable scriptable, String str) {
        try {
            return new JsonParser(context, scriptable).parseValue(str);
        } catch (JsonParser.ParseException e11) {
            throw ScriptRuntime.constructError("SyntaxError", e11.getMessage());
        }
    }

    private static String quote(String str) {
        StringBuffer stringBuffer = new StringBuffer(str.length() + 2);
        stringBuffer.append('\"');
        int length = str.length();
        for (int i11 = 0; i11 < length; i11++) {
            char charAt = str.charAt(i11);
            if (charAt == '\f') {
                stringBuffer.append("\\f");
            } else if (charAt == '\r') {
                stringBuffer.append("\\r");
            } else if (charAt == '\"') {
                stringBuffer.append("\\\"");
            } else if (charAt != '\\') {
                switch (charAt) {
                    case '\b':
                        stringBuffer.append("\\b");
                        break;
                    case '\t':
                        stringBuffer.append("\\t");
                        break;
                    case '\n':
                        stringBuffer.append("\\n");
                        break;
                    default:
                        if (charAt < ' ') {
                            stringBuffer.append("\\u");
                            stringBuffer.append(String.format("%04x", Integer.valueOf(charAt)));
                            break;
                        } else {
                            stringBuffer.append(charAt);
                            break;
                        }
                }
            } else {
                stringBuffer.append("\\\\");
            }
        }
        stringBuffer.append('\"');
        return stringBuffer.toString();
    }

    private static String repeat(char c11, int i11) {
        char[] cArr = new char[i11];
        Arrays.fill(cArr, c11);
        return new String(cArr);
    }

    private static Object str(Object obj, Scriptable scriptable, StringifyState stringifyState) {
        Object property = obj instanceof String ? ScriptableObject.getProperty(scriptable, (String) obj) : ScriptableObject.getProperty(scriptable, ((Number) obj).intValue());
        if (property instanceof Scriptable) {
            Scriptable scriptable2 = (Scriptable) property;
            if (ScriptableObject.getProperty(scriptable2, "toJSON") instanceof Callable) {
                property = ScriptableObject.callMethod(stringifyState.f78361cx, scriptable2, "toJSON", new Object[]{obj});
            }
        }
        Callable callable = stringifyState.replacer;
        if (callable != null) {
            property = callable.call(stringifyState.f78361cx, stringifyState.scope, scriptable, new Object[]{obj, property});
        }
        if (property instanceof NativeNumber) {
            property = Double.valueOf(ScriptRuntime.toNumber(property));
        } else if (property instanceof NativeString) {
            property = ScriptRuntime.toString(property);
        } else if (property instanceof NativeBoolean) {
            property = ((NativeBoolean) property).getDefaultValue(ScriptRuntime.BooleanClass);
        }
        if (property == null) {
            return "null";
        }
        if (property.equals(Boolean.TRUE)) {
            return m.f74525c;
        }
        if (property.equals(Boolean.FALSE)) {
            return "false";
        }
        if (property instanceof CharSequence) {
            return quote(property.toString());
        }
        if (!(property instanceof Number)) {
            return (!(property instanceof Scriptable) || (property instanceof Callable)) ? Undefined.instance : property instanceof NativeArray ? ja((NativeArray) property, stringifyState) : jo((Scriptable) property, stringifyState);
        }
        double doubleValue = ((Number) property).doubleValue();
        return (doubleValue != doubleValue || doubleValue == Double.POSITIVE_INFINITY || doubleValue == Double.NEGATIVE_INFINITY) ? "null" : ScriptRuntime.toString(property);
    }

    public static Object stringify(Context context, Scriptable scriptable, Object obj, Object obj2, Object obj3) {
        Callable callable;
        LinkedList linkedList;
        Object obj4;
        String str;
        String str2;
        if (obj2 instanceof Callable) {
            callable = (Callable) obj2;
            linkedList = null;
        } else if (obj2 instanceof NativeArray) {
            LinkedList linkedList2 = new LinkedList();
            NativeArray nativeArray = (NativeArray) obj2;
            for (Integer num : nativeArray.getIndexIds()) {
                Object obj5 = nativeArray.get(num.intValue(), nativeArray);
                if ((obj5 instanceof String) || (obj5 instanceof Number)) {
                    linkedList2.add(obj5);
                } else if ((obj5 instanceof NativeString) || (obj5 instanceof NativeNumber)) {
                    linkedList2.add(ScriptRuntime.toString(obj5));
                }
            }
            linkedList = linkedList2;
            callable = null;
        } else {
            callable = null;
            linkedList = null;
        }
        Object valueOf = obj3 instanceof NativeNumber ? Double.valueOf(ScriptRuntime.toNumber(obj3)) : obj3 instanceof NativeString ? ScriptRuntime.toString(obj3) : obj3;
        if (valueOf instanceof Number) {
            int min = Math.min(10, (int) ScriptRuntime.toInteger(valueOf));
            str2 = min > 0 ? repeat(' ', min) : "";
            valueOf = Integer.valueOf(min);
        } else {
            if (!(valueOf instanceof String)) {
                obj4 = valueOf;
                str = "";
                StringifyState stringifyState = new StringifyState(context, scriptable, "", str, callable, linkedList, obj4);
                NativeObject nativeObject = new NativeObject();
                nativeObject.setParentScope(scriptable);
                nativeObject.setPrototype(ScriptableObject.getObjectPrototype(scriptable));
                nativeObject.defineProperty("", obj, 0);
                return str("", nativeObject, stringifyState);
            }
            str2 = (String) valueOf;
            if (str2.length() > 10) {
                str2 = str2.substring(0, 10);
            }
        }
        obj4 = valueOf;
        str = str2;
        StringifyState stringifyState2 = new StringifyState(context, scriptable, "", str, callable, linkedList, obj4);
        NativeObject nativeObject2 = new NativeObject();
        nativeObject2.setParentScope(scriptable);
        nativeObject2.setPrototype(ScriptableObject.getObjectPrototype(scriptable));
        nativeObject2.defineProperty("", obj, 0);
        return str("", nativeObject2, stringifyState2);
    }

    private static Object walk(Context context, Scriptable scriptable, Callable callable, Scriptable scriptable2, Object obj) {
        Object obj2 = obj instanceof Number ? scriptable2.get(((Number) obj).intValue(), scriptable2) : scriptable2.get((String) obj, scriptable2);
        if (obj2 instanceof Scriptable) {
            Scriptable scriptable3 = (Scriptable) obj2;
            int i11 = 0;
            if (scriptable3 instanceof NativeArray) {
                int length = (int) ((NativeArray) scriptable3).getLength();
                while (i11 < length) {
                    Object walk = walk(context, scriptable, callable, scriptable3, Integer.valueOf(i11));
                    if (walk == Undefined.instance) {
                        scriptable3.delete(i11);
                    } else {
                        scriptable3.put(i11, scriptable3, walk);
                    }
                    i11++;
                }
            } else {
                Object[] ids = scriptable3.getIds();
                int length2 = ids.length;
                while (i11 < length2) {
                    Object obj3 = ids[i11];
                    Object walk2 = walk(context, scriptable, callable, scriptable3, obj3);
                    if (walk2 == Undefined.instance) {
                        if (obj3 instanceof Number) {
                            scriptable3.delete(((Number) obj3).intValue());
                        } else {
                            scriptable3.delete((String) obj3);
                        }
                    } else if (obj3 instanceof Number) {
                        scriptable3.put(((Number) obj3).intValue(), scriptable3, walk2);
                    } else {
                        scriptable3.put((String) obj3, scriptable3, walk2);
                    }
                    i11++;
                }
            }
        }
        return callable.call(context, scriptable, scriptable2, new Object[]{obj, obj2});
    }

    @Override // org.mozilla.javascript.IdScriptableObject, org.mozilla.javascript.IdFunctionCall
    public Object execIdCall(IdFunctionObject idFunctionObject, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Object obj;
        Object obj2;
        Object obj3;
        if (!idFunctionObject.hasTag(JSON_TAG)) {
            return super.execIdCall(idFunctionObject, context, scriptable, scriptable2, objArr);
        }
        int methodId = idFunctionObject.methodId();
        if (methodId == 1) {
            return "JSON";
        }
        if (methodId == 2) {
            String scriptRuntime = ScriptRuntime.toString(objArr, 0);
            r2 = objArr.length > 1 ? objArr[1] : null;
            return r2 instanceof Callable ? parse(context, scriptable, scriptRuntime, (Callable) r2) : parse(context, scriptable, scriptRuntime);
        }
        if (methodId != 3) {
            throw new IllegalStateException(String.valueOf(methodId));
        }
        int length = objArr.length;
        if (length != 0) {
            if (length != 1) {
                Object obj4 = length != 2 ? objArr[2] : null;
                r2 = objArr[1];
                obj3 = obj4;
            } else {
                obj3 = null;
            }
            obj2 = obj3;
            obj = r2;
            r2 = objArr[0];
        } else {
            obj = null;
            obj2 = null;
        }
        return stringify(context, scriptable, r2, obj, obj2);
    }

    @Override // org.mozilla.javascript.IdScriptableObject
    public int findPrototypeId(String str) {
        String str2;
        int i11;
        int length = str.length();
        if (length == 5) {
            str2 = "parse";
            i11 = 2;
        } else if (length == 8) {
            str2 = "toSource";
            i11 = 1;
        } else if (length != 9) {
            str2 = null;
            i11 = 0;
        } else {
            str2 = "stringify";
            i11 = 3;
        }
        if (str2 == null || str2 == str || str2.equals(str)) {
            return i11;
        }
        return 0;
    }

    @Override // org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.Scriptable
    public String getClassName() {
        return "JSON";
    }

    @Override // org.mozilla.javascript.IdScriptableObject
    public void initPrototypeId(int i11) {
        String str;
        int i12 = 3;
        if (i11 > 3) {
            throw new IllegalStateException(String.valueOf(i11));
        }
        if (i11 == 1) {
            i12 = 0;
            str = "toSource";
        } else if (i11 == 2) {
            str = "parse";
            i12 = 2;
        } else {
            if (i11 != 3) {
                throw new IllegalStateException(String.valueOf(i11));
            }
            str = "stringify";
        }
        initPrototypeMethod(JSON_TAG, i11, str, i12);
    }

    public static Object parse(Context context, Scriptable scriptable, String str, Callable callable) {
        Object parse = parse(context, scriptable, str);
        Scriptable newObject = context.newObject(scriptable);
        newObject.put("", newObject, parse);
        return walk(context, scriptable, callable, newObject, "");
    }
}

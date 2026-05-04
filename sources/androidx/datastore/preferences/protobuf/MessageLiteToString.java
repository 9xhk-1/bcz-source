package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import com.alipay.sdk.m.u.i;
import com.baicizhan.client.business.dataset.provider.a;
import ct.d;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
final class MessageLiteToString {
    private static final String BUILDER_LIST_SUFFIX = "OrBuilderList";
    private static final String BYTES_SUFFIX = "Bytes";
    private static final char[] INDENT_BUFFER;
    private static final String LIST_SUFFIX = "List";
    private static final String MAP_SUFFIX = "Map";

    static {
        char[] cArr = new char[80];
        INDENT_BUFFER = cArr;
        Arrays.fill(cArr, ' ');
    }

    private MessageLiteToString() {
    }

    private static void indent(int indent, StringBuilder buffer) {
        while (indent > 0) {
            char[] cArr = INDENT_BUFFER;
            int length = indent > cArr.length ? cArr.length : indent;
            buffer.append(cArr, 0, length);
            indent -= length;
        }
    }

    private static boolean isDefaultValue(Object o11) {
        return o11 instanceof Boolean ? !((Boolean) o11).booleanValue() : o11 instanceof Integer ? ((Integer) o11).intValue() == 0 : o11 instanceof Float ? Float.floatToRawIntBits(((Float) o11).floatValue()) == 0 : o11 instanceof Double ? Double.doubleToRawLongBits(((Double) o11).doubleValue()) == 0 : o11 instanceof String ? o11.equals("") : o11 instanceof ByteString ? o11.equals(ByteString.EMPTY) : o11 instanceof MessageLite ? o11 == ((MessageLite) o11).getDefaultInstanceForType() : (o11 instanceof java.lang.Enum) && ((java.lang.Enum) o11).ordinal() == 0;
    }

    private static String pascalCaseToSnakeCase(String pascalCase) {
        if (pascalCase.isEmpty()) {
            return pascalCase;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(Character.toLowerCase(pascalCase.charAt(0)));
        for (int i11 = 1; i11 < pascalCase.length(); i11++) {
            char charAt = pascalCase.charAt(i11);
            if (Character.isUpperCase(charAt)) {
                sb2.append("_");
            }
            sb2.append(Character.toLowerCase(charAt));
        }
        return sb2.toString();
    }

    public static void printField(StringBuilder buffer, int indent, String name, Object object) {
        if (object instanceof List) {
            Iterator it = ((List) object).iterator();
            while (it.hasNext()) {
                printField(buffer, indent, name, it.next());
            }
            return;
        }
        if (object instanceof Map) {
            Iterator it2 = ((Map) object).entrySet().iterator();
            while (it2.hasNext()) {
                printField(buffer, indent, name, (Map.Entry) it2.next());
            }
            return;
        }
        buffer.append('\n');
        indent(indent, buffer);
        buffer.append(pascalCaseToSnakeCase(name));
        if (object instanceof String) {
            buffer.append(": \"");
            buffer.append(TextFormatEscaper.escapeText((String) object));
            buffer.append('\"');
            return;
        }
        if (object instanceof ByteString) {
            buffer.append(": \"");
            buffer.append(TextFormatEscaper.escapeBytes((ByteString) object));
            buffer.append('\"');
            return;
        }
        if (object instanceof GeneratedMessageLite) {
            buffer.append(" {");
            reflectivePrintWithIndent((GeneratedMessageLite) object, buffer, indent + 2);
            buffer.append("\n");
            indent(indent, buffer);
            buffer.append(i.f11099d);
            return;
        }
        if (!(object instanceof Map.Entry)) {
            buffer.append(": ");
            buffer.append(object);
            return;
        }
        buffer.append(" {");
        Map.Entry entry = (Map.Entry) object;
        int i11 = indent + 2;
        printField(buffer, i11, a.d.C0245a.f16161a, entry.getKey());
        printField(buffer, i11, "value", entry.getValue());
        buffer.append("\n");
        indent(indent, buffer);
        buffer.append(i.f11099d);
    }

    private static void reflectivePrintWithIndent(MessageLite messageLite, StringBuilder buffer, int indent) {
        int i11;
        int i12;
        java.lang.reflect.Method method;
        java.lang.reflect.Method method2;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        java.lang.reflect.Method[] declaredMethods = messageLite.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i13 = 0;
        while (true) {
            i11 = 3;
            if (i13 >= length) {
                break;
            }
            java.lang.reflect.Method method3 = declaredMethods[i13];
            if (!Modifier.isStatic(method3.getModifiers()) && method3.getName().length() >= 3) {
                if (method3.getName().startsWith(d.f46854h)) {
                    hashSet.add(method3.getName());
                } else if (Modifier.isPublic(method3.getModifiers()) && method3.getParameterTypes().length == 0) {
                    if (method3.getName().startsWith("has")) {
                        hashMap.put(method3.getName(), method3);
                    } else if (method3.getName().startsWith(d.f46852f)) {
                        treeMap.put(method3.getName(), method3);
                    }
                }
            }
            i13++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String substring = ((String) entry.getKey()).substring(i11);
            if (!substring.endsWith(LIST_SUFFIX) || substring.endsWith(BUILDER_LIST_SUFFIX) || substring.equals(LIST_SUFFIX) || (method2 = (java.lang.reflect.Method) entry.getValue()) == null) {
                i12 = i11;
            } else {
                i12 = i11;
                if (method2.getReturnType().equals(List.class)) {
                    printField(buffer, indent, substring.substring(0, substring.length() - 4), GeneratedMessageLite.invokeOrDie(method2, messageLite, new Object[0]));
                    i11 = i12;
                }
            }
            if (!substring.endsWith(MAP_SUFFIX) || substring.equals(MAP_SUFFIX) || (method = (java.lang.reflect.Method) entry.getValue()) == null || !method.getReturnType().equals(Map.class) || method.isAnnotationPresent(Deprecated.class) || !Modifier.isPublic(method.getModifiers())) {
                if (hashSet.contains(d.f46854h + substring)) {
                    if (substring.endsWith(BYTES_SUFFIX)) {
                        if (treeMap.containsKey(d.f46852f + substring.substring(0, substring.length() - 5))) {
                        }
                    }
                    java.lang.reflect.Method method4 = (java.lang.reflect.Method) entry.getValue();
                    java.lang.reflect.Method method5 = (java.lang.reflect.Method) hashMap.get("has" + substring);
                    if (method4 != null) {
                        Object invokeOrDie = GeneratedMessageLite.invokeOrDie(method4, messageLite, new Object[0]);
                        if (method5 == null ? !isDefaultValue(invokeOrDie) : ((Boolean) GeneratedMessageLite.invokeOrDie(method5, messageLite, new Object[0])).booleanValue()) {
                            printField(buffer, indent, substring, invokeOrDie);
                        }
                    }
                }
            } else {
                printField(buffer, indent, substring.substring(0, substring.length() - 3), GeneratedMessageLite.invokeOrDie(method, messageLite, new Object[0]));
            }
            i11 = i12;
        }
        if (messageLite instanceof GeneratedMessageLite.ExtendableMessage) {
            Iterator<Map.Entry<GeneratedMessageLite.ExtensionDescriptor, Object>> it = ((GeneratedMessageLite.ExtendableMessage) messageLite).extensions.iterator();
            while (it.hasNext()) {
                Map.Entry<GeneratedMessageLite.ExtensionDescriptor, Object> next = it.next();
                printField(buffer, indent, "[" + next.getKey().getNumber() + "]", next.getValue());
            }
        }
        UnknownFieldSetLite unknownFieldSetLite = ((GeneratedMessageLite) messageLite).unknownFields;
        if (unknownFieldSetLite != null) {
            unknownFieldSetLite.printWithIndent(buffer, indent);
        }
    }

    public static String toString(MessageLite messageLite, String commentString) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(commentString);
        reflectivePrintWithIndent(messageLite, sb2, 0);
        return sb2.toString();
    }
}

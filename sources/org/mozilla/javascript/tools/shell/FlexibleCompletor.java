package org.mozilla.javascript.tools.shell;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.List;
import org.mozilla.javascript.Function;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;
import pn.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
class FlexibleCompletor implements InvocationHandler {
    private Method completeMethod;
    private Scriptable global;

    public FlexibleCompletor(Class<?> cls, Scriptable scriptable) throws NoSuchMethodException {
        this.global = scriptable;
        this.completeMethod = cls.getMethod("complete", String.class, Integer.TYPE, List.class);
    }

    public int complete(String str, int i11, List<String> list) {
        int i12 = i11 - 1;
        while (i12 >= 0) {
            char charAt = str.charAt(i12);
            if (!Character.isJavaIdentifierPart(charAt) && charAt != '.') {
                break;
            }
            i12--;
        }
        String[] split = str.substring(i12 + 1, i11).split("\\.", -1);
        Scriptable scriptable = this.global;
        for (int i13 = 0; i13 < split.length - 1; i13++) {
            Object obj = scriptable.get(split[i13], this.global);
            if (!(obj instanceof Scriptable)) {
                return str.length();
            }
            scriptable = (Scriptable) obj;
        }
        Object[] allIds = scriptable instanceof ScriptableObject ? ((ScriptableObject) scriptable).getAllIds() : scriptable.getIds();
        String str2 = split[split.length - 1];
        for (Object obj2 : allIds) {
            if (obj2 instanceof String) {
                String str3 = (String) obj2;
                if (str3.startsWith(str2)) {
                    if (scriptable.get(str3, scriptable) instanceof Function) {
                        str3 = str3 + j.f81006c;
                    }
                    list.add(str3);
                }
            }
        }
        return str.length() - str2.length();
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) {
        if (method.equals(this.completeMethod)) {
            return Integer.valueOf(complete((String) objArr[0], ((Integer) objArr[1]).intValue(), (List) objArr[2]));
        }
        throw new NoSuchMethodError(method.toString());
    }
}

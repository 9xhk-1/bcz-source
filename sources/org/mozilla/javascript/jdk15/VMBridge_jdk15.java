package org.mozilla.javascript.jdk15;

import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.Iterator;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.Wrapper;
import org.mozilla.javascript.jdk13.VMBridge_jdk13;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class VMBridge_jdk15 extends VMBridge_jdk13 {
    public VMBridge_jdk15() throws SecurityException, InstantiationException {
        try {
            Method.class.getMethod("isVarArgs", null);
        } catch (NoSuchMethodException e11) {
            throw new InstantiationException(e11.getMessage());
        }
    }

    @Override // org.mozilla.javascript.VMBridge
    public Iterator<?> getJavaIterator(Context context, Scriptable scriptable, Object obj) {
        if (obj instanceof Wrapper) {
            Object unwrap = ((Wrapper) obj).unwrap();
            r2 = unwrap instanceof Iterator ? (Iterator) unwrap : null;
            if (unwrap instanceof Iterable) {
                return ((Iterable) unwrap).iterator();
            }
        }
        return r2;
    }

    @Override // org.mozilla.javascript.jdk13.VMBridge_jdk13, org.mozilla.javascript.VMBridge
    public boolean isVarArgs(Member member) {
        if (member instanceof Method) {
            return ((Method) member).isVarArgs();
        }
        if (member instanceof Constructor) {
            return ((Constructor) member).isVarArgs();
        }
        return false;
    }
}

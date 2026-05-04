package com.baicizhan.learning_strategy.util;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class c {
    public static Object a(int i11, Scriptable scriptable, String str) {
        Context enter = Context.enter();
        enter.setOptimizationLevel(i11);
        try {
            return b(enter, scriptable, str);
        } finally {
            Context.exit();
        }
    }

    public static Object b(Context context, Scriptable scriptable, String str) {
        f fVar = new f();
        fVar.a();
        Object evaluateString = context.evaluateString(scriptable, str, null, 0, null);
        fVar.b();
        return evaluateString;
    }

    public static Object c(Scriptable scriptable, String str) {
        return a(-1, scriptable, str);
    }
}

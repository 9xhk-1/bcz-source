package com.baicizhan.learning_strategy.util;

import org.mozilla.javascript.NativeArray;
import org.mozilla.javascript.ScriptRuntime;
import org.mozilla.javascript.TopLevel;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class b {
    public static NativeArray a(int i11) {
        NativeArray nativeArray = new NativeArray(i11);
        ScriptRuntime.setBuiltinProtoAndParent(nativeArray, zc.c.d().c(), TopLevel.Builtins.Array);
        return nativeArray;
    }
}

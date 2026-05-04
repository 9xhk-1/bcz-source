package org.mozilla.javascript.regexp;

import org.mozilla.javascript.Context;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
class CompilerState {
    char[] cpbegin;
    int cpend;

    /* renamed from: cx, reason: collision with root package name */
    Context f78397cx;
    int flags;
    int parenNesting;
    RENode result;

    /* renamed from: cp, reason: collision with root package name */
    int f78396cp = 0;
    int parenCount = 0;
    int classCount = 0;
    int progLength = 0;

    public CompilerState(Context context, char[] cArr, int i11, int i12) {
        this.f78397cx = context;
        this.cpbegin = cArr;
        this.cpend = i11;
        this.flags = i12;
    }
}

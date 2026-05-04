package org.mozilla.javascript.regexp;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
class REBackTrackData {
    final int continuationOp;
    final int continuationPc;

    /* renamed from: cp, reason: collision with root package name */
    final int f78399cp;

    /* renamed from: op, reason: collision with root package name */
    final int f78400op;
    final long[] parens;

    /* renamed from: pc, reason: collision with root package name */
    final int f78401pc;
    final REBackTrackData previous;
    final REProgState stateStackTop;

    public REBackTrackData(REGlobalData rEGlobalData, int i11, int i12, int i13, int i14, int i15) {
        this.previous = rEGlobalData.backTrackStackTop;
        this.f78400op = i11;
        this.f78401pc = i12;
        this.f78399cp = i13;
        this.continuationOp = i14;
        this.continuationPc = i15;
        this.parens = rEGlobalData.parens;
        this.stateStackTop = rEGlobalData.stateStackTop;
    }
}

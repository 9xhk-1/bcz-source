package org.mozilla.javascript.regexp;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
class REGlobalData {
    REBackTrackData backTrackStackTop;

    /* renamed from: cp, reason: collision with root package name */
    int f78402cp;
    boolean multiline;
    long[] parens;
    RECompiled regexp;
    int skipped;
    REProgState stateStackTop;

    public int parensIndex(int i11) {
        return (int) this.parens[i11];
    }

    public int parensLength(int i11) {
        return (int) (this.parens[i11] >>> 32);
    }

    public void setParens(int i11, int i12, int i13) {
        REBackTrackData rEBackTrackData = this.backTrackStackTop;
        if (rEBackTrackData != null) {
            long[] jArr = rEBackTrackData.parens;
            long[] jArr2 = this.parens;
            if (jArr == jArr2) {
                this.parens = (long[]) jArr2.clone();
            }
        }
        this.parens[i11] = (i13 << 32) | (i12 & 4294967295L);
    }
}

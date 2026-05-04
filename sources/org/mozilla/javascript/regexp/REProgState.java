package org.mozilla.javascript.regexp;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
class REProgState {
    final REBackTrackData backTrack;
    final int continuationOp;
    final int continuationPc;
    final int index;
    final int max;
    final int min;
    final REProgState previous;

    public REProgState(REProgState rEProgState, int i11, int i12, int i13, REBackTrackData rEBackTrackData, int i14, int i15) {
        this.previous = rEProgState;
        this.min = i11;
        this.max = i12;
        this.index = i13;
        this.continuationOp = i14;
        this.continuationPc = i15;
        this.backTrack = rEBackTrackData;
    }
}

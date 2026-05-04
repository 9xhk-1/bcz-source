package org.mozilla.javascript.regexp;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
class RENode {
    int bmsize;
    char chr;
    int flatIndex;
    boolean greedy;
    int index;
    RENode kid;
    RENode kid2;
    int kidlen;
    int length;
    int max;
    int min;
    RENode next;

    /* renamed from: op, reason: collision with root package name */
    byte f78403op;
    int parenCount;
    int parenIndex;
    boolean sense;
    int startIndex;

    public RENode(byte b11) {
        this.f78403op = b11;
    }
}

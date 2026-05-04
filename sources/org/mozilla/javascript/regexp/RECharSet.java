package org.mozilla.javascript.regexp;

import java.io.Serializable;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
final class RECharSet implements Serializable {
    static final long serialVersionUID = 7931787979395898394L;
    volatile transient byte[] bits;
    volatile transient boolean converted;
    final int length;
    final boolean sense;
    final int startIndex;
    final int strlength;

    public RECharSet(int i11, int i12, int i13, boolean z11) {
        this.length = i11;
        this.startIndex = i12;
        this.strlength = i13;
        this.sense = z11;
    }
}

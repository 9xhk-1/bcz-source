package org.mozilla.javascript.regexp;

import java.io.Serializable;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
class RECompiled implements Serializable {
    static final long serialVersionUID = -6144956577595844213L;
    int anchorCh = -1;
    int classCount;
    RECharSet[] classList;
    int flags;
    int parenCount;
    byte[] program;
    final char[] source;

    public RECompiled(String str) {
        this.source = str.toCharArray();
    }
}

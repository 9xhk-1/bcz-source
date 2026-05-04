package org.mozilla.javascript.regexp;

import org.mozilla.javascript.Function;
import org.mozilla.javascript.Scriptable;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
final class GlobData {
    Scriptable arrayobj;
    StringBuilder charBuf;
    int dollar = -1;
    boolean global;
    Function lambda;
    int leftIndex;
    int mode;
    int optarg;
    String repstr;
    String str;
}

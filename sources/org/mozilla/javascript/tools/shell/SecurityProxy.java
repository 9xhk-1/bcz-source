package org.mozilla.javascript.tools.shell;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.SecurityController;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public abstract class SecurityProxy extends SecurityController {
    public abstract void callProcessFileSecure(Context context, Scriptable scriptable, String str);
}

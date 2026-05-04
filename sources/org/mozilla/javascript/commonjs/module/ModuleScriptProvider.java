package org.mozilla.javascript.commonjs.module;

import java.net.URI;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public interface ModuleScriptProvider {
    ModuleScript getModuleScript(Context context, String str, URI uri, URI uri2, Scriptable scriptable) throws Exception;
}

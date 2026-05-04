package org.mozilla.javascript.commonjs.module.provider;

import java.net.URI;
import java.util.Iterator;
import java.util.LinkedList;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.commonjs.module.ModuleScript;
import org.mozilla.javascript.commonjs.module.ModuleScriptProvider;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class MultiModuleScriptProvider implements ModuleScriptProvider {
    private final ModuleScriptProvider[] providers;

    public MultiModuleScriptProvider(Iterable<? extends ModuleScriptProvider> iterable) {
        LinkedList linkedList = new LinkedList();
        Iterator<? extends ModuleScriptProvider> it = iterable.iterator();
        while (it.hasNext()) {
            linkedList.add(it.next());
        }
        this.providers = (ModuleScriptProvider[]) linkedList.toArray(new ModuleScriptProvider[linkedList.size()]);
    }

    @Override // org.mozilla.javascript.commonjs.module.ModuleScriptProvider
    public ModuleScript getModuleScript(Context context, String str, URI uri, URI uri2, Scriptable scriptable) throws Exception {
        ModuleScriptProvider[] moduleScriptProviderArr = this.providers;
        int length = moduleScriptProviderArr.length;
        int i11 = 0;
        while (i11 < length) {
            Context context2 = context;
            String str2 = str;
            URI uri3 = uri;
            URI uri4 = uri2;
            Scriptable scriptable2 = scriptable;
            ModuleScript moduleScript = moduleScriptProviderArr[i11].getModuleScript(context2, str2, uri3, uri4, scriptable2);
            if (moduleScript != null) {
                return moduleScript;
            }
            i11++;
            context = context2;
            str = str2;
            uri = uri3;
            uri2 = uri4;
            scriptable = scriptable2;
        }
        return null;
    }
}

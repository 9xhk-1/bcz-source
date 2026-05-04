package org.mozilla.javascript.commonjs.module.provider;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.net.URI;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.Script;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.commonjs.module.ModuleScript;
import org.mozilla.javascript.commonjs.module.provider.CachingModuleScriptProviderBase;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class SoftCachingModuleScriptProvider extends CachingModuleScriptProviderBase {
    private static final long serialVersionUID = 1;
    private transient ReferenceQueue<Script> scriptRefQueue;
    private transient ConcurrentMap<String, ScriptReference> scripts;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ScriptReference extends SoftReference<Script> {
        private final URI base;
        private final String moduleId;
        private final URI uri;
        private final Object validator;

        public ScriptReference(Script script, String str, URI uri, URI uri2, Object obj, ReferenceQueue<Script> referenceQueue) {
            super(script, referenceQueue);
            this.moduleId = str;
            this.uri = uri;
            this.base = uri2;
            this.validator = obj;
        }

        public CachingModuleScriptProviderBase.CachedModuleScript getCachedModuleScript() {
            Script script = get();
            if (script == null) {
                return null;
            }
            return new CachingModuleScriptProviderBase.CachedModuleScript(new ModuleScript(script, this.uri, this.base), this.validator);
        }

        public String getModuleId() {
            return this.moduleId;
        }
    }

    public SoftCachingModuleScriptProvider(ModuleSourceProvider moduleSourceProvider) {
        super(moduleSourceProvider);
        this.scriptRefQueue = new ReferenceQueue<>();
        this.scripts = new ConcurrentHashMap(16, 0.75f, CachingModuleScriptProviderBase.getConcurrencyLevel());
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        this.scriptRefQueue = new ReferenceQueue<>();
        this.scripts = new ConcurrentHashMap();
        for (Map.Entry entry : ((Map) objectInputStream.readObject()).entrySet()) {
            CachingModuleScriptProviderBase.CachedModuleScript cachedModuleScript = (CachingModuleScriptProviderBase.CachedModuleScript) entry.getValue();
            putLoadedModule((String) entry.getKey(), cachedModuleScript.getModule(), cachedModuleScript.getValidator());
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, ScriptReference> entry : this.scripts.entrySet()) {
            CachingModuleScriptProviderBase.CachedModuleScript cachedModuleScript = entry.getValue().getCachedModuleScript();
            if (cachedModuleScript != null) {
                hashMap.put(entry.getKey(), cachedModuleScript);
            }
        }
        objectOutputStream.writeObject(hashMap);
    }

    @Override // org.mozilla.javascript.commonjs.module.provider.CachingModuleScriptProviderBase
    public CachingModuleScriptProviderBase.CachedModuleScript getLoadedModule(String str) {
        ScriptReference scriptReference = this.scripts.get(str);
        if (scriptReference != null) {
            return scriptReference.getCachedModuleScript();
        }
        return null;
    }

    @Override // org.mozilla.javascript.commonjs.module.provider.CachingModuleScriptProviderBase, org.mozilla.javascript.commonjs.module.ModuleScriptProvider
    public ModuleScript getModuleScript(Context context, String str, URI uri, URI uri2, Scriptable scriptable) throws Exception {
        while (true) {
            ScriptReference scriptReference = (ScriptReference) this.scriptRefQueue.poll();
            if (scriptReference == null) {
                return super.getModuleScript(context, str, uri, uri2, scriptable);
            }
            Scriptable scriptable2 = scriptable;
            URI uri3 = uri2;
            this.scripts.remove(scriptReference.getModuleId(), scriptReference);
            str = str;
            uri = uri;
            uri2 = uri3;
            scriptable = scriptable2;
        }
    }

    @Override // org.mozilla.javascript.commonjs.module.provider.CachingModuleScriptProviderBase
    public void putLoadedModule(String str, ModuleScript moduleScript, Object obj) {
        this.scripts.put(str, new ScriptReference(moduleScript.getScript(), str, moduleScript.getUri(), moduleScript.getBase(), obj, this.scriptRefQueue));
    }
}

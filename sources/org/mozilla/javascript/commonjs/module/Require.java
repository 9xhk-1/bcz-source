package org.mozilla.javascript.commonjs.module;

import da0.k1;
import da0.v1;
import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.mozilla.javascript.BaseFunction;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.Script;
import org.mozilla.javascript.ScriptRuntime;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class Require extends BaseFunction {
    private static final ThreadLocal<Map<String, Scriptable>> loadingModuleInterfaces = new ThreadLocal<>();
    private static final long serialVersionUID = 1;
    private Scriptable mainExports;
    private final ModuleScriptProvider moduleScriptProvider;
    private final Scriptable nativeScope;
    private final Scriptable paths;
    private final Script postExec;
    private final Script preExec;
    private final boolean sandboxed;
    private String mainModuleId = null;
    private final Map<String, Scriptable> exportedModuleInterfaces = new ConcurrentHashMap();
    private final Object loadLock = new Object();

    public Require(Context context, Scriptable scriptable, ModuleScriptProvider moduleScriptProvider, Script script, Script script2, boolean z11) {
        this.moduleScriptProvider = moduleScriptProvider;
        this.nativeScope = scriptable;
        this.sandboxed = z11;
        this.preExec = script;
        this.postExec = script2;
        setPrototype(ScriptableObject.getFunctionPrototype(scriptable));
        if (z11) {
            this.paths = null;
            return;
        }
        Scriptable newArray = context.newArray(scriptable, 0);
        this.paths = newArray;
        defineReadOnlyProperty(this, "paths", newArray);
    }

    private static void defineReadOnlyProperty(ScriptableObject scriptableObject, String str, Object obj) {
        ScriptableObject.putProperty(scriptableObject, str, obj);
        scriptableObject.setAttributes(str, 5);
    }

    private Scriptable executeModuleScript(Context context, String str, Scriptable scriptable, ModuleScript moduleScript, boolean z11) {
        ScriptableObject scriptableObject = (ScriptableObject) context.newObject(this.nativeScope);
        URI uri = moduleScript.getUri();
        URI base = moduleScript.getBase();
        defineReadOnlyProperty(scriptableObject, "id", str);
        if (!this.sandboxed) {
            defineReadOnlyProperty(scriptableObject, v1.a.f47590a, uri.toString());
        }
        Scriptable moduleScope = new ModuleScope(this.nativeScope, uri, base);
        moduleScope.put("exports", moduleScope, scriptable);
        moduleScope.put(k1.a.f47555a, moduleScope, scriptableObject);
        scriptableObject.put("exports", scriptableObject, scriptable);
        install(moduleScope);
        if (z11) {
            defineReadOnlyProperty(this, "main", scriptableObject);
        }
        executeOptionalScript(this.preExec, context, moduleScope);
        moduleScript.getScript().exec(context, moduleScope);
        executeOptionalScript(this.postExec, context, moduleScope);
        return ScriptRuntime.toObject(this.nativeScope, ScriptableObject.getProperty(scriptableObject, "exports"));
    }

    private static void executeOptionalScript(Script script, Context context, Scriptable scriptable) {
        if (script != null) {
            script.exec(context, scriptable);
        }
    }

    private Scriptable getExportedModuleInterface(Context context, String str, URI uri, URI uri2, boolean z11) {
        Throwable th2;
        Scriptable scriptable;
        Scriptable scriptable2;
        Scriptable scriptable3 = this.exportedModuleInterfaces.get(str);
        if (scriptable3 != null) {
            if (z11) {
                throw new IllegalStateException("Attempt to set main module after it was loaded");
            }
            return scriptable3;
        }
        ThreadLocal<Map<String, Scriptable>> threadLocal = loadingModuleInterfaces;
        Map<String, Scriptable> map = threadLocal.get();
        if (map != null && (scriptable2 = map.get(str)) != null) {
            return scriptable2;
        }
        synchronized (this.loadLock) {
            try {
                try {
                    scriptable = this.exportedModuleInterfaces.get(str);
                } catch (Throwable th3) {
                    th = th3;
                    th2 = th;
                    throw th2;
                }
                try {
                    if (scriptable != null) {
                        return scriptable;
                    }
                    ModuleScript module = getModule(context, str, uri, uri2);
                    if (this.sandboxed && !module.isSandboxed()) {
                        throw ScriptRuntime.throwError(context, this.nativeScope, "Module \"" + str + "\" is not contained in sandbox.");
                    }
                    Scriptable newObject = context.newObject(this.nativeScope);
                    boolean z12 = map == null;
                    if (z12) {
                        map = new HashMap<>();
                        threadLocal.set(map);
                    }
                    map.put(str, newObject);
                    try {
                        try {
                            Scriptable executeModuleScript = executeModuleScript(context, str, newObject, module, z11);
                            if (newObject != executeModuleScript) {
                                map.put(str, executeModuleScript);
                                newObject = executeModuleScript;
                            }
                            if (z12) {
                                this.exportedModuleInterfaces.putAll(map);
                                threadLocal.set(null);
                            }
                            return newObject;
                        } finally {
                        }
                    } catch (RuntimeException e11) {
                        map.remove(str);
                        throw e11;
                    }
                } catch (Throwable th4) {
                    th2 = th4;
                    throw th2;
                }
            } catch (Throwable th5) {
                th = th5;
                th2 = th;
                throw th2;
            }
        }
    }

    private ModuleScript getModule(Context context, String str, URI uri, URI uri2) {
        try {
            ModuleScript moduleScript = this.moduleScriptProvider.getModuleScript(context, str, uri, uri2, this.paths);
            if (moduleScript != null) {
                return moduleScript;
            }
            throw ScriptRuntime.throwError(context, this.nativeScope, "Module \"" + str + "\" not found.");
        } catch (RuntimeException e11) {
            throw e11;
        } catch (Exception e12) {
            throw Context.throwAsScriptRuntimeEx(e12);
        }
    }

    @Override // org.mozilla.javascript.BaseFunction, org.mozilla.javascript.Function, org.mozilla.javascript.Callable
    public Object call(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        URI uri;
        URI uri2;
        if (objArr == null || objArr.length < 1) {
            throw ScriptRuntime.throwError(context, scriptable, "require() needs one argument");
        }
        String str = (String) Context.jsToJava(objArr[0], String.class);
        if (!str.startsWith("./") && !str.startsWith("../")) {
            uri2 = null;
            uri = null;
        } else {
            if (!(scriptable2 instanceof ModuleScope)) {
                throw ScriptRuntime.throwError(context, scriptable, "Can't resolve relative module ID \"" + str + "\" when require() is used outside of a module");
            }
            ModuleScope moduleScope = (ModuleScope) scriptable2;
            URI base = moduleScope.getBase();
            URI uri3 = moduleScope.getUri();
            URI resolve = uri3.resolve(str);
            if (base == null) {
                str = resolve.toString();
            } else {
                str = base.relativize(uri3).resolve(str).toString();
                if (str.charAt(0) == '.') {
                    if (this.sandboxed) {
                        throw ScriptRuntime.throwError(context, scriptable, "Module \"" + str + "\" is not contained in sandbox.");
                    }
                    str = resolve.toString();
                }
            }
            uri = base;
            uri2 = resolve;
        }
        return getExportedModuleInterface(context, str, uri2, uri, false);
    }

    @Override // org.mozilla.javascript.BaseFunction, org.mozilla.javascript.Function
    public Scriptable construct(Context context, Scriptable scriptable, Object[] objArr) {
        throw ScriptRuntime.throwError(context, scriptable, "require() can not be invoked as a constructor");
    }

    @Override // org.mozilla.javascript.BaseFunction
    public int getArity() {
        return 1;
    }

    @Override // org.mozilla.javascript.BaseFunction
    public String getFunctionName() {
        return "require";
    }

    @Override // org.mozilla.javascript.BaseFunction
    public int getLength() {
        return 1;
    }

    public void install(Scriptable scriptable) {
        ScriptableObject.putProperty(scriptable, "require", this);
    }

    public Scriptable requireMain(Context context, String str) {
        Require require;
        String str2;
        URI uri;
        String str3 = this.mainModuleId;
        if (str3 != null) {
            if (str3.equals(str)) {
                return this.mainExports;
            }
            throw new IllegalStateException("Main module already set to " + this.mainModuleId);
        }
        try {
            if (this.moduleScriptProvider.getModuleScript(context, str, null, null, this.paths) != null) {
                require = this;
                Scriptable exportedModuleInterface = require.getExportedModuleInterface(context, str, null, null, true);
                str2 = str;
                require.mainExports = exportedModuleInterface;
            } else {
                require = this;
                str2 = str;
                if (!require.sandboxed) {
                    try {
                        uri = new URI(str2);
                    } catch (URISyntaxException unused) {
                        uri = null;
                    }
                    if (uri == null || !uri.isAbsolute()) {
                        File file = new File(str2);
                        if (!file.isFile()) {
                            throw ScriptRuntime.throwError(context, require.nativeScope, "Module \"" + str2 + "\" not found.");
                        }
                        uri = file.toURI();
                    }
                    URI uri2 = uri;
                    require.mainExports = require.getExportedModuleInterface(context, uri2.toString(), uri2, null, true);
                }
            }
            require.mainModuleId = str2;
            return require.mainExports;
        } catch (RuntimeException e11) {
            throw e11;
        } catch (Exception e12) {
            throw new RuntimeException(e12);
        }
    }
}

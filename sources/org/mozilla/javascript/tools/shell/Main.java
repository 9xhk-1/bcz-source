package org.mozilla.javascript.tools.shell;

import com.xiaomi.mipush.sdk.Constants;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.reflect.UndeclaredThrowableException;
import java.net.URI;
import java.net.URISyntaxException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.ContextAction;
import org.mozilla.javascript.Function;
import org.mozilla.javascript.GeneratedClassLoader;
import org.mozilla.javascript.Kit;
import org.mozilla.javascript.NativeArray;
import org.mozilla.javascript.RhinoException;
import org.mozilla.javascript.Script;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.SecurityController;
import org.mozilla.javascript.commonjs.module.ModuleScope;
import org.mozilla.javascript.commonjs.module.Require;
import org.mozilla.javascript.tools.SourceReader;
import org.mozilla.javascript.tools.ToolErrorReporter;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class Main {
    private static final int EXITCODE_FILE_NOT_FOUND = 4;
    private static final int EXITCODE_RUNTIME_ERROR = 3;
    protected static ToolErrorReporter errorReporter;
    static String mainModule;
    static List<String> modulePath;
    static Require require;
    private static SecurityProxy securityImpl;
    public static ShellContextFactory shellContextFactory = new ShellContextFactory();
    public static Global global = new Global();
    protected static int exitCode = 0;
    static boolean processStdin = true;
    static List<String> fileList = new ArrayList();
    static boolean sandboxed = false;
    static boolean useRequire = false;
    private static final ScriptCache scriptCache = new ScriptCache(32);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class IProxy implements ContextAction, QuitAction {
        private static final int EVAL_INLINE_SCRIPT = 2;
        private static final int PROCESS_FILES = 1;
        private static final int SYSTEM_EXIT = 3;
        String[] args;
        String scriptText;
        private int type;

        public IProxy(int i11) {
            this.type = i11;
        }

        @Override // org.mozilla.javascript.tools.shell.QuitAction
        public void quit(Context context, int i11) {
            if (this.type != 3) {
                throw Kit.codeBug();
            }
            System.exit(i11);
        }

        @Override // org.mozilla.javascript.ContextAction
        public Object run(Context context) {
            if (Main.useRequire) {
                Main.require = Main.global.installRequire(context, Main.modulePath, Main.sandboxed);
            }
            int i11 = this.type;
            if (i11 == 1) {
                Main.processFiles(context, this.args);
                return null;
            }
            if (i11 != 2) {
                throw Kit.codeBug();
            }
            Main.evalInlineScript(context, this.scriptText);
            return null;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ScriptCache extends LinkedHashMap<String, ScriptReference> {
        int capacity;
        ReferenceQueue<Script> queue;

        public ScriptCache(int i11) {
            super(i11 + 1, 2.0f, true);
            this.capacity = i11;
            this.queue = new ReferenceQueue<>();
        }

        public ScriptReference get(String str, byte[] bArr) {
            while (true) {
                ScriptReference scriptReference = (ScriptReference) this.queue.poll();
                if (scriptReference == null) {
                    break;
                }
                remove(scriptReference.path);
            }
            ScriptReference scriptReference2 = get(str);
            if (scriptReference2 == null || Arrays.equals(bArr, scriptReference2.digest)) {
                return scriptReference2;
            }
            remove(scriptReference2.path);
            return null;
        }

        public void put(String str, byte[] bArr, Script script) {
            put(str, new ScriptReference(str, bArr, script, this.queue));
        }

        @Override // java.util.LinkedHashMap
        public boolean removeEldestEntry(Map.Entry<String, ScriptReference> entry) {
            return size() > this.capacity;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ScriptReference extends SoftReference<Script> {
        byte[] digest;
        String path;

        public ScriptReference(String str, byte[] bArr, Script script, ReferenceQueue<Script> referenceQueue) {
            super(script, referenceQueue);
            this.path = str;
            this.digest = bArr;
        }
    }

    static {
        global.initQuitAction(new IProxy(3));
    }

    public static void evalInlineScript(Context context, String str) {
        try {
            Script compileString = context.compileString(str, "<command>", 1, null);
            if (compileString != null) {
                compileString.exec(context, getShellScope());
            }
        } catch (VirtualMachineError e11) {
            e11.printStackTrace();
            Context.reportError(ToolErrorReporter.getMessage("msg.uncaughtJSException", e11.toString()));
            exitCode = 3;
        } catch (RhinoException e12) {
            ToolErrorReporter.reportException(context.getErrorReporter(), e12);
            exitCode = 3;
        }
    }

    public static int exec(String[] strArr) {
        ToolErrorReporter toolErrorReporter = new ToolErrorReporter(false, global.getErr());
        errorReporter = toolErrorReporter;
        shellContextFactory.setErrorReporter(toolErrorReporter);
        String[] processOptions = processOptions(strArr);
        if (processStdin) {
            fileList.add(null);
        }
        Global global2 = global;
        if (!global2.initialized) {
            global2.init(shellContextFactory);
        }
        IProxy iProxy = new IProxy(1);
        iProxy.args = processOptions;
        shellContextFactory.call(iProxy);
        return exitCode;
    }

    private static byte[] getDigest(Object obj) {
        byte[] bytes;
        if (obj == null) {
            return null;
        }
        if (obj instanceof String) {
            try {
                bytes = ((String) obj).getBytes("UTF-8");
            } catch (UnsupportedEncodingException unused) {
                bytes = ((String) obj).getBytes();
            }
        } else {
            bytes = (byte[]) obj;
        }
        try {
            return MessageDigest.getInstance("MD5").digest(bytes);
        } catch (NoSuchAlgorithmException e11) {
            throw new RuntimeException(e11);
        }
    }

    public static PrintStream getErr() {
        return getGlobal().getErr();
    }

    public static Global getGlobal() {
        return global;
    }

    public static InputStream getIn() {
        return getGlobal().getIn();
    }

    public static PrintStream getOut() {
        return getGlobal().getOut();
    }

    public static Scriptable getScope(String str) {
        URI uri;
        if (!useRequire) {
            return global;
        }
        if (str == null) {
            uri = new File(System.getProperty("user.dir")).toURI();
        } else if (SourceReader.toUrl(str) != null) {
            try {
                uri = new URI(str);
            } catch (URISyntaxException unused) {
                uri = new File(str).toURI();
            }
        } else {
            uri = new File(str).toURI();
        }
        return new ModuleScope(global, uri, null);
    }

    public static Scriptable getShellScope() {
        return getScope(null);
    }

    private static void initJavaPolicySecuritySupport() {
        try {
            SecurityProxy securityProxy = (SecurityProxy) JavaPolicySecurity.class.newInstance();
            securityImpl = securityProxy;
            SecurityController.initGlobal(securityProxy);
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | LinkageError e11) {
            throw Kit.initCause(new IllegalStateException("Can not load security support: " + e11), e11);
        }
    }

    private static Script loadCompiledScript(Context context, String str, byte[] bArr, Object obj) throws FileNotFoundException {
        if (bArr == null) {
            throw new FileNotFoundException(str);
        }
        int lastIndexOf = str.lastIndexOf(47);
        int i11 = lastIndexOf < 0 ? 0 : lastIndexOf + 1;
        int lastIndexOf2 = str.lastIndexOf(46);
        if (lastIndexOf2 < i11) {
            lastIndexOf2 = str.length();
        }
        String substring = str.substring(i11, lastIndexOf2);
        try {
            GeneratedClassLoader createLoader = SecurityController.createLoader(context.getApplicationClassLoader(), obj);
            Class<?> defineClass = createLoader.defineClass(substring, bArr);
            createLoader.linkClass(defineClass);
            if (Script.class.isAssignableFrom(defineClass)) {
                return (Script) defineClass.newInstance();
            }
            throw Context.reportRuntimeError("msg.must.implement.Script");
        } catch (IllegalAccessException e11) {
            Context.reportError(e11.toString());
            throw new RuntimeException(e11);
        } catch (InstantiationException e12) {
            Context.reportError(e12.toString());
            throw new RuntimeException(e12);
        }
    }

    public static void main(String[] strArr) {
        try {
            if (Boolean.getBoolean("rhino.use_java_policy_security")) {
                initJavaPolicySecuritySupport();
            }
        } catch (SecurityException e11) {
            e11.printStackTrace(System.err);
        }
        int exec = exec(strArr);
        if (exec != 0) {
            System.exit(exec);
        }
    }

    public static void processFile(Context context, Scriptable scriptable, String str) throws IOException {
        SecurityProxy securityProxy = securityImpl;
        if (securityProxy == null) {
            processFileSecure(context, scriptable, str, null);
        } else {
            securityProxy.callProcessFileSecure(context, scriptable, str);
        }
    }

    public static void processFileNoThrow(Context context, Scriptable scriptable, String str) {
        try {
            processFile(context, scriptable, str);
        } catch (IOException e11) {
            Context.reportError(ToolErrorReporter.getMessage("msg.couldnt.read.source", str, e11.getMessage()));
            exitCode = 4;
        } catch (VirtualMachineError e12) {
            e12.printStackTrace();
            Context.reportError(ToolErrorReporter.getMessage("msg.uncaughtJSException", e12.toString()));
            exitCode = 3;
        } catch (RhinoException e13) {
            ToolErrorReporter.reportException(context.getErrorReporter(), e13);
            exitCode = 3;
        }
    }

    public static void processFileSecure(Context context, Scriptable scriptable, String str, Object obj) throws IOException {
        Script compileString;
        boolean endsWith = str.endsWith(".class");
        Object readFileOrUrl = readFileOrUrl(str, !endsWith);
        byte[] digest = getDigest(readFileOrUrl);
        String str2 = str + "_" + context.getOptimizationLevel();
        ScriptReference scriptReference = scriptCache.get(str2, digest);
        Script script = scriptReference != null ? scriptReference.get() : null;
        if (script == null) {
            if (endsWith) {
                compileString = loadCompiledScript(context, str, (byte[]) readFileOrUrl, obj);
            } else {
                String str3 = (String) readFileOrUrl;
                if (str3.length() > 0 && str3.charAt(0) == '#') {
                    for (int i11 = 1; i11 != str3.length(); i11++) {
                        char charAt = str3.charAt(i11);
                        if (charAt == '\n' || charAt == '\r') {
                            str3 = str3.substring(i11);
                            break;
                        }
                    }
                }
                compileString = context.compileString(str3, str, 1, obj);
            }
            script = compileString;
            scriptCache.put(str2, digest, script);
        }
        if (script != null) {
            script.exec(context, scriptable);
        }
    }

    public static void processFiles(Context context, String[] strArr) {
        Object[] objArr = new Object[strArr.length];
        System.arraycopy(strArr, 0, objArr, 0, strArr.length);
        global.defineProperty("arguments", context.newArray(global, objArr), 2);
        for (String str : fileList) {
            try {
                processSource(context, str);
            } catch (IOException e11) {
                Context.reportError(ToolErrorReporter.getMessage("msg.couldnt.read.source", str, e11.getMessage()));
                exitCode = 4;
            } catch (VirtualMachineError e12) {
                e12.printStackTrace();
                Context.reportError(ToolErrorReporter.getMessage("msg.uncaughtJSException", e12.toString()));
                exitCode = 3;
            } catch (RhinoException e13) {
                ToolErrorReporter.reportException(context.getErrorReporter(), e13);
                exitCode = 3;
            }
        }
    }

    public static String[] processOptions(String[] strArr) {
        int i11 = 0;
        while (i11 != strArr.length) {
            String str = strArr[i11];
            if (!str.startsWith(Constants.ACCEPT_TIME_SEPARATOR_SERVER)) {
                processStdin = false;
                fileList.add(str);
                mainModule = str;
                String[] strArr2 = new String[(strArr.length - i11) - 1];
                System.arraycopy(strArr, i11 + 1, strArr2, 0, (strArr.length - i11) - 1);
                return strArr2;
            }
            if (str.equals("-version")) {
                i11++;
                if (i11 != strArr.length) {
                    try {
                        int parseInt = Integer.parseInt(strArr[i11]);
                        if (Context.isValidLanguageVersion(parseInt)) {
                            shellContextFactory.setLanguageVersion(parseInt);
                        } else {
                            str = strArr[i11];
                        }
                    } catch (NumberFormatException unused) {
                        str = strArr[i11];
                    }
                }
                global.getOut().println(ToolErrorReporter.getMessage("msg.shell.invalid", str));
                global.getOut().println(ToolErrorReporter.getMessage("msg.shell.usage", Main.class.getName()));
                System.exit(1);
                return null;
            }
            if (str.equals("-opt") || str.equals("-O")) {
                i11++;
                if (i11 != strArr.length) {
                    try {
                        int parseInt2 = Integer.parseInt(strArr[i11]);
                        if (parseInt2 == -2) {
                            parseInt2 = -1;
                        } else if (!Context.isValidOptimizationLevel(parseInt2)) {
                            str = strArr[i11];
                        }
                        shellContextFactory.setOptimizationLevel(parseInt2);
                    } catch (NumberFormatException unused2) {
                        str = strArr[i11];
                    }
                }
                global.getOut().println(ToolErrorReporter.getMessage("msg.shell.invalid", str));
                global.getOut().println(ToolErrorReporter.getMessage("msg.shell.usage", Main.class.getName()));
                System.exit(1);
                return null;
            }
            if (str.equals("-encoding")) {
                i11++;
                if (i11 == strArr.length) {
                    global.getOut().println(ToolErrorReporter.getMessage("msg.shell.invalid", str));
                    global.getOut().println(ToolErrorReporter.getMessage("msg.shell.usage", Main.class.getName()));
                    System.exit(1);
                    return null;
                }
                shellContextFactory.setCharacterEncoding(strArr[i11]);
            } else if (str.equals("-strict")) {
                shellContextFactory.setStrictMode(true);
                shellContextFactory.setAllowReservedKeywords(false);
                errorReporter.setIsReportingWarnings(true);
            } else if (str.equals("-fatal-warnings")) {
                shellContextFactory.setWarningAsError(true);
            } else if (str.equals("-e")) {
                processStdin = false;
                i11++;
                if (i11 == strArr.length) {
                    global.getOut().println(ToolErrorReporter.getMessage("msg.shell.invalid", str));
                    global.getOut().println(ToolErrorReporter.getMessage("msg.shell.usage", Main.class.getName()));
                    System.exit(1);
                    return null;
                }
                Global global2 = global;
                if (!global2.initialized) {
                    global2.init(shellContextFactory);
                }
                IProxy iProxy = new IProxy(2);
                iProxy.scriptText = strArr[i11];
                shellContextFactory.call(iProxy);
            } else if (str.equals("-require")) {
                useRequire = true;
            } else if (str.equals("-sandbox")) {
                sandboxed = true;
                useRequire = true;
            } else if (str.equals("-modules")) {
                i11++;
                if (i11 == strArr.length) {
                    global.getOut().println(ToolErrorReporter.getMessage("msg.shell.invalid", str));
                    global.getOut().println(ToolErrorReporter.getMessage("msg.shell.usage", Main.class.getName()));
                    System.exit(1);
                    return null;
                }
                if (modulePath == null) {
                    modulePath = new ArrayList();
                }
                modulePath.add(strArr[i11]);
                useRequire = true;
            } else if (str.equals("-w")) {
                errorReporter.setIsReportingWarnings(true);
            } else if (str.equals("-f")) {
                processStdin = false;
                i11++;
                if (i11 == strArr.length) {
                    global.getOut().println(ToolErrorReporter.getMessage("msg.shell.invalid", str));
                    global.getOut().println(ToolErrorReporter.getMessage("msg.shell.usage", Main.class.getName()));
                    System.exit(1);
                    return null;
                }
                if (strArr[i11].equals(Constants.ACCEPT_TIME_SEPARATOR_SERVER)) {
                    fileList.add(null);
                } else {
                    fileList.add(strArr[i11]);
                    mainModule = strArr[i11];
                }
            } else if (str.equals("-sealedlib")) {
                global.setSealedStdLib(true);
            } else {
                if (!str.equals("-debug")) {
                    if (str.equals("-?") || str.equals("-help")) {
                        global.getOut().println(ToolErrorReporter.getMessage("msg.shell.usage", Main.class.getName()));
                        System.exit(1);
                    }
                    global.getOut().println(ToolErrorReporter.getMessage("msg.shell.invalid", str));
                    global.getOut().println(ToolErrorReporter.getMessage("msg.shell.usage", Main.class.getName()));
                    System.exit(1);
                    return null;
                }
                shellContextFactory.setGeneratingDebug(true);
            }
            i11++;
        }
        return new String[0];
    }

    public static void processSource(Context context, String str) throws IOException {
        if (str != null && !str.equals(Constants.ACCEPT_TIME_SEPARATOR_SERVER)) {
            if (useRequire && str.equals(mainModule)) {
                require.requireMain(context, str);
                return;
            } else {
                processFile(context, getScope(str), str);
                return;
            }
        }
        Scriptable shellScope = getShellScope();
        PrintStream err = global.getErr();
        if (str == null) {
            err.println(context.getImplementationVersion());
        }
        String characterEncoding = shellContextFactory.getCharacterEncoding();
        if (characterEncoding == null) {
            characterEncoding = System.getProperty("file.encoding");
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(global.getIn(), characterEncoding));
            boolean z11 = false;
            int i11 = 1;
            while (!z11) {
                String[] prompts = global.getPrompts(context);
                if (str == null) {
                    err.print(prompts[0]);
                }
                err.flush();
                String str2 = "";
                while (true) {
                    try {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            z11 = true;
                            break;
                        }
                        str2 = str2 + readLine + "\n";
                        i11++;
                        if (context.stringIsCompilableUnit(str2)) {
                            break;
                        } else {
                            err.print(prompts[1]);
                        }
                    } catch (IOException e11) {
                        err.println(e11.toString());
                    }
                }
                try {
                    try {
                        Script compileString = context.compileString(str2, "<stdin>", i11, null);
                        if (compileString != null) {
                            Object exec = compileString.exec(context, shellScope);
                            if (exec != Context.getUndefinedValue() && (!(exec instanceof Function) || !str2.trim().startsWith("function"))) {
                                try {
                                    err.println(Context.toString(exec));
                                } catch (RhinoException e12) {
                                    ToolErrorReporter.reportException(context.getErrorReporter(), e12);
                                }
                            }
                            NativeArray nativeArray = global.history;
                            nativeArray.put((int) nativeArray.getLength(), nativeArray, str2);
                        }
                    } catch (VirtualMachineError e13) {
                        e13.printStackTrace();
                        Context.reportError(ToolErrorReporter.getMessage("msg.uncaughtJSException", e13.toString()));
                        exitCode = 3;
                    }
                } catch (RhinoException e14) {
                    ToolErrorReporter.reportException(context.getErrorReporter(), e14);
                    exitCode = 3;
                }
            }
            err.println();
        } catch (UnsupportedEncodingException e15) {
            throw new UndeclaredThrowableException(e15);
        }
    }

    private static Object readFileOrUrl(String str, boolean z11) throws IOException {
        return SourceReader.readFileOrUrl(str, z11, shellContextFactory.getCharacterEncoding());
    }

    public static void setErr(PrintStream printStream) {
        getGlobal().setErr(printStream);
    }

    public static void setIn(InputStream inputStream) {
        getGlobal().setIn(inputStream);
    }

    public static void setOut(PrintStream printStream) {
        getGlobal().setOut(printStream);
    }
}

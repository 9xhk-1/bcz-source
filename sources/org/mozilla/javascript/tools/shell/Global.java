package org.mozilla.javascript.tools.shell;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.Reader;
import java.lang.reflect.InvocationTargetException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.ContextAction;
import org.mozilla.javascript.ContextFactory;
import org.mozilla.javascript.ErrorReporter;
import org.mozilla.javascript.Function;
import org.mozilla.javascript.ImporterTopLevel;
import org.mozilla.javascript.NativeArray;
import org.mozilla.javascript.RhinoException;
import org.mozilla.javascript.Script;
import org.mozilla.javascript.ScriptRuntime;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;
import org.mozilla.javascript.Synchronizer;
import org.mozilla.javascript.Undefined;
import org.mozilla.javascript.Wrapper;
import org.mozilla.javascript.commonjs.module.Require;
import org.mozilla.javascript.commonjs.module.RequireBuilder;
import org.mozilla.javascript.commonjs.module.provider.SoftCachingModuleScriptProvider;
import org.mozilla.javascript.commonjs.module.provider.UrlModuleSourceProvider;
import org.mozilla.javascript.serialize.ScriptableInputStream;
import org.mozilla.javascript.serialize.ScriptableOutputStream;
import org.mozilla.javascript.tools.ToolErrorReporter;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class Global extends ImporterTopLevel {
    static final long serialVersionUID = 4029130780977538005L;
    boolean attemptedJLineLoad;
    private HashMap<String, String> doctestCanonicalizations;
    private PrintStream errStream;
    NativeArray history;
    private InputStream inStream;
    boolean initialized;
    private PrintStream outStream;
    private QuitAction quitAction;
    private boolean sealedStdLib = false;
    private String[] prompts = {"js> ", "  > "};

    public Global() {
    }

    public static void defineClass(Context context, Scriptable scriptable, Object[] objArr, Function function) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Class<?> cls = getClass(objArr);
        if (!Scriptable.class.isAssignableFrom(cls)) {
            throw reportRuntimeError("msg.must.implement.Scriptable");
        }
        ScriptableObject.defineClass(scriptable, cls);
    }

    public static Object deserialize(Context context, Scriptable scriptable, Object[] objArr, Function function) throws IOException, ClassNotFoundException {
        if (objArr.length < 1) {
            throw Context.reportRuntimeError("Expected a filename to read the serialization from");
        }
        FileInputStream fileInputStream = new FileInputStream(Context.toString(objArr[0]));
        Scriptable topLevelScope = ScriptableObject.getTopLevelScope(scriptable);
        ScriptableInputStream scriptableInputStream = new ScriptableInputStream(fileInputStream, topLevelScope);
        Object readObject = scriptableInputStream.readObject();
        scriptableInputStream.close();
        return Context.toObject(readObject, topLevelScope);
    }

    public static Object doctest(Context context, Scriptable scriptable, Object[] objArr, Function function) {
        if (objArr.length == 0) {
            return Boolean.FALSE;
        }
        String context2 = Context.toString(objArr[0]);
        Global global = getInstance(function);
        return new Integer(global.runDoctest(context, global, context2, null, 0));
    }

    private boolean doctestOutputMatches(String str, String str2) {
        String trim = str.trim();
        String replace = str2.trim().replace("\r\n", "\n");
        if (trim.equals(replace)) {
            return true;
        }
        for (Map.Entry<String, String> entry : this.doctestCanonicalizations.entrySet()) {
            trim = trim.replace(entry.getKey(), entry.getValue());
        }
        if (trim.equals(replace)) {
            return true;
        }
        Pattern compile = Pattern.compile("@[0-9a-fA-F]+");
        Matcher matcher = compile.matcher(trim);
        Matcher matcher2 = compile.matcher(replace);
        while (matcher.find() && matcher2.find() && matcher2.start() == matcher.start()) {
            int start = matcher.start();
            if (!trim.substring(0, start).equals(replace.substring(0, start))) {
                return false;
            }
            String group = matcher.group();
            String group2 = matcher2.group();
            String str3 = this.doctestCanonicalizations.get(group);
            if (str3 == null) {
                this.doctestCanonicalizations.put(group, group2);
                trim = trim.replace(group, group2);
            } else if (!group2.equals(str3)) {
                return false;
            }
            if (trim.equals(replace)) {
                return true;
            }
        }
        return false;
    }

    public static void gc(Context context, Scriptable scriptable, Object[] objArr, Function function) {
        System.gc();
    }

    private static String getCharCodingFromType(String str) {
        int indexOf = str.indexOf(59);
        if (indexOf < 0) {
            return null;
        }
        int length = str.length();
        int i11 = indexOf + 1;
        while (i11 != length && str.charAt(i11) <= ' ') {
            i11++;
        }
        if (!"charset".regionMatches(true, 0, str, i11, 7)) {
            return null;
        }
        int i12 = i11 + 7;
        while (i12 != length && str.charAt(i12) <= ' ') {
            i12++;
        }
        if (i12 == length || str.charAt(i12) != '=') {
            return null;
        }
        do {
            i12++;
            if (i12 == length) {
                break;
            }
        } while (str.charAt(i12) <= ' ');
        if (i12 == length) {
            return null;
        }
        while (str.charAt(length - 1) <= ' ') {
            length--;
        }
        return str.substring(i12, length);
    }

    private static Class<?> getClass(Object[] objArr) {
        if (objArr.length == 0) {
            throw reportRuntimeError("msg.expected.string.arg");
        }
        Object obj = objArr[0];
        if (obj instanceof Wrapper) {
            Object unwrap = ((Wrapper) obj).unwrap();
            if (unwrap instanceof Class) {
                return (Class) unwrap;
            }
        }
        String context = Context.toString(objArr[0]);
        try {
            return Class.forName(context);
        } catch (ClassNotFoundException unused) {
            throw reportRuntimeError("msg.class.not.found", context);
        }
    }

    private static Global getInstance(Function function) {
        Scriptable parentScope = function.getParentScope();
        if (parentScope instanceof Global) {
            return (Global) parentScope;
        }
        throw reportRuntimeError("msg.bad.shell.function.scope", String.valueOf(parentScope));
    }

    public static void help(Context context, Scriptable scriptable, Object[] objArr, Function function) {
        getInstance(function).getOut().println(ToolErrorReporter.getMessage("msg.help"));
    }

    public static void load(Context context, Scriptable scriptable, Object[] objArr, Function function) {
        for (Object obj : objArr) {
            String context2 = Context.toString(obj);
            try {
                Main.processFile(context, scriptable, context2);
            } catch (IOException e11) {
                throw Context.reportRuntimeError(ToolErrorReporter.getMessage("msg.couldnt.read.source", context2, e11.getMessage()));
            } catch (VirtualMachineError e12) {
                e12.printStackTrace();
                throw Context.reportRuntimeError(ToolErrorReporter.getMessage("msg.uncaughtJSException", e12.toString()));
            }
        }
    }

    public static void loadClass(Context context, Scriptable scriptable, Object[] objArr, Function function) throws IllegalAccessException, InstantiationException {
        Class<?> cls = getClass(objArr);
        if (!Script.class.isAssignableFrom(cls)) {
            throw reportRuntimeError("msg.must.implement.Script");
        }
        ((Script) cls.newInstance()).exec(context, scriptable);
    }

    public static void pipe(boolean z11, InputStream inputStream, OutputStream outputStream) throws IOException {
        try {
            byte[] bArr = new byte[4096];
            while (true) {
                int read = !z11 ? inputStream.read(bArr, 0, 4096) : inputStream.read(bArr, 0, 4096);
                if (read >= 0) {
                    if (z11) {
                        outputStream.write(bArr, 0, read);
                        outputStream.flush();
                    } else {
                        try {
                            outputStream.write(bArr, 0, read);
                            outputStream.flush();
                        } catch (IOException unused) {
                        }
                    }
                }
                try {
                    break;
                } catch (IOException unused2) {
                    return;
                }
            }
        } finally {
            try {
                if (z11) {
                    inputStream.close();
                } else {
                    outputStream.close();
                }
            } catch (IOException unused3) {
            }
        }
    }

    public static Object print(Context context, Scriptable scriptable, Object[] objArr, Function function) {
        PrintStream out = getInstance(function).getOut();
        for (int i11 = 0; i11 < objArr.length; i11++) {
            if (i11 > 0) {
                out.print(" ");
            }
            out.print(Context.toString(objArr[i11]));
        }
        out.println();
        return Context.getUndefinedValue();
    }

    public static void quit(Context context, Scriptable scriptable, Object[] objArr, Function function) {
        Global global = getInstance(function);
        if (global.quitAction != null) {
            global.quitAction.quit(context, objArr.length != 0 ? ScriptRuntime.toInt32(objArr[0]) : 0);
        }
    }

    public static Object readFile(Context context, Scriptable scriptable, Object[] objArr, Function function) throws IOException {
        if (objArr.length != 0) {
            return readUrl(ScriptRuntime.toString(objArr[0]), objArr.length >= 2 ? ScriptRuntime.toString(objArr[1]) : null, true);
        }
        throw reportRuntimeError("msg.shell.readFile.bad.args");
    }

    private static String readReader(Reader reader) throws IOException {
        return readReader(reader, 4096);
    }

    public static Object readUrl(Context context, Scriptable scriptable, Object[] objArr, Function function) throws IOException {
        if (objArr.length != 0) {
            return readUrl(ScriptRuntime.toString(objArr[0]), objArr.length >= 2 ? ScriptRuntime.toString(objArr[1]) : null, false);
        }
        throw reportRuntimeError("msg.shell.readUrl.bad.args");
    }

    public static RuntimeException reportRuntimeError(String str) {
        return Context.reportRuntimeError(ToolErrorReporter.getMessage(str));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c9  */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object runCommand(org.mozilla.javascript.Context r19, org.mozilla.javascript.Scriptable r20, java.lang.Object[] r21, org.mozilla.javascript.Function r22) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 379
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mozilla.javascript.tools.shell.Global.runCommand(org.mozilla.javascript.Context, org.mozilla.javascript.Scriptable, java.lang.Object[], org.mozilla.javascript.Function):java.lang.Object");
    }

    private static int runProcess(String[] strArr, String[] strArr2, InputStream inputStream, OutputStream outputStream, OutputStream outputStream2) throws IOException {
        PipeThread pipeThread;
        PipeThread pipeThread2;
        Process exec = strArr2 == null ? Runtime.getRuntime().exec(strArr) : Runtime.getRuntime().exec(strArr, strArr2);
        PipeThread pipeThread3 = null;
        try {
            if (inputStream != null) {
                pipeThread = new PipeThread(false, inputStream, exec.getOutputStream());
                pipeThread.start();
            } else {
                exec.getOutputStream().close();
                pipeThread = null;
            }
            if (outputStream != null) {
                pipeThread2 = new PipeThread(true, exec.getInputStream(), outputStream);
                pipeThread2.start();
            } else {
                exec.getInputStream().close();
                pipeThread2 = null;
            }
            if (outputStream2 != null) {
                pipeThread3 = new PipeThread(true, exec.getErrorStream(), outputStream2);
                pipeThread3.start();
            } else {
                exec.getErrorStream().close();
            }
            while (true) {
                try {
                    exec.waitFor();
                    if (pipeThread2 != null) {
                        pipeThread2.join();
                    }
                    if (pipeThread != null) {
                        pipeThread.join();
                    }
                    if (pipeThread3 == null) {
                        break;
                    }
                    pipeThread3.join();
                    break;
                } catch (InterruptedException unused) {
                }
            }
            int exitValue = exec.exitValue();
            exec.destroy();
            return exitValue;
        } catch (Throwable th2) {
            exec.destroy();
            throw th2;
        }
    }

    public static void seal(Context context, Scriptable scriptable, Object[] objArr, Function function) {
        for (int i11 = 0; i11 != objArr.length; i11++) {
            Object obj = objArr[i11];
            if (!(obj instanceof ScriptableObject) || obj == Undefined.instance) {
                if ((obj instanceof Scriptable) && obj != Undefined.instance) {
                    throw reportRuntimeError("msg.shell.seal.not.scriptable");
                }
                throw reportRuntimeError("msg.shell.seal.not.object");
            }
        }
        for (int i12 = 0; i12 != objArr.length; i12++) {
            ((ScriptableObject) objArr[i12]).sealObject();
        }
    }

    public static void serialize(Context context, Scriptable scriptable, Object[] objArr, Function function) throws IOException {
        if (objArr.length < 2) {
            throw Context.reportRuntimeError("Expected an object to serialize and a filename to write the serialization to");
        }
        Object obj = objArr[0];
        ScriptableOutputStream scriptableOutputStream = new ScriptableOutputStream(new FileOutputStream(Context.toString(objArr[1])), ScriptableObject.getTopLevelScope(scriptable));
        scriptableOutputStream.writeObject(obj);
        scriptableOutputStream.close();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object spawn(org.mozilla.javascript.Context r2, org.mozilla.javascript.Scriptable r3, java.lang.Object[] r4, org.mozilla.javascript.Function r5) {
        /*
            org.mozilla.javascript.Scriptable r3 = r5.getParentScope()
            int r5 = r4.length
            r0 = 0
            if (r5 == 0) goto L2e
            r5 = r4[r0]
            boolean r5 = r5 instanceof org.mozilla.javascript.Function
            if (r5 == 0) goto L2e
            int r5 = r4.length
            r1 = 1
            if (r5 <= r1) goto L1f
            r5 = r4[r1]
            boolean r1 = r5 instanceof org.mozilla.javascript.Scriptable
            if (r1 == 0) goto L1f
            org.mozilla.javascript.Scriptable r5 = (org.mozilla.javascript.Scriptable) r5
            java.lang.Object[] r5 = r2.getElements(r5)
            goto L20
        L1f:
            r5 = 0
        L20:
            if (r5 != 0) goto L24
            java.lang.Object[] r5 = org.mozilla.javascript.ScriptRuntime.emptyArgs
        L24:
            org.mozilla.javascript.tools.shell.Runner r1 = new org.mozilla.javascript.tools.shell.Runner
            r4 = r4[r0]
            org.mozilla.javascript.Function r4 = (org.mozilla.javascript.Function) r4
            r1.<init>(r3, r4, r5)
            goto L3e
        L2e:
            int r5 = r4.length
            if (r5 == 0) goto L4d
            r4 = r4[r0]
            boolean r5 = r4 instanceof org.mozilla.javascript.Script
            if (r5 == 0) goto L4d
            org.mozilla.javascript.tools.shell.Runner r1 = new org.mozilla.javascript.tools.shell.Runner
            org.mozilla.javascript.Script r4 = (org.mozilla.javascript.Script) r4
            r1.<init>(r3, r4)
        L3e:
            org.mozilla.javascript.ContextFactory r2 = r2.getFactory()
            r1.factory = r2
            java.lang.Thread r2 = new java.lang.Thread
            r2.<init>(r1)
            r2.start()
            return r2
        L4d:
            java.lang.String r2 = "msg.spawn.args"
            java.lang.RuntimeException r2 = reportRuntimeError(r2)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mozilla.javascript.tools.shell.Global.spawn(org.mozilla.javascript.Context, org.mozilla.javascript.Scriptable, java.lang.Object[], org.mozilla.javascript.Function):java.lang.Object");
    }

    public static Object sync(Context context, Scriptable scriptable, Object[] objArr, Function function) {
        Object obj;
        if (objArr.length >= 1 && objArr.length <= 2) {
            Object obj2 = objArr[0];
            if (obj2 instanceof Function) {
                if (objArr.length != 2 || (obj = objArr[1]) == Undefined.instance) {
                    obj = null;
                }
                return new Synchronizer((Function) obj2, obj);
            }
        }
        throw reportRuntimeError("msg.sync.args");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.io.InputStream toInputStream(java.lang.Object r4) throws java.io.IOException {
        /*
            boolean r0 = r4 instanceof org.mozilla.javascript.Wrapper
            r1 = 0
            if (r0 == 0) goto L3c
            r0 = r4
            org.mozilla.javascript.Wrapper r0 = (org.mozilla.javascript.Wrapper) r0
            java.lang.Object r0 = r0.unwrap()
            boolean r2 = r0 instanceof java.io.InputStream
            if (r2 == 0) goto L16
            java.io.InputStream r0 = (java.io.InputStream) r0
            r3 = r1
            r1 = r0
            r0 = r3
            goto L3d
        L16:
            boolean r2 = r0 instanceof byte[]
            if (r2 == 0) goto L24
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream
            byte[] r0 = (byte[]) r0
            r2.<init>(r0)
            r0 = r1
            r1 = r2
            goto L3d
        L24:
            boolean r2 = r0 instanceof java.io.Reader
            if (r2 == 0) goto L2f
            java.io.Reader r0 = (java.io.Reader) r0
            java.lang.String r0 = readReader(r0)
            goto L3d
        L2f:
            boolean r2 = r0 instanceof char[]
            if (r2 == 0) goto L3c
            java.lang.String r2 = new java.lang.String
            char[] r0 = (char[]) r0
            r2.<init>(r0)
            r0 = r2
            goto L3d
        L3c:
            r0 = r1
        L3d:
            if (r1 != 0) goto L4f
            if (r0 != 0) goto L45
            java.lang.String r0 = org.mozilla.javascript.ScriptRuntime.toString(r4)
        L45:
            java.io.ByteArrayInputStream r4 = new java.io.ByteArrayInputStream
            byte[] r0 = r0.getBytes()
            r4.<init>(r0)
            return r4
        L4f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mozilla.javascript.tools.shell.Global.toInputStream(java.lang.Object):java.io.InputStream");
    }

    private static OutputStream toOutputStream(Object obj) {
        if (!(obj instanceof Wrapper)) {
            return null;
        }
        Object unwrap = ((Wrapper) obj).unwrap();
        if (unwrap instanceof OutputStream) {
            return (OutputStream) unwrap;
        }
        return null;
    }

    public static Object toint32(Context context, Scriptable scriptable, Object[] objArr, Function function) {
        Object obj = objArr.length != 0 ? objArr[0] : Undefined.instance;
        return obj instanceof Integer ? obj : ScriptRuntime.wrapInt(ScriptRuntime.toInt32(obj));
    }

    public static double version(Context context, Scriptable scriptable, Object[] objArr, Function function) {
        double languageVersion = context.getLanguageVersion();
        if (objArr.length > 0) {
            context.setLanguageVersion((int) Context.toNumber(objArr[0]));
        }
        return languageVersion;
    }

    public PrintStream getErr() {
        PrintStream printStream = this.errStream;
        return printStream == null ? System.err : printStream;
    }

    public InputStream getIn() {
        if (this.inStream == null && !this.attemptedJLineLoad) {
            InputStream stream = ShellLine.getStream(this);
            if (stream != null) {
                this.inStream = stream;
            }
            this.attemptedJLineLoad = true;
        }
        InputStream inputStream = this.inStream;
        return inputStream == null ? System.in : inputStream;
    }

    public PrintStream getOut() {
        PrintStream printStream = this.outStream;
        return printStream == null ? System.out : printStream;
    }

    public String[] getPrompts(Context context) {
        if (ScriptableObject.hasProperty(this, "prompts")) {
            Object property = ScriptableObject.getProperty(this, "prompts");
            if (property instanceof Scriptable) {
                Scriptable scriptable = (Scriptable) property;
                if (ScriptableObject.hasProperty(scriptable, 0) && ScriptableObject.hasProperty(scriptable, 1)) {
                    Object property2 = ScriptableObject.getProperty(scriptable, 0);
                    if (property2 instanceof Function) {
                        property2 = ((Function) property2).call(context, this, scriptable, new Object[0]);
                    }
                    this.prompts[0] = Context.toString(property2);
                    Object property3 = ScriptableObject.getProperty(scriptable, 1);
                    if (property3 instanceof Function) {
                        property3 = ((Function) property3).call(context, this, scriptable, new Object[0]);
                    }
                    this.prompts[1] = Context.toString(property3);
                }
            }
        }
        return this.prompts;
    }

    public void init(ContextFactory contextFactory) {
        contextFactory.call(new ContextAction() { // from class: org.mozilla.javascript.tools.shell.Global.1
            @Override // org.mozilla.javascript.ContextAction
            public Object run(Context context) {
                Global.this.init(context);
                return null;
            }
        });
    }

    public void initQuitAction(QuitAction quitAction) {
        if (quitAction == null) {
            throw new IllegalArgumentException("quitAction is null");
        }
        if (this.quitAction != null) {
            throw new IllegalArgumentException("The method is once-call.");
        }
        this.quitAction = quitAction;
    }

    public Require installRequire(Context context, List<String> list, boolean z11) {
        RequireBuilder requireBuilder = new RequireBuilder();
        requireBuilder.setSandboxed(z11);
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (String str : list) {
                try {
                    URI uri = new URI(str);
                    if (!uri.isAbsolute()) {
                        uri = new File(str).toURI().resolve("");
                    }
                    if (!uri.toString().endsWith("/")) {
                        uri = new URI(uri + "/");
                    }
                    arrayList.add(uri);
                } catch (URISyntaxException e11) {
                    throw new RuntimeException(e11);
                }
            }
        }
        requireBuilder.setModuleScriptProvider(new SoftCachingModuleScriptProvider(new UrlModuleSourceProvider(arrayList, null)));
        Require createRequire = requireBuilder.createRequire(context, this);
        createRequire.install(this);
        return createRequire;
    }

    public boolean isInitialized() {
        return this.initialized;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 5 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 9 */
    public int runDoctest(Context context, Scriptable scriptable, String str, String str2, int i11) {
        StringBuilder sb2;
        this.doctestCanonicalizations = new HashMap<>();
        String[] split = str.split("[\n\r]+");
        boolean z11 = false;
        String trim = this.prompts[0].trim();
        boolean z12 = true;
        String trim2 = this.prompts[1].trim();
        int i12 = 0;
        while (i12 < split.length && !split[i12].trim().startsWith(trim)) {
            i12++;
        }
        int i13 = 0;
        while (i12 < split.length) {
            String str3 = split[i12].trim().substring(trim.length()) + "\n";
            while (true) {
                i12++;
                if (i12 >= split.length || !split[i12].trim().startsWith(trim2)) {
                    break;
                }
                str3 = (str3 + split[i12].trim().substring(trim2.length())) + "\n";
            }
            String str4 = "";
            int i14 = i12;
            String str5 = "";
            while (i14 < split.length && !split[i14].trim().startsWith(trim)) {
                str5 = str5 + split[i14] + "\n";
                i14++;
            }
            PrintStream out = getOut();
            boolean z13 = z12;
            PrintStream err = getErr();
            String str6 = str5;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            setOut(new PrintStream(byteArrayOutputStream));
            setErr(new PrintStream(byteArrayOutputStream2));
            ErrorReporter errorReporter = context.getErrorReporter();
            context.setErrorReporter(new ToolErrorReporter(z11, getErr()));
            int i15 = i13 + 1;
            int i16 = i14;
            String str7 = trim;
            String[] strArr = split;
            try {
                try {
                    Object evaluateString = context.evaluateString(scriptable, str3, "doctest input", 1, null);
                    if (evaluateString != Context.getUndefinedValue()) {
                        if (evaluateString instanceof Function) {
                            if (!str3.trim().startsWith("function")) {
                            }
                        }
                        str4 = Context.toString(evaluateString);
                    }
                    setOut(out);
                    setErr(err);
                    context.setErrorReporter(errorReporter);
                    sb2 = new StringBuilder();
                } catch (Throwable th2) {
                    setOut(out);
                    setErr(err);
                    context.setErrorReporter(errorReporter);
                    byteArrayOutputStream2.toString();
                    byteArrayOutputStream.toString();
                    throw th2;
                }
            } catch (RhinoException e11) {
                ToolErrorReporter.reportException(context.getErrorReporter(), e11);
                setOut(out);
                setErr(err);
                context.setErrorReporter(errorReporter);
                sb2 = new StringBuilder();
            }
            sb2.append(str4);
            sb2.append(byteArrayOutputStream2.toString());
            sb2.append(byteArrayOutputStream.toString());
            String sb3 = sb2.toString();
            if (!doctestOutputMatches(str6, sb3)) {
                String str8 = "doctest failure running:\n" + str3 + "expected: " + str6 + "actual: " + sb3 + "\n";
                if (str2 != null) {
                    throw Context.reportRuntimeError(str8, str2, (i11 + i16) - 1, null, 0);
                }
                throw Context.reportRuntimeError(str8);
            }
            z12 = z13;
            i12 = i16;
            split = strArr;
            i13 = i15;
            trim = str7;
            z11 = false;
        }
        return i13;
    }

    public void setErr(PrintStream printStream) {
        this.errStream = printStream;
    }

    public void setIn(InputStream inputStream) {
        this.inStream = inputStream;
    }

    public void setOut(PrintStream printStream) {
        this.outStream = printStream;
    }

    public void setSealedStdLib(boolean z11) {
        this.sealedStdLib = z11;
    }

    private static String readReader(Reader reader, int i11) throws IOException {
        char[] cArr = new char[i11];
        int i12 = 0;
        while (true) {
            int read = reader.read(cArr, i12, cArr.length - i12);
            if (read < 0) {
                return new String(cArr, 0, i12);
            }
            i12 += read;
            if (i12 == cArr.length) {
                char[] cArr2 = new char[cArr.length * 2];
                System.arraycopy(cArr, 0, cArr2, 0, i12);
                cArr = cArr2;
            }
        }
    }

    public void init(Context context) {
        initStandardObjects(context, this.sealedStdLib);
        defineFunctionProperties(new String[]{"defineClass", "deserialize", "doctest", "gc", "help", "load", "loadClass", "print", "quit", "readFile", "readUrl", "runCommand", "seal", "serialize", "spawn", "sync", "toint32", "version"}, Global.class, 2);
        Environment.defineClass(this);
        defineProperty("environment", new Environment(this), 2);
        NativeArray nativeArray = (NativeArray) context.newArray(this, 0);
        this.history = nativeArray;
        defineProperty("history", nativeArray, 2);
        this.initialized = true;
    }

    public static RuntimeException reportRuntimeError(String str, String str2) {
        return Context.reportRuntimeError(ToolErrorReporter.getMessage(str, str2));
    }

    public Global(Context context) {
        init(context);
    }

    private static String readUrl(String str, String str2, boolean z11) throws IOException {
        int i11;
        InputStream inputStream;
        InputStreamReader inputStreamReader;
        String contentType;
        InputStream inputStream2 = null;
        try {
            if (!z11) {
                URLConnection openConnection = new URL(str).openConnection();
                inputStream = openConnection.getInputStream();
                i11 = openConnection.getContentLength();
                if (i11 <= 0) {
                    i11 = 1024;
                }
                if (str2 == null && (contentType = openConnection.getContentType()) != null) {
                    str2 = getCharCodingFromType(contentType);
                }
            } else {
                File file = new File(str);
                if (file.exists()) {
                    if (file.canRead()) {
                        long length = file.length();
                        int i12 = (int) length;
                        if (i12 != length) {
                            throw new IOException("Too big file size: " + length);
                        }
                        if (i12 == 0) {
                            return "";
                        }
                        FileInputStream fileInputStream = new FileInputStream(file);
                        i11 = i12;
                        inputStream = fileInputStream;
                    } else {
                        throw new IOException("Cannot read file: " + str);
                    }
                } else {
                    throw new FileNotFoundException("File not found: " + str);
                }
            }
            if (str2 == null) {
                inputStreamReader = new InputStreamReader(inputStream);
            } else {
                inputStreamReader = new InputStreamReader(inputStream, str2);
            }
            String readReader = readReader(inputStreamReader, i11);
            if (inputStream != null) {
                inputStream.close();
            }
            return readReader;
        } catch (Throwable th2) {
            if (0 != 0) {
                inputStream2.close();
            }
            throw th2;
        }
    }
}

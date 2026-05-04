package org.mozilla.javascript.tools.debugger;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.mozilla.javascript.Callable;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.ContextAction;
import org.mozilla.javascript.ContextFactory;
import org.mozilla.javascript.ImporterTopLevel;
import org.mozilla.javascript.Kit;
import org.mozilla.javascript.NativeCall;
import org.mozilla.javascript.ObjArray;
import org.mozilla.javascript.ScriptRuntime;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;
import org.mozilla.javascript.SecurityUtilities;
import org.mozilla.javascript.Undefined;
import org.mozilla.javascript.debug.DebugFrame;
import org.mozilla.javascript.debug.DebuggableObject;
import org.mozilla.javascript.debug.DebuggableScript;
import org.mozilla.javascript.debug.Debugger;
import r60.e;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class Dim {
    public static final int BREAK = 4;
    public static final int EXIT = 5;
    public static final int GO = 3;
    private static final int IPROXY_COMPILE_SCRIPT = 2;
    private static final int IPROXY_DEBUG = 0;
    private static final int IPROXY_EVAL_SCRIPT = 3;
    private static final int IPROXY_LISTEN = 1;
    private static final int IPROXY_OBJECT_IDS = 7;
    private static final int IPROXY_OBJECT_PROPERTY = 6;
    private static final int IPROXY_OBJECT_TO_STRING = 5;
    private static final int IPROXY_STRING_IS_COMPILABLE = 4;
    public static final int STEP_INTO = 1;
    public static final int STEP_OUT = 2;
    public static final int STEP_OVER = 0;
    private boolean breakFlag;
    private boolean breakOnEnter;
    private boolean breakOnExceptions;
    private boolean breakOnReturn;
    private GuiCallback callback;
    private ContextFactory contextFactory;
    private StackFrame evalFrame;
    private String evalRequest;
    private String evalResult;
    private boolean insideInterruptLoop;
    private volatile ContextData interruptedContextData;
    private DimIProxy listener;
    private ScopeProvider scopeProvider;
    private SourceProvider sourceProvider;
    private int frameIndex = -1;
    private Object monitor = new Object();
    private Object eventThreadMonitor = new Object();
    private volatile int returnValue = -1;
    private final Map<String, SourceInfo> urlToSourceInfo = Collections.synchronizedMap(new HashMap());
    private final Map<String, FunctionSource> functionNames = Collections.synchronizedMap(new HashMap());
    private final Map<DebuggableScript, FunctionSource> functionToSource = Collections.synchronizedMap(new HashMap());

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ContextData {
        private boolean breakNextLine;
        private boolean eventThreadFlag;
        private Throwable lastProcessedException;
        private ObjArray frameStack = new ObjArray();
        private int stopAtFrameDepth = -1;

        public static ContextData get(Context context) {
            return (ContextData) context.getDebuggerContextData();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void popFrame() {
            this.frameStack.pop();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void pushFrame(StackFrame stackFrame) {
            this.frameStack.push(stackFrame);
        }

        public int frameCount() {
            return this.frameStack.size();
        }

        public StackFrame getFrame(int i11) {
            return (StackFrame) this.frameStack.get((this.frameStack.size() - i11) - 1);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class DimIProxy implements ContextAction, ContextFactory.Listener, Debugger {
        private boolean booleanResult;
        private Dim dim;

        /* renamed from: id, reason: collision with root package name */
        private Object f78404id;
        private Object object;
        private Object[] objectArrayResult;
        private Object objectResult;
        private String stringResult;
        private String text;
        private int type;
        private String url;

        /* JADX INFO: Access modifiers changed from: private */
        public void withContext() {
            this.dim.contextFactory.call(this);
        }

        @Override // org.mozilla.javascript.ContextFactory.Listener
        public void contextCreated(Context context) {
            if (this.type != 1) {
                Kit.codeBug();
            }
            context.setDebugger(new DimIProxy(this.dim, 0), new ContextData());
            context.setGeneratingDebug(true);
            context.setOptimizationLevel(-1);
        }

        @Override // org.mozilla.javascript.ContextFactory.Listener
        public void contextReleased(Context context) {
            if (this.type != 1) {
                Kit.codeBug();
            }
        }

        @Override // org.mozilla.javascript.debug.Debugger
        public DebugFrame getFrame(Context context, DebuggableScript debuggableScript) {
            if (this.type != 0) {
                Kit.codeBug();
            }
            FunctionSource functionSource = this.dim.getFunctionSource(debuggableScript);
            if (functionSource == null) {
                return null;
            }
            return new StackFrame(context, this.dim, functionSource);
        }

        @Override // org.mozilla.javascript.debug.Debugger
        public void handleCompilationDone(Context context, DebuggableScript debuggableScript, String str) {
            if (this.type != 0) {
                Kit.codeBug();
            }
            if (debuggableScript.isTopLevel()) {
                this.dim.registerTopScript(debuggableScript, str);
            }
        }

        @Override // org.mozilla.javascript.ContextAction
        public Object run(Context context) {
            switch (this.type) {
                case 2:
                    context.compileString(this.text, this.url, 1, null);
                    return null;
                case 3:
                    Scriptable scope = this.dim.scopeProvider != null ? this.dim.scopeProvider.getScope() : null;
                    if (scope == null) {
                        scope = new ImporterTopLevel(context);
                    }
                    context.evaluateString(scope, this.text, this.url, 1, null);
                    return null;
                case 4:
                    this.booleanResult = context.stringIsCompilableUnit(this.text);
                    return null;
                case 5:
                    Object obj = this.object;
                    if (obj == Undefined.instance) {
                        this.stringResult = "undefined";
                    } else if (obj == null) {
                        this.stringResult = "null";
                    } else if (obj instanceof NativeCall) {
                        this.stringResult = "[object Call]";
                    } else {
                        this.stringResult = Context.toString(obj);
                    }
                    return null;
                case 6:
                    this.objectResult = this.dim.getObjectPropertyImpl(context, this.object, this.f78404id);
                    return null;
                case 7:
                    this.objectArrayResult = this.dim.getObjectIdsImpl(context, this.object);
                    return null;
                default:
                    throw Kit.codeBug();
            }
        }

        private DimIProxy(Dim dim, int i11) {
            this.dim = dim;
            this.type = i11;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class FunctionSource {
        private int firstLine;
        private String name;
        private SourceInfo sourceInfo;

        public int firstLine() {
            return this.firstLine;
        }

        public String name() {
            return this.name;
        }

        public SourceInfo sourceInfo() {
            return this.sourceInfo;
        }

        private FunctionSource(SourceInfo sourceInfo, int i11, String str) {
            if (str == null) {
                throw new IllegalArgumentException();
            }
            this.sourceInfo = sourceInfo;
            this.firstLine = i11;
            this.name = str;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class SourceInfo {
        private static final boolean[] EMPTY_BOOLEAN_ARRAY = new boolean[0];
        private boolean[] breakableLines;
        private boolean[] breakpoints;
        private FunctionSource[] functionSources;
        private String source;
        private String url;

        /* JADX INFO: Access modifiers changed from: private */
        public void copyBreakpointsFrom(SourceInfo sourceInfo) {
            int length = sourceInfo.breakpoints.length;
            boolean[] zArr = this.breakpoints;
            if (length > zArr.length) {
                length = zArr.length;
            }
            for (int i11 = 0; i11 != length; i11++) {
                if (sourceInfo.breakpoints[i11]) {
                    this.breakpoints[i11] = true;
                }
            }
        }

        public boolean breakableLine(int i11) {
            boolean[] zArr = this.breakableLines;
            return i11 < zArr.length && zArr[i11];
        }

        public boolean breakpoint(int i11) {
            if (!breakableLine(i11)) {
                throw new IllegalArgumentException(String.valueOf(i11));
            }
            boolean[] zArr = this.breakpoints;
            return i11 < zArr.length && zArr[i11];
        }

        public FunctionSource functionSource(int i11) {
            return this.functionSources[i11];
        }

        public int functionSourcesTop() {
            return this.functionSources.length;
        }

        public void removeAllBreakpoints() {
            synchronized (this.breakpoints) {
                int i11 = 0;
                while (true) {
                    try {
                        boolean[] zArr = this.breakpoints;
                        if (i11 != zArr.length) {
                            zArr[i11] = false;
                            i11++;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }

        public String source() {
            return this.source;
        }

        public String url() {
            return this.url;
        }

        private SourceInfo(String str, DebuggableScript[] debuggableScriptArr, String str2) {
            this.source = str;
            this.url = str2;
            int length = debuggableScriptArr.length;
            int[][] iArr = new int[length][];
            for (int i11 = 0; i11 != length; i11++) {
                iArr[i11] = debuggableScriptArr[i11].getLineNumbers();
            }
            int[] iArr2 = new int[length];
            int i12 = 0;
            int i13 = 0;
            int i14 = -1;
            while (true) {
                if (i12 == length) {
                    break;
                }
                int[] iArr3 = iArr[i12];
                if (iArr3 == null || iArr3.length == 0) {
                    iArr2[i12] = -1;
                } else {
                    int i15 = iArr3[0];
                    int i16 = i15;
                    for (int i17 = 1; i17 != iArr3.length; i17++) {
                        int i18 = iArr3[i17];
                        if (i18 < i15) {
                            i15 = i18;
                        } else if (i18 > i16) {
                            i16 = i18;
                        }
                    }
                    iArr2[i12] = i15;
                    if (i13 > i14) {
                        i13 = i15;
                    } else {
                        i13 = i15 < i13 ? i15 : i13;
                        if (i16 <= i14) {
                        }
                    }
                    i14 = i16;
                }
                i12++;
            }
            if (i13 > i14) {
                boolean[] zArr = EMPTY_BOOLEAN_ARRAY;
                this.breakableLines = zArr;
                this.breakpoints = zArr;
            } else {
                if (i13 < 0) {
                    throw new IllegalStateException(String.valueOf(i13));
                }
                int i19 = i14 + 1;
                this.breakableLines = new boolean[i19];
                this.breakpoints = new boolean[i19];
                for (int i21 = 0; i21 != length; i21++) {
                    int[] iArr4 = iArr[i21];
                    if (iArr4 != null && iArr4.length != 0) {
                        for (int i22 = 0; i22 != iArr4.length; i22++) {
                            this.breakableLines[iArr4[i22]] = true;
                        }
                    }
                }
            }
            this.functionSources = new FunctionSource[length];
            for (int i23 = 0; i23 != length; i23++) {
                String functionName = debuggableScriptArr[i23].getFunctionName();
                if (functionName == null) {
                    functionName = "";
                }
                this.functionSources[i23] = new FunctionSource(this, iArr2[i23], functionName);
            }
        }

        public boolean breakpoint(int i11, boolean z11) {
            boolean z12;
            if (breakableLine(i11)) {
                synchronized (this.breakpoints) {
                    try {
                        boolean[] zArr = this.breakpoints;
                        if (zArr[i11] != z11) {
                            zArr[i11] = z11;
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return z12;
            }
            throw new IllegalArgumentException(String.valueOf(i11));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class StackFrame implements DebugFrame {
        private boolean[] breakpoints;
        private ContextData contextData;
        private Dim dim;
        private FunctionSource fsource;
        private int lineNumber;
        private Scriptable scope;
        private Scriptable thisObj;

        public ContextData contextData() {
            return this.contextData;
        }

        public String getFunctionName() {
            return this.fsource.name();
        }

        public int getLineNumber() {
            return this.lineNumber;
        }

        public String getUrl() {
            return this.fsource.sourceInfo().url();
        }

        @Override // org.mozilla.javascript.debug.DebugFrame
        public void onDebuggerStatement(Context context) {
            this.dim.handleBreakpointHit(this, context);
        }

        @Override // org.mozilla.javascript.debug.DebugFrame
        public void onEnter(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
            this.contextData.pushFrame(this);
            this.scope = scriptable;
            this.thisObj = scriptable2;
            if (this.dim.breakOnEnter) {
                this.dim.handleBreakpointHit(this, context);
            }
        }

        @Override // org.mozilla.javascript.debug.DebugFrame
        public void onExceptionThrown(Context context, Throwable th2) {
            this.dim.handleExceptionThrown(context, th2, this);
        }

        @Override // org.mozilla.javascript.debug.DebugFrame
        public void onExit(Context context, boolean z11, Object obj) {
            if (this.dim.breakOnReturn && !z11) {
                this.dim.handleBreakpointHit(this, context);
            }
            this.contextData.popFrame();
        }

        @Override // org.mozilla.javascript.debug.DebugFrame
        public void onLineChange(Context context, int i11) {
            this.lineNumber = i11;
            if (!this.breakpoints[i11] && !this.dim.breakFlag) {
                boolean z11 = this.contextData.breakNextLine;
                if (z11 && this.contextData.stopAtFrameDepth >= 0) {
                    z11 = this.contextData.frameCount() <= this.contextData.stopAtFrameDepth;
                }
                if (!z11) {
                    return;
                }
                this.contextData.stopAtFrameDepth = -1;
                this.contextData.breakNextLine = false;
            }
            this.dim.handleBreakpointHit(this, context);
        }

        public Object scope() {
            return this.scope;
        }

        public SourceInfo sourceInfo() {
            return this.fsource.sourceInfo();
        }

        public Object thisObj() {
            return this.thisObj;
        }

        private StackFrame(Context context, Dim dim, FunctionSource functionSource) {
            this.dim = dim;
            this.contextData = ContextData.get(context);
            this.fsource = functionSource;
            this.breakpoints = functionSource.sourceInfo().breakpoints;
            this.lineNumber = functionSource.firstLine();
        }
    }

    private static void collectFunctions_r(DebuggableScript debuggableScript, ObjArray objArray) {
        objArray.add(debuggableScript);
        for (int i11 = 0; i11 != debuggableScript.getFunctionCount(); i11++) {
            collectFunctions_r(debuggableScript.getFunction(i11), objArray);
        }
    }

    private static String do_eval(Context context, StackFrame stackFrame, String str) {
        String str2 = "";
        Debugger debugger = context.getDebugger();
        Object debuggerContextData = context.getDebuggerContextData();
        int optimizationLevel = context.getOptimizationLevel();
        context.setDebugger(null, null);
        context.setOptimizationLevel(-1);
        context.setGeneratingDebug(false);
        try {
            try {
                Object call = ((Callable) context.compileString(str, "", 0, null)).call(context, stackFrame.scope, stackFrame.thisObj, ScriptRuntime.emptyArgs);
                if (call != Undefined.instance) {
                    str2 = ScriptRuntime.toString(call);
                }
            } catch (Exception e11) {
                str2 = e11.getMessage();
            }
            return str2 == null ? "null" : str2;
        } finally {
            context.setGeneratingDebug(true);
            context.setOptimizationLevel(optimizationLevel);
            context.setDebugger(debugger, debuggerContextData);
        }
    }

    private FunctionSource functionSource(DebuggableScript debuggableScript) {
        return this.functionToSource.get(debuggableScript);
    }

    private static DebuggableScript[] getAllFunctions(DebuggableScript debuggableScript) {
        ObjArray objArray = new ObjArray();
        collectFunctions_r(debuggableScript, objArray);
        DebuggableScript[] debuggableScriptArr = new DebuggableScript[objArray.size()];
        objArray.toArray(debuggableScriptArr);
        return debuggableScriptArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public FunctionSource getFunctionSource(DebuggableScript debuggableScript) {
        String loadSource;
        FunctionSource functionSource = functionSource(debuggableScript);
        if (functionSource == null) {
            String normalizedUrl = getNormalizedUrl(debuggableScript);
            if (sourceInfo(normalizedUrl) == null && !debuggableScript.isGeneratedScript() && (loadSource = loadSource(normalizedUrl)) != null) {
                DebuggableScript debuggableScript2 = debuggableScript;
                while (true) {
                    DebuggableScript parent = debuggableScript2.getParent();
                    if (parent == null) {
                        registerTopScript(debuggableScript2, loadSource);
                        return functionSource(debuggableScript);
                    }
                    debuggableScript2 = parent;
                }
            }
        }
        return functionSource;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0040 A[EDGE_INSN: B:26:0x0040->B:27:0x0040 BREAK  A[LOOP:0: B:6:0x0011->B:24:0x005e], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String getNormalizedUrl(org.mozilla.javascript.debug.DebuggableScript r11) {
        /*
            r10 = this;
            java.lang.String r11 = r11.getSourceName()
            if (r11 != 0) goto L9
            java.lang.String r11 = "<stdin>"
            return r11
        L9:
            int r0 = r11.length()
            r1 = 0
            r2 = 0
            r4 = r1
            r3 = r2
        L11:
            r5 = 35
            int r5 = r11.indexOf(r5, r3)
            if (r5 >= 0) goto L1a
            goto L40
        L1a:
            int r6 = r5 + 1
            r7 = r6
        L1d:
            if (r7 == r0) goto L2f
            char r8 = r11.charAt(r7)
            r9 = 48
            if (r9 > r8) goto L2f
            r9 = 57
            if (r8 <= r9) goto L2c
            goto L2f
        L2c:
            int r7 = r7 + 1
            goto L1d
        L2f:
            if (r7 == r6) goto L3d
            java.lang.String r6 = "(eval)"
            r8 = 6
            boolean r8 = r6.regionMatches(r2, r11, r7, r8)
            if (r8 == 0) goto L3d
            int r3 = r7 + 6
            goto L3e
        L3d:
            r6 = r1
        L3e:
            if (r6 != 0) goto L50
        L40:
            if (r4 == 0) goto L4f
            if (r3 == r0) goto L4b
            java.lang.String r11 = r11.substring(r3)
            r4.append(r11)
        L4b:
            java.lang.String r11 = r4.toString()
        L4f:
            return r11
        L50:
            if (r4 != 0) goto L5e
            java.lang.StringBuffer r4 = new java.lang.StringBuffer
            r4.<init>()
            java.lang.String r5 = r11.substring(r2, r5)
            r4.append(r5)
        L5e:
            r4.append(r6)
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mozilla.javascript.tools.debugger.Dim.getNormalizedUrl(org.mozilla.javascript.debug.DebuggableScript):java.lang.String");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object[] getObjectIdsImpl(Context context, Object obj) {
        if (!(obj instanceof Scriptable) || obj == Undefined.instance) {
            return Context.emptyArgs;
        }
        Scriptable scriptable = (Scriptable) obj;
        Object[] allIds = scriptable instanceof DebuggableObject ? ((DebuggableObject) scriptable).getAllIds() : scriptable.getIds();
        Scriptable prototype = scriptable.getPrototype();
        Scriptable parentScope = scriptable.getParentScope();
        char c11 = 1;
        int i11 = prototype != null ? 1 : 0;
        if (parentScope != null) {
            i11++;
        }
        if (i11 == 0) {
            return allIds;
        }
        Object[] objArr = new Object[allIds.length + i11];
        System.arraycopy(allIds, 0, objArr, i11, allIds.length);
        if (prototype != null) {
            objArr[0] = "__proto__";
        } else {
            c11 = 0;
        }
        if (parentScope != null) {
            objArr[c11] = "__parent__";
        }
        return objArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object getObjectPropertyImpl(Context context, Object obj, Object obj2) {
        Scriptable scriptable = (Scriptable) obj;
        if (!(obj2 instanceof String)) {
            Object property = ScriptableObject.getProperty(scriptable, ((Integer) obj2).intValue());
            return property == Scriptable.NOT_FOUND ? Undefined.instance : property;
        }
        String str = (String) obj2;
        if (str.equals("this")) {
            return scriptable;
        }
        if (str.equals("__proto__")) {
            return scriptable.getPrototype();
        }
        if (str.equals("__parent__")) {
            return scriptable.getParentScope();
        }
        Object property2 = ScriptableObject.getProperty(scriptable, str);
        return property2 == Scriptable.NOT_FOUND ? Undefined.instance : property2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleBreakpointHit(StackFrame stackFrame, Context context) {
        this.breakFlag = false;
        interrupted(context, stackFrame, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleExceptionThrown(Context context, Throwable th2, StackFrame stackFrame) {
        if (this.breakOnExceptions) {
            ContextData contextData = stackFrame.contextData();
            if (contextData.lastProcessedException != th2) {
                interrupted(context, stackFrame, th2);
                contextData.lastProcessedException = th2;
            }
        }
    }

    private void interrupted(Context context, StackFrame stackFrame, Throwable th2) {
        int i11;
        ContextData contextData = stackFrame.contextData();
        boolean isGuiEventThread = this.callback.isGuiEventThread();
        contextData.eventThreadFlag = isGuiEventThread;
        synchronized (this.eventThreadMonitor) {
            try {
                if (!isGuiEventThread) {
                    while (this.interruptedContextData != null) {
                        this.eventThreadMonitor.wait();
                    }
                } else if (this.interruptedContextData != null) {
                    return;
                }
                this.interruptedContextData = contextData;
                if (this.interruptedContextData == null) {
                    Kit.codeBug();
                }
                try {
                    this.frameIndex = contextData.frameCount() - 1;
                    String thread = Thread.currentThread().toString();
                    String th3 = th2 == null ? null : th2.toString();
                    if (isGuiEventThread) {
                        this.returnValue = -1;
                        this.callback.enterInterrupt(stackFrame, thread, th3);
                        while (this.returnValue == -1) {
                            try {
                                this.callback.dispatchNextGuiEvent();
                            } catch (InterruptedException unused) {
                            }
                        }
                        i11 = this.returnValue;
                    } else {
                        synchronized (this.monitor) {
                            try {
                                if (this.insideInterruptLoop) {
                                    Kit.codeBug();
                                }
                                this.insideInterruptLoop = true;
                                this.evalRequest = null;
                                this.returnValue = -1;
                                this.callback.enterInterrupt(stackFrame, thread, th3);
                                while (true) {
                                    try {
                                        this.monitor.wait();
                                        String str = this.evalRequest;
                                        if (str != null) {
                                            this.evalResult = null;
                                            try {
                                                this.evalResult = do_eval(context, this.evalFrame, str);
                                                this.evalRequest = null;
                                                this.evalFrame = null;
                                                this.monitor.notify();
                                            } catch (Throwable th4) {
                                                this.evalRequest = null;
                                                this.evalFrame = null;
                                                this.monitor.notify();
                                                throw th4;
                                            }
                                        } else if (this.returnValue != -1) {
                                            break;
                                        }
                                    } catch (InterruptedException unused2) {
                                        Thread.currentThread().interrupt();
                                        i11 = -1;
                                    }
                                }
                                i11 = this.returnValue;
                                this.insideInterruptLoop = false;
                            } catch (Throwable th5) {
                                this.insideInterruptLoop = false;
                                throw th5;
                            } finally {
                            }
                        }
                    }
                    if (i11 == 0) {
                        contextData.breakNextLine = true;
                        contextData.stopAtFrameDepth = contextData.frameCount();
                    } else if (i11 == 1) {
                        contextData.breakNextLine = true;
                        contextData.stopAtFrameDepth = -1;
                    } else if (i11 == 2 && contextData.frameCount() > 1) {
                        contextData.breakNextLine = true;
                        contextData.stopAtFrameDepth = contextData.frameCount() - 1;
                    }
                    synchronized (this.eventThreadMonitor) {
                        this.interruptedContextData = null;
                        this.eventThreadMonitor.notifyAll();
                    }
                } catch (Throwable th6) {
                    synchronized (this.eventThreadMonitor) {
                        this.interruptedContextData = null;
                        this.eventThreadMonitor.notifyAll();
                        throw th6;
                    }
                }
            } catch (InterruptedException unused3) {
            } finally {
            }
        }
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x005e -> B:8:0x009b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0078 -> B:8:0x009b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x008a -> B:8:0x009b). Please report as a decompilation issue!!! */
    private String loadSource(String str) {
        InputStream fileInputStream;
        String systemProperty;
        int indexOf = str.indexOf(35);
        if (indexOf >= 0) {
            str = str.substring(0, indexOf);
        }
        String str2 = null;
        try {
        } catch (IOException e11) {
            System.err.println("Failed to load source from " + str + ": " + e11);
        }
        try {
            if (str.indexOf(58) < 0) {
                if (str.startsWith("~/") && (systemProperty = SecurityUtilities.getSystemProperty("user.home")) != null) {
                    File file = new File(new File(systemProperty), str.substring(2));
                    if (file.exists()) {
                        fileInputStream = new FileInputStream(file);
                        str2 = Kit.readReader(new InputStreamReader(fileInputStream));
                        fileInputStream.close();
                        return str2;
                    }
                }
                File file2 = new File(str);
                if (file2.exists()) {
                    fileInputStream = new FileInputStream(file2);
                    str2 = Kit.readReader(new InputStreamReader(fileInputStream));
                    fileInputStream.close();
                    return str2;
                }
                if (str.startsWith(e.f83301a)) {
                    str = "http:" + str;
                } else if (str.startsWith("/")) {
                    str = "http://127.0.0.1" + str;
                } else {
                    str = "http://" + str;
                }
            }
            str2 = Kit.readReader(new InputStreamReader(fileInputStream));
            fileInputStream.close();
            return str2;
        } catch (Throwable th2) {
            fileInputStream.close();
            throw th2;
        }
        fileInputStream = new URL(str).openStream();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void registerTopScript(DebuggableScript debuggableScript, String str) {
        int i11;
        String source;
        if (!debuggableScript.isTopLevel()) {
            throw new IllegalArgumentException();
        }
        String normalizedUrl = getNormalizedUrl(debuggableScript);
        DebuggableScript[] allFunctions = getAllFunctions(debuggableScript);
        SourceProvider sourceProvider = this.sourceProvider;
        if (sourceProvider != null && (source = sourceProvider.getSource(debuggableScript)) != null) {
            str = source;
        }
        SourceInfo sourceInfo = new SourceInfo(str, allFunctions, normalizedUrl);
        synchronized (this.urlToSourceInfo) {
            try {
                SourceInfo sourceInfo2 = this.urlToSourceInfo.get(normalizedUrl);
                if (sourceInfo2 != null) {
                    sourceInfo.copyBreakpointsFrom(sourceInfo2);
                }
                this.urlToSourceInfo.put(normalizedUrl, sourceInfo);
                for (int i12 = 0; i12 != sourceInfo.functionSourcesTop(); i12++) {
                    FunctionSource functionSource = sourceInfo.functionSource(i12);
                    String name = functionSource.name();
                    if (name.length() != 0) {
                        this.functionNames.put(name, functionSource);
                    }
                }
            } finally {
            }
        }
        synchronized (this.functionToSource) {
            for (i11 = 0; i11 != allFunctions.length; i11++) {
                try {
                    this.functionToSource.put(allFunctions[i11], sourceInfo.functionSource(i11));
                } finally {
                }
            }
        }
        this.callback.updateSourceText(sourceInfo);
    }

    public void attachTo(ContextFactory contextFactory) {
        detach();
        this.contextFactory = contextFactory;
        DimIProxy dimIProxy = new DimIProxy(1);
        this.listener = dimIProxy;
        contextFactory.addListener(dimIProxy);
    }

    public void clearAllBreakpoints() {
        Iterator<SourceInfo> it = this.urlToSourceInfo.values().iterator();
        while (it.hasNext()) {
            it.next().removeAllBreakpoints();
        }
    }

    public void compileScript(String str, String str2) {
        DimIProxy dimIProxy = new DimIProxy(2);
        dimIProxy.url = str;
        dimIProxy.text = str2;
        dimIProxy.withContext();
    }

    public void contextSwitch(int i11) {
        this.frameIndex = i11;
    }

    public ContextData currentContextData() {
        return this.interruptedContextData;
    }

    public void detach() {
        DimIProxy dimIProxy = this.listener;
        if (dimIProxy != null) {
            this.contextFactory.removeListener(dimIProxy);
            this.contextFactory = null;
            this.listener = null;
        }
    }

    public void dispose() {
        detach();
    }

    public String eval(String str) {
        ContextData currentContextData;
        String str2 = "undefined";
        if (str == null || (currentContextData = currentContextData()) == null || this.frameIndex >= currentContextData.frameCount()) {
            return "undefined";
        }
        StackFrame frame = currentContextData.getFrame(this.frameIndex);
        if (currentContextData.eventThreadFlag) {
            return do_eval(Context.getCurrentContext(), frame, str);
        }
        synchronized (this.monitor) {
            try {
                if (this.insideInterruptLoop) {
                    this.evalRequest = str;
                    this.evalFrame = frame;
                    this.monitor.notify();
                    do {
                        try {
                            this.monitor.wait();
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                        }
                    } while (this.evalRequest != null);
                    str2 = this.evalResult;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }

    public void evalScript(String str, String str2) {
        DimIProxy dimIProxy = new DimIProxy(3);
        dimIProxy.url = str;
        dimIProxy.text = str2;
        dimIProxy.withContext();
    }

    public String[] functionNames() {
        String[] strArr;
        synchronized (this.urlToSourceInfo) {
            strArr = (String[]) this.functionNames.keySet().toArray(new String[this.functionNames.size()]);
        }
        return strArr;
    }

    public FunctionSource functionSourceByName(String str) {
        return this.functionNames.get(str);
    }

    public Object[] getObjectIds(Object obj) {
        DimIProxy dimIProxy = new DimIProxy(7);
        dimIProxy.object = obj;
        dimIProxy.withContext();
        return dimIProxy.objectArrayResult;
    }

    public Object getObjectProperty(Object obj, Object obj2) {
        DimIProxy dimIProxy = new DimIProxy(6);
        dimIProxy.object = obj;
        dimIProxy.f78404id = obj2;
        dimIProxy.withContext();
        return dimIProxy.objectResult;
    }

    public void go() {
        synchronized (this.monitor) {
            this.returnValue = 3;
            this.monitor.notifyAll();
        }
    }

    public String objectToString(Object obj) {
        DimIProxy dimIProxy = new DimIProxy(5);
        dimIProxy.object = obj;
        dimIProxy.withContext();
        return dimIProxy.stringResult;
    }

    public void setBreak() {
        this.breakFlag = true;
    }

    public void setBreakOnEnter(boolean z11) {
        this.breakOnEnter = z11;
    }

    public void setBreakOnExceptions(boolean z11) {
        this.breakOnExceptions = z11;
    }

    public void setBreakOnReturn(boolean z11) {
        this.breakOnReturn = z11;
    }

    public void setGuiCallback(GuiCallback guiCallback) {
        this.callback = guiCallback;
    }

    public void setReturnValue(int i11) {
        synchronized (this.monitor) {
            this.returnValue = i11;
            this.monitor.notify();
        }
    }

    public void setScopeProvider(ScopeProvider scopeProvider) {
        this.scopeProvider = scopeProvider;
    }

    public void setSourceProvider(SourceProvider sourceProvider) {
        this.sourceProvider = sourceProvider;
    }

    public SourceInfo sourceInfo(String str) {
        return this.urlToSourceInfo.get(str);
    }

    public boolean stringIsCompilableUnit(String str) {
        DimIProxy dimIProxy = new DimIProxy(4);
        dimIProxy.text = str;
        dimIProxy.withContext();
        return dimIProxy.booleanResult;
    }
}

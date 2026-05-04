package org.mozilla.javascript;

import java.io.CharArrayWriter;
import java.io.FilenameFilter;
import java.io.PrintStream;
import java.io.PrintWriter;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public abstract class RhinoException extends RuntimeException {
    static final long serialVersionUID = 1883500631321581169L;
    private static boolean useMozillaStackStyle = false;
    private int columnNumber;
    int[] interpreterLineData;
    Object interpreterStackInfo;
    private int lineNumber;
    private String lineSource;
    private String sourceName;

    public RhinoException() {
        Evaluator createInterpreter = Context.createInterpreter();
        if (createInterpreter != null) {
            createInterpreter.captureStackInfo(this);
        }
    }

    private String generateStackTrace() {
        CharArrayWriter charArrayWriter = new CharArrayWriter();
        super.printStackTrace(new PrintWriter(charArrayWriter));
        String charArrayWriter2 = charArrayWriter.toString();
        Evaluator createInterpreter = Context.createInterpreter();
        if (createInterpreter != null) {
            return createInterpreter.getPatchedStack(this, charArrayWriter2);
        }
        return null;
    }

    public static void useMozillaStackStyle(boolean z11) {
        useMozillaStackStyle = z11;
    }

    public static boolean usesMozillaStackStyle() {
        return useMozillaStackStyle;
    }

    public final int columnNumber() {
        return this.columnNumber;
    }

    public String details() {
        return super.getMessage();
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        String details = details();
        if (this.sourceName == null || this.lineNumber <= 0) {
            return details;
        }
        StringBuffer stringBuffer = new StringBuffer(details);
        stringBuffer.append(" (");
        String str = this.sourceName;
        if (str != null) {
            stringBuffer.append(str);
        }
        if (this.lineNumber > 0) {
            stringBuffer.append('#');
            stringBuffer.append(this.lineNumber);
        }
        stringBuffer.append(')');
        return stringBuffer.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public org.mozilla.javascript.ScriptStackElement[] getScriptStack() {
        /*
            r14 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.Object r1 = r14.interpreterStackInfo
            r2 = 0
            if (r1 == 0) goto L19
            org.mozilla.javascript.Evaluator r1 = org.mozilla.javascript.Context.createInterpreter()
            boolean r3 = r1 instanceof org.mozilla.javascript.Interpreter
            if (r3 == 0) goto L19
            org.mozilla.javascript.Interpreter r1 = (org.mozilla.javascript.Interpreter) r1
            org.mozilla.javascript.ScriptStackElement[][] r1 = r1.getScriptStackElements(r14)
            goto L1a
        L19:
            r1 = r2
        L1a:
            java.lang.StackTraceElement[] r3 = r14.getStackTrace()
            java.lang.String r4 = "_c_(.*)_\\d+"
            java.util.regex.Pattern r4 = java.util.regex.Pattern.compile(r4)
            int r5 = r3.length
            r6 = 0
            r7 = r6
            r8 = r7
        L28:
            if (r7 >= r5) goto La8
            r9 = r3[r7]
            java.lang.String r10 = r9.getFileName()
            java.lang.String r11 = r9.getMethodName()
            java.lang.String r12 = "_c_"
            boolean r11 = r11.startsWith(r12)
            if (r11 == 0) goto L77
            int r11 = r9.getLineNumber()
            r12 = -1
            if (r11 <= r12) goto L77
            if (r10 == 0) goto L77
            java.lang.String r11 = ".java"
            boolean r11 = r10.endsWith(r11)
            if (r11 != 0) goto L77
            java.lang.String r11 = r9.getMethodName()
            java.util.regex.Matcher r12 = r4.matcher(r11)
            java.lang.String r13 = "_c_script_0"
            boolean r11 = r13.equals(r11)
            if (r11 != 0) goto L69
            boolean r11 = r12.find()
            if (r11 == 0) goto L69
            r11 = 1
            java.lang.String r11 = r12.group(r11)
            goto L6a
        L69:
            r11 = r2
        L6a:
            org.mozilla.javascript.ScriptStackElement r12 = new org.mozilla.javascript.ScriptStackElement
            int r9 = r9.getLineNumber()
            r12.<init>(r10, r11, r9)
            r0.add(r12)
            goto La5
        L77:
            java.lang.String r10 = "org.mozilla.javascript.Interpreter"
            java.lang.String r11 = r9.getClassName()
            boolean r10 = r10.equals(r11)
            if (r10 == 0) goto La5
            java.lang.String r10 = "interpretLoop"
            java.lang.String r9 = r9.getMethodName()
            boolean r9 = r10.equals(r9)
            if (r9 == 0) goto La5
            if (r1 == 0) goto La5
            int r9 = r1.length
            if (r9 <= r8) goto La5
            int r9 = r8 + 1
            r8 = r1[r8]
            int r10 = r8.length
            r11 = r6
        L9a:
            if (r11 >= r10) goto La4
            r12 = r8[r11]
            r0.add(r12)
            int r11 = r11 + 1
            goto L9a
        La4:
            r8 = r9
        La5:
            int r7 = r7 + 1
            goto L28
        La8:
            int r1 = r0.size()
            org.mozilla.javascript.ScriptStackElement[] r1 = new org.mozilla.javascript.ScriptStackElement[r1]
            java.lang.Object[] r0 = r0.toArray(r1)
            org.mozilla.javascript.ScriptStackElement[] r0 = (org.mozilla.javascript.ScriptStackElement[]) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mozilla.javascript.RhinoException.getScriptStack():org.mozilla.javascript.ScriptStackElement[]");
    }

    public String getScriptStackTrace() {
        StringBuilder sb2 = new StringBuilder();
        String systemProperty = SecurityUtilities.getSystemProperty("line.separator");
        for (ScriptStackElement scriptStackElement : getScriptStack()) {
            if (useMozillaStackStyle) {
                scriptStackElement.renderMozillaStyle(sb2);
            } else {
                scriptStackElement.renderJavaStyle(sb2);
            }
            sb2.append(systemProperty);
        }
        return sb2.toString();
    }

    public final void initColumnNumber(int i11) {
        if (i11 <= 0) {
            throw new IllegalArgumentException(String.valueOf(i11));
        }
        if (this.columnNumber > 0) {
            throw new IllegalStateException();
        }
        this.columnNumber = i11;
    }

    public final void initLineNumber(int i11) {
        if (i11 <= 0) {
            throw new IllegalArgumentException(String.valueOf(i11));
        }
        if (this.lineNumber > 0) {
            throw new IllegalStateException();
        }
        this.lineNumber = i11;
    }

    public final void initLineSource(String str) {
        if (str == null) {
            throw new IllegalArgumentException();
        }
        if (this.lineSource != null) {
            throw new IllegalStateException();
        }
        this.lineSource = str;
    }

    public final void initSourceName(String str) {
        if (str == null) {
            throw new IllegalArgumentException();
        }
        if (this.sourceName != null) {
            throw new IllegalStateException();
        }
        this.sourceName = str;
    }

    public final int lineNumber() {
        return this.lineNumber;
    }

    public final String lineSource() {
        return this.lineSource;
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        if (this.interpreterStackInfo == null) {
            super.printStackTrace(printWriter);
        } else {
            printWriter.print(generateStackTrace());
        }
    }

    public final void recordErrorOrigin(String str, int i11, String str2, int i12) {
        if (i11 == -1) {
            i11 = 0;
        }
        if (str != null) {
            initSourceName(str);
        }
        if (i11 != 0) {
            initLineNumber(i11);
        }
        if (str2 != null) {
            initLineSource(str2);
        }
        if (i12 != 0) {
            initColumnNumber(i12);
        }
    }

    public final String sourceName() {
        return this.sourceName;
    }

    public RhinoException(String str) {
        super(str);
        Evaluator createInterpreter = Context.createInterpreter();
        if (createInterpreter != null) {
            createInterpreter.captureStackInfo(this);
        }
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        if (this.interpreterStackInfo == null) {
            super.printStackTrace(printStream);
        } else {
            printStream.print(generateStackTrace());
        }
    }

    public String getScriptStackTrace(FilenameFilter filenameFilter) {
        return getScriptStackTrace();
    }
}

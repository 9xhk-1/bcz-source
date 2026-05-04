package org.mozilla.javascript.tools.jsc;

import com.xiaomi.mipush.sdk.Constants;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;
import org.mozilla.javascript.CompilerEnvirons;
import org.mozilla.javascript.optimizer.ClassCompiler;
import org.mozilla.javascript.tools.SourceReader;
import org.mozilla.javascript.tools.ToolErrorReporter;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class Main {
    private String characterEncoding;
    private ClassCompiler compiler;
    private CompilerEnvirons compilerEnv;
    private String destinationDir;
    private boolean printHelp;
    private ToolErrorReporter reporter = new ToolErrorReporter(true);
    private String targetName;
    private String targetPackage;

    public Main() {
        CompilerEnvirons compilerEnvirons = new CompilerEnvirons();
        this.compilerEnv = compilerEnvirons;
        compilerEnvirons.setErrorReporter(this.reporter);
        this.compiler = new ClassCompiler(this.compilerEnv);
    }

    private void addError(String str, String str2) {
        addFormatedError(str2 == null ? ToolErrorReporter.getMessage(str) : ToolErrorReporter.getMessage(str, str2));
    }

    private void addFormatedError(String str) {
        this.reporter.error(str, null, -1, null, -1);
    }

    private static void badUsage(String str) {
        System.err.println(ToolErrorReporter.getMessage("msg.jsc.bad.usage", Main.class.getName(), str));
    }

    private File getOutputFile(File file, String str) {
        File file2 = new File(file, str.replace('.', File.separatorChar).concat(".class"));
        String parent = file2.getParent();
        if (parent != null) {
            File file3 = new File(parent);
            if (!file3.exists()) {
                file3.mkdirs();
            }
        }
        return file2;
    }

    public static void main(String[] strArr) {
        Main main = new Main();
        String[] processOptions = main.processOptions(strArr);
        if (processOptions == null) {
            if (main.printHelp) {
                System.out.println(ToolErrorReporter.getMessage("msg.jsc.usage", Main.class.getName()));
                System.exit(0);
            }
            System.exit(1);
        }
        if (main.reporter.hasReportedError()) {
            return;
        }
        main.processSource(processOptions);
    }

    private static void p(String str) {
        System.out.println(str);
    }

    private String readSource(File file) {
        String absolutePath = file.getAbsolutePath();
        if (!file.isFile()) {
            addError("msg.jsfile.not.found", absolutePath);
            return null;
        }
        try {
            return (String) SourceReader.readFileOrUrl(absolutePath, true, this.characterEncoding);
        } catch (FileNotFoundException unused) {
            addError("msg.couldnt.open", absolutePath);
            return null;
        } catch (IOException e11) {
            addFormatedError(e11.toString());
            return null;
        }
    }

    public String getClassName(String str) {
        int i11 = 1;
        char[] cArr = new char[str.length() + 1];
        int i12 = 0;
        if (Character.isJavaIdentifierStart(str.charAt(0))) {
            i11 = 0;
        } else {
            cArr[0] = '_';
        }
        while (i12 < str.length()) {
            char charAt = str.charAt(i12);
            if (Character.isJavaIdentifierPart(charAt)) {
                cArr[i11] = charAt;
            } else {
                cArr[i11] = '_';
            }
            i12++;
            i11++;
        }
        return new String(cArr).trim();
    }

    public String[] processOptions(String[] strArr) {
        this.targetPackage = "";
        this.compilerEnv.setGenerateDebugInfo(false);
        int i11 = 0;
        while (i11 < strArr.length) {
            String str = strArr[i11];
            if (!str.startsWith(Constants.ACCEPT_TIME_SEPARATOR_SERVER)) {
                int length = strArr.length - i11;
                String str2 = this.targetName;
                if (str2 != null && length > 1) {
                    addError("msg.multiple.js.to.file", str2);
                    return null;
                }
                String[] strArr2 = new String[length];
                for (int i12 = 0; i12 != length; i12++) {
                    strArr2[i12] = strArr[i11 + i12];
                }
                return strArr2;
            }
            if (str.equals("-help") || str.equals("-h") || str.equals("--help")) {
                this.printHelp = true;
                return null;
            }
            try {
                if (str.equals("-version") && (i11 = i11 + 1) < strArr.length) {
                    this.compilerEnv.setLanguageVersion(Integer.parseInt(strArr[i11]));
                } else if ((str.equals("-opt") || str.equals("-O")) && (i11 = i11 + 1) < strArr.length) {
                    this.compilerEnv.setOptimizationLevel(Integer.parseInt(strArr[i11]));
                } else if (str.equals("-nosource")) {
                    this.compilerEnv.setGeneratingSource(false);
                } else if (str.equals("-debug") || str.equals("-g")) {
                    this.compilerEnv.setGenerateDebugInfo(true);
                } else if (str.equals("-main-method-class") && (i11 = i11 + 1) < strArr.length) {
                    this.compiler.setMainMethodClass(strArr[i11]);
                } else if (str.equals("-encoding") && (i11 = i11 + 1) < strArr.length) {
                    this.characterEncoding = strArr[i11];
                } else if (!str.equals("-o") || (i11 = i11 + 1) >= strArr.length) {
                    if (str.equals("-observe-instruction-count")) {
                        this.compilerEnv.setGenerateObserverCount(true);
                    }
                    if (str.equals("-package") && (i11 = i11 + 1) < strArr.length) {
                        String str3 = strArr[i11];
                        int length2 = str3.length();
                        int i13 = 0;
                        while (i13 != length2) {
                            char charAt = str3.charAt(i13);
                            if (Character.isJavaIdentifierStart(charAt)) {
                                do {
                                    i13++;
                                    if (i13 == length2) {
                                        break;
                                    }
                                    charAt = str3.charAt(i13);
                                } while (Character.isJavaIdentifierPart(charAt));
                                if (i13 == length2) {
                                    break;
                                }
                                if (charAt == '.' && i13 != length2 - 1) {
                                    i13++;
                                }
                            }
                            addError("msg.package.name", this.targetPackage);
                            return null;
                        }
                        this.targetPackage = str3;
                    } else if (str.equals("-extends") && (i11 = i11 + 1) < strArr.length) {
                        try {
                            this.compiler.setTargetExtends(Class.forName(strArr[i11]));
                        } catch (ClassNotFoundException e11) {
                            throw new Error(e11.toString());
                        }
                    } else if (str.equals("-implements") && (i11 = i11 + 1) < strArr.length) {
                        StringTokenizer stringTokenizer = new StringTokenizer(strArr[i11], ",");
                        ArrayList arrayList = new ArrayList();
                        while (stringTokenizer.hasMoreTokens()) {
                            try {
                                arrayList.add(Class.forName(stringTokenizer.nextToken()));
                            } catch (ClassNotFoundException e12) {
                                throw new Error(e12.toString());
                            }
                        }
                        this.compiler.setTargetImplements((Class[]) arrayList.toArray(new Class[arrayList.size()]));
                    } else {
                        if (!str.equals("-d") || (i11 = i11 + 1) >= strArr.length) {
                            badUsage(str);
                            return null;
                        }
                        this.destinationDir = strArr[i11];
                    }
                } else {
                    String str4 = strArr[i11];
                    int length3 = str4.length();
                    if (length3 == 0 || !Character.isJavaIdentifierStart(str4.charAt(0))) {
                        addError("msg.invalid.classfile.name", str4);
                    } else {
                        int i14 = 1;
                        while (true) {
                            if (i14 >= length3) {
                                break;
                            }
                            char charAt2 = str4.charAt(i14);
                            if (Character.isJavaIdentifierPart(charAt2)) {
                                i14++;
                            } else if (charAt2 == '.' && i14 == length3 - 6 && str4.endsWith(".class")) {
                                str4 = str4.substring(0, i14);
                            } else {
                                addError("msg.invalid.classfile.name", str4);
                            }
                        }
                        this.targetName = str4;
                    }
                }
                i11++;
            } catch (NumberFormatException unused) {
                badUsage(strArr[i11]);
                return null;
            }
        }
        p(ToolErrorReporter.getMessage("msg.no.file"));
        return null;
    }

    public void processSource(String[] strArr) {
        File file;
        for (int i11 = 0; i11 != strArr.length; i11++) {
            String str = strArr[i11];
            if (!str.endsWith(".js")) {
                addError("msg.extension.not.js", str);
                return;
            }
            File file2 = new File(str);
            String readSource = readSource(file2);
            if (readSource == null) {
                return;
            }
            String str2 = this.targetName;
            if (str2 == null) {
                str2 = getClassName(file2.getName().substring(0, r5.length() - 3));
            }
            if (this.targetPackage.length() != 0) {
                str2 = this.targetPackage + "." + str2;
            }
            Object[] compileToClassFiles = this.compiler.compileToClassFiles(readSource, str, 1, str2);
            if (compileToClassFiles == null || compileToClassFiles.length == 0) {
                return;
            }
            if (this.destinationDir != null) {
                file = new File(this.destinationDir);
            } else {
                String parent = file2.getParent();
                file = parent != null ? new File(parent) : null;
            }
            for (int i12 = 0; i12 != compileToClassFiles.length; i12 += 2) {
                String str3 = (String) compileToClassFiles[i12];
                byte[] bArr = (byte[]) compileToClassFiles[i12 + 1];
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(getOutputFile(file, str3));
                    try {
                        fileOutputStream.write(bArr);
                        fileOutputStream.close();
                    } catch (Throwable th2) {
                        fileOutputStream.close();
                        throw th2;
                    }
                } catch (IOException e11) {
                    addFormatedError(e11.toString());
                }
            }
        }
    }
}

package org.mozilla.javascript.optimizer;

import androidx.core.app.NotificationCompat;
import com.baicizhan.client.business.webview.args.Arguments;
import java.util.HashMap;
import java.util.List;
import org.mozilla.classfile.ClassFileWriter;
import org.mozilla.javascript.CompilerEnvirons;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.Evaluator;
import org.mozilla.javascript.Function;
import org.mozilla.javascript.GeneratedClassLoader;
import org.mozilla.javascript.NativeFunction;
import org.mozilla.javascript.ObjArray;
import org.mozilla.javascript.ObjToIntMap;
import org.mozilla.javascript.RhinoException;
import org.mozilla.javascript.Script;
import org.mozilla.javascript.ScriptRuntime;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.SecurityController;
import org.mozilla.javascript.ast.FunctionNode;
import org.mozilla.javascript.ast.Name;
import org.mozilla.javascript.ast.ScriptNode;
import pn.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class Codegen implements Evaluator {
    static final String DEFAULT_MAIN_METHOD_CLASS = "org.mozilla.javascript.optimizer.OptRuntime";
    static final String FUNCTION_CONSTRUCTOR_SIGNATURE = "(Lorg/mozilla/javascript/Scriptable;Lorg/mozilla/javascript/Context;I)V";
    static final String FUNCTION_INIT_SIGNATURE = "(Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;)V";
    static final String ID_FIELD_NAME = "_id";
    static final String REGEXP_INIT_METHOD_NAME = "_reInit";
    static final String REGEXP_INIT_METHOD_SIGNATURE = "(Lorg/mozilla/javascript/Context;)V";
    private static final String SUPER_CLASS_NAME = "org.mozilla.javascript.NativeFunction";
    private static final Object globalLock = new Object();
    private static int globalSerialClassCounter;
    private CompilerEnvirons compilerEnv;
    private ObjArray directCallTargets;
    private double[] itsConstantList;
    private int itsConstantListSize;
    String mainClassName;
    String mainClassSignature;
    private String mainMethodClass = DEFAULT_MAIN_METHOD_CLASS;
    private ObjToIntMap scriptOrFnIndexes;
    ScriptNode[] scriptOrFnNodes;

    private static void addDoubleWrap(ClassFileWriter classFileWriter) {
        classFileWriter.K(184, "org/mozilla/javascript/optimizer/OptRuntime", "wrapDouble", "(D)Ljava/lang/Double;");
    }

    public static RuntimeException badTree() {
        throw new RuntimeException("Bad tree in codegen");
    }

    private static void collectScriptNodes_r(ScriptNode scriptNode, ObjArray objArray) {
        objArray.add(scriptNode);
        int functionCount = scriptNode.getFunctionCount();
        for (int i11 = 0; i11 != functionCount; i11++) {
            collectScriptNodes_r(scriptNode.getFunctionNode(i11), objArray);
        }
    }

    private Class<?> defineClass(Object obj, Object obj2) {
        Object[] objArr = (Object[]) obj;
        String str = (String) objArr[0];
        byte[] bArr = (byte[]) objArr[1];
        GeneratedClassLoader createLoader = SecurityController.createLoader(getClass().getClassLoader(), obj2);
        try {
            Class<?> defineClass = createLoader.defineClass(str, bArr);
            createLoader.linkClass(defineClass);
            return defineClass;
        } catch (IllegalArgumentException | SecurityException e11) {
            throw new RuntimeException("Malformed optimizer package " + e11);
        }
    }

    private void emitConstantDudeInitializers(ClassFileWriter classFileWriter) {
        int i11 = this.itsConstantListSize;
        if (i11 == 0) {
            return;
        }
        classFileWriter.O0("<clinit>", "()V", (short) 24);
        double[] dArr = this.itsConstantList;
        for (int i12 = 0; i12 != i11; i12++) {
            double d11 = dArr[i12];
            String str = "_k" + i12;
            String staticConstantWrapperType = getStaticConstantWrapperType(d11);
            classFileWriter.D(str, staticConstantWrapperType, (short) 10);
            int i13 = (int) d11;
            if (i13 == d11) {
                classFileWriter.W(i13);
                classFileWriter.K(184, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;");
            } else {
                classFileWriter.V(d11);
                addDoubleWrap(classFileWriter);
            }
            classFileWriter.v(179, this.mainClassName, str, staticConstantWrapperType);
        }
        classFileWriter.r(177);
        classFileWriter.P0((short) 0);
    }

    private void emitDirectConstructor(ClassFileWriter classFileWriter, OptFunctionNode optFunctionNode) {
        classFileWriter.O0(getDirectCtorName(optFunctionNode.fnode), getBodyMethodSignature(optFunctionNode.fnode), (short) 10);
        int paramCount = optFunctionNode.fnode.getParamCount();
        int i11 = paramCount * 3;
        int i12 = i11 + 4;
        int i13 = i11 + 5;
        classFileWriter.w(0);
        classFileWriter.w(1);
        classFileWriter.w(2);
        classFileWriter.K(182, "org/mozilla/javascript/BaseFunction", "createObject", "(Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;)Lorg/mozilla/javascript/Scriptable;");
        classFileWriter.x(i13);
        classFileWriter.w(0);
        classFileWriter.w(1);
        classFileWriter.w(2);
        classFileWriter.w(i13);
        for (int i14 = 0; i14 < paramCount; i14++) {
            int i15 = i14 * 3;
            classFileWriter.w(i15 + 4);
            classFileWriter.y(i15 + 5);
        }
        classFileWriter.w(i12);
        classFileWriter.K(184, this.mainClassName, getBodyMethodName(optFunctionNode.fnode), getBodyMethodSignature(optFunctionNode.fnode));
        int q11 = classFileWriter.q();
        classFileWriter.r(89);
        classFileWriter.u(193, "org/mozilla/javascript/Scriptable");
        classFileWriter.s(153, q11);
        classFileWriter.u(192, "org/mozilla/javascript/Scriptable");
        classFileWriter.r(176);
        classFileWriter.z0(q11);
        classFileWriter.w(i13);
        classFileWriter.r(176);
        classFileWriter.P0((short) (i11 + 6));
    }

    private void emitRegExpInit(ClassFileWriter classFileWriter) {
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            ScriptNode[] scriptNodeArr = this.scriptOrFnNodes;
            if (i12 == scriptNodeArr.length) {
                break;
            }
            i13 += scriptNodeArr[i12].getRegexpCount();
            i12++;
        }
        if (i13 == 0) {
            return;
        }
        short s11 = 10;
        classFileWriter.O0(REGEXP_INIT_METHOD_NAME, REGEXP_INIT_METHOD_SIGNATURE, (short) 10);
        classFileWriter.D("_reInitDone", "Z", (short) 74);
        classFileWriter.v(178, this.mainClassName, "_reInitDone", "Z");
        int q11 = classFileWriter.q();
        classFileWriter.s(153, q11);
        classFileWriter.r(177);
        classFileWriter.z0(q11);
        classFileWriter.w(0);
        classFileWriter.K(184, "org/mozilla/javascript/ScriptRuntime", "checkRegExpProxy", "(Lorg/mozilla/javascript/Context;)Lorg/mozilla/javascript/RegExpProxy;");
        classFileWriter.x(1);
        int i14 = 0;
        while (true) {
            ScriptNode[] scriptNodeArr2 = this.scriptOrFnNodes;
            if (i14 == scriptNodeArr2.length) {
                classFileWriter.W(1);
                classFileWriter.v(179, this.mainClassName, "_reInitDone", "Z");
                classFileWriter.r(177);
                classFileWriter.P0((short) 2);
                return;
            }
            ScriptNode scriptNode = scriptNodeArr2[i14];
            int regexpCount = scriptNode.getRegexpCount();
            int i15 = i11;
            while (i15 != regexpCount) {
                String compiledRegexpName = getCompiledRegexpName(scriptNode, i15);
                String regexpString = scriptNode.getRegexpString(i15);
                String regexpFlags = scriptNode.getRegexpFlags(i15);
                classFileWriter.D(compiledRegexpName, "Ljava/lang/Object;", s11);
                classFileWriter.w(1);
                classFileWriter.w(i11);
                classFileWriter.Y(regexpString);
                if (regexpFlags == null) {
                    classFileWriter.r(1);
                } else {
                    classFileWriter.Y(regexpFlags);
                }
                classFileWriter.K(185, "org/mozilla/javascript/RegExpProxy", "compileRegExp", "(Lorg/mozilla/javascript/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;");
                classFileWriter.v(179, this.mainClassName, compiledRegexpName, "Ljava/lang/Object;");
                i15++;
                i11 = 0;
                s11 = 10;
            }
            i14++;
            i11 = 0;
            s11 = 10;
        }
    }

    private void generateCallMethod(ClassFileWriter classFileWriter) {
        int i11;
        int paramCount;
        classFileWriter.O0(NotificationCompat.CATEGORY_CALL, "(Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;Lorg/mozilla/javascript/Scriptable;[Ljava/lang/Object;)Ljava/lang/Object;", (short) 17);
        int q11 = classFileWriter.q();
        classFileWriter.w(1);
        classFileWriter.K(184, "org/mozilla/javascript/ScriptRuntime", "hasTopCall", "(Lorg/mozilla/javascript/Context;)Z");
        classFileWriter.s(154, q11);
        int i12 = 0;
        classFileWriter.w(0);
        classFileWriter.w(1);
        classFileWriter.w(2);
        classFileWriter.w(3);
        classFileWriter.w(4);
        classFileWriter.K(184, "org/mozilla/javascript/ScriptRuntime", "doTopCall", "(Lorg/mozilla/javascript/Callable;Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;Lorg/mozilla/javascript/Scriptable;[Ljava/lang/Object;)Ljava/lang/Object;");
        classFileWriter.r(176);
        classFileWriter.z0(q11);
        classFileWriter.w(0);
        classFileWriter.w(1);
        classFileWriter.w(2);
        classFileWriter.w(3);
        classFileWriter.w(4);
        int length = this.scriptOrFnNodes.length;
        boolean z11 = 2 <= length;
        if (z11) {
            classFileWriter.U();
            classFileWriter.v(180, classFileWriter.r0(), ID_FIELD_NAME, "I");
            i11 = classFileWriter.c0(1, length - 1);
        } else {
            i11 = 0;
        }
        int i13 = 0;
        short s11 = 0;
        while (i13 != length) {
            ScriptNode scriptNode = this.scriptOrFnNodes[i13];
            if (z11) {
                if (i13 == 0) {
                    classFileWriter.D0(i11);
                    s11 = classFileWriter.v0();
                } else {
                    classFileWriter.C0(i11, i13 - 1, s11);
                }
            }
            if (scriptNode.getType() == 109) {
                OptFunctionNode optFunctionNode = OptFunctionNode.get(scriptNode);
                if (optFunctionNode.isTargetOfDirectCall() && (paramCount = optFunctionNode.fnode.getParamCount()) != 0) {
                    for (int i14 = i12; i14 != paramCount; i14++) {
                        classFileWriter.r(190);
                        classFileWriter.W(i14);
                        int q12 = classFileWriter.q();
                        int q13 = classFileWriter.q();
                        classFileWriter.s(164, q12);
                        classFileWriter.w(4);
                        classFileWriter.W(i14);
                        classFileWriter.r(50);
                        classFileWriter.s(167, q13);
                        classFileWriter.z0(q12);
                        pushUndefined(classFileWriter);
                        classFileWriter.z0(q13);
                        classFileWriter.g0(-1);
                        classFileWriter.V(0.0d);
                        classFileWriter.w(4);
                    }
                }
            }
            classFileWriter.K(184, this.mainClassName, getBodyMethodName(scriptNode), getBodyMethodSignature(scriptNode));
            classFileWriter.r(176);
            i13++;
            i12 = 0;
        }
        classFileWriter.P0((short) 5);
    }

    private byte[] generateCode(String str) {
        boolean z11 = true;
        boolean z12 = this.scriptOrFnNodes[0].getType() == 136;
        if (this.scriptOrFnNodes.length <= 1 && z12) {
            z11 = false;
        }
        ClassFileWriter classFileWriter = new ClassFileWriter(this.mainClassName, SUPER_CLASS_NAME, this.compilerEnv.isGenerateDebugInfo() ? this.scriptOrFnNodes[0].getSourceName() : null);
        classFileWriter.D(ID_FIELD_NAME, "I", (short) 2);
        if (z11) {
            generateFunctionConstructor(classFileWriter);
        }
        if (z12) {
            classFileWriter.J("org/mozilla/javascript/Script");
            generateScriptCtor(classFileWriter);
            generateMain(classFileWriter);
            generateExecute(classFileWriter);
        }
        generateCallMethod(classFileWriter);
        generateResumeGenerator(classFileWriter);
        generateNativeFunctionOverrides(classFileWriter, str);
        int length = this.scriptOrFnNodes.length;
        for (int i11 = 0; i11 != length; i11++) {
            ScriptNode scriptNode = this.scriptOrFnNodes[i11];
            BodyCodegen bodyCodegen = new BodyCodegen();
            bodyCodegen.cfw = classFileWriter;
            bodyCodegen.codegen = this;
            bodyCodegen.compilerEnv = this.compilerEnv;
            bodyCodegen.scriptOrFn = scriptNode;
            bodyCodegen.scriptOrFnIndex = i11;
            try {
                bodyCodegen.generateBodyCode();
                if (scriptNode.getType() == 109) {
                    OptFunctionNode optFunctionNode = OptFunctionNode.get(scriptNode);
                    generateFunctionInit(classFileWriter, optFunctionNode);
                    if (optFunctionNode.isTargetOfDirectCall()) {
                        emitDirectConstructor(classFileWriter, optFunctionNode);
                    }
                }
            } catch (ClassFileWriter.ClassFileFormatException e11) {
                throw reportClassFileFormatException(scriptNode, e11.getMessage());
            }
        }
        emitRegExpInit(classFileWriter);
        emitConstantDudeInitializers(classFileWriter);
        return classFileWriter.Q0();
    }

    private void generateExecute(ClassFileWriter classFileWriter) {
        classFileWriter.O0("exec", "(Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;)Ljava/lang/Object;", (short) 17);
        classFileWriter.U();
        classFileWriter.w(1);
        classFileWriter.w(2);
        classFileWriter.r(89);
        classFileWriter.r(1);
        classFileWriter.K(182, classFileWriter.r0(), NotificationCompat.CATEGORY_CALL, "(Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;Lorg/mozilla/javascript/Scriptable;[Ljava/lang/Object;)Ljava/lang/Object;");
        classFileWriter.r(176);
        classFileWriter.P0((short) 3);
    }

    private void generateFunctionConstructor(ClassFileWriter classFileWriter) {
        int i11;
        classFileWriter.O0("<init>", FUNCTION_CONSTRUCTOR_SIGNATURE, (short) 1);
        short s11 = 0;
        classFileWriter.w(0);
        classFileWriter.K(183, SUPER_CLASS_NAME, "<init>", "()V");
        classFileWriter.U();
        classFileWriter.H(3);
        classFileWriter.v(181, classFileWriter.r0(), ID_FIELD_NAME, "I");
        classFileWriter.U();
        classFileWriter.w(2);
        classFileWriter.w(1);
        int i12 = this.scriptOrFnNodes[0].getType() == 136 ? 1 : 0;
        int length = this.scriptOrFnNodes.length;
        if (i12 == length) {
            throw badTree();
        }
        boolean z11 = 2 <= length - i12;
        if (z11) {
            classFileWriter.H(3);
            i11 = classFileWriter.c0(i12 + 1, length - 1);
        } else {
            i11 = 0;
        }
        for (int i13 = i12; i13 != length; i13++) {
            if (z11) {
                if (i13 == i12) {
                    classFileWriter.D0(i11);
                    s11 = classFileWriter.v0();
                } else {
                    classFileWriter.C0(i11, (i13 - 1) - i12, s11);
                }
            }
            classFileWriter.K(183, this.mainClassName, getFunctionInitMethodName(OptFunctionNode.get(this.scriptOrFnNodes[i13])), FUNCTION_INIT_SIGNATURE);
            classFileWriter.r(177);
        }
        classFileWriter.P0((short) 4);
    }

    private void generateFunctionInit(ClassFileWriter classFileWriter, OptFunctionNode optFunctionNode) {
        classFileWriter.O0(getFunctionInitMethodName(optFunctionNode), FUNCTION_INIT_SIGNATURE, (short) 18);
        classFileWriter.U();
        classFileWriter.w(1);
        classFileWriter.w(2);
        classFileWriter.K(182, "org/mozilla/javascript/NativeFunction", "initScriptFunction", FUNCTION_INIT_SIGNATURE);
        if (optFunctionNode.fnode.getRegexpCount() != 0) {
            classFileWriter.w(1);
            classFileWriter.K(184, this.mainClassName, REGEXP_INIT_METHOD_NAME, REGEXP_INIT_METHOD_SIGNATURE);
        }
        classFileWriter.r(177);
        classFileWriter.P0((short) 3);
    }

    private void generateMain(ClassFileWriter classFileWriter) {
        classFileWriter.O0("main", "([Ljava/lang/String;)V", (short) 9);
        classFileWriter.u(187, classFileWriter.r0());
        classFileWriter.r(89);
        classFileWriter.K(183, classFileWriter.r0(), "<init>", "()V");
        classFileWriter.r(42);
        classFileWriter.K(184, this.mainMethodClass, "main", "(Lorg/mozilla/javascript/Script;[Ljava/lang/String;)V");
        classFileWriter.r(177);
        classFileWriter.P0((short) 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void generateNativeFunctionOverrides(org.mozilla.classfile.ClassFileWriter r19, java.lang.String r20) {
        /*
            Method dump skipped, instructions count: 478
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mozilla.javascript.optimizer.Codegen.generateNativeFunctionOverrides(org.mozilla.classfile.ClassFileWriter, java.lang.String):void");
    }

    private void generateResumeGenerator(ClassFileWriter classFileWriter) {
        int i11 = 0;
        int i12 = 0;
        boolean z11 = false;
        while (true) {
            ScriptNode[] scriptNodeArr = this.scriptOrFnNodes;
            if (i12 >= scriptNodeArr.length) {
                break;
            }
            if (isGenerator(scriptNodeArr[i12])) {
                z11 = true;
            }
            i12++;
        }
        if (!z11) {
            return;
        }
        classFileWriter.O0("resumeGenerator", "(Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", (short) 17);
        classFileWriter.w(0);
        classFileWriter.w(1);
        classFileWriter.w(2);
        classFileWriter.w(4);
        classFileWriter.w(5);
        classFileWriter.H(3);
        classFileWriter.U();
        classFileWriter.v(180, classFileWriter.r0(), ID_FIELD_NAME, "I");
        int c02 = classFileWriter.c0(0, this.scriptOrFnNodes.length - 1);
        classFileWriter.D0(c02);
        int q11 = classFileWriter.q();
        while (true) {
            ScriptNode[] scriptNodeArr2 = this.scriptOrFnNodes;
            if (i11 >= scriptNodeArr2.length) {
                classFileWriter.z0(q11);
                pushUndefined(classFileWriter);
                classFileWriter.r(176);
                classFileWriter.P0((short) 6);
                return;
            }
            ScriptNode scriptNode = scriptNodeArr2[i11];
            classFileWriter.C0(c02, i11, 6);
            if (isGenerator(scriptNode)) {
                String str = j.f81006c + this.mainClassSignature + "Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;Ljava/lang/Object;Ljava/lang/Object;I)Ljava/lang/Object;";
                classFileWriter.K(184, this.mainClassName, getBodyMethodName(scriptNode) + "_gen", str);
                classFileWriter.r(176);
            } else {
                classFileWriter.s(167, q11);
            }
            i11++;
        }
    }

    private void generateScriptCtor(ClassFileWriter classFileWriter) {
        classFileWriter.O0("<init>", "()V", (short) 1);
        classFileWriter.U();
        classFileWriter.K(183, SUPER_CLASS_NAME, "<init>", "()V");
        classFileWriter.U();
        classFileWriter.W(0);
        classFileWriter.v(181, classFileWriter.r0(), ID_FIELD_NAME, "I");
        classFileWriter.r(177);
        classFileWriter.P0((short) 1);
    }

    private static String getStaticConstantWrapperType(double d11) {
        return ((double) ((int) d11)) == d11 ? "Ljava/lang/Integer;" : "Ljava/lang/Double;";
    }

    private static void initOptFunctions_r(ScriptNode scriptNode) {
        int functionCount = scriptNode.getFunctionCount();
        for (int i11 = 0; i11 != functionCount; i11++) {
            FunctionNode functionNode = scriptNode.getFunctionNode(i11);
            new OptFunctionNode(functionNode);
            initOptFunctions_r(functionNode);
        }
    }

    private void initScriptNodesData(ScriptNode scriptNode) {
        ObjArray objArray = new ObjArray();
        collectScriptNodes_r(scriptNode, objArray);
        int size = objArray.size();
        ScriptNode[] scriptNodeArr = new ScriptNode[size];
        this.scriptOrFnNodes = scriptNodeArr;
        objArray.toArray(scriptNodeArr);
        this.scriptOrFnIndexes = new ObjToIntMap(size);
        for (int i11 = 0; i11 != size; i11++) {
            this.scriptOrFnIndexes.put(this.scriptOrFnNodes[i11], i11);
        }
    }

    public static boolean isGenerator(ScriptNode scriptNode) {
        return scriptNode.getType() == 109 && ((FunctionNode) scriptNode).isGenerator();
    }

    public static void pushUndefined(ClassFileWriter classFileWriter) {
        classFileWriter.v(178, "org/mozilla/javascript/Undefined", "instance", "Ljava/lang/Object;");
    }

    private RuntimeException reportClassFileFormatException(ScriptNode scriptNode, String str) {
        return Context.reportRuntimeError(scriptNode instanceof FunctionNode ? ScriptRuntime.getMessage2("msg.while.compiling.fn", ((FunctionNode) scriptNode).getFunctionName(), str) : ScriptRuntime.getMessage1("msg.while.compiling.script", str), scriptNode.getSourceName(), scriptNode.getLineno(), null, 0);
    }

    private void transform(ScriptNode scriptNode) {
        initOptFunctions_r(scriptNode);
        int optimizationLevel = this.compilerEnv.getOptimizationLevel();
        HashMap hashMap = null;
        if (optimizationLevel > 0 && scriptNode.getType() == 136) {
            int functionCount = scriptNode.getFunctionCount();
            for (int i11 = 0; i11 != functionCount; i11++) {
                OptFunctionNode optFunctionNode = OptFunctionNode.get(scriptNode, i11);
                if (optFunctionNode.fnode.getFunctionType() == 1) {
                    String name = optFunctionNode.fnode.getName();
                    if (name.length() != 0) {
                        if (hashMap == null) {
                            hashMap = new HashMap();
                        }
                        hashMap.put(name, optFunctionNode);
                    }
                }
            }
        }
        if (hashMap != null) {
            this.directCallTargets = new ObjArray();
        }
        new OptTransformer(hashMap, this.directCallTargets).transform(scriptNode);
        if (optimizationLevel > 0) {
            new Optimizer().optimize(scriptNode);
        }
    }

    @Override // org.mozilla.javascript.Evaluator
    public void captureStackInfo(RhinoException rhinoException) {
        throw new UnsupportedOperationException();
    }

    public String cleanName(ScriptNode scriptNode) {
        if (!(scriptNode instanceof FunctionNode)) {
            return "script";
        }
        Name functionName = ((FunctionNode) scriptNode).getFunctionName();
        return functionName == null ? Arguments.ARG_ANONYMOUS : functionName.getIdentifier();
    }

    @Override // org.mozilla.javascript.Evaluator
    public Object compile(CompilerEnvirons compilerEnvirons, ScriptNode scriptNode, String str, boolean z11) {
        int i11;
        synchronized (globalLock) {
            i11 = globalSerialClassCounter + 1;
            globalSerialClassCounter = i11;
        }
        String str2 = "c";
        if (scriptNode.getSourceName().length() > 0) {
            str2 = scriptNode.getSourceName().replaceAll("\\W", "_");
            if (!Character.isJavaIdentifierStart(str2.charAt(0))) {
                str2 = "_" + str2;
            }
        }
        String str3 = "org.mozilla.javascript.gen." + str2 + "_" + i11;
        return new Object[]{str3, compileToClassFile(compilerEnvirons, str3, scriptNode, str, z11)};
    }

    public byte[] compileToClassFile(CompilerEnvirons compilerEnvirons, String str, ScriptNode scriptNode, String str2, boolean z11) {
        this.compilerEnv = compilerEnvirons;
        transform(scriptNode);
        if (z11) {
            scriptNode = scriptNode.getFunctionNode(0);
        }
        initScriptNodesData(scriptNode);
        this.mainClassName = str;
        this.mainClassSignature = ClassFileWriter.l0(str);
        try {
            return generateCode(str2);
        } catch (ClassFileWriter.ClassFileFormatException e11) {
            throw reportClassFileFormatException(scriptNode, e11.getMessage());
        }
    }

    @Override // org.mozilla.javascript.Evaluator
    public Function createFunctionObject(Context context, Scriptable scriptable, Object obj, Object obj2) {
        try {
            return (NativeFunction) defineClass(obj, obj2).getConstructors()[0].newInstance(scriptable, context, 0);
        } catch (Exception e11) {
            throw new RuntimeException("Unable to instantiate compiled class:" + e11.toString());
        }
    }

    @Override // org.mozilla.javascript.Evaluator
    public Script createScriptObject(Object obj, Object obj2) {
        try {
            return (Script) defineClass(obj, obj2).newInstance();
        } catch (Exception e11) {
            throw new RuntimeException("Unable to instantiate compiled class:" + e11.toString());
        }
    }

    public String getBodyMethodName(ScriptNode scriptNode) {
        return "_c_" + cleanName(scriptNode) + "_" + getIndex(scriptNode);
    }

    public String getBodyMethodSignature(ScriptNode scriptNode) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append('(');
        stringBuffer.append(this.mainClassSignature);
        stringBuffer.append("Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;Lorg/mozilla/javascript/Scriptable;");
        if (scriptNode.getType() == 109) {
            OptFunctionNode optFunctionNode = OptFunctionNode.get(scriptNode);
            if (optFunctionNode.isTargetOfDirectCall()) {
                int paramCount = optFunctionNode.fnode.getParamCount();
                for (int i11 = 0; i11 != paramCount; i11++) {
                    stringBuffer.append("Ljava/lang/Object;D");
                }
            }
        }
        stringBuffer.append("[Ljava/lang/Object;)Ljava/lang/Object;");
        return stringBuffer.toString();
    }

    public String getCompiledRegexpName(ScriptNode scriptNode, int i11) {
        return "_re" + getIndex(scriptNode) + "_" + i11;
    }

    public String getDirectCtorName(ScriptNode scriptNode) {
        return "_n" + getIndex(scriptNode);
    }

    public String getFunctionInitMethodName(OptFunctionNode optFunctionNode) {
        return "_i" + getIndex(optFunctionNode.fnode);
    }

    public int getIndex(ScriptNode scriptNode) {
        return this.scriptOrFnIndexes.getExisting(scriptNode);
    }

    @Override // org.mozilla.javascript.Evaluator
    public String getPatchedStack(RhinoException rhinoException, String str) {
        throw new UnsupportedOperationException();
    }

    @Override // org.mozilla.javascript.Evaluator
    public List<String> getScriptStack(RhinoException rhinoException) {
        throw new UnsupportedOperationException();
    }

    @Override // org.mozilla.javascript.Evaluator
    public String getSourcePositionFromStack(Context context, int[] iArr) {
        throw new UnsupportedOperationException();
    }

    public void pushNumberAsObject(ClassFileWriter classFileWriter, double d11) {
        if (d11 == 0.0d) {
            if (1.0d / d11 > 0.0d) {
                classFileWriter.v(178, "org/mozilla/javascript/optimizer/OptRuntime", "zeroObj", "Ljava/lang/Double;");
                return;
            } else {
                classFileWriter.V(d11);
                addDoubleWrap(classFileWriter);
                return;
            }
        }
        if (d11 == 1.0d) {
            classFileWriter.v(178, "org/mozilla/javascript/optimizer/OptRuntime", "oneObj", "Ljava/lang/Double;");
            return;
        }
        if (d11 == -1.0d) {
            classFileWriter.v(178, "org/mozilla/javascript/optimizer/OptRuntime", "minusOneObj", "Ljava/lang/Double;");
            return;
        }
        if (d11 != d11) {
            classFileWriter.v(178, "org/mozilla/javascript/ScriptRuntime", "NaNobj", "Ljava/lang/Double;");
            return;
        }
        int i11 = this.itsConstantListSize;
        if (i11 >= 2000) {
            classFileWriter.V(d11);
            addDoubleWrap(classFileWriter);
            return;
        }
        int i12 = 0;
        if (i11 == 0) {
            this.itsConstantList = new double[64];
        } else {
            double[] dArr = this.itsConstantList;
            int i13 = 0;
            while (i13 != i11 && dArr[i13] != d11) {
                i13++;
            }
            if (i11 == dArr.length) {
                double[] dArr2 = new double[i11 * 2];
                System.arraycopy(this.itsConstantList, 0, dArr2, 0, i11);
                this.itsConstantList = dArr2;
            }
            i12 = i13;
        }
        if (i12 == i11) {
            this.itsConstantList[i11] = d11;
            this.itsConstantListSize = i11 + 1;
        }
        classFileWriter.v(178, this.mainClassName, "_k" + i12, getStaticConstantWrapperType(d11));
    }

    @Override // org.mozilla.javascript.Evaluator
    public void setEvalScriptFlag(Script script) {
        throw new UnsupportedOperationException();
    }

    public void setMainMethodClass(String str) {
        this.mainMethodClass = str;
    }
}

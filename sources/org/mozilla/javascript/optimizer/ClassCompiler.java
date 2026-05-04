package org.mozilla.javascript.optimizer;

import org.mozilla.javascript.CompilerEnvirons;
import org.mozilla.javascript.IRFactory;
import org.mozilla.javascript.JavaAdapter;
import org.mozilla.javascript.ObjToIntMap;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.ScriptRuntime;
import org.mozilla.javascript.ast.FunctionNode;
import org.mozilla.javascript.ast.ScriptNode;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class ClassCompiler {
    private CompilerEnvirons compilerEnv;
    private String mainMethodClassName;
    private Class<?> targetExtends;
    private Class<?>[] targetImplements;

    public ClassCompiler(CompilerEnvirons compilerEnvirons) {
        if (compilerEnvirons == null) {
            throw new IllegalArgumentException();
        }
        this.compilerEnv = compilerEnvirons;
        this.mainMethodClassName = "org.mozilla.javascript.optimizer.OptRuntime";
    }

    public Object[] compileToClassFiles(String str, String str2, int i11, String str3) {
        ScriptNode transformTree = new IRFactory(this.compilerEnv).transformTree(new Parser(this.compilerEnv).parse(str, str2, i11));
        Class<?> targetExtends = getTargetExtends();
        Class<?>[] targetImplements = getTargetImplements();
        boolean z11 = targetImplements == null && targetExtends == null;
        String makeAuxiliaryClassName = z11 ? str3 : makeAuxiliaryClassName(str3, "1");
        Codegen codegen = new Codegen();
        codegen.setMainMethodClass(this.mainMethodClassName);
        byte[] compileToClassFile = codegen.compileToClassFile(this.compilerEnv, makeAuxiliaryClassName, transformTree, transformTree.getEncodedSource(), false);
        if (z11) {
            return new Object[]{makeAuxiliaryClassName, compileToClassFile};
        }
        int functionCount = transformTree.getFunctionCount();
        ObjToIntMap objToIntMap = new ObjToIntMap(functionCount);
        for (int i12 = 0; i12 != functionCount; i12++) {
            FunctionNode functionNode = transformTree.getFunctionNode(i12);
            String name = functionNode.getName();
            if (name != null && name.length() != 0) {
                objToIntMap.put(name, functionNode.getParamCount());
            }
        }
        if (targetExtends == null) {
            targetExtends = ScriptRuntime.ObjectClass;
        }
        return new Object[]{str3, JavaAdapter.createAdapterCode(objToIntMap, str3, targetExtends, targetImplements, makeAuxiliaryClassName), makeAuxiliaryClassName, compileToClassFile};
    }

    public CompilerEnvirons getCompilerEnv() {
        return this.compilerEnv;
    }

    public String getMainMethodClass() {
        return this.mainMethodClassName;
    }

    public Class<?> getTargetExtends() {
        return this.targetExtends;
    }

    public Class<?>[] getTargetImplements() {
        Class<?>[] clsArr = this.targetImplements;
        if (clsArr == null) {
            return null;
        }
        return (Class[]) clsArr.clone();
    }

    public String makeAuxiliaryClassName(String str, String str2) {
        return str + str2;
    }

    public void setMainMethodClass(String str) {
        this.mainMethodClassName = str;
    }

    public void setTargetExtends(Class<?> cls) {
        this.targetExtends = cls;
    }

    public void setTargetImplements(Class<?>[] clsArr) {
        this.targetImplements = clsArr == null ? null : (Class[]) clsArr.clone();
    }
}

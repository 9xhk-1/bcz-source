package org.mozilla.javascript;

import ix.l1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class NativeGenerator extends IdScriptableObject {
    public static final int GENERATOR_CLOSE = 2;
    public static final int GENERATOR_SEND = 0;
    private static final Object GENERATOR_TAG = "Generator";
    public static final int GENERATOR_THROW = 1;
    private static final int Id___iterator__ = 5;
    private static final int Id_close = 1;
    private static final int Id_next = 2;
    private static final int Id_send = 3;
    private static final int Id_throw = 4;
    private static final int MAX_PROTOTYPE_ID = 5;
    private static final long serialVersionUID = 1645892441041347273L;
    private boolean firstTime = true;
    private NativeFunction function;
    private int lineNumber;
    private String lineSource;
    private boolean locked;
    private Object savedState;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class CloseGeneratorAction implements ContextAction {
        private NativeGenerator generator;

        public CloseGeneratorAction(NativeGenerator nativeGenerator) {
            this.generator = nativeGenerator;
        }

        @Override // org.mozilla.javascript.ContextAction
        public Object run(Context context) {
            return ScriptRuntime.doTopCall(new Callable() { // from class: org.mozilla.javascript.NativeGenerator.CloseGeneratorAction.1
                @Override // org.mozilla.javascript.Callable
                public Object call(Context context2, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
                    return ((NativeGenerator) scriptable2).resume(context2, scriptable, 2, new GeneratorClosedException());
                }
            }, context, ScriptableObject.getTopLevelScope(this.generator), this.generator, null);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class GeneratorClosedException extends RuntimeException {
        private static final long serialVersionUID = 2561315658662379681L;
    }

    private NativeGenerator() {
    }

    public static NativeGenerator init(ScriptableObject scriptableObject, boolean z11) {
        NativeGenerator nativeGenerator = new NativeGenerator();
        if (scriptableObject != null) {
            nativeGenerator.setParentScope(scriptableObject);
            nativeGenerator.setPrototype(ScriptableObject.getObjectPrototype(scriptableObject));
        }
        nativeGenerator.activatePrototypeMap(5);
        if (z11) {
            nativeGenerator.sealObject();
        }
        if (scriptableObject != null) {
            scriptableObject.associateValue(GENERATOR_TAG, nativeGenerator);
        }
        return nativeGenerator;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:50:0x006f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object resume(org.mozilla.javascript.Context r12, org.mozilla.javascript.Scriptable r13, int r14, java.lang.Object r15) {
        /*
            r11 = this;
            java.lang.Object r0 = r11.savedState
            r1 = 1
            r2 = 2
            if (r0 != 0) goto L1c
            if (r14 != r2) goto Lb
            java.lang.Object r12 = org.mozilla.javascript.Undefined.instance
            return r12
        Lb:
            if (r14 != r1) goto Le
            goto L12
        Le:
            java.lang.Object r15 = org.mozilla.javascript.NativeIterator.getStopIterationObject(r13)
        L12:
            org.mozilla.javascript.JavaScriptException r12 = new org.mozilla.javascript.JavaScriptException
            java.lang.String r13 = r11.lineSource
            int r14 = r11.lineNumber
            r12.<init>(r15, r13, r14)
            throw r12
        L1c:
            r3 = 0
            r4 = 0
            monitor-enter(r11)     // Catch: java.lang.Throwable -> L45 org.mozilla.javascript.RhinoException -> L48 org.mozilla.javascript.NativeGenerator.GeneratorClosedException -> L4b
            boolean r0 = r11.locked     // Catch: java.lang.Throwable -> L4d
            if (r0 != 0) goto L51
            r11.locked = r1     // Catch: java.lang.Throwable -> L4d
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L4d
            org.mozilla.javascript.NativeFunction r5 = r11.function     // Catch: java.lang.Throwable -> L45 org.mozilla.javascript.RhinoException -> L48 org.mozilla.javascript.NativeGenerator.GeneratorClosedException -> L4b
            java.lang.Object r9 = r11.savedState     // Catch: java.lang.Throwable -> L45 org.mozilla.javascript.RhinoException -> L48 org.mozilla.javascript.NativeGenerator.GeneratorClosedException -> L4b
            r6 = r12
            r7 = r13
            r8 = r14
            r10 = r15
            java.lang.Object r12 = r5.resumeGenerator(r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L3f org.mozilla.javascript.RhinoException -> L42 org.mozilla.javascript.NativeGenerator.GeneratorClosedException -> L6c
            monitor-enter(r11)
            r11.locked = r3     // Catch: java.lang.Throwable -> L3b
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L3b
            if (r8 != r2) goto L3a
            r11.savedState = r4
        L3a:
            return r12
        L3b:
            r0 = move-exception
            r12 = r0
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L3b
            throw r12
        L3f:
            r0 = move-exception
        L40:
            r12 = r0
            goto L7b
        L42:
            r0 = move-exception
        L43:
            r12 = r0
            goto L5d
        L45:
            r0 = move-exception
            r8 = r14
            goto L40
        L48:
            r0 = move-exception
            r8 = r14
            goto L43
        L4b:
            r8 = r14
            goto L6c
        L4d:
            r0 = move-exception
            r8 = r14
        L4f:
            r12 = r0
            goto L5b
        L51:
            r8 = r14
            java.lang.String r12 = "msg.already.exec.gen"
            org.mozilla.javascript.EcmaError r12 = org.mozilla.javascript.ScriptRuntime.typeError0(r12)     // Catch: java.lang.Throwable -> L59
            throw r12     // Catch: java.lang.Throwable -> L59
        L59:
            r0 = move-exception
            goto L4f
        L5b:
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L59
            throw r12     // Catch: java.lang.Throwable -> L3f org.mozilla.javascript.RhinoException -> L42 org.mozilla.javascript.NativeGenerator.GeneratorClosedException -> L6c
        L5d:
            int r13 = r12.lineNumber()     // Catch: java.lang.Throwable -> L3f
            r11.lineNumber = r13     // Catch: java.lang.Throwable -> L3f
            java.lang.String r13 = r12.lineSource()     // Catch: java.lang.Throwable -> L3f
            r11.lineSource = r13     // Catch: java.lang.Throwable -> L3f
            r11.savedState = r4     // Catch: java.lang.Throwable -> L3f
            throw r12     // Catch: java.lang.Throwable -> L3f
        L6c:
            java.lang.Object r12 = org.mozilla.javascript.Undefined.instance     // Catch: java.lang.Throwable -> L3f
            monitor-enter(r11)
            r11.locked = r3     // Catch: java.lang.Throwable -> L77
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L77
            if (r8 != r2) goto L76
            r11.savedState = r4
        L76:
            return r12
        L77:
            r0 = move-exception
            r12 = r0
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L77
            throw r12
        L7b:
            monitor-enter(r11)
            r11.locked = r3     // Catch: java.lang.Throwable -> L84
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L84
            if (r8 != r2) goto L83
            r11.savedState = r4
        L83:
            throw r12
        L84:
            r0 = move-exception
            r12 = r0
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L84
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mozilla.javascript.NativeGenerator.resume(org.mozilla.javascript.Context, org.mozilla.javascript.Scriptable, int, java.lang.Object):java.lang.Object");
    }

    @Override // org.mozilla.javascript.IdScriptableObject, org.mozilla.javascript.IdFunctionCall
    public Object execIdCall(IdFunctionObject idFunctionObject, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        if (!idFunctionObject.hasTag(GENERATOR_TAG)) {
            return super.execIdCall(idFunctionObject, context, scriptable, scriptable2, objArr);
        }
        int methodId = idFunctionObject.methodId();
        if (!(scriptable2 instanceof NativeGenerator)) {
            throw IdScriptableObject.incompatibleCallError(idFunctionObject);
        }
        NativeGenerator nativeGenerator = (NativeGenerator) scriptable2;
        if (methodId == 1) {
            return nativeGenerator.resume(context, scriptable, 2, new GeneratorClosedException());
        }
        if (methodId == 2) {
            nativeGenerator.firstTime = false;
            return nativeGenerator.resume(context, scriptable, 0, Undefined.instance);
        }
        if (methodId != 3) {
            if (methodId == 4) {
                return nativeGenerator.resume(context, scriptable, 1, objArr.length > 0 ? objArr[0] : Undefined.instance);
            }
            if (methodId == 5) {
                return scriptable2;
            }
            throw new IllegalArgumentException(String.valueOf(methodId));
        }
        Object obj = objArr.length > 0 ? objArr[0] : Undefined.instance;
        if (!nativeGenerator.firstTime || obj.equals(Undefined.instance)) {
            return nativeGenerator.resume(context, scriptable, 0, obj);
        }
        throw ScriptRuntime.typeError0("msg.send.newborn");
    }

    @Override // org.mozilla.javascript.IdScriptableObject
    public int findPrototypeId(String str) {
        String str2;
        int length = str.length();
        int i11 = 4;
        if (length == 4) {
            char charAt = str.charAt(0);
            if (charAt == 'n') {
                str2 = l1.b.f62938h;
                i11 = 2;
            } else {
                if (charAt == 's') {
                    str2 = "send";
                    i11 = 3;
                }
                str2 = null;
                i11 = 0;
            }
        } else if (length == 5) {
            char charAt2 = str.charAt(0);
            if (charAt2 == 'c') {
                str2 = "close";
                i11 = 1;
            } else {
                if (charAt2 == 't') {
                    str2 = "throw";
                }
                str2 = null;
                i11 = 0;
            }
        } else {
            if (length == 12) {
                str2 = NativeIterator.ITERATOR_PROPERTY_NAME;
                i11 = 5;
            }
            str2 = null;
            i11 = 0;
        }
        if (str2 == null || str2 == str || str2.equals(str)) {
            return i11;
        }
        return 0;
    }

    @Override // org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.Scriptable
    public String getClassName() {
        return "Generator";
    }

    @Override // org.mozilla.javascript.IdScriptableObject
    public void initPrototypeId(int i11) {
        String str;
        int i12 = 1;
        if (i11 == 1) {
            str = "close";
        } else if (i11 != 2) {
            if (i11 == 3) {
                str = "send";
            } else if (i11 == 4) {
                str = "throw";
            } else {
                if (i11 != 5) {
                    throw new IllegalArgumentException(String.valueOf(i11));
                }
                str = NativeIterator.ITERATOR_PROPERTY_NAME;
            }
            i12 = 0;
        } else {
            str = l1.b.f62938h;
        }
        initPrototypeMethod(GENERATOR_TAG, i11, str, i12);
    }

    public NativeGenerator(Scriptable scriptable, NativeFunction nativeFunction, Object obj) {
        this.function = nativeFunction;
        this.savedState = obj;
        Scriptable topLevelScope = ScriptableObject.getTopLevelScope(scriptable);
        setParentScope(topLevelScope);
        setPrototype((NativeGenerator) ScriptableObject.getTopScopeValue(topLevelScope, GENERATOR_TAG));
    }
}

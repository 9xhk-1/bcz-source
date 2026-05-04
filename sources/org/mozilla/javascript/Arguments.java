package org.mozilla.javascript;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
final class Arguments extends IdScriptableObject {
    private static final String FTAG = "Arguments";
    private static final int Id_callee = 1;
    private static final int Id_caller = 3;
    private static final int Id_constructor = 4;
    private static final int Id_length = 2;
    private static final int MAX_INSTANCE_ID = 4;
    static final long serialVersionUID = 4275508002492040609L;
    private NativeCall activation;
    private Object[] args;
    private Object calleeObj;
    private Object callerObj;
    private Object constructor;
    private Object lengthObj;

    public Arguments(NativeCall nativeCall) {
        this.activation = nativeCall;
        Scriptable parentScope = nativeCall.getParentScope();
        setParentScope(parentScope);
        setPrototype(ScriptableObject.getObjectPrototype(parentScope));
        Object[] objArr = nativeCall.originalArgs;
        this.args = objArr;
        this.lengthObj = Integer.valueOf(objArr.length);
        NativeFunction nativeFunction = nativeCall.function;
        this.calleeObj = nativeFunction;
        this.constructor = ScriptableObject.getProperty(ScriptableObject.getTopLevelScope(parentScope), "Object");
        int languageVersion = nativeFunction.getLanguageVersion();
        if (languageVersion > 130 || languageVersion == 0) {
            this.callerObj = Scriptable.NOT_FOUND;
        } else {
            this.callerObj = null;
        }
    }

    private Object arg(int i11) {
        if (i11 >= 0) {
            Object[] objArr = this.args;
            if (objArr.length > i11) {
                return objArr[i11];
            }
        }
        return Scriptable.NOT_FOUND;
    }

    private Object getFromActivation(int i11) {
        String paramOrVarName = this.activation.function.getParamOrVarName(i11);
        Scriptable scriptable = this.activation;
        return scriptable.get(paramOrVarName, scriptable);
    }

    private void putIntoActivation(int i11, Object obj) {
        String paramOrVarName = this.activation.function.getParamOrVarName(i11);
        Scriptable scriptable = this.activation;
        scriptable.put(paramOrVarName, scriptable, obj);
    }

    private void removeArg(int i11) {
        synchronized (this) {
            try {
                Object[] objArr = this.args;
                Object obj = objArr[i11];
                Object obj2 = Scriptable.NOT_FOUND;
                if (obj != obj2) {
                    if (objArr == this.activation.originalArgs) {
                        this.args = (Object[]) objArr.clone();
                    }
                    this.args[i11] = obj2;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void replaceArg(int i11, Object obj) {
        if (sharedWithActivation(i11)) {
            putIntoActivation(i11, obj);
        }
        synchronized (this) {
            try {
                Object[] objArr = this.args;
                if (objArr == this.activation.originalArgs) {
                    this.args = (Object[]) objArr.clone();
                }
                this.args[i11] = obj;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private boolean sharedWithActivation(int i11) {
        NativeFunction nativeFunction = this.activation.function;
        int paramCount = nativeFunction.getParamCount();
        if (i11 >= paramCount) {
            return false;
        }
        if (i11 < paramCount - 1) {
            String paramOrVarName = nativeFunction.getParamOrVarName(i11);
            for (int i12 = i11 + 1; i12 < paramCount; i12++) {
                if (paramOrVarName.equals(nativeFunction.getParamOrVarName(i12))) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // org.mozilla.javascript.ScriptableObject
    public void defineOwnProperty(Context context, Object obj, ScriptableObject scriptableObject, boolean z11) {
        super.defineOwnProperty(context, obj, scriptableObject, z11);
        double number = ScriptRuntime.toNumber(obj);
        int i11 = (int) number;
        if (number != i11) {
            return;
        }
        Object arg = arg(i11);
        Object obj2 = Scriptable.NOT_FOUND;
        if (arg == obj2) {
            return;
        }
        if (isAccessorDescriptor(scriptableObject)) {
            removeArg(i11);
            return;
        }
        Object property = ScriptableObject.getProperty(scriptableObject, "value");
        if (property == obj2) {
            return;
        }
        replaceArg(i11, property);
        if (ScriptableObject.isFalse(ScriptableObject.getProperty(scriptableObject, "writable"))) {
            removeArg(i11);
        }
    }

    @Override // org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.Scriptable
    public void delete(int i11) {
        if (i11 >= 0 && i11 < this.args.length) {
            removeArg(i11);
        }
        super.delete(i11);
    }

    @Override // org.mozilla.javascript.IdScriptableObject
    public int findInstanceIdInfo(String str) {
        String str2;
        int i11;
        int length = str.length();
        if (length == 6) {
            char charAt = str.charAt(5);
            if (charAt == 'e') {
                str2 = "callee";
                i11 = 1;
            } else if (charAt == 'h') {
                str2 = "length";
                i11 = 2;
            } else {
                if (charAt == 'r') {
                    str2 = "caller";
                    i11 = 3;
                }
                str2 = null;
                i11 = 0;
            }
        } else {
            if (length == 11) {
                str2 = "constructor";
                i11 = 4;
            }
            str2 = null;
            i11 = 0;
        }
        int i12 = (str2 == null || str2 == str || str2.equals(str)) ? i11 : 0;
        if (i12 == 0) {
            return super.findInstanceIdInfo(str);
        }
        if (i12 == 1 || i12 == 2 || i12 == 3 || i12 == 4) {
            return IdScriptableObject.instanceIdInfo(2, i12);
        }
        throw new IllegalStateException();
    }

    @Override // org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.Scriptable
    public Object get(int i11, Scriptable scriptable) {
        Object arg = arg(i11);
        return arg == Scriptable.NOT_FOUND ? super.get(i11, scriptable) : sharedWithActivation(i11) ? getFromActivation(i11) : arg;
    }

    @Override // org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.Scriptable
    public String getClassName() {
        return FTAG;
    }

    @Override // org.mozilla.javascript.IdScriptableObject, org.mozilla.javascript.ScriptableObject
    public Object[] getIds(boolean z11) {
        int intValue;
        Object[] ids = super.getIds(z11);
        Object[] objArr = this.args;
        if (objArr.length != 0) {
            int length = objArr.length;
            boolean[] zArr = new boolean[length];
            int length2 = objArr.length;
            for (int i11 = 0; i11 != ids.length; i11++) {
                Object obj = ids[i11];
                if ((obj instanceof Integer) && (intValue = ((Integer) obj).intValue()) >= 0 && intValue < this.args.length && !zArr[intValue]) {
                    zArr[intValue] = true;
                    length2--;
                }
            }
            if (!z11) {
                for (int i12 = 0; i12 < length; i12++) {
                    if (!zArr[i12] && super.has(i12, this)) {
                        zArr[i12] = true;
                        length2--;
                    }
                }
            }
            if (length2 != 0) {
                Object[] objArr2 = new Object[ids.length + length2];
                System.arraycopy(ids, 0, objArr2, length2, ids.length);
                int i13 = 0;
                for (int i14 = 0; i14 != this.args.length; i14++) {
                    if (!zArr[i14]) {
                        objArr2[i13] = Integer.valueOf(i14);
                        i13++;
                    }
                }
                if (i13 != length2) {
                    Kit.codeBug();
                }
                return objArr2;
            }
        }
        return ids;
    }

    @Override // org.mozilla.javascript.IdScriptableObject
    public String getInstanceIdName(int i11) {
        if (i11 == 1) {
            return "callee";
        }
        if (i11 == 2) {
            return "length";
        }
        if (i11 == 3) {
            return "caller";
        }
        if (i11 != 4) {
            return null;
        }
        return "constructor";
    }

    @Override // org.mozilla.javascript.IdScriptableObject
    public Object getInstanceIdValue(int i11) {
        Scriptable scriptable;
        if (i11 == 1) {
            return this.calleeObj;
        }
        if (i11 == 2) {
            return this.lengthObj;
        }
        if (i11 != 3) {
            return i11 != 4 ? super.getInstanceIdValue(i11) : this.constructor;
        }
        Object obj = this.callerObj;
        if (obj == UniqueTag.NULL_VALUE) {
            return null;
        }
        return (obj != null || (scriptable = this.activation.parentActivationCall) == null) ? obj : scriptable.get("arguments", scriptable);
    }

    @Override // org.mozilla.javascript.IdScriptableObject
    public int getMaxInstanceId() {
        return 4;
    }

    @Override // org.mozilla.javascript.IdScriptableObject, org.mozilla.javascript.ScriptableObject
    public ScriptableObject getOwnPropertyDescriptor(Context context, Object obj) {
        double number = ScriptRuntime.toNumber(obj);
        int i11 = (int) number;
        if (number != i11) {
            return super.getOwnPropertyDescriptor(context, obj);
        }
        Object arg = arg(i11);
        if (arg == Scriptable.NOT_FOUND) {
            return super.getOwnPropertyDescriptor(context, obj);
        }
        if (sharedWithActivation(i11)) {
            arg = getFromActivation(i11);
        }
        if (super.has(i11, this)) {
            ScriptableObject ownPropertyDescriptor = super.getOwnPropertyDescriptor(context, obj);
            ownPropertyDescriptor.put("value", ownPropertyDescriptor, arg);
            return ownPropertyDescriptor;
        }
        Scriptable parentScope = getParentScope();
        if (parentScope == null) {
            parentScope = this;
        }
        return ScriptableObject.buildDataDescriptor(parentScope, arg, 0);
    }

    @Override // org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.Scriptable
    public boolean has(int i11, Scriptable scriptable) {
        if (arg(i11) != Scriptable.NOT_FOUND) {
            return true;
        }
        return super.has(i11, scriptable);
    }

    @Override // org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.Scriptable
    public void put(int i11, Scriptable scriptable, Object obj) {
        if (arg(i11) == Scriptable.NOT_FOUND) {
            super.put(i11, scriptable, obj);
        } else {
            replaceArg(i11, obj);
        }
    }

    @Override // org.mozilla.javascript.IdScriptableObject
    public void setInstanceIdValue(int i11, Object obj) {
        if (i11 == 1) {
            this.calleeObj = obj;
            return;
        }
        if (i11 == 2) {
            this.lengthObj = obj;
            return;
        }
        if (i11 == 3) {
            if (obj == null) {
                obj = UniqueTag.NULL_VALUE;
            }
            this.callerObj = obj;
        } else if (i11 != 4) {
            super.setInstanceIdValue(i11, obj);
        } else {
            this.constructor = obj;
        }
    }
}

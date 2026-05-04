package org.mozilla.javascript;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class ImporterTopLevel extends TopLevel {
    private static final Object IMPORTER_TAG = "Importer";
    private static final int Id_constructor = 1;
    private static final int Id_importClass = 2;
    private static final int Id_importPackage = 3;
    private static final int MAX_PROTOTYPE_ID = 3;
    static final long serialVersionUID = -9095380847465315412L;
    private ObjArray importedPackages;
    private boolean topScopeFlag;

    public ImporterTopLevel() {
        this.importedPackages = new ObjArray();
    }

    private Object getPackageProperty(String str, Scriptable scriptable) {
        Object[] array;
        Object obj = Scriptable.NOT_FOUND;
        synchronized (this.importedPackages) {
            array = this.importedPackages.toArray();
        }
        for (Object obj2 : array) {
            Object pkgProperty = ((NativeJavaPackage) obj2).getPkgProperty(str, scriptable, false);
            if (pkgProperty != null && !(pkgProperty instanceof NativeJavaPackage)) {
                if (obj != Scriptable.NOT_FOUND) {
                    throw Context.reportRuntimeError2("msg.ambig.import", obj.toString(), pkgProperty.toString());
                }
                obj = pkgProperty;
            }
        }
        return obj;
    }

    private void importClass(NativeJavaClass nativeJavaClass) {
        String name = nativeJavaClass.getClassObject().getName();
        String substring = name.substring(name.lastIndexOf(46) + 1);
        Object obj = get(substring, this);
        if (obj != Scriptable.NOT_FOUND && obj != nativeJavaClass) {
            throw Context.reportRuntimeError1("msg.prop.defined", substring);
        }
        put(substring, this, nativeJavaClass);
    }

    public static void init(Context context, Scriptable scriptable, boolean z11) {
        new ImporterTopLevel().exportAsJSClass(3, scriptable, z11);
    }

    private Object js_construct(Scriptable scriptable, Object[] objArr) {
        ImporterTopLevel importerTopLevel = new ImporterTopLevel();
        for (int i11 = 0; i11 != objArr.length; i11++) {
            Object obj = objArr[i11];
            if (obj instanceof NativeJavaClass) {
                importerTopLevel.importClass((NativeJavaClass) obj);
            } else {
                if (!(obj instanceof NativeJavaPackage)) {
                    throw Context.reportRuntimeError1("msg.not.class.not.pkg", Context.toString(obj));
                }
                importerTopLevel.importPackage((NativeJavaPackage) obj);
            }
        }
        importerTopLevel.setParentScope(scriptable);
        importerTopLevel.setPrototype(this);
        return importerTopLevel;
    }

    private Object js_importClass(Object[] objArr) {
        for (int i11 = 0; i11 != objArr.length; i11++) {
            Object obj = objArr[i11];
            if (!(obj instanceof NativeJavaClass)) {
                throw Context.reportRuntimeError1("msg.not.class", Context.toString(obj));
            }
            importClass((NativeJavaClass) obj);
        }
        return Undefined.instance;
    }

    private Object js_importPackage(Object[] objArr) {
        for (int i11 = 0; i11 != objArr.length; i11++) {
            Object obj = objArr[i11];
            if (!(obj instanceof NativeJavaPackage)) {
                throw Context.reportRuntimeError1("msg.not.pkg", Context.toString(obj));
            }
            importPackage((NativeJavaPackage) obj);
        }
        return Undefined.instance;
    }

    private ImporterTopLevel realThis(Scriptable scriptable, IdFunctionObject idFunctionObject) {
        if (this.topScopeFlag) {
            return this;
        }
        if (scriptable instanceof ImporterTopLevel) {
            return (ImporterTopLevel) scriptable;
        }
        throw IdScriptableObject.incompatibleCallError(idFunctionObject);
    }

    @Override // org.mozilla.javascript.IdScriptableObject, org.mozilla.javascript.IdFunctionCall
    public Object execIdCall(IdFunctionObject idFunctionObject, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        if (!idFunctionObject.hasTag(IMPORTER_TAG)) {
            return super.execIdCall(idFunctionObject, context, scriptable, scriptable2, objArr);
        }
        int methodId = idFunctionObject.methodId();
        if (methodId == 1) {
            return js_construct(scriptable, objArr);
        }
        if (methodId == 2) {
            return realThis(scriptable2, idFunctionObject).js_importClass(objArr);
        }
        if (methodId == 3) {
            return realThis(scriptable2, idFunctionObject).js_importPackage(objArr);
        }
        throw new IllegalArgumentException(String.valueOf(methodId));
    }

    @Override // org.mozilla.javascript.IdScriptableObject
    public int findPrototypeId(String str) {
        String str2;
        int i11;
        int length = str.length();
        if (length == 11) {
            char charAt = str.charAt(0);
            if (charAt == 'c') {
                str2 = "constructor";
                i11 = 1;
            } else {
                if (charAt == 'i') {
                    str2 = "importClass";
                    i11 = 2;
                }
                str2 = null;
                i11 = 0;
            }
        } else {
            if (length == 13) {
                str2 = "importPackage";
                i11 = 3;
            }
            str2 = null;
            i11 = 0;
        }
        if (str2 == null || str2 == str || str2.equals(str)) {
            return i11;
        }
        return 0;
    }

    @Override // org.mozilla.javascript.IdScriptableObject, org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.Scriptable
    public Object get(String str, Scriptable scriptable) {
        Object obj = super.get(str, scriptable);
        return obj != Scriptable.NOT_FOUND ? obj : getPackageProperty(str, scriptable);
    }

    @Override // org.mozilla.javascript.TopLevel, org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.Scriptable
    public String getClassName() {
        return this.topScopeFlag ? "global" : "JavaImporter";
    }

    @Override // org.mozilla.javascript.IdScriptableObject, org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.Scriptable
    public boolean has(String str, Scriptable scriptable) {
        return super.has(str, scriptable) || getPackageProperty(str, scriptable) != Scriptable.NOT_FOUND;
    }

    public void importPackage(Context context, Scriptable scriptable, Object[] objArr, Function function) {
        js_importPackage(objArr);
    }

    @Override // org.mozilla.javascript.IdScriptableObject
    public void initPrototypeId(int i11) {
        String str;
        int i12 = 1;
        if (i11 == 1) {
            i12 = 0;
            str = "constructor";
        } else if (i11 == 2) {
            str = "importClass";
        } else {
            if (i11 != 3) {
                throw new IllegalArgumentException(String.valueOf(i11));
            }
            str = "importPackage";
        }
        initPrototypeMethod(IMPORTER_TAG, i11, str, i12);
    }

    public void initStandardObjects(Context context, boolean z11) {
        context.initStandardObjects(this, z11);
        this.topScopeFlag = true;
        IdFunctionObject exportAsJSClass = exportAsJSClass(3, this, false);
        if (z11) {
            exportAsJSClass.sealObject();
        }
        delete("constructor");
    }

    private void importPackage(NativeJavaPackage nativeJavaPackage) {
        if (nativeJavaPackage == null) {
            return;
        }
        synchronized (this.importedPackages) {
            for (int i11 = 0; i11 != this.importedPackages.size(); i11++) {
                try {
                    if (nativeJavaPackage.equals(this.importedPackages.get(i11))) {
                        return;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.importedPackages.add(nativeJavaPackage);
        }
    }

    public ImporterTopLevel(Context context) {
        this(context, false);
    }

    public ImporterTopLevel(Context context, boolean z11) {
        this.importedPackages = new ObjArray();
        initStandardObjects(context, z11);
    }
}

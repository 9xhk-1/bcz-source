package org.mozilla.javascript.xmlimpl;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.IdFunctionObject;
import org.mozilla.javascript.IdScriptableObject;
import org.mozilla.javascript.ScriptRuntime;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;
import org.mozilla.javascript.Undefined;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
class XMLCtor extends IdFunctionObject {
    private static final int Id_defaultSettings = 1;
    private static final int Id_ignoreComments = 1;
    private static final int Id_ignoreProcessingInstructions = 2;
    private static final int Id_ignoreWhitespace = 3;
    private static final int Id_prettyIndent = 4;
    private static final int Id_prettyPrinting = 5;
    private static final int Id_setSettings = 3;
    private static final int Id_settings = 2;
    private static final int MAX_FUNCTION_ID = 3;
    private static final int MAX_INSTANCE_ID = 5;
    private static final Object XMLCTOR_TAG = "XMLCtor";
    static final long serialVersionUID = -8708195078359817341L;
    private XmlProcessor options;

    public XMLCtor(XML xml, Object obj, int i11, int i12) {
        super(xml, obj, i11, i12);
        this.options = xml.getProcessor();
        activatePrototypeMap(3);
    }

    private void readSettings(Scriptable scriptable) {
        for (int i11 = 1; i11 <= 5; i11++) {
            int maxInstanceId = super.getMaxInstanceId() + i11;
            Object property = ScriptableObject.getProperty(scriptable, getInstanceIdName(maxInstanceId));
            if (property != Scriptable.NOT_FOUND) {
                if (i11 != 1 && i11 != 2 && i11 != 3) {
                    if (i11 == 4) {
                        if (!(property instanceof Number)) {
                        }
                        setInstanceIdValue(maxInstanceId, property);
                    } else if (i11 != 5) {
                        throw new IllegalStateException();
                    }
                }
                if (!(property instanceof Boolean)) {
                }
                setInstanceIdValue(maxInstanceId, property);
            }
        }
    }

    private void writeSetting(Scriptable scriptable) {
        for (int i11 = 1; i11 <= 5; i11++) {
            int maxInstanceId = super.getMaxInstanceId() + i11;
            ScriptableObject.putProperty(scriptable, getInstanceIdName(maxInstanceId), getInstanceIdValue(maxInstanceId));
        }
    }

    @Override // org.mozilla.javascript.BaseFunction, org.mozilla.javascript.IdScriptableObject, org.mozilla.javascript.IdFunctionCall
    public Object execIdCall(IdFunctionObject idFunctionObject, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Object obj;
        if (!idFunctionObject.hasTag(XMLCTOR_TAG)) {
            return super.execIdCall(idFunctionObject, context, scriptable, scriptable2, objArr);
        }
        int methodId = idFunctionObject.methodId();
        if (methodId == 1) {
            this.options.setDefault();
            Scriptable newObject = context.newObject(scriptable);
            writeSetting(newObject);
            return newObject;
        }
        if (methodId == 2) {
            Scriptable newObject2 = context.newObject(scriptable);
            writeSetting(newObject2);
            return newObject2;
        }
        if (methodId != 3) {
            throw new IllegalArgumentException(String.valueOf(methodId));
        }
        if (objArr.length == 0 || (obj = objArr[0]) == null || obj == Undefined.instance) {
            this.options.setDefault();
        } else if (obj instanceof Scriptable) {
            readSettings((Scriptable) obj);
        }
        return Undefined.instance;
    }

    @Override // org.mozilla.javascript.BaseFunction, org.mozilla.javascript.IdScriptableObject
    public int findInstanceIdInfo(String str) {
        String str2;
        int i11;
        int length = str.length();
        if (length == 12) {
            str2 = "prettyIndent";
            i11 = 4;
        } else if (length == 14) {
            char charAt = str.charAt(0);
            if (charAt == 'i') {
                str2 = "ignoreComments";
                i11 = 1;
            } else {
                if (charAt == 'p') {
                    str2 = "prettyPrinting";
                    i11 = 5;
                }
                str2 = null;
                i11 = 0;
            }
        } else if (length != 16) {
            if (length == 28) {
                str2 = "ignoreProcessingInstructions";
                i11 = 2;
            }
            str2 = null;
            i11 = 0;
        } else {
            str2 = "ignoreWhitespace";
            i11 = 3;
        }
        int i12 = (str2 == null || str2 == str || str2.equals(str)) ? i11 : 0;
        if (i12 == 0) {
            return super.findInstanceIdInfo(str);
        }
        if (i12 == 1 || i12 == 2 || i12 == 3 || i12 == 4 || i12 == 5) {
            return IdScriptableObject.instanceIdInfo(6, super.getMaxInstanceId() + i12);
        }
        throw new IllegalStateException();
    }

    @Override // org.mozilla.javascript.BaseFunction, org.mozilla.javascript.IdScriptableObject
    public int findPrototypeId(String str) {
        String str2;
        int i11;
        int length = str.length();
        if (length == 8) {
            str2 = "settings";
            i11 = 2;
        } else if (length == 11) {
            str2 = "setSettings";
            i11 = 3;
        } else if (length == 15) {
            str2 = "defaultSettings";
            i11 = 1;
        } else {
            str2 = null;
            i11 = 0;
        }
        if (str2 == null || str2 == str || str2.equals(str)) {
            return i11;
        }
        return 0;
    }

    @Override // org.mozilla.javascript.BaseFunction, org.mozilla.javascript.IdScriptableObject
    public String getInstanceIdName(int i11) {
        int maxInstanceId = i11 - super.getMaxInstanceId();
        return maxInstanceId != 1 ? maxInstanceId != 2 ? maxInstanceId != 3 ? maxInstanceId != 4 ? maxInstanceId != 5 ? super.getInstanceIdName(i11) : "prettyPrinting" : "prettyIndent" : "ignoreWhitespace" : "ignoreProcessingInstructions" : "ignoreComments";
    }

    @Override // org.mozilla.javascript.BaseFunction, org.mozilla.javascript.IdScriptableObject
    public Object getInstanceIdValue(int i11) {
        int maxInstanceId = i11 - super.getMaxInstanceId();
        return maxInstanceId != 1 ? maxInstanceId != 2 ? maxInstanceId != 3 ? maxInstanceId != 4 ? maxInstanceId != 5 ? super.getInstanceIdValue(i11) : ScriptRuntime.wrapBoolean(this.options.isPrettyPrinting()) : ScriptRuntime.wrapInt(this.options.getPrettyIndent()) : ScriptRuntime.wrapBoolean(this.options.isIgnoreWhitespace()) : ScriptRuntime.wrapBoolean(this.options.isIgnoreProcessingInstructions()) : ScriptRuntime.wrapBoolean(this.options.isIgnoreComments());
    }

    @Override // org.mozilla.javascript.BaseFunction, org.mozilla.javascript.IdScriptableObject
    public int getMaxInstanceId() {
        return super.getMaxInstanceId() + 5;
    }

    @Override // org.mozilla.javascript.BaseFunction, org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.Scriptable
    public boolean hasInstance(Scriptable scriptable) {
        return (scriptable instanceof XML) || (scriptable instanceof XMLList);
    }

    @Override // org.mozilla.javascript.BaseFunction, org.mozilla.javascript.IdScriptableObject
    public void initPrototypeId(int i11) {
        String str;
        String str2;
        int i12 = 1;
        if (i11 == 1) {
            str = "defaultSettings";
        } else {
            if (i11 != 2) {
                if (i11 != 3) {
                    throw new IllegalArgumentException(String.valueOf(i11));
                }
                str2 = "setSettings";
                initPrototypeMethod(XMLCTOR_TAG, i11, str2, i12);
            }
            str = "settings";
        }
        String str3 = str;
        i12 = 0;
        str2 = str3;
        initPrototypeMethod(XMLCTOR_TAG, i11, str2, i12);
    }

    @Override // org.mozilla.javascript.BaseFunction, org.mozilla.javascript.IdScriptableObject
    public void setInstanceIdValue(int i11, Object obj) {
        int maxInstanceId = i11 - super.getMaxInstanceId();
        if (maxInstanceId == 1) {
            this.options.setIgnoreComments(ScriptRuntime.toBoolean(obj));
            return;
        }
        if (maxInstanceId == 2) {
            this.options.setIgnoreProcessingInstructions(ScriptRuntime.toBoolean(obj));
            return;
        }
        if (maxInstanceId == 3) {
            this.options.setIgnoreWhitespace(ScriptRuntime.toBoolean(obj));
            return;
        }
        if (maxInstanceId == 4) {
            this.options.setPrettyIndent(ScriptRuntime.toInt32(obj));
        } else if (maxInstanceId != 5) {
            super.setInstanceIdValue(i11, obj);
        } else {
            this.options.setPrettyPrinting(ScriptRuntime.toBoolean(obj));
        }
    }
}

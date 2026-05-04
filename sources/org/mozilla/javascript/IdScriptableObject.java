package org.mozilla.javascript;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public abstract class IdScriptableObject extends ScriptableObject implements IdFunctionCall {
    private transient PrototypeValues prototypeValues;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class PrototypeValues implements Serializable {
        private static final int NAME_SLOT = 1;
        private static final int SLOT_SPAN = 2;
        static final long serialVersionUID = 3038645279153854371L;
        private short[] attributeArray;
        private IdFunctionObject constructor;
        private short constructorAttrs;
        int constructorId;
        private int maxId;
        private IdScriptableObject obj;
        private Object[] valueArray;

        public PrototypeValues(IdScriptableObject idScriptableObject, int i11) {
            if (idScriptableObject == null) {
                throw new IllegalArgumentException();
            }
            if (i11 < 1) {
                throw new IllegalArgumentException();
            }
            this.obj = idScriptableObject;
            this.maxId = i11;
        }

        private Object ensureId(int i11) {
            Object[] objArr = this.valueArray;
            if (objArr == null) {
                synchronized (this) {
                    try {
                        objArr = this.valueArray;
                        if (objArr == null) {
                            int i12 = this.maxId;
                            Object[] objArr2 = new Object[i12 * 2];
                            this.valueArray = objArr2;
                            this.attributeArray = new short[i12];
                            objArr = objArr2;
                        }
                    } finally {
                    }
                }
            }
            int i13 = (i11 - 1) * 2;
            Object obj = objArr[i13];
            if (obj != null) {
                return obj;
            }
            int i14 = this.constructorId;
            if (i11 == i14) {
                initSlot(i14, "constructor", this.constructor, this.constructorAttrs);
                this.constructor = null;
            } else {
                this.obj.initPrototypeId(i11);
            }
            Object obj2 = objArr[i13];
            if (obj2 != null) {
                return obj2;
            }
            throw new IllegalStateException(this.obj.getClass().getName() + ".initPrototypeId(int id) did not initialize id=" + i11);
        }

        private void initSlot(int i11, String str, Object obj, int i12) {
            Object[] objArr = this.valueArray;
            if (objArr == null) {
                throw new IllegalStateException();
            }
            if (obj == null) {
                obj = UniqueTag.NULL_VALUE;
            }
            int i13 = i11 - 1;
            int i14 = i13 * 2;
            synchronized (this) {
                try {
                    if (objArr[i14] == null) {
                        objArr[i14] = obj;
                        objArr[i14 + 1] = str;
                        this.attributeArray[i13] = (short) i12;
                    } else if (!str.equals(objArr[i14 + 1])) {
                        throw new IllegalStateException();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public final IdFunctionObject createPrecachedConstructor() {
            if (this.constructorId != 0) {
                throw new IllegalStateException();
            }
            int findPrototypeId = this.obj.findPrototypeId("constructor");
            this.constructorId = findPrototypeId;
            if (findPrototypeId == 0) {
                throw new IllegalStateException("No id for constructor property");
            }
            this.obj.initPrototypeId(findPrototypeId);
            IdFunctionObject idFunctionObject = this.constructor;
            if (idFunctionObject != null) {
                idFunctionObject.initFunction(this.obj.getClassName(), ScriptableObject.getTopLevelScope(this.obj));
                this.constructor.markAsConstructor(this.obj);
                return this.constructor;
            }
            throw new IllegalStateException(this.obj.getClass().getName() + ".initPrototypeId() did not initialize id=" + this.constructorId);
        }

        public final void delete(int i11) {
            ensureId(i11);
            int i12 = i11 - 1;
            if ((this.attributeArray[i12] & 4) == 0) {
                int i13 = i12 * 2;
                synchronized (this) {
                    this.valueArray[i13] = Scriptable.NOT_FOUND;
                    this.attributeArray[i12] = 0;
                }
            }
        }

        public final int findId(String str) {
            return this.obj.findPrototypeId(str);
        }

        public final Object get(int i11) {
            Object ensureId = ensureId(i11);
            if (ensureId == UniqueTag.NULL_VALUE) {
                return null;
            }
            return ensureId;
        }

        public final int getAttributes(int i11) {
            ensureId(i11);
            return this.attributeArray[i11 - 1];
        }

        public final int getMaxId() {
            return this.maxId;
        }

        public final Object[] getNames(boolean z11, Object[] objArr) {
            Object[] objArr2 = null;
            int i11 = 0;
            for (int i12 = 1; i12 <= this.maxId; i12++) {
                Object ensureId = ensureId(i12);
                if ((z11 || (this.attributeArray[i12 - 1] & 2) == 0) && ensureId != Scriptable.NOT_FOUND) {
                    String str = (String) this.valueArray[((i12 - 1) * 2) + 1];
                    if (objArr2 == null) {
                        objArr2 = new Object[this.maxId];
                    }
                    objArr2[i11] = str;
                    i11++;
                }
            }
            if (i11 == 0) {
                return objArr;
            }
            if (objArr == null || objArr.length == 0) {
                if (i11 == objArr2.length) {
                    return objArr2;
                }
                Object[] objArr3 = new Object[i11];
                System.arraycopy(objArr2, 0, objArr3, 0, i11);
                return objArr3;
            }
            int length = objArr.length;
            Object[] objArr4 = new Object[length + i11];
            System.arraycopy(objArr, 0, objArr4, 0, length);
            System.arraycopy(objArr2, 0, objArr4, length, i11);
            return objArr4;
        }

        public final boolean has(int i11) {
            Object obj;
            Object[] objArr = this.valueArray;
            return objArr == null || (obj = objArr[(i11 - 1) * 2]) == null || obj != Scriptable.NOT_FOUND;
        }

        public final void initValue(int i11, String str, Object obj, int i12) {
            if (1 > i11 || i11 > this.maxId) {
                throw new IllegalArgumentException();
            }
            if (str == null) {
                throw new IllegalArgumentException();
            }
            if (obj == Scriptable.NOT_FOUND) {
                throw new IllegalArgumentException();
            }
            ScriptableObject.checkValidAttributes(i12);
            if (this.obj.findPrototypeId(str) != i11) {
                throw new IllegalArgumentException(str);
            }
            if (i11 != this.constructorId) {
                initSlot(i11, str, obj, i12);
            } else {
                if (!(obj instanceof IdFunctionObject)) {
                    throw new IllegalArgumentException("consructor should be initialized with IdFunctionObject");
                }
                this.constructor = (IdFunctionObject) obj;
                this.constructorAttrs = (short) i12;
            }
        }

        public final void set(int i11, Scriptable scriptable, Object obj) {
            if (obj == Scriptable.NOT_FOUND) {
                throw new IllegalArgumentException();
            }
            ensureId(i11);
            int i12 = i11 - 1;
            if ((this.attributeArray[i12] & 1) == 0) {
                if (scriptable != this.obj) {
                    scriptable.put((String) this.valueArray[(i12 * 2) + 1], scriptable, obj);
                    return;
                }
                if (obj == null) {
                    obj = UniqueTag.NULL_VALUE;
                }
                int i13 = i12 * 2;
                synchronized (this) {
                    this.valueArray[i13] = obj;
                }
            }
        }

        public final void setAttributes(int i11, int i12) {
            ScriptableObject.checkValidAttributes(i12);
            ensureId(i11);
            synchronized (this) {
                this.attributeArray[i11 - 1] = (short) i12;
            }
        }
    }

    public IdScriptableObject() {
    }

    private ScriptableObject getBuiltInDescriptor(String str) {
        int findId;
        Scriptable parentScope = getParentScope();
        if (parentScope == null) {
            parentScope = this;
        }
        int findInstanceIdInfo = findInstanceIdInfo(str);
        if (findInstanceIdInfo != 0) {
            return ScriptableObject.buildDataDescriptor(parentScope, getInstanceIdValue(65535 & findInstanceIdInfo), findInstanceIdInfo >>> 16);
        }
        PrototypeValues prototypeValues = this.prototypeValues;
        if (prototypeValues == null || (findId = prototypeValues.findId(str)) == 0) {
            return null;
        }
        return ScriptableObject.buildDataDescriptor(parentScope, this.prototypeValues.get(findId), this.prototypeValues.getAttributes(findId));
    }

    public static EcmaError incompatibleCallError(IdFunctionObject idFunctionObject) {
        throw ScriptRuntime.typeError1("msg.incompat.call", idFunctionObject.getFunctionName());
    }

    public static int instanceIdInfo(int i11, int i12) {
        return (i11 << 16) | i12;
    }

    private IdFunctionObject newIdFunction(Object obj, int i11, String str, int i12, Scriptable scriptable) {
        IdFunctionObject idFunctionObject = new IdFunctionObject(this, obj, i11, str, i12, scriptable);
        if (isSealed()) {
            idFunctionObject.sealObject();
        }
        return idFunctionObject;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        if (readInt != 0) {
            activatePrototypeMap(readInt);
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        PrototypeValues prototypeValues = this.prototypeValues;
        objectOutputStream.writeInt(prototypeValues != null ? prototypeValues.getMaxId() : 0);
    }

    public final void activatePrototypeMap(int i11) {
        PrototypeValues prototypeValues = new PrototypeValues(this, i11);
        synchronized (this) {
            try {
                if (this.prototypeValues != null) {
                    throw new IllegalStateException();
                }
                this.prototypeValues = prototypeValues;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void addIdFunctionProperty(Scriptable scriptable, Object obj, int i11, String str, int i12) {
        newIdFunction(obj, i11, str, i12, ScriptableObject.getTopLevelScope(scriptable)).addAsProperty(scriptable);
    }

    public final Object defaultGet(String str) {
        return super.get(str, this);
    }

    public final void defaultPut(String str, Object obj) {
        super.put(str, this, obj);
    }

    @Override // org.mozilla.javascript.ScriptableObject
    public void defineOwnProperty(Context context, Object obj, ScriptableObject scriptableObject) {
        int findId;
        if (obj instanceof String) {
            String str = (String) obj;
            int findInstanceIdInfo = findInstanceIdInfo(str);
            if (findInstanceIdInfo != 0) {
                int i11 = 65535 & findInstanceIdInfo;
                if (!isAccessorDescriptor(scriptableObject)) {
                    checkPropertyDefinition(scriptableObject);
                    checkPropertyChange(str, getOwnPropertyDescriptor(context, obj), scriptableObject);
                    int i12 = findInstanceIdInfo >>> 16;
                    Object property = ScriptableObject.getProperty(scriptableObject, "value");
                    if (property != Scriptable.NOT_FOUND && (i12 & 1) == 0 && !sameValue(property, getInstanceIdValue(i11))) {
                        setInstanceIdValue(i11, property);
                    }
                    setAttributes(str, applyDescriptorToAttributeBitset(i12, scriptableObject));
                    return;
                }
                delete(i11);
            }
            PrototypeValues prototypeValues = this.prototypeValues;
            if (prototypeValues != null && (findId = prototypeValues.findId(str)) != 0) {
                if (!isAccessorDescriptor(scriptableObject)) {
                    checkPropertyDefinition(scriptableObject);
                    checkPropertyChange(str, getOwnPropertyDescriptor(context, obj), scriptableObject);
                    int attributes = this.prototypeValues.getAttributes(findId);
                    Object property2 = ScriptableObject.getProperty(scriptableObject, "value");
                    if (property2 != Scriptable.NOT_FOUND && (attributes & 1) == 0 && !sameValue(property2, this.prototypeValues.get(findId))) {
                        this.prototypeValues.set(findId, this, property2);
                    }
                    this.prototypeValues.setAttributes(findId, applyDescriptorToAttributeBitset(attributes, scriptableObject));
                    return;
                }
                this.prototypeValues.delete(findId);
            }
        }
        super.defineOwnProperty(context, obj, scriptableObject);
    }

    @Override // org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.Scriptable
    public void delete(String str) {
        int findId;
        int findInstanceIdInfo = findInstanceIdInfo(str);
        if (findInstanceIdInfo != 0 && !isSealed()) {
            if (((findInstanceIdInfo >>> 16) & 4) == 0) {
                setInstanceIdValue(65535 & findInstanceIdInfo, Scriptable.NOT_FOUND);
                return;
            }
            return;
        }
        PrototypeValues prototypeValues = this.prototypeValues;
        if (prototypeValues == null || (findId = prototypeValues.findId(str)) == 0) {
            super.delete(str);
        } else {
            if (isSealed()) {
                return;
            }
            this.prototypeValues.delete(findId);
        }
    }

    public Object execIdCall(IdFunctionObject idFunctionObject, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        throw idFunctionObject.unknown();
    }

    public final IdFunctionObject exportAsJSClass(int i11, Scriptable scriptable, boolean z11) {
        if (scriptable != this && scriptable != null) {
            setParentScope(scriptable);
            setPrototype(ScriptableObject.getObjectPrototype(scriptable));
        }
        activatePrototypeMap(i11);
        IdFunctionObject createPrecachedConstructor = this.prototypeValues.createPrecachedConstructor();
        if (z11) {
            sealObject();
        }
        fillConstructorProperties(createPrecachedConstructor);
        if (z11) {
            createPrecachedConstructor.sealObject();
        }
        createPrecachedConstructor.exportAsScopeProperty();
        return createPrecachedConstructor;
    }

    public int findInstanceIdInfo(String str) {
        return 0;
    }

    public int findPrototypeId(String str) {
        throw new IllegalStateException(str);
    }

    @Override // org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.Scriptable
    public Object get(String str, Scriptable scriptable) {
        int findId;
        Object obj;
        Object instanceIdValue;
        Object obj2 = super.get(str, scriptable);
        Object obj3 = Scriptable.NOT_FOUND;
        if (obj2 != obj3) {
            return obj2;
        }
        int findInstanceIdInfo = findInstanceIdInfo(str);
        if (findInstanceIdInfo != 0 && (instanceIdValue = getInstanceIdValue(findInstanceIdInfo & 65535)) != obj3) {
            return instanceIdValue;
        }
        PrototypeValues prototypeValues = this.prototypeValues;
        return (prototypeValues == null || (findId = prototypeValues.findId(str)) == 0 || (obj = this.prototypeValues.get(findId)) == obj3) ? obj3 : obj;
    }

    @Override // org.mozilla.javascript.ScriptableObject
    public int getAttributes(String str) {
        int findId;
        int findInstanceIdInfo = findInstanceIdInfo(str);
        if (findInstanceIdInfo != 0) {
            return findInstanceIdInfo >>> 16;
        }
        PrototypeValues prototypeValues = this.prototypeValues;
        return (prototypeValues == null || (findId = prototypeValues.findId(str)) == 0) ? super.getAttributes(str) : this.prototypeValues.getAttributes(findId);
    }

    @Override // org.mozilla.javascript.ScriptableObject
    public Object[] getIds(boolean z11) {
        Object[] ids = super.getIds(z11);
        PrototypeValues prototypeValues = this.prototypeValues;
        if (prototypeValues != null) {
            ids = prototypeValues.getNames(z11, ids);
        }
        int maxInstanceId = getMaxInstanceId();
        if (maxInstanceId != 0) {
            Object[] objArr = null;
            int i11 = 0;
            while (maxInstanceId != 0) {
                String instanceIdName = getInstanceIdName(maxInstanceId);
                int findInstanceIdInfo = findInstanceIdInfo(instanceIdName);
                if (findInstanceIdInfo != 0) {
                    int i12 = findInstanceIdInfo >>> 16;
                    if (((i12 & 4) != 0 || Scriptable.NOT_FOUND != getInstanceIdValue(maxInstanceId)) && (z11 || (i12 & 2) == 0)) {
                        if (i11 == 0) {
                            objArr = new Object[maxInstanceId];
                        }
                        objArr[i11] = instanceIdName;
                        i11++;
                    }
                }
                maxInstanceId--;
            }
            if (i11 != 0) {
                if (ids.length == 0 && objArr.length == i11) {
                    return objArr;
                }
                Object[] objArr2 = new Object[ids.length + i11];
                System.arraycopy(ids, 0, objArr2, 0, ids.length);
                System.arraycopy(objArr, 0, objArr2, ids.length, i11);
                return objArr2;
            }
        }
        return ids;
    }

    public String getInstanceIdName(int i11) {
        throw new IllegalArgumentException(String.valueOf(i11));
    }

    public Object getInstanceIdValue(int i11) {
        throw new IllegalStateException(String.valueOf(i11));
    }

    public int getMaxInstanceId() {
        return 0;
    }

    @Override // org.mozilla.javascript.ScriptableObject
    public ScriptableObject getOwnPropertyDescriptor(Context context, Object obj) {
        ScriptableObject ownPropertyDescriptor = super.getOwnPropertyDescriptor(context, obj);
        return (ownPropertyDescriptor == null && (obj instanceof String)) ? getBuiltInDescriptor((String) obj) : ownPropertyDescriptor;
    }

    @Override // org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.Scriptable
    public boolean has(String str, Scriptable scriptable) {
        int findId;
        int findInstanceIdInfo = findInstanceIdInfo(str);
        if (findInstanceIdInfo == 0) {
            PrototypeValues prototypeValues = this.prototypeValues;
            return (prototypeValues == null || (findId = prototypeValues.findId(str)) == 0) ? super.has(str, scriptable) : this.prototypeValues.has(findId);
        }
        if (((findInstanceIdInfo >>> 16) & 4) != 0) {
            return true;
        }
        return Scriptable.NOT_FOUND != getInstanceIdValue(65535 & findInstanceIdInfo);
    }

    public final boolean hasPrototypeMap() {
        return this.prototypeValues != null;
    }

    public final void initPrototypeConstructor(IdFunctionObject idFunctionObject) {
        int i11 = this.prototypeValues.constructorId;
        if (i11 == 0) {
            throw new IllegalStateException();
        }
        if (idFunctionObject.methodId() != i11) {
            throw new IllegalArgumentException();
        }
        if (isSealed()) {
            idFunctionObject.sealObject();
        }
        this.prototypeValues.initValue(i11, "constructor", idFunctionObject, 2);
    }

    public void initPrototypeId(int i11) {
        throw new IllegalStateException(String.valueOf(i11));
    }

    public final void initPrototypeMethod(Object obj, int i11, String str, int i12) {
        this.prototypeValues.initValue(i11, str, newIdFunction(obj, i11, str, i12, ScriptableObject.getTopLevelScope(this)), 2);
    }

    public final void initPrototypeValue(int i11, String str, Object obj, int i12) {
        this.prototypeValues.initValue(i11, str, obj, i12);
    }

    @Override // org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.Scriptable
    public void put(String str, Scriptable scriptable, Object obj) {
        int findId;
        int findInstanceIdInfo = findInstanceIdInfo(str);
        if (findInstanceIdInfo != 0) {
            if (scriptable == this && isSealed()) {
                throw Context.reportRuntimeError1("msg.modify.sealed", str);
            }
            if (((findInstanceIdInfo >>> 16) & 1) == 0) {
                if (scriptable == this) {
                    setInstanceIdValue(65535 & findInstanceIdInfo, obj);
                    return;
                } else {
                    scriptable.put(str, scriptable, obj);
                    return;
                }
            }
            return;
        }
        PrototypeValues prototypeValues = this.prototypeValues;
        if (prototypeValues == null || (findId = prototypeValues.findId(str)) == 0) {
            super.put(str, scriptable, obj);
        } else {
            if (scriptable == this && isSealed()) {
                throw Context.reportRuntimeError1("msg.modify.sealed", str);
            }
            this.prototypeValues.set(findId, scriptable, obj);
        }
    }

    @Override // org.mozilla.javascript.ScriptableObject
    public void setAttributes(String str, int i11) {
        int findId;
        ScriptableObject.checkValidAttributes(i11);
        int findInstanceIdInfo = findInstanceIdInfo(str);
        if (findInstanceIdInfo != 0) {
            int i12 = 65535 & findInstanceIdInfo;
            if (i11 != (findInstanceIdInfo >>> 16)) {
                setInstanceIdAttributes(i12, i11);
                return;
            }
            return;
        }
        PrototypeValues prototypeValues = this.prototypeValues;
        if (prototypeValues == null || (findId = prototypeValues.findId(str)) == 0) {
            super.setAttributes(str, i11);
        } else {
            this.prototypeValues.setAttributes(findId, i11);
        }
    }

    public void setInstanceIdAttributes(int i11, int i12) {
        throw ScriptRuntime.constructError("InternalError", "Changing attributes not supported for " + getClassName() + " " + getInstanceIdName(i11) + " property");
    }

    public void setInstanceIdValue(int i11, Object obj) {
        throw new IllegalStateException(String.valueOf(i11));
    }

    public IdScriptableObject(Scriptable scriptable, Scriptable scriptable2) {
        super(scriptable, scriptable2);
    }

    public void fillConstructorProperties(IdFunctionObject idFunctionObject) {
    }
}

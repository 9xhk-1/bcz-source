package org.mozilla.javascript;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import ct.d;
import io.ktor.util.date.b;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import org.mozilla.javascript.TopLevel;
import org.mozilla.javascript.annotations.JSFunction;
import org.mozilla.javascript.annotations.JSGetter;
import org.mozilla.javascript.annotations.JSSetter;
import org.mozilla.javascript.annotations.JSStaticFunction;
import org.mozilla.javascript.debug.DebuggableObject;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public abstract class ScriptableObject implements Scriptable, Serializable, DebuggableObject, ConstProperties {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final int CONST = 13;
    public static final int DONTENUM = 2;
    public static final int EMPTY = 0;
    private static final int INITIAL_SLOT_SIZE = 4;
    public static final int PERMANENT = 4;
    public static final int READONLY = 1;
    private static final int SLOT_CONVERT_ACCESSOR_TO_DATA = 5;
    private static final int SLOT_MODIFY = 2;
    private static final int SLOT_MODIFY_CONST = 3;
    private static final int SLOT_MODIFY_GETTER_SETTER = 4;
    private static final int SLOT_QUERY = 1;
    public static final int UNINITIALIZED_CONST = 8;
    static final long serialVersionUID = 2829861078851942586L;
    private volatile Map<Object, Object> associatedValues;
    private int count;
    private transient Slot firstAdded;
    private boolean isExtensible = true;
    private transient Slot lastAdded;
    private Scriptable parentScopeObject;
    private Scriptable prototypeObject;
    private transient Slot[] slots;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class GetterSlot extends Slot {
        static final long serialVersionUID = -4900574849788797588L;
        Object getter;
        Object setter;

        public GetterSlot(String str, int i11, int i12) {
            super(str, i11, i12);
        }

        @Override // org.mozilla.javascript.ScriptableObject.Slot
        public ScriptableObject getPropertyDescriptor(Context context, Scriptable scriptable) {
            int attributes = getAttributes();
            NativeObject nativeObject = new NativeObject();
            ScriptRuntime.setBuiltinProtoAndParent(nativeObject, scriptable, TopLevel.Builtins.Object);
            nativeObject.defineProperty("enumerable", Boolean.valueOf((attributes & 2) == 0), 0);
            nativeObject.defineProperty("configurable", Boolean.valueOf((attributes & 4) == 0), 0);
            Object obj = this.getter;
            if (obj != null) {
                nativeObject.defineProperty(d.f46852f, obj, 0);
            }
            Object obj2 = this.setter;
            if (obj2 != null) {
                nativeObject.defineProperty(d.f46854h, obj2, 0);
            }
            return nativeObject;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // org.mozilla.javascript.ScriptableObject.Slot
        public Object getValue(Scriptable scriptable) {
            Object[] objArr;
            Object obj = this.getter;
            if (obj != null) {
                if (obj instanceof MemberBox) {
                    MemberBox memberBox = (MemberBox) obj;
                    Object obj2 = memberBox.delegateTo;
                    if (obj2 == 0) {
                        objArr = ScriptRuntime.emptyArgs;
                    } else {
                        Object[] objArr2 = {scriptable};
                        scriptable = obj2;
                        objArr = objArr2;
                    }
                    return memberBox.invoke(scriptable, objArr);
                }
                if (obj instanceof Function) {
                    Function function = (Function) obj;
                    return function.call(Context.getContext(), function.getParentScope(), scriptable, ScriptRuntime.emptyArgs);
                }
            }
            Object obj3 = this.value;
            if (!(obj3 instanceof LazilyLoadedCtor)) {
                return obj3;
            }
            LazilyLoadedCtor lazilyLoadedCtor = (LazilyLoadedCtor) obj3;
            try {
                lazilyLoadedCtor.init();
                return lazilyLoadedCtor.getValue();
            } finally {
                this.value = lazilyLoadedCtor.getValue();
            }
        }

        @Override // org.mozilla.javascript.ScriptableObject.Slot
        public void markDeleted() {
            super.markDeleted();
            this.getter = null;
            this.setter = null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // org.mozilla.javascript.ScriptableObject.Slot
        public boolean setValue(Object obj, Scriptable scriptable, Scriptable scriptable2) {
            Object[] objArr;
            if (this.setter == null) {
                if (this.getter == null) {
                    return super.setValue(obj, scriptable, scriptable2);
                }
                if (Context.getContext().hasFeature(11)) {
                    throw ScriptRuntime.typeError1("msg.set.prop.no.setter", this.name);
                }
                return true;
            }
            Context context = Context.getContext();
            Object obj2 = this.setter;
            if (obj2 instanceof MemberBox) {
                MemberBox memberBox = (MemberBox) obj2;
                Class<?>[] clsArr = memberBox.argTypes;
                Object convertArg = FunctionObject.convertArg(context, scriptable2, obj, FunctionObject.getTypeTag(clsArr[clsArr.length - 1]));
                Object obj3 = memberBox.delegateTo;
                if (obj3 == 0) {
                    objArr = new Object[]{convertArg};
                } else {
                    Object[] objArr2 = {scriptable2, convertArg};
                    scriptable2 = obj3;
                    objArr = objArr2;
                }
                memberBox.invoke(scriptable2, objArr);
            } else if (obj2 instanceof Function) {
                Function function = (Function) obj2;
                function.call(context, function.getParentScope(), scriptable2, new Object[]{obj});
            }
            return true;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class RelinkedSlot extends Slot {
        final Slot slot;

        public RelinkedSlot(Slot slot) {
            super(slot.name, slot.indexOrHash, slot.attributes);
            this.slot = ScriptableObject.unwrapSlot(slot);
        }

        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.writeObject(this.slot);
        }

        @Override // org.mozilla.javascript.ScriptableObject.Slot
        public int getAttributes() {
            return this.slot.getAttributes();
        }

        @Override // org.mozilla.javascript.ScriptableObject.Slot
        public ScriptableObject getPropertyDescriptor(Context context, Scriptable scriptable) {
            return this.slot.getPropertyDescriptor(context, scriptable);
        }

        @Override // org.mozilla.javascript.ScriptableObject.Slot
        public Object getValue(Scriptable scriptable) {
            return this.slot.getValue(scriptable);
        }

        @Override // org.mozilla.javascript.ScriptableObject.Slot
        public void markDeleted() {
            super.markDeleted();
            this.slot.markDeleted();
        }

        @Override // org.mozilla.javascript.ScriptableObject.Slot
        public void setAttributes(int i11) {
            this.slot.setAttributes(i11);
        }

        @Override // org.mozilla.javascript.ScriptableObject.Slot
        public boolean setValue(Object obj, Scriptable scriptable, Scriptable scriptable2) {
            return this.slot.setValue(obj, scriptable, scriptable2);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class Slot implements Serializable {
        private static final long serialVersionUID = -6090581677123995491L;
        private volatile short attributes;
        int indexOrHash;
        String name;
        transient Slot next;
        volatile transient Slot orderedNext;
        volatile Object value;
        volatile transient boolean wasDeleted;

        public Slot(String str, int i11, int i12) {
            this.name = str;
            this.indexOrHash = i11;
            this.attributes = (short) i12;
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
            objectInputStream.defaultReadObject();
            String str = this.name;
            if (str != null) {
                this.indexOrHash = str.hashCode();
            }
        }

        public int getAttributes() {
            return this.attributes;
        }

        public ScriptableObject getPropertyDescriptor(Context context, Scriptable scriptable) {
            return ScriptableObject.buildDataDescriptor(scriptable, this.value, this.attributes);
        }

        public Object getValue(Scriptable scriptable) {
            return this.value;
        }

        public void markDeleted() {
            this.wasDeleted = true;
            this.value = null;
            this.name = null;
        }

        public synchronized void setAttributes(int i11) {
            ScriptableObject.checkValidAttributes(i11);
            this.attributes = (short) i11;
        }

        public boolean setValue(Object obj, Scriptable scriptable, Scriptable scriptable2) {
            if ((this.attributes & 1) != 0) {
                return true;
            }
            if (scriptable != scriptable2) {
                return false;
            }
            this.value = obj;
            return true;
        }
    }

    public ScriptableObject() {
    }

    private static void addKnownAbsentSlot(Slot[] slotArr, Slot slot, int i11) {
        Slot slot2 = slotArr[i11];
        if (slot2 == null) {
            slotArr[i11] = slot;
            return;
        }
        Slot slot3 = slot2.next;
        while (true) {
            Slot slot4 = slot2;
            slot2 = slot3;
            if (slot2 == null) {
                slot4.next = slot;
                return;
            }
            slot3 = slot2.next;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:178:0x0201, code lost:
    
        if (r1 == null) goto L103;
     */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x02ac A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:170:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x013f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <T extends org.mozilla.javascript.Scriptable> org.mozilla.javascript.BaseFunction buildClassCtor(org.mozilla.javascript.Scriptable r25, java.lang.Class<T> r26, boolean r27, boolean r28) throws java.lang.IllegalAccessException, java.lang.InstantiationException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 741
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mozilla.javascript.ScriptableObject.buildClassCtor(org.mozilla.javascript.Scriptable, java.lang.Class, boolean, boolean):org.mozilla.javascript.BaseFunction");
    }

    public static ScriptableObject buildDataDescriptor(Scriptable scriptable, Object obj, int i11) {
        NativeObject nativeObject = new NativeObject();
        ScriptRuntime.setBuiltinProtoAndParent(nativeObject, scriptable, TopLevel.Builtins.Object);
        nativeObject.defineProperty("value", obj, 0);
        nativeObject.defineProperty("writable", Boolean.valueOf((i11 & 1) == 0), 0);
        nativeObject.defineProperty("enumerable", Boolean.valueOf((i11 & 2) == 0), 0);
        nativeObject.defineProperty("configurable", Boolean.valueOf((i11 & 4) == 0), 0);
        return nativeObject;
    }

    public static Object callMethod(Scriptable scriptable, String str, Object[] objArr) {
        return callMethod(null, scriptable, str, objArr);
    }

    private void checkNotSealed(String str, int i11) {
        if (isSealed()) {
            if (str == null) {
                str = Integer.toString(i11);
            }
            throw Context.reportRuntimeError1("msg.modify.sealed", str);
        }
    }

    public static void checkValidAttributes(int i11) {
        if ((i11 & (-16)) != 0) {
            throw new IllegalArgumentException(String.valueOf(i11));
        }
    }

    private static void copyTable(Slot[] slotArr, Slot[] slotArr2, int i11) {
        if (i11 == 0) {
            throw Kit.codeBug();
        }
        int length = slotArr2.length;
        int length2 = slotArr.length;
        while (true) {
            length2--;
            Slot slot = slotArr[length2];
            while (slot != null) {
                addKnownAbsentSlot(slotArr2, slot.next == null ? slot : new RelinkedSlot(slot), getSlotIndex(length, slot.indexOrHash));
                slot = slot.next;
                i11--;
                if (i11 == 0) {
                    return;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0039, code lost:
    
        r6 = unwrapSlot(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x003d, code lost:
    
        if (r11 != 4) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0041, code lost:
    
        if ((r6 instanceof org.mozilla.javascript.ScriptableObject.GetterSlot) != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0043, code lost:
    
        r11 = new org.mozilla.javascript.ScriptableObject.GetterSlot(r9, r10, r6.getAttributes());
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x005d, code lost:
    
        r11.value = r6.value;
        r11.next = r4.next;
        r9 = r8.lastAdded;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0067, code lost:
    
        if (r9 == null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0069, code lost:
    
        r9.orderedNext = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x006d, code lost:
    
        if (r8.firstAdded != null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x006f, code lost:
    
        r8.firstAdded = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0071, code lost:
    
        r8.lastAdded = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0073, code lost:
    
        if (r5 != r4) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0075, code lost:
    
        r0[r1] = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x007a, code lost:
    
        r4.markDeleted();
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x007e, code lost:
    
        return r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0078, code lost:
    
        r5.next = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x004e, code lost:
    
        if (r11 != 5) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0052, code lost:
    
        if ((r6 instanceof org.mozilla.javascript.ScriptableObject.GetterSlot) == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0054, code lost:
    
        r11 = new org.mozilla.javascript.ScriptableObject.Slot(r9, r10, r6.getAttributes());
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x007f, code lost:
    
        if (r11 != 3) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0082, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0085, code lost:
    
        return r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private synchronized org.mozilla.javascript.ScriptableObject.Slot createSlot(java.lang.String r9, int r10, int r11) {
        /*
            Method dump skipped, instructions count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mozilla.javascript.ScriptableObject.createSlot(java.lang.String, int, int):org.mozilla.javascript.ScriptableObject$Slot");
    }

    public static <T extends Scriptable> void defineClass(Scriptable scriptable, Class<T> cls) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        defineClass(scriptable, cls, false, false);
    }

    public static void defineConstProperty(Scriptable scriptable, String str) {
        if (scriptable instanceof ConstProperties) {
            ((ConstProperties) scriptable).defineConst(str, scriptable);
        } else {
            defineProperty(scriptable, str, Undefined.instance, 13);
        }
    }

    public static boolean deleteProperty(Scriptable scriptable, String str) {
        Scriptable base = getBase(scriptable, str);
        if (base == null) {
            return true;
        }
        base.delete(str);
        return !base.has(str, scriptable);
    }

    public static Scriptable ensureScriptable(Object obj) {
        if (obj instanceof Scriptable) {
            return (Scriptable) obj;
        }
        throw ScriptRuntime.typeError1("msg.arg.not.object", ScriptRuntime.typeof(obj));
    }

    public static ScriptableObject ensureScriptableObject(Object obj) {
        if (obj instanceof ScriptableObject) {
            return (ScriptableObject) obj;
        }
        throw ScriptRuntime.typeError1("msg.arg.not.object", ScriptRuntime.typeof(obj));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <T extends Scriptable> Class<T> extendsScriptable(Class<?> cls) {
        if (ScriptRuntime.ScriptableClass.isAssignableFrom(cls)) {
            return cls;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static Member findAnnotatedMember(AccessibleObject[] accessibleObjectArr, Class<? extends Annotation> cls) {
        for (Method method : accessibleObjectArr) {
            if (method.isAnnotationPresent(cls)) {
                return method;
            }
        }
        return null;
    }

    private Slot findAttributeSlot(String str, int i11, int i12) {
        Slot slot = getSlot(str, i11, i12);
        if (slot != null) {
            return slot;
        }
        if (str == null) {
            str = Integer.toString(i11);
        }
        throw Context.reportRuntimeError1("msg.prop.not.found", str);
    }

    private static Method findSetterMethod(Method[] methodArr, String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(d.f46854h);
        sb2.append(Character.toUpperCase(str.charAt(0)));
        sb2.append(str.substring(1));
        String sb3 = sb2.toString();
        for (Method method : methodArr) {
            JSSetter jSSetter = (JSSetter) method.getAnnotation(JSSetter.class);
            if (jSSetter != null && (str.equals(jSSetter.value()) || ("".equals(jSSetter.value()) && sb3.equals(method.getName())))) {
                return method;
            }
        }
        String str3 = str2 + str;
        for (Method method2 : methodArr) {
            if (str3.equals(method2.getName())) {
                return method2;
            }
        }
        return null;
    }

    public static Scriptable getArrayPrototype(Scriptable scriptable) {
        return TopLevel.getBuiltinPrototype(getTopLevelScope(scriptable), TopLevel.Builtins.Array);
    }

    private static Scriptable getBase(Scriptable scriptable, String str) {
        while (!scriptable.has(str, scriptable)) {
            scriptable = scriptable.getPrototype();
            if (scriptable == null) {
                return scriptable;
            }
        }
        return scriptable;
    }

    public static Scriptable getClassPrototype(Scriptable scriptable, String str) {
        Object obj;
        Object property = getProperty(getTopLevelScope(scriptable), str);
        if (!(property instanceof BaseFunction)) {
            if (property instanceof Scriptable) {
                Scriptable scriptable2 = (Scriptable) property;
                obj = scriptable2.get("prototype", scriptable2);
            }
            return null;
        }
        obj = ((BaseFunction) property).getPrototypeProperty();
        if (obj instanceof Scriptable) {
            return (Scriptable) obj;
        }
        return null;
    }

    public static Scriptable getFunctionPrototype(Scriptable scriptable) {
        return TopLevel.getBuiltinPrototype(getTopLevelScope(scriptable), TopLevel.Builtins.Function);
    }

    public static Scriptable getObjectPrototype(Scriptable scriptable) {
        return TopLevel.getBuiltinPrototype(getTopLevelScope(scriptable), TopLevel.Builtins.Object);
    }

    public static Object getProperty(Scriptable scriptable, String str) {
        Object obj;
        Scriptable scriptable2 = scriptable;
        do {
            obj = scriptable2.get(str, scriptable);
            if (obj != Scriptable.NOT_FOUND) {
                break;
            }
            scriptable2 = scriptable2.getPrototype();
        } while (scriptable2 != null);
        return obj;
    }

    public static Object[] getPropertyIds(Scriptable scriptable) {
        if (scriptable == null) {
            return ScriptRuntime.emptyArgs;
        }
        Object[] ids = scriptable.getIds();
        ObjToIntMap objToIntMap = null;
        while (true) {
            scriptable = scriptable.getPrototype();
            if (scriptable == null) {
                break;
            }
            Object[] ids2 = scriptable.getIds();
            if (ids2.length != 0) {
                if (objToIntMap == null) {
                    if (ids.length == 0) {
                        ids = ids2;
                    } else {
                        objToIntMap = new ObjToIntMap(ids.length + ids2.length);
                        for (int i11 = 0; i11 != ids.length; i11++) {
                            objToIntMap.intern(ids[i11]);
                        }
                        ids = null;
                    }
                }
                for (int i12 = 0; i12 != ids2.length; i12++) {
                    objToIntMap.intern(ids2[i12]);
                }
            }
        }
        return objToIntMap != null ? objToIntMap.getKeys() : ids;
    }

    private static String getPropertyName(String str, String str2, Annotation annotation) {
        String value;
        if (str2 != null) {
            return str.substring(str2.length());
        }
        if (annotation instanceof JSGetter) {
            value = ((JSGetter) annotation).value();
            if ((value == null || value.length() == 0) && str.length() > 3 && str.startsWith(d.f46852f)) {
                value = str.substring(3);
                if (Character.isUpperCase(value.charAt(0))) {
                    if (value.length() == 1) {
                        value = value.toLowerCase();
                    } else if (!Character.isUpperCase(value.charAt(1))) {
                        value = Character.toLowerCase(value.charAt(0)) + value.substring(1);
                    }
                }
            }
        } else {
            value = annotation instanceof JSFunction ? ((JSFunction) annotation).value() : annotation instanceof JSStaticFunction ? ((JSStaticFunction) annotation).value() : null;
        }
        return (value == null || value.length() == 0) ? str : value;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x004f, code lost:
    
        if (r0 != null) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private org.mozilla.javascript.ScriptableObject.Slot getSlot(java.lang.String r5, int r6, int r7) {
        /*
            r4 = this;
            org.mozilla.javascript.ScriptableObject$Slot[] r0 = r4.slots
            r1 = 1
            if (r0 != 0) goto L9
            if (r7 != r1) goto L9
            r5 = 0
            return r5
        L9:
            if (r5 == 0) goto Lf
            int r6 = r5.hashCode()
        Lf:
            if (r0 == 0) goto L52
            int r2 = r0.length
            int r2 = getSlotIndex(r2, r6)
            r0 = r0[r2]
        L18:
            if (r0 == 0) goto L2e
            java.lang.String r2 = r0.name
            int r3 = r0.indexOrHash
            if (r6 != r3) goto L2b
            if (r2 == r5) goto L2e
            if (r5 == 0) goto L2b
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L2b
            goto L2e
        L2b:
            org.mozilla.javascript.ScriptableObject$Slot r0 = r0.next
            goto L18
        L2e:
            if (r7 == r1) goto L51
            r1 = 2
            if (r7 == r1) goto L4f
            r1 = 3
            if (r7 == r1) goto L4f
            r1 = 4
            if (r7 == r1) goto L46
            r1 = 5
            if (r7 == r1) goto L3d
            goto L52
        L3d:
            org.mozilla.javascript.ScriptableObject$Slot r0 = unwrapSlot(r0)
            boolean r1 = r0 instanceof org.mozilla.javascript.ScriptableObject.GetterSlot
            if (r1 != 0) goto L52
            return r0
        L46:
            org.mozilla.javascript.ScriptableObject$Slot r0 = unwrapSlot(r0)
            boolean r1 = r0 instanceof org.mozilla.javascript.ScriptableObject.GetterSlot
            if (r1 == 0) goto L52
            return r0
        L4f:
            if (r0 == 0) goto L52
        L51:
            return r0
        L52:
            org.mozilla.javascript.ScriptableObject$Slot r5 = r4.createSlot(r5, r6, r7)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mozilla.javascript.ScriptableObject.getSlot(java.lang.String, int, int):org.mozilla.javascript.ScriptableObject$Slot");
    }

    private static int getSlotIndex(int i11, int i12) {
        return (i11 - 1) & i12;
    }

    public static Scriptable getTopLevelScope(Scriptable scriptable) {
        while (true) {
            Scriptable parentScope = scriptable.getParentScope();
            if (parentScope == null) {
                return scriptable;
            }
            scriptable = parentScope;
        }
    }

    public static Object getTopScopeValue(Scriptable scriptable, Object obj) {
        Object associatedValue;
        Scriptable topLevelScope = getTopLevelScope(scriptable);
        do {
            if ((topLevelScope instanceof ScriptableObject) && (associatedValue = ((ScriptableObject) topLevelScope).getAssociatedValue(obj)) != null) {
                return associatedValue;
            }
            topLevelScope = topLevelScope.getPrototype();
        } while (topLevelScope != null);
        return null;
    }

    public static <T> T getTypedProperty(Scriptable scriptable, int i11, Class<T> cls) {
        Object property = getProperty(scriptable, i11);
        if (property == Scriptable.NOT_FOUND) {
            property = null;
        }
        return cls.cast(Context.jsToJava(property, cls));
    }

    public static boolean hasProperty(Scriptable scriptable, String str) {
        return getBase(scriptable, str) != null;
    }

    public static boolean isFalse(Object obj) {
        return !isTrue(obj);
    }

    public static boolean isTrue(Object obj) {
        return obj != Scriptable.NOT_FOUND && ScriptRuntime.toBoolean(obj);
    }

    private boolean putConstImpl(String str, int i11, Scriptable scriptable, Object obj, int i12) {
        Slot slot;
        if (this != scriptable) {
            slot = getSlot(str, i11, 1);
            if (slot == null) {
                return false;
            }
        } else {
            if (isExtensible()) {
                checkNotSealed(str, i11);
                Slot unwrapSlot = unwrapSlot(getSlot(str, i11, 3));
                int attributes = unwrapSlot.getAttributes();
                if ((attributes & 1) == 0) {
                    throw Context.reportRuntimeError1("msg.var.redecl", str);
                }
                if ((attributes & 8) != 0) {
                    unwrapSlot.value = obj;
                    if (i12 != 8) {
                        unwrapSlot.setAttributes(attributes & (-9));
                    }
                }
                return true;
            }
            slot = getSlot(str, i11, 1);
            if (slot == null) {
                return true;
            }
        }
        return slot.setValue(obj, this, scriptable);
    }

    public static void putConstProperty(Scriptable scriptable, String str, Object obj) {
        Scriptable base = getBase(scriptable, str);
        if (base == null) {
            base = scriptable;
        }
        if (base instanceof ConstProperties) {
            ((ConstProperties) base).putConst(str, scriptable, obj);
        }
    }

    private boolean putImpl(String str, int i11, Scriptable scriptable, Object obj) {
        Slot slot;
        if (this != scriptable) {
            slot = getSlot(str, i11, 1);
            if (slot == null) {
                return false;
            }
        } else if (this.isExtensible) {
            if (this.count < 0) {
                checkNotSealed(str, i11);
            }
            slot = getSlot(str, i11, 2);
        } else {
            slot = getSlot(str, i11, 1);
            if (slot == null) {
                return true;
            }
        }
        return slot.setValue(obj, this, scriptable);
    }

    public static void putProperty(Scriptable scriptable, String str, Object obj) {
        Scriptable base = getBase(scriptable, str);
        if (base == null) {
            base = scriptable;
        }
        base.put(str, scriptable, obj);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        if (readInt != 0) {
            if (((readInt - 1) & readInt) != 0) {
                if (readInt > 1073741824) {
                    throw new RuntimeException("Property table overflow");
                }
                int i11 = 4;
                while (i11 < readInt) {
                    i11 <<= 1;
                }
                readInt = i11;
            }
            this.slots = new Slot[readInt];
            int i12 = this.count;
            if (i12 < 0) {
                i12 = ~i12;
            }
            Slot slot = null;
            for (int i13 = 0; i13 != i12; i13++) {
                Slot slot2 = (Slot) objectInputStream.readObject();
                this.lastAdded = slot2;
                if (i13 == 0) {
                    this.firstAdded = slot2;
                } else {
                    slot.orderedNext = slot2;
                }
                addKnownAbsentSlot(this.slots, this.lastAdded, getSlotIndex(readInt, this.lastAdded.indexOrHash));
                slot = this.lastAdded;
            }
        }
    }

    public static void redefineProperty(Scriptable scriptable, String str, boolean z11) {
        Scriptable base = getBase(scriptable, str);
        if (base == null) {
            return;
        }
        if ((base instanceof ConstProperties) && ((ConstProperties) base).isConst(str)) {
            throw Context.reportRuntimeError1("msg.const.redecl", str);
        }
        if (z11) {
            throw Context.reportRuntimeError1("msg.var.redecl", str);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003a, code lost:
    
        if ((r2.getAttributes() & 4) != 0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003c, code lost:
    
        r6.count--;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0042, code lost:
    
        if (r3 != r2) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0044, code lost:
    
        r0[r1] = r2.next;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004d, code lost:
    
        r7 = unwrapSlot(r2);
        r8 = r6.firstAdded;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0053, code lost:
    
        if (r7 != r8) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0055, code lost:
    
        r6.firstAdded = r7.orderedNext;
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0068, code lost:
    
        if (r7 != r6.lastAdded) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006a, code lost:
    
        r6.lastAdded = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006c, code lost:
    
        r2.markDeleted();
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x005d, code lost:
    
        if (r8.orderedNext == r7) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x005f, code lost:
    
        r8 = r8.orderedNext;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0062, code lost:
    
        r8.orderedNext = r7.orderedNext;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0049, code lost:
    
        r3.next = r2.next;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private synchronized void removeSlot(java.lang.String r7, int r8) {
        /*
            r6 = this;
            monitor-enter(r6)
            if (r7 == 0) goto Lb
            int r8 = r7.hashCode()     // Catch: java.lang.Throwable -> L8
            goto Lb
        L8:
            r7 = move-exception
            goto L71
        Lb:
            org.mozilla.javascript.ScriptableObject$Slot[] r0 = r6.slots     // Catch: java.lang.Throwable -> L8
            int r1 = r6.count     // Catch: java.lang.Throwable -> L8
            if (r1 == 0) goto L6f
            int r1 = r0.length     // Catch: java.lang.Throwable -> L8
            int r1 = getSlotIndex(r1, r8)     // Catch: java.lang.Throwable -> L8
            r2 = r0[r1]     // Catch: java.lang.Throwable -> L8
            r3 = r2
        L19:
            if (r2 == 0) goto L32
            int r4 = r2.indexOrHash     // Catch: java.lang.Throwable -> L8
            if (r4 != r8) goto L2c
            java.lang.String r4 = r2.name     // Catch: java.lang.Throwable -> L8
            if (r4 == r7) goto L32
            if (r7 == 0) goto L2c
            boolean r4 = r7.equals(r4)     // Catch: java.lang.Throwable -> L8
            if (r4 == 0) goto L2c
            goto L32
        L2c:
            org.mozilla.javascript.ScriptableObject$Slot r3 = r2.next     // Catch: java.lang.Throwable -> L8
            r5 = r3
            r3 = r2
            r2 = r5
            goto L19
        L32:
            if (r2 == 0) goto L6f
            int r7 = r2.getAttributes()     // Catch: java.lang.Throwable -> L8
            r7 = r7 & 4
            if (r7 != 0) goto L6f
            int r7 = r6.count     // Catch: java.lang.Throwable -> L8
            int r7 = r7 + (-1)
            r6.count = r7     // Catch: java.lang.Throwable -> L8
            if (r3 != r2) goto L49
            org.mozilla.javascript.ScriptableObject$Slot r7 = r2.next     // Catch: java.lang.Throwable -> L8
            r0[r1] = r7     // Catch: java.lang.Throwable -> L8
            goto L4d
        L49:
            org.mozilla.javascript.ScriptableObject$Slot r7 = r2.next     // Catch: java.lang.Throwable -> L8
            r3.next = r7     // Catch: java.lang.Throwable -> L8
        L4d:
            org.mozilla.javascript.ScriptableObject$Slot r7 = unwrapSlot(r2)     // Catch: java.lang.Throwable -> L8
            org.mozilla.javascript.ScriptableObject$Slot r8 = r6.firstAdded     // Catch: java.lang.Throwable -> L8
            if (r7 != r8) goto L5b
            org.mozilla.javascript.ScriptableObject$Slot r8 = r7.orderedNext     // Catch: java.lang.Throwable -> L8
            r6.firstAdded = r8     // Catch: java.lang.Throwable -> L8
            r8 = 0
            goto L66
        L5b:
            org.mozilla.javascript.ScriptableObject$Slot r0 = r8.orderedNext     // Catch: java.lang.Throwable -> L8
            if (r0 == r7) goto L62
            org.mozilla.javascript.ScriptableObject$Slot r8 = r8.orderedNext     // Catch: java.lang.Throwable -> L8
            goto L5b
        L62:
            org.mozilla.javascript.ScriptableObject$Slot r0 = r7.orderedNext     // Catch: java.lang.Throwable -> L8
            r8.orderedNext = r0     // Catch: java.lang.Throwable -> L8
        L66:
            org.mozilla.javascript.ScriptableObject$Slot r0 = r6.lastAdded     // Catch: java.lang.Throwable -> L8
            if (r7 != r0) goto L6c
            r6.lastAdded = r8     // Catch: java.lang.Throwable -> L8
        L6c:
            r2.markDeleted()     // Catch: java.lang.Throwable -> L8
        L6f:
            monitor-exit(r6)
            return
        L71:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L8
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mozilla.javascript.ScriptableObject.removeSlot(java.lang.String, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Slot unwrapSlot(Slot slot) {
        return slot instanceof RelinkedSlot ? ((RelinkedSlot) slot).slot : slot;
    }

    private synchronized void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        try {
            objectOutputStream.defaultWriteObject();
            int i11 = this.count;
            if (i11 < 0) {
                i11 = ~i11;
            }
            if (i11 == 0) {
                objectOutputStream.writeInt(0);
            } else {
                objectOutputStream.writeInt(this.slots.length);
                Slot slot = this.firstAdded;
                while (slot != null && slot.wasDeleted) {
                    slot = slot.orderedNext;
                }
                this.firstAdded = slot;
                while (slot != null) {
                    objectOutputStream.writeObject(slot);
                    Slot slot2 = slot.orderedNext;
                    while (slot2 != null && slot2.wasDeleted) {
                        slot2 = slot2.orderedNext;
                    }
                    slot.orderedNext = slot2;
                    slot = slot2;
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public void addLazilyInitializedValue(String str, int i11, LazilyLoadedCtor lazilyLoadedCtor, int i12) {
        if (str != null && i11 != 0) {
            throw new IllegalArgumentException(str);
        }
        checkNotSealed(str, i11);
        GetterSlot getterSlot = (GetterSlot) getSlot(str, i11, 4);
        getterSlot.setAttributes(i12);
        getterSlot.getter = null;
        getterSlot.setter = null;
        getterSlot.value = lazilyLoadedCtor;
    }

    public int applyDescriptorToAttributeBitset(int i11, ScriptableObject scriptableObject) {
        Object property = getProperty(scriptableObject, "enumerable");
        Object obj = Scriptable.NOT_FOUND;
        if (property != obj) {
            i11 = ScriptRuntime.toBoolean(property) ? i11 & (-3) : i11 | 2;
        }
        Object property2 = getProperty(scriptableObject, "writable");
        if (property2 != obj) {
            i11 = ScriptRuntime.toBoolean(property2) ? i11 & (-2) : i11 | 1;
        }
        Object property3 = getProperty(scriptableObject, "configurable");
        return property3 != obj ? ScriptRuntime.toBoolean(property3) ? i11 & (-5) : i11 | 4 : i11;
    }

    public final synchronized Object associateValue(Object obj, Object obj2) {
        Map map;
        try {
            if (obj2 == null) {
                throw new IllegalArgumentException();
            }
            map = this.associatedValues;
            if (map == null) {
                map = new HashMap();
                this.associatedValues = map;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return Kit.initHash(map, obj, obj2);
    }

    public boolean avoidObjectDetection() {
        return false;
    }

    public void checkPropertyChange(String str, ScriptableObject scriptableObject, ScriptableObject scriptableObject2) {
        if (scriptableObject == null) {
            if (!isExtensible()) {
                throw ScriptRuntime.typeError0("msg.not.extensible");
            }
            return;
        }
        if (isFalse(scriptableObject.get("configurable", scriptableObject))) {
            if (isTrue(getProperty(scriptableObject2, "configurable"))) {
                throw ScriptRuntime.typeError1("msg.change.configurable.false.to.true", str);
            }
            if (isTrue(scriptableObject.get("enumerable", scriptableObject)) != isTrue(getProperty(scriptableObject2, "enumerable"))) {
                throw ScriptRuntime.typeError1("msg.change.enumerable.with.configurable.false", str);
            }
            boolean isDataDescriptor = isDataDescriptor(scriptableObject2);
            boolean isAccessorDescriptor = isAccessorDescriptor(scriptableObject2);
            if (isDataDescriptor || isAccessorDescriptor) {
                if (isDataDescriptor && isDataDescriptor(scriptableObject)) {
                    if (isFalse(scriptableObject.get("writable", scriptableObject))) {
                        if (isTrue(getProperty(scriptableObject2, "writable"))) {
                            throw ScriptRuntime.typeError1("msg.change.writable.false.to.true.with.configurable.false", str);
                        }
                        if (!sameValue(getProperty(scriptableObject2, "value"), scriptableObject.get("value", scriptableObject))) {
                            throw ScriptRuntime.typeError1("msg.change.value.with.writable.false", str);
                        }
                        return;
                    }
                    return;
                }
                if (!isAccessorDescriptor || !isAccessorDescriptor(scriptableObject)) {
                    if (!isDataDescriptor(scriptableObject)) {
                        throw ScriptRuntime.typeError1("msg.change.property.accessor.to.data.with.configurable.false", str);
                    }
                    throw ScriptRuntime.typeError1("msg.change.property.data.to.accessor.with.configurable.false", str);
                }
                if (!sameValue(getProperty(scriptableObject2, d.f46854h), scriptableObject.get(d.f46854h, scriptableObject))) {
                    throw ScriptRuntime.typeError1("msg.change.setter.with.configurable.false", str);
                }
                if (!sameValue(getProperty(scriptableObject2, d.f46852f), scriptableObject.get(d.f46852f, scriptableObject))) {
                    throw ScriptRuntime.typeError1("msg.change.getter.with.configurable.false", str);
                }
            }
        }
    }

    public void checkPropertyDefinition(ScriptableObject scriptableObject) {
        Object property = getProperty(scriptableObject, d.f46852f);
        Object obj = Scriptable.NOT_FOUND;
        if (property != obj && property != Undefined.instance && !(property instanceof Callable)) {
            throw ScriptRuntime.notFunctionError(property);
        }
        Object property2 = getProperty(scriptableObject, d.f46854h);
        if (property2 != obj && property2 != Undefined.instance && !(property2 instanceof Callable)) {
            throw ScriptRuntime.notFunctionError(property2);
        }
        if (isDataDescriptor(scriptableObject) && isAccessorDescriptor(scriptableObject)) {
            throw ScriptRuntime.typeError0("msg.both.data.and.accessor.desc");
        }
    }

    @Override // org.mozilla.javascript.ConstProperties
    public void defineConst(String str, Scriptable scriptable) {
        if (putConstImpl(str, 0, scriptable, Undefined.instance, 8)) {
            return;
        }
        if (scriptable == this) {
            throw Kit.codeBug();
        }
        if (scriptable instanceof ConstProperties) {
            ((ConstProperties) scriptable).defineConst(str, scriptable);
        }
    }

    public void defineFunctionProperties(String[] strArr, Class<?> cls, int i11) {
        Method[] methodList = FunctionObject.getMethodList(cls);
        for (String str : strArr) {
            Method findSingleMethod = FunctionObject.findSingleMethod(methodList, str);
            if (findSingleMethod == null) {
                throw Context.reportRuntimeError2("msg.method.not.found", str, cls.getName());
            }
            defineProperty(str, new FunctionObject(str, findSingleMethod, this), i11);
        }
    }

    public void defineOwnProperties(Context context, ScriptableObject scriptableObject) {
        Object[] ids = scriptableObject.getIds();
        for (Object obj : ids) {
            checkPropertyDefinition(ensureScriptableObject(scriptableObject.get(obj)));
        }
        for (Object obj2 : ids) {
            defineOwnProperty(context, obj2, (ScriptableObject) scriptableObject.get(obj2));
        }
    }

    public void defineOwnProperty(Context context, Object obj, ScriptableObject scriptableObject) {
        checkPropertyDefinition(scriptableObject);
        defineOwnProperty(context, obj, scriptableObject, true);
    }

    public void defineProperty(String str, Object obj, int i11) {
        checkNotSealed(str, 0);
        put(str, this, obj);
        setAttributes(str, i11);
    }

    @Override // org.mozilla.javascript.Scriptable
    public void delete(String str) {
        checkNotSealed(str, 0);
        removeSlot(str, 0);
    }

    public Object equivalentValues(Object obj) {
        return this == obj ? Boolean.TRUE : Scriptable.NOT_FOUND;
    }

    @Override // org.mozilla.javascript.Scriptable
    public Object get(String str, Scriptable scriptable) {
        Slot slot = getSlot(str, 0, 1);
        return slot == null ? Scriptable.NOT_FOUND : slot.getValue(scriptable);
    }

    public Object[] getAllIds() {
        return getIds(true);
    }

    public final Object getAssociatedValue(Object obj) {
        Map<Object, Object> map = this.associatedValues;
        if (map == null) {
            return null;
        }
        return map.get(obj);
    }

    public final int getAttributes(String str, Scriptable scriptable) {
        return getAttributes(str);
    }

    @Override // org.mozilla.javascript.Scriptable
    public abstract String getClassName();

    @Override // org.mozilla.javascript.Scriptable
    public Object getDefaultValue(Class<?> cls) {
        return getDefaultValue(this, cls);
    }

    public Object getGetterOrSetter(String str, int i11, boolean z11) {
        if (str != null && i11 != 0) {
            throw new IllegalArgumentException(str);
        }
        Slot unwrapSlot = unwrapSlot(getSlot(str, i11, 1));
        if (unwrapSlot == null) {
            return null;
        }
        if (!(unwrapSlot instanceof GetterSlot)) {
            return Undefined.instance;
        }
        GetterSlot getterSlot = (GetterSlot) unwrapSlot;
        Object obj = z11 ? getterSlot.setter : getterSlot.getter;
        return obj != null ? obj : Undefined.instance;
    }

    @Override // org.mozilla.javascript.Scriptable
    public Object[] getIds() {
        return getIds(false);
    }

    public ScriptableObject getOwnPropertyDescriptor(Context context, Object obj) {
        Slot slot = getSlot(context, obj, 1);
        if (slot == null) {
            return null;
        }
        Scriptable parentScope = getParentScope();
        if (parentScope == null) {
            parentScope = this;
        }
        return slot.getPropertyDescriptor(context, parentScope);
    }

    @Override // org.mozilla.javascript.Scriptable
    public Scriptable getParentScope() {
        return this.parentScopeObject;
    }

    @Override // org.mozilla.javascript.Scriptable
    public Scriptable getPrototype() {
        return this.prototypeObject;
    }

    public String getTypeOf() {
        return avoidObjectDetection() ? "undefined" : "object";
    }

    @Override // org.mozilla.javascript.Scriptable
    public boolean has(String str, Scriptable scriptable) {
        return getSlot(str, 0, 1) != null;
    }

    @Override // org.mozilla.javascript.Scriptable
    public boolean hasInstance(Scriptable scriptable) {
        return ScriptRuntime.jsDelegatesTo(scriptable, this);
    }

    public boolean isAccessorDescriptor(ScriptableObject scriptableObject) {
        return hasProperty(scriptableObject, d.f46852f) || hasProperty(scriptableObject, d.f46854h);
    }

    @Override // org.mozilla.javascript.ConstProperties
    public boolean isConst(String str) {
        Slot slot = getSlot(str, 0, 1);
        return slot != null && (slot.getAttributes() & 5) == 5;
    }

    public boolean isDataDescriptor(ScriptableObject scriptableObject) {
        return hasProperty(scriptableObject, "value") || hasProperty(scriptableObject, "writable");
    }

    public boolean isEmpty() {
        int i11 = this.count;
        return i11 == 0 || i11 == -1;
    }

    public boolean isExtensible() {
        return this.isExtensible;
    }

    public boolean isGenericDescriptor(ScriptableObject scriptableObject) {
        return (isDataDescriptor(scriptableObject) || isAccessorDescriptor(scriptableObject)) ? false : true;
    }

    public boolean isGetterOrSetter(String str, int i11, boolean z11) {
        Slot unwrapSlot = unwrapSlot(getSlot(str, i11, 1));
        if (!(unwrapSlot instanceof GetterSlot)) {
            return false;
        }
        if (!z11 || ((GetterSlot) unwrapSlot).setter == null) {
            return (z11 || ((GetterSlot) unwrapSlot).getter == null) ? false : true;
        }
        return true;
    }

    public final boolean isSealed() {
        return this.count < 0;
    }

    public void preventExtensions() {
        this.isExtensible = false;
    }

    @Override // org.mozilla.javascript.Scriptable
    public void put(String str, Scriptable scriptable, Object obj) {
        if (putImpl(str, 0, scriptable, obj)) {
            return;
        }
        if (scriptable == this) {
            throw Kit.codeBug();
        }
        scriptable.put(str, scriptable, obj);
    }

    @Override // org.mozilla.javascript.ConstProperties
    public void putConst(String str, Scriptable scriptable, Object obj) {
        if (putConstImpl(str, 0, scriptable, obj, 1)) {
            return;
        }
        if (scriptable == this) {
            throw Kit.codeBug();
        }
        if (scriptable instanceof ConstProperties) {
            ((ConstProperties) scriptable).putConst(str, scriptable, obj);
        } else {
            scriptable.put(str, scriptable, obj);
        }
    }

    public boolean sameValue(Object obj, Object obj2) {
        Object obj3 = Scriptable.NOT_FOUND;
        if (obj == obj3) {
            return true;
        }
        if (obj2 == obj3) {
            obj2 = Undefined.instance;
        }
        if ((obj2 instanceof Number) && (obj instanceof Number)) {
            double doubleValue = ((Number) obj2).doubleValue();
            double doubleValue2 = ((Number) obj).doubleValue();
            if (Double.isNaN(doubleValue) && Double.isNaN(doubleValue2)) {
                return true;
            }
            if (doubleValue == 0.0d && Double.doubleToLongBits(doubleValue) != Double.doubleToLongBits(doubleValue2)) {
                return false;
            }
        }
        return ScriptRuntime.shallowEq(obj2, obj);
    }

    public synchronized void sealObject() {
        try {
            if (this.count >= 0) {
                for (Slot slot = this.firstAdded; slot != null; slot = slot.orderedNext) {
                    Object obj = slot.value;
                    if (obj instanceof LazilyLoadedCtor) {
                        LazilyLoadedCtor lazilyLoadedCtor = (LazilyLoadedCtor) obj;
                        try {
                            lazilyLoadedCtor.init();
                            slot.value = lazilyLoadedCtor.getValue();
                        } catch (Throwable th2) {
                            slot.value = lazilyLoadedCtor.getValue();
                            throw th2;
                        }
                    }
                }
                this.count = ~this.count;
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public final void setAttributes(String str, Scriptable scriptable, int i11) {
        setAttributes(str, i11);
    }

    public void setGetterOrSetter(String str, int i11, Callable callable, boolean z11) {
        setGetterOrSetter(str, i11, callable, z11, false);
    }

    @Override // org.mozilla.javascript.Scriptable
    public void setParentScope(Scriptable scriptable) {
        this.parentScopeObject = scriptable;
    }

    @Override // org.mozilla.javascript.Scriptable
    public void setPrototype(Scriptable scriptable) {
        this.prototypeObject = scriptable;
    }

    public int size() {
        int i11 = this.count;
        return i11 < 0 ? ~i11 : i11;
    }

    public static Object callMethod(Context context, Scriptable scriptable, String str, Object[] objArr) {
        Object property = getProperty(scriptable, str);
        if (!(property instanceof Function)) {
            throw ScriptRuntime.notFunctionError(scriptable, str);
        }
        Function function = (Function) property;
        Scriptable topLevelScope = getTopLevelScope(scriptable);
        return context != null ? function.call(context, topLevelScope, scriptable, objArr) : Context.call(null, function, topLevelScope, scriptable, objArr);
    }

    public static <T extends Scriptable> void defineClass(Scriptable scriptable, Class<T> cls, boolean z11) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        defineClass(scriptable, cls, z11, false);
    }

    public static Object getDefaultValue(Scriptable scriptable, Class<?> cls) {
        String str;
        Object[] objArr;
        String str2;
        Context context = null;
        int i11 = 0;
        while (true) {
            str = "undefined";
            if (i11 >= 2) {
                throw ScriptRuntime.typeError1("msg.default.value", cls != null ? cls.getName() : "undefined");
            }
            Class<?> cls2 = ScriptRuntime.StringClass;
            boolean z11 = true;
            if (cls != cls2 ? i11 != 1 : i11 != 0) {
                z11 = false;
            }
            if (z11) {
                objArr = ScriptRuntime.emptyArgs;
                str2 = "toString";
            } else {
                if (cls != null) {
                    if (cls == cls2) {
                        str = TypedValues.Custom.S_STRING;
                    } else if (cls == ScriptRuntime.ScriptableClass) {
                        str = "object";
                    } else if (cls == ScriptRuntime.FunctionClass) {
                        str = "function";
                    } else if (cls == ScriptRuntime.BooleanClass || cls == Boolean.TYPE) {
                        str = TypedValues.Custom.S_BOOLEAN;
                    } else {
                        if (cls != ScriptRuntime.NumberClass && cls != ScriptRuntime.ByteClass && cls != Byte.TYPE && cls != ScriptRuntime.ShortClass && cls != Short.TYPE && cls != ScriptRuntime.IntegerClass && cls != Integer.TYPE && cls != ScriptRuntime.FloatClass && cls != Float.TYPE && cls != ScriptRuntime.DoubleClass && cls != Double.TYPE) {
                            throw Context.reportRuntimeError1("msg.invalid.type", cls.toString());
                        }
                        str = "number";
                    }
                }
                objArr = new Object[]{str};
                str2 = "valueOf";
            }
            Object property = getProperty(scriptable, str2);
            if (property instanceof Function) {
                Function function = (Function) property;
                if (context == null) {
                    context = Context.getContext();
                }
                Object call = function.call(context, function.getParentScope(), scriptable, objArr);
                if (call != null) {
                    if (!(call instanceof Scriptable) || cls == ScriptRuntime.ScriptableClass || cls == ScriptRuntime.FunctionClass) {
                        break;
                    }
                    if (z11 && (call instanceof Wrapper)) {
                        call = ((Wrapper) call).unwrap();
                        if (call instanceof String) {
                            break;
                        }
                    }
                } else {
                    continue;
                }
            }
            i11++;
        }
    }

    public static boolean hasProperty(Scriptable scriptable, int i11) {
        return getBase(scriptable, i11) != null;
    }

    private void setGetterOrSetter(String str, int i11, Callable callable, boolean z11, boolean z12) {
        GetterSlot getterSlot;
        if (str != null && i11 != 0) {
            throw new IllegalArgumentException(str);
        }
        if (!z12) {
            checkNotSealed(str, i11);
        }
        if (isExtensible()) {
            getterSlot = (GetterSlot) getSlot(str, i11, 4);
        } else {
            Slot unwrapSlot = unwrapSlot(getSlot(str, i11, 1));
            if (!(unwrapSlot instanceof GetterSlot)) {
                return;
            } else {
                getterSlot = (GetterSlot) unwrapSlot;
            }
        }
        if (!z12 && (getterSlot.getAttributes() & 1) != 0) {
            throw Context.reportRuntimeError1("msg.modify.readonly", str);
        }
        if (z11) {
            getterSlot.setter = callable;
        } else {
            getterSlot.getter = callable;
        }
        getterSlot.value = Undefined.instance;
    }

    public final int getAttributes(int i11, Scriptable scriptable) {
        return getAttributes(i11);
    }

    public Object[] getIds(boolean z11) {
        Slot[] slotArr = this.slots;
        Object[] objArr = ScriptRuntime.emptyArgs;
        if (slotArr == null) {
            return objArr;
        }
        Slot slot = this.firstAdded;
        while (slot != null && slot.wasDeleted) {
            slot = slot.orderedNext;
        }
        int i11 = 0;
        while (slot != null) {
            if (z11 || (slot.getAttributes() & 2) == 0) {
                if (i11 == 0) {
                    objArr = new Object[slotArr.length];
                }
                int i12 = i11 + 1;
                Object obj = slot.name;
                if (obj == null) {
                    obj = Integer.valueOf(slot.indexOrHash);
                }
                objArr[i11] = obj;
                i11 = i12;
            }
            slot = slot.orderedNext;
            while (slot != null && slot.wasDeleted) {
                slot = slot.orderedNext;
            }
        }
        if (i11 == objArr.length) {
            return objArr;
        }
        Object[] objArr2 = new Object[i11];
        System.arraycopy(objArr, 0, objArr2, 0, i11);
        return objArr2;
    }

    @Override // org.mozilla.javascript.Scriptable
    public boolean has(int i11, Scriptable scriptable) {
        return getSlot((String) null, i11, 1) != null;
    }

    public void setAttributes(int i11, Scriptable scriptable, int i12) {
        setAttributes(i11, i12);
    }

    public ScriptableObject(Scriptable scriptable, Scriptable scriptable2) {
        if (scriptable != null) {
            this.parentScopeObject = scriptable;
            this.prototypeObject = scriptable2;
            return;
        }
        throw new IllegalArgumentException();
    }

    public static <T extends Scriptable> String defineClass(Scriptable scriptable, Class<T> cls, boolean z11, boolean z12) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        BaseFunction buildClassCtor = buildClassCtor(scriptable, cls, z11, z12);
        if (buildClassCtor == null) {
            return null;
        }
        String className = buildClassCtor.getClassPrototype().getClassName();
        defineProperty(scriptable, className, buildClassCtor, 2);
        return className;
    }

    private static Scriptable getBase(Scriptable scriptable, int i11) {
        while (!scriptable.has(i11, scriptable)) {
            scriptable = scriptable.getPrototype();
            if (scriptable == null) {
                return scriptable;
            }
        }
        return scriptable;
    }

    public static void putProperty(Scriptable scriptable, int i11, Object obj) {
        Scriptable base = getBase(scriptable, i11);
        if (base == null) {
            base = scriptable;
        }
        base.put(i11, scriptable, obj);
    }

    public void defineOwnProperty(Context context, Object obj, ScriptableObject scriptableObject, boolean z11) {
        int applyDescriptorToAttributeBitset;
        Slot slot = getSlot(context, obj, 1);
        boolean z12 = slot == null;
        if (z11) {
            checkPropertyChange(ScriptRuntime.toString(obj), slot == null ? null : slot.getPropertyDescriptor(context, this), scriptableObject);
        }
        boolean isAccessorDescriptor = isAccessorDescriptor(scriptableObject);
        if (slot == null) {
            slot = getSlot(context, obj, isAccessorDescriptor ? 4 : 2);
            applyDescriptorToAttributeBitset = applyDescriptorToAttributeBitset(7, scriptableObject);
        } else {
            applyDescriptorToAttributeBitset = applyDescriptorToAttributeBitset(slot.getAttributes(), scriptableObject);
        }
        Slot unwrapSlot = unwrapSlot(slot);
        if (isAccessorDescriptor) {
            if (!(unwrapSlot instanceof GetterSlot)) {
                unwrapSlot = getSlot(context, obj, 4);
            }
            GetterSlot getterSlot = (GetterSlot) unwrapSlot;
            Object property = getProperty(scriptableObject, d.f46852f);
            Object obj2 = Scriptable.NOT_FOUND;
            if (property != obj2) {
                getterSlot.getter = property;
            }
            Object property2 = getProperty(scriptableObject, d.f46854h);
            if (property2 != obj2) {
                getterSlot.setter = property2;
            }
            getterSlot.value = Undefined.instance;
            getterSlot.setAttributes(applyDescriptorToAttributeBitset);
            return;
        }
        if ((unwrapSlot instanceof GetterSlot) && isDataDescriptor(scriptableObject)) {
            unwrapSlot = getSlot(context, obj, 5);
        }
        Object property3 = getProperty(scriptableObject, "value");
        if (property3 != Scriptable.NOT_FOUND) {
            unwrapSlot.value = property3;
        } else if (z12) {
            unwrapSlot.value = Undefined.instance;
        }
        unwrapSlot.setAttributes(applyDescriptorToAttributeBitset);
    }

    @Override // org.mozilla.javascript.Scriptable
    public void delete(int i11) {
        checkNotSealed(null, i11);
        removeSlot(null, i11);
    }

    public int getAttributes(String str) {
        return findAttributeSlot(str, 0, 1).getAttributes();
    }

    public void setAttributes(String str, int i11) {
        checkNotSealed(str, 0);
        findAttributeSlot(str, 0, 2).setAttributes(i11);
    }

    public static void defineProperty(Scriptable scriptable, String str, Object obj, int i11) {
        if (!(scriptable instanceof ScriptableObject)) {
            scriptable.put(str, scriptable, obj);
        } else {
            ((ScriptableObject) scriptable).defineProperty(str, obj, i11);
        }
    }

    public static boolean deleteProperty(Scriptable scriptable, int i11) {
        Scriptable base = getBase(scriptable, i11);
        if (base == null) {
            return true;
        }
        base.delete(i11);
        return !base.has(i11, scriptable);
    }

    public static Object getProperty(Scriptable scriptable, int i11) {
        Object obj;
        Scriptable scriptable2 = scriptable;
        do {
            obj = scriptable2.get(i11, scriptable);
            if (obj != Scriptable.NOT_FOUND) {
                break;
            }
            scriptable2 = scriptable2.getPrototype();
        } while (scriptable2 != null);
        return obj;
    }

    public static <T> T getTypedProperty(Scriptable scriptable, String str, Class<T> cls) {
        Object property = getProperty(scriptable, str);
        if (property == Scriptable.NOT_FOUND) {
            property = null;
        }
        return cls.cast(Context.jsToJava(property, cls));
    }

    @Override // org.mozilla.javascript.Scriptable
    public Object get(int i11, Scriptable scriptable) {
        Slot slot = getSlot((String) null, i11, 1);
        if (slot == null) {
            return Scriptable.NOT_FOUND;
        }
        return slot.getValue(scriptable);
    }

    public int getAttributes(int i11) {
        return findAttributeSlot(null, i11, 1).getAttributes();
    }

    @Override // org.mozilla.javascript.Scriptable
    public void put(int i11, Scriptable scriptable, Object obj) {
        if (putImpl(null, i11, scriptable, obj)) {
            return;
        }
        if (scriptable != this) {
            scriptable.put(i11, scriptable, obj);
            return;
        }
        throw Kit.codeBug();
    }

    public void setAttributes(int i11, int i12) {
        checkNotSealed(null, i11);
        findAttributeSlot(null, i11, 2).setAttributes(i12);
    }

    public Object get(Object obj) {
        Object obj2;
        if (obj instanceof String) {
            obj2 = get((String) obj, this);
        } else {
            obj2 = obj instanceof Number ? get(((Number) obj).intValue(), this) : null;
        }
        if (obj2 == Scriptable.NOT_FOUND || obj2 == Undefined.instance) {
            return null;
        }
        return obj2 instanceof Wrapper ? ((Wrapper) obj2).unwrap() : obj2;
    }

    public void defineProperty(String str, Class<?> cls, int i11) {
        int length = str.length();
        if (length != 0) {
            char[] cArr = new char[length + 3];
            str.getChars(0, length, cArr, 3);
            cArr[3] = Character.toUpperCase(cArr[3]);
            cArr[0] = 'g';
            cArr[1] = 'e';
            cArr[2] = 't';
            String str2 = new String(cArr);
            cArr[0] = b.f61997c;
            String str3 = new String(cArr);
            Method[] methodList = FunctionObject.getMethodList(cls);
            Method findSingleMethod = FunctionObject.findSingleMethod(methodList, str2);
            Method findSingleMethod2 = FunctionObject.findSingleMethod(methodList, str3);
            if (findSingleMethod2 == null) {
                i11 |= 1;
            }
            int i12 = i11;
            if (findSingleMethod2 == null) {
                findSingleMethod2 = null;
            }
            defineProperty(str, null, findSingleMethod, findSingleMethod2, i12);
            return;
        }
        throw new IllegalArgumentException();
    }

    public Slot getSlot(Context context, Object obj, int i11) {
        String stringIdOrIndex = ScriptRuntime.toStringIdOrIndex(context, obj);
        if (stringIdOrIndex == null) {
            return getSlot((String) null, ScriptRuntime.lastIndexResult(context), i11);
        }
        return getSlot(stringIdOrIndex, 0, i11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void defineProperty(java.lang.String r10, java.lang.Object r11, java.lang.reflect.Method r12, java.lang.reflect.Method r13, int r14) {
        /*
            r9 = this;
            java.lang.Class r0 = java.lang.Void.TYPE
            r1 = 0
            r2 = 1
            r3 = 0
            if (r12 == 0) goto L4e
            org.mozilla.javascript.MemberBox r4 = new org.mozilla.javascript.MemberBox
            r4.<init>(r12)
            int r5 = r12.getModifiers()
            boolean r5 = java.lang.reflect.Modifier.isStatic(r5)
            if (r5 != 0) goto L1e
            if (r11 == 0) goto L1a
            r5 = r2
            goto L1b
        L1a:
            r5 = r1
        L1b:
            r4.delegateTo = r11
            goto L21
        L1e:
            r4.delegateTo = r0
            r5 = r2
        L21:
            java.lang.Class[] r6 = r12.getParameterTypes()
            int r7 = r6.length
            if (r7 != 0) goto L2f
            if (r5 == 0) goto L2d
            java.lang.String r5 = "msg.obj.getter.parms"
            goto L42
        L2d:
            r5 = r3
            goto L42
        L2f:
            int r7 = r6.length
            java.lang.String r8 = "msg.bad.getter.parms"
            if (r7 != r2) goto L41
            r6 = r6[r1]
            java.lang.Class<org.mozilla.javascript.Scriptable> r7 = org.mozilla.javascript.ScriptRuntime.ScriptableClass
            if (r6 == r7) goto L3f
            java.lang.Class<?> r7 = org.mozilla.javascript.ScriptRuntime.ScriptableObjectClass
            if (r6 == r7) goto L3f
            goto L41
        L3f:
            if (r5 != 0) goto L2d
        L41:
            r5 = r8
        L42:
            if (r5 != 0) goto L45
            goto L4f
        L45:
            java.lang.String r10 = r12.toString()
            org.mozilla.javascript.EvaluatorException r10 = org.mozilla.javascript.Context.reportRuntimeError1(r5, r10)
            throw r10
        L4e:
            r4 = r3
        L4f:
            if (r13 == 0) goto Lad
            java.lang.Class r12 = r13.getReturnType()
            if (r12 != r0) goto La2
            org.mozilla.javascript.MemberBox r12 = new org.mozilla.javascript.MemberBox
            r12.<init>(r13)
            int r5 = r13.getModifiers()
            boolean r5 = java.lang.reflect.Modifier.isStatic(r5)
            if (r5 != 0) goto L6e
            if (r11 == 0) goto L6a
            r0 = r2
            goto L6b
        L6a:
            r0 = r1
        L6b:
            r12.delegateTo = r11
            goto L71
        L6e:
            r12.delegateTo = r0
            r0 = r2
        L71:
            java.lang.Class[] r11 = r13.getParameterTypes()
            int r5 = r11.length
            if (r5 != r2) goto L7d
            if (r0 == 0) goto L95
            java.lang.String r3 = "msg.setter2.expected"
            goto L95
        L7d:
            int r2 = r11.length
            r5 = 2
            if (r2 != r5) goto L93
            r11 = r11[r1]
            java.lang.Class<org.mozilla.javascript.Scriptable> r2 = org.mozilla.javascript.ScriptRuntime.ScriptableClass
            if (r11 == r2) goto L8e
            java.lang.Class<?> r2 = org.mozilla.javascript.ScriptRuntime.ScriptableObjectClass
            if (r11 == r2) goto L8e
            java.lang.String r3 = "msg.setter2.parms"
            goto L95
        L8e:
            if (r0 != 0) goto L95
            java.lang.String r3 = "msg.setter1.parms"
            goto L95
        L93:
            java.lang.String r3 = "msg.setter.parms"
        L95:
            if (r3 != 0) goto L99
            r3 = r12
            goto Lad
        L99:
            java.lang.String r10 = r13.toString()
            org.mozilla.javascript.EvaluatorException r10 = org.mozilla.javascript.Context.reportRuntimeError1(r3, r10)
            throw r10
        La2:
            java.lang.String r10 = "msg.setter.return"
            java.lang.String r11 = r13.toString()
            org.mozilla.javascript.EvaluatorException r10 = org.mozilla.javascript.Context.reportRuntimeError1(r10, r11)
            throw r10
        Lad:
            r11 = 4
            org.mozilla.javascript.ScriptableObject$Slot r10 = r9.getSlot(r10, r1, r11)
            org.mozilla.javascript.ScriptableObject$GetterSlot r10 = (org.mozilla.javascript.ScriptableObject.GetterSlot) r10
            r10.setAttributes(r14)
            r10.getter = r4
            r10.setter = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mozilla.javascript.ScriptableObject.defineProperty(java.lang.String, java.lang.Object, java.lang.reflect.Method, java.lang.reflect.Method, int):void");
    }
}

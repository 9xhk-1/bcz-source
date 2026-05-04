package org.mozilla.javascript;

import com.huawei.hms.framework.common.ContainerUtils;
import java.util.AbstractCollection;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class NativeObject extends IdScriptableObject implements Map {
    private static final int ConstructorId_create = -9;
    private static final int ConstructorId_defineProperties = -8;
    private static final int ConstructorId_defineProperty = -5;
    private static final int ConstructorId_freeze = -13;
    private static final int ConstructorId_getOwnPropertyDescriptor = -4;
    private static final int ConstructorId_getOwnPropertyNames = -3;
    private static final int ConstructorId_getPrototypeOf = -1;
    private static final int ConstructorId_isExtensible = -6;
    private static final int ConstructorId_isFrozen = -11;
    private static final int ConstructorId_isSealed = -10;
    private static final int ConstructorId_keys = -2;
    private static final int ConstructorId_preventExtensions = -7;
    private static final int ConstructorId_seal = -12;
    private static final int Id___defineGetter__ = 9;
    private static final int Id___defineSetter__ = 10;
    private static final int Id___lookupGetter__ = 11;
    private static final int Id___lookupSetter__ = 12;
    private static final int Id_constructor = 1;
    private static final int Id_hasOwnProperty = 5;
    private static final int Id_isPrototypeOf = 7;
    private static final int Id_propertyIsEnumerable = 6;
    private static final int Id_toLocaleString = 3;
    private static final int Id_toSource = 8;
    private static final int Id_toString = 2;
    private static final int Id_valueOf = 4;
    private static final int MAX_PROTOTYPE_ID = 12;
    private static final Object OBJECT_TAG = "Object";
    static final long serialVersionUID = -6345305608474346996L;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class EntrySet extends AbstractSet<Map.Entry<Object, Object>> {
        public EntrySet() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<Object, Object>> iterator() {
            return new Iterator<Map.Entry<Object, Object>>() { // from class: org.mozilla.javascript.NativeObject.EntrySet.1
                Object[] ids;
                Object key = null;
                int index = 0;

                {
                    this.ids = NativeObject.this.getIds();
                }

                @Override // java.util.Iterator
                public boolean hasNext() {
                    return this.index < this.ids.length;
                }

                @Override // java.util.Iterator
                public void remove() {
                    Object obj = this.key;
                    if (obj == null) {
                        throw new IllegalStateException();
                    }
                    NativeObject.this.remove(obj);
                    this.key = null;
                }

                @Override // java.util.Iterator
                public Map.Entry<Object, Object> next() {
                    Object[] objArr = this.ids;
                    int i11 = this.index;
                    this.index = i11 + 1;
                    final Object obj = objArr[i11];
                    this.key = obj;
                    final Object obj2 = NativeObject.this.get(obj);
                    return new Map.Entry<Object, Object>() { // from class: org.mozilla.javascript.NativeObject.EntrySet.1.1
                        @Override // java.util.Map.Entry
                        public boolean equals(Object obj3) {
                            if (!(obj3 instanceof Map.Entry)) {
                                return false;
                            }
                            Map.Entry entry = (Map.Entry) obj3;
                            Object obj4 = obj;
                            if (obj4 != null ? obj4.equals(entry.getKey()) : entry.getKey() == null) {
                                Object obj5 = obj2;
                                Object value = entry.getValue();
                                if (obj5 == null) {
                                    if (value == null) {
                                        return true;
                                    }
                                } else if (obj5.equals(value)) {
                                    return true;
                                }
                            }
                            return false;
                        }

                        @Override // java.util.Map.Entry
                        public Object getKey() {
                            return obj;
                        }

                        @Override // java.util.Map.Entry
                        public Object getValue() {
                            return obj2;
                        }

                        @Override // java.util.Map.Entry
                        public int hashCode() {
                            Object obj3 = obj;
                            int hashCode = obj3 == null ? 0 : obj3.hashCode();
                            Object obj4 = obj2;
                            return hashCode ^ (obj4 != null ? obj4.hashCode() : 0);
                        }

                        @Override // java.util.Map.Entry
                        public Object setValue(Object obj3) {
                            throw new UnsupportedOperationException();
                        }

                        public String toString() {
                            return obj + ContainerUtils.KEY_VALUE_DELIMITER + obj2;
                        }
                    };
                }
            };
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return NativeObject.this.size();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class KeySet extends AbstractSet<Object> {
        public KeySet() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return NativeObject.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Object> iterator() {
            return new Iterator<Object>() { // from class: org.mozilla.javascript.NativeObject.KeySet.1
                Object[] ids;
                int index = 0;
                Object key;

                {
                    this.ids = NativeObject.this.getIds();
                }

                @Override // java.util.Iterator
                public boolean hasNext() {
                    return this.index < this.ids.length;
                }

                @Override // java.util.Iterator
                public Object next() {
                    try {
                        Object[] objArr = this.ids;
                        int i11 = this.index;
                        this.index = i11 + 1;
                        Object obj = objArr[i11];
                        this.key = obj;
                        return obj;
                    } catch (ArrayIndexOutOfBoundsException unused) {
                        this.key = null;
                        throw new NoSuchElementException();
                    }
                }

                @Override // java.util.Iterator
                public void remove() {
                    Object obj = this.key;
                    if (obj == null) {
                        throw new IllegalStateException();
                    }
                    NativeObject.this.remove(obj);
                    this.key = null;
                }
            };
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return NativeObject.this.size();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class ValueCollection extends AbstractCollection<Object> {
        public ValueCollection() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<Object> iterator() {
            return new Iterator<Object>() { // from class: org.mozilla.javascript.NativeObject.ValueCollection.1
                Object[] ids;
                int index = 0;
                Object key;

                {
                    this.ids = NativeObject.this.getIds();
                }

                @Override // java.util.Iterator
                public boolean hasNext() {
                    return this.index < this.ids.length;
                }

                @Override // java.util.Iterator
                public Object next() {
                    NativeObject nativeObject = NativeObject.this;
                    Object[] objArr = this.ids;
                    int i11 = this.index;
                    this.index = i11 + 1;
                    Object obj = objArr[i11];
                    this.key = obj;
                    return nativeObject.get(obj);
                }

                @Override // java.util.Iterator
                public void remove() {
                    Object obj = this.key;
                    if (obj == null) {
                        throw new IllegalStateException();
                    }
                    NativeObject.this.remove(obj);
                    this.key = null;
                }
            };
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return NativeObject.this.size();
        }
    }

    public static void init(Scriptable scriptable, boolean z11) {
        new NativeObject().exportAsJSClass(12, scriptable, z11);
    }

    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        if (obj instanceof String) {
            return has((String) obj, this);
        }
        if (obj instanceof Number) {
            return has(((Number) obj).intValue(), this);
        }
        return false;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        for (Object obj2 : values()) {
            if (obj == obj2) {
                return true;
            }
            if (obj != null && obj.equals(obj2)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map
    public Set<Map.Entry<Object, Object>> entrySet() {
        return new EntrySet();
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0061, code lost:
    
        return r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0103, code lost:
    
        if ((((org.mozilla.javascript.ScriptableObject) r12).getAttributes(r9) & 2) == 0) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x011b, code lost:
    
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x011c, code lost:
    
        r6 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0118, code lost:
    
        if ((((org.mozilla.javascript.ScriptableObject) r12).getAttributes(r9) & 2) == 0) goto L100;
     */
    @Override // org.mozilla.javascript.IdScriptableObject, org.mozilla.javascript.IdFunctionCall
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object execIdCall(org.mozilla.javascript.IdFunctionObject r9, org.mozilla.javascript.Context r10, org.mozilla.javascript.Scriptable r11, org.mozilla.javascript.Scriptable r12, java.lang.Object[] r13) {
        /*
            Method dump skipped, instructions count: 998
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mozilla.javascript.NativeObject.execIdCall(org.mozilla.javascript.IdFunctionObject, org.mozilla.javascript.Context, org.mozilla.javascript.Scriptable, org.mozilla.javascript.Scriptable, java.lang.Object[]):java.lang.Object");
    }

    @Override // org.mozilla.javascript.IdScriptableObject
    public void fillConstructorProperties(IdFunctionObject idFunctionObject) {
        Object obj = OBJECT_TAG;
        addIdFunctionProperty(idFunctionObject, obj, -1, "getPrototypeOf", 1);
        addIdFunctionProperty(idFunctionObject, obj, -2, "keys", 1);
        addIdFunctionProperty(idFunctionObject, obj, -3, "getOwnPropertyNames", 1);
        addIdFunctionProperty(idFunctionObject, obj, -4, "getOwnPropertyDescriptor", 2);
        addIdFunctionProperty(idFunctionObject, obj, -5, "defineProperty", 3);
        addIdFunctionProperty(idFunctionObject, obj, -6, "isExtensible", 1);
        addIdFunctionProperty(idFunctionObject, obj, -7, "preventExtensions", 1);
        addIdFunctionProperty(idFunctionObject, obj, -8, "defineProperties", 2);
        addIdFunctionProperty(idFunctionObject, obj, -9, "create", 2);
        addIdFunctionProperty(idFunctionObject, obj, -10, "isSealed", 1);
        addIdFunctionProperty(idFunctionObject, obj, -11, "isFrozen", 1);
        addIdFunctionProperty(idFunctionObject, obj, -12, "seal", 1);
        addIdFunctionProperty(idFunctionObject, obj, -13, "freeze", 1);
        super.fillConstructorProperties(idFunctionObject);
    }

    @Override // org.mozilla.javascript.IdScriptableObject
    public int findPrototypeId(String str) {
        String str2;
        int length = str.length();
        int i11 = 7;
        if (length == 7) {
            str2 = "valueOf";
            i11 = 4;
        } else if (length == 8) {
            char charAt = str.charAt(3);
            if (charAt == 'o') {
                str2 = "toSource";
                i11 = 8;
            } else {
                if (charAt == 't') {
                    str2 = "toString";
                    i11 = 2;
                }
                str2 = null;
                i11 = 0;
            }
        } else if (length == 11) {
            str2 = "constructor";
            i11 = 1;
        } else if (length == 16) {
            char charAt2 = str.charAt(2);
            if (charAt2 == 'd') {
                char charAt3 = str.charAt(8);
                if (charAt3 == 'G') {
                    str2 = "__defineGetter__";
                    i11 = 9;
                } else {
                    if (charAt3 == 'S') {
                        str2 = "__defineSetter__";
                        i11 = 10;
                    }
                    str2 = null;
                    i11 = 0;
                }
            } else {
                if (charAt2 == 'l') {
                    char charAt4 = str.charAt(8);
                    if (charAt4 == 'G') {
                        str2 = "__lookupGetter__";
                        i11 = 11;
                    } else if (charAt4 == 'S') {
                        str2 = "__lookupSetter__";
                        i11 = 12;
                    }
                }
                str2 = null;
                i11 = 0;
            }
        } else if (length == 20) {
            str2 = "propertyIsEnumerable";
            i11 = 6;
        } else if (length != 13) {
            if (length == 14) {
                char charAt5 = str.charAt(0);
                if (charAt5 == 'h') {
                    str2 = "hasOwnProperty";
                    i11 = 5;
                } else if (charAt5 == 't') {
                    str2 = "toLocaleString";
                    i11 = 3;
                }
            }
            str2 = null;
            i11 = 0;
        } else {
            str2 = "isPrototypeOf";
        }
        if (str2 == null || str2 == str || str2.equals(str)) {
            return i11;
        }
        return 0;
    }

    @Override // org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.Scriptable
    public String getClassName() {
        return "Object";
    }

    @Override // org.mozilla.javascript.IdScriptableObject
    public void initPrototypeId(int i11) {
        String str;
        String str2;
        int i12 = 1;
        switch (i11) {
            case 1:
                str = "constructor";
                initPrototypeMethod(OBJECT_TAG, i11, str, i12);
                return;
            case 2:
                str = "toString";
                i12 = 0;
                initPrototypeMethod(OBJECT_TAG, i11, str, i12);
                return;
            case 3:
                str = "toLocaleString";
                i12 = 0;
                initPrototypeMethod(OBJECT_TAG, i11, str, i12);
                return;
            case 4:
                str = "valueOf";
                i12 = 0;
                initPrototypeMethod(OBJECT_TAG, i11, str, i12);
                return;
            case 5:
                str = "hasOwnProperty";
                initPrototypeMethod(OBJECT_TAG, i11, str, i12);
                return;
            case 6:
                str = "propertyIsEnumerable";
                initPrototypeMethod(OBJECT_TAG, i11, str, i12);
                return;
            case 7:
                str = "isPrototypeOf";
                initPrototypeMethod(OBJECT_TAG, i11, str, i12);
                return;
            case 8:
                str = "toSource";
                i12 = 0;
                initPrototypeMethod(OBJECT_TAG, i11, str, i12);
                return;
            case 9:
                str2 = "__defineGetter__";
                i12 = 2;
                str = str2;
                initPrototypeMethod(OBJECT_TAG, i11, str, i12);
                return;
            case 10:
                str2 = "__defineSetter__";
                i12 = 2;
                str = str2;
                initPrototypeMethod(OBJECT_TAG, i11, str, i12);
                return;
            case 11:
                str = "__lookupGetter__";
                initPrototypeMethod(OBJECT_TAG, i11, str, i12);
                return;
            case 12:
                str = "__lookupSetter__";
                initPrototypeMethod(OBJECT_TAG, i11, str, i12);
                return;
            default:
                throw new IllegalArgumentException(String.valueOf(i11));
        }
    }

    @Override // java.util.Map
    public Set<Object> keySet() {
        return new KeySet();
    }

    @Override // java.util.Map
    public Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public Object remove(Object obj) {
        Object obj2 = get(obj);
        if (obj instanceof String) {
            delete((String) obj);
            return obj2;
        }
        if (obj instanceof Number) {
            delete(((Number) obj).intValue());
        }
        return obj2;
    }

    public String toString() {
        return ScriptRuntime.defaultObjectToString(this);
    }

    @Override // java.util.Map
    public Collection<Object> values() {
        return new ValueCollection();
    }
}

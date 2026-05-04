package org.mozilla.javascript;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class ObjToIntMap implements Serializable {
    private static final int A = -1640531527;
    private static final Object DELETED = new Object();
    private static final boolean check = false;
    static final long serialVersionUID = -1542220580748809402L;
    private int keyCount;
    private transient Object[] keys;
    private transient int occupiedCount;
    private int power;
    private transient int[] values;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class Iterator {
        private int cursor;
        private Object[] keys;
        ObjToIntMap master;
        private int remaining;
        private int[] values;

        public Iterator(ObjToIntMap objToIntMap) {
            this.master = objToIntMap;
        }

        public boolean done() {
            return this.remaining < 0;
        }

        public Object getKey() {
            Object obj = this.keys[this.cursor];
            if (obj == UniqueTag.NULL_VALUE) {
                return null;
            }
            return obj;
        }

        public int getValue() {
            return this.values[this.cursor];
        }

        public final void init(Object[] objArr, int[] iArr, int i11) {
            this.keys = objArr;
            this.values = iArr;
            this.cursor = -1;
            this.remaining = i11;
        }

        public void next() {
            if (this.remaining == -1) {
                Kit.codeBug();
            }
            if (this.remaining == 0) {
                this.remaining = -1;
                this.cursor = -1;
                return;
            }
            int i11 = this.cursor;
            while (true) {
                this.cursor = i11 + 1;
                Object obj = this.keys[this.cursor];
                if (obj != null && obj != ObjToIntMap.DELETED) {
                    this.remaining--;
                    return;
                }
                i11 = this.cursor;
            }
        }

        public void setValue(int i11) {
            this.values[this.cursor] = i11;
        }

        public void start() {
            this.master.initIterator(this);
            next();
        }
    }

    public ObjToIntMap() {
        this(4);
    }

    private int ensureIndex(Object obj) {
        int i11;
        int hashCode = obj.hashCode();
        Object[] objArr = this.keys;
        if (objArr != null) {
            int i12 = (-1640531527) * hashCode;
            int i13 = this.power;
            i11 = i12 >>> (32 - i13);
            Object obj2 = objArr[i11];
            if (obj2 != null) {
                int i14 = 1 << i13;
                if (obj2 != obj && (this.values[i14 + i11] != hashCode || !obj2.equals(obj))) {
                    r3 = obj2 == DELETED ? i11 : -1;
                    int i15 = i14 - 1;
                    int tableLookupStep = tableLookupStep(i12, i15, this.power);
                    while (true) {
                        i11 = (i11 + tableLookupStep) & i15;
                        Object obj3 = this.keys[i11];
                        if (obj3 != null) {
                            if (obj3 == obj || (this.values[i14 + i11] == hashCode && obj3.equals(obj))) {
                                break;
                            }
                            if (obj3 == DELETED && r3 < 0) {
                                r3 = i11;
                            }
                        } else {
                            break;
                        }
                    }
                }
                return i11;
            }
        } else {
            i11 = -1;
        }
        if (r3 < 0) {
            if (this.keys != null) {
                int i16 = this.occupiedCount;
                if (i16 * 4 < (1 << this.power) * 3) {
                    this.occupiedCount = i16 + 1;
                    r3 = i11;
                }
            }
            rehashTable();
            return insertNewKey(obj, hashCode);
        }
        this.keys[r3] = obj;
        this.values[(1 << this.power) + r3] = hashCode;
        this.keyCount++;
        return r3;
    }

    private int findIndex(Object obj) {
        if (this.keys == null) {
            return -1;
        }
        int hashCode = obj.hashCode();
        int i11 = (-1640531527) * hashCode;
        int i12 = this.power;
        int i13 = i11 >>> (32 - i12);
        Object obj2 = this.keys[i13];
        if (obj2 == null) {
            return -1;
        }
        int i14 = 1 << i12;
        if (obj2 != obj && (this.values[i14 + i13] != hashCode || !obj2.equals(obj))) {
            int i15 = i14 - 1;
            int tableLookupStep = tableLookupStep(i11, i15, this.power);
            while (true) {
                i13 = (i13 + tableLookupStep) & i15;
                Object obj3 = this.keys[i13];
                if (obj3 != null) {
                    if (obj3 == obj || (this.values[i14 + i13] == hashCode && obj3.equals(obj))) {
                        break;
                    }
                } else {
                    return -1;
                }
            }
        }
        return i13;
    }

    private int insertNewKey(Object obj, int i11) {
        int i12 = (-1640531527) * i11;
        int i13 = this.power;
        int i14 = i12 >>> (32 - i13);
        int i15 = 1 << i13;
        if (this.keys[i14] != null) {
            int i16 = i15 - 1;
            int tableLookupStep = tableLookupStep(i12, i16, i13);
            do {
                i14 = (i14 + tableLookupStep) & i16;
            } while (this.keys[i14] != null);
        }
        this.keys[i14] = obj;
        this.values[i15 + i14] = i11;
        this.occupiedCount++;
        this.keyCount++;
        return i14;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        int i11 = this.keyCount;
        if (i11 != 0) {
            this.keyCount = 0;
            int i12 = 1 << this.power;
            this.keys = new Object[i12];
            this.values = new int[i12 * 2];
            for (int i13 = 0; i13 != i11; i13++) {
                Object readObject = objectInputStream.readObject();
                this.values[insertNewKey(readObject, readObject.hashCode())] = objectInputStream.readInt();
            }
        }
    }

    private void rehashTable() {
        Object[] objArr = this.keys;
        if (objArr == null) {
            int i11 = 1 << this.power;
            this.keys = new Object[i11];
            this.values = new int[i11 * 2];
            return;
        }
        int i12 = this.keyCount;
        if (i12 * 2 >= this.occupiedCount) {
            this.power++;
        }
        int i13 = 1 << this.power;
        int[] iArr = this.values;
        int length = objArr.length;
        this.keys = new Object[i13];
        this.values = new int[i13 * 2];
        int i14 = 0;
        this.keyCount = 0;
        this.occupiedCount = 0;
        while (i12 != 0) {
            Object obj = objArr[i14];
            if (obj != null && obj != DELETED) {
                this.values[insertNewKey(obj, iArr[length + i14])] = iArr[i14];
                i12--;
            }
            i14++;
        }
    }

    private static int tableLookupStep(int i11, int i12, int i13) {
        int i14 = 32 - (i13 * 2);
        if (i14 >= 0) {
            i11 >>>= i14;
        } else {
            i12 >>>= -i14;
        }
        return (i11 & i12) | 1;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        int i11 = this.keyCount;
        int i12 = 0;
        while (i11 != 0) {
            Object obj = this.keys[i12];
            if (obj != null && obj != DELETED) {
                i11--;
                objectOutputStream.writeObject(obj);
                objectOutputStream.writeInt(this.values[i12]);
            }
            i12++;
        }
    }

    public void clear() {
        int length = this.keys.length;
        while (length != 0) {
            length--;
            this.keys[length] = null;
        }
        this.keyCount = 0;
        this.occupiedCount = 0;
    }

    public int get(Object obj, int i11) {
        if (obj == null) {
            obj = UniqueTag.NULL_VALUE;
        }
        int findIndex = findIndex(obj);
        return findIndex >= 0 ? this.values[findIndex] : i11;
    }

    public int getExisting(Object obj) {
        if (obj == null) {
            obj = UniqueTag.NULL_VALUE;
        }
        int findIndex = findIndex(obj);
        if (findIndex >= 0) {
            return this.values[findIndex];
        }
        Kit.codeBug();
        return 0;
    }

    public Object[] getKeys() {
        Object[] objArr = new Object[this.keyCount];
        getKeys(objArr, 0);
        return objArr;
    }

    public boolean has(Object obj) {
        if (obj == null) {
            obj = UniqueTag.NULL_VALUE;
        }
        return findIndex(obj) >= 0;
    }

    public final void initIterator(Iterator iterator) {
        iterator.init(this.keys, this.values, this.keyCount);
    }

    public Object intern(Object obj) {
        boolean z11;
        if (obj == null) {
            obj = UniqueTag.NULL_VALUE;
            z11 = true;
        } else {
            z11 = false;
        }
        int ensureIndex = ensureIndex(obj);
        this.values[ensureIndex] = 0;
        if (z11) {
            return null;
        }
        return this.keys[ensureIndex];
    }

    public boolean isEmpty() {
        return this.keyCount == 0;
    }

    public Iterator newIterator() {
        return new Iterator(this);
    }

    public void put(Object obj, int i11) {
        if (obj == null) {
            obj = UniqueTag.NULL_VALUE;
        }
        this.values[ensureIndex(obj)] = i11;
    }

    public void remove(Object obj) {
        if (obj == null) {
            obj = UniqueTag.NULL_VALUE;
        }
        int findIndex = findIndex(obj);
        if (findIndex >= 0) {
            this.keys[findIndex] = DELETED;
            this.keyCount--;
        }
    }

    public int size() {
        return this.keyCount;
    }

    public ObjToIntMap(int i11) {
        if (i11 < 0) {
            Kit.codeBug();
        }
        int i12 = 2;
        while ((1 << i12) < (i11 * 4) / 3) {
            i12++;
        }
        this.power = i12;
    }

    public void getKeys(Object[] objArr, int i11) {
        int i12 = this.keyCount;
        int i13 = 0;
        while (i12 != 0) {
            Object obj = this.keys[i13];
            if (obj != null && obj != DELETED) {
                if (obj == UniqueTag.NULL_VALUE) {
                    obj = null;
                }
                objArr[i11] = obj;
                i11++;
                i12--;
            }
            i13++;
        }
    }
}

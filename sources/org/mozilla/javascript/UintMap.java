package org.mozilla.javascript;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class UintMap implements Serializable {
    private static final int A = -1640531527;
    private static final int DELETED = -2;
    private static final int EMPTY = -1;
    private static final boolean check = false;
    static final long serialVersionUID = 4242698212885848444L;
    private transient int ivaluesShift;
    private int keyCount;
    private transient int[] keys;
    private transient int occupiedCount;
    private int power;
    private transient Object[] values;

    public UintMap() {
        this(4);
    }

    private int ensureIndex(int i11, boolean z11) {
        int i12;
        int i13;
        int[] iArr = this.keys;
        int i14 = -1;
        if (iArr != null) {
            int i15 = (-1640531527) * i11;
            int i16 = this.power;
            i12 = i15 >>> (32 - i16);
            int i17 = iArr[i12];
            if (i17 == i11) {
                return i12;
            }
            if (i17 != -1) {
                int i18 = i17 == -2 ? i12 : -1;
                int i19 = (1 << i16) - 1;
                int tableLookupStep = tableLookupStep(i15, i19, i16);
                do {
                    i12 = (i12 + tableLookupStep) & i19;
                    i13 = iArr[i12];
                    if (i13 == i11) {
                        return i12;
                    }
                    if (i13 == -2 && i18 < 0) {
                        i18 = i12;
                    }
                } while (i13 != -1);
                i14 = i18;
            }
        } else {
            i12 = -1;
        }
        if (i14 < 0) {
            if (iArr != null) {
                int i21 = this.occupiedCount;
                if (i21 * 4 < (1 << this.power) * 3) {
                    this.occupiedCount = i21 + 1;
                    i14 = i12;
                }
            }
            rehashTable(z11);
            return insertNewKey(i11);
        }
        iArr[i14] = i11;
        this.keyCount++;
        return i14;
    }

    private int findIndex(int i11) {
        int i12;
        int[] iArr = this.keys;
        if (iArr != null) {
            int i13 = (-1640531527) * i11;
            int i14 = this.power;
            int i15 = i13 >>> (32 - i14);
            int i16 = iArr[i15];
            if (i16 == i11) {
                return i15;
            }
            if (i16 != -1) {
                int i17 = (1 << i14) - 1;
                int tableLookupStep = tableLookupStep(i13, i17, i14);
                do {
                    i15 = (i15 + tableLookupStep) & i17;
                    i12 = iArr[i15];
                    if (i12 == i11) {
                        return i15;
                    }
                } while (i12 != -1);
            }
        }
        return -1;
    }

    private int insertNewKey(int i11) {
        int[] iArr = this.keys;
        int i12 = (-1640531527) * i11;
        int i13 = this.power;
        int i14 = i12 >>> (32 - i13);
        if (iArr[i14] != -1) {
            int i15 = (1 << i13) - 1;
            int tableLookupStep = tableLookupStep(i12, i15, i13);
            do {
                i14 = (i14 + tableLookupStep) & i15;
            } while (iArr[i14] != -1);
        }
        iArr[i14] = i11;
        this.occupiedCount++;
        this.keyCount++;
        return i14;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        int i11 = this.keyCount;
        if (i11 != 0) {
            this.keyCount = 0;
            boolean readBoolean = objectInputStream.readBoolean();
            boolean readBoolean2 = objectInputStream.readBoolean();
            int i12 = 1 << this.power;
            if (readBoolean) {
                this.keys = new int[i12 * 2];
                this.ivaluesShift = i12;
            } else {
                this.keys = new int[i12];
            }
            for (int i13 = 0; i13 != i12; i13++) {
                this.keys[i13] = -1;
            }
            if (readBoolean2) {
                this.values = new Object[i12];
            }
            for (int i14 = 0; i14 != i11; i14++) {
                int insertNewKey = insertNewKey(objectInputStream.readInt());
                if (readBoolean) {
                    this.keys[this.ivaluesShift + insertNewKey] = objectInputStream.readInt();
                }
                if (readBoolean2) {
                    this.values[insertNewKey] = objectInputStream.readObject();
                }
            }
        }
    }

    private void rehashTable(boolean z11) {
        int[] iArr = this.keys;
        if (iArr != null && this.keyCount * 2 >= this.occupiedCount) {
            this.power++;
        }
        int i11 = 1 << this.power;
        int i12 = this.ivaluesShift;
        if (i12 != 0 || z11) {
            this.ivaluesShift = i11;
            this.keys = new int[i11 * 2];
        } else {
            this.keys = new int[i11];
        }
        int i13 = 0;
        for (int i14 = 0; i14 != i11; i14++) {
            this.keys[i14] = -1;
        }
        Object[] objArr = this.values;
        if (objArr != null) {
            this.values = new Object[i11];
        }
        int i15 = this.keyCount;
        this.occupiedCount = 0;
        if (i15 != 0) {
            this.keyCount = 0;
            while (i15 != 0) {
                int i16 = iArr[i13];
                if (i16 != -1 && i16 != -2) {
                    int insertNewKey = insertNewKey(i16);
                    if (objArr != null) {
                        this.values[insertNewKey] = objArr[i13];
                    }
                    if (i12 != 0) {
                        this.keys[this.ivaluesShift + insertNewKey] = iArr[i12 + i13];
                    }
                    i15--;
                }
                i13++;
            }
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
        if (i11 != 0) {
            int i12 = 0;
            boolean z11 = this.ivaluesShift != 0;
            boolean z12 = this.values != null;
            objectOutputStream.writeBoolean(z11);
            objectOutputStream.writeBoolean(z12);
            while (i11 != 0) {
                int i13 = this.keys[i12];
                if (i13 != -1 && i13 != -2) {
                    i11--;
                    objectOutputStream.writeInt(i13);
                    if (z11) {
                        objectOutputStream.writeInt(this.keys[this.ivaluesShift + i12]);
                    }
                    if (z12) {
                        objectOutputStream.writeObject(this.values[i12]);
                    }
                }
                i12++;
            }
        }
    }

    public void clear() {
        int i11 = 1 << this.power;
        if (this.keys != null) {
            for (int i12 = 0; i12 != i11; i12++) {
                this.keys[i12] = -1;
            }
            if (this.values != null) {
                for (int i13 = 0; i13 != i11; i13++) {
                    this.values[i13] = null;
                }
            }
        }
        this.ivaluesShift = 0;
        this.keyCount = 0;
        this.occupiedCount = 0;
    }

    public int getExistingInt(int i11) {
        if (i11 < 0) {
            Kit.codeBug();
        }
        int findIndex = findIndex(i11);
        if (findIndex < 0) {
            Kit.codeBug();
            return 0;
        }
        int i12 = this.ivaluesShift;
        if (i12 != 0) {
            return this.keys[i12 + findIndex];
        }
        return 0;
    }

    public int getInt(int i11, int i12) {
        if (i11 < 0) {
            Kit.codeBug();
        }
        int findIndex = findIndex(i11);
        if (findIndex < 0) {
            return i12;
        }
        int i13 = this.ivaluesShift;
        if (i13 != 0) {
            return this.keys[i13 + findIndex];
        }
        return 0;
    }

    public int[] getKeys() {
        int[] iArr = this.keys;
        int i11 = this.keyCount;
        int[] iArr2 = new int[i11];
        int i12 = 0;
        while (i11 != 0) {
            int i13 = iArr[i12];
            if (i13 != -1 && i13 != -2) {
                i11--;
                iArr2[i11] = i13;
            }
            i12++;
        }
        return iArr2;
    }

    public Object getObject(int i11) {
        int findIndex;
        if (i11 < 0) {
            Kit.codeBug();
        }
        if (this.values == null || (findIndex = findIndex(i11)) < 0) {
            return null;
        }
        return this.values[findIndex];
    }

    public boolean has(int i11) {
        if (i11 < 0) {
            Kit.codeBug();
        }
        return findIndex(i11) >= 0;
    }

    public boolean isEmpty() {
        return this.keyCount == 0;
    }

    public void put(int i11, Object obj) {
        if (i11 < 0) {
            Kit.codeBug();
        }
        int ensureIndex = ensureIndex(i11, false);
        if (this.values == null) {
            this.values = new Object[1 << this.power];
        }
        this.values[ensureIndex] = obj;
    }

    public void remove(int i11) {
        if (i11 < 0) {
            Kit.codeBug();
        }
        int findIndex = findIndex(i11);
        if (findIndex >= 0) {
            int[] iArr = this.keys;
            iArr[findIndex] = -2;
            this.keyCount--;
            Object[] objArr = this.values;
            if (objArr != null) {
                objArr[findIndex] = null;
            }
            int i12 = this.ivaluesShift;
            if (i12 != 0) {
                iArr[i12 + findIndex] = 0;
            }
        }
    }

    public int size() {
        return this.keyCount;
    }

    public UintMap(int i11) {
        if (i11 < 0) {
            Kit.codeBug();
        }
        int i12 = 2;
        while ((1 << i12) < (i11 * 4) / 3) {
            i12++;
        }
        this.power = i12;
    }

    public void put(int i11, int i12) {
        if (i11 < 0) {
            Kit.codeBug();
        }
        int ensureIndex = ensureIndex(i11, true);
        if (this.ivaluesShift == 0) {
            int i13 = 1 << this.power;
            int[] iArr = this.keys;
            int i14 = i13 * 2;
            if (iArr.length != i14) {
                int[] iArr2 = new int[i14];
                System.arraycopy(iArr, 0, iArr2, 0, i13);
                this.keys = iArr2;
            }
            this.ivaluesShift = i13;
        }
        this.keys[this.ivaluesShift + ensureIndex] = i12;
    }
}

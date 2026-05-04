package androidx.versionedparcelable;

import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.NetworkOnMainThreadException;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseBooleanArray;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.collection.ArrayMap;
import androidx.collection.ArraySet;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import pn.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes3.dex */
public abstract class VersionedParcel {
    private static final int EX_BAD_PARCELABLE = -2;
    private static final int EX_ILLEGAL_ARGUMENT = -3;
    private static final int EX_ILLEGAL_STATE = -5;
    private static final int EX_NETWORK_MAIN_THREAD = -6;
    private static final int EX_NULL_POINTER = -4;
    private static final int EX_PARCELABLE = -9;
    private static final int EX_SECURITY = -1;
    private static final int EX_UNSUPPORTED_OPERATION = -7;
    private static final String TAG = "VersionedParcel";
    private static final int TYPE_BINDER = 5;
    private static final int TYPE_FLOAT = 8;
    private static final int TYPE_INTEGER = 7;
    private static final int TYPE_PARCELABLE = 2;
    private static final int TYPE_SERIALIZABLE = 3;
    private static final int TYPE_STRING = 4;
    private static final int TYPE_VERSIONED_PARCELABLE = 1;
    protected final ArrayMap<String, Class> mParcelizerCache;
    protected final ArrayMap<String, Method> mReadCache;
    protected final ArrayMap<String, Method> mWriteCache;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ParcelException extends RuntimeException {
        public ParcelException(Throwable th2) {
            super(th2);
        }
    }

    public VersionedParcel(ArrayMap<String, Method> arrayMap, ArrayMap<String, Method> arrayMap2, ArrayMap<String, Class> arrayMap3) {
        this.mReadCache = arrayMap;
        this.mWriteCache = arrayMap2;
        this.mParcelizerCache = arrayMap3;
    }

    private Exception createException(int i11, String str) {
        switch (i11) {
            case -9:
                return (Exception) readParcelable();
            case -8:
            default:
                return new RuntimeException("Unknown exception code: " + i11 + " msg " + str);
            case -7:
                return new UnsupportedOperationException(str);
            case -6:
                return new NetworkOnMainThreadException();
            case -5:
                return new IllegalStateException(str);
            case -4:
                return new NullPointerException(str);
            case -3:
                return new IllegalArgumentException(str);
            case -2:
                return new BadParcelableException(str);
            case -1:
                return new SecurityException(str);
        }
    }

    private Class findParcelClass(Class<? extends VersionedParcelable> cls) throws ClassNotFoundException {
        Class cls2 = this.mParcelizerCache.get(cls.getName());
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(String.format("%s.%sParcelizer", cls.getPackage().getName(), cls.getSimpleName()), false, cls.getClassLoader());
        this.mParcelizerCache.put(cls.getName(), cls3);
        return cls3;
    }

    private Method getReadMethod(String str) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException {
        Method method = this.mReadCache.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, VersionedParcel.class.getClassLoader()).getDeclaredMethod("read", VersionedParcel.class);
        this.mReadCache.put(str, declaredMethod);
        return declaredMethod;
    }

    @NonNull
    public static Throwable getRootCause(@NonNull Throwable th2) {
        while (th2.getCause() != null) {
            th2 = th2.getCause();
        }
        return th2;
    }

    private <T> int getType(T t11) {
        if (t11 instanceof String) {
            return 4;
        }
        if (t11 instanceof Parcelable) {
            return 2;
        }
        if (t11 instanceof VersionedParcelable) {
            return 1;
        }
        if (t11 instanceof Serializable) {
            return 3;
        }
        if (t11 instanceof IBinder) {
            return 5;
        }
        if (t11 instanceof Integer) {
            return 7;
        }
        if (t11 instanceof Float) {
            return 8;
        }
        throw new IllegalArgumentException(t11.getClass().getName() + " cannot be VersionedParcelled");
    }

    private Method getWriteMethod(Class cls) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException {
        Method method = this.mWriteCache.get(cls.getName());
        if (method != null) {
            return method;
        }
        Class findParcelClass = findParcelClass(cls);
        System.currentTimeMillis();
        Method declaredMethod = findParcelClass.getDeclaredMethod("write", cls, VersionedParcel.class);
        this.mWriteCache.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    private <T, S extends Collection<T>> S readCollection(S s11) {
        int readInt = readInt();
        if (readInt < 0) {
            return null;
        }
        if (readInt != 0) {
            int readInt2 = readInt();
            if (readInt < 0) {
                return null;
            }
            if (readInt2 == 1) {
                while (readInt > 0) {
                    s11.add(readVersionedParcelable());
                    readInt--;
                }
            } else if (readInt2 == 2) {
                while (readInt > 0) {
                    s11.add(readParcelable());
                    readInt--;
                }
            } else if (readInt2 == 3) {
                while (readInt > 0) {
                    s11.add(readSerializable());
                    readInt--;
                }
            } else if (readInt2 == 4) {
                while (readInt > 0) {
                    s11.add(readString());
                    readInt--;
                }
            } else if (readInt2 == 5) {
                while (readInt > 0) {
                    s11.add(readStrongBinder());
                    readInt--;
                }
            }
        }
        return s11;
    }

    private int readExceptionCode() {
        return readInt();
    }

    private <T> void writeCollection(Collection<T> collection, int i11) {
        setOutputField(i11);
        writeCollection(collection);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void writeVersionedParcelableCreator(VersionedParcelable versionedParcelable) {
        try {
            writeString(findParcelClass(versionedParcelable.getClass()).getName());
        } catch (ClassNotFoundException e11) {
            throw new RuntimeException(versionedParcelable.getClass().getSimpleName() + " does not have a Parcelizer", e11);
        }
    }

    public abstract void closeField();

    public abstract VersionedParcel createSubParcel();

    public boolean isStream() {
        return false;
    }

    public <T> T[] readArray(T[] tArr, int i11) {
        return !readField(i11) ? tArr : (T[]) readArray(tArr);
    }

    public abstract boolean readBoolean();

    public boolean readBoolean(boolean z11, int i11) {
        return !readField(i11) ? z11 : readBoolean();
    }

    public boolean[] readBooleanArray(boolean[] zArr, int i11) {
        return !readField(i11) ? zArr : readBooleanArray();
    }

    public abstract Bundle readBundle();

    public Bundle readBundle(Bundle bundle, int i11) {
        return !readField(i11) ? bundle : readBundle();
    }

    public byte readByte(byte b11, int i11) {
        return !readField(i11) ? b11 : (byte) (readInt() & 255);
    }

    public abstract byte[] readByteArray();

    public byte[] readByteArray(byte[] bArr, int i11) {
        return !readField(i11) ? bArr : readByteArray();
    }

    public char[] readCharArray(char[] cArr, int i11) {
        if (!readField(i11)) {
            return cArr;
        }
        int readInt = readInt();
        if (readInt < 0) {
            return null;
        }
        char[] cArr2 = new char[readInt];
        for (int i12 = 0; i12 < readInt; i12++) {
            cArr2[i12] = (char) readInt();
        }
        return cArr2;
    }

    public abstract CharSequence readCharSequence();

    public CharSequence readCharSequence(CharSequence charSequence, int i11) {
        return !readField(i11) ? charSequence : readCharSequence();
    }

    public abstract double readDouble();

    public double readDouble(double d11, int i11) {
        return !readField(i11) ? d11 : readDouble();
    }

    public double[] readDoubleArray(double[] dArr, int i11) {
        return !readField(i11) ? dArr : readDoubleArray();
    }

    public Exception readException(Exception exc, int i11) {
        int readExceptionCode;
        return (readField(i11) && (readExceptionCode = readExceptionCode()) != 0) ? readException(readExceptionCode, readString()) : exc;
    }

    public abstract boolean readField(int i11);

    public abstract float readFloat();

    public float readFloat(float f11, int i11) {
        return !readField(i11) ? f11 : readFloat();
    }

    public float[] readFloatArray(float[] fArr, int i11) {
        return !readField(i11) ? fArr : readFloatArray();
    }

    public <T extends VersionedParcelable> T readFromParcel(String str, VersionedParcel versionedParcel) {
        try {
            return (T) getReadMethod(str).invoke(null, versionedParcel);
        } catch (ClassNotFoundException e11) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e11);
        } catch (IllegalAccessException e12) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e12);
        } catch (NoSuchMethodException e13) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e13);
        } catch (InvocationTargetException e14) {
            if (e14.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e14.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e14);
        }
    }

    public abstract int readInt();

    public int readInt(int i11, int i12) {
        return !readField(i12) ? i11 : readInt();
    }

    public int[] readIntArray(int[] iArr, int i11) {
        return !readField(i11) ? iArr : readIntArray();
    }

    public <T> List<T> readList(List<T> list, int i11) {
        return !readField(i11) ? list : (List) readCollection(new ArrayList());
    }

    public abstract long readLong();

    public long readLong(long j11, int i11) {
        return !readField(i11) ? j11 : readLong();
    }

    public long[] readLongArray(long[] jArr, int i11) {
        return !readField(i11) ? jArr : readLongArray();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <K, V> Map<K, V> readMap(Map<K, V> map, int i11) {
        if (!readField(i11)) {
            return map;
        }
        int readInt = readInt();
        if (readInt < 0) {
            return null;
        }
        ArrayMap arrayMap = new ArrayMap();
        if (readInt != 0) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            readCollection(arrayList);
            readCollection(arrayList2);
            for (int i12 = 0; i12 < readInt; i12++) {
                arrayMap.put(arrayList.get(i12), arrayList2.get(i12));
            }
        }
        return arrayMap;
    }

    public abstract <T extends Parcelable> T readParcelable();

    public <T extends Parcelable> T readParcelable(T t11, int i11) {
        return !readField(i11) ? t11 : (T) readParcelable();
    }

    public Serializable readSerializable() {
        String readString = readString();
        if (readString == null) {
            return null;
        }
        try {
            return (Serializable) new ObjectInputStream(new ByteArrayInputStream(readByteArray())) { // from class: androidx.versionedparcelable.VersionedParcel.1
                @Override // java.io.ObjectInputStream
                public Class<?> resolveClass(ObjectStreamClass objectStreamClass) throws IOException, ClassNotFoundException {
                    Class<?> cls = Class.forName(objectStreamClass.getName(), false, getClass().getClassLoader());
                    return cls != null ? cls : super.resolveClass(objectStreamClass);
                }
            }.readObject();
        } catch (IOException e11) {
            throw new RuntimeException("VersionedParcelable encountered IOException reading a Serializable object (name = " + readString + j.f81007d, e11);
        } catch (ClassNotFoundException e12) {
            throw new RuntimeException("VersionedParcelable encountered ClassNotFoundException reading a Serializable object (name = " + readString + j.f81007d, e12);
        }
    }

    public <T> Set<T> readSet(Set<T> set, int i11) {
        return !readField(i11) ? set : (Set) readCollection(new ArraySet());
    }

    @RequiresApi(api = 21)
    public Size readSize(Size size, int i11) {
        if (!readField(i11)) {
            return size;
        }
        if (readBoolean()) {
            return new Size(readInt(), readInt());
        }
        return null;
    }

    @RequiresApi(api = 21)
    public SizeF readSizeF(SizeF sizeF, int i11) {
        if (!readField(i11)) {
            return sizeF;
        }
        if (readBoolean()) {
            return new SizeF(readFloat(), readFloat());
        }
        return null;
    }

    public SparseBooleanArray readSparseBooleanArray(SparseBooleanArray sparseBooleanArray, int i11) {
        if (!readField(i11)) {
            return sparseBooleanArray;
        }
        int readInt = readInt();
        if (readInt < 0) {
            return null;
        }
        SparseBooleanArray sparseBooleanArray2 = new SparseBooleanArray(readInt);
        for (int i12 = 0; i12 < readInt; i12++) {
            sparseBooleanArray2.put(readInt(), readBoolean());
        }
        return sparseBooleanArray2;
    }

    public abstract String readString();

    public String readString(String str, int i11) {
        return !readField(i11) ? str : readString();
    }

    public abstract IBinder readStrongBinder();

    public IBinder readStrongBinder(IBinder iBinder, int i11) {
        return !readField(i11) ? iBinder : readStrongBinder();
    }

    public <T extends VersionedParcelable> T readVersionedParcelable(T t11, int i11) {
        return !readField(i11) ? t11 : (T) readVersionedParcelable();
    }

    public abstract void setOutputField(int i11);

    public <T> void writeArray(T[] tArr, int i11) {
        setOutputField(i11);
        writeArray(tArr);
    }

    public abstract void writeBoolean(boolean z11);

    public void writeBoolean(boolean z11, int i11) {
        setOutputField(i11);
        writeBoolean(z11);
    }

    public void writeBooleanArray(boolean[] zArr, int i11) {
        setOutputField(i11);
        writeBooleanArray(zArr);
    }

    public abstract void writeBundle(Bundle bundle);

    public void writeBundle(Bundle bundle, int i11) {
        setOutputField(i11);
        writeBundle(bundle);
    }

    public void writeByte(byte b11, int i11) {
        setOutputField(i11);
        writeInt(b11);
    }

    public abstract void writeByteArray(byte[] bArr);

    public void writeByteArray(byte[] bArr, int i11) {
        setOutputField(i11);
        writeByteArray(bArr);
    }

    public abstract void writeByteArray(byte[] bArr, int i11, int i12);

    public void writeCharArray(char[] cArr, int i11) {
        setOutputField(i11);
        if (cArr == null) {
            writeInt(-1);
            return;
        }
        writeInt(cArr.length);
        for (char c11 : cArr) {
            writeInt(c11);
        }
    }

    public abstract void writeCharSequence(CharSequence charSequence);

    public void writeCharSequence(CharSequence charSequence, int i11) {
        setOutputField(i11);
        writeCharSequence(charSequence);
    }

    public abstract void writeDouble(double d11);

    public void writeDouble(double d11, int i11) {
        setOutputField(i11);
        writeDouble(d11);
    }

    public void writeDoubleArray(double[] dArr, int i11) {
        setOutputField(i11);
        writeDoubleArray(dArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void writeException(Exception exc, int i11) {
        setOutputField(i11);
        if (exc == 0) {
            writeNoException();
            return;
        }
        int i12 = ((exc instanceof Parcelable) && exc.getClass().getClassLoader() == Parcelable.class.getClassLoader()) ? -9 : exc instanceof SecurityException ? -1 : exc instanceof BadParcelableException ? -2 : exc instanceof IllegalArgumentException ? -3 : exc instanceof NullPointerException ? -4 : exc instanceof IllegalStateException ? -5 : exc instanceof NetworkOnMainThreadException ? -6 : exc instanceof UnsupportedOperationException ? -7 : 0;
        writeInt(i12);
        if (i12 == 0) {
            if (!(exc instanceof RuntimeException)) {
                throw new RuntimeException(exc);
            }
            throw ((RuntimeException) exc);
        }
        writeString(exc.getMessage());
        if (i12 != -9) {
            return;
        }
        writeParcelable((Parcelable) exc);
    }

    public abstract void writeFloat(float f11);

    public void writeFloat(float f11, int i11) {
        setOutputField(i11);
        writeFloat(f11);
    }

    public void writeFloatArray(float[] fArr, int i11) {
        setOutputField(i11);
        writeFloatArray(fArr);
    }

    public abstract void writeInt(int i11);

    public void writeInt(int i11, int i12) {
        setOutputField(i12);
        writeInt(i11);
    }

    public void writeIntArray(int[] iArr, int i11) {
        setOutputField(i11);
        writeIntArray(iArr);
    }

    public <T> void writeList(List<T> list, int i11) {
        writeCollection(list, i11);
    }

    public abstract void writeLong(long j11);

    public void writeLong(long j11, int i11) {
        setOutputField(i11);
        writeLong(j11);
    }

    public void writeLongArray(long[] jArr, int i11) {
        setOutputField(i11);
        writeLongArray(jArr);
    }

    public <K, V> void writeMap(Map<K, V> map, int i11) {
        setOutputField(i11);
        if (map == null) {
            writeInt(-1);
            return;
        }
        int size = map.size();
        writeInt(size);
        if (size == 0) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry<K, V> entry : map.entrySet()) {
            arrayList.add(entry.getKey());
            arrayList2.add(entry.getValue());
        }
        writeCollection(arrayList);
        writeCollection(arrayList2);
    }

    public void writeNoException() {
        writeInt(0);
    }

    public abstract void writeParcelable(Parcelable parcelable);

    public void writeParcelable(Parcelable parcelable, int i11) {
        setOutputField(i11);
        writeParcelable(parcelable);
    }

    public void writeSerializable(Serializable serializable, int i11) {
        setOutputField(i11);
        writeSerializable(serializable);
    }

    public <T> void writeSet(Set<T> set, int i11) {
        writeCollection(set, i11);
    }

    @RequiresApi(api = 21)
    public void writeSize(Size size, int i11) {
        setOutputField(i11);
        writeBoolean(size != null);
        if (size != null) {
            writeInt(size.getWidth());
            writeInt(size.getHeight());
        }
    }

    @RequiresApi(api = 21)
    public void writeSizeF(SizeF sizeF, int i11) {
        setOutputField(i11);
        writeBoolean(sizeF != null);
        if (sizeF != null) {
            writeFloat(sizeF.getWidth());
            writeFloat(sizeF.getHeight());
        }
    }

    public void writeSparseBooleanArray(SparseBooleanArray sparseBooleanArray, int i11) {
        setOutputField(i11);
        if (sparseBooleanArray == null) {
            writeInt(-1);
            return;
        }
        int size = sparseBooleanArray.size();
        writeInt(size);
        for (int i12 = 0; i12 < size; i12++) {
            writeInt(sparseBooleanArray.keyAt(i12));
            writeBoolean(sparseBooleanArray.valueAt(i12));
        }
    }

    public abstract void writeString(String str);

    public void writeString(String str, int i11) {
        setOutputField(i11);
        writeString(str);
    }

    public abstract void writeStrongBinder(IBinder iBinder);

    public void writeStrongBinder(IBinder iBinder, int i11) {
        setOutputField(i11);
        writeStrongBinder(iBinder);
    }

    public abstract void writeStrongInterface(IInterface iInterface);

    public void writeStrongInterface(IInterface iInterface, int i11) {
        setOutputField(i11);
        writeStrongInterface(iInterface);
    }

    public <T extends VersionedParcelable> void writeToParcel(T t11, VersionedParcel versionedParcel) {
        try {
            getWriteMethod(t11.getClass()).invoke(null, t11, versionedParcel);
        } catch (ClassNotFoundException e11) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e11);
        } catch (IllegalAccessException e12) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e12);
        } catch (NoSuchMethodException e13) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e13);
        } catch (InvocationTargetException e14) {
            if (!(e14.getCause() instanceof RuntimeException)) {
                throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e14);
            }
            throw ((RuntimeException) e14.getCause());
        }
    }

    public void writeVersionedParcelable(VersionedParcelable versionedParcelable, int i11) {
        setOutputField(i11);
        writeVersionedParcelable(versionedParcelable);
    }

    private <T> void writeCollection(Collection<T> collection) {
        if (collection == null) {
            writeInt(-1);
        }
        int size = collection.size();
        writeInt(size);
        if (size > 0) {
            int type = getType(collection.iterator().next());
            writeInt(type);
            switch (type) {
                case 1:
                    Iterator<T> it = collection.iterator();
                    while (it.hasNext()) {
                        writeVersionedParcelable((VersionedParcelable) it.next());
                    }
                    break;
                case 2:
                    Iterator<T> it2 = collection.iterator();
                    while (it2.hasNext()) {
                        writeParcelable((Parcelable) it2.next());
                    }
                    break;
                case 3:
                    Iterator<T> it3 = collection.iterator();
                    while (it3.hasNext()) {
                        writeSerializable((Serializable) it3.next());
                    }
                    break;
                case 4:
                    Iterator<T> it4 = collection.iterator();
                    while (it4.hasNext()) {
                        writeString((String) it4.next());
                    }
                    break;
                case 5:
                    Iterator<T> it5 = collection.iterator();
                    while (it5.hasNext()) {
                        writeStrongBinder((IBinder) it5.next());
                    }
                    break;
                case 7:
                    Iterator<T> it6 = collection.iterator();
                    while (it6.hasNext()) {
                        writeInt(((Integer) it6.next()).intValue());
                    }
                    break;
                case 8:
                    Iterator<T> it7 = collection.iterator();
                    while (it7.hasNext()) {
                        writeFloat(((Float) it7.next()).floatValue());
                    }
                    break;
            }
        }
    }

    private void writeSerializable(Serializable serializable) {
        if (serializable == null) {
            writeString(null);
            return;
        }
        String name = serializable.getClass().getName();
        writeString(name);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(serializable);
            objectOutputStream.close();
            writeByteArray(byteArrayOutputStream.toByteArray());
        } catch (IOException e11) {
            throw new RuntimeException("VersionedParcelable encountered IOException writing serializable object (name = " + name + j.f81007d, e11);
        }
    }

    public <T> T[] readArray(T[] tArr) {
        int readInt = readInt();
        if (readInt < 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList(readInt);
        if (readInt != 0) {
            int readInt2 = readInt();
            if (readInt < 0) {
                return null;
            }
            if (readInt2 == 1) {
                while (readInt > 0) {
                    arrayList.add(readVersionedParcelable());
                    readInt--;
                }
            } else if (readInt2 == 2) {
                while (readInt > 0) {
                    arrayList.add(readParcelable());
                    readInt--;
                }
            } else if (readInt2 == 3) {
                while (readInt > 0) {
                    arrayList.add(readSerializable());
                    readInt--;
                }
            } else if (readInt2 == 4) {
                while (readInt > 0) {
                    arrayList.add(readString());
                    readInt--;
                }
            } else if (readInt2 == 5) {
                while (readInt > 0) {
                    arrayList.add(readStrongBinder());
                    readInt--;
                }
            }
        }
        return (T[]) arrayList.toArray(tArr);
    }

    public boolean[] readBooleanArray() {
        int readInt = readInt();
        if (readInt < 0) {
            return null;
        }
        boolean[] zArr = new boolean[readInt];
        for (int i11 = 0; i11 < readInt; i11++) {
            zArr[i11] = readInt() != 0;
        }
        return zArr;
    }

    public double[] readDoubleArray() {
        int readInt = readInt();
        if (readInt < 0) {
            return null;
        }
        double[] dArr = new double[readInt];
        for (int i11 = 0; i11 < readInt; i11++) {
            dArr[i11] = readDouble();
        }
        return dArr;
    }

    public float[] readFloatArray() {
        int readInt = readInt();
        if (readInt < 0) {
            return null;
        }
        float[] fArr = new float[readInt];
        for (int i11 = 0; i11 < readInt; i11++) {
            fArr[i11] = readFloat();
        }
        return fArr;
    }

    public int[] readIntArray() {
        int readInt = readInt();
        if (readInt < 0) {
            return null;
        }
        int[] iArr = new int[readInt];
        for (int i11 = 0; i11 < readInt; i11++) {
            iArr[i11] = readInt();
        }
        return iArr;
    }

    public long[] readLongArray() {
        int readInt = readInt();
        if (readInt < 0) {
            return null;
        }
        long[] jArr = new long[readInt];
        for (int i11 = 0; i11 < readInt; i11++) {
            jArr[i11] = readLong();
        }
        return jArr;
    }

    public <T extends VersionedParcelable> T readVersionedParcelable() {
        String readString = readString();
        if (readString == null) {
            return null;
        }
        return (T) readFromParcel(readString, createSubParcel());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> void writeArray(T[] tArr) {
        if (tArr == 0) {
            writeInt(-1);
            return;
        }
        int length = tArr.length;
        writeInt(length);
        if (length > 0) {
            int i11 = 0;
            int type = getType(tArr[0]);
            writeInt(type);
            if (type == 1) {
                while (i11 < length) {
                    writeVersionedParcelable((VersionedParcelable) tArr[i11]);
                    i11++;
                }
                return;
            }
            if (type == 2) {
                while (i11 < length) {
                    writeParcelable((Parcelable) tArr[i11]);
                    i11++;
                }
                return;
            }
            if (type == 3) {
                while (i11 < length) {
                    writeSerializable((Serializable) tArr[i11]);
                    i11++;
                }
            } else if (type == 4) {
                while (i11 < length) {
                    writeString((String) tArr[i11]);
                    i11++;
                }
            } else {
                if (type != 5) {
                    return;
                }
                while (i11 < length) {
                    writeStrongBinder((IBinder) tArr[i11]);
                    i11++;
                }
            }
        }
    }

    public void writeBooleanArray(boolean[] zArr) {
        if (zArr != null) {
            writeInt(zArr.length);
            for (boolean z11 : zArr) {
                writeInt(z11 ? 1 : 0);
            }
            return;
        }
        writeInt(-1);
    }

    public void writeByteArray(byte[] bArr, int i11, int i12, int i13) {
        setOutputField(i13);
        writeByteArray(bArr, i11, i12);
    }

    public void writeDoubleArray(double[] dArr) {
        if (dArr != null) {
            writeInt(dArr.length);
            for (double d11 : dArr) {
                writeDouble(d11);
            }
            return;
        }
        writeInt(-1);
    }

    public void writeFloatArray(float[] fArr) {
        if (fArr != null) {
            writeInt(fArr.length);
            for (float f11 : fArr) {
                writeFloat(f11);
            }
            return;
        }
        writeInt(-1);
    }

    public void writeIntArray(int[] iArr) {
        if (iArr != null) {
            writeInt(iArr.length);
            for (int i11 : iArr) {
                writeInt(i11);
            }
            return;
        }
        writeInt(-1);
    }

    public void writeLongArray(long[] jArr) {
        if (jArr != null) {
            writeInt(jArr.length);
            for (long j11 : jArr) {
                writeLong(j11);
            }
            return;
        }
        writeInt(-1);
    }

    public void writeVersionedParcelable(VersionedParcelable versionedParcelable) {
        if (versionedParcelable == null) {
            writeString(null);
            return;
        }
        writeVersionedParcelableCreator(versionedParcelable);
        VersionedParcel createSubParcel = createSubParcel();
        writeToParcel(versionedParcelable, createSubParcel);
        createSubParcel.closeField();
    }

    private Exception readException(int i11, String str) {
        return createException(i11, str);
    }

    public void setSerializationFlags(boolean z11, boolean z12) {
    }
}

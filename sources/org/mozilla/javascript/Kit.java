package org.mozilla.javascript;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.lang.reflect.Method;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class Kit {
    private static Method Throwable_initCause;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class ComplexKey {
        private int hash;
        private Object key1;
        private Object key2;

        public ComplexKey(Object obj, Object obj2) {
            this.key1 = obj;
            this.key2 = obj2;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof ComplexKey)) {
                return false;
            }
            ComplexKey complexKey = (ComplexKey) obj;
            return this.key1.equals(complexKey.key1) && this.key2.equals(complexKey.key2);
        }

        public int hashCode() {
            if (this.hash == 0) {
                this.hash = this.key1.hashCode() ^ this.key2.hashCode();
            }
            return this.hash;
        }
    }

    static {
        try {
            Class<?> classOrNull = classOrNull("java.lang.Throwable");
            Throwable_initCause = classOrNull.getMethod("initCause", classOrNull);
        } catch (Exception unused) {
        }
    }

    public static Object addListener(Object obj, Object obj2) {
        if (obj2 == null) {
            throw new IllegalArgumentException();
        }
        if (obj2 instanceof Object[]) {
            throw new IllegalArgumentException();
        }
        if (obj == null) {
            return obj2;
        }
        if (!(obj instanceof Object[])) {
            return new Object[]{obj, obj2};
        }
        Object[] objArr = (Object[]) obj;
        int length = objArr.length;
        if (length < 2) {
            throw new IllegalArgumentException();
        }
        Object[] objArr2 = new Object[length + 1];
        System.arraycopy(objArr, 0, objArr2, 0, length);
        objArr2[length] = obj2;
        return objArr2;
    }

    public static Class<?> classOrNull(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException | IllegalArgumentException | LinkageError | SecurityException unused) {
            return null;
        }
    }

    public static RuntimeException codeBug() throws RuntimeException {
        IllegalStateException illegalStateException = new IllegalStateException("FAILED ASSERTION");
        illegalStateException.printStackTrace(System.err);
        throw illegalStateException;
    }

    public static Object getListener(Object obj, int i11) {
        if (i11 == 0) {
            if (obj == null) {
                return null;
            }
            if (!(obj instanceof Object[])) {
                return obj;
            }
            Object[] objArr = (Object[]) obj;
            if (objArr.length >= 2) {
                return objArr[0];
            }
            throw new IllegalArgumentException();
        }
        if (i11 == 1) {
            if (obj instanceof Object[]) {
                return ((Object[]) obj)[1];
            }
            if (obj != null) {
                return null;
            }
            throw new IllegalArgumentException();
        }
        Object[] objArr2 = (Object[]) obj;
        int length = objArr2.length;
        if (length < 2) {
            throw new IllegalArgumentException();
        }
        if (i11 == length) {
            return null;
        }
        return objArr2[i11];
    }

    public static RuntimeException initCause(RuntimeException runtimeException, Throwable th2) {
        Method method = Throwable_initCause;
        if (method != null) {
            try {
                method.invoke(runtimeException, th2);
            } catch (Exception unused) {
            }
        }
        return runtimeException;
    }

    public static Object initHash(Map<Object, Object> map, Object obj, Object obj2) {
        synchronized (map) {
            try {
                Object obj3 = map.get(obj);
                if (obj3 == null) {
                    map.put(obj, obj2);
                } else {
                    obj2 = obj3;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return obj2;
    }

    public static Object makeHashKeyFromPair(Object obj, Object obj2) {
        if (obj == null) {
            throw new IllegalArgumentException();
        }
        if (obj2 != null) {
            return new ComplexKey(obj, obj2);
        }
        throw new IllegalArgumentException();
    }

    public static Object newInstanceOrNull(Class<?> cls) {
        try {
            return cls.newInstance();
        } catch (IllegalAccessException | InstantiationException | LinkageError | SecurityException unused) {
            return null;
        }
    }

    public static String readReader(Reader reader) throws IOException {
        char[] cArr = new char[512];
        int i11 = 0;
        while (true) {
            int read = reader.read(cArr, i11, cArr.length - i11);
            if (read < 0) {
                return new String(cArr, 0, i11);
            }
            i11 += read;
            if (i11 == cArr.length) {
                char[] cArr2 = new char[cArr.length * 2];
                System.arraycopy(cArr, 0, cArr2, 0, i11);
                cArr = cArr2;
            }
        }
    }

    public static byte[] readStream(InputStream inputStream, int i11) throws IOException {
        if (i11 <= 0) {
            throw new IllegalArgumentException("Bad initialBufferCapacity: " + i11);
        }
        byte[] bArr = new byte[i11];
        int i12 = 0;
        while (true) {
            int read = inputStream.read(bArr, i12, bArr.length - i12);
            if (read < 0) {
                break;
            }
            i12 += read;
            if (i12 == bArr.length) {
                byte[] bArr2 = new byte[bArr.length * 2];
                System.arraycopy(bArr, 0, bArr2, 0, i12);
                bArr = bArr2;
            }
        }
        if (i12 == bArr.length) {
            return bArr;
        }
        byte[] bArr3 = new byte[i12];
        System.arraycopy(bArr, 0, bArr3, 0, i12);
        return bArr3;
    }

    public static Object removeListener(Object obj, Object obj2) {
        if (obj2 == null) {
            throw new IllegalArgumentException();
        }
        if (obj2 instanceof Object[]) {
            throw new IllegalArgumentException();
        }
        if (obj == obj2) {
            return null;
        }
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            int length = objArr.length;
            if (length < 2) {
                throw new IllegalArgumentException();
            }
            if (length == 2) {
                Object obj3 = objArr[1];
                if (obj3 == obj2) {
                    return objArr[0];
                }
                if (objArr[0] == obj2) {
                    return obj3;
                }
            } else {
                int i11 = length;
                while (true) {
                    int i12 = i11 - 1;
                    if (objArr[i12] == obj2) {
                        Object[] objArr2 = new Object[length - 1];
                        System.arraycopy(objArr, 0, objArr2, 0, i12);
                        System.arraycopy(objArr, i11, objArr2, i12, length - i11);
                        return objArr2;
                    }
                    if (i12 == 0) {
                        break;
                    }
                    i11 = i12;
                }
            }
        }
        return obj;
    }

    public static boolean testIfCanLoadRhinoClasses(ClassLoader classLoader) {
        Class<?> cls = ScriptRuntime.ContextFactoryClass;
        return classOrNull(classLoader, cls.getName()) == cls;
    }

    public static int xDigitToInt(int i11, int i12) {
        int i13;
        if (i11 <= 57) {
            i13 = i11 - 48;
            if (i13 < 0) {
                return -1;
            }
        } else if (i11 <= 70) {
            if (65 > i11) {
                return -1;
            }
            i13 = i11 - 55;
        } else {
            if (i11 > 102 || 97 > i11) {
                return -1;
            }
            i13 = i11 - 87;
        }
        return i13 | (i12 << 4);
    }

    public static Class<?> classOrNull(ClassLoader classLoader, String str) {
        try {
            return classLoader.loadClass(str);
        } catch (ClassNotFoundException | IllegalArgumentException | LinkageError | SecurityException unused) {
            return null;
        }
    }

    public static RuntimeException codeBug(String str) throws RuntimeException {
        IllegalStateException illegalStateException = new IllegalStateException("FAILED ASSERTION: " + str);
        illegalStateException.printStackTrace(System.err);
        throw illegalStateException;
    }
}

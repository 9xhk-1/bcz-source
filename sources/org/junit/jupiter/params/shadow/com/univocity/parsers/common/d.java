package org.junit.jupiter.params.shadow.com.univocity.parsers.common;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.junit.jupiter.params.shadow.com.univocity.parsers.common.input.BomInput;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public static final String[] f78085a = new String[0];

    /* renamed from: b, reason: collision with root package name */
    public static final NormalizedString[] f78086b = new NormalizedString[0];

    public static void A(Throwable th2) {
        B(th2);
    }

    public static <T extends Exception> void B(Throwable th2) throws Exception {
        throw ((Exception) th2);
    }

    public static String[] C(List<Enum> list) {
        int size = list.size();
        String[] strArr = new String[size];
        for (int i11 = 0; i11 < size; i11++) {
            strArr[i11] = list.get(i11).toString();
        }
        return strArr;
    }

    public static byte[] D(int... iArr) {
        byte[] bArr = new byte[iArr.length];
        for (int i11 = 0; i11 < iArr.length; i11++) {
            bArr[i11] = (byte) iArr[i11];
        }
        return bArr;
    }

    public static char[] E(Collection<Character> collection) {
        char[] cArr = new char[collection.size()];
        Iterator<Character> it = collection.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            cArr[i11] = it.next().charValue();
            i11++;
        }
        return cArr;
    }

    public static int[] F(Collection<Integer> collection) {
        int[] iArr = new int[collection.size()];
        Iterator<Integer> it = collection.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            iArr[i11] = it.next().intValue();
            i11++;
        }
        return iArr;
    }

    public static String G(String str, boolean z11, boolean z12) {
        if (str.length() == 0) {
            return str;
        }
        if (!z11 && !z12) {
            return str;
        }
        int i11 = 0;
        while (z11 && i11 < str.length() && str.charAt(i11) <= ' ') {
            i11++;
        }
        if (i11 == str.length()) {
            return "";
        }
        int length = (str.length() + i11) - 1;
        if (length >= str.length()) {
            length = str.length() - 1;
        }
        while (z12 && str.charAt(length) <= ' ') {
            length--;
        }
        return i11 == length ? "" : (i11 == 0 && length == str.length() + (-1)) ? str : str.substring(i11, length + 1);
    }

    public static String a(String str, boolean z11) {
        char c11;
        StringBuilder sb2 = new StringBuilder();
        int i11 = 0;
        while (i11 < str.length()) {
            char charAt = str.charAt(i11);
            if (charAt == '\r' || charAt == '\n') {
                sb2.append('[');
                sb2.append(charAt == '\r' ? "cr" : "lf");
                int i12 = i11 + 1;
                if (i12 >= str.length() || (c11 = str.charAt(i12)) == charAt || !(c11 == '\r' || c11 == '\n')) {
                    c11 = 0;
                } else {
                    sb2.append(c11 == '\r' ? "cr" : "lf");
                    i11 = i12;
                }
                sb2.append(l50.b.f69930l);
                if (z11) {
                    sb2.append(charAt);
                    if (c11 != 0) {
                        sb2.append(c11);
                    }
                }
            } else {
                sb2.append(charAt);
            }
            i11++;
        }
        return sb2.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> T[] b(T[] tArr) {
        if (tArr == null || tArr.length == 0) {
            return tArr;
        }
        HashSet hashSet = new HashSet(tArr.length);
        ArrayList arrayList = new ArrayList(1);
        for (T t11 : tArr) {
            if (hashSet.contains(t11)) {
                arrayList.add(t11);
            } else {
                hashSet.add(t11);
            }
        }
        return (T[]) arrayList.toArray((Object[]) Array.newInstance(tArr.getClass().getComponentType(), arrayList.size()));
    }

    public static Object[] c(Object[] objArr, Collection<?> collection) {
        return d(objArr, collection.toArray());
    }

    public static Object[] d(Object[] objArr, Object[] objArr2) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr2) {
            if (f(objArr, obj) == -1) {
                arrayList.add(obj);
            }
        }
        return arrayList.toArray();
    }

    public static int e(char[] cArr, char c11, int i11) {
        while (i11 < cArr.length) {
            if (cArr[i11] == c11) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    public static int f(Object[] objArr, Object obj) {
        return g(objArr, obj, 0);
    }

    public static int g(Object[] objArr, Object obj, int i11) {
        if (objArr == null) {
            throw new NullPointerException("Null array");
        }
        if (obj == null) {
            while (i11 < objArr.length) {
                if (objArr[i11] == null) {
                    return i11;
                }
                i11++;
            }
            return -1;
        }
        if (obj.getClass() != objArr.getClass().getComponentType()) {
            throw new IllegalStateException("a");
        }
        if (!(obj instanceof String) || !(objArr instanceof String[])) {
            while (i11 < objArr.length) {
                if (obj.equals(objArr[i11])) {
                    return i11;
                }
                i11++;
            }
            return -1;
        }
        while (i11 < objArr.length) {
            if (obj.toString().equalsIgnoreCase(String.valueOf(objArr[i11]))) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    public static int h(NormalizedString[] normalizedStringArr, NormalizedString normalizedString, j90.m mVar) {
        int f11 = f(normalizedStringArr, normalizedString);
        if (mVar == null || f11 == -1) {
            return f11;
        }
        int[] V = mVar.V(normalizedStringArr);
        for (int i11 = 0; i11 < V.length; i11++) {
            if (V[i11] == f11) {
                return i11;
            }
        }
        return -1;
    }

    public static int[] i(Object[] objArr, Object obj) {
        int g11;
        int i11 = 0;
        int[] iArr = new int[0];
        int i12 = 0;
        while (i11 < objArr.length && (g11 = g(objArr, obj, i11)) != -1) {
            iArr = Arrays.copyOf(iArr, iArr.length + 1);
            iArr[i12] = g11;
            i11 = g11 + 1;
            i12++;
        }
        return iArr;
    }

    public static Reader j(File file) {
        return l(file, null);
    }

    public static Reader k(File file, String str) {
        return l(file, Charset.forName(str));
    }

    public static Reader l(File file, Charset charset) {
        try {
            return o(new FileInputStream(file), charset);
        } catch (FileNotFoundException e11) {
            throw new IllegalArgumentException(e11);
        }
    }

    public static Reader m(InputStream inputStream) {
        return o(inputStream, null);
    }

    public static Reader n(InputStream inputStream, String str) {
        return o(inputStream, str == null ? null : Charset.forName(str));
    }

    public static Reader o(InputStream inputStream, Charset charset) {
        if (charset == null) {
            BomInput bomInput = new BomInput(inputStream);
            if (bomInput.c() != null) {
                charset = bomInput.a();
            }
            if (bomInput.e()) {
                inputStream = bomInput;
            }
        }
        return charset != null ? new InputStreamReader(inputStream, charset) : new InputStreamReader(inputStream);
    }

    public static Writer p(File file) {
        return r(file, null);
    }

    public static Writer q(File file, String str) {
        return r(file, Charset.forName(str));
    }

    public static Writer r(File file, Charset charset) {
        if (!file.exists()) {
            File parentFile = file.getParentFile();
            if (parentFile != null && !parentFile.exists()) {
                parentFile.mkdirs();
            }
            try {
                file.createNewFile();
            } catch (IOException e11) {
                throw new IllegalArgumentException("Unable to create file '" + file.getAbsolutePath() + "', please ensure your application has permission to create files in that path", e11);
            }
        }
        try {
            return u(new FileOutputStream(file), charset);
        } catch (FileNotFoundException e12) {
            throw new IllegalArgumentException(e12);
        }
    }

    public static Writer s(OutputStream outputStream) {
        return u(outputStream, null);
    }

    public static Writer t(OutputStream outputStream, String str) {
        return u(outputStream, Charset.forName(str));
    }

    public static Writer u(OutputStream outputStream, Charset charset) {
        return charset != null ? new OutputStreamWriter(outputStream, charset) : new OutputStreamWriter(outputStream);
    }

    public static <T> void v(String str, T... tArr) {
        w(str, tArr);
        for (T t11 : tArr) {
            if (t11 == null) {
                if (tArr.length > 0) {
                    throw new IllegalArgumentException(str + " must not contain nulls");
                }
                throw new IllegalArgumentException(str + " must not be null");
            }
        }
    }

    public static <T> void w(String str, T... tArr) {
        if (tArr == null) {
            throw new IllegalArgumentException(str + " must not be null");
        }
        if (tArr.length != 0) {
            return;
        }
        throw new IllegalArgumentException(str + " must not be empty");
    }

    public static int[] x(int[] iArr, int i11) {
        if (iArr == null || iArr.length == 0) {
            return iArr;
        }
        int i12 = 0;
        for (int i13 : iArr) {
            if (i13 == i11) {
                i12++;
            }
        }
        if (i12 == 0) {
            return iArr;
        }
        int[] iArr2 = new int[iArr.length - i12];
        int i14 = 0;
        for (int i15 : iArr) {
            if (i15 != i11) {
                iArr2[i14] = i15;
                i14++;
            }
        }
        return iArr2;
    }

    public static String y(int i11, CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        if (i11 == 0) {
            return "<omitted>";
        }
        if (i11 == -1) {
            return charSequence.toString();
        }
        int length = charSequence.length() - i11;
        if (i11 <= 0 || length <= 0) {
            return charSequence.toString();
        }
        return "..." + charSequence.subSequence(length, charSequence.length()).toString();
    }

    public static String z(int i11, Object obj) {
        if (obj == null) {
            return null;
        }
        return obj instanceof Object[] ? y(i11, Arrays.toString((Object[]) obj)) : y(i11, String.valueOf(obj));
    }
}

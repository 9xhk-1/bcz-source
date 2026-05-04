package com.getui.gtc.dim.e;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Parcel;
import android.os.Parcelable;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Base64;
import com.getui.gtc.base.GtcProvider;
import com.getui.gtc.base.annotation.MutableMethod;
import com.getui.gtc.base.util.io.IOUtils;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
public final class c {
    @MutableMethod
    public static Object a(int i11, String str, Context context) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager == null || i11 < 0) {
                return null;
            }
            return telephonyManager.getClass().getMethod(str, c(str)).invoke(telephonyManager, Integer.valueOf(i11));
        } catch (Throwable th2) {
            b.a(th2);
            return null;
        }
    }

    private static Object b(byte[] bArr) {
        ObjectInputStream objectInputStream;
        try {
            objectInputStream = new ObjectInputStream(new ByteArrayInputStream(bArr));
            try {
                Object readObject = objectInputStream.readObject();
                try {
                    objectInputStream.close();
                } catch (Throwable unused) {
                }
                return readObject;
            } catch (Throwable th2) {
                th = th2;
                try {
                    b.a(th);
                    if (objectInputStream != null) {
                        try {
                            objectInputStream.close();
                        } catch (Throwable unused2) {
                        }
                    }
                    return null;
                } catch (Throwable th3) {
                    if (objectInputStream != null) {
                        try {
                            objectInputStream.close();
                        } catch (Throwable unused3) {
                        }
                    }
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            th = th4;
            objectInputStream = null;
        }
    }

    private static Object c(byte[] bArr) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.unmarshall(bArr, 0, bArr.length);
            obtain.setDataPosition(0);
            return obtain.readParcelable(GtcProvider.context().getClassLoader());
        } finally {
            obtain.recycle();
        }
    }

    public static Object a(byte[] bArr) throws Exception {
        byte b11 = bArr[0];
        byte[] bArr2 = new byte[bArr.length - 1];
        System.arraycopy(bArr, 1, bArr2, 0, bArr.length - 1);
        if (b11 == 0) {
            return b(bArr2);
        }
        if (b11 != 1) {
            throw new RuntimeException("bytesToObject failed, invalid type");
        }
        Object c11 = c(bArr2);
        return c11 instanceof com.getui.gtc.dim.d.c ? ((com.getui.gtc.dim.d.c) c11).getParcelables() : c11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:0x00b3, code lost:
    
        if (r2 == null) goto L67;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String b(java.lang.String r8) {
        /*
            Method dump skipped, instructions count: 206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.getui.gtc.dim.e.c.b(java.lang.String):java.lang.String");
    }

    @MutableMethod
    @SuppressLint({"MissingPermission"})
    public static boolean c(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                if (activeNetworkInfo.getType() == 1) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th2) {
            b.a(th2);
            return false;
        }
    }

    public static Process a(String str) throws Throwable {
        Class<?> cls = Class.forName(new String(Base64.decode("amF2YS5sYW5nLlJ1bnRpbWU=", 0)));
        Method declaredMethod = cls.getDeclaredMethod(new String(Base64.decode("Z2V0UnVudGltZQ==", 0)), null);
        declaredMethod.setAccessible(true);
        Object invoke = declaredMethod.invoke(null, null);
        Method declaredMethod2 = cls.getDeclaredMethod(new String(Base64.decode("ZXhlYw==", 0)), String.class);
        declaredMethod2.setAccessible(true);
        return (Process) declaredMethod2.invoke(invoke, str);
    }

    @MutableMethod
    @SuppressLint({"MissingPermission"})
    public static boolean b(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                if (activeNetworkInfo.getType() == 0) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th2) {
            b.a(th2);
            return false;
        }
    }

    @MutableMethod
    private static Class<?>[] c(String str) {
        Class<?>[] clsArr = null;
        try {
            for (Method method : TelephonyManager.class.getDeclaredMethods()) {
                if (str.equals(method.getName())) {
                    clsArr = method.getParameterTypes();
                    if (clsArr.length > 0) {
                        return clsArr;
                    }
                }
            }
            return clsArr;
        } catch (Throwable th2) {
            b.a(th2);
            return clsArr;
        }
    }

    public static String a(String str, String str2) {
        try {
            String[] split = str.split("#");
            int length = split.length;
            int i11 = 0;
            while (true) {
                String str3 = "";
                if (i11 >= length) {
                    return "";
                }
                String str4 = split[i11];
                if (!str4.trim().isEmpty()) {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(a("getprop ".concat(str4)).getInputStream()));
                    while (true) {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                        str3 = str3 + readLine;
                    }
                    bufferedReader.close();
                    if (!str3.trim().isEmpty()) {
                        return str3;
                    }
                }
                i11++;
            }
        } catch (Throwable unused) {
            return str2;
        }
    }

    public static byte[] b(Object obj) throws Exception {
        if (obj instanceof Parcelable) {
            return a((Parcelable) obj);
        }
        if (obj instanceof List) {
            List list = (List) obj;
            if (list.get(0) instanceof Parcelable) {
                return a((Parcelable) new com.getui.gtc.dim.d.c((List<Parcelable>) list));
            }
        }
        if (obj instanceof Serializable) {
            return a((Serializable) obj);
        }
        throw new IllegalArgumentException("objectToBytes failed, object type is not support: " + obj.getClass().getName());
    }

    public static void a(Context context, String str, boolean z11) {
        try {
            z11 = context.getPackageManager().checkPermission(str, context.getPackageName()) == 0;
        } catch (Throwable th2) {
            b.a(th2);
        }
        if (z11) {
            return;
        }
        throw new IllegalStateException("permission " + str + " not granted");
    }

    @MutableMethod
    @SuppressLint({"MissingPermission"})
    public static boolean a(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                if (activeNetworkInfo.isAvailable()) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th2) {
            b.a(th2);
            return false;
        }
    }

    public static boolean a(Context context, String str) {
        try {
            return context.getPackageManager().checkPermission(str, context.getPackageName()) == 0;
        } catch (Throwable th2) {
            b.a(th2);
            return true;
        }
    }

    public static boolean a(Object obj) {
        if (obj == null) {
            return false;
        }
        return obj instanceof CharSequence ? !TextUtils.isEmpty((CharSequence) obj) : obj instanceof Collection ? ((Collection) obj).size() > 0 : !(obj instanceof Map) || ((Map) obj).size() > 0;
    }

    public static boolean a(byte[] bArr, File file) throws Exception {
        ByteArrayInputStream byteArrayInputStream;
        FileOutputStream fileOutputStream;
        if (bArr == null) {
            return false;
        }
        FileOutputStream fileOutputStream2 = null;
        try {
            byteArrayInputStream = new ByteArrayInputStream(bArr);
            fileOutputStream = new FileOutputStream(file);
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            byte[] bArr2 = new byte[521];
            while (true) {
                int read = byteArrayInputStream.read(bArr2);
                if (read == -1) {
                    fileOutputStream.flush();
                    IOUtils.safeClose(fileOutputStream);
                    return true;
                }
                fileOutputStream.write(bArr2, 0, read);
            }
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream2 = fileOutputStream;
            IOUtils.safeClose(fileOutputStream2);
            throw th;
        }
    }

    private static byte[] a(Parcelable parcelable) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeParcelable(parcelable, 0);
            byte[] marshall = obtain.marshall();
            byte[] bArr = new byte[marshall.length + 1];
            bArr[0] = 1;
            System.arraycopy(marshall, 0, bArr, 1, marshall.length);
            return bArr;
        } finally {
            obtain.recycle();
        }
    }

    public static byte[] a(File file) throws Exception {
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2 = null;
        try {
            fileInputStream = new FileInputStream(file);
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[521];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read == -1) {
                    byteArrayOutputStream.flush();
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    IOUtils.safeClose(fileInputStream);
                    return byteArray;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
        } catch (Throwable th3) {
            th = th3;
            fileInputStream2 = fileInputStream;
            IOUtils.safeClose(fileInputStream2);
            throw th;
        }
    }

    private static byte[] a(Serializable serializable) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = null;
        try {
            ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(byteArrayOutputStream);
            try {
                objectOutputStream2.writeObject(serializable);
                objectOutputStream2.flush();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byte[] bArr = new byte[byteArray.length + 1];
                bArr[0] = 0;
                System.arraycopy(byteArray, 0, bArr, 1, byteArray.length);
                try {
                    objectOutputStream2.close();
                } catch (Throwable unused) {
                }
                return bArr;
            } catch (Throwable th2) {
                th = th2;
                objectOutputStream = objectOutputStream2;
                if (objectOutputStream != null) {
                    try {
                        objectOutputStream.close();
                    } catch (Throwable unused2) {
                    }
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}

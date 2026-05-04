package com.getui.gtc.i.d;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Process;
import android.util.Base64;
import java.lang.reflect.Method;

/* loaded from: classes6.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static int f30110a = Integer.MIN_VALUE;

    /* renamed from: b, reason: collision with root package name */
    private static Object f30111b;

    /* renamed from: c, reason: collision with root package name */
    private static Method f30112c;

    private static int a() {
        int i11 = f30110a;
        if (i11 != Integer.MIN_VALUE) {
            return i11;
        }
        try {
            Class<?> cls = Class.forName(new String(Base64.decode("YW5kcm9pZC5vcy5Vc2VySGFuZGxl", 0)));
            Method declaredMethod = cls.getDeclaredMethod(new String(Base64.decode("Z2V0VXNlcklk", 0)), Integer.TYPE);
            declaredMethod.setAccessible(true);
            int intValue = ((Integer) declaredMethod.invoke(cls, Integer.valueOf(Process.myUid()))).intValue();
            f30110a = intValue;
            return intValue;
        } catch (Throwable th2) {
            com.getui.gtc.i.c.a.b(th2);
            return 0;
        }
    }

    private static PackageInfo b(String str) {
        try {
            IBinder asBinder = ((IInterface) f30111b).asBinder();
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken(asBinder.getInterfaceDescriptor());
                obtain.writeString(str);
                obtain.writeLong(0L);
                obtain.writeInt(a());
                asBinder.transact(3, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readInt() != 0 ? (PackageInfo) PackageInfo.CREATOR.createFromParcel(obtain2) : null;
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        } catch (Throwable th2) {
            com.getui.gtc.i.c.a.b(th2);
            return null;
        }
    }

    public static PackageInfo a(String str) throws PackageManager.NameNotFoundException {
        PackageInfo a11 = a(str, a());
        if (a11 != null) {
            return a11;
        }
        throw new PackageManager.NameNotFoundException(str);
    }

    private static PackageInfo a(String str, int i11) {
        try {
            if (f30111b == null) {
                f30111b = Class.forName(new String(Base64.decode("YW5kcm9pZC5hcHAuQWN0aXZpdHlUaHJlYWQ=", 0))).getMethod(new String(Base64.decode("Z2V0UGFja2FnZU1hbmFnZXI=", 0)), null).invoke(null, null);
            }
            if (Build.VERSION.SDK_INT >= 33) {
                return b(str);
            }
            if (f30112c == null) {
                String str2 = new String(Base64.decode("Z2V0UGFja2FnZUluZm8=", 0));
                Class<?> cls = f30111b.getClass();
                Class cls2 = Integer.TYPE;
                f30112c = cls.getMethod(str2, String.class, cls2, cls2);
            }
            return (PackageInfo) f30112c.invoke(f30111b, str, 0, Integer.valueOf(i11));
        } catch (Throwable th2) {
            com.getui.gtc.i.c.a.b(th2);
            return null;
        }
    }
}

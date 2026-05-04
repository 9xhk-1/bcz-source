package com.igexin.push.g;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Process;
import android.util.Base64;
import com.getui.gtc.base.GtcProvider;
import java.lang.reflect.Method;

/* loaded from: classes7.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    private static int f38721a = Integer.MIN_VALUE;

    /* renamed from: b, reason: collision with root package name */
    private static String f38722b = "GT_PM";

    /* renamed from: c, reason: collision with root package name */
    private static Object f38723c;

    private static int a() {
        int i11 = f38721a;
        if (i11 != Integer.MIN_VALUE) {
            return i11;
        }
        if (GtcProvider.context() != null) {
            try {
                Class<?> cls = Class.forName(new String(Base64.decode("YW5kcm9pZC5vcy5Vc2VySGFuZGxl", 0)));
                Method declaredMethod = cls.getDeclaredMethod(new String(Base64.decode("Z2V0VXNlcklk", 0)), Integer.TYPE);
                declaredMethod.setAccessible(true);
                int intValue = ((Integer) declaredMethod.invoke(cls, Integer.valueOf(Process.myUid()))).intValue();
                f38721a = intValue;
                return intValue;
            } catch (Throwable th2) {
                th2.getMessage();
            }
        }
        return 0;
    }

    private static PackageInfo a(Object obj, String str, int i11) {
        try {
            IBinder asBinder = ((IInterface) obj).asBinder();
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken(asBinder.getInterfaceDescriptor());
                obtain.writeString(str);
                obtain.writeLong(i11);
                obtain.writeInt(a());
                asBinder.transact(3, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readInt() != 0 ? (PackageInfo) PackageInfo.CREATOR.createFromParcel(obtain2) : null;
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        } catch (Throwable th2) {
            com.igexin.c.a.c.a.a(th2);
            return null;
        }
    }

    public static PackageInfo a(String str, int i11) throws PackageManager.NameNotFoundException {
        PackageInfo a11 = a(str, i11, a());
        if (a11 != null) {
            return a11;
        }
        throw new PackageManager.NameNotFoundException(str + " not found");
    }

    private static PackageInfo a(String str, int i11, int i12) {
        try {
            if (f38723c == null) {
                f38723c = Class.forName(new String(Base64.decode("YW5kcm9pZC5hcHAuQWN0aXZpdHlUaHJlYWQ=", 0))).getMethod(new String(Base64.decode("Z2V0UGFja2FnZU1hbmFnZXI=", 0)), null).invoke(null, null);
            }
            if (Build.VERSION.SDK_INT >= 33) {
                return a(f38723c, str, i11);
            }
            String str2 = new String(Base64.decode("Z2V0UGFja2FnZUluZm8=", 0));
            Class<?> cls = f38723c.getClass();
            Class cls2 = Integer.TYPE;
            return (PackageInfo) cls.getMethod(str2, String.class, cls2, cls2).invoke(f38723c, str, Integer.valueOf(i11), Integer.valueOf(i12));
        } catch (Throwable th2) {
            th2.getMessage();
            return null;
        }
    }
}

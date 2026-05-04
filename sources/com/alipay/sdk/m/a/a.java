package com.alipay.sdk.m.a;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Binder;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public interface a extends IInterface {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.alipay.sdk.m.a.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0160a extends Binder implements a {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: com.alipay.sdk.m.a.a$a$a, reason: collision with other inner class name */
        public static class C0161a implements a {

            /* renamed from: a, reason: collision with root package name */
            public IBinder f10457a;

            public C0161a(IBinder iBinder) {
                this.f10457a = iBinder;
            }

            public String a(String str, String str2, String str3) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.heytap.openid.IOpenID");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeString(str3);
                    this.f10457a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f10457a;
            }
        }

        public static a a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.heytap.openid.IOpenID");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof a)) ? new C0161a(iBinder) : (a) queryLocalInterface;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b {

        /* renamed from: a, reason: collision with root package name */
        public static boolean f10458a = false;

        /* renamed from: b, reason: collision with root package name */
        public static boolean f10459b = false;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c {

        /* renamed from: a, reason: collision with root package name */
        public a f10460a = null;

        /* renamed from: b, reason: collision with root package name */
        public String f10461b = null;

        /* renamed from: c, reason: collision with root package name */
        public String f10462c = null;

        /* renamed from: d, reason: collision with root package name */
        public final Object f10463d = new Object();

        /* renamed from: e, reason: collision with root package name */
        public ServiceConnection f10464e = new ServiceConnectionC0162a();

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: com.alipay.sdk.m.a.a$c$a, reason: collision with other inner class name */
        public class ServiceConnectionC0162a implements ServiceConnection {
            public ServiceConnectionC0162a() {
            }

            @Override // android.content.ServiceConnection
            public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                c.this.f10460a = AbstractBinderC0160a.a(iBinder);
                synchronized (c.this.f10463d) {
                    c.this.f10463d.notify();
                }
            }

            @Override // android.content.ServiceConnection
            public void onServiceDisconnected(ComponentName componentName) {
                c.this.f10460a = null;
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class b {

            /* renamed from: a, reason: collision with root package name */
            public static final c f10466a = new c(null);
        }

        public /* synthetic */ c(ServiceConnectionC0162a serviceConnectionC0162a) {
        }

        public boolean a(Context context) {
            long longVersionCode;
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.heytap.openid", 0);
                if (Build.VERSION.SDK_INT < 28) {
                    return packageInfo != null && packageInfo.versionCode >= 1;
                }
                if (packageInfo != null) {
                    longVersionCode = packageInfo.getLongVersionCode();
                    if (longVersionCode >= 1) {
                        return true;
                    }
                }
                return false;
            } catch (PackageManager.NameNotFoundException e11) {
                e11.printStackTrace();
                return false;
            }
        }

        public final String b(Context context, String str) {
            Signature[] signatureArr;
            if (TextUtils.isEmpty(this.f10461b)) {
                this.f10461b = context.getPackageName();
            }
            if (TextUtils.isEmpty(this.f10462c)) {
                String str2 = null;
                try {
                    signatureArr = context.getPackageManager().getPackageInfo(this.f10461b, 64).signatures;
                } catch (PackageManager.NameNotFoundException e11) {
                    e11.printStackTrace();
                    signatureArr = null;
                }
                if (signatureArr != null && signatureArr.length > 0) {
                    byte[] byteArray = signatureArr[0].toByteArray();
                    try {
                        MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
                        if (messageDigest != null) {
                            byte[] digest = messageDigest.digest(byteArray);
                            StringBuilder sb2 = new StringBuilder();
                            for (byte b11 : digest) {
                                sb2.append(Integer.toHexString((b11 & 255) | 256).substring(1, 3));
                            }
                            str2 = sb2.toString();
                        }
                    } catch (NoSuchAlgorithmException e12) {
                        e12.printStackTrace();
                    }
                }
                this.f10462c = str2;
            }
            String a11 = ((AbstractBinderC0160a.C0161a) this.f10460a).a(this.f10461b, this.f10462c, str);
            return TextUtils.isEmpty(a11) ? "" : a11;
        }

        public synchronized String a(Context context, String str) {
            try {
            } catch (Throwable th2) {
                throw th2;
            }
            if (Looper.myLooper() != Looper.getMainLooper()) {
                if (this.f10460a == null) {
                    Intent intent = new Intent();
                    intent.setComponent(new ComponentName("com.heytap.openid", "com.heytap.openid.IdentifyService"));
                    intent.setAction("action.com.heytap.openid.OPEN_ID_SERVICE");
                    if (context.bindService(intent, this.f10464e, 1)) {
                        synchronized (this.f10463d) {
                            try {
                                this.f10463d.wait(3000L);
                            } catch (InterruptedException e11) {
                                e11.printStackTrace();
                            }
                        }
                    }
                    if (this.f10460a == null) {
                        return "";
                    }
                    try {
                        return b(context, str);
                    } catch (RemoteException e12) {
                        e12.printStackTrace();
                        return "";
                    }
                }
                try {
                    return b(context, str);
                } catch (RemoteException e13) {
                    e13.printStackTrace();
                    return "";
                }
                throw th2;
            }
            throw new IllegalStateException("Cannot run on MainThread");
        }
    }
}

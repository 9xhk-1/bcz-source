package com.alipay.sdk.m.q0;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public interface a extends IInterface {
    String a() throws RemoteException;

    String a(String str) throws RemoteException;

    String b() throws RemoteException;

    String b(String str) throws RemoteException;

    boolean c() throws RemoteException;

    boolean c(String str) throws RemoteException;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.alipay.sdk.m.q0.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0172a extends Binder implements a {

        /* renamed from: a, reason: collision with root package name */
        public static final String f10967a = "com.zui.deviceidservice.IDeviceidInterface";

        /* renamed from: b, reason: collision with root package name */
        public static final int f10968b = 1;

        /* renamed from: c, reason: collision with root package name */
        public static final int f10969c = 2;

        /* renamed from: d, reason: collision with root package name */
        public static final int f10970d = 3;

        /* renamed from: e, reason: collision with root package name */
        public static final int f10971e = 4;

        /* renamed from: f, reason: collision with root package name */
        public static final int f10972f = 5;

        /* renamed from: g, reason: collision with root package name */
        public static final int f10973g = 6;

        public AbstractBinderC0172a() {
            attachInterface(this, f10967a);
        }

        public static a a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(f10967a);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof a)) ? new C0173a(iBinder) : (a) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i11, Parcel parcel, Parcel parcel2, int i12) throws RemoteException {
            if (i11 == 1598968902) {
                parcel2.writeString(f10967a);
                return true;
            }
            switch (i11) {
                case 1:
                    parcel.enforceInterface(f10967a);
                    String a11 = a();
                    parcel2.writeNoException();
                    parcel2.writeString(a11);
                    return true;
                case 2:
                    parcel.enforceInterface(f10967a);
                    String b11 = b();
                    parcel2.writeNoException();
                    parcel2.writeString(b11);
                    return true;
                case 3:
                    parcel.enforceInterface(f10967a);
                    boolean c11 = c();
                    parcel2.writeNoException();
                    parcel2.writeInt(c11 ? 1 : 0);
                    return true;
                case 4:
                    parcel.enforceInterface(f10967a);
                    String b12 = b(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeString(b12);
                    return true;
                case 5:
                    parcel.enforceInterface(f10967a);
                    String a12 = a(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeString(a12);
                    return true;
                case 6:
                    parcel.enforceInterface(f10967a);
                    boolean c12 = c(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(c12 ? 1 : 0);
                    return true;
                default:
                    return super.onTransact(i11, parcel, parcel2, i12);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: com.alipay.sdk.m.q0.a$a$a, reason: collision with other inner class name */
        public static class C0173a implements a {

            /* renamed from: a, reason: collision with root package name */
            public IBinder f10974a;

            public C0173a(IBinder iBinder) {
                this.f10974a = iBinder;
            }

            @Override // com.alipay.sdk.m.q0.a
            public String a() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC0172a.f10967a);
                    this.f10974a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f10974a;
            }

            @Override // com.alipay.sdk.m.q0.a
            public String b() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC0172a.f10967a);
                    this.f10974a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.alipay.sdk.m.q0.a
            public boolean c() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC0172a.f10967a);
                    this.f10974a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String d() {
                return AbstractBinderC0172a.f10967a;
            }

            @Override // com.alipay.sdk.m.q0.a
            public String a(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC0172a.f10967a);
                    obtain.writeString(str);
                    this.f10974a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.alipay.sdk.m.q0.a
            public String b(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC0172a.f10967a);
                    obtain.writeString(str);
                    this.f10974a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.alipay.sdk.m.q0.a
            public boolean c(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC0172a.f10967a);
                    obtain.writeString(str);
                    this.f10974a.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}

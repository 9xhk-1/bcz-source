package com.alipay.sdk.m.k0;

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

    String b(String str) throws RemoteException;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.alipay.sdk.m.k0.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0167a extends Binder implements a {

        /* renamed from: a, reason: collision with root package name */
        public static final String f10693a = "com.samsung.android.deviceidservice.IDeviceIdService";

        /* renamed from: b, reason: collision with root package name */
        public static final int f10694b = 1;

        /* renamed from: c, reason: collision with root package name */
        public static final int f10695c = 2;

        /* renamed from: d, reason: collision with root package name */
        public static final int f10696d = 3;

        public AbstractBinderC0167a() {
            attachInterface(this, f10693a);
        }

        public static a a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(f10693a);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof a)) ? new C0168a(iBinder) : (a) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i11, Parcel parcel, Parcel parcel2, int i12) throws RemoteException {
            if (i11 == 1) {
                parcel.enforceInterface(f10693a);
                String a11 = a();
                parcel2.writeNoException();
                parcel2.writeString(a11);
                return true;
            }
            if (i11 == 2) {
                parcel.enforceInterface(f10693a);
                String b11 = b(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeString(b11);
                return true;
            }
            if (i11 != 3) {
                if (i11 != 1598968902) {
                    return super.onTransact(i11, parcel, parcel2, i12);
                }
                parcel2.writeString(f10693a);
                return true;
            }
            parcel.enforceInterface(f10693a);
            String a12 = a(parcel.readString());
            parcel2.writeNoException();
            parcel2.writeString(a12);
            return true;
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: com.alipay.sdk.m.k0.a$a$a, reason: collision with other inner class name */
        public static class C0168a implements a {

            /* renamed from: a, reason: collision with root package name */
            public IBinder f10697a;

            public C0168a(IBinder iBinder) {
                this.f10697a = iBinder;
            }

            @Override // com.alipay.sdk.m.k0.a
            public String a() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC0167a.f10693a);
                    this.f10697a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f10697a;
            }

            @Override // com.alipay.sdk.m.k0.a
            public String b(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC0167a.f10693a);
                    obtain.writeString(str);
                    this.f10697a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String d() {
                return AbstractBinderC0167a.f10693a;
            }

            @Override // com.alipay.sdk.m.k0.a
            public String a(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC0167a.f10693a);
                    obtain.writeString(str);
                    this.f10697a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
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

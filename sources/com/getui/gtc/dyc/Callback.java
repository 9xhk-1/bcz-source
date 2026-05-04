package com.getui.gtc.dyc;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.Map;

/* loaded from: classes6.dex */
public interface Callback extends IInterface {

    public static abstract class a extends Binder implements Callback {

        /* renamed from: com.getui.gtc.dyc.Callback$a$a, reason: collision with other inner class name */
        public static class C0354a implements Callback {

            /* renamed from: a, reason: collision with root package name */
            public static Callback f29970a;

            /* renamed from: c, reason: collision with root package name */
            private IBinder f29971c;

            public C0354a(IBinder iBinder) {
                this.f29971c = iBinder;
            }

            @Override // com.getui.gtc.dyc.Callback
            public void a(Map map, Map map2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.getui.gtc.dyc.Callback");
                    obtain.writeMap(map);
                    obtain.writeMap(map2);
                    if (this.f29971c.transact(1, obtain, obtain2, 0) || a.a() == null) {
                        obtain2.readException();
                    } else {
                        a.a().a(map, map2);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f29971c;
            }

            @Override // com.getui.gtc.dyc.Callback
            public void b(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.getui.gtc.dyc.Callback");
                    obtain.writeString(str);
                    if (this.f29971c.transact(2, obtain, obtain2, 0) || a.a() == null) {
                        obtain2.readException();
                    } else {
                        a.a().b(str);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "com.getui.gtc.dyc.Callback");
        }

        public static Callback a() {
            return C0354a.f29970a;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i11, Parcel parcel, Parcel parcel2, int i12) throws RemoteException {
            if (i11 == 1) {
                parcel.enforceInterface("com.getui.gtc.dyc.Callback");
                ClassLoader classLoader = getClass().getClassLoader();
                a(parcel.readHashMap(classLoader), parcel.readHashMap(classLoader));
            } else {
                if (i11 != 2) {
                    if (i11 != 1598968902) {
                        return super.onTransact(i11, parcel, parcel2, i12);
                    }
                    parcel2.writeString("com.getui.gtc.dyc.Callback");
                    return true;
                }
                parcel.enforceInterface("com.getui.gtc.dyc.Callback");
                b(parcel.readString());
            }
            parcel2.writeNoException();
            return true;
        }

        public static Callback a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.getui.gtc.dyc.Callback");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof Callback)) ? new C0354a(iBinder) : (Callback) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }

    void a(Map map, Map map2) throws RemoteException;

    void b(String str) throws RemoteException;
}

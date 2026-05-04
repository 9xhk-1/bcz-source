package com.baicizhan.client.fm.service;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.baicizhan.client.fm.service.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public interface b extends IInterface {

    /* renamed from: h0, reason: collision with root package name */
    public static final String f17480h0 = "com.baicizhan.client.fm.service.IFmService";

    void I(int index) throws RemoteException;

    void M() throws RemoteException;

    void N(c callback) throws RemoteException;

    void P(boolean high) throws RemoteException;

    void b0(c callback) throws RemoteException;

    void d(String absPath) throws RemoteException;

    void d0() throws RemoteException;

    void f0() throws RemoteException;

    void k0(String notifyJson) throws RemoteException;

    void pause() throws RemoteException;

    void play() throws RemoteException;

    void r0(int index) throws RemoteException;

    void stop() throws RemoteException;

    void t0(int limit) throws RemoteException;

    void toggle() throws RemoteException;

    void u0() throws RemoteException;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a implements b {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.baicizhan.client.fm.service.b
        public void M() throws RemoteException {
        }

        @Override // com.baicizhan.client.fm.service.b
        public void d0() throws RemoteException {
        }

        @Override // com.baicizhan.client.fm.service.b
        public void f0() throws RemoteException {
        }

        @Override // com.baicizhan.client.fm.service.b
        public void pause() throws RemoteException {
        }

        @Override // com.baicizhan.client.fm.service.b
        public void play() throws RemoteException {
        }

        @Override // com.baicizhan.client.fm.service.b
        public void stop() throws RemoteException {
        }

        @Override // com.baicizhan.client.fm.service.b
        public void toggle() throws RemoteException {
        }

        @Override // com.baicizhan.client.fm.service.b
        public void u0() throws RemoteException {
        }

        @Override // com.baicizhan.client.fm.service.b
        public void I(int index) throws RemoteException {
        }

        @Override // com.baicizhan.client.fm.service.b
        public void N(c callback) throws RemoteException {
        }

        @Override // com.baicizhan.client.fm.service.b
        public void P(boolean high) throws RemoteException {
        }

        @Override // com.baicizhan.client.fm.service.b
        public void b0(c callback) throws RemoteException {
        }

        @Override // com.baicizhan.client.fm.service.b
        public void d(String absPath) throws RemoteException {
        }

        @Override // com.baicizhan.client.fm.service.b
        public void k0(String notifyJson) throws RemoteException {
        }

        @Override // com.baicizhan.client.fm.service.b
        public void r0(int index) throws RemoteException {
        }

        @Override // com.baicizhan.client.fm.service.b
        public void t0(int limit) throws RemoteException {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.client.fm.service.b$b, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0277b extends Binder implements b {

        /* renamed from: a, reason: collision with root package name */
        public static final int f17481a = 1;

        /* renamed from: b, reason: collision with root package name */
        public static final int f17482b = 2;

        /* renamed from: c, reason: collision with root package name */
        public static final int f17483c = 3;

        /* renamed from: d, reason: collision with root package name */
        public static final int f17484d = 4;

        /* renamed from: e, reason: collision with root package name */
        public static final int f17485e = 5;

        /* renamed from: f, reason: collision with root package name */
        public static final int f17486f = 6;

        /* renamed from: g, reason: collision with root package name */
        public static final int f17487g = 7;

        /* renamed from: h, reason: collision with root package name */
        public static final int f17488h = 8;

        /* renamed from: i, reason: collision with root package name */
        public static final int f17489i = 9;

        /* renamed from: j, reason: collision with root package name */
        public static final int f17490j = 10;

        /* renamed from: k, reason: collision with root package name */
        public static final int f17491k = 11;

        /* renamed from: l, reason: collision with root package name */
        public static final int f17492l = 12;

        /* renamed from: m, reason: collision with root package name */
        public static final int f17493m = 13;

        /* renamed from: n, reason: collision with root package name */
        public static final int f17494n = 14;

        /* renamed from: o, reason: collision with root package name */
        public static final int f17495o = 15;

        /* renamed from: p, reason: collision with root package name */
        public static final int f17496p = 16;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: com.baicizhan.client.fm.service.b$b$a */
        public static class a implements b {

            /* renamed from: a, reason: collision with root package name */
            public IBinder f17497a;

            public a(IBinder remote) {
                this.f17497a = remote;
            }

            @Override // com.baicizhan.client.fm.service.b
            public void I(int index) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.f17480h0);
                    obtain.writeInt(index);
                    this.f17497a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.baicizhan.client.fm.service.b
            public void M() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.f17480h0);
                    this.f17497a.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.baicizhan.client.fm.service.b
            public void N(c callback) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.f17480h0);
                    obtain.writeStrongInterface(callback);
                    this.f17497a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.baicizhan.client.fm.service.b
            public void P(boolean z11) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.f17480h0);
                    obtain.writeInt(z11 ? 1 : 0);
                    this.f17497a.transact(12, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f17497a;
            }

            @Override // com.baicizhan.client.fm.service.b
            public void b0(c callback) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.f17480h0);
                    obtain.writeStrongInterface(callback);
                    this.f17497a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.baicizhan.client.fm.service.b
            public void d(String absPath) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.f17480h0);
                    obtain.writeString(absPath);
                    this.f17497a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.baicizhan.client.fm.service.b
            public void d0() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.f17480h0);
                    this.f17497a.transact(13, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.baicizhan.client.fm.service.b
            public void f0() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.f17480h0);
                    this.f17497a.transact(16, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.baicizhan.client.fm.service.b
            public void k0(String notifyJson) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.f17480h0);
                    obtain.writeString(notifyJson);
                    this.f17497a.transact(15, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.baicizhan.client.fm.service.b
            public void pause() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.f17480h0);
                    this.f17497a.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.baicizhan.client.fm.service.b
            public void play() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.f17480h0);
                    this.f17497a.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.baicizhan.client.fm.service.b
            public void r0(int index) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.f17480h0);
                    obtain.writeInt(index);
                    this.f17497a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.baicizhan.client.fm.service.b
            public void stop() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.f17480h0);
                    this.f17497a.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.baicizhan.client.fm.service.b
            public void t0(int limit) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.f17480h0);
                    obtain.writeInt(limit);
                    this.f17497a.transact(14, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.baicizhan.client.fm.service.b
            public void toggle() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.f17480h0);
                    this.f17497a.transact(11, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.baicizhan.client.fm.service.b
            public void u0() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.f17480h0);
                    this.f17497a.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String x0() {
                return b.f17480h0;
            }
        }

        public AbstractBinderC0277b() {
            attachInterface(this, b.f17480h0);
        }

        public static b x0(IBinder obj) {
            if (obj == null) {
                return null;
            }
            IInterface queryLocalInterface = obj.queryLocalInterface(b.f17480h0);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof b)) ? new a(obj) : (b) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            if (code >= 1 && code <= 16777215) {
                data.enforceInterface(b.f17480h0);
            }
            if (code == 1598968902) {
                reply.writeString(b.f17480h0);
                return true;
            }
            switch (code) {
                case 1:
                    N(c.b.x0(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                case 2:
                    b0(c.b.x0(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                case 3:
                    I(data.readInt());
                    reply.writeNoException();
                    return true;
                case 4:
                    r0(data.readInt());
                    reply.writeNoException();
                    return true;
                case 5:
                    d(data.readString());
                    reply.writeNoException();
                    return true;
                case 6:
                    play();
                    reply.writeNoException();
                    return true;
                case 7:
                    u0();
                    reply.writeNoException();
                    return true;
                case 8:
                    M();
                    reply.writeNoException();
                    return true;
                case 9:
                    pause();
                    reply.writeNoException();
                    return true;
                case 10:
                    stop();
                    reply.writeNoException();
                    return true;
                case 11:
                    toggle();
                    reply.writeNoException();
                    return true;
                case 12:
                    P(data.readInt() != 0);
                    reply.writeNoException();
                    return true;
                case 13:
                    d0();
                    reply.writeNoException();
                    return true;
                case 14:
                    t0(data.readInt());
                    reply.writeNoException();
                    return true;
                case 15:
                    k0(data.readString());
                    reply.writeNoException();
                    return true;
                case 16:
                    f0();
                    reply.writeNoException();
                    return true;
                default:
                    return super.onTransact(code, data, reply, flags);
            }
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}

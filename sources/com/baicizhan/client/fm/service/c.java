package com.baicizhan.client.fm.service;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public interface c extends IInterface {

    /* renamed from: i0, reason: collision with root package name */
    public static final String f17498i0 = "com.baicizhan.client.fm.service.IFmServiceCallback";

    void E(int state, int curIndex, int type) throws RemoteException;

    void Q(boolean success, List<String> wordids, List<String> midPaths, int errCode) throws RemoteException;

    void e(int limit, List<String> wordids, List<String> midPaths) throws RemoteException;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class b extends Binder implements c {

        /* renamed from: a, reason: collision with root package name */
        public static final int f17499a = 1;

        /* renamed from: b, reason: collision with root package name */
        public static final int f17500b = 2;

        /* renamed from: c, reason: collision with root package name */
        public static final int f17501c = 3;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class a implements c {

            /* renamed from: a, reason: collision with root package name */
            public IBinder f17502a;

            public a(IBinder remote) {
                this.f17502a = remote;
            }

            @Override // com.baicizhan.client.fm.service.c
            public void E(int state, int curIndex, int type) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(c.f17498i0);
                    obtain.writeInt(state);
                    obtain.writeInt(curIndex);
                    obtain.writeInt(type);
                    this.f17502a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.baicizhan.client.fm.service.c
            public void Q(boolean z11, List<String> list, List<String> list2, int i11) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(c.f17498i0);
                    obtain.writeInt(z11 ? 1 : 0);
                    obtain.writeStringList(list);
                    obtain.writeStringList(list2);
                    obtain.writeInt(i11);
                    this.f17502a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    obtain2.readStringList(list);
                    obtain2.readStringList(list2);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f17502a;
            }

            @Override // com.baicizhan.client.fm.service.c
            public void e(int limit, List<String> wordids, List<String> midPaths) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(c.f17498i0);
                    obtain.writeInt(limit);
                    obtain.writeStringList(wordids);
                    obtain.writeStringList(midPaths);
                    this.f17502a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    obtain2.readStringList(wordids);
                    obtain2.readStringList(midPaths);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String x0() {
                return c.f17498i0;
            }
        }

        public b() {
            attachInterface(this, c.f17498i0);
        }

        public static c x0(IBinder obj) {
            if (obj == null) {
                return null;
            }
            IInterface queryLocalInterface = obj.queryLocalInterface(c.f17498i0);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof c)) ? new a(obj) : (c) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            if (code >= 1 && code <= 16777215) {
                data.enforceInterface(c.f17498i0);
            }
            if (code == 1598968902) {
                reply.writeString(c.f17498i0);
                return true;
            }
            if (code == 1) {
                boolean z11 = data.readInt() != 0;
                ArrayList<String> createStringArrayList = data.createStringArrayList();
                ArrayList<String> createStringArrayList2 = data.createStringArrayList();
                Q(z11, createStringArrayList, createStringArrayList2, data.readInt());
                reply.writeNoException();
                reply.writeStringList(createStringArrayList);
                reply.writeStringList(createStringArrayList2);
            } else if (code == 2) {
                int readInt = data.readInt();
                ArrayList<String> createStringArrayList3 = data.createStringArrayList();
                ArrayList<String> createStringArrayList4 = data.createStringArrayList();
                e(readInt, createStringArrayList3, createStringArrayList4);
                reply.writeNoException();
                reply.writeStringList(createStringArrayList3);
                reply.writeStringList(createStringArrayList4);
            } else {
                if (code != 3) {
                    return super.onTransact(code, data, reply, flags);
                }
                E(data.readInt(), data.readInt(), data.readInt());
                reply.writeNoException();
            }
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a implements c {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.baicizhan.client.fm.service.c
        public void E(int state, int curIndex, int type) throws RemoteException {
        }

        @Override // com.baicizhan.client.fm.service.c
        public void e(int limit, List<String> wordids, List<String> midPaths) throws RemoteException {
        }

        @Override // com.baicizhan.client.fm.service.c
        public void Q(boolean success, List<String> wordids, List<String> midPaths, int errCode) throws RemoteException {
        }
    }
}

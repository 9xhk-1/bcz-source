package com.bun.miitmdid;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes6.dex */
public interface n0 extends IInterface {

    public static abstract class a extends Binder implements n0 {
        public a() {
            attachInterface(this, "com.hihonor.cloudservice.oaid.IOAIDCallBack");
        }

        @Override // android.os.IInterface
        public native IBinder asBinder();

        @Override // android.os.Binder
        public native boolean onTransact(int i11, Parcel parcel, Parcel parcel2, int i12);
    }

    void a(int i11, long j11, boolean z11, float f11, double d11, String str);

    void a(int i11, Bundle bundle);
}

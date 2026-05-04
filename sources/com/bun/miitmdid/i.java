package com.bun.miitmdid;

import android.content.Context;
import android.os.IBinder;
import com.asus.msa.SupplementaryDID.IDidAidlInterface;
import com.asus.msa.sdid.IDIDBinderStatusListener;
import com.asus.msa.sdid.SupplementaryDIDManager;

/* loaded from: classes6.dex */
public class i extends m implements IDIDBinderStatusListener {

    /* renamed from: a, reason: collision with root package name */
    public Context f28936a;

    /* renamed from: b, reason: collision with root package name */
    public final SupplementaryDIDManager f28937b;

    public i(Context context) {
        this.f28936a = context;
        this.f28937b = new SupplementaryDIDManager(context);
    }

    @Override // android.os.IInterface
    public native IBinder asBinder();

    @Override // com.bun.miitmdid.interfaces.IIdProvider
    public native void doStart();

    @Override // com.bun.miitmdid.m, com.bun.miitmdid.interfaces.IIdProvider
    public native boolean isSync();

    @Override // com.asus.msa.sdid.IDIDBinderStatusListener
    public native void onError();

    @Override // com.asus.msa.sdid.IDIDBinderStatusListener
    public native void onSuccess(IDidAidlInterface iDidAidlInterface);

    @Override // com.bun.miitmdid.interfaces.IIdProvider
    public native void shutDown();
}

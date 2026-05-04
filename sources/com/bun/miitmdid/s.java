package com.bun.miitmdid;

import android.content.Context;
import com.zui.opendeviceidlibrary.OpenDeviceId;

/* loaded from: classes6.dex */
public class s extends m implements OpenDeviceId.CallBack<String> {

    /* renamed from: a, reason: collision with root package name */
    public Context f28974a;

    /* renamed from: b, reason: collision with root package name */
    public OpenDeviceId f28975b;

    public s(Context context) {
        this.f28974a = context;
    }

    @Override // com.zui.opendeviceidlibrary.OpenDeviceId.CallBack
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public native void serviceConnected(String str, OpenDeviceId openDeviceId);

    @Override // com.bun.miitmdid.interfaces.IIdProvider
    public native void doStart();

    @Override // com.bun.miitmdid.m, com.bun.miitmdid.interfaces.IIdProvider
    public native boolean isSync();

    @Override // com.bun.miitmdid.interfaces.IIdProvider
    public native void shutDown();
}

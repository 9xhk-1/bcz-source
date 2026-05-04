package com.vivo.push.ups;

import android.content.Context;
import com.vivo.push.IPushActionListener;
import com.vivo.push.PushClient;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
final class a implements IPushActionListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ UPSRegisterCallback f45069a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Context f45070b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ VUpsManager f45071c;

    public a(VUpsManager vUpsManager, UPSRegisterCallback uPSRegisterCallback, Context context) {
        this.f45071c = vUpsManager;
        this.f45069a = uPSRegisterCallback;
        this.f45070b = context;
    }

    @Override // com.vivo.push.IPushActionListener
    public final void onStateChanged(int i11) {
        this.f45069a.onResult(new TokenResult(i11, PushClient.getInstance(this.f45070b).getRegId()));
    }
}

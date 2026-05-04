package com.vivo.push.ups;

import com.vivo.push.IPushActionListener;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
final class c implements IPushActionListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ UPSTurnCallback f45074a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ VUpsManager f45075b;

    public c(VUpsManager vUpsManager, UPSTurnCallback uPSTurnCallback) {
        this.f45075b = vUpsManager;
        this.f45074a = uPSTurnCallback;
    }

    @Override // com.vivo.push.IPushActionListener
    public final void onStateChanged(int i11) {
        this.f45074a.onResult(new CodeResult(i11));
    }
}

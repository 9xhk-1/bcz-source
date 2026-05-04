package com.huawei.hms.common.internal;

import android.app.Activity;
import android.content.Intent;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class DialogRedirectImpl extends DialogRedirect {

    /* renamed from: a, reason: collision with root package name */
    private final Activity f35569a;

    /* renamed from: b, reason: collision with root package name */
    private final int f35570b;

    /* renamed from: c, reason: collision with root package name */
    private final Intent f35571c;

    public DialogRedirectImpl(Intent intent, Activity activity, int i11) {
        this.f35571c = intent;
        this.f35569a = activity;
        this.f35570b = i11;
    }

    @Override // com.huawei.hms.common.internal.DialogRedirect
    public final void redirect() {
        Activity activity;
        Intent intent = this.f35571c;
        if (intent == null || (activity = this.f35569a) == null) {
            return;
        }
        activity.startActivityForResult(intent, this.f35570b);
    }
}

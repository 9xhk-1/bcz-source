package com.alipay.sdk.m.p0;

import android.database.ContentObserver;
import android.util.Log;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class d extends ContentObserver {

    /* renamed from: d, reason: collision with root package name */
    public static final String f10962d = "VMS_IDLG_SDK_Observer";

    /* renamed from: a, reason: collision with root package name */
    public String f10963a;

    /* renamed from: b, reason: collision with root package name */
    public int f10964b;

    /* renamed from: c, reason: collision with root package name */
    public c f10965c;

    public d(c cVar, int i11, String str) {
        super(null);
        this.f10965c = cVar;
        this.f10964b = i11;
        this.f10963a = str;
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z11) {
        c cVar = this.f10965c;
        if (cVar != null) {
            cVar.a(this.f10964b, this.f10963a);
        } else {
            Log.e(f10962d, "mIdentifierIdClient is null");
        }
    }
}

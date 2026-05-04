package com.mob.secverify.pure.core.ope;

import android.content.Context;
import com.mob.MobSDK;
import com.mob.secverify.common.callback.InternalCallback;
import com.mob.secverify.pure.entity.PreVerifyResult;
import com.mob.secverify.pure.entity.VerifyResult;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static String f40830a;

    /* renamed from: b, reason: collision with root package name */
    public static String f40831b;

    /* renamed from: c, reason: collision with root package name */
    public static String f40832c;

    /* renamed from: d, reason: collision with root package name */
    protected String f40833d;

    /* renamed from: e, reason: collision with root package name */
    protected String f40834e;

    /* renamed from: f, reason: collision with root package name */
    protected Context f40835f;

    public a(String str, String str2, String str3) {
        f40831b = str;
        f40832c = str2;
        f40830a = str3;
        this.f40835f = MobSDK.getContext();
        this.f40833d = str;
        this.f40834e = str2;
    }

    public abstract void a(InternalCallback<PreVerifyResult> internalCallback);

    public abstract void b(InternalCallback<VerifyResult> internalCallback);
}

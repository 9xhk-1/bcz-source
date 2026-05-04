package com.mob.secverify.pure.core;

import com.mob.secverify.a.g;
import com.mob.secverify.a.i;
import com.mob.secverify.common.callback.InternalCallback;
import com.mob.secverify.common.exception.VerifyException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static a f40768a;

    /* renamed from: b, reason: collision with root package name */
    private int f40769b = -1;

    /* renamed from: c, reason: collision with root package name */
    private String f40770c;

    /* renamed from: d, reason: collision with root package name */
    private String f40771d;

    private a() {
    }

    public static a a() {
        if (f40768a == null) {
            synchronized (a.class) {
                try {
                    if (f40768a == null) {
                        f40768a = new a();
                    }
                } finally {
                }
            }
        }
        return f40768a;
    }

    public String b() {
        return this.f40770c;
    }

    public String c() {
        return this.f40771d;
    }

    public void b(String str) {
        this.f40771d = str;
    }

    public void a(int i11) {
        this.f40769b = i11;
    }

    public void a(String str) {
        this.f40770c = str;
    }

    public void a(String str, final InternalCallback<com.mob.secverify.a.a> internalCallback) {
        f.a().a(str, new InternalCallback<g>() { // from class: com.mob.secverify.pure.core.a.1
            @Override // com.mob.secverify.common.callback.InternalCallback
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onSuccess(g gVar) {
                if (gVar == null || !gVar.f40660c) {
                    internalCallback.onFailure(new VerifyException(6119145, "No cache"));
                    return;
                }
                i iVar = new i(gVar);
                com.mob.secverify.pure.b.c.a().a(iVar);
                a.this.b(gVar.f40658a);
                internalCallback.onSuccess(iVar);
            }

            @Override // com.mob.secverify.common.callback.InternalCallback
            public void onFailure(VerifyException verifyException) {
                internalCallback.onFailure(verifyException);
            }
        });
    }
}

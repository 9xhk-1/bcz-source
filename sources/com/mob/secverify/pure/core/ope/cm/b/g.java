package com.mob.secverify.pure.core.ope.cm.b;

import android.text.TextUtils;
import com.mob.tools.utils.Hashon;
import java.util.HashMap;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class g {

    /* renamed from: l, reason: collision with root package name */
    protected static Hashon f40988l = new Hashon();

    /* renamed from: m, reason: collision with root package name */
    public String f40989m;

    /* renamed from: n, reason: collision with root package name */
    protected HashMap<String, Object> f40990n = new HashMap<>();

    public g b(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                HashMap<String, Object> fromJson = f40988l.fromJson(str);
                this.f40990n = fromJson;
                this.f40989m = String.valueOf(fromJson.get("resultCode"));
                return this;
            } catch (Throwable th2) {
                com.mob.secverify.b.c.a().a(th2, "[SecPure] ==>%s", "Entity analyse exception.");
            }
        }
        return this;
    }
}

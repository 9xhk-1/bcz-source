package com.mob.secverify.pure.core.ope.cm.b;

import android.text.TextUtils;
import com.mob.tools.utils.Hashon;
import java.io.Serializable;
import java.util.HashMap;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class a implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    protected Hashon f40951a = new Hashon();

    /* renamed from: b, reason: collision with root package name */
    protected HashMap<String, Object> f40952b = new HashMap<>();

    public a a(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                this.f40952b = this.f40951a.fromJson(str);
                return this;
            } catch (Throwable th2) {
                com.mob.secverify.b.c.a().a(th2, "[SecPure] ==>%s", "Entity analyse exception.");
            }
        }
        return this;
    }
}

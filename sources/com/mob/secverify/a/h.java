package com.mob.secverify.a;

import android.text.TextUtils;
import com.mob.tools.utils.Hashon;
import java.io.Serializable;
import java.util.HashMap;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class h implements Serializable {

    /* renamed from: d, reason: collision with root package name */
    protected Hashon f40661d = new Hashon();

    /* renamed from: e, reason: collision with root package name */
    protected HashMap<String, Object> f40662e = new HashMap<>();

    public h b(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                this.f40662e = this.f40661d.fromJson(str);
                return this;
            } catch (Throwable th2) {
                com.mob.secverify.b.c.a().a(th2, "[SecPure] ==>%s", "Entity analyse exception.");
            }
        }
        return this;
    }
}

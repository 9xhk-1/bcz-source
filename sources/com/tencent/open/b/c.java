package com.tencent.open.b;

import android.os.Bundle;
import java.io.Serializable;
import java.util.HashMap;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class c implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap<String, String> f44464a;

    public c(Bundle bundle) {
        this.f44464a = new HashMap<>();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                this.f44464a.put(str, bundle.getString(str));
            }
        }
    }

    public String toString() {
        return "BaseData{time=" + this.f44464a.get("time") + ", name=" + this.f44464a.get("interface_name") + l50.b.f69928j;
    }

    public c(HashMap<String, String> hashMap) {
        this.f44464a = new HashMap<>(hashMap);
    }
}

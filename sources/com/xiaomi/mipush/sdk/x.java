package com.xiaomi.mipush.sdk;

import android.text.TextUtils;

/* loaded from: classes6.dex */
class x {

    /* renamed from: a, reason: collision with root package name */
    int f45235a = 0;

    /* renamed from: a, reason: collision with other field name */
    String f120a = "";

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return !TextUtils.isEmpty(xVar.f120a) && xVar.f120a.equals(this.f120a);
    }
}

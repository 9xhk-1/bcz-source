package com.xiaomi.push;

import android.content.Context;

/* loaded from: classes8.dex */
class ay {

    /* renamed from: a, reason: collision with root package name */
    static int f45278a;

    public static at a(Context context) {
        if (j.m6171a()) {
            f45278a = 1;
            return new ax(context);
        }
        if (aq.a(context)) {
            f45278a = 2;
            return new aq(context);
        }
        if (ba.a(context)) {
            f45278a = 4;
            return new ba(context);
        }
        if (be.a(context)) {
            f45278a = 5;
            return new be(context);
        }
        if (aw.a(context)) {
            f45278a = 3;
            return new au(context);
        }
        f45278a = 0;
        return new bd();
    }
}

package yv;

import android.content.Context;
import androidx.annotation.PluralsRes;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final int f100332a;

    public f(@PluralsRes int i11) {
        this.f100332a = i11;
    }

    @m80.k
    public final String a(@m80.k Context context, int i11) {
        g0.p(context, "context");
        String quantityString = context.getResources().getQuantityString(this.f100332a, i11);
        g0.o(quantityString, "getQuantityString(...)");
        return quantityString;
    }

    public final int b() {
        return this.f100332a;
    }
}

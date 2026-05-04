package yv;

import android.content.Context;
import androidx.annotation.ColorRes;
import androidx.core.content.ContextCompat;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f100328a;

    public b(@ColorRes int i11) {
        this.f100328a = i11;
    }

    public final int a(@m80.k Context context) {
        g0.p(context, "context");
        return ContextCompat.getColor(context, this.f100328a);
    }

    public final int b() {
        return this.f100328a;
    }
}

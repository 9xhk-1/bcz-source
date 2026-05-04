package yv;

import android.content.Context;
import android.graphics.Typeface;
import androidx.annotation.FontRes;
import androidx.core.content.res.ResourcesCompat;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final int f100330a;

    public d(@FontRes int i11) {
        this.f100330a = i11;
    }

    public final int a() {
        return this.f100330a;
    }

    @m80.l
    public final Typeface b(@m80.k Context context) {
        g0.p(context, "context");
        return ResourcesCompat.getFont(context, this.f100330a);
    }
}

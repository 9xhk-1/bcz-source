package com.baicizhan.base;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.g0;
import m80.k;
import w00.o;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final a f15904a = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final String f15905b = "care_mode_settings";

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final String f15906c = "is_care_mode";

    /* renamed from: d, reason: collision with root package name */
    public static final int f15907d = 0;

    @o
    public static final boolean a(@k Context context) {
        g0.p(context, "context");
        return context.getSharedPreferences(f15905b, 0).getBoolean(f15906c, false);
    }

    @o
    public static final void b(@k Context context, boolean z11) {
        g0.p(context, "context");
        context.getSharedPreferences(f15905b, 0).edit().putBoolean(f15906c, z11).apply();
    }
}

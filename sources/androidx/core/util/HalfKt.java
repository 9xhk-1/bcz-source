package androidx.core.util;

import android.annotation.SuppressLint;
import android.util.Half;
import androidx.annotation.RequiresApi;
import kotlin.jvm.internal.u0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@SuppressLint({"ClassVerificationFailure"})
@u0({"SMAP\nHalf.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Half.kt\nandroidx/core/util/HalfKt\n*L\n1#1,60:1\n43#1:61\n*S KotlinDebug\n*F\n+ 1 Half.kt\nandroidx/core/util/HalfKt\n*L\n51#1:61\n*E\n"})
/* loaded from: classes2.dex */
public final class HalfKt {
    @RequiresApi(26)
    @k
    public static final Half toHalf(short s11) {
        Half valueOf;
        valueOf = Half.valueOf(s11);
        return valueOf;
    }

    @RequiresApi(26)
    @k
    public static final Half toHalf(float f11) {
        Half valueOf;
        valueOf = Half.valueOf(f11);
        return valueOf;
    }

    @RequiresApi(26)
    @k
    public static final Half toHalf(@k String str) {
        Half valueOf;
        valueOf = Half.valueOf(str);
        return valueOf;
    }

    @RequiresApi(26)
    @k
    public static final Half toHalf(double d11) {
        Half valueOf;
        valueOf = Half.valueOf((float) d11);
        return valueOf;
    }
}

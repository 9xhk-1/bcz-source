package androidx.core.util;

import android.annotation.SuppressLint;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class PairKt {
    @SuppressLint({"UnknownNullness"})
    public static final <F, S> F component1(@k Pair<F, S> pair) {
        return pair.first;
    }

    @SuppressLint({"UnknownNullness"})
    public static final <F, S> S component2(@k Pair<F, S> pair) {
        return pair.second;
    }

    @k
    public static final <F, S> android.util.Pair<F, S> toAndroidPair(@k kotlin.Pair<? extends F, ? extends S> pair) {
        return new android.util.Pair<>(pair.getFirst(), pair.getSecond());
    }

    @k
    public static final <F, S> Pair<F, S> toAndroidXPair(@k kotlin.Pair<? extends F, ? extends S> pair) {
        return new Pair<>(pair.getFirst(), pair.getSecond());
    }

    @k
    public static final <F, S> kotlin.Pair<F, S> toKotlinPair(@k Pair<F, S> pair) {
        return new kotlin.Pair<>(pair.first, pair.second);
    }

    @SuppressLint({"UnknownNullness"})
    public static final <F, S> F component1(@k android.util.Pair<F, S> pair) {
        return (F) pair.first;
    }

    @SuppressLint({"UnknownNullness"})
    public static final <F, S> S component2(@k android.util.Pair<F, S> pair) {
        return (S) pair.second;
    }

    @k
    public static final <F, S> kotlin.Pair<F, S> toKotlinPair(@k android.util.Pair<F, S> pair) {
        return new kotlin.Pair<>(pair.first, pair.second);
    }
}

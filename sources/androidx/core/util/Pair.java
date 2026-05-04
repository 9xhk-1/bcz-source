package androidx.core.util;

import androidx.annotation.NonNull;
import com.alipay.sdk.m.u.i;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public class Pair<F, S> {
    public final F first;
    public final S second;

    public Pair(F f11, S s11) {
        this.first = f11;
        this.second = s11;
    }

    @NonNull
    public static <A, B> Pair<A, B> create(A a11, B b11) {
        return new Pair<>(a11, b11);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Pair)) {
            return false;
        }
        Pair pair = (Pair) obj;
        return ObjectsCompat.equals(pair.first, this.first) && ObjectsCompat.equals(pair.second, this.second);
    }

    public int hashCode() {
        F f11 = this.first;
        int hashCode = f11 == null ? 0 : f11.hashCode();
        S s11 = this.second;
        return hashCode ^ (s11 != null ? s11.hashCode() : 0);
    }

    @NonNull
    public String toString() {
        return "Pair{" + this.first + " " + this.second + i.f11099d;
    }
}

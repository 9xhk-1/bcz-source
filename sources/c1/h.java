package c1;

import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.util.Pair;
import com.alipay.sdk.m.u.i;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes3.dex */
public class h<T> {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    public T f7471a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    public T f7472b;

    public static boolean a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public void b(T t11, T t12) {
        this.f7471a = t11;
        this.f7472b = t12;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Pair)) {
            return false;
        }
        Pair pair = (Pair) obj;
        return a(pair.first, this.f7471a) && a(pair.second, this.f7472b);
    }

    public int hashCode() {
        T t11 = this.f7471a;
        int hashCode = t11 == null ? 0 : t11.hashCode();
        T t12 = this.f7472b;
        return hashCode ^ (t12 != null ? t12.hashCode() : 0);
    }

    public String toString() {
        return "Pair{" + this.f7471a + " " + this.f7472b + i.f11099d;
    }
}

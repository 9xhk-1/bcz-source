package c1;

import androidx.annotation.RestrictTo;
import e1.k;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes3.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public final List<k> f7456a;

    /* renamed from: b, reason: collision with root package name */
    public final char f7457b;

    /* renamed from: c, reason: collision with root package name */
    public final double f7458c;

    /* renamed from: d, reason: collision with root package name */
    public final double f7459d;

    /* renamed from: e, reason: collision with root package name */
    public final String f7460e;

    /* renamed from: f, reason: collision with root package name */
    public final String f7461f;

    public c(List<k> list, char c11, double d11, double d12, String str, String str2) {
        this.f7456a = list;
        this.f7457b = c11;
        this.f7458c = d11;
        this.f7459d = d12;
        this.f7460e = str;
        this.f7461f = str2;
    }

    public static int c(char c11, String str, String str2) {
        return (((c11 * 31) + str.hashCode()) * 31) + str2.hashCode();
    }

    public List<k> a() {
        return this.f7456a;
    }

    public double b() {
        return this.f7459d;
    }

    public int hashCode() {
        return c(this.f7457b, this.f7461f, this.f7460e);
    }
}

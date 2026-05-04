package qo;

import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.thirdparty.publicsuffix.PublicSuffixType;
import ho.a0;
import ho.m0;
import java.util.List;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@a
@go.b(emulated = true)
@uo.j
/* loaded from: classes7.dex */
public final class e {

    /* renamed from: e, reason: collision with root package name */
    public static final ho.d f82481e = ho.d.d(".。．｡");

    /* renamed from: f, reason: collision with root package name */
    public static final m0 f82482f = m0.h('.');

    /* renamed from: g, reason: collision with root package name */
    public static final a0 f82483g = a0.o('.');

    /* renamed from: h, reason: collision with root package name */
    public static final int f82484h = -1;

    /* renamed from: i, reason: collision with root package name */
    public static final int f82485i = -2;

    /* renamed from: j, reason: collision with root package name */
    public static final int f82486j = 127;

    /* renamed from: k, reason: collision with root package name */
    public static final int f82487k = 253;

    /* renamed from: l, reason: collision with root package name */
    public static final int f82488l = 63;

    /* renamed from: m, reason: collision with root package name */
    public static final ho.d f82489m;

    /* renamed from: n, reason: collision with root package name */
    public static final ho.d f82490n;

    /* renamed from: o, reason: collision with root package name */
    public static final ho.d f82491o;

    /* renamed from: p, reason: collision with root package name */
    public static final ho.d f82492p;

    /* renamed from: a, reason: collision with root package name */
    public final String f82493a;

    /* renamed from: b, reason: collision with root package name */
    public final ImmutableList<String> f82494b;

    /* renamed from: c, reason: collision with root package name */
    @vo.b
    public int f82495c = -2;

    /* renamed from: d, reason: collision with root package name */
    @vo.b
    public int f82496d = -2;

    static {
        ho.d d11 = ho.d.d("-_");
        f82489m = d11;
        ho.d m11 = ho.d.m('0', '9');
        f82490n = m11;
        ho.d I = ho.d.m('a', io.ktor.util.date.b.f62003i).I(ho.d.m('A', 'Z'));
        f82491o = I;
        f82492p = m11.I(I).I(d11);
    }

    public e(String name) {
        String g11 = ho.c.g(f82481e.N(name, '.'));
        g11 = g11.endsWith(".") ? g11.substring(0, g11.length() - 1) : g11;
        Preconditions.checkArgument(g11.length() <= 253, "Domain name too long: '%s':", g11);
        this.f82493a = g11;
        ImmutableList<String> copyOf = ImmutableList.copyOf(f82482f.n(g11));
        this.f82494b = copyOf;
        Preconditions.checkArgument(copyOf.size() <= 127, "Domain has too many parts: '%s'", g11);
        Preconditions.checkArgument(y(copyOf), "Not a valid domain name: '%s'", g11);
    }

    @uo.a
    public static e d(String domain) {
        return new e((String) Preconditions.checkNotNull(domain));
    }

    public static boolean n(String name) {
        try {
            d(name);
            return true;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    public static boolean o(Optional<PublicSuffixType> desiredType, Optional<PublicSuffixType> actualType) {
        return desiredType.isPresent() ? desiredType.equals(actualType) : actualType.isPresent();
    }

    public static boolean x(String part, boolean isFinalPart) {
        if (part.length() >= 1 && part.length() <= 63) {
            if (!f82492p.C(ho.d.f().P(part))) {
                return false;
            }
            ho.d dVar = f82489m;
            if (!dVar.B(part.charAt(0)) && !dVar.B(part.charAt(part.length() - 1))) {
                return (isFinalPart && f82490n.B(part.charAt(0))) ? false : true;
            }
        }
        return false;
    }

    public static boolean y(List<String> parts) {
        int size = parts.size() - 1;
        if (!x(parts.get(size), true)) {
            return false;
        }
        for (int i11 = 0; i11 < size; i11++) {
            if (!x(parts.get(i11), false)) {
                return false;
            }
        }
        return true;
    }

    public final e a(int levels) {
        ImmutableList<String> immutableList = this.f82494b;
        ImmutableList<String> subList = immutableList.subList(levels, immutableList.size());
        int i11 = levels;
        for (int i12 = 0; i12 < levels; i12++) {
            i11 += this.f82494b.get(i12).length();
        }
        return new e(this.f82493a.substring(i11), subList);
    }

    public e b(String leftParts) {
        return d(((String) Preconditions.checkNotNull(leftParts)) + "." + this.f82493a);
    }

    public final int c(Optional<PublicSuffixType> desiredType) {
        int size = this.f82494b.size();
        for (int i11 = 0; i11 < size; i11++) {
            String k11 = f82483g.k(this.f82494b.subList(i11, size));
            if (i11 > 0 && o(desiredType, Optional.fromNullable(ep.a.f50056b.get(k11)))) {
                return i11 - 1;
            }
            if (o(desiredType, Optional.fromNullable(ep.a.f50055a.get(k11)))) {
                return i11;
            }
            if (ep.a.f50057c.containsKey(k11)) {
                return i11 + 1;
            }
        }
        return -1;
    }

    public boolean e() {
        return this.f82494b.size() > 1;
    }

    public boolean equals(@CheckForNull Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof e) {
            return this.f82493a.equals(((e) object).f82493a);
        }
        return false;
    }

    public boolean f() {
        return s() != -1;
    }

    public boolean g() {
        return u() != -1;
    }

    public boolean h() {
        return s() == 0;
    }

    public int hashCode() {
        return this.f82493a.hashCode();
    }

    public boolean i() {
        return u() == 0;
    }

    public boolean j() {
        return u() == 1;
    }

    public boolean k() {
        return s() == 1;
    }

    public boolean l() {
        return s() > 0;
    }

    public boolean m() {
        return u() > 0;
    }

    public e p() {
        Preconditions.checkState(e(), "Domain '%s' has no parent", this.f82493a);
        return a(1);
    }

    public ImmutableList<String> q() {
        return this.f82494b;
    }

    @CheckForNull
    public e r() {
        if (f()) {
            return a(s());
        }
        return null;
    }

    public final int s() {
        int i11 = this.f82495c;
        if (i11 != -2) {
            return i11;
        }
        int c11 = c(Optional.absent());
        this.f82495c = c11;
        return c11;
    }

    @CheckForNull
    public e t() {
        if (g()) {
            return a(u());
        }
        return null;
    }

    public String toString() {
        return this.f82493a;
    }

    public final int u() {
        int i11 = this.f82496d;
        if (i11 != -2) {
            return i11;
        }
        int c11 = c(Optional.of(PublicSuffixType.REGISTRY));
        this.f82496d = c11;
        return c11;
    }

    public e v() {
        if (j()) {
            return this;
        }
        Preconditions.checkState(m(), "Not under a registry suffix: %s", this.f82493a);
        return a(u() - 1);
    }

    public e w() {
        if (k()) {
            return this;
        }
        Preconditions.checkState(l(), "Not under a public suffix: %s", this.f82493a);
        return a(s() - 1);
    }

    public e(String name, ImmutableList<String> parts) {
        Preconditions.checkArgument(!parts.isEmpty(), "Cannot create an InternetDomainName with zero parts.");
        this.f82493a = name;
        this.f82494b = parts;
    }
}

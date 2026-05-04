package mx;

import a00.i0;
import io.ktor.http.content.VersionCheckResult;
import ix.m0;
import ix.p0;
import ix.q0;
import ix.x0;
import ix.y0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.u0;
import u30.k0;
import u30.r0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nVersions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Versions.kt\nio/ktor/http/content/EntityTagVersion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,261:1\n1#2:262\n1755#3,3:263\n*S KotlinDebug\n*F\n+ 1 Versions.kt\nio/ktor/http/content/EntityTagVersion\n*L\n189#1:263,3\n*E\n"})
/* loaded from: classes8.dex */
public final class p implements e0 {

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final a f73815d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public static final p f73816e = new p("*", false);

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final String f73817a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f73818b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final String f73819c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nVersions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Versions.kt\nio/ktor/http/content/EntityTagVersion$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,261:1\n1557#2:262\n1628#2,2:263\n1630#2:266\n1#3:265\n*S KotlinDebug\n*F\n+ 1 Versions.kt\nio/ktor/http/content/EntityTagVersion$Companion\n*L\n227#1:262\n227#1:263,2\n227#1:266\n*E\n"})
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final p a() {
            return p.f73816e;
        }

        @m80.k
        public final List<p> b(@m80.k String headerValue) {
            kotlin.jvm.internal.g0.p(headerValue, "headerValue");
            List<m0> f11 = x0.f(headerValue);
            ArrayList arrayList = new ArrayList(i0.d0(f11, 10));
            for (m0 m0Var : f11) {
                if (m0Var.f() != 1.0d) {
                    throw new IllegalStateException(("entity-tag quality parameter is not allowed: " + m0Var.f() + '.').toString());
                }
                if (!m0Var.e().isEmpty()) {
                    throw new IllegalStateException(("entity-tag parameters are not allowed: " + m0Var.e() + '.').toString());
                }
                arrayList.add(p.f73815d.c(m0Var.g()));
            }
            return arrayList;
        }

        @m80.k
        public final p c(@m80.k String value) {
            boolean z11;
            kotlin.jvm.internal.g0.p(value, "value");
            if (kotlin.jvm.internal.g0.g(value, "*")) {
                return a();
            }
            if (u30.f0.J2(value, "W/", false, 2, null)) {
                value = r0.d7(value, 2);
                z11 = true;
            } else {
                z11 = false;
            }
            if (!u30.f0.J2(value, "\"", false, 2, null)) {
                value = p0.g(value);
            }
            return new p(value, z11);
        }

        public a() {
        }
    }

    public p(@m80.k String etag, boolean z11) {
        kotlin.jvm.internal.g0.p(etag, "etag");
        this.f73817a = etag;
        this.f73818b = z11;
        this.f73819c = (kotlin.jvm.internal.g0.g(etag, "*") || u30.f0.J2(etag, "\"", false, 2, null)) ? etag : p0.g(etag);
        int length = etag.length();
        for (int i11 = 0; i11 < length; i11++) {
            char charAt = this.f73817a.charAt(i11);
            if ((kotlin.jvm.internal.g0.t(charAt, 32) <= 0 || charAt == '\"') && i11 != 0 && i11 != k0.A3(this.f73817a)) {
                throw new IllegalArgumentException(("Character '" + charAt + "' is not allowed in entity-tag.").toString());
            }
        }
    }

    public static /* synthetic */ p g(p pVar, String str, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = pVar.f73817a;
        }
        if ((i11 & 2) != 0) {
            z11 = pVar.f73818b;
        }
        return pVar.f(str, z11);
    }

    @Override // mx.e0
    @m80.k
    public VersionCheckResult a(@m80.k q0 requestHeaders) {
        List<p> b11;
        VersionCheckResult j11;
        List<p> b12;
        VersionCheckResult l11;
        kotlin.jvm.internal.g0.p(requestHeaders, "requestHeaders");
        y0 y0Var = y0.f63006a;
        String str = requestHeaders.get(y0Var.T());
        if (str != null && (b12 = f73815d.b(str)) != null && (l11 = l(b12)) != VersionCheckResult.OK) {
            return l11;
        }
        String str2 = requestHeaders.get(y0Var.R());
        return (str2 == null || (b11 = f73815d.b(str2)) == null || (j11 = j(b11)) == VersionCheckResult.OK) ? VersionCheckResult.OK : j11;
    }

    @Override // mx.e0
    public void b(@m80.k ix.r0 builder) {
        kotlin.jvm.internal.g0.p(builder, "builder");
        ix.a.a(builder, this.f73819c);
    }

    @m80.k
    public final String d() {
        return this.f73817a;
    }

    public final boolean e() {
        return this.f73818b;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return kotlin.jvm.internal.g0.g(this.f73817a, pVar.f73817a) && this.f73818b == pVar.f73818b;
    }

    @m80.k
    public final p f(@m80.k String etag, boolean z11) {
        kotlin.jvm.internal.g0.p(etag, "etag");
        return new p(etag, z11);
    }

    @m80.k
    public final String h() {
        return this.f73817a;
    }

    public int hashCode() {
        return (this.f73817a.hashCode() * 31) + Boolean.hashCode(this.f73818b);
    }

    public final boolean i() {
        return this.f73818b;
    }

    @m80.k
    public final VersionCheckResult j(@m80.k List<p> givenMatchEtags) {
        kotlin.jvm.internal.g0.p(givenMatchEtags, "givenMatchEtags");
        if (givenMatchEtags.isEmpty()) {
            return VersionCheckResult.OK;
        }
        if (givenMatchEtags.contains(f73816e)) {
            return VersionCheckResult.OK;
        }
        Iterator<p> it = givenMatchEtags.iterator();
        while (it.hasNext()) {
            if (k(it.next())) {
                return VersionCheckResult.OK;
            }
        }
        return VersionCheckResult.PRECONDITION_FAILED;
    }

    public final boolean k(@m80.k p other) {
        kotlin.jvm.internal.g0.p(other, "other");
        p pVar = f73816e;
        if (kotlin.jvm.internal.g0.g(this, pVar) || kotlin.jvm.internal.g0.g(other, pVar)) {
            return true;
        }
        return kotlin.jvm.internal.g0.g(this.f73819c, other.f73819c);
    }

    @m80.k
    public final VersionCheckResult l(@m80.k List<p> givenNoneMatchEtags) {
        kotlin.jvm.internal.g0.p(givenNoneMatchEtags, "givenNoneMatchEtags");
        if (givenNoneMatchEtags.contains(f73816e)) {
            return VersionCheckResult.OK;
        }
        List<p> list = givenNoneMatchEtags;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (k((p) it.next())) {
                    return VersionCheckResult.NOT_MODIFIED;
                }
            }
        }
        return VersionCheckResult.OK;
    }

    @m80.k
    public String toString() {
        return "EntityTagVersion(etag=" + this.f73817a + ", weak=" + this.f73818b + ')';
    }
}

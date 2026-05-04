package qe;

import androidx.compose.runtime.internal.StabilityInferred;
import com.baicizhan.client.business.dataset.models.BookCategory;
import java.util.List;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;
import pn.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: c, reason: collision with root package name */
    public static final int f82054c = 8;

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f82055a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final List<BookCategory> f82056b;

    /* JADX WARN: Multi-variable type inference failed */
    public a(@k String name, @k List<? extends BookCategory> categories) {
        g0.p(name, "name");
        g0.p(categories, "categories");
        this.f82055a = name;
        this.f82056b = categories;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ a d(a aVar, String str, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = aVar.f82055a;
        }
        if ((i11 & 2) != 0) {
            list = aVar.f82056b;
        }
        return aVar.c(str, list);
    }

    @k
    public final String a() {
        return this.f82055a;
    }

    @k
    public final List<BookCategory> b() {
        return this.f82056b;
    }

    @k
    public final a c(@k String name, @k List<? extends BookCategory> categories) {
        g0.p(name, "name");
        g0.p(categories, "categories");
        return new a(name, categories);
    }

    @k
    public final List<BookCategory> e() {
        return this.f82056b;
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return g0.g(this.f82055a, aVar.f82055a) && g0.g(this.f82056b, aVar.f82056b);
    }

    @k
    public final String f() {
        return this.f82055a;
    }

    public int hashCode() {
        return (this.f82055a.hashCode() * 31) + this.f82056b.hashCode();
    }

    @k
    public String toString() {
        return "AllTopBookCategory(name=" + this.f82055a + ", categories=" + this.f82056b + j.f81007d;
    }
}

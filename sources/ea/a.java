package ea;

import androidx.compose.runtime.internal.StabilityInferred;
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
    public static final int f49614c = 8;

    /* renamed from: a, reason: collision with root package name */
    @l
    public final List<b> f49615a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f49616b;

    public a(@l List<b> list, @k String toast) {
        g0.p(toast, "toast");
        this.f49615a = list;
        this.f49616b = toast;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ a d(a aVar, List list, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = aVar.f49615a;
        }
        if ((i11 & 2) != 0) {
            str = aVar.f49616b;
        }
        return aVar.c(list, str);
    }

    @l
    public final List<b> a() {
        return this.f49615a;
    }

    @k
    public final String b() {
        return this.f49616b;
    }

    @k
    public final a c(@l List<b> list, @k String toast) {
        g0.p(toast, "toast");
        return new a(list, toast);
    }

    @l
    public final List<b> e() {
        return this.f49615a;
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return g0.g(this.f49615a, aVar.f49615a) && g0.g(this.f49616b, aVar.f49616b);
    }

    @k
    public final String f() {
        return this.f49616b;
    }

    public int hashCode() {
        List<b> list = this.f49615a;
        return ((list == null ? 0 : list.hashCode()) * 31) + this.f49616b.hashCode();
    }

    @k
    public String toString() {
        return "AdFeedback(feedbacks=" + this.f49615a + ", toast=" + this.f49616b + j.f81007d;
    }
}

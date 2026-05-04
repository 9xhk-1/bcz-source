package ly;

import a00.r0;
import a00.x1;
import androidx.exifinterface.media.ExifInterface;
import io.ktor.utils.io.c0;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import m80.k;
import x00.l;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@c0
/* loaded from: classes8.dex */
public final class a implements io.ktor.serialization.b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final List<g> f71677a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final List<p<zx.b, List<f>, List<f>>> f71678b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Set<h10.d<?>> f71679c = r0.e6(x1.C(b.a(), h.a()));

    /* renamed from: d, reason: collision with root package name */
    public boolean f71680d;

    @Override // io.ktor.serialization.b
    public <T extends io.ktor.serialization.c> void a(@k ix.k contentType, @k T converter, @k l<? super T, g2> configuration) {
        g0.p(contentType, "contentType");
        g0.p(converter, "converter");
        g0.p(configuration, "configuration");
        configuration.invoke(converter);
        this.f71677a.add(new g(contentType, converter));
    }

    public final void b(@k p<? super zx.b, ? super List<f>, ? extends List<f>> contributor) {
        g0.p(contributor, "contributor");
        this.f71678b.add(contributor);
    }

    public final void c() {
        this.f71679c.clear();
    }

    @k
    public final List<p<zx.b, List<f>, List<f>>> d() {
        return this.f71678b;
    }

    public final boolean e() {
        return this.f71680d;
    }

    @k
    public final Set<h10.d<?>> f() {
        return this.f71679c;
    }

    @k
    public final List<g> g() {
        return this.f71677a;
    }

    public final /* synthetic */ <T> void h() {
        g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
        i(o0.d(Object.class));
    }

    public final void i(@k h10.d<?> type) {
        g0.p(type, "type");
        this.f71679c.add(type);
    }

    public final /* synthetic */ <T> void j() {
        g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
        k(o0.d(Object.class));
    }

    public final void k(@k h10.d<?> type) {
        g0.p(type, "type");
        this.f71679c.remove(type);
    }

    public final void l(boolean z11) {
        this.f71680d = z11;
    }
}

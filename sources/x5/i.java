package x5;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.g0;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.e0;
import kotlinx.coroutines.flow.x;
import m80.k;
import m80.l;
import oa0.r;
import p8.o0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@r(binds = {d.class})
/* loaded from: classes3.dex */
public final class i implements d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.baicizhan.app.biz.auth.r f97536a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final x<Boolean> f97537b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Map<Integer, Integer> f97538c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Map<Integer, Integer> f97539d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Map<Integer, o0> f97540e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f97541f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public Long f97542g;

    public i(@k com.baicizhan.app.biz.auth.r tokenProvider) {
        g0.p(tokenProvider, "tokenProvider");
        this.f97536a = tokenProvider;
        x<Boolean> a11 = e0.a(1, 0, BufferOverflow.DROP_OLDEST);
        a11.d(Boolean.FALSE);
        this.f97537b = a11;
        this.f97538c = new LinkedHashMap();
        this.f97539d = new LinkedHashMap();
        this.f97540e = new LinkedHashMap();
    }

    @Override // x5.d
    public void a(int i11, int i12) {
        j();
        Integer num = this.f97539d.get(Integer.valueOf(i11));
        if ((num != null ? num.intValue() : -1) != i12) {
            this.f97539d.put(Integer.valueOf(i11), Integer.valueOf(i12));
            this.f97537b.d(Boolean.TRUE);
        }
    }

    @Override // x5.d
    public int b(int i11) {
        j();
        Integer num = this.f97538c.get(Integer.valueOf(i11));
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }

    @Override // x5.d
    public void c(int i11, @l o0 o0Var) {
        j();
        if (o0Var == null) {
            this.f97540e.remove(Integer.valueOf(i11));
        } else {
            this.f97540e.put(Integer.valueOf(i11), o0Var);
        }
        this.f97537b.d(Boolean.TRUE);
    }

    @Override // x5.d
    @l
    public o0 d(int i11) {
        j();
        return this.f97540e.get(Integer.valueOf(i11));
    }

    @Override // x5.d
    @k
    public kotlinx.coroutines.flow.i<Boolean> e() {
        return this.f97537b;
    }

    @Override // x5.d
    public void f(boolean z11) {
        j();
        if (this.f97541f != z11) {
            this.f97541f = z11;
        }
    }

    @Override // x5.d
    public int g(int i11) {
        j();
        Integer num = this.f97539d.get(Integer.valueOf(i11));
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }

    @Override // x5.d
    public void h(int i11, int i12) {
        j();
        Integer num = this.f97538c.get(Integer.valueOf(i11));
        if ((num != null ? num.intValue() : -1) != i12) {
            this.f97538c.put(Integer.valueOf(i11), Integer.valueOf(i12));
            this.f97537b.d(Boolean.TRUE);
        }
    }

    @Override // x5.d
    public boolean i() {
        j();
        return this.f97541f;
    }

    public final boolean j() {
        Long b11 = this.f97536a.b();
        if (g0.g(this.f97542g, b11)) {
            return false;
        }
        this.f97538c.clear();
        this.f97539d.clear();
        this.f97540e.clear();
        this.f97541f = false;
        this.f97542g = b11;
        this.f97537b.d(Boolean.TRUE);
        return true;
    }
}

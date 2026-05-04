package s40;

import com.xiaomi.mipush.sdk.Constants;
import kotlinx.datetime.UtcOffset;
import r40.r3;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nUtcOffsetFormat.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UtcOffsetFormat.kt\nkotlinx/datetime/format/IncompleteUtcOffset\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,280:1\n1#2:281\n*E\n"})
/* loaded from: classes8.dex */
public final class u0 implements h2, w40.c<u0> {

    /* renamed from: a, reason: collision with root package name */
    @m80.l
    public Boolean f87782a;

    /* renamed from: b, reason: collision with root package name */
    @m80.l
    public Integer f87783b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    public Integer f87784c;

    /* renamed from: d, reason: collision with root package name */
    @m80.l
    public Integer f87785d;

    public u0() {
        this(null, null, null, null, 15, null);
    }

    @Override // s40.h2
    public void B(@m80.l Boolean bool) {
        this.f87782a = bool;
    }

    @Override // s40.h2
    @m80.l
    public Integer G() {
        return this.f87784c;
    }

    @Override // s40.h2
    @m80.l
    public Boolean I() {
        return this.f87782a;
    }

    @Override // w40.c
    @m80.k
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public u0 copy() {
        return new u0(I(), f(), G(), p());
    }

    @Override // s40.h2
    public void b(@m80.l Integer num) {
        this.f87784c = num;
    }

    public final void c(@m80.k UtcOffset offset) {
        kotlin.jvm.internal.g0.p(offset, "offset");
        B(Boolean.valueOf(offset.getTotalSeconds() < 0));
        int abs = Math.abs(offset.getTotalSeconds());
        r(Integer.valueOf(abs / 3600));
        b(Integer.valueOf((abs / 60) % 60));
        i(Integer.valueOf(abs % 60));
    }

    @m80.k
    public final UtcOffset d() {
        int i11 = kotlin.jvm.internal.g0.g(I(), Boolean.TRUE) ? -1 : 1;
        Integer f11 = f();
        Integer valueOf = f11 != null ? Integer.valueOf(f11.intValue() * i11) : null;
        Integer G = G();
        Integer valueOf2 = G != null ? Integer.valueOf(G.intValue() * i11) : null;
        Integer p11 = p();
        return r3.d(valueOf, valueOf2, p11 != null ? Integer.valueOf(p11.intValue() * i11) : null);
    }

    public boolean equals(@m80.l Object obj) {
        if (!(obj instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj;
        return kotlin.jvm.internal.g0.g(I(), u0Var.I()) && kotlin.jvm.internal.g0.g(f(), u0Var.f()) && kotlin.jvm.internal.g0.g(G(), u0Var.G()) && kotlin.jvm.internal.g0.g(p(), u0Var.p());
    }

    @Override // s40.h2
    @m80.l
    public Integer f() {
        return this.f87783b;
    }

    public int hashCode() {
        Boolean I = I();
        int hashCode = I != null ? I.hashCode() : 0;
        Integer f11 = f();
        int hashCode2 = hashCode + (f11 != null ? f11.hashCode() : 0);
        Integer G = G();
        int hashCode3 = hashCode2 + (G != null ? G.hashCode() : 0);
        Integer p11 = p();
        return hashCode3 + (p11 != null ? p11.hashCode() : 0);
    }

    @Override // s40.h2
    public void i(@m80.l Integer num) {
        this.f87785d = num;
    }

    @Override // s40.h2
    @m80.l
    public Integer p() {
        return this.f87785d;
    }

    @Override // s40.h2
    public void r(@m80.l Integer num) {
        this.f87783b = num;
    }

    @m80.k
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        Boolean I = I();
        sb2.append(I != null ? I.booleanValue() ? Constants.ACCEPT_TIME_SEPARATOR_SERVER : "+" : " ");
        Object f11 = f();
        if (f11 == null) {
            f11 = "??";
        }
        sb2.append(f11);
        sb2.append(':');
        Object G = G();
        if (G == null) {
            G = "??";
        }
        sb2.append(G);
        sb2.append(':');
        Integer p11 = p();
        sb2.append(p11 != null ? p11 : "??");
        return sb2.toString();
    }

    public u0(@m80.l Boolean bool, @m80.l Integer num, @m80.l Integer num2, @m80.l Integer num3) {
        this.f87782a = bool;
        this.f87783b = num;
        this.f87784c = num2;
        this.f87785d = num3;
    }

    public /* synthetic */ u0(Boolean bool, Integer num, Integer num2, Integer num3, int i11, kotlin.jvm.internal.v vVar) {
        this((i11 & 1) != 0 ? null : bool, (i11 & 2) != 0 ? null : num, (i11 & 4) != 0 ? null : num2, (i11 & 8) != 0 ? null : num3);
    }
}

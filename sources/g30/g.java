package g30;

import a00.h0;
import e30.a2;
import e30.c1;
import e30.r1;
import e30.u1;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import kotlin.jvm.internal.w0;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class g extends c1 {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final u1 f52677b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final x20.k f52678c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final ErrorTypeKind f52679d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final List<a2> f52680e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f52681f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final String[] f52682g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final String f52683h;

    public /* synthetic */ g(u1 u1Var, x20.k kVar, ErrorTypeKind errorTypeKind, List list, boolean z11, String[] strArr, int i11, v vVar) {
        this(u1Var, kVar, errorTypeKind, (i11 & 8) != 0 ? h0.J() : list, (i11 & 16) != 0 ? false : z11, strArr);
    }

    @Override // e30.r0
    @k
    public List<a2> G0() {
        return this.f52680e;
    }

    @Override // e30.r0
    @k
    public r1 H0() {
        return r1.f48652b.j();
    }

    @Override // e30.r0
    @k
    public u1 I0() {
        return this.f52677b;
    }

    @Override // e30.r0
    public boolean J0() {
        return this.f52681f;
    }

    @Override // e30.k2
    @k
    /* renamed from: P0 */
    public c1 M0(boolean z11) {
        u1 I0 = I0();
        x20.k r11 = r();
        ErrorTypeKind errorTypeKind = this.f52679d;
        List<a2> G0 = G0();
        String[] strArr = this.f52682g;
        return new g(I0, r11, errorTypeKind, G0, z11, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    @Override // e30.k2
    @k
    /* renamed from: Q0 */
    public c1 O0(@k r1 newAttributes) {
        g0.p(newAttributes, "newAttributes");
        return this;
    }

    @k
    public final String R0() {
        return this.f52683h;
    }

    @k
    public final ErrorTypeKind S0() {
        return this.f52679d;
    }

    @Override // e30.k2
    @k
    /* renamed from: T0, reason: merged with bridge method [inline-methods] */
    public g S0(@k f30.g kotlinTypeRefiner) {
        g0.p(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
    }

    @k
    public final g U0(@k List<? extends a2> newArguments) {
        g0.p(newArguments, "newArguments");
        u1 I0 = I0();
        x20.k r11 = r();
        ErrorTypeKind errorTypeKind = this.f52679d;
        boolean J0 = J0();
        String[] strArr = this.f52682g;
        return new g(I0, r11, errorTypeKind, newArguments, J0, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    @Override // e30.r0
    @k
    public x20.k r() {
        return this.f52678c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @w00.k
    public g(@k u1 constructor, @k x20.k memberScope, @k ErrorTypeKind kind, @k List<? extends a2> arguments, boolean z11, @k String... formatParams) {
        g0.p(constructor, "constructor");
        g0.p(memberScope, "memberScope");
        g0.p(kind, "kind");
        g0.p(arguments, "arguments");
        g0.p(formatParams, "formatParams");
        this.f52677b = constructor;
        this.f52678c = memberScope;
        this.f52679d = kind;
        this.f52680e = arguments;
        this.f52681f = z11;
        this.f52682g = formatParams;
        w0 w0Var = w0.f67050a;
        String debugMessage = kind.getDebugMessage();
        Object[] copyOf = Arrays.copyOf(formatParams, formatParams.length);
        String format = String.format(debugMessage, Arrays.copyOf(copyOf, copyOf.length));
        g0.o(format, "format(...)");
        this.f52683h = format;
    }
}

package g30;

import a00.h0;
import e30.r0;
import e30.u1;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorEntity;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import m80.k;
import p10.c1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class h implements u1 {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final ErrorTypeKind f52684a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String[] f52685b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f52686c;

    public h(@k ErrorTypeKind kind, @k String... formatParams) {
        g0.p(kind, "kind");
        g0.p(formatParams, "formatParams");
        this.f52684a = kind;
        this.f52685b = formatParams;
        String debugText = ErrorEntity.ERROR_TYPE.getDebugText();
        String debugMessage = kind.getDebugMessage();
        Object[] copyOf = Arrays.copyOf(formatParams, formatParams.length);
        String format = String.format(debugMessage, Arrays.copyOf(copyOf, copyOf.length));
        g0.o(format, "format(...)");
        String format2 = String.format(debugText, Arrays.copyOf(new Object[]{format}, 1));
        g0.o(format2, "format(...)");
        this.f52686c = format2;
    }

    @Override // e30.u1
    @k
    public Collection<r0> c() {
        return h0.J();
    }

    @Override // e30.u1
    @k
    public u1 d(@k f30.g kotlinTypeRefiner) {
        g0.p(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
    }

    @k
    public final ErrorTypeKind e() {
        return this.f52684a;
    }

    @k
    public final String f(int i11) {
        return this.f52685b[i11];
    }

    @Override // e30.u1
    @k
    public List<c1> getParameters() {
        return h0.J();
    }

    @Override // e30.u1
    @k
    public n10.j q() {
        return n10.g.f73969i.a();
    }

    @Override // e30.u1
    @k
    public p10.d r() {
        return i.f52687a.h();
    }

    @Override // e30.u1
    public boolean s() {
        return false;
    }

    @k
    public String toString() {
        return this.f52686c;
    }
}

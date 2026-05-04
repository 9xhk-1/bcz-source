package w40;

import a00.r0;
import java.util.List;
import kotlin.jvm.internal.g0;
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class t<Output> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final List<q<Output>> f95283a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final List<t<Output>> f95284b;

    /* JADX WARN: Multi-variable type inference failed */
    public t(@m80.k List<? extends q<? super Output>> operations, @m80.k List<? extends t<? super Output>> followedBy) {
        g0.p(operations, "operations");
        g0.p(followedBy, "followedBy");
        this.f95283a = operations;
        this.f95284b = followedBy;
    }

    @m80.k
    public final List<t<Output>> a() {
        return this.f95284b;
    }

    @m80.k
    public final List<q<Output>> b() {
        return this.f95283a;
    }

    @m80.k
    public String toString() {
        return r0.r3(this.f95283a, j2.O, null, null, 0, null, null, 62, null) + '(' + r0.r3(this.f95284b, com.alipay.sdk.m.u.i.f11097b, null, null, 0, null, null, 62, null) + ')';
    }
}

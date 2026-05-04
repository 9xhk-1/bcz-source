package h20;

import h20.e;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class g<A, C> extends e.a<A> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final Map<a0, List<A>> f58068a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final Map<a0, C> f58069b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final Map<a0, C> f58070c;

    /* JADX WARN: Multi-variable type inference failed */
    public g(@m80.k Map<a0, ? extends List<? extends A>> memberAnnotations, @m80.k Map<a0, ? extends C> propertyConstants, @m80.k Map<a0, ? extends C> annotationParametersDefaultValues) {
        kotlin.jvm.internal.g0.p(memberAnnotations, "memberAnnotations");
        kotlin.jvm.internal.g0.p(propertyConstants, "propertyConstants");
        kotlin.jvm.internal.g0.p(annotationParametersDefaultValues, "annotationParametersDefaultValues");
        this.f58068a = memberAnnotations;
        this.f58069b = propertyConstants;
        this.f58070c = annotationParametersDefaultValues;
    }

    @Override // h20.e.a
    @m80.k
    public Map<a0, List<A>> a() {
        return this.f58068a;
    }

    @m80.k
    public final Map<a0, C> b() {
        return this.f58070c;
    }

    @m80.k
    public final Map<a0, C> c() {
        return this.f58069b;
    }
}

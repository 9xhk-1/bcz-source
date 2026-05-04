package h20;

import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerAbiStability;
import p10.y0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class z implements c30.s {

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final x f58160b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    public final a30.x<m20.e> f58161c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f58162d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final DeserializedContainerAbiStability f58163e;

    public z(@m80.k x binaryClass, @m80.l a30.x<m20.e> xVar, boolean z11, @m80.k DeserializedContainerAbiStability abiStability) {
        kotlin.jvm.internal.g0.p(binaryClass, "binaryClass");
        kotlin.jvm.internal.g0.p(abiStability, "abiStability");
        this.f58160b = binaryClass;
        this.f58161c = xVar;
        this.f58162d = z11;
        this.f58163e = abiStability;
    }

    @Override // c30.s
    @m80.k
    public String a() {
        return "Class '" + this.f58160b.a().a().b() + '\'';
    }

    @Override // p10.x0
    @m80.k
    public y0 b() {
        y0 NO_SOURCE_FILE = y0.f78623a;
        kotlin.jvm.internal.g0.o(NO_SOURCE_FILE, "NO_SOURCE_FILE");
        return NO_SOURCE_FILE;
    }

    @m80.k
    public final x d() {
        return this.f58160b;
    }

    @m80.k
    public String toString() {
        return z.class.getSimpleName() + ": " + this.f58160b;
    }
}

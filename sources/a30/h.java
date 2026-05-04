package a30;

import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final k20.c f1766a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final ProtoBuf.Class f1767b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final k20.a f1768c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final p10.x0 f1769d;

    public h(@m80.k k20.c nameResolver, @m80.k ProtoBuf.Class classProto, @m80.k k20.a metadataVersion, @m80.k p10.x0 sourceElement) {
        kotlin.jvm.internal.g0.p(nameResolver, "nameResolver");
        kotlin.jvm.internal.g0.p(classProto, "classProto");
        kotlin.jvm.internal.g0.p(metadataVersion, "metadataVersion");
        kotlin.jvm.internal.g0.p(sourceElement, "sourceElement");
        this.f1766a = nameResolver;
        this.f1767b = classProto;
        this.f1768c = metadataVersion;
        this.f1769d = sourceElement;
    }

    @m80.k
    public final k20.c a() {
        return this.f1766a;
    }

    @m80.k
    public final ProtoBuf.Class b() {
        return this.f1767b;
    }

    @m80.k
    public final k20.a c() {
        return this.f1768c;
    }

    @m80.k
    public final p10.x0 d() {
        return this.f1769d;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return kotlin.jvm.internal.g0.g(this.f1766a, hVar.f1766a) && kotlin.jvm.internal.g0.g(this.f1767b, hVar.f1767b) && kotlin.jvm.internal.g0.g(this.f1768c, hVar.f1768c) && kotlin.jvm.internal.g0.g(this.f1769d, hVar.f1769d);
    }

    public int hashCode() {
        return (((((this.f1766a.hashCode() * 31) + this.f1767b.hashCode()) * 31) + this.f1768c.hashCode()) * 31) + this.f1769d.hashCode();
    }

    @m80.k
    public String toString() {
        return "ClassData(nameResolver=" + this.f1766a + ", classProto=" + this.f1767b + ", metadataVersion=" + this.f1768c + ", sourceElement=" + this.f1769d + ')';
    }
}

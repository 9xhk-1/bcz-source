package a30;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final m f1833a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final k20.c f1834b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final p10.h f1835c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final k20.g f1836d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final k20.h f1837e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final k20.a f1838f;

    /* renamed from: g, reason: collision with root package name */
    @m80.l
    public final c30.s f1839g;

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public final v0 f1840h;

    /* renamed from: i, reason: collision with root package name */
    @m80.k
    public final j0 f1841i;

    public o(@m80.k m components, @m80.k k20.c nameResolver, @m80.k p10.h containingDeclaration, @m80.k k20.g typeTable, @m80.k k20.h versionRequirementTable, @m80.k k20.a metadataVersion, @m80.l c30.s sVar, @m80.l v0 v0Var, @m80.k List<ProtoBuf.TypeParameter> typeParameters) {
        String a11;
        kotlin.jvm.internal.g0.p(components, "components");
        kotlin.jvm.internal.g0.p(nameResolver, "nameResolver");
        kotlin.jvm.internal.g0.p(containingDeclaration, "containingDeclaration");
        kotlin.jvm.internal.g0.p(typeTable, "typeTable");
        kotlin.jvm.internal.g0.p(versionRequirementTable, "versionRequirementTable");
        kotlin.jvm.internal.g0.p(metadataVersion, "metadataVersion");
        kotlin.jvm.internal.g0.p(typeParameters, "typeParameters");
        this.f1833a = components;
        this.f1834b = nameResolver;
        this.f1835c = containingDeclaration;
        this.f1836d = typeTable;
        this.f1837e = versionRequirementTable;
        this.f1838f = metadataVersion;
        this.f1839g = sVar;
        this.f1840h = new v0(this, v0Var, typeParameters, "Deserializer for \"" + containingDeclaration.getName() + '\"', (sVar == null || (a11 = sVar.a()) == null) ? "[container not found]" : a11);
        this.f1841i = new j0(this);
    }

    public static /* synthetic */ o b(o oVar, p10.h hVar, List list, k20.c cVar, k20.g gVar, k20.h hVar2, k20.a aVar, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            cVar = oVar.f1834b;
        }
        k20.c cVar2 = cVar;
        if ((i11 & 8) != 0) {
            gVar = oVar.f1836d;
        }
        k20.g gVar2 = gVar;
        if ((i11 & 16) != 0) {
            hVar2 = oVar.f1837e;
        }
        k20.h hVar3 = hVar2;
        if ((i11 & 32) != 0) {
            aVar = oVar.f1838f;
        }
        return oVar.a(hVar, list, cVar2, gVar2, hVar3, aVar);
    }

    @m80.k
    public final o a(@m80.k p10.h descriptor, @m80.k List<ProtoBuf.TypeParameter> typeParameterProtos, @m80.k k20.c nameResolver, @m80.k k20.g typeTable, @m80.k k20.h versionRequirementTable, @m80.k k20.a metadataVersion) {
        kotlin.jvm.internal.g0.p(descriptor, "descriptor");
        kotlin.jvm.internal.g0.p(typeParameterProtos, "typeParameterProtos");
        kotlin.jvm.internal.g0.p(nameResolver, "nameResolver");
        kotlin.jvm.internal.g0.p(typeTable, "typeTable");
        kotlin.jvm.internal.g0.p(versionRequirementTable, "versionRequirementTable");
        kotlin.jvm.internal.g0.p(metadataVersion, "metadataVersion");
        return new o(this.f1833a, nameResolver, descriptor, typeTable, k20.i.b(metadataVersion) ? versionRequirementTable : this.f1837e, metadataVersion, this.f1839g, this.f1840h, typeParameterProtos);
    }

    @m80.k
    public final m c() {
        return this.f1833a;
    }

    @m80.l
    public final c30.s d() {
        return this.f1839g;
    }

    @m80.k
    public final p10.h e() {
        return this.f1835c;
    }

    @m80.k
    public final j0 f() {
        return this.f1841i;
    }

    @m80.k
    public final k20.c g() {
        return this.f1834b;
    }

    @m80.k
    public final d30.n h() {
        return this.f1833a.u();
    }

    @m80.k
    public final v0 i() {
        return this.f1840h;
    }

    @m80.k
    public final k20.g j() {
        return this.f1836d;
    }

    @m80.k
    public final k20.h k() {
        return this.f1837e;
    }
}

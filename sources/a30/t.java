package a30;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nDeserializedPackageFragmentImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeserializedPackageFragmentImpl.kt\norg/jetbrains/kotlin/serialization/deserialization/DeserializedPackageFragmentImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,63:1\n774#2:64\n865#2,2:65\n1557#2:67\n1628#2,3:68\n*S KotlinDebug\n*F\n+ 1 DeserializedPackageFragmentImpl.kt\norg/jetbrains/kotlin/serialization/deserialization/DeserializedPackageFragmentImpl\n*L\n54#1:64\n54#1:65,2\n56#1:67\n56#1:68,3\n*E\n"})
/* loaded from: classes8.dex */
public abstract class t extends q {

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public final k20.a f1855h;

    /* renamed from: i, reason: collision with root package name */
    @m80.l
    public final c30.s f1856i;

    /* renamed from: j, reason: collision with root package name */
    @m80.k
    public final k20.d f1857j;

    /* renamed from: k, reason: collision with root package name */
    @m80.k
    public final l0 f1858k;

    /* renamed from: l, reason: collision with root package name */
    @m80.l
    public ProtoBuf.PackageFragment f1859l;

    /* renamed from: m, reason: collision with root package name */
    public x20.k f1860m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(@m80.k n20.c fqName, @m80.k d30.n storageManager, @m80.k p10.a0 module, @m80.k ProtoBuf.PackageFragment proto, @m80.k k20.a metadataVersion, @m80.l c30.s sVar) {
        super(fqName, storageManager, module);
        kotlin.jvm.internal.g0.p(fqName, "fqName");
        kotlin.jvm.internal.g0.p(storageManager, "storageManager");
        kotlin.jvm.internal.g0.p(module, "module");
        kotlin.jvm.internal.g0.p(proto, "proto");
        kotlin.jvm.internal.g0.p(metadataVersion, "metadataVersion");
        this.f1855h = metadataVersion;
        this.f1856i = sVar;
        ProtoBuf.StringTable strings = proto.getStrings();
        kotlin.jvm.internal.g0.o(strings, "getStrings(...)");
        ProtoBuf.QualifiedNameTable qualifiedNames = proto.getQualifiedNames();
        kotlin.jvm.internal.g0.o(qualifiedNames, "getQualifiedNames(...)");
        k20.d dVar = new k20.d(strings, qualifiedNames);
        this.f1857j = dVar;
        this.f1858k = new l0(proto, dVar, metadataVersion, new r(this));
        this.f1859l = proto;
    }

    public static final p10.x0 J0(t tVar, n20.b it) {
        kotlin.jvm.internal.g0.p(it, "it");
        c30.s sVar = tVar.f1856i;
        if (sVar != null) {
            return sVar;
        }
        p10.x0 NO_SOURCE = p10.x0.f78622a;
        kotlin.jvm.internal.g0.o(NO_SOURCE, "NO_SOURCE");
        return NO_SOURCE;
    }

    public static final Collection L0(t tVar) {
        Collection<n20.b> b11 = tVar.E0().b();
        ArrayList arrayList = new ArrayList();
        for (Object obj : b11) {
            n20.b bVar = (n20.b) obj;
            if (!bVar.j() && !k.f1779c.a().contains(bVar)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(a00.i0.d0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((n20.b) it.next()).h());
        }
        return arrayList2;
    }

    @Override // a30.q
    public void G0(@m80.k m components) {
        kotlin.jvm.internal.g0.p(components, "components");
        ProtoBuf.PackageFragment packageFragment = this.f1859l;
        if (packageFragment == null) {
            throw new IllegalStateException("Repeated call to DeserializedPackageFragmentImpl::initialize");
        }
        this.f1859l = null;
        ProtoBuf.Package r42 = packageFragment.getPackage();
        kotlin.jvm.internal.g0.o(r42, "getPackage(...)");
        this.f1860m = new c30.m0(this, r42, this.f1857j, this.f1855h, this.f1856i, components, "scope of " + this, new s(this));
    }

    @Override // a30.q
    @m80.k
    /* renamed from: K0, reason: merged with bridge method [inline-methods] */
    public l0 E0() {
        return this.f1858k;
    }

    @Override // p10.g0
    @m80.k
    public x20.k r() {
        x20.k kVar = this.f1860m;
        if (kVar != null) {
            return kVar;
        }
        kotlin.jvm.internal.g0.S("_memberScope");
        return null;
    }
}

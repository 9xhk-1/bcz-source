package a30;

import a00.k1;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nProtoBasedClassDataFinder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProtoBasedClassDataFinder.kt\norg/jetbrains/kotlin/serialization/deserialization/ProtoBasedClassDataFinder\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,43:1\n1202#2,2:44\n1230#2,4:46\n*S KotlinDebug\n*F\n+ 1 ProtoBasedClassDataFinder.kt\norg/jetbrains/kotlin/serialization/deserialization/ProtoBasedClassDataFinder\n*L\n32#1:44,2\n32#1:46,4\n*E\n"})
/* loaded from: classes8.dex */
public final class l0 implements i {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final k20.c f1788a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final k20.a f1789b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final x00.l<n20.b, p10.x0> f1790c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final Map<n20.b, ProtoBuf.Class> f1791d;

    /* JADX WARN: Multi-variable type inference failed */
    public l0(@m80.k ProtoBuf.PackageFragment proto, @m80.k k20.c nameResolver, @m80.k k20.a metadataVersion, @m80.k x00.l<? super n20.b, ? extends p10.x0> classSource) {
        kotlin.jvm.internal.g0.p(proto, "proto");
        kotlin.jvm.internal.g0.p(nameResolver, "nameResolver");
        kotlin.jvm.internal.g0.p(metadataVersion, "metadataVersion");
        kotlin.jvm.internal.g0.p(classSource, "classSource");
        this.f1788a = nameResolver;
        this.f1789b = metadataVersion;
        this.f1790c = classSource;
        List<ProtoBuf.Class> class_List = proto.getClass_List();
        kotlin.jvm.internal.g0.o(class_List, "getClass_List(...)");
        List<ProtoBuf.Class> list = class_List;
        LinkedHashMap linkedHashMap = new LinkedHashMap(g10.u.u(k1.j(a00.i0.d0(list, 10)), 16));
        for (Object obj : list) {
            linkedHashMap.put(k0.a(this.f1788a, ((ProtoBuf.Class) obj).getFqName()), obj);
        }
        this.f1791d = linkedHashMap;
    }

    @Override // a30.i
    @m80.l
    public h a(@m80.k n20.b classId) {
        kotlin.jvm.internal.g0.p(classId, "classId");
        ProtoBuf.Class r02 = this.f1791d.get(classId);
        if (r02 == null) {
            return null;
        }
        return new h(this.f1788a, r02, this.f1789b, this.f1790c.invoke(classId));
    }

    @m80.k
    public final Collection<n20.b> b() {
        return this.f1791d.keySet();
    }
}

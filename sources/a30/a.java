package a30;

import a30.m0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nAbstractAnnotationLoader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractAnnotationLoader.kt\norg/jetbrains/kotlin/serialization/deserialization/AbstractAnnotationLoader\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,104:1\n1557#2:105\n1628#2,3:106\n1557#2:109\n1628#2,3:110\n1557#2:114\n1628#2,3:115\n1557#2:118\n1628#2,3:119\n1557#2:122\n1628#2,3:123\n1557#2:126\n1628#2,3:127\n1557#2:130\n1628#2,3:131\n1557#2:134\n1628#2,3:135\n1557#2:138\n1628#2,3:139\n1#3:113\n*S KotlinDebug\n*F\n+ 1 AbstractAnnotationLoader.kt\norg/jetbrains/kotlin/serialization/deserialization/AbstractAnnotationLoader\n*L\n18#1:105\n18#1:106,3\n37#1:109\n37#1:110,3\n44#1:114\n44#1:115,3\n51#1:118\n51#1:119,3\n58#1:122\n58#1:123,3\n71#1:126\n71#1:127,3\n91#1:130\n91#1:131,3\n97#1:134\n97#1:135,3\n101#1:138\n101#1:139,3\n*E\n"})
/* loaded from: classes8.dex */
public abstract class a<A> implements g<A> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final z20.a f1732a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: a30.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C0006a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1733a;

        static {
            int[] iArr = new int[AnnotatedCallableKind.values().length];
            try {
                iArr[AnnotatedCallableKind.PROPERTY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AnnotatedCallableKind.PROPERTY_GETTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AnnotatedCallableKind.PROPERTY_SETTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f1733a = iArr;
        }
    }

    public a(@m80.k z20.a protocol) {
        kotlin.jvm.internal.g0.p(protocol, "protocol");
        this.f1732a = protocol;
    }

    @Override // a30.g
    @m80.k
    public List<A> b(@m80.k m0.a container) {
        kotlin.jvm.internal.g0.p(container, "container");
        List list = (List) container.f().getExtension(this.f1732a.a());
        if (list == null) {
            list = a00.h0.J();
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(a00.i0.d0(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(g((ProtoBuf.Annotation) it.next(), container.b()));
        }
        return arrayList;
    }

    @Override // a30.g
    @m80.k
    public List<A> d(@m80.k ProtoBuf.Type proto, @m80.k k20.c nameResolver) {
        kotlin.jvm.internal.g0.p(proto, "proto");
        kotlin.jvm.internal.g0.p(nameResolver, "nameResolver");
        List list = (List) proto.getExtension(this.f1732a.o());
        if (list == null) {
            list = a00.h0.J();
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(a00.i0.d0(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(g((ProtoBuf.Annotation) it.next(), nameResolver));
        }
        return arrayList;
    }

    @Override // a30.g
    @m80.k
    public List<A> e(@m80.k ProtoBuf.TypeParameter proto, @m80.k k20.c nameResolver) {
        kotlin.jvm.internal.g0.p(proto, "proto");
        kotlin.jvm.internal.g0.p(nameResolver, "nameResolver");
        List list = (List) proto.getExtension(this.f1732a.p());
        if (list == null) {
            list = a00.h0.J();
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(a00.i0.d0(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(g((ProtoBuf.Annotation) it.next(), nameResolver));
        }
        return arrayList;
    }

    @Override // a30.g
    @m80.k
    public List<A> f(@m80.k m0 container, @m80.k ProtoBuf.Property proto) {
        kotlin.jvm.internal.g0.p(container, "container");
        kotlin.jvm.internal.g0.p(proto, "proto");
        GeneratedMessageLite.f<ProtoBuf.Property, List<ProtoBuf.Annotation>> j11 = this.f1732a.j();
        List list = j11 != null ? (List) proto.getExtension(j11) : null;
        if (list == null) {
            list = a00.h0.J();
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(a00.i0.d0(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(g((ProtoBuf.Annotation) it.next(), container.b()));
        }
        return arrayList;
    }

    @Override // a30.g
    @m80.k
    public List<A> h(@m80.k m0 container, @m80.k ProtoBuf.Property proto) {
        kotlin.jvm.internal.g0.p(container, "container");
        kotlin.jvm.internal.g0.p(proto, "proto");
        GeneratedMessageLite.f<ProtoBuf.Property, List<ProtoBuf.Annotation>> k11 = this.f1732a.k();
        List list = k11 != null ? (List) proto.getExtension(k11) : null;
        if (list == null) {
            list = a00.h0.J();
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(a00.i0.d0(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(g((ProtoBuf.Annotation) it.next(), container.b()));
        }
        return arrayList;
    }

    @Override // a30.g
    @m80.k
    public List<A> i(@m80.k m0 container, @m80.k ProtoBuf.EnumEntry proto) {
        kotlin.jvm.internal.g0.p(container, "container");
        kotlin.jvm.internal.g0.p(proto, "proto");
        List list = (List) proto.getExtension(this.f1732a.d());
        if (list == null) {
            list = a00.h0.J();
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(a00.i0.d0(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(g((ProtoBuf.Annotation) it.next(), container.b()));
        }
        return arrayList;
    }

    @Override // a30.g
    @m80.k
    public List<A> j(@m80.k m0 container, @m80.k kotlin.reflect.jvm.internal.impl.protobuf.n proto, @m80.k AnnotatedCallableKind kind) {
        kotlin.jvm.internal.g0.p(container, "container");
        kotlin.jvm.internal.g0.p(proto, "proto");
        kotlin.jvm.internal.g0.p(kind, "kind");
        List list = null;
        if (proto instanceof ProtoBuf.Function) {
            GeneratedMessageLite.f<ProtoBuf.Function, List<ProtoBuf.Annotation>> g11 = this.f1732a.g();
            if (g11 != null) {
                list = (List) ((ProtoBuf.Function) proto).getExtension(g11);
            }
        } else {
            if (!(proto instanceof ProtoBuf.Property)) {
                throw new IllegalStateException(("Unknown message: " + proto).toString());
            }
            int i11 = C0006a.f1733a[kind.ordinal()];
            if (i11 != 1 && i11 != 2 && i11 != 3) {
                throw new IllegalStateException(("Unsupported callable kind with property proto for receiver annotations: " + kind).toString());
            }
            GeneratedMessageLite.f<ProtoBuf.Property, List<ProtoBuf.Annotation>> l11 = this.f1732a.l();
            if (l11 != null) {
                list = (List) ((ProtoBuf.Property) proto).getExtension(l11);
            }
        }
        if (list == null) {
            list = a00.h0.J();
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(a00.i0.d0(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(g((ProtoBuf.Annotation) it.next(), container.b()));
        }
        return arrayList;
    }

    @Override // a30.g
    @m80.k
    public List<A> k(@m80.k m0 container, @m80.k kotlin.reflect.jvm.internal.impl.protobuf.n proto, @m80.k AnnotatedCallableKind kind) {
        List list;
        kotlin.jvm.internal.g0.p(container, "container");
        kotlin.jvm.internal.g0.p(proto, "proto");
        kotlin.jvm.internal.g0.p(kind, "kind");
        if (proto instanceof ProtoBuf.Constructor) {
            list = (List) ((ProtoBuf.Constructor) proto).getExtension(this.f1732a.c());
        } else if (proto instanceof ProtoBuf.Function) {
            list = (List) ((ProtoBuf.Function) proto).getExtension(this.f1732a.f());
        } else {
            if (!(proto instanceof ProtoBuf.Property)) {
                throw new IllegalStateException(("Unknown message: " + proto).toString());
            }
            int i11 = C0006a.f1733a[kind.ordinal()];
            if (i11 == 1) {
                list = (List) ((ProtoBuf.Property) proto).getExtension(this.f1732a.i());
            } else if (i11 == 2) {
                list = (List) ((ProtoBuf.Property) proto).getExtension(this.f1732a.m());
            } else {
                if (i11 != 3) {
                    throw new IllegalStateException("Unsupported callable kind with property proto");
                }
                list = (List) ((ProtoBuf.Property) proto).getExtension(this.f1732a.n());
            }
        }
        if (list == null) {
            list = a00.h0.J();
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(a00.i0.d0(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(g((ProtoBuf.Annotation) it.next(), container.b()));
        }
        return arrayList;
    }

    @Override // a30.g
    @m80.k
    public List<A> l(@m80.k m0 container, @m80.k kotlin.reflect.jvm.internal.impl.protobuf.n callableProto, @m80.k AnnotatedCallableKind kind, int i11, @m80.k ProtoBuf.ValueParameter proto) {
        kotlin.jvm.internal.g0.p(container, "container");
        kotlin.jvm.internal.g0.p(callableProto, "callableProto");
        kotlin.jvm.internal.g0.p(kind, "kind");
        kotlin.jvm.internal.g0.p(proto, "proto");
        List list = (List) proto.getExtension(this.f1732a.h());
        if (list == null) {
            list = a00.h0.J();
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(a00.i0.d0(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(g((ProtoBuf.Annotation) it.next(), container.b()));
        }
        return arrayList;
    }

    @m80.k
    public final z20.a m() {
        return this.f1732a;
    }
}

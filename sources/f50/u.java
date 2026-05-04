package f50;

import a00.k1;
import a00.l1;
import a00.w0;
import h50.d;
import h50.m;
import java.lang.annotation.Annotation;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.u0;
import yz.g2;
import yz.v0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@h
@u0({"SMAP\nSealedSerializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SealedSerializer.kt\nkotlinx/serialization/SealedClassSerializer\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Grouping.kt\nkotlin/collections/GroupingKt__GroupingKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 5 Platform.common.kt\nkotlinx/serialization/internal/Platform_commonKt\n+ 6 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,154:1\n1550#2:155\n1252#2,4:165\n53#3:156\n80#3,6:157\n463#4:163\n413#4:164\n82#5:169\n216#6,2:170\n*S KotlinDebug\n*F\n+ 1 SealedSerializer.kt\nkotlinx/serialization/SealedClassSerializer\n*L\n130#1:155\n140#1:165,4\n131#1:156\n131#1:157,6\n140#1:163\n140#1:164\n151#1:169\n109#1:170,2\n*E\n"})
/* loaded from: classes8.dex */
public final class u<T> extends j50.b<T> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final h10.d<T> f51055a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public List<? extends Annotation> f51056b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final yz.c0 f51057c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final Map<h10.d<? extends T>, i<? extends T>> f51058d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final Map<String, i<? extends T>> f51059e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\n_Collections.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt$groupingBy$1\n+ 2 SealedSerializer.kt\nkotlinx/serialization/SealedClassSerializer\n*L\n1#1,3794:1\n130#2:3795\n*E\n"})
    public static final class a implements w0<Map.Entry<? extends h10.d<? extends T>, ? extends i<? extends T>>, String> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Iterable f51060a;

        public a(Iterable iterable) {
            this.f51060a = iterable;
        }

        @Override // a00.w0
        public String a(Map.Entry<? extends h10.d<? extends T>, ? extends i<? extends T>> entry) {
            return entry.getValue().a().k();
        }

        @Override // a00.w0
        public Iterator<Map.Entry<? extends h10.d<? extends T>, ? extends i<? extends T>>> b() {
            return this.f51060a.iterator();
        }
    }

    public u(@m80.k final String serialName, @m80.k h10.d<T> baseClass, @m80.k h10.d<? extends T>[] subclasses, @m80.k i<? extends T>[] subclassSerializers) {
        kotlin.jvm.internal.g0.p(serialName, "serialName");
        kotlin.jvm.internal.g0.p(baseClass, "baseClass");
        kotlin.jvm.internal.g0.p(subclasses, "subclasses");
        kotlin.jvm.internal.g0.p(subclassSerializers, "subclassSerializers");
        this.f51055a = baseClass;
        this.f51056b = a00.h0.J();
        this.f51057c = yz.e0.b(LazyThreadSafetyMode.PUBLICATION, new x00.a() { // from class: f50.r
            @Override // x00.a
            public final Object invoke() {
                h50.f o11;
                o11 = u.o(serialName, this);
                return o11;
            }
        });
        if (subclasses.length != subclassSerializers.length) {
            throw new IllegalArgumentException("All subclasses of sealed class " + k().C() + " should be marked @Serializable");
        }
        Map<h10.d<? extends T>, i<? extends T>> B0 = l1.B0(a00.a0.WA(subclasses, subclassSerializers));
        this.f51058d = B0;
        w0 aVar = new a(B0.entrySet());
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> b11 = aVar.b();
        while (b11.hasNext()) {
            T next = b11.next();
            Object a11 = aVar.a(next);
            Object obj = linkedHashMap.get(a11);
            if (obj == null) {
                linkedHashMap.containsKey(a11);
            }
            Map.Entry entry = (Map.Entry) next;
            Map.Entry entry2 = (Map.Entry) obj;
            String str = (String) a11;
            if (entry2 != null) {
                throw new IllegalStateException(("Multiple sealed subclasses of '" + k() + "' have the same serial name '" + str + "': '" + entry2.getKey() + "', '" + entry.getKey() + '\'').toString());
            }
            linkedHashMap.put(a11, entry);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(k1.j(linkedHashMap.size()));
        for (Map.Entry entry3 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry3.getKey(), (i) ((Map.Entry) entry3.getValue()).getValue());
        }
        this.f51059e = linkedHashMap2;
    }

    public static final h50.f o(String str, final u uVar) {
        return h50.l.h(str, d.b.f58510a, new h50.f[0], new x00.l() { // from class: f50.s
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 p11;
                p11 = u.p(u.this, (h50.a) obj);
                return p11;
            }
        });
    }

    public static final g2 p(final u uVar, h50.a buildSerialDescriptor) {
        kotlin.jvm.internal.g0.p(buildSerialDescriptor, "$this$buildSerialDescriptor");
        h50.a.b(buildSerialDescriptor, "type", g50.a.F(kotlin.jvm.internal.w0.f67050a).a(), null, false, 12, null);
        h50.a.b(buildSerialDescriptor, "value", h50.l.h("kotlinx.serialization.Sealed<" + uVar.k().C() + u30.u0.f91710f, m.a.f58539a, new h50.f[0], new x00.l() { // from class: f50.t
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 q11;
                q11 = u.q(u.this, (h50.a) obj);
                return q11;
            }
        }), null, false, 12, null);
        buildSerialDescriptor.l(uVar.f51056b);
        return g2.f100423a;
    }

    public static final g2 q(u uVar, h50.a buildSerialDescriptor) {
        kotlin.jvm.internal.g0.p(buildSerialDescriptor, "$this$buildSerialDescriptor");
        for (Map.Entry<String, i<? extends T>> entry : uVar.f51059e.entrySet()) {
            h50.a.b(buildSerialDescriptor, entry.getKey(), entry.getValue().a(), null, false, 12, null);
        }
        return g2.f100423a;
    }

    @Override // f50.i, f50.b0, f50.e
    @m80.k
    public h50.f a() {
        return (h50.f) this.f51057c.getValue();
    }

    @Override // j50.b
    @m80.l
    public e<T> i(@m80.k i50.d decoder, @m80.l String str) {
        kotlin.jvm.internal.g0.p(decoder, "decoder");
        i<? extends T> iVar = this.f51059e.get(str);
        return iVar != null ? iVar : super.i(decoder, str);
    }

    @Override // j50.b
    @m80.l
    public b0<T> j(@m80.k i50.h encoder, @m80.k T value) {
        kotlin.jvm.internal.g0.p(encoder, "encoder");
        kotlin.jvm.internal.g0.p(value, "value");
        i<? extends T> iVar = this.f51058d.get(kotlin.jvm.internal.o0.d(value.getClass()));
        i<? extends T> j11 = iVar != null ? iVar : super.j(encoder, value);
        if (j11 != null) {
            return j11;
        }
        return null;
    }

    @Override // j50.b
    @m80.k
    public h10.d<T> k() {
        return this.f51055a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @v0
    public u(@m80.k String serialName, @m80.k h10.d<T> baseClass, @m80.k h10.d<? extends T>[] subclasses, @m80.k i<? extends T>[] subclassSerializers, @m80.k Annotation[] classAnnotations) {
        this(serialName, baseClass, subclasses, subclassSerializers);
        kotlin.jvm.internal.g0.p(serialName, "serialName");
        kotlin.jvm.internal.g0.p(baseClass, "baseClass");
        kotlin.jvm.internal.g0.p(subclasses, "subclasses");
        kotlin.jvm.internal.g0.p(subclassSerializers, "subclassSerializers");
        kotlin.jvm.internal.g0.p(classAnnotations, "classAnnotations");
        this.f51056b = a00.q.t(classAnnotations);
    }
}

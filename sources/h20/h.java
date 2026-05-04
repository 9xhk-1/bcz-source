package h20;

import a00.r0;
import androidx.exifinterface.media.ExifInterface;
import h20.x;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.u0;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import p10.j1;
import p10.x0;
import u30.k0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class h extends d<q10.c, s20.g<?>> {

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final p10.a0 f58071d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final p10.f0 f58072e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final a30.f f58073f;

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public m20.e f58074g;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public abstract class a implements x.a {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: h20.h$a$a, reason: collision with other inner class name */
        public static final class C0653a implements x.a {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ x.a f58076a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ x.a f58077b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ a f58078c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ n20.f f58079d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ ArrayList<q10.c> f58080e;

            public C0653a(x.a aVar, a aVar2, n20.f fVar, ArrayList<q10.c> arrayList) {
                this.f58077b = aVar;
                this.f58078c = aVar2;
                this.f58079d = fVar;
                this.f58080e = arrayList;
                this.f58076a = aVar;
            }

            @Override // h20.x.a
            public void a() {
                this.f58077b.a();
                this.f58078c.h(this.f58079d, new s20.a((q10.c) r0.m5(this.f58080e)));
            }

            @Override // h20.x.a
            public void b(n20.f fVar, s20.f value) {
                kotlin.jvm.internal.g0.p(value, "value");
                this.f58076a.b(fVar, value);
            }

            @Override // h20.x.a
            public x.b c(n20.f fVar) {
                return this.f58076a.c(fVar);
            }

            @Override // h20.x.a
            public x.a d(n20.f fVar, n20.b classId) {
                kotlin.jvm.internal.g0.p(classId, "classId");
                return this.f58076a.d(fVar, classId);
            }

            @Override // h20.x.a
            public void e(n20.f fVar, n20.b enumClassId, n20.f enumEntryName) {
                kotlin.jvm.internal.g0.p(enumClassId, "enumClassId");
                kotlin.jvm.internal.g0.p(enumEntryName, "enumEntryName");
                this.f58076a.e(fVar, enumClassId, enumEntryName);
            }

            @Override // h20.x.a
            public void f(n20.f fVar, Object obj) {
                this.f58076a.f(fVar, obj);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class b implements x.b {

            /* renamed from: a, reason: collision with root package name */
            public final ArrayList<s20.g<?>> f58081a = new ArrayList<>();

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f58082b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ n20.f f58083c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ a f58084d;

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            /* renamed from: h20.h$a$b$a, reason: collision with other inner class name */
            public static final class C0654a implements x.a {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ x.a f58085a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ x.a f58086b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ b f58087c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ ArrayList<q10.c> f58088d;

                public C0654a(x.a aVar, b bVar, ArrayList<q10.c> arrayList) {
                    this.f58086b = aVar;
                    this.f58087c = bVar;
                    this.f58088d = arrayList;
                    this.f58085a = aVar;
                }

                @Override // h20.x.a
                public void a() {
                    this.f58086b.a();
                    this.f58087c.f58081a.add(new s20.a((q10.c) r0.m5(this.f58088d)));
                }

                @Override // h20.x.a
                public void b(n20.f fVar, s20.f value) {
                    kotlin.jvm.internal.g0.p(value, "value");
                    this.f58085a.b(fVar, value);
                }

                @Override // h20.x.a
                public x.b c(n20.f fVar) {
                    return this.f58085a.c(fVar);
                }

                @Override // h20.x.a
                public x.a d(n20.f fVar, n20.b classId) {
                    kotlin.jvm.internal.g0.p(classId, "classId");
                    return this.f58085a.d(fVar, classId);
                }

                @Override // h20.x.a
                public void e(n20.f fVar, n20.b enumClassId, n20.f enumEntryName) {
                    kotlin.jvm.internal.g0.p(enumClassId, "enumClassId");
                    kotlin.jvm.internal.g0.p(enumEntryName, "enumEntryName");
                    this.f58085a.e(fVar, enumClassId, enumEntryName);
                }

                @Override // h20.x.a
                public void f(n20.f fVar, Object obj) {
                    this.f58085a.f(fVar, obj);
                }
            }

            public b(h hVar, n20.f fVar, a aVar) {
                this.f58082b = hVar;
                this.f58083c = fVar;
                this.f58084d = aVar;
            }

            @Override // h20.x.b
            public void a() {
                this.f58084d.g(this.f58083c, this.f58081a);
            }

            @Override // h20.x.b
            public void b(s20.f value) {
                kotlin.jvm.internal.g0.p(value, "value");
                this.f58081a.add(new s20.t(value));
            }

            @Override // h20.x.b
            public void c(Object obj) {
                this.f58081a.add(this.f58082b.O(this.f58083c, obj));
            }

            @Override // h20.x.b
            public x.a d(n20.b classId) {
                kotlin.jvm.internal.g0.p(classId, "classId");
                ArrayList arrayList = new ArrayList();
                h hVar = this.f58082b;
                x0 NO_SOURCE = x0.f78622a;
                kotlin.jvm.internal.g0.o(NO_SOURCE, "NO_SOURCE");
                x.a x11 = hVar.x(classId, NO_SOURCE, arrayList);
                kotlin.jvm.internal.g0.m(x11);
                return new C0654a(x11, this, arrayList);
            }

            @Override // h20.x.b
            public void e(n20.b enumClassId, n20.f enumEntryName) {
                kotlin.jvm.internal.g0.p(enumClassId, "enumClassId");
                kotlin.jvm.internal.g0.p(enumEntryName, "enumEntryName");
                this.f58081a.add(new s20.k(enumClassId, enumEntryName));
            }
        }

        public a() {
        }

        @Override // h20.x.a
        public void b(@m80.l n20.f fVar, @m80.k s20.f value) {
            kotlin.jvm.internal.g0.p(value, "value");
            h(fVar, new s20.t(value));
        }

        @Override // h20.x.a
        @m80.l
        public x.b c(@m80.l n20.f fVar) {
            return new b(h.this, fVar, this);
        }

        @Override // h20.x.a
        @m80.l
        public x.a d(@m80.l n20.f fVar, @m80.k n20.b classId) {
            kotlin.jvm.internal.g0.p(classId, "classId");
            ArrayList arrayList = new ArrayList();
            h hVar = h.this;
            x0 NO_SOURCE = x0.f78622a;
            kotlin.jvm.internal.g0.o(NO_SOURCE, "NO_SOURCE");
            x.a x11 = hVar.x(classId, NO_SOURCE, arrayList);
            kotlin.jvm.internal.g0.m(x11);
            return new C0653a(x11, this, fVar, arrayList);
        }

        @Override // h20.x.a
        public void e(@m80.l n20.f fVar, @m80.k n20.b enumClassId, @m80.k n20.f enumEntryName) {
            kotlin.jvm.internal.g0.p(enumClassId, "enumClassId");
            kotlin.jvm.internal.g0.p(enumEntryName, "enumEntryName");
            h(fVar, new s20.k(enumClassId, enumEntryName));
        }

        @Override // h20.x.a
        public void f(@m80.l n20.f fVar, @m80.l Object obj) {
            h(fVar, h.this.O(fVar, obj));
        }

        public abstract void g(@m80.l n20.f fVar, @m80.k ArrayList<s20.g<?>> arrayList);

        public abstract void h(@m80.l n20.f fVar, @m80.k s20.g<?> gVar);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nBinaryClassAnnotationAndConstantLoaderImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BinaryClassAnnotationAndConstantLoaderImpl.kt\norg/jetbrains/kotlin/load/kotlin/BinaryClassAnnotationAndConstantLoaderImpl$loadAnnotation$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,245:1\n808#2,11:246\n1628#2,3:257\n*S KotlinDebug\n*F\n+ 1 BinaryClassAnnotationAndConstantLoaderImpl.kt\norg/jetbrains/kotlin/load/kotlin/BinaryClassAnnotationAndConstantLoaderImpl$loadAnnotation$1\n*L\n93#1:246,11\n93#1:257,3\n*E\n"})
    public static final class b extends a {

        /* renamed from: b, reason: collision with root package name */
        public final HashMap<n20.f, s20.g<?>> f58089b;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ p10.b f58091d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ n20.b f58092e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ List<q10.c> f58093f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ x0 f58094g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(p10.b bVar, n20.b bVar2, List<q10.c> list, x0 x0Var) {
            super();
            this.f58091d = bVar;
            this.f58092e = bVar2;
            this.f58093f = list;
            this.f58094g = x0Var;
            this.f58089b = new HashMap<>();
        }

        @Override // h20.x.a
        public void a() {
            if (h.this.F(this.f58092e, this.f58089b) || h.this.w(this.f58092e)) {
                return;
            }
            this.f58093f.add(new q10.d(this.f58091d.s(), this.f58089b, this.f58094g));
        }

        @Override // h20.h.a
        public void g(n20.f fVar, ArrayList<s20.g<?>> elements) {
            kotlin.jvm.internal.g0.p(elements, "elements");
            if (fVar == null) {
                return;
            }
            j1 b11 = z10.a.b(fVar, this.f58091d);
            if (b11 != null) {
                HashMap<n20.f, s20.g<?>> hashMap = this.f58089b;
                s20.i iVar = s20.i.f87444a;
                List<? extends s20.g<?>> c11 = o30.a.c(elements);
                e30.r0 type = b11.getType();
                kotlin.jvm.internal.g0.o(type, "getType(...)");
                hashMap.put(fVar, iVar.b(c11, type));
                return;
            }
            if (h.this.w(this.f58092e) && kotlin.jvm.internal.g0.g(fVar.b(), "value")) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : elements) {
                    if (obj instanceof s20.a) {
                        arrayList.add(obj);
                    }
                }
                List<q10.c> list = this.f58093f;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    list.add(((s20.a) it.next()).b());
                }
            }
        }

        @Override // h20.h.a
        public void h(n20.f fVar, s20.g<?> value) {
            kotlin.jvm.internal.g0.p(value, "value");
            if (fVar != null) {
                this.f58089b.put(fVar, value);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(@m80.k p10.a0 module, @m80.k p10.f0 notFoundClasses, @m80.k d30.n storageManager, @m80.k v kotlinClassFinder) {
        super(storageManager, kotlinClassFinder);
        kotlin.jvm.internal.g0.p(module, "module");
        kotlin.jvm.internal.g0.p(notFoundClasses, "notFoundClasses");
        kotlin.jvm.internal.g0.p(storageManager, "storageManager");
        kotlin.jvm.internal.g0.p(kotlinClassFinder, "kotlinClassFinder");
        this.f58071d = module;
        this.f58072e = notFoundClasses;
        this.f58073f = new a30.f(module, notFoundClasses);
        this.f58074g = m20.e.f71807i;
    }

    public final s20.g<?> O(n20.f fVar, Object obj) {
        s20.g<?> e11 = s20.i.f87444a.e(obj, this.f58071d);
        if (e11 != null) {
            return e11;
        }
        return s20.l.f87447b.a("Unsupported annotation argument: " + fVar);
    }

    @Override // h20.e, a30.g
    @m80.k
    /* renamed from: P, reason: merged with bridge method [inline-methods] */
    public q10.c g(@m80.k ProtoBuf.Annotation proto, @m80.k k20.c nameResolver) {
        kotlin.jvm.internal.g0.p(proto, "proto");
        kotlin.jvm.internal.g0.p(nameResolver, "nameResolver");
        return this.f58073f.a(proto, nameResolver);
    }

    @Override // h20.d
    @m80.l
    /* renamed from: Q, reason: merged with bridge method [inline-methods] */
    public s20.g<?> I(@m80.k String desc, @m80.k Object initializer) {
        kotlin.jvm.internal.g0.p(desc, "desc");
        kotlin.jvm.internal.g0.p(initializer, "initializer");
        if (k0.n3("ZBCS", desc, false, 2, null)) {
            int intValue = ((Integer) initializer).intValue();
            int hashCode = desc.hashCode();
            if (hashCode == 66) {
                if (desc.equals("B")) {
                    initializer = Byte.valueOf((byte) intValue);
                }
                throw new AssertionError(desc);
            }
            if (hashCode == 67) {
                if (desc.equals("C")) {
                    initializer = Character.valueOf((char) intValue);
                }
                throw new AssertionError(desc);
            }
            if (hashCode == 83) {
                if (desc.equals(ExifInterface.LATITUDE_SOUTH)) {
                    initializer = Short.valueOf((short) intValue);
                }
                throw new AssertionError(desc);
            }
            if (hashCode == 90 && desc.equals("Z")) {
                initializer = Boolean.valueOf(intValue != 0);
            }
            throw new AssertionError(desc);
        }
        return s20.i.f87444a.e(initializer, this.f58071d);
    }

    public final p10.b R(n20.b bVar) {
        return p10.t.d(this.f58071d, bVar, this.f58072e);
    }

    public void S(@m80.k m20.e eVar) {
        kotlin.jvm.internal.g0.p(eVar, "<set-?>");
        this.f58074g = eVar;
    }

    @Override // h20.d
    @m80.l
    /* renamed from: T, reason: merged with bridge method [inline-methods] */
    public s20.g<?> M(@m80.k s20.g<?> constant) {
        kotlin.jvm.internal.g0.p(constant, "constant");
        return constant instanceof s20.d ? new s20.b0(((s20.d) constant).b().byteValue()) : constant instanceof s20.x ? new s20.e0(((s20.x) constant).b().shortValue()) : constant instanceof s20.n ? new s20.c0(((s20.n) constant).b().intValue()) : constant instanceof s20.u ? new s20.d0(((s20.u) constant).b().longValue()) : constant;
    }

    @Override // h20.e
    @m80.k
    public m20.e u() {
        return this.f58074g;
    }

    @Override // h20.e
    @m80.l
    public x.a x(@m80.k n20.b annotationClassId, @m80.k x0 source, @m80.k List<q10.c> result) {
        kotlin.jvm.internal.g0.p(annotationClassId, "annotationClassId");
        kotlin.jvm.internal.g0.p(source, "source");
        kotlin.jvm.internal.g0.p(result, "result");
        return new b(R(annotationClassId), annotationClassId, result, source);
    }
}

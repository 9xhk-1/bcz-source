package m10;

import a00.h0;
import h20.x;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import n20.b;
import n20.c;
import p10.x0;
import y10.d0;
import y10.e0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nSpecialJvmAnnotations.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpecialJvmAnnotations.kt\norg/jetbrains/kotlin/SpecialJvmAnnotations\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,42:1\n1628#2,3:43\n*S KotlinDebug\n*F\n+ 1 SpecialJvmAnnotations.kt\norg/jetbrains/kotlin/SpecialJvmAnnotations\n*L\n22#1:43,3\n*E\n"})
/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final a f71762a = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final Set<b> f71763b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final b f71764c;

    static {
        List Q = h0.Q(e0.f99030a, e0.f99041l, e0.f99042m, e0.f99033d, e0.f99035f, e0.f99038i);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        b.a aVar = b.f74280d;
        Iterator it = Q.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(aVar.c((c) it.next()));
        }
        f71763b = linkedHashSet;
        b.a aVar2 = b.f74280d;
        c REPEATABLE_ANNOTATION = e0.f99039j;
        g0.o(REPEATABLE_ANNOTATION, "REPEATABLE_ANNOTATION");
        f71764c = aVar2.c(REPEATABLE_ANNOTATION);
    }

    @k
    public final b a() {
        return f71764c;
    }

    @k
    public final Set<b> b() {
        return f71763b;
    }

    public final boolean c(@k x klass) {
        g0.p(klass, "klass");
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        klass.d(new C0866a(booleanRef), null);
        return booleanRef.element;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: m10.a$a, reason: collision with other inner class name */
    public static final class C0866a implements x.c {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Ref.BooleanRef f71765a;

        public C0866a(Ref.BooleanRef booleanRef) {
            this.f71765a = booleanRef;
        }

        @Override // h20.x.c
        public x.a c(b classId, x0 source) {
            g0.p(classId, "classId");
            g0.p(source, "source");
            if (!g0.g(classId, d0.f99024a.a())) {
                return null;
            }
            this.f71765a.element = true;
            return null;
        }

        @Override // h20.x.c
        public void a() {
        }
    }
}

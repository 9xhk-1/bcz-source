package h50;

import java.util.Iterator;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class i {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements Iterator<f>, y00.a {

        /* renamed from: a, reason: collision with root package name */
        public int f58533a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ f f58534b;

        public a(f fVar) {
            this.f58534b = fVar;
            this.f58533a = fVar.h();
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public f next() {
            f fVar = this.f58534b;
            int h11 = fVar.h();
            int i11 = this.f58533a;
            this.f58533a = i11 - 1;
            return fVar.e(h11 - i11);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f58533a > 0;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b implements Iterator<String>, y00.a {

        /* renamed from: a, reason: collision with root package name */
        public int f58535a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ f f58536b;

        public b(f fVar) {
            this.f58536b = fVar;
            this.f58535a = fVar.h();
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public String next() {
            f fVar = this.f58536b;
            int h11 = fVar.h();
            int i11 = this.f58535a;
            this.f58535a = i11 - 1;
            return fVar.i(h11 - i11);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f58535a > 0;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nIterables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Iterables.kt\nkotlin/collections/CollectionsKt__IterablesKt$Iterable$1\n+ 2 SerialDescriptor.kt\nkotlinx/serialization/descriptors/SerialDescriptorKt\n*L\n1#1,70:1\n415#2,8:71\n*E\n"})
    public static final class c implements Iterable<f>, y00.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ f f58537a;

        public c(f fVar) {
            this.f58537a = fVar;
        }

        @Override // java.lang.Iterable
        public Iterator<f> iterator() {
            return new a(this.f58537a);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nIterables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Iterables.kt\nkotlin/collections/CollectionsKt__IterablesKt$Iterable$1\n+ 2 SerialDescriptor.kt\nkotlinx/serialization/descriptors/SerialDescriptorKt\n*L\n1#1,70:1\n439#2,8:71\n*E\n"})
    public static final class d implements Iterable<String>, y00.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ f f58538a;

        public d(f fVar) {
            this.f58538a = fVar;
        }

        @Override // java.lang.Iterable
        public Iterator<String> iterator() {
            return new b(this.f58538a);
        }
    }

    @m80.k
    public static final Iterable<f> a(@m80.k f fVar) {
        g0.p(fVar, "<this>");
        return new c(fVar);
    }

    @m80.k
    public static final Iterable<String> b(@m80.k f fVar) {
        g0.p(fVar, "<this>");
        return new d(fVar);
    }
}

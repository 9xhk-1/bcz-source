package y;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import x00.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nConcurrentMutableSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConcurrentMutableSet.kt\nco/touchlab/stately/collections/ConcurrentMutableSet\n+ 2 Synchronizable.kt\nco/touchlab/stately/concurrency/SynchronizableKt\n*L\n1#1,19:1\n5#2:20\n*S KotlinDebug\n*F\n+ 1 ConcurrentMutableSet.kt\nco/touchlab/stately/collections/ConcurrentMutableSet\n*L\n11#1:20\n*E\n"})
/* loaded from: classes3.dex */
public final class f<E> extends y.a<E> implements Set<E>, y00.h {

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Set<E> f98778c;

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a<R> extends Lambda implements x00.a<R> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ f<E> f98779a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l<Set<E>, R> f98780b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(f<E> fVar, l<? super Set<E>, ? extends R> lVar) {
            super(0);
            this.f98779a = fVar;
            this.f98780b = lVar;
        }

        @Override // x00.a
        public final R invoke() {
            j jVar = new j(this.f98779a.f98778c);
            R invoke = this.f98780b.invoke(jVar);
            jVar.h(new LinkedHashSet());
            return invoke;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(@m80.l Object obj, @k Set<E> del) {
        super(obj, del);
        g0.p(del, "del");
        this.f98778c = del;
    }

    public final <R> R h(@k l<? super Set<E>, ? extends R> f11) {
        R invoke;
        g0.p(f11, "f");
        Object f12 = f();
        a aVar = new a(this, f11);
        synchronized (f12) {
            invoke = aVar.invoke();
        }
        return invoke;
    }

    public f() {
        this(null, new LinkedHashSet());
    }
}

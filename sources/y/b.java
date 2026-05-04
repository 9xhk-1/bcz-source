package y;

import java.util.Iterator;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nConcurrentMutableCollection.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConcurrentMutableCollection.kt\nco/touchlab/stately/collections/ConcurrentMutableIterator\n+ 2 Synchronizable.kt\nco/touchlab/stately/concurrency/SynchronizableKt\n*L\n1#1,83:1\n5#2:84\n5#2:85\n5#2:86\n*S KotlinDebug\n*F\n+ 1 ConcurrentMutableCollection.kt\nco/touchlab/stately/collections/ConcurrentMutableIterator\n*L\n52#1:84\n54#1:85\n57#1:86\n*E\n"})
/* loaded from: classes3.dex */
public class b<E> implements Iterator<E>, y00.d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Object f98711a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Iterator<E> f98712b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a extends Lambda implements x00.a<Boolean> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b<E> f98713a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(b<E> bVar) {
            super(0);
            this.f98713a = bVar;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // x00.a
        @k
        public final Boolean invoke() {
            return Boolean.valueOf(this.f98713a.f98712b.hasNext());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: y.b$b, reason: collision with other inner class name */
    public static final class C1336b extends Lambda implements x00.a<E> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b<E> f98714a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1336b(b<E> bVar) {
            super(0);
            this.f98714a = bVar;
        }

        @Override // x00.a
        public final E invoke() {
            return (E) this.f98714a.f98712b.next();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c extends Lambda implements x00.a<g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b<E> f98715a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(b<E> bVar) {
            super(0);
            this.f98715a = bVar;
        }

        @Override // x00.a
        public /* bridge */ /* synthetic */ g2 invoke() {
            invoke2();
            return g2.f100423a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f98715a.f98712b.remove();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(@k Object root, @k Iterator<? extends E> del) {
        g0.p(root, "root");
        g0.p(del, "del");
        this.f98711a = root;
        this.f98712b = del;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        Boolean invoke;
        Object obj = this.f98711a;
        a aVar = new a(this);
        synchronized (obj) {
            invoke = aVar.invoke();
        }
        return invoke.booleanValue();
    }

    @Override // java.util.Iterator
    public E next() {
        E invoke;
        Object obj = this.f98711a;
        C1336b c1336b = new C1336b(this);
        synchronized (obj) {
            invoke = c1336b.invoke();
        }
        return invoke;
    }

    @Override // java.util.Iterator
    public void remove() {
        Object obj = this.f98711a;
        c cVar = new c(this);
        synchronized (obj) {
            cVar.invoke();
        }
    }
}

package y;

import java.util.ListIterator;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nConcurrentMutableMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConcurrentMutableMap.kt\nco/touchlab/stately/collections/ConcurrentMutableListIterator\n+ 2 Synchronizable.kt\nco/touchlab/stately/concurrency/SynchronizableKt\n*L\n1#1,119:1\n5#2:120\n5#2:121\n5#2:122\n5#2:123\n5#2:124\n5#2:125\n*S KotlinDebug\n*F\n+ 1 ConcurrentMutableMap.kt\nco/touchlab/stately/collections/ConcurrentMutableListIterator\n*L\n72#1:120\n74#1:121\n76#1:122\n78#1:123\n81#1:124\n85#1:125\n*E\n"})
/* loaded from: classes3.dex */
public final class d<E> extends y.b<E> implements ListIterator<E>, y00.f {

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Object f98742c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final ListIterator<E> f98743d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a extends Lambda implements x00.a<g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d<E> f98744a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ E f98745b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(d<E> dVar, E e11) {
            super(0);
            this.f98744a = dVar;
            this.f98745b = e11;
        }

        @Override // x00.a
        public /* bridge */ /* synthetic */ g2 invoke() {
            invoke2();
            return g2.f100423a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f98744a.f98743d.add(this.f98745b);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b extends Lambda implements x00.a<Boolean> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d<E> f98746a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(d<E> dVar) {
            super(0);
            this.f98746a = dVar;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // x00.a
        @k
        public final Boolean invoke() {
            return Boolean.valueOf(this.f98746a.f98743d.hasPrevious());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c extends Lambda implements x00.a<Integer> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d<E> f98747a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(d<E> dVar) {
            super(0);
            this.f98747a = dVar;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // x00.a
        @k
        public final Integer invoke() {
            return Integer.valueOf(this.f98747a.f98743d.nextIndex());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: y.d$d, reason: collision with other inner class name */
    public static final class C1338d extends Lambda implements x00.a<E> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d<E> f98748a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1338d(d<E> dVar) {
            super(0);
            this.f98748a = dVar;
        }

        @Override // x00.a
        public final E invoke() {
            return (E) this.f98748a.f98743d.previous();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class e extends Lambda implements x00.a<Integer> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d<E> f98749a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(d<E> dVar) {
            super(0);
            this.f98749a = dVar;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // x00.a
        @k
        public final Integer invoke() {
            return Integer.valueOf(this.f98749a.f98743d.previousIndex());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class f extends Lambda implements x00.a<g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d<E> f98750a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ E f98751b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(d<E> dVar, E e11) {
            super(0);
            this.f98750a = dVar;
            this.f98751b = e11;
        }

        @Override // x00.a
        public /* bridge */ /* synthetic */ g2 invoke() {
            invoke2();
            return g2.f100423a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f98750a.f98743d.set(this.f98751b);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(@k Object root, @k ListIterator<E> del) {
        super(root, del);
        g0.p(root, "root");
        g0.p(del, "del");
        this.f98742c = root;
        this.f98743d = del;
    }

    @Override // java.util.ListIterator
    public void add(E e11) {
        Object obj = this.f98742c;
        a aVar = new a(this, e11);
        synchronized (obj) {
            aVar.invoke();
        }
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        Boolean invoke;
        Object obj = this.f98742c;
        b bVar = new b(this);
        synchronized (obj) {
            invoke = bVar.invoke();
        }
        return invoke.booleanValue();
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        Integer invoke;
        Object obj = this.f98742c;
        c cVar = new c(this);
        synchronized (obj) {
            invoke = cVar.invoke();
        }
        return invoke.intValue();
    }

    @Override // java.util.ListIterator
    public E previous() {
        E invoke;
        Object obj = this.f98742c;
        C1338d c1338d = new C1338d(this);
        synchronized (obj) {
            invoke = c1338d.invoke();
        }
        return invoke;
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        Integer invoke;
        Object obj = this.f98742c;
        e eVar = new e(this);
        synchronized (obj) {
            invoke = eVar.invoke();
        }
        return invoke.intValue();
    }

    @Override // java.util.ListIterator
    public void set(E e11) {
        Object obj = this.f98742c;
        f fVar = new f(this, e11);
        synchronized (obj) {
            fVar.invoke();
        }
    }
}

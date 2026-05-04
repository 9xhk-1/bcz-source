package y;

import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nConcurrentMutableCollection.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConcurrentMutableCollection.kt\nco/touchlab/stately/collections/ConcurrentMutableCollection\n+ 2 Synchronizable.kt\nco/touchlab/stately/concurrency/SynchronizableKt\n*L\n1#1,83:1\n5#2:84\n5#2:85\n5#2:86\n5#2:87\n5#2:88\n5#2:89\n5#2:90\n5#2:91\n5#2:92\n5#2:93\n5#2:94\n5#2:95\n*S KotlinDebug\n*F\n+ 1 ConcurrentMutableCollection.kt\nco/touchlab/stately/collections/ConcurrentMutableCollection\n*L\n13#1:84\n15#1:85\n17#1:86\n19#1:87\n21#1:88\n23#1:89\n26#1:90\n30#1:91\n32#1:92\n34#1:93\n36#1:94\n38#1:95\n*E\n"})
/* loaded from: classes3.dex */
public class a<E> implements Collection<E>, y00.b {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final Collection<E> f98689a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final Object f98690b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: y.a$a, reason: collision with other inner class name */
    public static final class C1335a extends Lambda implements x00.a<Boolean> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a<E> f98691a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ E f98692b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1335a(a<E> aVar, E e11) {
            super(0);
            this.f98691a = aVar;
            this.f98692b = e11;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // x00.a
        @m80.k
        public final Boolean invoke() {
            return Boolean.valueOf(this.f98691a.f98689a.add(this.f98692b));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b extends Lambda implements x00.a<Boolean> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a<E> f98693a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Collection<E> f98694b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(a<E> aVar, Collection<? extends E> collection) {
            super(0);
            this.f98693a = aVar;
            this.f98694b = collection;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // x00.a
        @m80.k
        public final Boolean invoke() {
            return Boolean.valueOf(this.f98693a.f98689a.addAll(this.f98694b));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c<R> extends Lambda implements x00.a<R> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a<E> f98695a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ x00.l<Collection<E>, R> f98696b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(a<E> aVar, x00.l<? super Collection<E>, ? extends R> lVar) {
            super(0);
            this.f98695a = aVar;
            this.f98696b = lVar;
        }

        @Override // x00.a
        public final R invoke() {
            y.g gVar = new y.g(this.f98695a.f98689a);
            R invoke = this.f98696b.invoke(gVar);
            gVar.f(null);
            return invoke;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class d extends Lambda implements x00.a<g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a<E> f98697a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(a<E> aVar) {
            super(0);
            this.f98697a = aVar;
        }

        @Override // x00.a
        public /* bridge */ /* synthetic */ g2 invoke() {
            invoke2();
            return g2.f100423a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f98697a.f98689a.clear();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class e extends Lambda implements x00.a<Boolean> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a<E> f98698a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ E f98699b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(a<E> aVar, E e11) {
            super(0);
            this.f98698a = aVar;
            this.f98699b = e11;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // x00.a
        @m80.k
        public final Boolean invoke() {
            return Boolean.valueOf(this.f98698a.f98689a.contains(this.f98699b));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class f extends Lambda implements x00.a<Boolean> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a<E> f98700a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Collection<E> f98701b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f(a<E> aVar, Collection<? extends E> collection) {
            super(0);
            this.f98700a = aVar;
            this.f98701b = collection;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // x00.a
        @m80.k
        public final Boolean invoke() {
            return Boolean.valueOf(this.f98700a.f98689a.containsAll(this.f98701b));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class g extends Lambda implements x00.a<Boolean> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a<E> f98702a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(a<E> aVar) {
            super(0);
            this.f98702a = aVar;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // x00.a
        @m80.k
        public final Boolean invoke() {
            return Boolean.valueOf(this.f98702a.f98689a.isEmpty());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class h extends Lambda implements x00.a<y.b<E>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a<E> f98703a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(a<E> aVar) {
            super(0);
            this.f98703a = aVar;
        }

        @Override // x00.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final y.b<E> invoke() {
            return new y.b<>(this.f98703a.f(), this.f98703a.f98689a.iterator());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class i extends Lambda implements x00.a<Boolean> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a<E> f98704a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ E f98705b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(a<E> aVar, E e11) {
            super(0);
            this.f98704a = aVar;
            this.f98705b = e11;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // x00.a
        @m80.k
        public final Boolean invoke() {
            return Boolean.valueOf(this.f98704a.f98689a.remove(this.f98705b));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class j extends Lambda implements x00.a<Boolean> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a<E> f98706a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Collection<E> f98707b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public j(a<E> aVar, Collection<? extends E> collection) {
            super(0);
            this.f98706a = aVar;
            this.f98707b = collection;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // x00.a
        @m80.k
        public final Boolean invoke() {
            return Boolean.valueOf(this.f98706a.f98689a.removeAll(this.f98707b));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class k extends Lambda implements x00.a<Boolean> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a<E> f98708a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Collection<E> f98709b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public k(a<E> aVar, Collection<? extends E> collection) {
            super(0);
            this.f98708a = aVar;
            this.f98709b = collection;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // x00.a
        @m80.k
        public final Boolean invoke() {
            return Boolean.valueOf(this.f98708a.f98689a.retainAll(this.f98709b));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class l extends Lambda implements x00.a<Integer> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a<E> f98710a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(a<E> aVar) {
            super(0);
            this.f98710a = aVar;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // x00.a
        @m80.k
        public final Integer invoke() {
            return Integer.valueOf(this.f98710a.f98689a.size());
        }
    }

    public /* synthetic */ a(Object obj, Collection collection, int i11, v vVar) {
        this((i11 & 1) != 0 ? null : obj, collection);
    }

    @Override // java.util.Collection
    public boolean add(E e11) {
        Boolean invoke;
        Object obj = this.f98690b;
        C1335a c1335a = new C1335a(this, e11);
        synchronized (obj) {
            invoke = c1335a.invoke();
        }
        return invoke.booleanValue();
    }

    @Override // java.util.Collection
    public boolean addAll(@m80.k Collection<? extends E> elements) {
        Boolean invoke;
        g0.p(elements, "elements");
        Object obj = this.f98690b;
        b bVar = new b(this, elements);
        synchronized (obj) {
            invoke = bVar.invoke();
        }
        return invoke.booleanValue();
    }

    public final <R> R b(@m80.k x00.l<? super Collection<E>, ? extends R> f11) {
        R invoke;
        g0.p(f11, "f");
        Object obj = this.f98690b;
        c cVar = new c(this, f11);
        synchronized (obj) {
            invoke = cVar.invoke();
        }
        return invoke;
    }

    @Override // java.util.Collection
    public void clear() {
        Object obj = this.f98690b;
        d dVar = new d(this);
        synchronized (obj) {
            dVar.invoke();
        }
    }

    @Override // java.util.Collection
    public boolean contains(Object obj) {
        Boolean invoke;
        Object obj2 = this.f98690b;
        e eVar = new e(this, obj);
        synchronized (obj2) {
            invoke = eVar.invoke();
        }
        return invoke.booleanValue();
    }

    @Override // java.util.Collection
    public boolean containsAll(@m80.k Collection<? extends Object> elements) {
        Boolean invoke;
        g0.p(elements, "elements");
        Object obj = this.f98690b;
        f fVar = new f(this, elements);
        synchronized (obj) {
            invoke = fVar.invoke();
        }
        return invoke.booleanValue();
    }

    public int d() {
        Integer invoke;
        Object obj = this.f98690b;
        l lVar = new l(this);
        synchronized (obj) {
            invoke = lVar.invoke();
        }
        return invoke.intValue();
    }

    @m80.k
    public final Object f() {
        return this.f98690b;
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        Boolean invoke;
        Object obj = this.f98690b;
        g gVar = new g(this);
        synchronized (obj) {
            invoke = gVar.invoke();
        }
        return invoke.booleanValue();
    }

    @Override // java.util.Collection, java.lang.Iterable
    @m80.k
    public Iterator<E> iterator() {
        y.b<E> invoke;
        Object obj = this.f98690b;
        h hVar = new h(this);
        synchronized (obj) {
            invoke = hVar.invoke();
        }
        return invoke;
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        Boolean invoke;
        Object obj2 = this.f98690b;
        i iVar = new i(this, obj);
        synchronized (obj2) {
            invoke = iVar.invoke();
        }
        return invoke.booleanValue();
    }

    @Override // java.util.Collection
    public boolean removeAll(@m80.k Collection<? extends Object> elements) {
        Boolean invoke;
        g0.p(elements, "elements");
        Object obj = this.f98690b;
        j jVar = new j(this, elements);
        synchronized (obj) {
            invoke = jVar.invoke();
        }
        return invoke.booleanValue();
    }

    @Override // java.util.Collection
    public boolean retainAll(@m80.k Collection<? extends Object> elements) {
        Boolean invoke;
        g0.p(elements, "elements");
        Object obj = this.f98690b;
        k kVar = new k(this, elements);
        synchronized (obj) {
            invoke = kVar.invoke();
        }
        return invoke.booleanValue();
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return d();
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return u.a(this);
    }

    public a(@m80.l Object obj, @m80.k Collection<E> del) {
        g0.p(del, "del");
        this.f98689a = del;
        this.f98690b = obj == null ? this : obj;
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] array) {
        g0.p(array, "array");
        return (T[]) u.b(this, array);
    }
}

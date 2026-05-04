package y;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nConcurrentMutableList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConcurrentMutableList.kt\nco/touchlab/stately/collections/ConcurrentMutableList\n+ 2 Synchronizable.kt\nco/touchlab/stately/concurrency/SynchronizableKt\n*L\n1#1,65:1\n5#2:66\n5#2:67\n5#2:68\n5#2:69\n5#2:70\n5#2:71\n5#2:72\n5#2:73\n5#2:74\n5#2:75\n5#2:76\n*S KotlinDebug\n*F\n+ 1 ConcurrentMutableList.kt\nco/touchlab/stately/collections/ConcurrentMutableList\n*L\n10#1:66\n12#1:67\n14#1:68\n17#1:69\n21#1:70\n24#1:71\n27#1:72\n29#1:73\n31#1:74\n34#1:75\n36#1:76\n*E\n"})
/* loaded from: classes3.dex */
public final class c<E> extends y.a<E> implements List<E>, y00.e {

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final List<E> f98716c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a extends Lambda implements x00.a<g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c<E> f98717a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f98718b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ E f98719c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(c<E> cVar, int i11, E e11) {
            super(0);
            this.f98717a = cVar;
            this.f98718b = i11;
            this.f98719c = e11;
        }

        @Override // x00.a
        public /* bridge */ /* synthetic */ g2 invoke() {
            invoke2();
            return g2.f100423a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f98717a.f98716c.add(this.f98718b, this.f98719c);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b extends Lambda implements x00.a<Boolean> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c<E> f98720a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f98721b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Collection<E> f98722c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(c<E> cVar, int i11, Collection<? extends E> collection) {
            super(0);
            this.f98720a = cVar;
            this.f98721b = i11;
            this.f98722c = collection;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // x00.a
        @m80.k
        public final Boolean invoke() {
            return Boolean.valueOf(this.f98720a.f98716c.addAll(this.f98721b, this.f98722c));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: y.c$c, reason: collision with other inner class name */
    public static final class C1337c<R> extends Lambda implements x00.a<R> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c<E> f98723a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l<List<E>, R> f98724b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C1337c(c<E> cVar, l<? super List<E>, ? extends R> lVar) {
            super(0);
            this.f98723a = cVar;
            this.f98724b = lVar;
        }

        @Override // x00.a
        public final R invoke() {
            y.h hVar = new y.h(this.f98723a.f98716c);
            R invoke = this.f98724b.invoke(hVar);
            hVar.j(new ArrayList());
            return invoke;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class d extends Lambda implements x00.a<E> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c<E> f98725a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f98726b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(c<E> cVar, int i11) {
            super(0);
            this.f98725a = cVar;
            this.f98726b = i11;
        }

        @Override // x00.a
        public final E invoke() {
            return (E) this.f98725a.f98716c.get(this.f98726b);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class e extends Lambda implements x00.a<Integer> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c<E> f98727a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ E f98728b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(c<E> cVar, E e11) {
            super(0);
            this.f98727a = cVar;
            this.f98728b = e11;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // x00.a
        @m80.k
        public final Integer invoke() {
            return Integer.valueOf(this.f98727a.f98716c.indexOf(this.f98728b));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class f extends Lambda implements x00.a<Integer> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c<E> f98729a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ E f98730b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(c<E> cVar, E e11) {
            super(0);
            this.f98729a = cVar;
            this.f98730b = e11;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // x00.a
        @m80.k
        public final Integer invoke() {
            return Integer.valueOf(this.f98729a.f98716c.lastIndexOf(this.f98730b));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class g extends Lambda implements x00.a<y.d<E>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c<E> f98731a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(c<E> cVar) {
            super(0);
            this.f98731a = cVar;
        }

        @Override // x00.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final y.d<E> invoke() {
            c<E> cVar = this.f98731a;
            return new y.d<>(cVar, cVar.f98716c.listIterator());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class h extends Lambda implements x00.a<y.d<E>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c<E> f98732a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f98733b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(c<E> cVar, int i11) {
            super(0);
            this.f98732a = cVar;
            this.f98733b = i11;
        }

        @Override // x00.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final y.d<E> invoke() {
            c<E> cVar = this.f98732a;
            return new y.d<>(cVar, cVar.f98716c.listIterator(this.f98733b));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class i extends Lambda implements x00.a<E> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c<E> f98734a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f98735b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(c<E> cVar, int i11) {
            super(0);
            this.f98734a = cVar;
            this.f98735b = i11;
        }

        @Override // x00.a
        public final E invoke() {
            return (E) this.f98734a.f98716c.remove(this.f98735b);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class j extends Lambda implements x00.a<E> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c<E> f98736a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f98737b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ E f98738c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(c<E> cVar, int i11, E e11) {
            super(0);
            this.f98736a = cVar;
            this.f98737b = i11;
            this.f98738c = e11;
        }

        @Override // x00.a
        public final E invoke() {
            return (E) this.f98736a.f98716c.set(this.f98737b, this.f98738c);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class k extends Lambda implements x00.a<c<E>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c<E> f98739a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f98740b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f98741c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(c<E> cVar, int i11, int i12) {
            super(0);
            this.f98739a = cVar;
            this.f98740b = i11;
            this.f98741c = i12;
        }

        @Override // x00.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final c<E> invoke() {
            c<E> cVar = this.f98739a;
            return new c<>(cVar, cVar.f98716c.subList(this.f98740b, this.f98741c));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(@m80.l Object obj, @m80.k List<E> del) {
        super(obj, del);
        g0.p(del, "del");
        this.f98716c = del;
    }

    @Override // java.util.List
    public void add(int i11, E e11) {
        Object f11 = f();
        a aVar = new a(this, i11, e11);
        synchronized (f11) {
            aVar.invoke();
        }
    }

    @Override // java.util.List
    public boolean addAll(int i11, @m80.k Collection<? extends E> elements) {
        Boolean invoke;
        g0.p(elements, "elements");
        Object f11 = f();
        b bVar = new b(this, i11, elements);
        synchronized (f11) {
            invoke = bVar.invoke();
        }
        return invoke.booleanValue();
    }

    @Override // java.util.List
    public E get(int i11) {
        E invoke;
        Object f11 = f();
        d dVar = new d(this, i11);
        synchronized (f11) {
            invoke = dVar.invoke();
        }
        return invoke;
    }

    public final <R> R h(@m80.k l<? super List<E>, ? extends R> f11) {
        R invoke;
        g0.p(f11, "f");
        Object f12 = f();
        C1337c c1337c = new C1337c(this, f11);
        synchronized (f12) {
            invoke = c1337c.invoke();
        }
        return invoke;
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        Integer invoke;
        Object f11 = f();
        e eVar = new e(this, obj);
        synchronized (f11) {
            invoke = eVar.invoke();
        }
        return invoke.intValue();
    }

    public E j(int i11) {
        E invoke;
        Object f11 = f();
        i iVar = new i(this, i11);
        synchronized (f11) {
            invoke = iVar.invoke();
        }
        return invoke;
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        Integer invoke;
        Object f11 = f();
        f fVar = new f(this, obj);
        synchronized (f11) {
            invoke = fVar.invoke();
        }
        return invoke.intValue();
    }

    @Override // java.util.List
    @m80.k
    public ListIterator<E> listIterator() {
        y.d<E> invoke;
        Object f11 = f();
        g gVar = new g(this);
        synchronized (f11) {
            invoke = gVar.invoke();
        }
        return invoke;
    }

    @Override // java.util.List
    public final /* bridge */ E remove(int i11) {
        return j(i11);
    }

    @Override // java.util.List
    public E set(int i11, E e11) {
        E invoke;
        Object f11 = f();
        j jVar = new j(this, i11, e11);
        synchronized (f11) {
            invoke = jVar.invoke();
        }
        return invoke;
    }

    @Override // java.util.List
    @m80.k
    public List<E> subList(int i11, int i12) {
        c<E> invoke;
        Object f11 = f();
        k kVar = new k(this, i11, i12);
        synchronized (f11) {
            invoke = kVar.invoke();
        }
        return invoke;
    }

    public c() {
        this(null, new ArrayList());
    }

    @Override // java.util.List
    @m80.k
    public ListIterator<E> listIterator(int i11) {
        y.d<E> invoke;
        Object f11 = f();
        h hVar = new h(this, i11);
        synchronized (f11) {
            invoke = hVar.invoke();
        }
        return invoke;
    }
}

package io.ktor.util.internal;

import androidx.exifinterface.media.ExifInterface;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import yz.v0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nLockFreeLinkedList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LockFreeLinkedList.kt\nio/ktor/util/internal/LockFreeLinkedListNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 AtomicFU.common.kt\nkotlinx/atomicfu/AtomicFU_commonKt\n*L\n1#1,809:1\n172#1,3:815\n172#1,3:818\n1#2:810\n154#3,2:811\n154#3,2:813\n154#3,2:821\n154#3,2:823\n*S KotlinDebug\n*F\n+ 1 LockFreeLinkedList.kt\nio/ktor/util/internal/LockFreeLinkedListNode\n*L\n238#1:815,3\n261#1:818,3\n181#1:811,2\n193#1:813,2\n618#1:821,2\n636#1:823,2\n*E\n"})
/* loaded from: classes8.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f62018a = AtomicReferenceFieldUpdater.newUpdater(f.class, Object.class, "_next");

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f62019b = AtomicReferenceFieldUpdater.newUpdater(f.class, Object.class, "_prev");

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f62020c = AtomicReferenceFieldUpdater.newUpdater(f.class, Object.class, "_removedRef");

    @k
    volatile /* synthetic */ Object _next = this;

    @k
    volatile /* synthetic */ Object _prev = this;

    @k
    private volatile /* synthetic */ Object _removedRef = null;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nLockFreeLinkedList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LockFreeLinkedList.kt\nio/ktor/util/internal/LockFreeLinkedListNode$AbstractAtomicDesc\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,809:1\n1#2:810\n*E\n"})
    public static abstract class a extends io.ktor.util.internal.a {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: io.ktor.util.internal.f$a$a, reason: collision with other inner class name */
        public static final class C0717a extends g {

            /* renamed from: a, reason: collision with root package name */
            @w00.g
            @k
            public final f f62021a;

            /* renamed from: b, reason: collision with root package name */
            @w00.g
            @k
            public final io.ktor.util.internal.b<f> f62022b;

            /* renamed from: c, reason: collision with root package name */
            @w00.g
            @k
            public final a f62023c;

            /* JADX WARN: Multi-variable type inference failed */
            public C0717a(@k f next, @k io.ktor.util.internal.b<? super f> op2, @k a desc) {
                g0.p(next, "next");
                g0.p(op2, "op");
                g0.p(desc, "desc");
                this.f62021a = next;
                this.f62022b = op2;
                this.f62023c = desc;
            }

            @Override // io.ktor.util.internal.g
            @l
            public Object a(@l Object obj) {
                Object obj2;
                g0.n(obj, "null cannot be cast to non-null type io.ktor.util.internal.LockFreeLinkedListNode");
                f fVar = (f) obj;
                Object g11 = this.f62023c.g(fVar, this.f62021a);
                if (g11 == null) {
                    androidx.concurrent.futures.a.a(f.f62018a, fVar, this, this.f62022b.d() ? this.f62021a : this.f62022b);
                    return null;
                }
                obj2 = io.ktor.util.internal.e.f62016g;
                if (g11 == obj2) {
                    if (androidx.concurrent.futures.a.a(f.f62018a, fVar, this, this.f62021a.F())) {
                        fVar.w();
                    }
                    return g11;
                }
                this.f62022b.f(g11);
                androidx.concurrent.futures.a.a(f.f62018a, fVar, this, this.f62021a);
                return g11;
            }
        }

        @Override // io.ktor.util.internal.a
        public final void a(@k io.ktor.util.internal.b<?> op2, @l Object obj) {
            g0.p(op2, "op");
            boolean z11 = obj == null;
            f e11 = e();
            if (e11 == null) {
                if (z11) {
                    throw new IllegalStateException("Check failed.");
                }
                return;
            }
            f f11 = f();
            if (f11 == null) {
                if (z11) {
                    throw new IllegalStateException("Check failed.");
                }
            } else {
                if (androidx.concurrent.futures.a.a(f.f62018a, e11, op2, z11 ? j(e11, f11) : f11) && z11) {
                    d(e11, f11);
                }
            }
        }

        @Override // io.ktor.util.internal.a
        @l
        public final Object b(@k io.ktor.util.internal.b<?> op2) {
            Object obj;
            g0.p(op2, "op");
            while (true) {
                f i11 = i(op2);
                Object obj2 = i11._next;
                if (obj2 == op2 || op2.d()) {
                    return null;
                }
                if (obj2 instanceof g) {
                    ((g) obj2).a(i11);
                } else {
                    Object c11 = c(i11, obj2);
                    if (c11 != null) {
                        return c11;
                    }
                    if (h(i11, obj2)) {
                        continue;
                    } else {
                        g0.n(obj2, "null cannot be cast to non-null type io.ktor.util.internal.LockFreeLinkedListNode");
                        C0717a c0717a = new C0717a((f) obj2, op2, this);
                        if (androidx.concurrent.futures.a.a(f.f62018a, i11, obj2, c0717a)) {
                            Object a11 = c0717a.a(i11);
                            obj = io.ktor.util.internal.e.f62016g;
                            if (a11 != obj) {
                                return a11;
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
        }

        @l
        public Object c(@k f affected, @k Object next) {
            g0.p(affected, "affected");
            g0.p(next, "next");
            return null;
        }

        public abstract void d(@k f fVar, @k f fVar2);

        @l
        public abstract f e();

        @l
        public abstract f f();

        @l
        public abstract Object g(@k f fVar, @k f fVar2);

        public boolean h(@k f affected, @k Object next) {
            g0.p(affected, "affected");
            g0.p(next, "next");
            return false;
        }

        @k
        public f i(@k g op2) {
            g0.p(op2, "op");
            f e11 = e();
            g0.m(e11);
            return e11;
        }

        @k
        public abstract Object j(@k f fVar, @k f fVar2);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b<T extends f> extends a {

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ AtomicReferenceFieldUpdater f62024c = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_affectedNode");

        @k
        private volatile /* synthetic */ Object _affectedNode;

        /* renamed from: a, reason: collision with root package name */
        @w00.g
        @k
        public final f f62025a;

        /* renamed from: b, reason: collision with root package name */
        @w00.g
        @k
        public final T f62026b;

        public b(@k f queue, @k T node) {
            g0.p(queue, "queue");
            g0.p(node, "node");
            this.f62025a = queue;
            this.f62026b = node;
            if (node._next != node || node._prev != node) {
                throw new IllegalStateException("Check failed.");
            }
            this._affectedNode = null;
        }

        @Override // io.ktor.util.internal.f.a
        public void d(@k f affected, @k f next) {
            g0.p(affected, "affected");
            g0.p(next, "next");
            this.f62026b.q(this.f62025a);
        }

        @Override // io.ktor.util.internal.f.a
        @l
        public final f e() {
            return (f) this._affectedNode;
        }

        @Override // io.ktor.util.internal.f.a
        @k
        public final f f() {
            return this.f62025a;
        }

        @Override // io.ktor.util.internal.f.a
        @l
        public Object g(@k f affected, @k f next) {
            g0.p(affected, "affected");
            g0.p(next, "next");
            androidx.concurrent.futures.a.a(f62024c, this, null, affected);
            return null;
        }

        @Override // io.ktor.util.internal.f.a
        public boolean h(@k f affected, @k Object next) {
            g0.p(affected, "affected");
            g0.p(next, "next");
            return next != this.f62025a;
        }

        @Override // io.ktor.util.internal.f.a
        @k
        public final f i(@k g op2) {
            f fVar;
            g0.p(op2, "op");
            while (true) {
                Object obj = this.f62025a._prev;
                g0.n(obj, "null cannot be cast to non-null type io.ktor.util.internal.LockFreeLinkedListNode");
                fVar = (f) obj;
                Object obj2 = fVar._next;
                f fVar2 = this.f62025a;
                if (obj2 != fVar2 && obj2 != op2) {
                    if (obj2 instanceof g) {
                        ((g) obj2).a(fVar);
                    } else {
                        f l11 = fVar2.l(fVar, op2);
                        if (l11 != null) {
                            return l11;
                        }
                    }
                }
            }
            return fVar;
        }

        @Override // io.ktor.util.internal.f.a
        @k
        public Object j(@k f affected, @k f next) {
            g0.p(affected, "affected");
            g0.p(next, "next");
            T t11 = this.f62026b;
            androidx.concurrent.futures.a.a(f.f62019b, t11, t11, affected);
            T t12 = this.f62026b;
            androidx.concurrent.futures.a.a(f.f62018a, t12, t12, this.f62025a);
            return this.f62026b;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @v0
    public static abstract class c extends io.ktor.util.internal.b<f> {

        /* renamed from: b, reason: collision with root package name */
        @w00.g
        @k
        public final f f62027b;

        /* renamed from: c, reason: collision with root package name */
        @l
        @w00.g
        public f f62028c;

        public c(@k f newNode) {
            g0.p(newNode, "newNode");
            this.f62027b = newNode;
        }

        @Override // io.ktor.util.internal.b
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public void b(@k f affected, @l Object obj) {
            g0.p(affected, "affected");
            boolean z11 = obj == null;
            f fVar = z11 ? this.f62027b : this.f62028c;
            if (fVar != null && androidx.concurrent.futures.a.a(f.f62018a, affected, this, fVar) && z11) {
                f fVar2 = this.f62027b;
                f fVar3 = this.f62028c;
                g0.m(fVar3);
                fVar2.q(fVar3);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class e extends a {

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ AtomicReferenceFieldUpdater f62032b = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "_originalNext");
        private volatile /* synthetic */ Object _originalNext = null;

        public e() {
        }

        @Override // io.ktor.util.internal.f.a
        public Object c(f affected, Object next) {
            g0.p(affected, "affected");
            g0.p(next, "next");
            if (next instanceof h) {
                return io.ktor.util.internal.e.c();
            }
            return null;
        }

        @Override // io.ktor.util.internal.f.a
        public void d(f affected, f next) {
            g0.p(affected, "affected");
            g0.p(next, "next");
            f.this.r(next);
        }

        @Override // io.ktor.util.internal.f.a
        public f e() {
            return f.this;
        }

        @Override // io.ktor.util.internal.f.a
        public f f() {
            return (f) this._originalNext;
        }

        @Override // io.ktor.util.internal.f.a
        public Object g(f affected, f next) {
            g0.p(affected, "affected");
            g0.p(next, "next");
            androidx.concurrent.futures.a.a(f62032b, this, null, next);
            return null;
        }

        @Override // io.ktor.util.internal.f.a
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public h j(f affected, f next) {
            g0.p(affected, "affected");
            g0.p(next, "next");
            return next.F();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: io.ktor.util.internal.f$f, reason: collision with other inner class name */
    public static final class C0718f extends c {

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ x00.a<Boolean> f62034d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0718f(f fVar, x00.a<Boolean> aVar) {
            super(fVar);
            this.f62034d = aVar;
        }

        @Override // io.ktor.util.internal.b
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public Object e(f affected) {
            g0.p(affected, "affected");
            if (this.f62034d.invoke().booleanValue()) {
                return null;
            }
            return io.ktor.util.internal.e.e();
        }
    }

    public final f A() {
        Object obj;
        f fVar;
        do {
            obj = this._prev;
            if (obj instanceof h) {
                return ((h) obj).f62035a;
            }
            if (obj == this) {
                fVar = p();
            } else {
                g0.n(obj, "null cannot be cast to non-null type io.ktor.util.internal.LockFreeLinkedListNode");
                fVar = (f) obj;
            }
        } while (!androidx.concurrent.futures.a.a(f62019b, this, obj, fVar.F()));
        return (f) obj;
    }

    public boolean B() {
        Object s11;
        f fVar;
        do {
            s11 = s();
            if ((s11 instanceof h) || s11 == this) {
                return false;
            }
            g0.n(s11, "null cannot be cast to non-null type io.ktor.util.internal.LockFreeLinkedListNode");
            fVar = (f) s11;
        } while (!androidx.concurrent.futures.a.a(f62018a, this, s11, fVar.F()));
        r(fVar);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, io.ktor.util.internal.f] */
    public final /* synthetic */ <T> T C() {
        while (true) {
            Object s11 = s();
            g0.n(s11, "null cannot be cast to non-null type io.ktor.util.internal.LockFreeLinkedListNode");
            ?? r02 = (T) ((f) s11);
            if (r02 == this) {
                return null;
            }
            g0.y(3, ExifInterface.GPS_DIRECTION_TRUE);
            if (r02 == 0) {
                return null;
            }
            if (r02.B()) {
                return r02;
            }
            r02.w();
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [T, io.ktor.util.internal.f, java.lang.Object] */
    public final /* synthetic */ <T> T D(x00.l<? super T, Boolean> predicate) {
        g0.p(predicate, "predicate");
        while (true) {
            Object s11 = s();
            g0.n(s11, "null cannot be cast to non-null type io.ktor.util.internal.LockFreeLinkedListNode");
            f fVar = (f) s11;
            if (fVar == this) {
                return null;
            }
            g0.y(3, ExifInterface.GPS_DIRECTION_TRUE);
            if (fVar == 0) {
                return null;
            }
            if (predicate.invoke(fVar).booleanValue()) {
                return fVar;
            }
            if (fVar.B()) {
                return fVar;
            }
            fVar.w();
        }
    }

    @l
    public final f E() {
        while (true) {
            Object s11 = s();
            g0.n(s11, "null cannot be cast to non-null type io.ktor.util.internal.LockFreeLinkedListNode");
            f fVar = (f) s11;
            if (fVar == this) {
                return null;
            }
            if (fVar.B()) {
                return fVar;
            }
            fVar.w();
        }
    }

    public final h F() {
        h hVar = (h) this._removedRef;
        if (hVar != null) {
            return hVar;
        }
        h hVar2 = new h(this);
        f62020c.lazySet(this, hVar2);
        return hVar2;
    }

    @v0
    public final int G(@k f node, @k f next, @k c condAdd) {
        g0.p(node, "node");
        g0.p(next, "next");
        g0.p(condAdd, "condAdd");
        f62019b.lazySet(node, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f62018a;
        atomicReferenceFieldUpdater.lazySet(node, next);
        condAdd.f62028c = next;
        if (androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, this, next, condAdd)) {
            return condAdd.a(this) == null ? 1 : 2;
        }
        return 0;
    }

    public final void H(@k f prev, @k f next) {
        g0.p(prev, "prev");
        g0.p(next, "next");
        if (prev != this._prev) {
            throw new IllegalStateException("Check failed.");
        }
        if (next != this._next) {
            throw new IllegalStateException("Check failed.");
        }
    }

    public final void f(@k f node) {
        Object u11;
        g0.p(node, "node");
        do {
            u11 = u();
            g0.n(u11, "null cannot be cast to non-null type io.ktor.util.internal.LockFreeLinkedListNode");
        } while (!((f) u11).j(node, this));
    }

    public final boolean g(@k f node, @k x00.a<Boolean> condition) {
        int G;
        g0.p(node, "node");
        g0.p(condition, "condition");
        C0718f c0718f = new C0718f(node, condition);
        do {
            Object u11 = u();
            g0.n(u11, "null cannot be cast to non-null type io.ktor.util.internal.LockFreeLinkedListNode");
            G = ((f) u11).G(node, this, c0718f);
            if (G == 1) {
                return true;
            }
        } while (G != 2);
        return false;
    }

    public final boolean h(@k f node, @k x00.l<? super f, Boolean> predicate) {
        f fVar;
        g0.p(node, "node");
        g0.p(predicate, "predicate");
        do {
            Object u11 = u();
            g0.n(u11, "null cannot be cast to non-null type io.ktor.util.internal.LockFreeLinkedListNode");
            fVar = (f) u11;
            if (!predicate.invoke(fVar).booleanValue()) {
                return false;
            }
        } while (!fVar.j(node, this));
        return true;
    }

    public final boolean i(@k f node, @k x00.l<? super f, Boolean> predicate, @k x00.a<Boolean> condition) {
        int G;
        g0.p(node, "node");
        g0.p(predicate, "predicate");
        g0.p(condition, "condition");
        C0718f c0718f = new C0718f(node, condition);
        do {
            Object u11 = u();
            g0.n(u11, "null cannot be cast to non-null type io.ktor.util.internal.LockFreeLinkedListNode");
            f fVar = (f) u11;
            if (!predicate.invoke(fVar).booleanValue()) {
                return false;
            }
            G = fVar.G(node, this, c0718f);
            if (G == 1) {
                return true;
            }
        } while (G != 2);
        return false;
    }

    @v0
    public final boolean j(@k f node, @k f next) {
        g0.p(node, "node");
        g0.p(next, "next");
        f62019b.lazySet(node, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f62018a;
        atomicReferenceFieldUpdater.lazySet(node, next);
        if (!androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, this, next, node)) {
            return false;
        }
        node.q(next);
        return true;
    }

    public final boolean k(@k f node) {
        g0.p(node, "node");
        f62019b.lazySet(node, this);
        f62018a.lazySet(node, this);
        while (s() == this) {
            if (androidx.concurrent.futures.a.a(f62018a, this, this, node)) {
                node.q(this);
                return true;
            }
        }
        return false;
    }

    public final f l(f fVar, g gVar) {
        Object obj;
        while (true) {
            f fVar2 = null;
            while (true) {
                obj = fVar._next;
                if (obj == gVar) {
                    return fVar;
                }
                if (obj instanceof g) {
                    ((g) obj).a(fVar);
                } else if (!(obj instanceof h)) {
                    Object obj2 = this._prev;
                    if (obj2 instanceof h) {
                        return null;
                    }
                    if (obj != this) {
                        g0.n(obj, "null cannot be cast to non-null type io.ktor.util.internal.LockFreeLinkedListNode");
                        fVar2 = fVar;
                        fVar = (f) obj;
                    } else {
                        if (obj2 == fVar) {
                            return null;
                        }
                        if (androidx.concurrent.futures.a.a(f62019b, this, obj2, fVar) && !(fVar._prev instanceof h)) {
                            return null;
                        }
                    }
                } else {
                    if (fVar2 != null) {
                        break;
                    }
                    fVar = io.ktor.util.internal.e.l(fVar._prev);
                }
            }
            fVar.A();
            androidx.concurrent.futures.a.a(f62018a, fVar2, fVar, ((h) obj).f62035a);
            fVar = fVar2;
        }
    }

    @k
    public final <T extends f> b<T> m(@k T node) {
        g0.p(node, "node");
        return new b<>(this, node);
    }

    @l
    public io.ktor.util.internal.a n() {
        if (y()) {
            return null;
        }
        return new e();
    }

    @k
    public final d<f> o() {
        return new d<>(this);
    }

    public final f p() {
        f fVar = this;
        while (!(fVar instanceof io.ktor.util.internal.d)) {
            fVar = fVar.t();
            if (fVar == this) {
                throw new IllegalStateException("Cannot loop to this while looking for list head");
            }
        }
        return fVar;
    }

    public final void q(f fVar) {
        Object obj;
        do {
            obj = fVar._prev;
            if ((obj instanceof h) || s() != fVar) {
                return;
            }
        } while (!androidx.concurrent.futures.a.a(f62019b, fVar, obj, this));
        if (s() instanceof h) {
            g0.n(obj, "null cannot be cast to non-null type io.ktor.util.internal.LockFreeLinkedListNode");
            fVar.l((f) obj, null);
        }
    }

    public final void r(f fVar) {
        w();
        fVar.l(io.ktor.util.internal.e.l(this._prev), null);
    }

    @k
    public final Object s() {
        while (true) {
            Object obj = this._next;
            if (!(obj instanceof g)) {
                return obj;
            }
            ((g) obj).a(this);
        }
    }

    @k
    public final f t() {
        return io.ktor.util.internal.e.l(s());
    }

    @k
    public String toString() {
        return o0.d(getClass()).C() + '@' + hashCode();
    }

    @k
    public final Object u() {
        while (true) {
            Object obj = this._prev;
            if (obj instanceof h) {
                return obj;
            }
            g0.n(obj, "null cannot be cast to non-null type io.ktor.util.internal.LockFreeLinkedListNode");
            f fVar = (f) obj;
            if (fVar.s() == this) {
                return obj;
            }
            l(fVar, null);
        }
    }

    @k
    public final f v() {
        return io.ktor.util.internal.e.l(u());
    }

    @v0
    public final void w() {
        Object s11;
        f A = A();
        Object obj = this._next;
        g0.n(obj, "null cannot be cast to non-null type io.ktor.util.internal.Removed");
        f fVar = ((h) obj).f62035a;
        while (true) {
            f fVar2 = null;
            while (true) {
                Object s12 = fVar.s();
                if (s12 instanceof h) {
                    fVar.A();
                    fVar = ((h) s12).f62035a;
                } else {
                    s11 = A.s();
                    if (s11 instanceof h) {
                        if (fVar2 != null) {
                            break;
                        } else {
                            A = io.ktor.util.internal.e.l(A._prev);
                        }
                    } else if (s11 != this) {
                        g0.n(s11, "null cannot be cast to non-null type io.ktor.util.internal.LockFreeLinkedListNode");
                        f fVar3 = (f) s11;
                        if (fVar3 == fVar) {
                            return;
                        }
                        fVar2 = A;
                        A = fVar3;
                    } else if (androidx.concurrent.futures.a.a(f62018a, A, this, fVar)) {
                        return;
                    }
                }
            }
            A.A();
            androidx.concurrent.futures.a.a(f62018a, fVar2, A, ((h) s11).f62035a);
            A = fVar2;
        }
    }

    public final void x() {
        Object s11 = s();
        h hVar = s11 instanceof h ? (h) s11 : null;
        if (hVar == null) {
            throw new IllegalStateException("Must be invoked on a removed node");
        }
        r(hVar.f62035a);
    }

    public final boolean y() {
        return s() instanceof h;
    }

    @v0
    @k
    public final c z(@k f node, @k x00.a<Boolean> condition) {
        g0.p(node, "node");
        g0.p(condition, "condition");
        return new C0718f(node, condition);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class d<T> extends a {

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ AtomicReferenceFieldUpdater f62029b = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "_affectedNode");

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ AtomicReferenceFieldUpdater f62030c = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "_originalNext");

        @k
        private volatile /* synthetic */ Object _affectedNode;

        @k
        private volatile /* synthetic */ Object _originalNext;

        /* renamed from: a, reason: collision with root package name */
        @w00.g
        @k
        public final f f62031a;

        public d(@k f queue) {
            g0.p(queue, "queue");
            this.f62031a = queue;
            this._affectedNode = null;
            this._originalNext = null;
        }

        @Override // io.ktor.util.internal.f.a
        @l
        public Object c(@k f affected, @k Object next) {
            g0.p(affected, "affected");
            g0.p(next, "next");
            if (affected == this.f62031a) {
                return io.ktor.util.internal.e.h();
            }
            return null;
        }

        @Override // io.ktor.util.internal.f.a
        public final void d(@k f affected, @k f next) {
            g0.p(affected, "affected");
            g0.p(next, "next");
            affected.r(next);
        }

        @Override // io.ktor.util.internal.f.a
        @l
        public final f e() {
            return (f) this._affectedNode;
        }

        @Override // io.ktor.util.internal.f.a
        @l
        public final f f() {
            return (f) this._originalNext;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.ktor.util.internal.f.a
        @l
        public final Object g(@k f affected, @k f next) {
            Object obj;
            g0.p(affected, "affected");
            g0.p(next, "next");
            if (affected instanceof io.ktor.util.internal.d) {
                throw new IllegalStateException("Check failed.");
            }
            if (!m(affected)) {
                obj = io.ktor.util.internal.e.f62016g;
                return obj;
            }
            androidx.concurrent.futures.a.a(f62029b, this, null, affected);
            androidx.concurrent.futures.a.a(f62030c, this, null, next);
            return null;
        }

        @Override // io.ktor.util.internal.f.a
        public final boolean h(@k f affected, @k Object next) {
            g0.p(affected, "affected");
            g0.p(next, "next");
            if (!(next instanceof h)) {
                return false;
            }
            affected.w();
            return true;
        }

        @Override // io.ktor.util.internal.f.a
        @k
        public final f i(@k g op2) {
            g0.p(op2, "op");
            Object s11 = this.f62031a.s();
            g0.n(s11, "null cannot be cast to non-null type io.ktor.util.internal.LockFreeLinkedListNode");
            return (f) s11;
        }

        @Override // io.ktor.util.internal.f.a
        @k
        public final Object j(@k f affected, @k f next) {
            g0.p(affected, "affected");
            g0.p(next, "next");
            return next.F();
        }

        public final T k() {
            T t11 = (T) e();
            g0.m(t11);
            return t11;
        }

        public boolean m(T t11) {
            return true;
        }

        public static /* synthetic */ void l() {
        }
    }
}

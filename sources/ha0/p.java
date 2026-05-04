package ha0;

import ba0.h4;
import ba0.n1;
import da0.j1;
import da0.k0;
import da0.k1;
import da0.p1;
import da0.r1;
import da0.t1;
import da0.u1;
import da0.v1;
import da0.y0;
import ha0.p;
import ha0.u;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Queue;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import org.junit.jupiter.api.j2;
import org.junit.platform.commons.JUnitException;
import org.junit.platform.engine.SelectorResolutionResult;
import org.junit.platform.engine.TestDescriptor;
import org.junit.platform.engine.UniqueId;
import x80.z1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class p {

    /* renamed from: a, reason: collision with root package name */
    public final ca0.q f59112a;

    /* renamed from: b, reason: collision with root package name */
    public final u.a f59113b;

    /* renamed from: c, reason: collision with root package name */
    public final List<u> f59114c;

    /* renamed from: d, reason: collision with root package name */
    public final List<TestDescriptor.a> f59115d;

    /* renamed from: e, reason: collision with root package name */
    public final TestDescriptor f59116e;

    /* renamed from: f, reason: collision with root package name */
    public final Map<ca0.l, u.c> f59117f = new LinkedHashMap();

    /* renamed from: g, reason: collision with root package name */
    public final Map<UniqueId, u.b> f59118g;

    /* renamed from: h, reason: collision with root package name */
    public final Queue<ca0.l> f59119h;

    /* renamed from: i, reason: collision with root package name */
    public final Map<ca0.l, u.a> f59120i;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements u.a {

        /* renamed from: a, reason: collision with root package name */
        public final TestDescriptor f59121a;

        public a(TestDescriptor parent) {
            this.f59121a = parent;
        }

        public static /* synthetic */ Optional e(ca0.l lVar, Set set) {
            if (set.size() <= 1) {
                return set.size() == 1 ? Optional.of(((u.b) n1.f(set)).d()) : Optional.empty();
            }
            throw new JUnitException("Selector " + lVar + " did not yield unique test descriptor: " + ((String) set.stream().map(new z1()).map(new Function() { // from class: ha0.o
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return Objects.toString((TestDescriptor) obj);
                }
            }).collect(Collectors.joining(j2.O))));
        }

        @Override // ha0.u.a
        public <T extends TestDescriptor> Optional<T> a(Supplier<ca0.l> supplier, final Function<TestDescriptor, Optional<T>> function) {
            TestDescriptor testDescriptor = this.f59121a;
            return testDescriptor != null ? f(testDescriptor, function) : (Optional<T>) b(supplier.get()).flatMap(new Function() { // from class: ha0.l
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    Optional f11;
                    f11 = p.a.this.f((TestDescriptor) obj, function);
                    return f11;
                }
            });
        }

        @Override // ha0.u.a
        public Optional<TestDescriptor> b(final ca0.l selector) {
            return p.this.l(selector).map(new Function() { // from class: ha0.m
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return ((u.c) obj).a();
                }
            }).flatMap(new Function() { // from class: ha0.n
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return p.a.e(ca0.l.this, (Set) obj);
                }
            });
        }

        @Override // ha0.u.a
        public <T extends TestDescriptor> Optional<T> c(Function<TestDescriptor, Optional<T>> creator) {
            TestDescriptor testDescriptor = this.f59121a;
            return testDescriptor != null ? f(testDescriptor, creator) : f(p.this.f59116e, creator);
        }

        public final <T extends TestDescriptor> Optional<T> f(TestDescriptor parent, Function<TestDescriptor, Optional<T>> creator) {
            Optional<T> apply = creator.apply(parent);
            if (apply.isPresent()) {
                UniqueId uniqueId = apply.get().getUniqueId();
                if (p.this.f59118g.containsKey(uniqueId)) {
                    return Optional.of(((u.b) p.this.f59118g.get(uniqueId)).d());
                }
                parent.i(apply.get());
            }
            return apply;
        }
    }

    public p(ca0.q request, TestDescriptor engineDescriptor, List<u> resolvers, List<TestDescriptor.a> visitors) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f59118g = linkedHashMap;
        this.f59119h = new ArrayDeque();
        this.f59120i = new HashMap();
        this.f59112a = request;
        this.f59116e = engineDescriptor;
        this.f59114c = resolvers;
        this.f59115d = visitors;
        this.f59113b = new a(null);
        linkedHashMap.put(engineDescriptor.getUniqueId(), u.b.a(engineDescriptor));
    }

    public static /* synthetic */ u.c c(final p pVar, ca0.l lVar, u.c cVar) {
        pVar.f59120i.remove(lVar);
        pVar.f59117f.put(lVar, cVar);
        cVar.a().forEach(new Consumer() { // from class: ha0.h
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                p.this.f59118g.put(r2.d().getUniqueId(), (u.b) obj);
            }
        });
        return cVar;
    }

    public static /* synthetic */ u.c d(p pVar, ca0.l lVar, u uVar) {
        u.a k11 = pVar.k(lVar);
        return lVar instanceof da0.h ? uVar.d((da0.h) lVar, k11) : lVar instanceof da0.i ? uVar.c((da0.i) lVar, k11) : lVar instanceof da0.e ? uVar.e((da0.e) lVar, k11) : lVar instanceof y0 ? uVar.f((y0) lVar, k11) : lVar instanceof p1 ? uVar.a((p1) lVar, k11) : lVar instanceof da0.j ? uVar.m((da0.j) lVar, k11) : lVar instanceof k0 ? uVar.h((k0) lVar, k11) : lVar instanceof j1 ? uVar.i((j1) lVar, k11) : lVar instanceof r1 ? uVar.k((r1) lVar, k11) : lVar instanceof k1 ? uVar.j((k1) lVar, k11) : lVar instanceof t1 ? uVar.g((t1) lVar, k11) : lVar instanceof v1 ? uVar.b((v1) lVar, k11) : uVar.n(lVar, k11);
    }

    public static /* synthetic */ void f(final p pVar, u.b bVar) {
        pVar.getClass();
        Set<? extends ca0.l> c11 = bVar.c();
        if (c11.isEmpty()) {
            return;
        }
        pVar.f59119h.addAll(c11);
        final a aVar = pVar.new a(bVar.d());
        c11.forEach(new Consumer() { // from class: ha0.k
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ca0.l lVar = (ca0.l) obj;
                p.this.f59120i.put(lVar, aVar);
            }
        });
    }

    public final void j(u.c resolution) {
        this.f59119h.addAll(resolution.b());
        resolution.a().stream().filter(new Predicate() { // from class: ha0.c
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ((u.b) obj).e();
            }
        }).forEach(new Consumer() { // from class: ha0.d
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                p.f(p.this, (u.b) obj);
            }
        });
    }

    public final u.a k(ca0.l selector) {
        return this.f59120i.getOrDefault(selector, this.f59113b);
    }

    public final Optional<u.c> l(final ca0.l selector) {
        return this.f59117f.containsKey(selector) ? Optional.of(this.f59117f.get(selector)) : selector instanceof u1 ? o((u1) selector) : m(selector, new Function() { // from class: ha0.e
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return p.d(p.this, selector, (u) obj);
            }
        });
    }

    public final Optional<u.c> m(final ca0.l selector, Function<u, u.c> resolutionFunction) {
        return this.f59114c.stream().map(resolutionFunction).filter(new Predicate() { // from class: ha0.i
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ((u.c) obj).c();
            }
        }).findFirst().map(new Function() { // from class: ha0.j
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return p.c(p.this, selector, (u.c) obj);
            }
        });
    }

    public final void n(ca0.l selector) {
        ca0.p c11 = this.f59112a.c();
        UniqueId uniqueId = this.f59116e.getUniqueId();
        try {
            Optional<u.c> l11 = l(selector);
            if (!l11.isPresent()) {
                c11.a(uniqueId, selector, SelectorResolutionResult.e());
            } else {
                c11.a(uniqueId, selector, SelectorResolutionResult.d());
                j(l11.get());
            }
        } catch (Throwable th2) {
            h4.a(th2);
            c11.a(uniqueId, selector, SelectorResolutionResult.a(th2));
        }
    }

    public final Optional<u.c> o(final u1 selector) {
        UniqueId b11 = selector.b();
        return this.f59118g.containsKey(b11) ? Optional.of(u.c.d(this.f59118g.get(b11))) : !b11.hasPrefix(this.f59116e.getUniqueId()) ? Optional.empty() : m(selector, new Function() { // from class: ha0.g
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                u.c l11;
                l11 = ((u) obj).l(r1, p.this.k(selector));
                return l11;
            }
        });
    }

    public void p() {
        this.f59119h.addAll(this.f59112a.a(ca0.l.class));
        while (!this.f59119h.isEmpty()) {
            n(this.f59119h.poll());
        }
        List<TestDescriptor.a> list = this.f59115d;
        final TestDescriptor testDescriptor = this.f59116e;
        Objects.requireNonNull(testDescriptor);
        list.forEach(new Consumer() { // from class: ha0.f
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                TestDescriptor.this.e((TestDescriptor.a) obj);
            }
        });
    }
}

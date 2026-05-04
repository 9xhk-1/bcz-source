package x80;

import ba0.h4;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.junit.platform.engine.TestDescriptor;
import x80.a;
import x80.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public abstract class n<PARENT extends TestDescriptor, CHILD extends TestDescriptor, WRAPPER extends x80.a<?>> implements TestDescriptor.a {

    /* renamed from: a, reason: collision with root package name */
    public static final y90.e f97865a = y90.g.c(n.class);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a {

        /* renamed from: a, reason: collision with root package name */
        public final Consumer<List<WRAPPER>> f97866a;

        /* renamed from: b, reason: collision with root package name */
        public final b f97867b;

        /* renamed from: c, reason: collision with root package name */
        public final b f97868c;

        public a(Consumer<List<WRAPPER>> orderingAction, b descriptorsAddedMessageGenerator, b descriptorsRemovedMessageGenerator) {
            this.f97866a = orderingAction;
            this.f97867b = descriptorsAddedMessageGenerator;
            this.f97868c = descriptorsRemovedMessageGenerator;
        }

        public final boolean g() {
            return this.f97866a != null;
        }

        public final void h(final int number) {
            n.f97865a.f(new Supplier() { // from class: x80.l
                @Override // java.util.function.Supplier
                public final Object get() {
                    String a11;
                    a11 = n.a.this.f97867b.a(number);
                    return a11;
                }
            });
        }

        public final void i(final int number) {
            n.f97865a.f(new Supplier() { // from class: x80.m
                @Override // java.util.function.Supplier
                public final Object get() {
                    String a11;
                    a11 = n.a.this.f97868c.a(Math.abs(number));
                    return a11;
                }
            });
        }

        public final void j(List<WRAPPER> wrappers) {
            this.f97866a.accept(wrappers);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @FunctionalInterface
    public interface b {
        String a(int number);
    }

    public static /* synthetic */ boolean b(Class cls, TestDescriptor testDescriptor) {
        return !cls.isInstance(testDescriptor);
    }

    public static /* synthetic */ String c(Function function, TestDescriptor testDescriptor) {
        return (String) function.apply(testDescriptor);
    }

    public static /* synthetic */ void d(n nVar, a aVar, Class cls, Function function, x80.a aVar2) {
        nVar.getClass();
        nVar.h(aVar2.g(), cls, function, nVar.g(aVar, aVar2));
    }

    public void f(Class<PARENT> parentTestDescriptorType, final TestDescriptor testDescriptor, Consumer<PARENT> action, final Function<PARENT, String> errorMessageBuilder) {
        if (parentTestDescriptorType.isInstance(testDescriptor)) {
            try {
                action.accept(testDescriptor);
            } catch (Throwable th2) {
                h4.a(th2);
                f97865a.i(th2, new Supplier() { // from class: x80.k
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        return n.c(errorMessageBuilder, testDescriptor);
                    }
                });
            }
        }
    }

    public void h(final TestDescriptor parentTestDescriptor, final Class<CHILD> matchingChildrenType, final Function<CHILD, WRAPPER> descriptorWrapperFactory, final n<PARENT, CHILD, WRAPPER>.a descriptorWrapperOrderer) {
        Set<? extends TestDescriptor> C = parentTestDescriptor.C();
        Stream<? extends TestDescriptor> stream = C.stream();
        Objects.requireNonNull(matchingChildrenType);
        List list = (List) stream.filter(new Predicate() { // from class: x80.b
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return matchingChildrenType.isInstance((TestDescriptor) obj);
            }
        }).map(new Function() { // from class: x80.d
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return (TestDescriptor) matchingChildrenType.cast((TestDescriptor) obj);
            }
        }).map(descriptorWrapperFactory).collect(Collectors.toCollection(new e()));
        if (list.isEmpty()) {
            return;
        }
        if (descriptorWrapperOrderer.g()) {
            List list2 = (List) C.stream().filter(new Predicate() { // from class: x80.f
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return n.b(matchingChildrenType, (TestDescriptor) obj);
                }
            }).collect(Collectors.toList());
            final LinkedHashSet linkedHashSet = new LinkedHashSet(list);
            descriptorWrapperOrderer.j(list);
            int size = list.size() - linkedHashSet.size();
            if (size > 0) {
                descriptorWrapperOrderer.h(size);
            } else if (size < 0) {
                descriptorWrapperOrderer.i(size);
            }
            Set set = (Set) list.stream().filter(new Predicate() { // from class: x80.g
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return linkedHashSet.contains((a) obj);
                }
            }).map(new Function() { // from class: x80.h
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return ((a) obj).g();
                }
            }).collect(Collectors.toCollection(new w80.b()));
            Stream.concat(set.stream(), list2.stream()).forEach(new Consumer() { // from class: x80.i
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    TestDescriptor.this.q((TestDescriptor) obj);
                }
            });
            if (matchingChildrenType == w80.o0.class) {
                Stream.concat(list2.stream(), set.stream()).forEach(new Consumer() { // from class: x80.j
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        TestDescriptor.this.i((TestDescriptor) obj);
                    }
                });
            } else {
                Stream.concat(set.stream(), list2.stream()).forEach(new Consumer() { // from class: x80.j
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        TestDescriptor.this.i((TestDescriptor) obj);
                    }
                });
            }
        }
        list.forEach(new Consumer() { // from class: x80.c
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                n.d(n.this, descriptorWrapperOrderer, matchingChildrenType, descriptorWrapperFactory, (a) obj);
            }
        });
    }

    public n<PARENT, CHILD, WRAPPER>.a g(n<PARENT, CHILD, WRAPPER>.a inheritedDescriptorWrapperOrderer, x80.a<?> descriptorWrapper) {
        return inheritedDescriptorWrapperOrderer;
    }
}

package org.junit.jupiter.params.provider;

import ba0.c2;
import f90.d1;
import f90.f;
import f90.s0;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Objects;
import java.util.Set;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.apiguardian.api.API;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.platform.commons.PreconditionViolationException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Target({ElementType.ANNOTATION_TYPE, ElementType.METHOD})
@API(since = "5.7", status = API.Status.STABLE)
@f(a.class)
@Documented
@Repeatable(d1.class)
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes9.dex */
public @interface EnumSource {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum Mode {
        INCLUDE(new a() { // from class: f90.x0
            @Override // org.junit.jupiter.params.provider.EnumSource.Mode.a
            public final void a(EnumSource enumSource, Set set, Set set2) {
                EnumSource.Mode.validateNames(enumSource, set, set2);
            }
        }, new BiPredicate() { // from class: f90.y0
            @Override // java.util.function.BiPredicate
            public final boolean test(Object obj, Object obj2) {
                boolean contains;
                contains = ((Set) obj2).contains((String) obj);
                return contains;
            }
        }),
        EXCLUDE(new a() { // from class: f90.x0
            @Override // org.junit.jupiter.params.provider.EnumSource.Mode.a
            public final void a(EnumSource enumSource, Set set, Set set2) {
                EnumSource.Mode.validateNames(enumSource, set, set2);
            }
        }, new BiPredicate() { // from class: f90.z0
            @Override // java.util.function.BiPredicate
            public final boolean test(Object obj, Object obj2) {
                return EnumSource.Mode.b((String) obj, (Set) obj2);
            }
        }),
        MATCH_ALL(new a() { // from class: f90.a1
            @Override // org.junit.jupiter.params.provider.EnumSource.Mode.a
            public final void a(EnumSource enumSource, Set set, Set set2) {
                EnumSource.Mode.validatePatterns(enumSource, set, set2);
            }
        }, new BiPredicate() { // from class: f90.b1
            @Override // java.util.function.BiPredicate
            public final boolean test(Object obj, Object obj2) {
                return EnumSource.Mode.g((String) obj, (Set) obj2);
            }
        }),
        MATCH_ANY(new a() { // from class: f90.a1
            @Override // org.junit.jupiter.params.provider.EnumSource.Mode.a
            public final void a(EnumSource enumSource, Set set, Set set2) {
                EnumSource.Mode.validatePatterns(enumSource, set, set2);
            }
        }, new BiPredicate() { // from class: f90.c1
            @Override // java.util.function.BiPredicate
            public final boolean test(Object obj, Object obj2) {
                return EnumSource.Mode.f((String) obj, (Set) obj2);
            }
        }),
        MATCH_NONE(new a() { // from class: f90.a1
            @Override // org.junit.jupiter.params.provider.EnumSource.Mode.a
            public final void a(EnumSource enumSource, Set set, Set set2) {
                EnumSource.Mode.validatePatterns(enumSource, set, set2);
            }
        }, new BiPredicate() { // from class: f90.t0
            @Override // java.util.function.BiPredicate
            public final boolean test(Object obj, Object obj2) {
                return EnumSource.Mode.d((String) obj, (Set) obj2);
            }
        });

        private final BiPredicate<String, Set<String>> selector;
        private final a validator;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public interface a {
            void a(EnumSource enumSource, Set<? extends Enum<?>> constants, Set<String> names);
        }

        Mode(a validator, BiPredicate selector) {
            this.validator = validator;
            this.selector = selector;
        }

        public static /* synthetic */ boolean b(String str, Set set) {
            return !set.contains(str);
        }

        public static /* synthetic */ boolean d(String str, Set set) {
            Stream stream = set.stream();
            Objects.requireNonNull(str);
            return stream.noneMatch(new s0(str));
        }

        public static /* synthetic */ boolean f(String str, Set set) {
            Stream stream = set.stream();
            Objects.requireNonNull(str);
            return stream.anyMatch(new s0(str));
        }

        public static /* synthetic */ boolean g(String str, Set set) {
            Stream stream = set.stream();
            Objects.requireNonNull(str);
            return stream.allMatch(new s0(str));
        }

        public static /* synthetic */ String i(EnumSource enumSource, Set set) {
            return "Invalid enum constant name(s) in " + enumSource + ". Valid names include: " + set;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void validateNames(final EnumSource enumSource, Set<? extends Enum<?>> constants, Set<String> names) {
            final Set set = (Set) constants.stream().map(new Function() { // from class: f90.u0
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return ((Enum) obj).name();
                }
            }).collect(Collectors.toSet());
            c2.f(set.containsAll(names), new Supplier() { // from class: f90.v0
                @Override // java.util.function.Supplier
                public final Object get() {
                    return EnumSource.Mode.i(EnumSource.this, set);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void validatePatterns(EnumSource enumSource, Set<? extends Enum<?>> constants, Set<String> names) {
            try {
                names.forEach(new Consumer() { // from class: f90.w0
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        Pattern.compile((String) obj);
                    }
                });
            } catch (PatternSyntaxException e11) {
                throw new PreconditionViolationException("Pattern compilation failed for a regular expression supplied in " + enumSource, e11);
            }
        }

        public boolean select(Enum<?> constant, Set<String> names) {
            c2.r(constant, "Enum constant must not be null");
            c2.r(names, "names must not be null");
            return this.selector.test(constant.name(), names);
        }

        public void validate(EnumSource enumSource, Set<? extends Enum<?>> constants, Set<String> names) {
            c2.r(enumSource, "EnumSource must not be null");
            c2.r(names, "names must not be null");
            this.validator.a(enumSource, constants, names);
        }
    }

    Mode mode() default Mode.INCLUDE;

    String[] names() default {};

    Class<? extends Enum<?>> value() default NullEnum.class;
}

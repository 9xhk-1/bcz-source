package org.junit.platform.engine.support.hierarchical;

import aa0.j1;
import ba0.c2;
import ja0.l1;
import ja0.m1;
import java.math.BigDecimal;
import java.util.Locale;
import java.util.concurrent.ForkJoinPool;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import org.apiguardian.api.API;
import org.junit.platform.commons.JUnitException;
import org.junit.platform.commons.util.ReflectionUtils;
import org.junit.platform.engine.support.hierarchical.DefaultParallelExecutionConfigurationStrategy;
import x90.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@API(since = "1.10", status = API.Status.STABLE)
/* loaded from: classes9.dex */
public abstract class DefaultParallelExecutionConfigurationStrategy implements m1 {
    public static final String CONFIG_CUSTOM_CLASS_PROPERTY_NAME = "custom.class";
    public static final String CONFIG_DYNAMIC_FACTOR_PROPERTY_NAME = "dynamic.factor";

    @API(since = "1.10", status = API.Status.EXPERIMENTAL)
    public static final String CONFIG_DYNAMIC_MAX_POOL_SIZE_FACTOR_PROPERTY_NAME = "dynamic.max-pool-size-factor";

    @API(since = "1.10", status = API.Status.EXPERIMENTAL)
    public static final String CONFIG_DYNAMIC_SATURATE_PROPERTY_NAME = "dynamic.saturate";

    @API(since = "1.10", status = API.Status.EXPERIMENTAL)
    public static final String CONFIG_FIXED_MAX_POOL_SIZE_PROPERTY_NAME = "fixed.max-pool-size";
    public static final String CONFIG_FIXED_PARALLELISM_PROPERTY_NAME = "fixed.parallelism";

    @API(since = "1.10", status = API.Status.EXPERIMENTAL)
    public static final String CONFIG_FIXED_SATURATE_PROPERTY_NAME = "fixed.saturate";
    public static final String CONFIG_STRATEGY_PROPERTY_NAME = "strategy";
    private static final int KEEP_ALIVE_SECONDS = 30;
    public static final DefaultParallelExecutionConfigurationStrategy FIXED = new a("FIXED", 0);
    public static final DefaultParallelExecutionConfigurationStrategy DYNAMIC = new b("DYNAMIC", 1);
    public static final DefaultParallelExecutionConfigurationStrategy CUSTOM = new c("CUSTOM", 2);
    private static final /* synthetic */ DefaultParallelExecutionConfigurationStrategy[] $VALUES = $values();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum c extends DefaultParallelExecutionConfigurationStrategy {
        public c(String $enum$name, int $enum$ordinal) {
            super($enum$name, $enum$ordinal, null);
        }

        public static /* synthetic */ JUnitException b(String str, Exception exc) {
            return new JUnitException("Could not create configuration for strategy class: " + str, exc);
        }

        public static /* synthetic */ m1 d(Class cls) {
            c2.e(m1.class.isAssignableFrom(cls), "custom.class does not implement " + m1.class);
            return (m1) ReflectionUtils.x1(cls, new Object[0]);
        }

        public static /* synthetic */ JUnitException e() {
            return new JUnitException("custom.class must be set");
        }

        @Override // ja0.m1
        public l1 a(final ca0.j configurationParameters) {
            final String orElseThrow = configurationParameters.get(DefaultParallelExecutionConfigurationStrategy.CONFIG_CUSTOM_CLASS_PROPERTY_NAME).orElseThrow(new Supplier() { // from class: ja0.l
                @Override // java.util.function.Supplier
                public final Object get() {
                    return DefaultParallelExecutionConfigurationStrategy.c.e();
                }
            });
            return (l1) ReflectionUtils.X1(orElseThrow).e(new b.d() { // from class: ja0.m
                @Override // x90.b.d
                public final Object apply(Object obj) {
                    return DefaultParallelExecutionConfigurationStrategy.c.d((Class) obj);
                }
            }).e(new b.d() { // from class: ja0.n
                @Override // x90.b.d
                public final Object apply(Object obj) {
                    l1 a11;
                    a11 = ((m1) obj).a(ca0.j.this);
                    return a11;
                }
            }).j(new Function() { // from class: ja0.o
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return DefaultParallelExecutionConfigurationStrategy.c.b(orElseThrow, (Exception) obj);
                }
            });
        }
    }

    private static /* synthetic */ DefaultParallelExecutionConfigurationStrategy[] $values() {
        return new DefaultParallelExecutionConfigurationStrategy[]{FIXED, DYNAMIC, CUSTOM};
    }

    private DefaultParallelExecutionConfigurationStrategy(String $enum$name, int $enum$ordinal) {
    }

    public static m1 getStrategy(ca0.j configurationParameters) {
        return valueOf(configurationParameters.get(CONFIG_STRATEGY_PROPERTY_NAME).orElse("dynamic").toUpperCase(Locale.ROOT));
    }

    public static DefaultParallelExecutionConfigurationStrategy valueOf(String name) {
        return (DefaultParallelExecutionConfigurationStrategy) Enum.valueOf(DefaultParallelExecutionConfigurationStrategy.class, name);
    }

    public static DefaultParallelExecutionConfigurationStrategy[] values() {
        return (DefaultParallelExecutionConfigurationStrategy[]) $VALUES.clone();
    }

    public /* synthetic */ DefaultParallelExecutionConfigurationStrategy(String str, int i11, a aVar) {
        this(str, i11);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum a extends DefaultParallelExecutionConfigurationStrategy {
        public a(String $enum$name, int $enum$ordinal) {
            super($enum$name, $enum$ordinal, null);
        }

        public static /* synthetic */ JUnitException b() {
            return new JUnitException(String.format("Configuration parameter '%s' must be set", DefaultParallelExecutionConfigurationStrategy.CONFIG_FIXED_PARALLELISM_PROPERTY_NAME));
        }

        @Override // ja0.m1
        public l1 a(ca0.j configurationParameters) {
            int intValue = ((Integer) configurationParameters.b(DefaultParallelExecutionConfigurationStrategy.CONFIG_FIXED_PARALLELISM_PROPERTY_NAME, new Function() { // from class: ja0.c
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return Integer.valueOf((String) obj);
                }
            }).orElseThrow(new Supplier() { // from class: ja0.d
                @Override // java.util.function.Supplier
                public final Object get() {
                    return DefaultParallelExecutionConfigurationStrategy.a.b();
                }
            })).intValue();
            int intValue2 = ((Integer) configurationParameters.b(DefaultParallelExecutionConfigurationStrategy.CONFIG_FIXED_MAX_POOL_SIZE_PROPERTY_NAME, new Function() { // from class: ja0.c
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return Integer.valueOf((String) obj);
                }
            }).orElse(Integer.valueOf(intValue + 256))).intValue();
            final boolean booleanValue = ((Boolean) configurationParameters.b(DefaultParallelExecutionConfigurationStrategy.CONFIG_FIXED_SATURATE_PROPERTY_NAME, new ja0.e()).orElse(Boolean.TRUE)).booleanValue();
            return new ja0.b(intValue, intValue, intValue2, intValue, 30, new Predicate() { // from class: ja0.f
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return DefaultParallelExecutionConfigurationStrategy.a.c(booleanValue, (ForkJoinPool) obj);
                }
            });
        }

        public static /* synthetic */ boolean c(boolean z11, ForkJoinPool forkJoinPool) {
            return z11;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum b extends DefaultParallelExecutionConfigurationStrategy {
        public b(String $enum$name, int $enum$ordinal) {
            super($enum$name, $enum$ordinal, null);
        }

        public static /* synthetic */ Integer b(final BigDecimal bigDecimal, int i11, BigDecimal bigDecimal2) {
            c2.f(bigDecimal2.compareTo(BigDecimal.ONE) >= 0, new Supplier() { // from class: ja0.k
                @Override // java.util.function.Supplier
                public final Object get() {
                    String format;
                    format = String.format("Factor '%s' specified via configuration parameter '%s' must be greater than or equal to 1", bigDecimal, DefaultParallelExecutionConfigurationStrategy.CONFIG_DYNAMIC_FACTOR_PROPERTY_NAME);
                    return format;
                }
            });
            return Integer.valueOf(bigDecimal2.multiply(BigDecimal.valueOf(i11)).intValue());
        }

        @Override // ja0.m1
        public l1 a(ca0.j configurationParameters) {
            final BigDecimal bigDecimal = (BigDecimal) configurationParameters.b(DefaultParallelExecutionConfigurationStrategy.CONFIG_DYNAMIC_FACTOR_PROPERTY_NAME, new j1()).orElse(BigDecimal.ONE);
            c2.f(bigDecimal.compareTo(BigDecimal.ZERO) > 0, new Supplier() { // from class: ja0.g
                @Override // java.util.function.Supplier
                public final Object get() {
                    String format;
                    format = String.format("Factor '%s' specified via configuration parameter '%s' must be greater than 0", bigDecimal, DefaultParallelExecutionConfigurationStrategy.CONFIG_DYNAMIC_FACTOR_PROPERTY_NAME);
                    return format;
                }
            });
            final int max = Math.max(1, bigDecimal.multiply(BigDecimal.valueOf(Runtime.getRuntime().availableProcessors())).intValue());
            int intValue = ((Integer) configurationParameters.b(DefaultParallelExecutionConfigurationStrategy.CONFIG_DYNAMIC_MAX_POOL_SIZE_FACTOR_PROPERTY_NAME, new j1()).map(new Function() { // from class: ja0.h
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return DefaultParallelExecutionConfigurationStrategy.b.b(bigDecimal, max, (BigDecimal) obj);
                }
            }).orElseGet(new Supplier() { // from class: ja0.i
                @Override // java.util.function.Supplier
                public final Object get() {
                    Integer valueOf;
                    valueOf = Integer.valueOf(max + 256);
                    return valueOf;
                }
            })).intValue();
            final boolean booleanValue = ((Boolean) configurationParameters.b(DefaultParallelExecutionConfigurationStrategy.CONFIG_DYNAMIC_SATURATE_PROPERTY_NAME, new ja0.e()).orElse(Boolean.TRUE)).booleanValue();
            return new ja0.b(max, max, intValue, max, 30, new Predicate() { // from class: ja0.j
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return DefaultParallelExecutionConfigurationStrategy.b.f(booleanValue, (ForkJoinPool) obj);
                }
            });
        }

        public static /* synthetic */ boolean f(boolean z11, ForkJoinPool forkJoinPool) {
            return z11;
        }
    }
}

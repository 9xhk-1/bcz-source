package androidx.compose.runtime.external.kotlinx.collections.immutable;

import a00.l1;
import a00.m0;
import a00.q;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.UtilsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSet;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSetBuilder;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMapBuilder;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet.PersistentOrderedSet;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet.PersistentOrderedSetBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import q30.m;
import u30.r0;
import x00.l;
import yz.g2;
import yz.n;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nextensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 extensions.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/ExtensionsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,741:1\n41#1:743\n41#1:744\n41#1:745\n41#1:746\n41#1:747\n41#1:748\n31#1:749\n31#1:750\n31#1:751\n31#1:752\n31#1:753\n31#1:754\n31#1:755\n53#1:756\n53#1:757\n53#1:758\n53#1:759\n53#1:760\n53#1:761\n53#1:762\n53#1:763\n41#1:764\n31#1:765\n31#1:766\n1#2:742\n*S KotlinDebug\n*F\n+ 1 extensions.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/ExtensionsKt\n*L\n158#1:743\n169#1:744\n180#1:745\n192#1:746\n203#1:747\n214#1:748\n241#1:749\n250#1:750\n259#1:751\n271#1:752\n282#1:753\n293#1:754\n304#1:755\n385#1:756\n394#1:757\n403#1:758\n423#1:759\n432#1:760\n441#1:761\n489#1:762\n505#1:763\n616#1:764\n672#1:765\n701#1:766\n*E\n"})
/* loaded from: classes.dex */
public final class ExtensionsKt {
    @n(message = "Use persistentHashMapOf instead.", replaceWith = @w0(expression = "persistentHashMapOf(*pairs)", imports = {}))
    @k
    public static final <K, V> PersistentMap<K, V> immutableHashMapOf(@k Pair<? extends K, ? extends V>... pairArr) {
        return persistentHashMapOf((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
    }

    @n(message = "Use persistentHashSetOf instead.", replaceWith = @w0(expression = "persistentHashSetOf(*elements)", imports = {}))
    @k
    public static final <E> PersistentSet<E> immutableHashSetOf(@k E... eArr) {
        return persistentHashSetOf(Arrays.copyOf(eArr, eArr.length));
    }

    @n(message = "Use persistentListOf instead.", replaceWith = @w0(expression = "persistentListOf(*elements)", imports = {}))
    @k
    public static final <E> PersistentList<E> immutableListOf(@k E... eArr) {
        return persistentListOf(Arrays.copyOf(eArr, eArr.length));
    }

    @n(message = "Use persistentMapOf instead.", replaceWith = @w0(expression = "persistentMapOf(*pairs)", imports = {}))
    @k
    public static final <K, V> PersistentMap<K, V> immutableMapOf(@k Pair<? extends K, ? extends V>... pairArr) {
        return persistentMapOf((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
    }

    @n(message = "Use persistentSetOf instead.", replaceWith = @w0(expression = "persistentSetOf(*elements)", imports = {}))
    @k
    public static final <E> PersistentSet<E> immutableSetOf(@k E... eArr) {
        return persistentSetOf(Arrays.copyOf(eArr, eArr.length));
    }

    @k
    public static final <E> PersistentSet<E> intersect(@k PersistentSet<? extends E> persistentSet, @k Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return persistentSet.retainAll((Collection<? extends Object>) iterable);
        }
        PersistentSet.Builder<? extends E> builder = persistentSet.builder();
        m0.T0(builder, iterable);
        return builder.build();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @k
    public static final <E> PersistentCollection<E> minus(@k PersistentCollection<? extends E> persistentCollection, E e11) {
        return persistentCollection.remove((PersistentCollection<? extends E>) e11);
    }

    @k
    public static final <T> PersistentSet<T> mutate(@k PersistentSet<? extends T> persistentSet, @k l<? super Set<T>, g2> lVar) {
        PersistentSet.Builder<? extends T> builder = persistentSet.builder();
        lVar.invoke(builder);
        return builder.build();
    }

    @k
    public static final <K, V> PersistentMap<K, V> persistentHashMapOf(@k Pair<? extends K, ? extends V>... pairArr) {
        PersistentHashMap<K, V> emptyOf$runtime_release = PersistentHashMap.Companion.emptyOf$runtime_release();
        g0.n(emptyOf$runtime_release, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate, V of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate>");
        PersistentMap.Builder<K, V> builder2 = emptyOf$runtime_release.builder2();
        l1.y0(builder2, pairArr);
        return builder2.build2();
    }

    @k
    public static final <E> PersistentSet<E> persistentHashSetOf(@k E... eArr) {
        return PersistentHashSet.Companion.emptyOf$runtime_release().addAll((Collection) q.t(eArr));
    }

    @k
    public static final <E> PersistentList<E> persistentListOf(@k E... eArr) {
        return UtilsKt.persistentVectorOf().addAll((Collection) q.t(eArr));
    }

    @k
    public static final <K, V> PersistentMap<K, V> persistentMapOf(@k Pair<? extends K, ? extends V>... pairArr) {
        PersistentOrderedMap<K, V> emptyOf$runtime_release = PersistentOrderedMap.Companion.emptyOf$runtime_release();
        g0.n(emptyOf$runtime_release, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate, V of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate>");
        PersistentMap.Builder<K, V> builder2 = emptyOf$runtime_release.builder2();
        l1.y0(builder2, pairArr);
        return builder2.build2();
    }

    @k
    public static final <E> PersistentSet<E> persistentSetOf(@k E... eArr) {
        return PersistentOrderedSet.Companion.emptyOf$runtime_release().addAll((Collection) q.t(eArr));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @k
    public static final <E> PersistentCollection<E> plus(@k PersistentCollection<? extends E> persistentCollection, E e11) {
        return persistentCollection.add((PersistentCollection<? extends E>) e11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @k
    public static final <K, V> PersistentMap<K, V> putAll(@k PersistentMap<? extends K, ? extends V> persistentMap, @k Map<? extends K, ? extends V> map) {
        g0.n(persistentMap, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.putAll, V of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.putAll>");
        return persistentMap.putAll((Map<? extends Object, ? extends Object>) map);
    }

    @k
    public static final <T> ImmutableList<T> toImmutableList(@k Iterable<? extends T> iterable) {
        ImmutableList<T> immutableList = iterable instanceof ImmutableList ? (ImmutableList) iterable : null;
        return immutableList == null ? toPersistentList(iterable) : immutableList;
    }

    @k
    public static final <K, V> ImmutableMap<K, V> toImmutableMap(@k Map<K, ? extends V> map) {
        ImmutableMap<K, V> immutableMap = map instanceof ImmutableMap ? (ImmutableMap) map : null;
        if (immutableMap != null) {
            return immutableMap;
        }
        PersistentMap.Builder builder = map instanceof PersistentMap.Builder ? (PersistentMap.Builder) map : null;
        PersistentMap<K, V> build2 = builder != null ? builder.build2() : null;
        return build2 != null ? build2 : persistentMapOf().putAll((Map) map);
    }

    @k
    public static final <T> ImmutableSet<T> toImmutableSet(@k Iterable<? extends T> iterable) {
        ImmutableSet<T> immutableSet = iterable instanceof ImmutableSet ? (ImmutableSet) iterable : null;
        if (immutableSet != null) {
            return immutableSet;
        }
        PersistentSet.Builder builder = iterable instanceof PersistentSet.Builder ? (PersistentSet.Builder) iterable : null;
        PersistentSet build = builder != null ? builder.build() : null;
        return build != null ? build : plus(persistentSetOf(), (Iterable) iterable);
    }

    @k
    public static final <K, V> PersistentMap<K, V> toPersistentHashMap(@k Map<K, ? extends V> map) {
        PersistentHashMap persistentHashMap = map instanceof PersistentHashMap ? (PersistentHashMap) map : null;
        if (persistentHashMap != null) {
            return persistentHashMap;
        }
        PersistentHashMapBuilder persistentHashMapBuilder = map instanceof PersistentHashMapBuilder ? (PersistentHashMapBuilder) map : null;
        PersistentHashMap<K, V> build2 = persistentHashMapBuilder != null ? persistentHashMapBuilder.build2() : null;
        return build2 != null ? build2 : PersistentHashMap.Companion.emptyOf$runtime_release().putAll((Map) map);
    }

    @k
    public static final <T> PersistentSet<T> toPersistentHashSet(@k Iterable<? extends T> iterable) {
        PersistentHashSet persistentHashSet = iterable instanceof PersistentHashSet ? (PersistentHashSet) iterable : null;
        if (persistentHashSet != null) {
            return persistentHashSet;
        }
        PersistentHashSetBuilder persistentHashSetBuilder = iterable instanceof PersistentHashSetBuilder ? (PersistentHashSetBuilder) iterable : null;
        PersistentHashSet build = persistentHashSetBuilder != null ? persistentHashSetBuilder.build() : null;
        return build != null ? build : plus(PersistentHashSet.Companion.emptyOf$runtime_release(), (Iterable) iterable);
    }

    @k
    public static final <T> PersistentList<T> toPersistentList(@k Iterable<? extends T> iterable) {
        PersistentList<T> persistentList = iterable instanceof PersistentList ? (PersistentList) iterable : null;
        if (persistentList != null) {
            return persistentList;
        }
        PersistentList.Builder builder = iterable instanceof PersistentList.Builder ? (PersistentList.Builder) iterable : null;
        PersistentList<T> build = builder != null ? builder.build() : null;
        return build == null ? plus(persistentListOf(), (Iterable) iterable) : build;
    }

    @k
    public static final <K, V> PersistentMap<K, V> toPersistentMap(@k Map<K, ? extends V> map) {
        PersistentOrderedMap persistentOrderedMap = map instanceof PersistentOrderedMap ? (PersistentOrderedMap) map : null;
        if (persistentOrderedMap != null) {
            return persistentOrderedMap;
        }
        PersistentOrderedMapBuilder persistentOrderedMapBuilder = map instanceof PersistentOrderedMapBuilder ? (PersistentOrderedMapBuilder) map : null;
        PersistentMap<K, V> build2 = persistentOrderedMapBuilder != null ? persistentOrderedMapBuilder.build2() : null;
        return build2 == null ? PersistentOrderedMap.Companion.emptyOf$runtime_release().putAll((Map) map) : build2;
    }

    @k
    public static final <T> PersistentSet<T> toPersistentSet(@k Iterable<? extends T> iterable) {
        PersistentOrderedSet persistentOrderedSet = iterable instanceof PersistentOrderedSet ? (PersistentOrderedSet) iterable : null;
        if (persistentOrderedSet != null) {
            return persistentOrderedSet;
        }
        PersistentOrderedSetBuilder persistentOrderedSetBuilder = iterable instanceof PersistentOrderedSetBuilder ? (PersistentOrderedSetBuilder) iterable : null;
        PersistentSet<T> build = persistentOrderedSetBuilder != null ? persistentOrderedSetBuilder.build() : null;
        return build == null ? plus(PersistentOrderedSet.Companion.emptyOf$runtime_release(), (Iterable) iterable) : build;
    }

    @n(message = "Use persistentListOf instead.", replaceWith = @w0(expression = "persistentListOf()", imports = {}))
    @k
    public static final <E> PersistentList<E> immutableListOf() {
        return persistentListOf();
    }

    @n(message = "Use persistentSetOf instead.", replaceWith = @w0(expression = "persistentSetOf()", imports = {}))
    @k
    public static final <E> PersistentSet<E> immutableSetOf() {
        return persistentSetOf();
    }

    @k
    public static final <E> PersistentCollection<E> minus(@k PersistentCollection<? extends E> persistentCollection, @k Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return persistentCollection.removeAll((Collection<? extends Object>) iterable);
        }
        PersistentCollection.Builder<? extends E> builder = persistentCollection.builder();
        m0.J0(builder, iterable);
        return builder.build();
    }

    @k
    public static final <T> PersistentList<T> mutate(@k PersistentList<? extends T> persistentList, @k l<? super List<T>, g2> lVar) {
        PersistentList.Builder<? extends T> builder = persistentList.builder();
        lVar.invoke(builder);
        return builder.build();
    }

    @k
    public static final <E> PersistentSet<E> persistentHashSetOf() {
        return PersistentHashSet.Companion.emptyOf$runtime_release();
    }

    @k
    public static final <E> PersistentList<E> persistentListOf() {
        return UtilsKt.persistentVectorOf();
    }

    @k
    public static final <E> PersistentSet<E> persistentSetOf() {
        return PersistentOrderedSet.Companion.emptyOf$runtime_release();
    }

    @k
    public static final <E> PersistentCollection<E> plus(@k PersistentCollection<? extends E> persistentCollection, @k Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return persistentCollection.addAll((Collection<? extends Object>) iterable);
        }
        PersistentCollection.Builder<? extends E> builder = persistentCollection.builder();
        m0.s0(builder, iterable);
        return builder.build();
    }

    @k
    public static final <K, V> PersistentMap<K, V> putAll(@k PersistentMap<? extends K, ? extends V> persistentMap, @k Iterable<? extends Pair<? extends K, ? extends V>> iterable) {
        g0.n(persistentMap, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate, V of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate>");
        PersistentMap.Builder<? extends K, ? extends V> builder2 = persistentMap.builder2();
        l1.w0(builder2, iterable);
        return builder2.build2();
    }

    @k
    public static final <E> PersistentCollection<E> minus(@k PersistentCollection<? extends E> persistentCollection, @k E[] eArr) {
        PersistentCollection.Builder<? extends E> builder = persistentCollection.builder();
        m0.M0(builder, eArr);
        return builder.build();
    }

    @k
    public static final <K, V> PersistentMap<K, V> mutate(@k PersistentMap<? extends K, ? extends V> persistentMap, @k l<? super Map<K, V>, g2> lVar) {
        g0.n(persistentMap, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate, V of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate>");
        PersistentMap.Builder<? extends K, ? extends V> builder2 = persistentMap.builder2();
        lVar.invoke(builder2);
        return builder2.build2();
    }

    @k
    public static final <E> PersistentCollection<E> plus(@k PersistentCollection<? extends E> persistentCollection, @k E[] eArr) {
        PersistentCollection.Builder<? extends E> builder = persistentCollection.builder();
        m0.u0(builder, eArr);
        return builder.build();
    }

    @k
    public static final <T> ImmutableList<T> toImmutableList(@k m<? extends T> mVar) {
        return toPersistentList(mVar);
    }

    @k
    public static final <E> PersistentCollection<E> minus(@k PersistentCollection<? extends E> persistentCollection, @k m<? extends E> mVar) {
        PersistentCollection.Builder<? extends E> builder = persistentCollection.builder();
        m0.L0(builder, mVar);
        return builder.build();
    }

    @k
    public static final <E> PersistentCollection<E> plus(@k PersistentCollection<? extends E> persistentCollection, @k m<? extends E> mVar) {
        PersistentCollection.Builder<? extends E> builder = persistentCollection.builder();
        m0.t0(builder, mVar);
        return builder.build();
    }

    @k
    public static final ImmutableList<Character> toImmutableList(@k CharSequence charSequence) {
        return toPersistentList(charSequence);
    }

    @k
    public static final <T> ImmutableSet<T> toImmutableSet(@k m<? extends T> mVar) {
        return toPersistentSet(mVar);
    }

    @k
    public static final <T> PersistentSet<T> toPersistentHashSet(@k m<? extends T> mVar) {
        return plus(persistentHashSetOf(), (m) mVar);
    }

    @k
    public static final <T> PersistentList<T> toPersistentList(@k m<? extends T> mVar) {
        return plus(persistentListOf(), (m) mVar);
    }

    @k
    public static final <T> PersistentSet<T> toPersistentSet(@k m<? extends T> mVar) {
        return plus(persistentSetOf(), (m) mVar);
    }

    @k
    public static final <E> PersistentSet<E> intersect(@k PersistentCollection<? extends E> persistentCollection, @k Iterable<? extends E> iterable) {
        return intersect(toPersistentSet(persistentCollection), (Iterable) iterable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @k
    public static final <E> PersistentList<E> minus(@k PersistentList<? extends E> persistentList, E e11) {
        return persistentList.remove((PersistentList<? extends E>) e11);
    }

    @k
    public static final <K, V> PersistentMap<K, V> persistentHashMapOf() {
        return PersistentHashMap.Companion.emptyOf$runtime_release();
    }

    @k
    public static final <K, V> PersistentMap<K, V> persistentMapOf() {
        return PersistentOrderedMap.Companion.emptyOf$runtime_release();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @k
    public static final <E> PersistentList<E> plus(@k PersistentList<? extends E> persistentList, E e11) {
        return persistentList.add((PersistentList<? extends E>) e11);
    }

    @k
    public static final <K, V> PersistentMap<K, V> putAll(@k PersistentMap<? extends K, ? extends V> persistentMap, @k Pair<? extends K, ? extends V>[] pairArr) {
        g0.n(persistentMap, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate, V of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate>");
        PersistentMap.Builder<? extends K, ? extends V> builder2 = persistentMap.builder2();
        l1.y0(builder2, pairArr);
        return builder2.build2();
    }

    @k
    public static final PersistentSet<Character> toImmutableSet(@k CharSequence charSequence) {
        return toPersistentSet(charSequence);
    }

    @k
    public static final PersistentSet<Character> toPersistentHashSet(@k CharSequence charSequence) {
        PersistentSet.Builder builder = persistentHashSetOf().builder();
        r0.H9(charSequence, builder);
        return builder.build();
    }

    @k
    public static final PersistentList<Character> toPersistentList(@k CharSequence charSequence) {
        PersistentList.Builder builder = persistentListOf().builder();
        r0.H9(charSequence, builder);
        return builder.build();
    }

    @k
    public static final PersistentSet<Character> toPersistentSet(@k CharSequence charSequence) {
        PersistentSet.Builder builder = persistentSetOf().builder();
        r0.H9(charSequence, builder);
        return builder.build();
    }

    @k
    public static final <E> PersistentList<E> minus(@k PersistentList<? extends E> persistentList, @k Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return persistentList.removeAll((Collection<? extends Object>) iterable);
        }
        PersistentList.Builder<? extends E> builder = persistentList.builder();
        m0.J0(builder, iterable);
        return builder.build();
    }

    @k
    public static final <E> PersistentList<E> plus(@k PersistentList<? extends E> persistentList, @k Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return persistentList.addAll((Collection<? extends Object>) iterable);
        }
        PersistentList.Builder<? extends E> builder = persistentList.builder();
        m0.s0(builder, iterable);
        return builder.build();
    }

    @k
    public static final <K, V> PersistentMap<K, V> putAll(@k PersistentMap<? extends K, ? extends V> persistentMap, @k m<? extends Pair<? extends K, ? extends V>> mVar) {
        g0.n(persistentMap, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate, V of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate>");
        PersistentMap.Builder<? extends K, ? extends V> builder2 = persistentMap.builder2();
        l1.x0(builder2, mVar);
        return builder2.build2();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @k
    public static final <E> PersistentSet<E> minus(@k PersistentSet<? extends E> persistentSet, E e11) {
        return persistentSet.remove((PersistentSet<? extends E>) e11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @k
    public static final <E> PersistentSet<E> plus(@k PersistentSet<? extends E> persistentSet, E e11) {
        return persistentSet.add((PersistentSet<? extends E>) e11);
    }

    @k
    public static final <E> PersistentSet<E> minus(@k PersistentSet<? extends E> persistentSet, @k Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return persistentSet.removeAll((Collection<? extends Object>) iterable);
        }
        PersistentSet.Builder<? extends E> builder = persistentSet.builder();
        m0.J0(builder, iterable);
        return builder.build();
    }

    @k
    public static final <E> PersistentSet<E> plus(@k PersistentSet<? extends E> persistentSet, @k Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return persistentSet.addAll((Collection<? extends Object>) iterable);
        }
        PersistentSet.Builder<? extends E> builder = persistentSet.builder();
        m0.s0(builder, iterable);
        return builder.build();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @k
    public static final <K, V> PersistentMap<K, V> minus(@k PersistentMap<? extends K, ? extends V> persistentMap, K k11) {
        g0.n(persistentMap, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.minus, V of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.minus>");
        return persistentMap.remove((PersistentMap<? extends K, ? extends V>) k11);
    }

    @k
    public static final <K, V> PersistentMap<K, V> plus(@k PersistentMap<? extends K, ? extends V> persistentMap, @k Pair<? extends K, ? extends V> pair) {
        g0.n(persistentMap, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.plus, V of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.plus>");
        return persistentMap.put((PersistentMap<? extends K, ? extends V>) pair.getFirst(), (K) pair.getSecond());
    }

    @k
    public static final <E> PersistentList<E> minus(@k PersistentList<? extends E> persistentList, @k E[] eArr) {
        PersistentList.Builder<? extends E> builder = persistentList.builder();
        m0.M0(builder, eArr);
        return builder.build();
    }

    @k
    public static final <K, V> PersistentMap<K, V> plus(@k PersistentMap<? extends K, ? extends V> persistentMap, @k Iterable<? extends Pair<? extends K, ? extends V>> iterable) {
        return putAll(persistentMap, iterable);
    }

    @k
    public static final <K, V> PersistentMap<K, V> plus(@k PersistentMap<? extends K, ? extends V> persistentMap, @k Pair<? extends K, ? extends V>[] pairArr) {
        return putAll(persistentMap, pairArr);
    }

    @k
    public static final <K, V> PersistentMap<K, V> plus(@k PersistentMap<? extends K, ? extends V> persistentMap, @k m<? extends Pair<? extends K, ? extends V>> mVar) {
        return putAll(persistentMap, mVar);
    }

    @k
    public static final <E> PersistentList<E> minus(@k PersistentList<? extends E> persistentList, @k m<? extends E> mVar) {
        PersistentList.Builder<? extends E> builder = persistentList.builder();
        m0.L0(builder, mVar);
        return builder.build();
    }

    @k
    public static final <K, V> PersistentMap<K, V> plus(@k PersistentMap<? extends K, ? extends V> persistentMap, @k Map<? extends K, ? extends V> map) {
        return putAll(persistentMap, map);
    }

    @k
    public static final <E> PersistentList<E> plus(@k PersistentList<? extends E> persistentList, @k E[] eArr) {
        PersistentList.Builder<? extends E> builder = persistentList.builder();
        m0.u0(builder, eArr);
        return builder.build();
    }

    @k
    public static final <E> PersistentSet<E> minus(@k PersistentSet<? extends E> persistentSet, @k E[] eArr) {
        PersistentSet.Builder<? extends E> builder = persistentSet.builder();
        m0.M0(builder, eArr);
        return builder.build();
    }

    @k
    public static final <E> PersistentList<E> plus(@k PersistentList<? extends E> persistentList, @k m<? extends E> mVar) {
        PersistentList.Builder<? extends E> builder = persistentList.builder();
        m0.t0(builder, mVar);
        return builder.build();
    }

    @k
    public static final <E> PersistentSet<E> minus(@k PersistentSet<? extends E> persistentSet, @k m<? extends E> mVar) {
        PersistentSet.Builder<? extends E> builder = persistentSet.builder();
        m0.L0(builder, mVar);
        return builder.build();
    }

    @k
    public static final <E> PersistentSet<E> plus(@k PersistentSet<? extends E> persistentSet, @k E[] eArr) {
        PersistentSet.Builder<? extends E> builder = persistentSet.builder();
        m0.u0(builder, eArr);
        return builder.build();
    }

    @k
    public static final <K, V> PersistentMap<K, V> minus(@k PersistentMap<? extends K, ? extends V> persistentMap, @k Iterable<? extends K> iterable) {
        g0.n(persistentMap, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate, V of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate>");
        PersistentMap.Builder<? extends K, ? extends V> builder2 = persistentMap.builder2();
        m0.J0(builder2.keySet(), iterable);
        return builder2.build2();
    }

    @k
    public static final <E> PersistentSet<E> plus(@k PersistentSet<? extends E> persistentSet, @k m<? extends E> mVar) {
        PersistentSet.Builder<? extends E> builder = persistentSet.builder();
        m0.t0(builder, mVar);
        return builder.build();
    }

    @k
    public static final <K, V> PersistentMap<K, V> minus(@k PersistentMap<? extends K, ? extends V> persistentMap, @k K[] kArr) {
        g0.n(persistentMap, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate, V of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate>");
        PersistentMap.Builder<? extends K, ? extends V> builder2 = persistentMap.builder2();
        m0.M0(builder2.keySet(), kArr);
        return builder2.build2();
    }

    @k
    public static final <K, V> PersistentMap<K, V> minus(@k PersistentMap<? extends K, ? extends V> persistentMap, @k m<? extends K> mVar) {
        g0.n(persistentMap, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate, V of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate>");
        PersistentMap.Builder<? extends K, ? extends V> builder2 = persistentMap.builder2();
        m0.L0(builder2.keySet(), mVar);
        return builder2.build2();
    }
}

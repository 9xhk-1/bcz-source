package androidx.room;

import a00.d1;
import a00.h0;
import a00.i0;
import a00.m0;
import a00.r0;
import a00.v1;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
@u0({"SMAP\nAmbiguousColumnResolver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AmbiguousColumnResolver.kt\nandroidx/room/AmbiguousColumnResolver\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,273:1\n37#2:274\n36#2,3:275\n37#2:300\n36#2,3:301\n1#3:278\n13402#4,2:279\n13467#4,3:281\n13467#4,2:284\n11158#4:286\n11493#4,2:287\n11495#4:291\n13469#4:292\n11158#4:306\n11493#4,2:307\n11495#4:311\n1863#5,2:289\n1734#5,3:293\n1557#5:296\n1628#5,3:297\n1863#5,2:304\n295#5,2:309\n*S KotlinDebug\n*F\n+ 1 AmbiguousColumnResolver.kt\nandroidx/room/AmbiguousColumnResolver\n*L\n65#1:274\n65#1:275,3\n171#1:300\n171#1:301,3\n102#1:279,2\n104#1:281,3\n113#1:284,2\n138#1:286\n138#1:287,2\n138#1:291\n113#1:292\n120#1:306\n120#1:307,2\n120#1:311\n140#1:289,2\n161#1:293,3\n171#1:296\n171#1:297,3\n208#1:304,2\n122#1:309,2\n*E\n"})
/* loaded from: classes3.dex */
public final class AmbiguousColumnResolver {

    @m80.k
    public static final AmbiguousColumnResolver INSTANCE = new AmbiguousColumnResolver();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Match {

        @m80.k
        private final List<Integer> resultIndices;

        @m80.k
        private final g10.l resultRange;

        public Match(@m80.k g10.l resultRange, @m80.k List<Integer> resultIndices) {
            g0.p(resultRange, "resultRange");
            g0.p(resultIndices, "resultIndices");
            this.resultRange = resultRange;
            this.resultIndices = resultIndices;
        }

        @m80.k
        public final List<Integer> getResultIndices() {
            return this.resultIndices;
        }

        @m80.k
        public final g10.l getResultRange() {
            return this.resultRange;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class ResultColumn {
        private final int index;

        @m80.k
        private final String name;

        public ResultColumn(@m80.k String name, int i11) {
            g0.p(name, "name");
            this.name = name;
            this.index = i11;
        }

        public static /* synthetic */ ResultColumn copy$default(ResultColumn resultColumn, String str, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = resultColumn.name;
            }
            if ((i12 & 2) != 0) {
                i11 = resultColumn.index;
            }
            return resultColumn.copy(str, i11);
        }

        @m80.k
        public final String component1() {
            return this.name;
        }

        public final int component2() {
            return this.index;
        }

        @m80.k
        public final ResultColumn copy(@m80.k String name, int i11) {
            g0.p(name, "name");
            return new ResultColumn(name, i11);
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ResultColumn)) {
                return false;
            }
            ResultColumn resultColumn = (ResultColumn) obj;
            return g0.g(this.name, resultColumn.name) && this.index == resultColumn.index;
        }

        public final int getIndex() {
            return this.index;
        }

        @m80.k
        public final String getName() {
            return this.name;
        }

        public int hashCode() {
            return (this.name.hashCode() * 31) + Integer.hashCode(this.index);
        }

        @m80.k
        public String toString() {
            return "ResultColumn(name=" + this.name + ", index=" + this.index + ')';
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Solution implements Comparable<Solution> {

        @m80.k
        public static final Companion Companion = new Companion(null);

        @m80.k
        private static final Solution NO_SOLUTION = new Solution(h0.J(), Integer.MAX_VALUE, Integer.MAX_VALUE);
        private final int coverageOffset;

        @m80.k
        private final List<Match> matches;
        private final int overlaps;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @u0({"SMAP\nAmbiguousColumnResolver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AmbiguousColumnResolver.kt\nandroidx/room/AmbiguousColumnResolver$Solution$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,273:1\n1#2:274\n1782#3,3:275\n1863#3,2:278\n1785#3:280\n*S KotlinDebug\n*F\n+ 1 AmbiguousColumnResolver.kt\nandroidx/room/AmbiguousColumnResolver$Solution$Companion\n*L\n252#1:275,3\n254#1:278,2\n252#1:280\n*E\n"})
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.v vVar) {
                this();
            }

            @m80.k
            public final Solution build(@m80.k List<Match> matches) {
                g0.p(matches, "matches");
                List<Match> list = matches;
                int i11 = 0;
                int i12 = 0;
                for (Match match : list) {
                    i12 += ((match.getResultRange().f() - match.getResultRange().d()) + 1) - match.getResultIndices().size();
                }
                Iterator<T> it = list.iterator();
                if (!it.hasNext()) {
                    throw new NoSuchElementException();
                }
                int d11 = ((Match) it.next()).getResultRange().d();
                while (it.hasNext()) {
                    int d12 = ((Match) it.next()).getResultRange().d();
                    if (d11 > d12) {
                        d11 = d12;
                    }
                }
                Iterator<T> it2 = list.iterator();
                if (!it2.hasNext()) {
                    throw new NoSuchElementException();
                }
                int f11 = ((Match) it2.next()).getResultRange().f();
                while (it2.hasNext()) {
                    int f12 = ((Match) it2.next()).getResultRange().f();
                    if (f11 < f12) {
                        f11 = f12;
                    }
                }
                Iterable lVar = new g10.l(d11, f11);
                if (!(lVar instanceof Collection) || !((Collection) lVar).isEmpty()) {
                    Iterator it3 = lVar.iterator();
                    int i13 = 0;
                    while (it3.hasNext()) {
                        int nextInt = ((d1) it3).nextInt();
                        Iterator<T> it4 = list.iterator();
                        int i14 = 0;
                        while (true) {
                            if (!it4.hasNext()) {
                                break;
                            }
                            if (((Match) it4.next()).getResultRange().k(nextInt)) {
                                i14++;
                            }
                            if (i14 > 1) {
                                i13++;
                                if (i13 < 0) {
                                    h0.a0();
                                }
                            }
                        }
                    }
                    i11 = i13;
                }
                return new Solution(matches, i12, i11);
            }

            @m80.k
            public final Solution getNO_SOLUTION() {
                return Solution.NO_SOLUTION;
            }

            private Companion() {
            }
        }

        public Solution(@m80.k List<Match> matches, int i11, int i12) {
            g0.p(matches, "matches");
            this.matches = matches;
            this.coverageOffset = i11;
            this.overlaps = i12;
        }

        public final int getCoverageOffset() {
            return this.coverageOffset;
        }

        @m80.k
        public final List<Match> getMatches() {
            return this.matches;
        }

        public final int getOverlaps() {
            return this.overlaps;
        }

        @Override // java.lang.Comparable
        public int compareTo(@m80.k Solution other) {
            g0.p(other, "other");
            int t11 = g0.t(this.overlaps, other.overlaps);
            return t11 != 0 ? t11 : g0.t(this.coverageOffset, other.coverageOffset);
        }
    }

    private AmbiguousColumnResolver() {
    }

    private final <T> void dfs(List<? extends List<? extends T>> list, List<T> list2, int i11, x00.l<? super List<? extends T>, g2> lVar) {
        if (i11 == list.size()) {
            lVar.invoke(r0.a6(list2));
            return;
        }
        Iterator<T> it = list.get(i11).iterator();
        while (it.hasNext()) {
            list2.add(it.next());
            INSTANCE.dfs(list, list2, i11 + 1, lVar);
            list2.remove(h0.L(list2));
        }
    }

    public static /* synthetic */ void dfs$default(AmbiguousColumnResolver ambiguousColumnResolver, List list, List list2, int i11, x00.l lVar, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            list2 = new ArrayList();
        }
        if ((i12 & 4) != 0) {
            i11 = 0;
        }
        ambiguousColumnResolver.dfs(list, list2, i11, lVar);
    }

    private final void rabinKarpSearch(List<ResultColumn> list, String[] strArr, x00.q<? super Integer, ? super Integer, ? super List<ResultColumn>, g2> qVar) {
        int i11 = 0;
        int i12 = 0;
        for (String str : strArr) {
            i12 += str.hashCode();
        }
        int length = strArr.length;
        Iterator<T> it = list.subList(0, length).iterator();
        int i13 = 0;
        while (it.hasNext()) {
            i13 += ((ResultColumn) it.next()).getName().hashCode();
        }
        while (true) {
            if (i12 == i13) {
                qVar.invoke(Integer.valueOf(i11), Integer.valueOf(length), list.subList(i11, length));
            }
            int i14 = i11 + 1;
            int i15 = length + 1;
            if (i15 > list.size()) {
                return;
            }
            i13 = (i13 - list.get(i11).getName().hashCode()) + list.get(length).getName().hashCode();
            i11 = i14;
            length = i15;
        }
    }

    @w00.o
    @m80.k
    public static final int[][] resolve(@m80.k List<String> resultColumns, @m80.k String[][] mappings) {
        g0.p(resultColumns, "resultColumns");
        g0.p(mappings, "mappings");
        return resolve((String[]) resultColumns.toArray(new String[0]), mappings);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2 resolve$lambda$16$lambda$15(List list, int i11, List indices) {
        g0.p(indices, "indices");
        List list2 = indices;
        Iterator it = list2.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        int intValue = ((Number) it.next()).intValue();
        while (it.hasNext()) {
            int intValue2 = ((Number) it.next()).intValue();
            if (intValue > intValue2) {
                intValue = intValue2;
            }
        }
        Iterator it2 = list2.iterator();
        if (!it2.hasNext()) {
            throw new NoSuchElementException();
        }
        int intValue3 = ((Number) it2.next()).intValue();
        while (it2.hasNext()) {
            int intValue4 = ((Number) it2.next()).intValue();
            if (intValue3 < intValue4) {
                intValue3 = intValue4;
            }
        }
        ((List) list.get(i11)).add(new Match(new g10.l(intValue, intValue3), indices));
        return g2.f100423a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2 resolve$lambda$16$lambda$7(String[] strArr, List list, int i11, int i12, int i13, List resultColumnsSublist) {
        Object obj;
        g0.p(resultColumnsSublist, "resultColumnsSublist");
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            Iterator it = resultColumnsSublist.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (g0.g(str, ((ResultColumn) obj).component1())) {
                    break;
                }
            }
            ResultColumn resultColumn = (ResultColumn) obj;
            if (resultColumn == null) {
                return g2.f100423a;
            }
            arrayList.add(Integer.valueOf(resultColumn.getIndex()));
        }
        ((List) list.get(i11)).add(new Match(new g10.l(i12, i13 - 1), arrayList));
        return g2.f100423a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, androidx.room.AmbiguousColumnResolver$Solution] */
    public static final g2 resolve$lambda$19(Ref.ObjectRef objectRef, List it) {
        g0.p(it, "it");
        ?? build = Solution.Companion.build(it);
        if (build.compareTo((Solution) objectRef.element) < 0) {
            objectRef.element = build;
        }
        return g2.f100423a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [T, androidx.room.AmbiguousColumnResolver$Solution] */
    @w00.o
    @m80.k
    public static final int[][] resolve(@m80.k String[] resultColumns, @m80.k String[][] mappings) {
        g0.p(resultColumns, "resultColumns");
        g0.p(mappings, "mappings");
        int length = resultColumns.length;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12++) {
            String str = resultColumns[i12];
            if (str.charAt(0) == '`' && str.charAt(str.length() - 1) == '`') {
                str = str.substring(1, str.length() - 1);
                g0.o(str, "substring(...)");
            }
            String lowerCase = str.toLowerCase(Locale.ROOT);
            g0.o(lowerCase, "toLowerCase(...)");
            resultColumns[i12] = lowerCase;
        }
        int length2 = mappings.length;
        for (int i13 = 0; i13 < length2; i13++) {
            int length3 = mappings[i13].length;
            for (int i14 = 0; i14 < length3; i14++) {
                String[] strArr = mappings[i13];
                String lowerCase2 = strArr[i14].toLowerCase(Locale.ROOT);
                g0.o(lowerCase2, "toLowerCase(...)");
                strArr[i14] = lowerCase2;
            }
        }
        Set d11 = v1.d();
        for (String[] strArr2 : mappings) {
            m0.u0(d11, strArr2);
        }
        Set a11 = v1.a(d11);
        List j11 = a00.g0.j();
        int length4 = resultColumns.length;
        int i15 = 0;
        int i16 = 0;
        while (i15 < length4) {
            String str2 = resultColumns[i15];
            int i17 = i16 + 1;
            if (a11.contains(str2)) {
                j11.add(new ResultColumn(str2, i16));
            }
            i15++;
            i16 = i17;
        }
        List<ResultColumn> b11 = a00.g0.b(j11);
        int length5 = mappings.length;
        final ArrayList arrayList = new ArrayList(length5);
        for (int i18 = 0; i18 < length5; i18++) {
            arrayList.add(new ArrayList());
        }
        int length6 = mappings.length;
        int i19 = 0;
        final int i21 = 0;
        while (i19 < length6) {
            final String[] strArr3 = mappings[i19];
            int i22 = i21 + 1;
            INSTANCE.rabinKarpSearch(b11, strArr3, new x00.q() { // from class: androidx.room.a
                @Override // x00.q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    g2 resolve$lambda$16$lambda$7;
                    resolve$lambda$16$lambda$7 = AmbiguousColumnResolver.resolve$lambda$16$lambda$7(strArr3, arrayList, i21, ((Integer) obj).intValue(), ((Integer) obj2).intValue(), (List) obj3);
                    return resolve$lambda$16$lambda$7;
                }
            });
            if (((List) arrayList.get(i21)).isEmpty()) {
                ArrayList arrayList2 = new ArrayList(strArr3.length);
                int length7 = strArr3.length;
                for (int i23 = i11; i23 < length7; i23++) {
                    String str3 = strArr3[i23];
                    List j12 = a00.g0.j();
                    for (ResultColumn resultColumn : b11) {
                        if (g0.g(str3, resultColumn.getName())) {
                            j12.add(Integer.valueOf(resultColumn.getIndex()));
                        }
                    }
                    List b12 = a00.g0.b(j12);
                    if (!b12.isEmpty()) {
                        arrayList2.add(b12);
                    } else {
                        throw new IllegalStateException(("Column " + str3 + " not found in result").toString());
                    }
                }
                dfs$default(INSTANCE, arrayList2, null, 0, new x00.l() { // from class: androidx.room.b
                    @Override // x00.l
                    public final Object invoke(Object obj) {
                        g2 resolve$lambda$16$lambda$15;
                        resolve$lambda$16$lambda$15 = AmbiguousColumnResolver.resolve$lambda$16$lambda$15(arrayList, i21, (List) obj);
                        return resolve$lambda$16$lambda$15;
                    }
                }, 6, null);
            }
            i19++;
            i21 = i22;
            i11 = 0;
        }
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (((List) it.next()).isEmpty()) {
                    throw new IllegalStateException("Failed to find matches for all mappings");
                }
            }
        }
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = Solution.Companion.getNO_SOLUTION();
        dfs$default(INSTANCE, arrayList, null, 0, new x00.l() { // from class: androidx.room.c
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 resolve$lambda$19;
                resolve$lambda$19 = AmbiguousColumnResolver.resolve$lambda$19(Ref.ObjectRef.this, (List) obj);
                return resolve$lambda$19;
            }
        }, 6, null);
        List<Match> matches = ((Solution) objectRef.element).getMatches();
        ArrayList arrayList3 = new ArrayList(i0.d0(matches, 10));
        Iterator<T> it2 = matches.iterator();
        while (it2.hasNext()) {
            arrayList3.add(r0.Z5(((Match) it2.next()).getResultIndices()));
        }
        return (int[][]) arrayList3.toArray(new int[0][]);
    }
}

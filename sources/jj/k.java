package jj;

import a00.i0;
import a00.l1;
import a00.r0;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import yz.g2;
import yz.h1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Dao
/* loaded from: classes5.dex */
public interface k {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final a f64248a = a.f64249a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nWordFavoritesDao.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WordFavoritesDao.kt\ncom/baicizhan/main/word_book/data/db/dao/WordFavoritesDao$Helper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,152:1\n1869#2,2:153\n1869#2,2:162\n1563#2:172\n1634#2,3:173\n536#3:155\n521#3,6:156\n536#3:164\n521#3,6:165\n1#4:171\n*S KotlinDebug\n*F\n+ 1 WordFavoritesDao.kt\ncom/baicizhan/main/word_book/data/db/dao/WordFavoritesDao$Helper\n*L\n85#1:153,2\n90#1:162,2\n143#1:172\n143#1:173,3\n88#1:155\n88#1:156,6\n93#1:164\n93#1:165,6\n*E\n"})
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f64249a = new a();

        public final Map<Long, Integer> a(Map<Long, Integer> map, long j11, int i11) {
            Map<Long, Integer> J0 = l1.J0(map);
            J0.put(Long.valueOf(j11), Integer.valueOf(i11));
            return J0;
        }

        public final Map<Long, Long> b(Map<Long, Long> map, long j11, long j12) {
            Map<Long, Long> J0 = l1.J0(map);
            J0.put(Long.valueOf(j11), Long.valueOf(j12));
            return J0;
        }

        public final Map<Long, Long> c(Map<Long, Long> map, Set<Long> set, long j11) {
            Map<Long, Long> J0 = l1.J0(map);
            Set<Long> set2 = set;
            ArrayList arrayList = new ArrayList(i0.d0(set2, 10));
            Iterator<T> it = set2.iterator();
            while (it.hasNext()) {
                arrayList.add(h1.a(Long.valueOf(((Number) it.next()).longValue()), Long.valueOf(j11)));
            }
            l1.w0(J0, arrayList);
            return J0;
        }

        public final Set<Long> d(Set<Long> set, long j11) {
            Set<Long> e62 = r0.e6(set);
            e62.add(Long.valueOf(j11));
            return e62;
        }

        public final Set<Long> e(Set<Long> set, Set<Long> set2) {
            Set<Long> e62 = r0.e6(set);
            e62.addAll(set2);
            return e62;
        }

        public final Map<Long, Integer> f(Map<Long, Integer> map, Map<Long, Integer> map2) {
            Map<Long, Integer> J0 = l1.J0(map);
            J0.putAll(map2);
            return J0;
        }

        public final Map<Long, Long> g(Map<Long, Long> map, Map<Long, Long> map2) {
            Map<Long, Long> J0 = l1.J0(map);
            J0.putAll(map2);
            return J0;
        }

        @m80.k
        public final kj.b h(@m80.k kj.b bVar, long j11) {
            g0.p(bVar, "<this>");
            Set<Long> e62 = r0.e6(bVar.q());
            e62.remove(Long.valueOf(j11));
            Map<Long, Long> J0 = l1.J0(bVar.r());
            J0.remove(Long.valueOf(j11));
            g2 g2Var = g2.f100423a;
            Map<Long, Integer> J02 = l1.J0(bVar.t());
            J02.remove(Long.valueOf(j11));
            return bVar.k(e62, J0, J02);
        }

        @m80.k
        public final kj.b i(@m80.k kj.b bVar, long j11, int i11) {
            g0.p(bVar, "<this>");
            return kj.b.m(bVar, null, null, a(bVar.t(), j11, i11), 3, null);
        }

        @m80.k
        public final kj.b j(@m80.k kj.b bVar, long j11, long j12) {
            g0.p(bVar, "<this>");
            return kj.b.m(bVar, d(bVar.q(), j11), b(bVar.r(), j11, j12), null, 4, null);
        }

        @m80.k
        public final kj.b k(@m80.k kj.b bVar, long j11, @m80.k String word, @m80.k String meaning, @m80.k String accent, @m80.k String audioUS, @m80.k String audioUK, long j12) {
            g0.p(bVar, "<this>");
            g0.p(word, "word");
            g0.p(meaning, "meaning");
            g0.p(accent, "accent");
            g0.p(audioUS, "audioUS");
            g0.p(audioUK, "audioUK");
            return kj.b.l(bVar, 0L, d(bVar.q(), j11), b(bVar.r(), j11, j12), null, word, meaning, accent, audioUS, audioUK, 9, null);
        }

        @m80.k
        public final kj.b l(@m80.k kj.b bVar, @m80.k Set<Long> bookIds, @m80.k String word, @m80.k String meaning, @m80.k String accent, @m80.k String audioUS, @m80.k String audioUK, long j11) {
            g0.p(bVar, "<this>");
            g0.p(bookIds, "bookIds");
            g0.p(word, "word");
            g0.p(meaning, "meaning");
            g0.p(accent, "accent");
            g0.p(audioUS, "audioUS");
            g0.p(audioUK, "audioUK");
            return kj.b.l(bVar, 0L, e(bVar.q(), bookIds), c(bVar.r(), bookIds, j11), null, word, meaning, accent, audioUS, audioUK, 9, null);
        }

        @m80.k
        public final kj.b m(@m80.k kj.b bVar, @m80.k Set<Long> bookIds, @m80.k Map<Long, Long> createdAts, @m80.k Map<Long, Integer> scores) {
            g0.p(bVar, "<this>");
            g0.p(bookIds, "bookIds");
            g0.p(createdAts, "createdAts");
            g0.p(scores, "scores");
            return bVar.k(e(bVar.q(), bookIds), g(bVar.r(), createdAts), f(bVar.t(), scores));
        }

        @m80.k
        public final kj.b n(@m80.k kj.b bVar, @m80.k Set<Long> bookIds, long j11) {
            g0.p(bVar, "<this>");
            g0.p(bookIds, "bookIds");
            Map J0 = l1.J0(bVar.r());
            Set<Long> set = bookIds;
            Iterator<T> it = set.iterator();
            while (it.hasNext()) {
                long longValue = ((Number) it.next()).longValue();
                Long valueOf = Long.valueOf(longValue);
                Long l11 = (Long) J0.get(Long.valueOf(longValue));
                J0.put(valueOf, Long.valueOf(l11 != null ? l11.longValue() : j11));
            }
            g2 g2Var = g2.f100423a;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : J0.entrySet()) {
                if (bookIds.contains(entry.getKey())) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            Map J02 = l1.J0(bVar.t());
            Iterator<T> it2 = set.iterator();
            while (it2.hasNext()) {
                long longValue2 = ((Number) it2.next()).longValue();
                Long valueOf2 = Long.valueOf(longValue2);
                Integer num = (Integer) J02.get(Long.valueOf(longValue2));
                J02.put(valueOf2, Integer.valueOf(num != null ? num.intValue() : 0));
            }
            g2 g2Var2 = g2.f100423a;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry entry2 : J02.entrySet()) {
                if (bookIds.contains(entry2.getKey())) {
                    linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                }
            }
            return bVar.k(bookIds, linkedHashMap, linkedHashMap2);
        }
    }

    @m80.l
    @Query("SELECT universeTopicId FROM word_favorites WHERE bookIds = '['||:bookId||']' OR bookIds LIKE '['||:bookId||',%' OR bookIds LIKE '%,'||:bookId||']' OR bookIds LIKE '%,'||:bookId||',%'")
    Object a(long j11, @m80.k j00.c<? super List<Long>> cVar);

    @Update
    @m80.l
    Object b(@m80.k kj.b[] bVarArr, @m80.k j00.c<? super g2> cVar);

    @m80.l
    @Query("SELECT * FROM word_favorites")
    Object c(@m80.k j00.c<? super List<kj.b>> cVar);

    @m80.l
    @Query("SELECT * FROM word_favorites WHERE universeTopicId & 4294967295 = :topicId")
    Object d(int i11, @m80.k j00.c<? super List<kj.b>> cVar);

    @m80.l
    @Query("SELECT * FROM word_favorites WHERE universeTopicId = :universalId")
    Object e(long j11, @m80.k j00.c<? super kj.b> cVar);

    @Insert(onConflict = 5)
    @m80.l
    Object f(@m80.k kj.b[] bVarArr, @m80.k j00.c<? super List<Long>> cVar);

    @m80.l
    @Query("SELECT * FROM word_favorites WHERE bookIds = '['||:bookId||']' OR bookIds LIKE '['||:bookId||',%' OR bookIds LIKE '%,'||:bookId||']' OR bookIds LIKE '%,'||:bookId||',%'")
    Object g(long j11, @m80.k j00.c<? super List<kj.b>> cVar);

    @m80.l
    @Query("SELECT universeTopicId & 4294967295 FROM word_favorites")
    Object h(@m80.k j00.c<? super List<Integer>> cVar);

    @m80.l
    @Query("SELECT COUNT(*) FROM word_favorites WHERE bookIds = '['||:bookId||']' OR bookIds LIKE '['||:bookId||',%' OR bookIds LIKE '%,'||:bookId||']' OR bookIds LIKE '%,'||:bookId||',%'")
    Object i(long j11, @m80.k j00.c<? super Integer> cVar);

    @m80.l
    @Query("SELECT * FROM word_favorites WHERE universeTopicId IN (:universalIds)")
    @yz.n(message = "Query can be slow")
    Object j(@m80.k long[] jArr, @m80.k j00.c<? super List<kj.b>> cVar);

    @Query("SELECT * FROM word_favorites WHERE bookIds = '['||:bookId||']' OR bookIds LIKE '['||:bookId||',%' OR bookIds LIKE '%,'||:bookId||']' OR bookIds LIKE '%,'||:bookId||',%'")
    @m80.k
    kotlinx.coroutines.flow.i<List<kj.b>> k(long j11);

    @m80.l
    @Delete
    Object l(@m80.k kj.b[] bVarArr, @m80.k j00.c<? super g2> cVar);

    @m80.l
    @Query("SELECT universeTopicId, bookIds, createdAts, scores FROM word_favorites WHERE universeTopicId IN (:universalIds)")
    @yz.n(message = "Query can be slow")
    Object m(@m80.k long[] jArr, @m80.k j00.c<? super List<kj.d>> cVar);

    @m80.l
    @Query("DELETE FROM word_favorites WHERE bookIds = '['||:bookId||']' AND universeTopicId IN (:universalIds)")
    Object n(long j11, @m80.k long[] jArr, @m80.k j00.c<? super g2> cVar);

    @Query("SELECT * FROM word_favorites")
    @m80.k
    kotlinx.coroutines.flow.i<List<kj.b>> o();

    @m80.l
    @Query("DELETE FROM word_favorites WHERE universeTopicId IN (:universalIds)")
    Object p(@m80.k long[] jArr, @m80.k j00.c<? super g2> cVar);
}

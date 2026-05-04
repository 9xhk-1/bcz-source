package i9;

import android.content.Context;
import android.database.DatabaseUtils;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import com.baicizhan.client.business.dataset.models.ShortPhraseRecord;
import com.baicizhan.client.business.dataset.models.lookup.DictionaryMapRecord;
import com.baicizhan.client.business.dataset.models.lookup.DictionaryRecord;
import com.baicizhan.client.business.dataset.provider.a;
import com.baicizhan.client.business.lookup.Word;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class i {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface a {
        int a(DictionaryRecord src);
    }

    public static DictionaryRecord a(Context context, int topicId) {
        return (DictionaryRecord) k9.a.q(k9.c.i(a.e.f16180r).m("topic_id=" + topicId, new String[0]).d(context), DictionaryRecord.class, DictionaryRecord.COLUMN_MAP);
    }

    public static List<DictionaryRecord> b(Context context, int limit, Collection<Integer> topicids) {
        return k9.a.n(k9.c.i(a.e.f16180r).g("DISTINCT mean_cn", "topic_id", "word", "accent").n("topic_id", topicids, limit).c("RANDOM()").b(limit).d(context), DictionaryRecord.class, DictionaryRecord.COLUMN_MAP);
    }

    public static List<DictionaryRecord> c(Context context, int limit) {
        return k9.a.n(k9.c.i(a.e.f16180r).g("DISTINCT mean_cn", "topic_id", "word", "accent").m("topic_id<>?", "0").c("RANDOM()").b(limit).d(context), DictionaryRecord.class, DictionaryRecord.COLUMN_MAP);
    }

    public static ShortPhraseRecord d(Context context, int id2) {
        return (ShortPhraseRecord) k9.a.q(k9.c.i(a.c0.f16140b).m("TOPIC = " + id2, new String[0]).d(context), ShortPhraseRecord.class, ShortPhraseRecord.COLUMN_MAP);
    }

    public static List<DictionaryRecord> e(Context context, Collection<Pair<Integer, String>> basePairs, a bookIdGetter) {
        if (xb.e.h(basePairs)) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (Pair<Integer, String> pair : basePairs) {
            String uri = a.e.a((String) pair.second).toString();
            Collection collection = (Collection) hashMap.get(uri);
            if (collection == null) {
                collection = new ArrayList();
                hashMap.put(uri, collection);
            }
            collection.add((Integer) pair.first);
        }
        ArrayList<DictionaryRecord> arrayList = new ArrayList();
        for (String str : hashMap.keySet()) {
            List n11 = k9.a.n(k9.c.i(Uri.parse(str)).n("topic_id", (Collection) hashMap.get(str), 100).d(context), DictionaryRecord.class, DictionaryRecord.COLUMN_MAP);
            if (n11 != null) {
                arrayList.addAll(n11);
            }
        }
        if (bookIdGetter != null) {
            for (DictionaryRecord dictionaryRecord : arrayList) {
                dictionaryRecord.bookId = bookIdGetter.a(dictionaryRecord);
            }
        }
        return arrayList;
    }

    public static Word f(Context context, String keyword, boolean needBook) {
        Word word;
        if (TextUtils.isEmpty(keyword)) {
            return null;
        }
        Uri a11 = a.e.a(keyword);
        String str = keyword.length() > 1 ? " COLLATE NOCASE" : "";
        List n11 = k9.a.n(k9.c.i(a11).m("word=" + DatabaseUtils.sqlEscapeString(keyword) + str, new String[0]).d(context), DictionaryRecord.class, DictionaryRecord.COLUMN_MAP);
        if (xb.e.h(n11)) {
            word = null;
        } else {
            Iterator it = n11.iterator();
            while (true) {
                if (!it.hasNext()) {
                    word = null;
                    break;
                }
                word = ((DictionaryRecord) it.next()).toWord();
                if (TextUtils.equals(word.getWord(), keyword)) {
                    break;
                }
            }
            if (word == null) {
                word = ((DictionaryRecord) n11.get(0)).toWord();
            }
        }
        if (needBook) {
            if (word == null) {
                return null;
            }
            List<DictionaryMapRecord> n12 = k9.a.n(k9.c.i(a.f.f16188b).m("topic_id=?", word.getId()).d(context), DictionaryMapRecord.class, DictionaryMapRecord.COLUMN_MAP);
            if (!xb.e.h(n12)) {
                for (DictionaryMapRecord dictionaryMapRecord : n12) {
                    int[] bookIds = dictionaryMapRecord.getBookIds();
                    if (bookIds != null && bookIds.length > 0) {
                        word.setBookId(bookIds[0]);
                        word.setId(String.valueOf(dictionaryMapRecord.topicId));
                    }
                }
            }
        }
        return word;
    }

    public static List<Word> g(Context context, int preferredBookId, String prefix, int limit) {
        List list;
        Iterator it;
        DictionaryMapRecord dictionaryMapRecord;
        boolean z11;
        List list2;
        Iterator it2;
        boolean z12;
        DictionaryMapRecord dictionaryMapRecord2 = null;
        if (TextUtils.isEmpty(prefix)) {
            return null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        Uri a11 = a.e.a(prefix);
        k9.c i11 = k9.c.i(a11);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("word like ");
        sb2.append(DatabaseUtils.sqlEscapeString(prefix + "%"));
        List<DictionaryRecord> n11 = k9.a.n(i11.m(sb2.toString(), new String[0]).c("freq desc, word_length asc").b(limit).d(context), DictionaryRecord.class, DictionaryRecord.COLUMN_MAP);
        boolean z13 = true;
        if (n11 != null) {
            Iterator it3 = n11.iterator();
            while (it3.hasNext()) {
                if (((DictionaryRecord) it3.next()).word.equalsIgnoreCase(prefix)) {
                    break;
                }
            }
        }
        DictionaryRecord dictionaryRecord = (DictionaryRecord) k9.a.q(k9.c.i(a11).m("word = ?", prefix).d(context), DictionaryRecord.class, DictionaryRecord.COLUMN_MAP);
        if (dictionaryRecord != null) {
            if (n11 == null) {
                n11 = Collections.singletonList(dictionaryRecord);
            } else {
                n11.add(0, dictionaryRecord);
                if (n11.size() > limit) {
                    n11.remove(n11.size() - 1);
                }
            }
        }
        if (n11 == null || n11.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList(n11.size());
        Iterator it4 = n11.iterator();
        while (it4.hasNext()) {
            arrayList.add(Integer.valueOf(((DictionaryRecord) it4.next()).topicId));
        }
        Collections.sort(arrayList);
        List n12 = k9.a.n(k9.c.i(a.f.f16188b).n("topic_id", arrayList, 100).d(context), DictionaryMapRecord.class, DictionaryMapRecord.COLUMN_MAP);
        HashMap hashMap = new HashMap(arrayList.size());
        if (n12 != null) {
            Collections.sort(n12, DictionaryMapRecord.ASC_CMP);
            Iterator it5 = arrayList.iterator();
            int i12 = 0;
            while (it5.hasNext()) {
                Integer num = (Integer) it5.next();
                int intValue = num.intValue();
                int i13 = i12;
                DictionaryMapRecord dictionaryMapRecord3 = dictionaryMapRecord2;
                while (true) {
                    if (i13 >= n12.size()) {
                        list = n12;
                        it = it5;
                        dictionaryMapRecord = dictionaryMapRecord2;
                        z11 = z13;
                        break;
                    }
                    DictionaryMapRecord dictionaryMapRecord4 = (DictionaryMapRecord) n12.get(i13);
                    dictionaryMapRecord = dictionaryMapRecord2;
                    if (intValue != dictionaryMapRecord4.topicId) {
                        list = n12;
                        it = it5;
                        z11 = z13;
                        hashMap.put(num, dictionaryMapRecord3);
                        i12 = i13;
                        break;
                    }
                    if (hashMap.containsKey(num)) {
                        list2 = n12;
                        it2 = it5;
                        z12 = z13;
                    } else {
                        if (dictionaryMapRecord3 == null) {
                            dictionaryMapRecord3 = dictionaryMapRecord4;
                        }
                        int[] bookIds = dictionaryMapRecord4.getBookIds();
                        if (bookIds != null) {
                            int length = bookIds.length;
                            z12 = z13;
                            int i14 = 0;
                            while (true) {
                                list2 = n12;
                                if (i14 >= length) {
                                    it2 = it5;
                                    break;
                                }
                                int i15 = bookIds[i14];
                                it2 = it5;
                                if (dictionaryMapRecord3.selectBookId == 0) {
                                    dictionaryMapRecord3.selectBookId = i15;
                                }
                                if (i15 == preferredBookId) {
                                    dictionaryMapRecord4.selectBookId = preferredBookId;
                                    hashMap.put(num, dictionaryMapRecord4);
                                    break;
                                }
                                i14++;
                                n12 = list2;
                                it5 = it2;
                            }
                        } else {
                            list2 = n12;
                            it2 = it5;
                            z12 = z13;
                        }
                        if (i13 == list2.size() - 1 && !hashMap.containsKey(num)) {
                            hashMap.put(num, dictionaryMapRecord3);
                        }
                    }
                    i13++;
                    n12 = list2;
                    it5 = it2;
                    dictionaryMapRecord2 = dictionaryMapRecord;
                    z13 = z12;
                }
                n12 = list;
                it5 = it;
                dictionaryMapRecord2 = dictionaryMapRecord;
                z13 = z11;
            }
        }
        boolean z14 = z13;
        ArrayList arrayList2 = new ArrayList(n11.size());
        for (DictionaryRecord dictionaryRecord2 : n11) {
            DictionaryMapRecord dictionaryMapRecord5 = (DictionaryMapRecord) hashMap.get(Integer.valueOf(dictionaryRecord2.topicId));
            Word word = new Word();
            word.setBookId(dictionaryMapRecord5 != null ? dictionaryMapRecord5.selectBookId : dictionaryRecord2.bookId);
            word.setId(String.valueOf(dictionaryMapRecord5 != null ? dictionaryMapRecord5.topicId : dictionaryRecord2.topicId));
            word.setWord(dictionaryRecord2.word);
            word.setAccent(dictionaryRecord2.accent);
            word.setCnmean(dictionaryRecord2.meanCn);
            word.setBase(z14);
            word.setSearch(z14);
            arrayList2.add(word);
        }
        qb.c.b("whiz", "lookup elapsed: " + (System.currentTimeMillis() - currentTimeMillis), new Object[0]);
        return arrayList2;
    }
}

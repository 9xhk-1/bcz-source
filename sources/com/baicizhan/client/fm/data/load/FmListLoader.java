package com.baicizhan.client.fm.data.load;

import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import com.baicizhan.client.business.dataset.models.TopicLearnRecord;
import com.baicizhan.client.business.dataset.models.WordMediaMidRecord;
import com.baicizhan.client.business.dataset.models.WordMediaRecord;
import com.baicizhan.client.business.dataset.provider.a;
import com.baicizhan.client.business.thrift.l;
import com.baicizhan.client.business.thrift.p;
import com.baicizhan.client.business.util.BczJson;
import com.baicizhan.client.business.util.NoProguard;
import com.baicizhan.client.fm.data.FmList;
import com.baicizhan.client.fm.data.FmMidList;
import com.baicizhan.client.fm.data.db.FmDBAccessObservables;
import com.baicizhan.client.fm.data.db.WordIdRecordHelper;
import com.baicizhan.client.fm.data.db.WordInfoRecordHelper;
import com.baicizhan.online.bs_words.BSWords;
import com.baicizhan.online.resource_api.ResourceService;
import i9.o;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.thrift.TException;
import org.junit.jupiter.api.j2;
import q9.x;
import rx.c;
import s60.d;
import wb0.q;
import xb.e;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class FmListLoader {
    public static final int ERR_NETWORKS = -1;
    public static final int NO_ERR = 0;
    private static final int SEND_SEGMENT = 50;
    public static final String TAG = "FmListLoader";

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class FmListParams {
        public List<String> borders;

        @Deprecated
        private Object cookie;
        public FmList list;
        public FmMidList midlist;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class FmParams {
        public boolean bookLoaded;

        @Deprecated
        private Object cookie;
        public List<WordMediaRecord> fmrecords;
        public List<String> wordids;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class UpdateInfo implements NoProguard {
        private int tapescript_id;
        private long tv_updated_at;
        private long updated_at;

        private UpdateInfo() {
        }
    }

    private FmListLoader() {
    }

    private static c<ResourceService.Client> getClient() {
        return p.a(new l("/rpc/resource_api").c(1).b(3000).d(3000));
    }

    public static c<FmParams> getFmInfos(final Context context, final int bookid) {
        return getClient().w5(bc0.c.e()).c3(new wb0.p<ResourceService.Client, FmParams>() { // from class: com.baicizhan.client.fm.data.load.FmListLoader.8
            @Override // wb0.p
            public FmParams call(ResourceService.Client client) {
                try {
                    FmParams fmParams = new FmParams();
                    if (!o.s(context, bookid)) {
                        j9.a.g(context, bookid, client);
                        o.z(context, bookid);
                    }
                    fmParams.fmrecords = WordIdRecordHelper.getFmRecords(context, bookid);
                    fmParams.bookLoaded = true;
                    return fmParams;
                } catch (Exception e11) {
                    throw new RuntimeException(e11);
                }
            }
        });
    }

    private static c<FmList> getFmList(final Context context, final int bookid, final List<String> wordids) {
        return getClient().w5(bc0.c.e()).c3(new wb0.p<ResourceService.Client, FmList>() { // from class: com.baicizhan.client.fm.data.load.FmListLoader.3
            @Override // wb0.p
            public FmList call(ResourceService.Client client) {
                try {
                    return FmListLoader.getFmList(client, context, bookid, wordids, FmListLoader.getWordsWithoutFm(client, context, bookid), false);
                } catch (Exception e11) {
                    throw new RuntimeException(e11);
                }
            }
        });
    }

    private static c<FmMidList> getFmMidList(final Context context) {
        return p.a(new l("/rpc/words").c(1).b(3000).d(3000)).w5(bc0.c.e()).c3(new wb0.p<BSWords.Client, FmMidList>() { // from class: com.baicizhan.client.fm.data.load.FmListLoader.5
            @Override // wb0.p
            public FmMidList call(BSWords.Client client) {
                return FmListLoader.getFmMidList(client, context);
            }
        });
    }

    private static List<WordMediaMidRecord> getMediaMidRecordFromOldTable(Context context) {
        if (i9.c.k(context, a.c.f16131f, a.n.f16259a)) {
            return k9.a.n(k9.c.i(a.n.f16260b).m("ws_word_tv=?", "0").d(context), WordMediaMidRecord.class, WordMediaMidRecord.OLD_COLUMN_MAP);
        }
        return null;
    }

    private static WordMediaRecord getMediaRecordFromOldTables(Context context, int bookid, String topicId) {
        Cursor d11 = k9.c.j(a.c.f16130e, "select distinct " + a.C0239a.C0240a.f16096d + " from " + a.C0239a.b(bookid) + " where topic_id" + d.f88059c, topicId).d(context);
        if (d11 == null) {
            return null;
        }
        try {
            int i11 = d11.moveToFirst() ? d11.getInt(0) : 0;
            if (i11 <= 0) {
                return null;
            }
            WordMediaRecord wordMediaRecord = (WordMediaRecord) k9.a.q(k9.c.i(a.o.f16268b).m("ws_id=?", String.valueOf(i11)).d(context), WordMediaRecord.class, WordMediaRecord.OLD_COLUMN_MAP);
            if (wordMediaRecord != null) {
                wordMediaRecord.setWordid(topicId);
            }
            return wordMediaRecord;
        } finally {
            d11.close();
        }
    }

    private static List<WordMediaRecord> getMediaRecordsFromOldTables(Context context, int bookid, Set<String> topicIds) {
        Cursor d11 = k9.c.i(a.C0239a.a(bookid)).n("topic_id", topicIds, 200).d(context);
        if (d11 == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        while (d11.moveToNext()) {
            try {
                hashMap.put(Integer.valueOf(d11.getInt(d11.getColumnIndex(a.C0239a.C0240a.f16096d))), Integer.valueOf(d11.getInt(d11.getColumnIndex("topic_id"))));
            } catch (Throwable th2) {
                d11.close();
                throw th2;
            }
        }
        d11.close();
        if (hashMap.isEmpty()) {
            return null;
        }
        List<WordMediaRecord> n11 = k9.a.n(k9.c.i(a.o.f16268b).n("ws_id", hashMap.keySet(), 200).d(context), WordMediaRecord.class, WordMediaRecord.OLD_COLUMN_MAP);
        for (WordMediaRecord wordMediaRecord : n11) {
            wordMediaRecord.setWordid(String.valueOf(hashMap.get(Integer.valueOf(wordMediaRecord.getTapId()))));
        }
        return n11;
    }

    public static c<FmParams> getWordIds(final Context context, final int bookid) {
        return getClient().w5(bc0.c.e()).c3(new wb0.p<ResourceService.Client, FmParams>() { // from class: com.baicizhan.client.fm.data.load.FmListLoader.7
            @Override // wb0.p
            public FmParams call(ResourceService.Client client) {
                FmParams fmParams = new FmParams();
                fmParams.bookLoaded = o.s(context, bookid);
                try {
                    if (o.t(context, bookid)) {
                        j9.a.m(context, bookid, client);
                    }
                    List<String> e11 = o.e(context, bookid, 0);
                    fmParams.wordids = e11;
                    if (fmParams.bookLoaded && e11 != null) {
                        List<WordMediaRecord> m11 = o.m(context, bookid, new HashSet(fmParams.wordids), 0);
                        if (e.h(m11) || m11.size() < fmParams.wordids.size() - 10) {
                            j9.a.g(context, bookid, client);
                        }
                        fmParams.fmrecords = WordIdRecordHelper.getFmRecords(context, bookid);
                    }
                    return fmParams;
                } catch (Exception e12) {
                    if (!(e12 instanceof TException)) {
                        throw new RuntimeException(e12);
                    }
                    qb.c.c(FmListLoader.TAG, "get word ids failed. ", e12);
                    return fmParams;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Set<java.lang.Integer> getWordsWithoutFm(com.baicizhan.online.resource_api.ResourceService.Client r7, android.content.Context r8, int r9) {
        /*
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r1 = 0
            java.util.Set r1 = i9.o.j(r8, r9, r1)
            if (r1 == 0) goto L15
            boolean r2 = r1.isEmpty()     // Catch: java.lang.Exception -> L13
            if (r2 == 0) goto L54
            goto L15
        L13:
            r7 = move-exception
            goto L51
        L15:
            boolean r2 = rb.d.f(r8)     // Catch: java.lang.Exception -> L13
            if (r2 == 0) goto L54
            java.util.List r7 = j9.a.m(r8, r9, r7)     // Catch: java.lang.Exception -> L13
            if (r7 == 0) goto L54
            java.util.HashSet r2 = new java.util.HashSet     // Catch: java.lang.Exception -> L13
            r2.<init>()     // Catch: java.lang.Exception -> L13
            java.util.Iterator r7 = r7.iterator()     // Catch: java.lang.Exception -> L4c
        L2a:
            boolean r1 = r7.hasNext()     // Catch: java.lang.Exception -> L4c
            if (r1 == 0) goto L4f
            java.lang.Object r1 = r7.next()     // Catch: java.lang.Exception -> L4c
            com.baicizhan.client.business.dataset.models.WordMediaUpdRecord r1 = (com.baicizhan.client.business.dataset.models.WordMediaUpdRecord) r1     // Catch: java.lang.Exception -> L4c
            long r3 = r1.getFmupdate()     // Catch: java.lang.Exception -> L4c
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L2a
            java.lang.String r1 = r1.getWordid()     // Catch: java.lang.Exception -> L4c
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Exception -> L4c
            r2.add(r1)     // Catch: java.lang.Exception -> L4c
            goto L2a
        L4c:
            r7 = move-exception
            r1 = r2
            goto L51
        L4f:
            r1 = r2
            goto L54
        L51:
            r7.printStackTrace()
        L54:
            if (r1 == 0) goto L88
            boolean r7 = r1.isEmpty()
            if (r7 == 0) goto L5d
            goto L88
        L5d:
            q9.x r7 = q9.x.r()
            java.util.Map r7 = r7.n()
            if (r7 != 0) goto L69
            r7 = 0
            return r7
        L69:
            java.util.Set r7 = r7.keySet()
            java.util.Iterator r7 = r7.iterator()
        L71:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L87
            java.lang.Object r8 = r7.next()
            java.lang.Integer r8 = (java.lang.Integer) r8
            boolean r9 = r1.contains(r8)
            if (r9 != 0) goto L71
            r0.add(r8)
            goto L71
        L87:
            return r0
        L88:
            java.util.Set r7 = getWordsWithoutFmFromOldTables(r8, r9)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.client.fm.data.load.FmListLoader.getWordsWithoutFm(com.baicizhan.online.resource_api.ResourceService$Client, android.content.Context, int):java.util.Set");
    }

    private static Set<Integer> getWordsWithoutFmFromOldTables(Context context, int bookid) {
        boolean k11 = i9.c.k(context, a.c.f16132g, a.a0.f16097a);
        boolean k12 = i9.c.k(context, a.c.f16130e, a.C0239a.b(bookid));
        if (!k11 || !k12) {
            return null;
        }
        Cursor d11 = k9.c.j(a.c.f16132g, "select distinct " + a.a0.C0241a.f16102d + " from " + a.a0.f16097a + " where " + a.a0.C0241a.f16099a + "=? and TYPE" + d.f88059c, String.valueOf(bookid), "2").d(context);
        if (d11 == null) {
            return null;
        }
        try {
            byte[] blob = d11.moveToFirst() ? d11.getBlob(0) : null;
            d11.close();
            List<UpdateInfo> list = (List) new com.google.gson.d().o(new String(blob), new bp.a<List<UpdateInfo>>() { // from class: com.baicizhan.client.fm.data.load.FmListLoader.6
            }.getType());
            HashSet hashSet = new HashSet(list.size());
            for (UpdateInfo updateInfo : list) {
                if (updateInfo.updated_at != 0) {
                    hashSet.add(Integer.valueOf(updateInfo.tapescript_id));
                }
            }
            if (hashSet.isEmpty()) {
                return null;
            }
            d11 = k9.c.j(a.c.f16130e, "select distinct topic_id" + j2.O + a.C0239a.C0240a.f16096d + " from " + a.C0239a.b(bookid), new String[0]).d(context);
            if (d11 == null) {
                return null;
            }
            try {
                HashSet hashSet2 = new HashSet();
                while (d11.moveToNext()) {
                    if (!hashSet.contains(Integer.valueOf(d11.getInt(1)))) {
                        hashSet2.add(Integer.valueOf(d11.getInt(0)));
                    }
                }
                return hashSet2;
            } finally {
            }
        } finally {
        }
    }

    private static boolean isMediaRecordOldTablesExists(Context context, int bookid) {
        return i9.c.k(context, a.c.f16130e, a.C0239a.b(bookid)) && i9.c.k(context, a.c.f16131f, a.o.f16267a);
    }

    public static c<FmListParams> loadFmList(Context context, final int bookid, final int planCount) {
        return c.r7(getFmList(context, bookid, planCount), getFmMidList(context), new q<FmList, FmMidList, FmListParams>() { // from class: com.baicizhan.client.fm.data.load.FmListLoader.1
            @Override // wb0.q
            public FmListParams call(FmList fmList, FmMidList fmMidList) {
                FmListParams fmListParams = new FmListParams();
                fmListParams.list = fmList;
                fmListParams.midlist = fmMidList;
                return fmListParams;
            }
        });
    }

    private static List<String> loadRawFmlist(int planCount, Map<Integer, Integer> viewedMap, Set<Integer> skippedSet, Set<Integer> invalidSet) {
        HashMap hashMap = new HashMap();
        hashMap.put("learnedList", viewedMap);
        hashMap.put("skippedList", skippedSet);
        x.r().a(8);
        ad.a s11 = x.r().s();
        s11.v(planCount, hashMap);
        s11.x(null);
        ad.c u11 = s11.u();
        List<yc.b> y11 = u11.y(0, u11.a());
        ArrayList arrayList = new ArrayList(y11.size());
        for (yc.b bVar : y11) {
            if (invalidSet != null && !invalidSet.contains(Integer.valueOf(bVar.e0()))) {
                arrayList.add(String.valueOf(bVar.e0()));
            }
        }
        return arrayList;
    }

    private static c<FmList> getFmList(final Context context, final int bookid, final int planCount) {
        return getClient().w5(bc0.c.e()).c3(new wb0.p<ResourceService.Client, FmList>() { // from class: com.baicizhan.client.fm.data.load.FmListLoader.4
            @Override // wb0.p
            public FmList call(ResourceService.Client client) {
                try {
                    return FmListLoader.getFmList(client, context, bookid, planCount);
                } catch (Exception e11) {
                    throw new RuntimeException(e11);
                }
            }
        });
    }

    public static c<FmListParams> loadFmList(Context context, final int bookid, final List<String> wordids) {
        return c.r7(getFmList(context, bookid, wordids), FmDBAccessObservables.getFmBorders(context), new q<FmList, List<String>, FmListParams>() { // from class: com.baicizhan.client.fm.data.load.FmListLoader.2
            @Override // wb0.q
            public FmListParams call(FmList fmList, List<String> borders) {
                FmListParams fmListParams = new FmListParams();
                fmListParams.list = fmList;
                fmListParams.borders = borders;
                return fmListParams;
            }
        });
    }

    public static FmList getFmList(ResourceService.Client client, Context context, int bookid, int planCount) throws Exception {
        List<TopicLearnRecord> topicLearntRecords = WordInfoRecordHelper.getTopicLearntRecords(context, bookid);
        HashMap hashMap = new HashMap();
        HashSet hashSet = new HashSet();
        for (TopicLearnRecord topicLearnRecord : topicLearntRecords) {
            if (topicLearnRecord.radioState > 0) {
                hashMap.put(Integer.valueOf(topicLearnRecord.topicId), Integer.valueOf(topicLearnRecord.radioState));
            }
            if (TopicLearnRecord.isFmSkipped(topicLearnRecord.radioSkipState)) {
                hashSet.add(Integer.valueOf(topicLearnRecord.topicId));
            }
        }
        Set<Integer> wordsWithoutFm = getWordsWithoutFm(client, context, bookid);
        if (wordsWithoutFm != null) {
            hashSet.addAll(wordsWithoutFm);
        }
        Set<Integer> i11 = o.i(context, bookid, 0);
        List<String> loadRawFmlist = loadRawFmlist(planCount, hashMap, hashSet, i11);
        if (loadRawFmlist != null) {
            Iterator<String> it = loadRawFmlist.iterator();
            while (true) {
                if (it.hasNext()) {
                    String next = it.next();
                    if (!hashMap.containsKey(Integer.valueOf(next)) && (wordsWithoutFm == null || !wordsWithoutFm.contains(Integer.valueOf(next)))) {
                        break;
                    }
                } else {
                    WordInfoRecordHelper.clearTopicViewedTags(context, bookid);
                    loadRawFmlist = loadRawFmlist(planCount, Collections.EMPTY_MAP, Collections.EMPTY_SET, i11);
                    break;
                }
            }
        }
        List<String> list = loadRawFmlist;
        qb.c.i(TAG, "get fm list, load raw data [%s], size [%d], planCount [%d], viewed size [%d], skipped size [%d]", BczJson.writeToJson(list, List.class), Integer.valueOf(list != null ? list.size() : 0), Integer.valueOf(planCount), Integer.valueOf(hashMap.size()), Integer.valueOf(hashSet.size()));
        return getFmList(client, context, bookid, list, wordsWithoutFm, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0033 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.baicizhan.client.fm.data.FmMidList getFmMidList(com.baicizhan.online.bs_words.BSWords.Client r2, android.content.Context r3) {
        /*
            r0 = 0
            java.util.List r0 = i9.o.k(r3, r0)
            if (r0 == 0) goto L10
            boolean r1 = r0.isEmpty()     // Catch: java.lang.Exception -> Le
            if (r1 == 0) goto L25
            goto L10
        Le:
            r2 = move-exception
            goto L22
        L10:
            boolean r1 = rb.d.f(r3)     // Catch: java.lang.Exception -> Le
            if (r1 == 0) goto L25
            com.baicizhan.online.bs_words.BBWordMediaHalftimeList r2 = r2.get_word_media_halftime_list()     // Catch: java.lang.Exception -> Le
            java.util.List r0 = l9.b.a(r2)     // Catch: java.lang.Exception -> Le
            i9.o.u(r3, r0)     // Catch: java.lang.Exception -> Le
            goto L25
        L22:
            r2.printStackTrace()
        L25:
            if (r0 == 0) goto L2d
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L31
        L2d:
            java.util.List r0 = getMediaMidRecordFromOldTable(r3)
        L31:
            if (r0 != 0) goto L35
            r2 = 0
            return r2
        L35:
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = r0.size()
            r2.<init>(r3)
            java.util.Iterator r3 = r0.iterator()
        L42:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L56
            java.lang.Object r0 = r3.next()
            com.baicizhan.client.business.dataset.models.WordMediaMidRecord r0 = (com.baicizhan.client.business.dataset.models.WordMediaMidRecord) r0
            java.lang.String r0 = r0.getPath()
            r2.add(r0)
            goto L42
        L56:
            com.baicizhan.client.fm.data.FmMidList r3 = new com.baicizhan.client.fm.data.FmMidList
            r3.<init>(r2)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.client.fm.data.load.FmListLoader.getFmMidList(com.baicizhan.online.bs_words.BSWords$Client, android.content.Context):com.baicizhan.client.fm.data.FmMidList");
    }

    public static FmList getFmList(ResourceService.Client client, Context context, int bookid, List<String> wordids, Set<Integer> wordsWithoutFm, boolean fromsrv) throws Exception {
        if (wordids == null || wordids.isEmpty()) {
            return null;
        }
        HashSet<String> hashSet = new HashSet(wordids.size());
        Iterator<String> it = wordids.iterator();
        while (it.hasNext()) {
            hashSet.add(it.next());
        }
        ArrayList arrayList = new ArrayList();
        boolean isMediaRecordOldTablesExists = isMediaRecordOldTablesExists(context, bookid);
        int i11 = 0;
        List<WordMediaRecord> m11 = o.m(context, bookid, hashSet, 0);
        if (m11 != null) {
            Iterator<WordMediaRecord> it2 = m11.iterator();
            while (it2.hasNext()) {
                hashSet.remove(it2.next().getWordid());
            }
        } else {
            m11 = new ArrayList<>();
        }
        if (!hashSet.isEmpty() && isMediaRecordOldTablesExists) {
            List<WordMediaRecord> mediaRecordsFromOldTables = getMediaRecordsFromOldTables(context, bookid, hashSet);
            qb.c.i(TAG, "get fm list from old tables [%s]", mediaRecordsFromOldTables == null ? "null" : mediaRecordsFromOldTables.toString());
            if (mediaRecordsFromOldTables != null) {
                m11.addAll(mediaRecordsFromOldTables);
            }
            Iterator<WordMediaRecord> it3 = m11.iterator();
            while (it3.hasNext()) {
                hashSet.remove(it3.next().getWordid());
            }
        }
        for (String str : hashSet) {
            if (wordsWithoutFm != null && !wordsWithoutFm.contains(Integer.valueOf(str))) {
                arrayList.add(Integer.valueOf(str));
            }
        }
        try {
            if (!arrayList.isEmpty() && rb.d.f(context) && fromsrv) {
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                int size = arrayList.size() % 50 == 0 ? arrayList.size() / 50 : (arrayList.size() + 50) / 50;
                while (i11 < size) {
                    ArrayList arrayList3 = new ArrayList(50);
                    i11++;
                    int min = Math.min(arrayList.size(), i11 * 50);
                    for (int i12 = i11 * 50; i12 < min; i12++) {
                        arrayList3.add((Integer) arrayList.get(i12));
                    }
                    arrayList2.addAll(client.get_media_by_topic_ids(arrayList3));
                }
                List<WordMediaRecord> fromList = WordMediaRecord.fromList(arrayList2);
                o.r(context, bookid, fromList);
                for (WordMediaRecord wordMediaRecord : fromList) {
                    if (wordMediaRecord.getFmupdate() > 0 && !TextUtils.isEmpty(wordMediaRecord.getFmpath()) && !TextUtils.isEmpty(wordMediaRecord.getHighfmpath())) {
                        m11.add(wordMediaRecord);
                    }
                }
            }
        } catch (Exception e11) {
            qb.c.c(TAG, "get fm list failed.", e11);
            if (m11.isEmpty()) {
                throw e11;
            }
        }
        FmList fmList = new FmList();
        ArrayList arrayList4 = new ArrayList(m11.size());
        for (String str2 : wordids) {
            Iterator<WordMediaRecord> it4 = m11.iterator();
            while (it4.hasNext()) {
                if (TextUtils.equals(it4.next().getWordid(), str2)) {
                    arrayList4.add(str2);
                }
            }
        }
        fmList.injectSequenceIds(arrayList4);
        fmList.injectWordMediaRecords(m11);
        if (fromsrv) {
            fmList.injectLearnRecords(WordInfoRecordHelper.getTopicLearnRecords(context, bookid, wordids));
        }
        fmList.adapt();
        return fmList;
    }
}

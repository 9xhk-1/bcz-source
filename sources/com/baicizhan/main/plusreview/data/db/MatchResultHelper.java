package com.baicizhan.main.plusreview.data.db;

import android.content.ContentValues;
import android.content.Context;
import com.baicizhan.client.business.dataset.provider.a;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import k9.d;
import pn.j;
import qb.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class MatchResultHelper {
    public static void clearResults(Context context, int bookId) {
        try {
            createTableIfNotExists(context, bookId);
            context.getContentResolver().delete(a.g.a(bookId), null, null);
        } catch (Exception e11) {
            c.c("", "clear match test results failed.", e11);
        }
    }

    private static void createTableIfNotExists(Context context, int bookId) {
        if (i9.c.k(context, a.c.f16130e, a.g.b(bookId))) {
            return;
        }
        d.b(a.c.f16130e).a("CREATE TABLE IF NOT EXISTS " + a.g.b(bookId) + j.f81006c + "word_topic_id INTEGER, result INTEGER)", new String[0]).c(context);
    }

    public static Map<Integer, MatchResultRecord> getResults(Context context, int bookId) {
        createTableIfNotExists(context, bookId);
        List<MatchResultRecord> n11 = k9.a.n(k9.c.i(a.g.a(bookId)).d(context), MatchResultRecord.class, MatchResultRecord.COLUMN_MAP);
        if (n11 == null || n11.isEmpty()) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (MatchResultRecord matchResultRecord : n11) {
            hashMap.put(Integer.valueOf(matchResultRecord.getTopicId()), matchResultRecord);
        }
        return hashMap;
    }

    public static void refreshResults(Context context, int bookId, List<MatchResultRecord> records) {
        if (records == null || records.isEmpty()) {
            return;
        }
        createTableIfNotExists(context, bookId);
        clearResults(context, bookId);
        ContentValues[] contentValuesArr = new ContentValues[records.size()];
        int i11 = 0;
        for (MatchResultRecord matchResultRecord : records) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("word_topic_id", Integer.valueOf(matchResultRecord.getTopicId()));
            contentValues.put("result", Integer.valueOf(matchResultRecord.getResult()));
            contentValuesArr[i11] = contentValues;
            i11++;
        }
        try {
            context.getContentResolver().bulkInsert(a.g.a(bookId), contentValuesArr);
        } catch (Exception e11) {
            c.c("", "refresh match test results error. ", e11);
        }
    }
}

package com.baicizhan.client.fm.data.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import com.baicizhan.client.business.dataset.models.TopicLearnRecord;
import com.baicizhan.client.business.dataset.provider.a;
import com.baicizhan.client.fm.data.FmData;
import com.baicizhan.client.fm.data.FmList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import k9.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class WordInfoRecordHelper {
    public static void clearTopicViewedTags(Context context, int bookid) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(a.j.C0251a.f16216l, (Integer) 0);
        contentValues.put(a.j.C0251a.f16214j, (Integer) 0);
        context.getContentResolver().update(a.j.a(bookid), contentValues, null, null);
    }

    public static List<TopicLearnRecord> getTopicLearnRecords(Context context, int bookid, Collection<String> wordids) {
        if (wordids == null || wordids.isEmpty()) {
            return null;
        }
        return k9.a.n(c.i(a.j.a(bookid)).n("topic_id", wordids, 900).d(context), TopicLearnRecord.class, TopicLearnRecord.MEDIA_SYNC_COLUMN_MAP);
    }

    public static List<TopicLearnRecord> getTopicLearntRecords(Context context, int bookid) {
        return k9.a.n(c.i(a.j.a(bookid)).m("radio_state>? or radio_skip_state=? or radio_skip_state=?", "0", "1", "3").d(context), TopicLearnRecord.class, TopicLearnRecord.MEDIA_SYNC_COLUMN_MAP);
    }

    public static List<WordInfoRecord> getWordInfoRecords(Context context, Set<String> wordids) {
        Cursor d11;
        if (wordids == null || wordids.isEmpty() || (d11 = c.i(a.m.f16241b).n("topic_id", wordids, 900).d(context)) == null) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList(wordids.size());
            while (d11.moveToNext()) {
                String string = d11.getString(d11.getColumnIndex("topic_id"));
                WordInfoRecord wordInfoRecord = new WordInfoRecord();
                wordInfoRecord.wordid = string;
                wordInfoRecord.word = d11.getString(d11.getColumnIndex("topic_word"));
                wordInfoRecord.accent = d11.getString(d11.getColumnIndex(a.m.C0254a.f16257p));
                wordInfoRecord.cnmean = d11.getString(d11.getColumnIndex(a.m.C0254a.f16247f));
                wordInfoRecord.example = d11.getString(d11.getColumnIndex(a.m.C0254a.f16248g));
                arrayList.add(wordInfoRecord);
            }
            return arrayList;
        } finally {
            d11.close();
        }
    }

    public static void updateFmLearnRecords(Context context, int bookid, FmList datas) {
        if (datas == null || datas.isEmpty()) {
            return;
        }
        int size = datas.size();
        for (int i11 = 0; i11 < size; i11++) {
            FmData fmData = datas.get(i11);
            FmData initedOne = fmData.getInitedOne();
            if (initedOne == null) {
                qb.c.d("", "update fm learn records error, inited one is null, data is [%s]", fmData.toString());
            } else if (fmData.isSkipped() != initedOne.isSkipped() || fmData.getViewedCount() != initedOne.getViewedCount()) {
                ContentValues contentValues = new ContentValues();
                contentValues.put(a.j.C0251a.f16216l, Integer.valueOf(fmData.getSkipValue()));
                contentValues.put(a.j.C0251a.f16214j, Integer.valueOf(fmData.getViewedCount()));
                if (context.getContentResolver().update(a.j.a(bookid), contentValues, "topic_id=?", new String[]{fmData.getWordid()}) <= 0) {
                    qb.c.d("", "update fm learn records failed for unknown reason.", new Object[0]);
                }
            }
        }
    }
}

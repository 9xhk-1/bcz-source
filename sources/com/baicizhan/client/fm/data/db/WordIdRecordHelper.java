package com.baicizhan.client.fm.data.db;

import android.content.Context;
import android.database.Cursor;
import com.baicizhan.client.business.dataset.models.RoadmapRecord;
import com.baicizhan.client.business.dataset.models.WordMediaRecord;
import com.baicizhan.client.business.dataset.provider.a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import k9.c;
import q9.x;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class WordIdRecordHelper {
    public static List<WordMediaRecord> getFmRecords(Context context, int bookid) {
        Set<Integer> keySet;
        Map<Integer, RoadmapRecord> n11 = x.r().n();
        if (n11 == null || (keySet = n11.keySet()) == null) {
            return null;
        }
        HashSet hashSet = new HashSet(keySet.size());
        Iterator<Integer> it = keySet.iterator();
        while (it.hasNext()) {
            hashSet.add(Integer.toString(it.next().intValue()));
        }
        Cursor d11 = c.i(a.v.a(bookid)).m("fm_updated_at<>0 AND " + a.v.C0263a.f16321g + " <> '' AND " + a.v.C0263a.f16321g + " IS NOT NULL AND " + a.v.C0263a.f16320f + " <> '' AND " + a.v.C0263a.f16320f + " IS NOT NULL", new String[0]).d(context);
        if (d11 == null) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            while (d11.moveToNext()) {
                String string = d11.getString(d11.getColumnIndex("topic_id"));
                if (hashSet.contains(string)) {
                    String string2 = d11.getString(d11.getColumnIndex(a.v.C0263a.f16320f));
                    String string3 = d11.getString(d11.getColumnIndex(a.v.C0263a.f16321g));
                    String string4 = d11.getString(d11.getColumnIndex(a.v.C0263a.f16322h));
                    long j11 = d11.getLong(d11.getColumnIndex("fm_updated_at"));
                    long j12 = d11.getLong(d11.getColumnIndex("tv_updated_at"));
                    WordMediaRecord wordMediaRecord = new WordMediaRecord();
                    wordMediaRecord.setWordid(string);
                    wordMediaRecord.setHighfmpath(string2);
                    wordMediaRecord.setFmpath(string3);
                    wordMediaRecord.setTvpath(string4);
                    wordMediaRecord.setFmupdate(j11);
                    wordMediaRecord.setTvupdate(j12);
                    arrayList.add(wordMediaRecord);
                }
            }
            return arrayList;
        } finally {
            d11.close();
        }
    }
}

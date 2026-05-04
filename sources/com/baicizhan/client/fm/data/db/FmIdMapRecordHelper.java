package com.baicizhan.client.fm.data.db;

import android.content.Context;
import android.database.Cursor;
import com.baicizhan.client.business.dataset.provider.a;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import k9.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class FmIdMapRecordHelper {
    public static List<FmIdMapRecord> getFmIdMapRecords(Context context, int bookid, Set<String> wordids) {
        Cursor d11;
        if (wordids == null || wordids.isEmpty() || (d11 = c.i(a.C0239a.a(bookid)).d(context)) == null) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList(wordids.size());
            while (d11.moveToNext()) {
                String string = d11.getString(d11.getColumnIndex("topic_id"));
                if (wordids.contains(string)) {
                    FmIdMapRecord fmIdMapRecord = new FmIdMapRecord();
                    fmIdMapRecord.wordid = string;
                    fmIdMapRecord.fmid = d11.getString(d11.getColumnIndex(a.C0239a.C0240a.f16096d));
                    arrayList.add(fmIdMapRecord);
                }
            }
            return arrayList;
        } finally {
            d11.close();
        }
    }
}

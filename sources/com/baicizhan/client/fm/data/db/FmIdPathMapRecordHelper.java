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
public class FmIdPathMapRecordHelper {
    public static List<FmIdPathMapRecord> getFmIdPathMapRecords(Context context, Set<String> fmids) {
        Cursor d11;
        if (fmids == null || fmids.isEmpty() || (d11 = c.i(a.o.f16268b).d(context)) == null) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList(fmids.size());
            while (d11.moveToNext()) {
                String string = d11.getString(d11.getColumnIndex("ws_id"));
                if (fmids.contains(string)) {
                    FmIdPathMapRecord fmIdPathMapRecord = new FmIdPathMapRecord();
                    fmIdPathMapRecord.fmid = string;
                    fmIdPathMapRecord.path = d11.getString(d11.getColumnIndex("ws_audio"));
                    fmIdPathMapRecord.hdpath = d11.getString(d11.getColumnIndex(a.o.C0256a.f16277i));
                    arrayList.add(fmIdPathMapRecord);
                }
            }
            return arrayList;
        } finally {
            d11.close();
        }
    }
}

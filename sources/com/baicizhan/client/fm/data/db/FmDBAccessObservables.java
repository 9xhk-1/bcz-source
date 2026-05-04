package com.baicizhan.client.fm.data.db;

import android.content.Context;
import com.baicizhan.client.business.dataset.models.WordMediaRecord;
import com.baicizhan.client.business.util.PathUtil;
import com.baicizhan.client.fm.data.FmList;
import gb.d;
import i9.o;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import rx.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class FmDBAccessObservables {
    private FmDBAccessObservables() {
    }

    public static c<List<String>> getFmBorders(final Context context) {
        return c.z2(new Callable<List<String>>() { // from class: com.baicizhan.client.fm.data.db.FmDBAccessObservables.1
            @Override // java.util.concurrent.Callable
            public List<String> call() throws Exception {
                String g11 = o.g(context, 2);
                String g12 = o.g(context, 3);
                ArrayList arrayList = new ArrayList(2);
                arrayList.add(g11);
                arrayList.add(g12);
                return arrayList;
            }
        }).w5(bc0.c.e());
    }

    public static c<List<WordMediaRecord>> getUnDownloadedMedias(final List<WordMediaRecord> allmedias) {
        return c.z2(new Callable<List<WordMediaRecord>>() { // from class: com.baicizhan.client.fm.data.db.FmDBAccessObservables.3
            @Override // java.util.concurrent.Callable
            public List<WordMediaRecord> call() throws Exception {
                String baicizhanAppRoot = PathUtil.getBaicizhanAppRoot();
                if (allmedias == null) {
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                for (WordMediaRecord wordMediaRecord : allmedias) {
                    File file = new File(d.c(baicizhanAppRoot + wordMediaRecord.getFmpath()));
                    File file2 = new File(d.c(baicizhanAppRoot + wordMediaRecord.getHighfmpath()));
                    if (!file.exists() && !file2.exists()) {
                        arrayList.add(wordMediaRecord);
                    }
                }
                return arrayList;
            }
        }).w5(bc0.c.e());
    }

    public static c<Boolean> updateFmLearnRecords(final Context context, final int bookId, final FmList updateList) {
        return c.z2(new Callable<Boolean>() { // from class: com.baicizhan.client.fm.data.db.FmDBAccessObservables.2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Boolean call() throws Exception {
                WordInfoRecordHelper.updateFmLearnRecords(context, bookId, updateList);
                return Boolean.TRUE;
            }
        }).w5(bc0.c.e());
    }
}

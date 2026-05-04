package com.baicizhan.client.business.dataset.models.lookup;

import android.text.TextUtils;
import com.baicizhan.client.business.dataset.provider.a;
import com.baicizhan.client.business.util.JsonSerializer;
import java.util.Comparator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class DictionaryMapRecord {
    public static final Comparator<DictionaryMapRecord> ASC_CMP;
    public static Map<String, String> COLUMN_MAP;
    public int[] bookIdArray;
    public String bookIds;
    public int selectBookId;
    public int topicId;

    static {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        COLUMN_MAP = concurrentHashMap;
        concurrentHashMap.put("topicId", "topic_id");
        COLUMN_MAP.put("bookIds", a.f.C0247a.f16190b);
        ASC_CMP = new Comparator<DictionaryMapRecord>() { // from class: com.baicizhan.client.business.dataset.models.lookup.DictionaryMapRecord.1
            @Override // java.util.Comparator
            public int compare(DictionaryMapRecord lhs, DictionaryMapRecord rhs) {
                return lhs.topicId - rhs.topicId;
            }
        };
    }

    public int[] getBookIds() {
        int[] iArr = this.bookIdArray;
        if (iArr != null) {
            return iArr;
        }
        if (!TextUtils.isEmpty(this.bookIds)) {
            String[] split = this.bookIds.split(",");
            this.bookIdArray = new int[split.length];
            for (int i11 = 0; i11 < split.length; i11++) {
                this.bookIdArray[i11] = Integer.valueOf(split[i11]).intValue();
            }
        }
        return this.bookIdArray;
    }

    public String toString() {
        return new JsonSerializer(new bp.a<DictionaryMapRecord>() { // from class: com.baicizhan.client.business.dataset.models.lookup.DictionaryMapRecord.2
        }.getType()).writeToJson(this);
    }
}

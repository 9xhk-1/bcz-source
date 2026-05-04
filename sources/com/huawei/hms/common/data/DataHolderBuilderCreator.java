package com.huawei.hms.common.data;

import android.content.ContentValues;
import com.huawei.hms.common.data.DataHolder;
import java.util.HashMap;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
final class DataHolderBuilderCreator extends DataHolder.Builder {
    public DataHolderBuilderCreator(String[] strArr, String str) {
        super(strArr, (String) null, (DataHolderBuilderCreator) null);
    }

    @Override // com.huawei.hms.common.data.DataHolder.Builder
    public final DataHolder.Builder setDataForContentValuesHashMap(HashMap<String, Object> hashMap) {
        throw new UnsupportedOperationException("DataHolderBuilderCreator unsupported setDataForContentValuesHashMap");
    }

    @Override // com.huawei.hms.common.data.DataHolder.Builder
    public final DataHolder.Builder withRow(ContentValues contentValues) {
        throw new UnsupportedOperationException("DataHolderBuilderCreator unsupported withRow");
    }
}

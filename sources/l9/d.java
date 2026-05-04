package l9;

import com.baicizhan.client.business.dataset.models.WordMediaUpdRecord;
import com.baicizhan.online.resource_api.WordMediaUpdateInfo;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class d {
    public static List<WordMediaUpdRecord> a(List<WordMediaUpdateInfo> froms) {
        if (froms == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(froms.size());
        for (WordMediaUpdateInfo wordMediaUpdateInfo : froms) {
            WordMediaUpdRecord wordMediaUpdRecord = new WordMediaUpdRecord();
            wordMediaUpdRecord.setWordid(wordMediaUpdateInfo.topic_id + "");
            wordMediaUpdRecord.setFmupdate(wordMediaUpdateInfo.fm_updated_at);
            wordMediaUpdRecord.setTvupdate(wordMediaUpdateInfo.tv_updated_at);
            arrayList.add(wordMediaUpdRecord);
        }
        return arrayList;
    }
}

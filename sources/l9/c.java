package l9;

import com.baicizhan.client.business.dataset.models.TopicLearnRecord;
import com.baicizhan.online.bs_users.BBUserWordMedia;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class c {
    public static List<BBUserWordMedia> a(List<TopicLearnRecord> tos) {
        if (tos == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(tos.size());
        for (TopicLearnRecord topicLearnRecord : tos) {
            BBUserWordMedia bBUserWordMedia = new BBUserWordMedia();
            bBUserWordMedia.topic_id = topicLearnRecord.topicId;
            bBUserWordMedia.fm_view_times = topicLearnRecord.radioState;
            bBUserWordMedia.is_fm_skip = TopicLearnRecord.isFmSkipped(topicLearnRecord.radioSkipState);
            arrayList.add(bBUserWordMedia);
        }
        return arrayList;
    }
}

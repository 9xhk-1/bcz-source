package gi;

import com.baicizhan.client.business.dataset.models.TopicLearnRecord;
import com.baicizhan.client.business.dataset.models.WordClozeRecord;
import com.baicizhan.client.business.managers.LearnRecordManager;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class m {
    public static int a(int probType, int defaultValue) {
        Map<Integer, TopicLearnRecord> L = LearnRecordManager.A().L();
        int i11 = 0;
        if (22 != probType && 21 != probType) {
            Iterator<TopicLearnRecord> it = L.values().iterator();
            while (it.hasNext() && (it.next().isKilled() || (i11 = i11 + 1) < defaultValue)) {
            }
            return i11;
        }
        Map<Integer, WordClozeRecord> I = q9.x.r().I();
        for (TopicLearnRecord topicLearnRecord : L.values()) {
            if (I.get(Integer.valueOf(topicLearnRecord.topicId)) != null && !topicLearnRecord.isKilled() && (i11 = i11 + 1) >= defaultValue) {
                break;
            }
        }
        return i11;
    }

    public static int b(int probType) {
        return (22 == probType || 4 == probType) ? 20 : 50;
    }
}

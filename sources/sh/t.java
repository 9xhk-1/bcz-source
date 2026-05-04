package sh;

import android.text.TextUtils;
import com.baicizhan.client.business.dataset.models.TopicLearnRecord;
import com.baicizhan.client.business.dataset.models.TopicRecord;
import com.baicizhan.client.business.dataset.models.UpdateZpkMd5;
import com.baicizhan.client.business.managers.LearnRecordManager;
import com.baicizhan.client.business.util.Md5Utils;
import com.baicizhan.client.business.util.ZPackUtils;
import java.io.File;
import q9.x;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class t {

    /* renamed from: a, reason: collision with root package name */
    public static final String f88689a = "TopicResourceChecker";

    public static boolean a(TopicRecord topicRecord) {
        if (topicRecord == null) {
            return false;
        }
        UpdateZpkMd5 F = x.r().F(topicRecord.topicId);
        return F == null || F.updateZpkversion <= topicRecord.zpkVersion;
    }

    public static boolean b(TopicRecord topicRecord) {
        File zpkFile;
        if (topicRecord == null || (zpkFile = ZPackUtils.getZpkFile(topicRecord)) == null || !ZPackUtils.isZpkExists(topicRecord)) {
            return false;
        }
        String fileMD5 = Md5Utils.getFileMD5(zpkFile);
        if (fileMD5.toLowerCase().endsWith(topicRecord.updateFlagMD5.toLowerCase())) {
            return true;
        }
        qb.c.d(f88689a, "zpk %s , md5 %s, md5 %s", Integer.valueOf(topicRecord.topicId), topicRecord.updateFlagMD5, fileMD5);
        return false;
    }

    public static boolean c(TopicRecord topicRecord) {
        if (topicRecord == null) {
            return false;
        }
        UpdateZpkMd5 F = x.r().F(topicRecord.topicId);
        return F == null || TextUtils.isEmpty(F.updateFlagMD5) || TextUtils.isEmpty(topicRecord.updateFlagMD5) || TextUtils.equals(topicRecord.updateFlagMD5, F.updateFlagMD5);
    }

    public static void d(int clozeState, int topicId, int coverage) {
        int l11 = x.r().l();
        yc.b w11 = x.r().w(topicId);
        if (w11 == null) {
            qb.c.q(f88689a, "resetClozeMode proxy null", new Object[0]);
            return;
        }
        if (l11 != 5) {
            w11.a0();
        } else if (clozeState == -1 || (coverage & 1) == 0) {
            w11.a0();
        } else {
            TopicLearnRecord J = LearnRecordManager.A().J(topicId);
            w11.b0(J != null ? J.extra.f16074ss : 0);
        }
    }
}

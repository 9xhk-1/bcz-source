package zi;

import android.text.TextUtils;
import com.baicizhan.client.business.dataset.models.TopicRecord;
import com.baicizhan.main.wikiv2.study.model.f;
import com.baicizhan.main.wikiv2.study.model.g;
import com.baicizhan.main.wikiv2.study.model.h;
import com.baicizhan.online.resource_api.TopicResourceV2;
import com.baicizhan.online.resource_api.WordMedia;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class a {
    @l
    public static final com.baicizhan.main.wikiv2.study.model.a a(@k TopicRecord topicRecord) {
        g0.p(topicRecord, "<this>");
        if (TextUtils.isEmpty(topicRecord.wordMeanEn)) {
            return null;
        }
        String wordMeanEn = topicRecord.wordMeanEn;
        g0.o(wordMeanEn, "wordMeanEn");
        String word = topicRecord.word;
        g0.o(word, "word");
        return new com.baicizhan.main.wikiv2.study.model.a(wordMeanEn, word);
    }

    @k
    public static final com.baicizhan.main.wikiv2.study.model.c b(@k TopicRecord topicRecord) {
        g0.p(topicRecord, "<this>");
        return new com.baicizhan.main.wikiv2.study.model.c(topicRecord);
    }

    @k
    public static final com.baicizhan.main.wikiv2.study.model.d c(@k TopicRecord topicRecord) {
        g0.p(topicRecord, "<this>");
        return new com.baicizhan.main.wikiv2.study.model.d(topicRecord);
    }

    @l
    public static final f d(@k TopicRecord topicRecord) {
        g0.p(topicRecord, "<this>");
        if (TextUtils.isEmpty(topicRecord.deformationImagePath)) {
            return null;
        }
        return new f(topicRecord);
    }

    @l
    public static final g e(@k TopicRecord topicRecord) {
        g0.p(topicRecord, "<this>");
        String str = topicRecord.wordEtyma;
        if (str == null || str.length() == 0) {
            return null;
        }
        return new g(str);
    }

    @l
    public static final h f(@l TopicResourceV2 topicResourceV2) {
        WordMedia wordMedia;
        h hVar = null;
        if (topicResourceV2 != null && (wordMedia = topicResourceV2.media) != null && !TextUtils.isEmpty(wordMedia.tv_path)) {
            String d11 = m9.c.d(wordMedia.tv_path);
            g0.o(d11, "getResourceUrl(...)");
            String d12 = !TextUtils.isEmpty(wordMedia.tv_snapshot_path) ? m9.c.d(wordMedia.tv_snapshot_path) : "";
            g0.m(d12);
            hVar = new h(d11, d12);
        }
        return hVar;
    }
}

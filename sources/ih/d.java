package ih;

import android.content.res.AssetManager;
import android.text.TextUtils;
import com.baicizhan.main.phrasetraining.data.bean.Phrase;
import com.baicizhan.main.phrasetraining.data.bean.TopicPatterns;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class d {

    /* renamed from: f, reason: collision with root package name */
    public static final int f60549f = 0;

    /* renamed from: g, reason: collision with root package name */
    public static final int f60550g = -1;

    /* renamed from: h, reason: collision with root package name */
    public static final int f60551h = -2;

    /* renamed from: i, reason: collision with root package name */
    public static final int f60552i = -3;

    /* renamed from: j, reason: collision with root package name */
    public static final int f60553j = -4;

    /* renamed from: k, reason: collision with root package name */
    public static final float f60554k = 0.15f;

    /* renamed from: a, reason: collision with root package name */
    public AssetManager f60555a;

    /* renamed from: b, reason: collision with root package name */
    public List<TopicPatterns> f60556b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public List<Map<Integer, Phrase>> f60557c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public a f60558d;

    /* renamed from: e, reason: collision with root package name */
    public List<Integer> f60559e;

    public boolean a() {
        List<Integer> list;
        if (this.f60555a == null || (list = this.f60559e) == null || list.isEmpty()) {
            return false;
        }
        List<TopicPatterns> topicPatterns = TopicPatterns.getTopicPatterns(this.f60555a);
        List<Phrase> prasesList = Phrase.getPrasesList(this.f60555a);
        Iterator<Integer> it = this.f60559e.iterator();
        while (it.hasNext()) {
            int intValue = it.next().intValue();
            for (TopicPatterns topicPatterns2 : topicPatterns) {
                if (topicPatterns2 != null && intValue == topicPatterns2.getGroupId()) {
                    this.f60556b.add(topicPatterns2);
                    HashSet hashSet = new HashSet();
                    for (TopicPatterns.Topic topic : topicPatterns2.getArrTopics()) {
                        hashSet.add(Integer.valueOf(topic.getTopicId()));
                        String groupedTopicIds = topic.getGroupedTopicIds();
                        if (!TextUtils.isEmpty(groupedTopicIds)) {
                            for (String str : groupedTopicIds.split(",")) {
                                hashSet.add(Integer.valueOf(str));
                            }
                        }
                    }
                    HashMap hashMap = new HashMap(prasesList.size());
                    for (Phrase phrase : prasesList) {
                        if (phrase != null && hashSet.contains(Integer.valueOf(phrase.getTopicId()))) {
                            hashMap.put(Integer.valueOf(phrase.getTopicId()), phrase);
                        }
                    }
                    this.f60557c.add(hashMap);
                }
            }
        }
        return true;
    }
}

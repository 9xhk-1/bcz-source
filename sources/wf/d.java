package wf;

import androidx.annotation.NonNull;
import com.baicizhan.client.business.dataset.models.TopicRecord;
import com.baicizhan.client.business.dataset.models.lookup.DictionaryRecord;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class d {

    /* renamed from: d, reason: collision with root package name */
    public static final int f96203d = 4;

    /* renamed from: e, reason: collision with root package name */
    public static final int f96204e = 3;

    /* renamed from: a, reason: collision with root package name */
    public m f96205a;

    /* renamed from: b, reason: collision with root package name */
    public TopicRecord f96206b;

    /* renamed from: c, reason: collision with root package name */
    public List<TopicRecord> f96207c = new ArrayList(4);

    public void a(@NonNull TopicRecord record) {
        this.f96206b = record;
        this.f96207c.add(record);
        Collections.shuffle(this.f96207c);
    }

    public int b() {
        m mVar = this.f96205a;
        if (mVar == null) {
            return 0;
        }
        return mVar.a();
    }

    public List<TopicRecord> c() {
        return this.f96207c;
    }

    public m d() {
        return this.f96205a;
    }

    public TopicRecord e() {
        return this.f96206b;
    }

    public int f() {
        List<TopicRecord> list;
        if (this.f96206b == null || (list = this.f96207c) == null || list.isEmpty()) {
            return -1;
        }
        for (int i11 = 0; i11 < this.f96207c.size(); i11++) {
            TopicRecord topicRecord = this.f96207c.get(i11);
            TopicRecord topicRecord2 = this.f96206b;
            if (topicRecord == topicRecord2 || topicRecord.topicId == topicRecord2.topicId) {
                return i11;
            }
        }
        return -1;
    }

    public int g() {
        m mVar = this.f96205a;
        if (mVar == null) {
            return 0;
        }
        return mVar.f();
    }

    public void h(@NonNull DictionaryRecord... options) {
        if (options.length != 3) {
            throw new IllegalArgumentException("collect wrong options size illegal: " + options.length + "; need: 3");
        }
        for (DictionaryRecord dictionaryRecord : options) {
            TopicRecord topicRecord = new TopicRecord();
            topicRecord.topicId = dictionaryRecord.topicId;
            topicRecord.word = dictionaryRecord.word;
            topicRecord.wordMean = dictionaryRecord.meanCn;
            topicRecord.phonetic = dictionaryRecord.accent;
            this.f96207c.add(topicRecord);
        }
        Collections.shuffle(this.f96207c);
    }

    public boolean i() {
        List<TopicRecord> list;
        if (this.f96205a == null || this.f96206b == null || (list = this.f96207c) == null || list.size() != 4) {
            return false;
        }
        int g11 = g();
        TopicRecord topicRecord = this.f96206b;
        return g11 == topicRecord.topicId && this.f96207c.contains(topicRecord);
    }

    public void j(m primaryBrief) {
        this.f96205a = primaryBrief;
    }

    public String toString() {
        String str = "TopicAsset{bookId=" + b() + ",topicId=" + g() + ",options=[ ";
        for (TopicRecord topicRecord : this.f96207c) {
            if (topicRecord != null) {
                str = str + topicRecord.topicId + " ";
            }
        }
        return str + "]}";
    }
}

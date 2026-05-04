package wf;

import com.baicizhan.client.business.dataset.models.TopicRecord;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    public int f96235a;

    /* renamed from: b, reason: collision with root package name */
    public int f96236b;

    /* renamed from: c, reason: collision with root package name */
    public String f96237c;

    /* renamed from: d, reason: collision with root package name */
    public String f96238d;

    /* renamed from: e, reason: collision with root package name */
    public String f96239e;

    /* renamed from: f, reason: collision with root package name */
    public String f96240f;

    /* renamed from: g, reason: collision with root package name */
    public int f96241g;

    /* renamed from: h, reason: collision with root package name */
    public long f96242h;

    public static TopicRecord q(m topicBrief) {
        TopicRecord topicRecord = new TopicRecord();
        topicRecord.bookId = topicBrief.f96236b;
        topicRecord.topicId = topicBrief.f96235a;
        topicRecord.wordMean = topicBrief.f96238d;
        topicRecord.word = topicBrief.f96237c;
        topicRecord.phonetic = topicBrief.f96240f;
        topicRecord.wordAudio = topicBrief.f96239e;
        return topicRecord;
    }

    public int a() {
        return this.f96236b;
    }

    public long b() {
        return this.f96242h;
    }

    public String c() {
        return this.f96238d;
    }

    public String d() {
        return this.f96240f;
    }

    public int e() {
        return this.f96241g;
    }

    public int f() {
        return this.f96235a;
    }

    public String g() {
        return this.f96237c;
    }

    public String h() {
        return this.f96239e;
    }

    public void i(int bookId) {
        this.f96236b = bookId;
    }

    public void j(long createAt) {
        this.f96242h = createAt;
    }

    public void k(String mean) {
        this.f96238d = mean;
    }

    public void l(String phonetic) {
        this.f96240f = phonetic;
    }

    public void m(int score) {
        this.f96241g = score;
    }

    public void n(int topicId) {
        this.f96235a = topicId;
    }

    public void o(String word) {
        this.f96237c = word;
    }

    public void p(String wordAudio) {
        this.f96239e = wordAudio;
    }
}

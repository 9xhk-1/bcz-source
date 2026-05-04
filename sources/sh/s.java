package sh;

import com.baicizhan.client.business.dataset.models.TopicRecord;
import com.baicizhan.client.business.util.Md5Utils;
import com.baicizhan.client.business.util.TopicIdMapingUtils;
import com.baicizhan.client.business.util.ZPackUtils;
import com.baicizhan.online.resource_api.ResourceService;
import com.baicizhan.online.resource_api.ZpkInfo;
import java.io.File;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class s extends m9.a {

    /* renamed from: k, reason: collision with root package name */
    public static final String f88677k = "TopicDownloadTask";

    /* renamed from: m, reason: collision with root package name */
    public static final int f88679m = 1;

    /* renamed from: e, reason: collision with root package name */
    public int f88683e;

    /* renamed from: f, reason: collision with root package name */
    public int f88684f;

    /* renamed from: g, reason: collision with root package name */
    public ZpkInfo f88685g;

    /* renamed from: l, reason: collision with root package name */
    public static AtomicInteger f88678l = new AtomicInteger(0);

    /* renamed from: n, reason: collision with root package name */
    public static final AtomicInteger f88680n = new AtomicInteger(0);

    /* renamed from: o, reason: collision with root package name */
    public static final AtomicBoolean f88681o = new AtomicBoolean(false);

    /* renamed from: d, reason: collision with root package name */
    public boolean f88682d = false;

    /* renamed from: h, reason: collision with root package name */
    public TopicRecord f88686h = null;

    /* renamed from: i, reason: collision with root package name */
    public TopicRecord f88687i = null;

    /* renamed from: j, reason: collision with root package name */
    public Exception f88688j = null;

    public s(int bookId, int topicId) {
        this.f88683e = bookId;
        this.f88684f = topicId;
    }

    public static void l() {
        f88680n.set(0);
        f88681o.set(false);
    }

    @Override // m9.a
    public Object a() {
        return Integer.valueOf(this.f88684f);
    }

    @Override // m9.a
    public void d() {
        com.baicizhan.client.business.thrift.k i11;
        TopicRecord topicRecord = this.f88686h;
        boolean z11 = topicRecord != null && t.b(topicRecord);
        TopicRecord topicRecord2 = this.f88686h;
        boolean z12 = topicRecord2 != null && t.c(topicRecord2);
        try {
            if (z11) {
                if (!z12 && !f88681o.get() && rb.d.b(pb.a.a()) == 0) {
                    this.f72662a.f(5000);
                    this.f72662a.k(5000);
                    this.f72662a.j(1);
                }
                this.f88687i = this.f88686h;
                c();
                return;
            }
            this.f72662a.f(5000);
            this.f72662a.k(10000);
            this.f72662a.j(1);
            if (this.f88682d) {
                this.f72662a.i(f88678l.incrementAndGet());
            }
            if (this.f88685g == null) {
                ResourceService.Client client = (ResourceService.Client) com.baicizhan.client.business.thrift.c.b().c("/rpc/resource_api");
                if (z11 && (i11 = com.baicizhan.client.business.thrift.r.i(client)) != null) {
                    i11.j(1);
                    i11.setConnectTimeout(1000);
                    i11.setReadTimeout(2000);
                }
                this.f88685g = client.get_zpk_infos(Collections.singletonList(TopicIdMapingUtils.buildTopicKey(this.f88684f, this.f88683e))).get(0);
            }
            this.f88687i = f();
            i9.l.a(pb.a.a(), this.f88687i.bookId);
            TopicRecord topicRecord3 = this.f88686h;
            if (topicRecord3 != null) {
                topicRecord3.zpkName.equals(this.f88687i.zpkName);
            }
            i9.l.h(pb.a.a(), this.f88687i);
            i9.a.a(pb.a.a(), this.f88687i.bookId);
            c();
        } catch (Exception e11) {
            if (!z11) {
                qb.c.d(f88677k, e11.toString(), new Object[0]);
                this.f88688j = e11;
                b(e11);
                return;
            }
            int incrementAndGet = f88680n.incrementAndGet();
            qb.c.o(f88677k, "update failed count " + incrementAndGet + ", use old ", new Object[0]);
            if (incrementAndGet >= 1) {
                qb.c.q(f88677k, "setSkipTopicUpdate true", new Object[0]);
                f88681o.set(true);
            }
            this.f88687i = this.f88686h;
            c();
        }
    }

    public final TopicRecord f() throws Exception {
        String zpk_uri = this.f88685g.getZpk_uri();
        File zpkFileByName = ZPackUtils.getZpkFileByName(this.f88683e, zpk_uri);
        if (zpkFileByName == null) {
            throw new RuntimeException("zpk path null: " + this.f88685g.getZpk_uri());
        }
        File a11 = this.f72662a.a(this.f88685g.getZpk_uri(), zpkFileByName.getPath());
        String fileMD5 = Md5Utils.getFileMD5(a11);
        if (!fileMD5.toLowerCase().endsWith(this.f88685g.zpk_md5.toLowerCase())) {
            ZpkInfo zpkInfo = this.f88685g;
            qb.c.d(f88677k, "zpk %s , md5 %s, md5 %s", zpkInfo.topic_key, zpkInfo.zpk_md5, fileMD5);
            throw new RuntimeException("check md5 failed");
        }
        TopicRecord readMeatTopicRecordByName = ZPackUtils.readMeatTopicRecordByName(this.f88683e, this.f88685g.getZpk_uri());
        if (readMeatTopicRecordByName != null) {
            readMeatTopicRecordByName.fillMetaProperties(this.f88683e, zpk_uri, this.f88685g.getZpk_md5(), this.f88685g.getZpk_version());
            return readMeatTopicRecordByName;
        }
        throw new RuntimeException("zpk meta null: " + a11.getAbsolutePath());
    }

    public int g() {
        return this.f88683e;
    }

    public Exception h() {
        return this.f88688j;
    }

    public TopicRecord i() {
        return this.f88687i;
    }

    public int j() {
        return this.f88684f;
    }

    public void k() {
        this.f88682d = true;
    }

    public void m(TopicRecord topicRecord) {
        this.f88686h = topicRecord;
    }

    public void n(ZpkInfo zpkInfo) {
        this.f88685g = zpkInfo;
    }

    public String toString() {
        return "TopicDownloadTask [bookId=" + this.f88683e + ", topicId=" + this.f88684f + "]";
    }
}

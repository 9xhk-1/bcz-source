package sh;

import android.content.Context;
import android.content.res.AssetManager;
import android.util.SparseArray;
import com.baicizhan.client.business.dataset.models.TopicRecord;
import com.baicizhan.client.business.util.FileUtils;
import com.baicizhan.client.business.util.ZPackUtils;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class a {

    /* renamed from: e, reason: collision with root package name */
    public static final String f88511e = "AssetTopicRecordManager";

    /* renamed from: f, reason: collision with root package name */
    public static volatile a f88512f = null;

    /* renamed from: g, reason: collision with root package name */
    public static final String f88513g = "topics";

    /* renamed from: h, reason: collision with root package name */
    public static final String f88514h = "assetbooks_";

    /* renamed from: b, reason: collision with root package name */
    public AssetManager f88516b;

    /* renamed from: d, reason: collision with root package name */
    public Map<String, String> f88518d;

    /* renamed from: a, reason: collision with root package name */
    public volatile boolean f88515a = false;

    /* renamed from: c, reason: collision with root package name */
    public SparseArray<SparseArray<String>> f88517c = new SparseArray<>();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: sh.a$a, reason: collision with other inner class name */
    public class C1156a extends bp.a<Map<String, String>> {
        public C1156a() {
        }
    }

    public static a b() {
        if (f88512f == null) {
            synchronized (a.class) {
                try {
                    if (f88512f == null) {
                        f88512f = new a();
                    }
                } finally {
                }
            }
        }
        return f88512f;
    }

    public boolean a(int bookId, int topicId) {
        SparseArray<String> sparseArray = this.f88517c.get(bookId);
        return (sparseArray == null || sparseArray.get(topicId) == null) ? false : true;
    }

    public void c(Context context) {
        if (this.f88515a) {
            return;
        }
        qb.c.b(f88511e, "init", new Object[0]);
        this.f88515a = true;
        this.f88516b = context.getAssets();
        try {
            d();
            qb.c.b(f88511e, "mAssetBooks", new Object[0]);
            String readAll = FileUtils.readAll(this.f88516b.open("zpk_file_md5"));
            com.google.gson.d dVar = new com.google.gson.d();
            Type type = new C1156a().getType();
            qb.c.b(f88511e, "read file", new Object[0]);
            this.f88518d = (Map) dVar.o(readAll, type);
            qb.c.b(f88511e, "gson", new Object[0]);
        } catch (Exception e11) {
            qb.c.c(f88511e, "", e11);
        }
    }

    public final void d() throws IOException {
        for (String str : this.f88516b.list("topics")) {
            try {
                ZPackUtils.ZpkNameInfo extractZpkNameInfo = ZPackUtils.extractZpkNameInfo(str);
                if (extractZpkNameInfo != null) {
                    SparseArray<String> sparseArray = this.f88517c.get(extractZpkNameInfo.bookId);
                    if (sparseArray == null) {
                        sparseArray = new SparseArray<>(32);
                        this.f88517c.put(extractZpkNameInfo.bookId, sparseArray);
                    }
                    sparseArray.put(extractZpkNameInfo.topicId, str);
                }
            } catch (Exception e11) {
                qb.c.c(f88511e, "", e11);
            }
        }
    }

    public TopicRecord e(int bookId, int topicId) {
        String str;
        BufferedInputStream bufferedInputStream;
        File zpkFileByName;
        TopicRecord readMeatTopicRecordByName;
        c(pb.a.a());
        SparseArray<String> sparseArray = this.f88517c.get(bookId);
        if (sparseArray == null || (str = sparseArray.get(topicId)) == null) {
            return null;
        }
        try {
            bufferedInputStream = new BufferedInputStream(this.f88516b.open(new File("topics", str).getPath()));
            zpkFileByName = ZPackUtils.getZpkFileByName(bookId, str);
        } catch (Exception e11) {
            qb.c.a(f88511e, "", e11);
        }
        if (zpkFileByName == null) {
            throw new Exception("localFile invalid " + str);
        }
        boolean copyToFile = FileUtils.copyToFile(bufferedInputStream, zpkFileByName);
        bufferedInputStream.close();
        if (copyToFile && (readMeatTopicRecordByName = ZPackUtils.readMeatTopicRecordByName(bookId, str)) != null) {
            readMeatTopicRecordByName.fillMetaProperties(bookId, str, this.f88518d.get(str), 0);
            i9.l.h(pb.a.a(), readMeatTopicRecordByName);
            return readMeatTopicRecordByName;
        }
        return null;
    }
}

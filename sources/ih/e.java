package ih;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.baicizhan.client.business.util.PathUtil;
import com.baicizhan.client.framework.asynctask.LAsyncTask;
import com.baicizhan.main.phrasetraining.data.bean.Phrase;
import com.baicizhan.main.phrasetraining.data.bean.TopicPatterns;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class e {

    /* renamed from: e, reason: collision with root package name */
    public static final String f60560e = "PhraseDownloader";

    /* renamed from: f, reason: collision with root package name */
    public static int f60561f = 0;

    /* renamed from: g, reason: collision with root package name */
    public static int f60562g = 1;

    /* renamed from: h, reason: collision with root package name */
    public static final int f60563h = 0;

    /* renamed from: i, reason: collision with root package name */
    public static final int f60564i = 1;

    /* renamed from: j, reason: collision with root package name */
    public static final int f60565j = 2;

    /* renamed from: k, reason: collision with root package name */
    public static final int f60566k = 3;

    /* renamed from: l, reason: collision with root package name */
    public static final int f60567l = 4;

    /* renamed from: a, reason: collision with root package name */
    public ih.d f60568a;

    /* renamed from: d, reason: collision with root package name */
    public a f60571d;

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f60570c = true;

    /* renamed from: b, reason: collision with root package name */
    public c f60569b = new c(this);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends LAsyncTask<Integer, Integer, b> {
        public a() {
            N(xb.f.o((e.this.f60568a.f60558d != null ? e.this.f60568a.f60558d.getClass() : e.class).getName()));
            A(1);
        }

        /* JADX WARN: Code restructure failed: missing block: B:47:0x01de, code lost:
        
            r1.f60578f = (r7 * 100) / r3;
            r1.f60579g = r7 * r5;
            r1.f60580h = r4;
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x01e9, code lost:
        
            return r1;
         */
        /* JADX WARN: Removed duplicated region for block: B:14:0x00a0 A[Catch: all -> 0x005c, TryCatch #0 {all -> 0x005c, blocks: (B:3:0x0009, B:5:0x0025, B:7:0x0033, B:9:0x0041, B:12:0x0090, B:14:0x00a0, B:18:0x00c6, B:16:0x00e6, B:22:0x00f1, B:23:0x010b, B:25:0x0111, B:27:0x0124, B:53:0x012e, B:30:0x0131, B:50:0x0139, B:32:0x014c, B:46:0x0152, B:34:0x015f, B:37:0x0171, B:43:0x01a0, B:39:0x01ca, B:47:0x01de, B:57:0x005f, B:59:0x006b), top: B:2:0x0009 }] */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0111 A[Catch: all -> 0x005c, TryCatch #0 {all -> 0x005c, blocks: (B:3:0x0009, B:5:0x0025, B:7:0x0033, B:9:0x0041, B:12:0x0090, B:14:0x00a0, B:18:0x00c6, B:16:0x00e6, B:22:0x00f1, B:23:0x010b, B:25:0x0111, B:27:0x0124, B:53:0x012e, B:30:0x0131, B:50:0x0139, B:32:0x014c, B:46:0x0152, B:34:0x015f, B:37:0x0171, B:43:0x01a0, B:39:0x01ca, B:47:0x01de, B:57:0x005f, B:59:0x006b), top: B:2:0x0009 }] */
        /* JADX WARN: Removed duplicated region for block: B:56:0x01de A[EDGE_INSN: B:56:0x01de->B:47:0x01de BREAK  A[LOOP:1: B:23:0x010b->B:41:0x010b], SYNTHETIC] */
        @Override // com.baicizhan.client.framework.asynctask.LAsyncTask
        /* renamed from: T, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public ih.e.b f(java.lang.Integer... r14) {
            /*
                Method dump skipped, instructions count: 496
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: ih.e.a.f(java.lang.Integer[]):ih.e$b");
        }

        @Override // com.baicizhan.client.framework.asynctask.LAsyncTask
        /* renamed from: U, reason: merged with bridge method [inline-methods] */
        public void w(b result) {
            try {
                if (result.f60576d) {
                    if (e.f60561f == result.f60573a) {
                        e.this.r(result);
                        d();
                    } else if (e.f60562g == result.f60573a) {
                        e.this.s(result);
                    }
                }
            } catch (Throwable th2) {
                qb.c.c(e.f60560e, "phrase download post failed. ", th2);
            }
        }

        @Override // com.baicizhan.client.framework.asynctask.LAsyncTask
        public void u() {
            super.u();
            e.this.q();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public int f60573a;

        /* renamed from: b, reason: collision with root package name */
        public int f60574b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f60575c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f60576d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f60577e;

        /* renamed from: f, reason: collision with root package name */
        public int f60578f;

        /* renamed from: g, reason: collision with root package name */
        public float f60579g;

        /* renamed from: h, reason: collision with root package name */
        public float f60580h;

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class c extends Handler {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference<e> f60581a;

        public c(e loader) {
            super(Looper.getMainLooper());
            this.f60581a = new WeakReference<>(loader);
        }

        @Override // android.os.Handler
        public void handleMessage(Message msg) {
            e eVar = this.f60581a.get();
            if (eVar == null) {
                return;
            }
            int i11 = msg.what;
            if (i11 == 1) {
                if (eVar.f60568a.f60558d != null) {
                    b bVar = (b) msg.obj;
                    eVar.f60568a.f60558d.f(bVar.f60578f, bVar.f60579g, bVar.f60580h);
                    return;
                }
                return;
            }
            if (i11 == 2) {
                if (eVar.f60568a.f60558d != null) {
                    b bVar2 = (b) msg.obj;
                    eVar.f60568a.f60558d.e(bVar2.f60578f, bVar2.f60579g, bVar2.f60580h);
                    return;
                }
                return;
            }
            if (i11 != 3) {
                if (i11 == 4 && eVar.f60568a.f60558d != null) {
                    eVar.f60568a.f60558d.c();
                    return;
                }
                return;
            }
            if (eVar.f60568a.f60558d != null) {
                b bVar3 = (b) msg.obj;
                eVar.f60568a.f60558d.d(bVar3.f60575c, bVar3.f60574b);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public String f60582a;

        /* renamed from: b, reason: collision with root package name */
        public String f60583b;

        /* renamed from: c, reason: collision with root package name */
        public d f60584c;

        public d() {
        }
    }

    public e(ih.d context) {
        this.f60568a = context;
    }

    public void i() {
        a aVar = this.f60571d;
        if (aVar != null) {
            aVar.d();
        }
    }

    public void j() {
        a l11 = l();
        this.f60571d = l11;
        l11.g(Integer.valueOf(f60562g));
    }

    public final boolean k(List<d> urls, String path, String savedPath, b result, boolean isMobileNet, boolean isNetAvail) {
        if (!new File(savedPath).exists() && f60562g == result.f60573a && !isNetAvail) {
            result.f60575c = false;
            result.f60577e = true;
            result.f60574b = -3;
            return false;
        }
        try {
            d dVar = new d();
            dVar.f60584c = new d();
            dVar.f60582a = PathUtil.getResDns() + path;
            dVar.f60584c.f60582a = PathUtil.getCandResDns() + path;
            dVar.f60583b = savedPath;
            urls.add(dVar);
            return true;
        } catch (Exception e11) {
            qb.c.c("", "phrase url sync error.", e11);
            return false;
        }
    }

    public final a l() {
        ih.a aVar = this.f60568a.f60558d;
        String o11 = xb.f.o((aVar != null ? aVar.getClass() : e.class).getName());
        LAsyncTask<?, ?, ?> K = LAsyncTask.K(o11);
        if (K != null) {
            K.d();
            LAsyncTask.G(0, o11);
        }
        return new a();
    }

    public final List<d> m(b result, TopicPatterns patterns, Map<Integer, Phrase> phrases) {
        b bVar;
        boolean f11 = rb.d.f(pb.a.a());
        ArrayList arrayList = new ArrayList();
        List<TopicPatterns.Topic> arrTopics = patterns.getArrTopics();
        HashSet hashSet = new HashSet();
        for (TopicPatterns.Topic topic : arrTopics) {
            if (59 != topic.getTypeHint() || TextUtils.isEmpty(topic.getGroupedOptions())) {
                bVar = result;
            } else {
                String groupedOptions = topic.getGroupedOptions();
                if (hashSet.contains(groupedOptions)) {
                    continue;
                } else {
                    bVar = result;
                    if (!k(arrayList, groupedOptions, PathUtil.reformSuffix(PathUtil.BCZ_HOME + topic.getGroupedOptions(), ".jpg"), bVar, false, f11)) {
                        return null;
                    }
                    hashSet.add(groupedOptions);
                }
            }
            result = bVar;
        }
        b bVar2 = result;
        Iterator<Map.Entry<Integer, Phrase>> it = phrases.entrySet().iterator();
        while (it.hasNext()) {
            Phrase value = it.next().getValue();
            if (!TextUtils.isEmpty(value.getWordImage())) {
                String wordImage = value.getWordImage();
                if (!hashSet.contains(wordImage)) {
                    if (!k(arrayList, wordImage, PathUtil.reformSuffix(PathUtil.BCZ_HOME + wordImage, ".jpg"), bVar2, false, f11)) {
                        return null;
                    }
                    hashSet.add(wordImage);
                }
            }
            if (!TextUtils.isEmpty(value.getWordAudio())) {
                String wordAudio = value.getWordAudio();
                if (!hashSet.contains(wordAudio)) {
                    if (!k(arrayList, wordAudio, PathUtil.reformSuffix(PathUtil.BCZ_HOME + wordAudio, ".dat"), bVar2, false, f11)) {
                        return null;
                    }
                    hashSet.add(wordAudio);
                }
            }
            if (!TextUtils.isEmpty(value.getExplainAudio())) {
                String explainAudio = value.getExplainAudio();
                if (!hashSet.contains(explainAudio)) {
                    if (!k(arrayList, explainAudio, PathUtil.reformSuffix(PathUtil.BCZ_HOME + explainAudio, ".dat"), bVar2, false, f11)) {
                        return null;
                    }
                    hashSet.add(explainAudio);
                }
            }
            if (!TextUtils.isEmpty(value.getSentenceAudio())) {
                String sentenceAudio = value.getSentenceAudio();
                if (!hashSet.contains(sentenceAudio)) {
                    if (!k(arrayList, sentenceAudio, PathUtil.reformSuffix(PathUtil.BCZ_HOME + sentenceAudio, ".mp3"), bVar2, false, f11)) {
                        return null;
                    }
                    hashSet.add(sentenceAudio);
                }
            }
            if (!TextUtils.isEmpty(value.getSentence2Audio())) {
                String sentence2Audio = value.getSentence2Audio();
                if (hashSet.contains(sentence2Audio)) {
                    continue;
                } else {
                    if (!k(arrayList, sentence2Audio, PathUtil.reformSuffix(PathUtil.BCZ_HOME + sentence2Audio, ".mp3"), bVar2, false, f11)) {
                        return null;
                    }
                    hashSet.add(sentence2Audio);
                }
            }
        }
        return arrayList;
    }

    public void n() {
        a l11 = l();
        this.f60571d = l11;
        l11.g(Integer.valueOf(f60561f));
    }

    public boolean o() {
        a aVar = this.f60571d;
        return aVar == null || aVar.r() || LAsyncTask.LAsyncTaskStatus.FINISHED == this.f60571d.p();
    }

    public void p() {
        this.f60570c = true;
    }

    public final void q() {
        this.f60569b.sendEmptyMessage(4);
    }

    public final void r(b result) {
        Message obtainMessage = this.f60569b.obtainMessage(1);
        obtainMessage.obj = result;
        this.f60569b.sendMessage(obtainMessage);
    }

    public final void s(b result) {
        Message obtainMessage = this.f60569b.obtainMessage(3);
        obtainMessage.obj = result;
        this.f60569b.sendMessage(obtainMessage);
    }

    public final void t(b result) {
        Message obtainMessage = this.f60569b.obtainMessage(2);
        obtainMessage.obj = result;
        this.f60569b.sendMessage(obtainMessage);
    }
}

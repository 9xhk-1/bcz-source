package za;

import com.baicizhan.client.business.thrift.ThriftRequest;
import com.baicizhan.client.business.util.PathUtil;
import com.baicizhan.online.bs_words.BBExam;
import com.baicizhan.online.bs_words.BBExamAudio;
import com.baicizhan.online.bs_words.BBExamAudioCategory;
import com.baicizhan.online.bs_words.BSWords;
import gb.a;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import l6.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class a {

    /* renamed from: c, reason: collision with root package name */
    public static String f102435c = "a";

    /* renamed from: d, reason: collision with root package name */
    public static String f102436d = "exam_audio_";

    /* renamed from: e, reason: collision with root package name */
    public static final String f102437e = "res/examination";

    /* renamed from: f, reason: collision with root package name */
    public static final String f102438f = PathUtil.getBaicizhanFile(f102437e).getAbsolutePath();

    /* renamed from: g, reason: collision with root package name */
    public static final long f102439g = 1073741824;

    /* renamed from: h, reason: collision with root package name */
    public static final int f102440h = 1024;

    /* renamed from: i, reason: collision with root package name */
    public static final String f102441i = "category_list";

    /* renamed from: j, reason: collision with root package name */
    public static final String f102442j = "category";

    /* renamed from: k, reason: collision with root package name */
    public static final String f102443k = "exam";

    /* renamed from: l, reason: collision with root package name */
    public static final String f102444l = "/rpc/words";

    /* renamed from: m, reason: collision with root package name */
    public static a f102445m;

    /* renamed from: a, reason: collision with root package name */
    public gb.b f102446a = new gb.b(f102435c);

    /* renamed from: b, reason: collision with root package name */
    public gb.a f102447b = new gb.a(f102435c);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: za.a$a, reason: collision with other inner class name */
    public class C1390a extends ThriftRequest<BSWords.Client, List<BBExamAudioCategory>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d f102448a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1390a(String domain, String tag, final d val$listener) {
            super(domain, tag);
            this.f102448a = val$listener;
        }

        @Override // com.baicizhan.client.business.thrift.ThriftRequest
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<BBExamAudioCategory> doInBackground(BSWords.Client client) throws Exception {
            return client.get_exam_categories();
        }

        @Override // com.baicizhan.client.business.thrift.ThriftRequest
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onResult(List<BBExamAudioCategory> res) {
            a.this.f102446a.c(a.this.s(), a.f102441i, res);
            this.f102448a.onSuccess(res);
        }

        @Override // com.baicizhan.client.business.thrift.ThriftRequest
        public void onError(Exception exception) {
            a.this.m(this.f102448a);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends ThriftRequest<BSWords.Client, List<BBExam>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f102450a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ d f102451b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String domain, String tag, final int val$category, final d val$listener) {
            super(domain, tag);
            this.f102450a = val$category;
            this.f102451b = val$listener;
        }

        @Override // com.baicizhan.client.business.thrift.ThriftRequest
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<BBExam> doInBackground(BSWords.Client client) throws Exception {
            return client.get_exams(this.f102450a);
        }

        @Override // com.baicizhan.client.business.thrift.ThriftRequest
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onResult(List<BBExam> res) {
            a.this.f102446a.c(a.this.s(), a.f102442j + this.f102450a, res);
            this.f102451b.onSuccess(res);
        }

        @Override // com.baicizhan.client.business.thrift.ThriftRequest
        public void onError(Exception exception) {
            a.this.q(this.f102450a, this.f102451b);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c extends ThriftRequest<BSWords.Client, List<BBExamAudio>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f102453a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ d f102454b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String domain, String tag, final int val$id, final d val$listener) {
            super(domain, tag);
            this.f102453a = val$id;
            this.f102454b = val$listener;
        }

        @Override // com.baicizhan.client.business.thrift.ThriftRequest
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<BBExamAudio> doInBackground(BSWords.Client client) throws Exception {
            return client.get_exam_audios(this.f102453a);
        }

        @Override // com.baicizhan.client.business.thrift.ThriftRequest
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onResult(List<BBExamAudio> res) {
            a.this.f102446a.c(a.this.s(), a.f102443k + this.f102453a, res);
            this.f102454b.onSuccess(a.this.i(res));
        }

        @Override // com.baicizhan.client.business.thrift.ThriftRequest
        public void onError(Exception exception) {
            a.this.o(this.f102453a, this.f102454b);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface d<T> {
        void onError(String msg);

        void onSuccess(T res);
    }

    public static synchronized a k() {
        a aVar;
        synchronized (a.class) {
            aVar = f102445m;
            if (aVar == null) {
                aVar = new a();
                f102445m = aVar;
            }
        }
        return aVar;
    }

    public void g(String filename) {
        this.f102447b.d(f102436d + filename);
    }

    public void h(final String filename, final String url, final a.b listener) {
        this.f102447b.e(f102436d + filename, url, s(), listener);
    }

    public final List<BBExamAudio> i(List<BBExamAudio> chapters) {
        for (BBExamAudio bBExamAudio : chapters) {
            vb.a s11 = s();
            try {
            } catch (Exception unused) {
            } catch (Throwable th2) {
                s11.b();
                throw th2;
            }
            if (!s11.q(true)) {
                throw new IOException("资源库打开失败");
            }
            File j11 = s11.j(f102436d + bBExamAudio.getAudio_file_name());
            if (j11 != null) {
                bBExamAudio.setAudio_url(n.f70249a + j11.getAbsolutePath());
            }
            s11.b();
        }
        return chapters;
    }

    public Double j(String filename) {
        return this.f102447b.f(f102436d + filename, s());
    }

    public void l(final String tag, final d<List<BBExamAudioCategory>> listener) {
        com.baicizhan.client.business.thrift.c.b().a(new C1390a("/rpc/words", tag, listener));
    }

    public final void m(d<List<BBExamAudioCategory>> listener) {
        BBExamAudioCategory[] bBExamAudioCategoryArr = (BBExamAudioCategory[]) this.f102446a.a(s(), f102441i, BBExamAudioCategory[].class);
        if (bBExamAudioCategoryArr != null) {
            listener.onSuccess(new ArrayList(Arrays.asList(bBExamAudioCategoryArr)));
        } else {
            listener.onError("读取本地缓存失败, 请在稳定的网络下重试");
        }
    }

    public void n(final String tag, final int id2, final d<List<BBExamAudio>> listener) {
        com.baicizhan.client.business.thrift.c.b().a(new c("/rpc/words", tag, id2, listener));
    }

    public final void o(int id2, d<List<BBExamAudio>> listener) {
        BBExamAudio[] bBExamAudioArr = (BBExamAudio[]) this.f102446a.a(s(), f102443k + id2, BBExamAudio[].class);
        if (bBExamAudioArr != null) {
            listener.onSuccess(i(new ArrayList(Arrays.asList(bBExamAudioArr))));
        } else {
            listener.onError("读取本地缓存失败, 请在稳定的网络下重试");
        }
    }

    public void p(final String tag, final int category, final d<List<BBExam>> listener) {
        com.baicizhan.client.business.thrift.c.b().a(new b("/rpc/words", tag, category, listener));
    }

    public final void q(int category, d<List<BBExam>> listener) {
        BBExam[] bBExamArr = (BBExam[]) this.f102446a.a(s(), f102442j + category, BBExam[].class);
        if (bBExamArr != null) {
            listener.onSuccess(new ArrayList(Arrays.asList(bBExamArr)));
        } else {
            listener.onError("读取本地缓存失败, 请在稳定的网络下重试");
        }
    }

    public void r(String filename, a.b listener) {
        this.f102447b.g(f102436d + filename, listener);
    }

    public final vb.a s() {
        return new vb.a(f102438f, 1073741824L, 1024);
    }
}

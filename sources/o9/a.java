package o9;

import android.content.Context;
import android.text.TextUtils;
import android.widget.ImageView;
import com.baicizhan.client.business.dataset.models.TopicRecord;
import com.baicizhan.client.business.lookup.Word;
import com.baicizhan.client.business.thrift.d;
import com.baicizhan.client.business.thrift.o;
import com.baicizhan.client.business.util.ConstantsUtil;
import com.baicizhan.client.business.util.DownloadConfig;
import com.baicizhan.client.business.util.ErrCodes;
import com.baicizhan.client.business.util.FileUtils;
import com.baicizhan.client.business.util.PathUtil;
import com.baicizhan.client.business.util.ZPackUtils;
import com.baicizhan.client.business.util.ZpkConfig;
import com.baicizhan.client.framework.audio.IAudioPlayer;
import com.baicizhan.online.resource_api.ResourceService;
import com.baicizhan.online.resource_api.TopicKey;
import com.baicizhan.online.resource_api.ZpkInfo;
import i9.j;
import i9.l;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import org.apache.thrift.TException;
import ub.a;
import ya.e;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class a {

    /* renamed from: d, reason: collision with root package name */
    public static final String f76613d = "res/wordlock";

    /* renamed from: f, reason: collision with root package name */
    public static final int f76615f = -1001;

    /* renamed from: a, reason: collision with root package name */
    public volatile int f76616a = 0;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC0935a f76617b;

    /* renamed from: c, reason: collision with root package name */
    public static final String[] f76612c = {ConstantsUtil.DEFAULT_DNS, ConstantsUtil.DEFAULT_DNS_CAND};

    /* renamed from: e, reason: collision with root package name */
    public static String f76614e = null;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: o9.a$a, reason: collision with other inner class name */
    public interface InterfaceC0935a {
        void a(Word word, int errCode, String errMsg);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public Word f76618a;

        /* renamed from: b, reason: collision with root package name */
        public int f76619b;

        /* renamed from: c, reason: collision with root package name */
        public String f76620c;

        public b() {
            this.f76619b = 0;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class c extends d<Context, ResourceService.Client, b> {

        /* renamed from: b, reason: collision with root package name */
        public Word f76621b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f76622c;

        /* renamed from: d, reason: collision with root package name */
        public final WeakReference<a> f76623d;

        public c(Context context, Word word, boolean retry, a rm2) {
            super("/rpc/resource_api", context);
            this.f76621b = word;
            this.f76622c = retry;
            this.f76623d = new WeakReference<>(rm2);
        }

        @Override // com.baicizhan.client.business.thrift.d
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public b a(Context context, ResourceService.Client client) throws Exception {
            b f11;
            synchronized (a.class) {
                f11 = f(client, context);
            }
            return f11;
        }

        public final boolean e(vb.a rl2, b params, int bookId, ResourceService.Client client) throws Exception {
            List<ZpkInfo> list = client.get_zpk_infos(Collections.singletonList(new TopicKey(Integer.valueOf(params.f76618a.getId()).intValue(), bookId, 0)));
            if (list == null || list.isEmpty()) {
                qb.c.b("whiz", "adapt word data, zpk packages empty, audio: " + params.f76618a.getAudio(), new Object[0]);
                qb.c.d("", "word lock get resource, zpk packages empty, word [%s]", this.f76621b.toString());
                return false;
            }
            ub.a a11 = new a.b().j(a.q(list.get(0).getZpk_uri())).f(3000).i(5000).h(2).a();
            if (!a11.I()) {
                qb.c.b("whiz", "adapt word data, download failed, audio: " + params.f76618a.getAudio(), new Object[0]);
                qb.c.d("", "word lock get resource, download failed, err code [%d], word [%s]", Integer.valueOf(a11.r()), this.f76621b.toString());
                int parseNetRelatedErrCode = ErrCodes.parseNetRelatedErrCode(a11.r());
                params.f76619b = parseNetRelatedErrCode;
                params.f76620c = ErrCodes.buildErrMessage(parseNetRelatedErrCode, String.valueOf(a11.r()));
                return false;
            }
            if (rl2.r(this.f76621b.getId(), new File(a11.s()), true)) {
                return true;
            }
            qb.c.b("whiz", "adapt word data, saved failed, audio: " + params.f76618a.getAudio(), new Object[0]);
            qb.c.d("", "word lock get resource, save zpk failed, word [%s]", this.f76621b.toString());
            params.f76619b = -1001;
            params.f76620c = ErrCodes.buildErrMessage(-1001, "zpk saved failed.");
            return false;
        }

        public final b f(ResourceService.Client client, Context context) throws Exception {
            TopicRecord d11;
            b bVar = new b();
            a aVar = this.f76623d.get();
            if (aVar == null) {
                return bVar;
            }
            bVar.f76618a = this.f76621b;
            if (!o.a(context)) {
                qb.c.b("whiz", "adapt word data, set token failed, audio: " + bVar.f76618a.getAudio(), new Object[0]);
                qb.c.d("", "word lock get resource, set token failed, word [%s]", this.f76621b.toString());
                bVar.f76619b = ErrCodes.ERR_TOKEN_LOST;
                return bVar;
            }
            int bookId = bVar.f76618a.getBookId() > 0 ? bVar.f76618a.getBookId() : j.d("current_book_id");
            if (bVar.f76618a.isBase() && (d11 = l.d(context, bookId, Integer.valueOf(this.f76621b.getId()).intValue())) != null) {
                Word g11 = a.g(bookId, d11);
                bVar.f76618a = g11;
                if (a.s(g11)) {
                    qb.c.b("whiz", "adapt word data, from local, audio: " + bVar.f76618a.getAudio(), new Object[0]);
                    return bVar;
                }
            }
            vb.a aVar2 = new vb.a(a.p());
            try {
                try {
                    if (!aVar2.q(true)) {
                        qb.c.b("whiz", "adapt word data, open rl failed, audio: " + bVar.f76618a.getAudio(), new Object[0]);
                        qb.c.d("", "word lock get resource, open resource library failed, word [%s]", this.f76621b.toString());
                        bVar.f76619b = ErrCodes.ERR_FILE;
                        return bVar;
                    }
                    if (!aVar2.g(this.f76621b.getId())) {
                        if (!DownloadConfig.canDownload(context, aVar.f76616a)) {
                            return bVar;
                        }
                        if (!e(aVar2, bVar, bookId, client)) {
                            return bVar;
                        }
                    }
                    try {
                        TopicRecord readMetaTopicRecord = ZPackUtils.readMetaTopicRecord(bookId, aVar2.j(this.f76621b.getId()).getAbsolutePath());
                        if (readMetaTopicRecord == null) {
                            throw new RuntimeException("word zpk file in " + aVar2.j(this.f76621b.getId()).getAbsolutePath() + " is damaged.");
                        }
                        Word g12 = a.g(this.f76621b.getBookId(), readMetaTopicRecord);
                        bVar.f76618a = g12;
                        g12.setFromCache(true);
                        qb.c.b("whiz", "adapt word data, from zpk cache, audio: " + bVar.f76618a.getAudio(), new Object[0]);
                        return bVar;
                    } catch (Exception e11) {
                        qb.c.b("whiz", "adapt word data, exception occured when read zpk, zpk path: " + aVar2.j(this.f76621b.getId()) + "; ex: " + e11, new Object[0]);
                        qb.c.c("", "word lock get resource, exception occured when read zpk", e11);
                        qb.c.d("", "word lock get resource, exception occured when read zpk, zpk path [%s], word [%s]", aVar2.j(this.f76621b.getId()).getAbsolutePath(), this.f76621b.toString());
                        aVar2.c(this.f76621b.getId());
                        throw e11;
                    }
                } catch (Exception e12) {
                    qb.c.b("whiz", "adapt word data, exception occured, audio: " + bVar.f76618a.getAudio() + "; ex: " + e12, new Object[0]);
                    throw e12;
                }
            } finally {
                aVar2.b();
            }
        }

        @Override // com.baicizhan.client.business.thrift.d
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public void b(Context context, Exception exception) {
            a aVar = this.f76623d.get();
            if (aVar == null) {
                return;
            }
            if (this.f76622c) {
                aVar.m(context, this.f76621b, false);
                return;
            }
            if (aVar.f76617b != null) {
                if (!(exception instanceof TException)) {
                    aVar.f76617b.a(this.f76621b, -1000, null);
                    return;
                }
                int parseNetRelatedErrCode = ErrCodes.parseNetRelatedErrCode((TException) exception);
                aVar.f76617b.a(this.f76621b, parseNetRelatedErrCode, ErrCodes.buildErrMessage(parseNetRelatedErrCode, exception.getMessage()));
            }
        }

        @Override // com.baicizhan.client.business.thrift.d
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public void c(Context context, b results) {
            a aVar = this.f76623d.get();
            if (aVar == null || aVar.f76617b == null) {
                return;
            }
            aVar.f76617b.a(results.f76618a, results.f76619b, results.f76620c);
        }
    }

    public static Word g(int bookId, TopicRecord record) {
        Word word = new Word();
        word.setBookId(bookId);
        word.setId(String.valueOf(record.topicId));
        word.setWord(record.word);
        word.setAccent(record.phonetic);
        word.setCnmean(record.wordMean);
        word.setAudio(record.wordAudio);
        word.setExample(record.sentence);
        word.setCnexample(record.sentenceTrans);
        word.setImage(record.imagePath);
        word.setVivid(record.deformationImagePath);
        word.setEnmean(record.wordMeanEn);
        word.setRoot(record.wordEtyma);
        word.setZpkPath(record.zpkName);
        word.setVariants(record.wordVariants);
        return word;
    }

    public static a i() {
        return new a();
    }

    public static void j(Context context, final ImageView target, int bookId, String wordId, String zpkPath, String imageName, hc.d callback) {
        File zpkFileByName = !TextUtils.isEmpty(zpkPath) ? ZPackUtils.getZpkFileByName(bookId, zpkPath) : null;
        if (zpkFileByName != null && zpkFileByName.exists()) {
            hc.c.j(ZpkConfig.getImageUri(zpkFileByName.getAbsolutePath(), FileUtils.getFileName(imageName))).g(target, callback);
            return;
        }
        if (PathUtil.isBaicizhanResourceFileExist(imageName)) {
            hc.c.k(PathUtil.getBaicizhanResourceFile(imageName)).g(target, callback);
            return;
        }
        if (!w(wordId)) {
            target.setVisibility(8);
            return;
        }
        vb.a aVar = new vb.a(p());
        try {
            try {
                aVar.q(true);
                hc.c.j(ZpkConfig.getImageUri(aVar.j(wordId).getAbsolutePath(), imageName)).g(target, callback);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        } finally {
            aVar.b();
        }
    }

    public static void k(Context context, ImageView target, Word word, hc.d callback) {
        if (context == null || target == null || word == null) {
            return;
        }
        j(context, target, word.getBookId(), word.getId(), word.getZpkPath(), word.getImage(), callback);
    }

    public static void l(Context context, ImageView target, Word word, hc.d callback) {
        if (context == null || target == null || word == null) {
            return;
        }
        j(context, target, word.getBookId(), word.getId(), word.getZpkPath(), word.getVivid(), callback);
    }

    public static String o(Word word) {
        if (word == null || TextUtils.isEmpty(word.getAudio())) {
            return null;
        }
        int lastIndexOf = word.getAudio().lastIndexOf("/") + 1;
        return (lastIndexOf < 0 || lastIndexOf >= word.getAudio().length()) ? word.getAudio() : word.getAudio().substring(lastIndexOf);
    }

    public static String p() {
        File baicizhanFile;
        if (f76614e == null && (baicizhanFile = PathUtil.getBaicizhanFile(f76613d)) != null) {
            f76614e = baicizhanFile.getAbsolutePath();
        }
        return f76614e;
    }

    public static String q(String urlPath) {
        String str = f76612c[(int) (Math.random() + 0.5d)];
        if (TextUtils.isEmpty(urlPath)) {
            return null;
        }
        if (urlPath.startsWith("http")) {
            return urlPath;
        }
        String replace = urlPath.replace(" ", "%20");
        if (replace.charAt(0) != '/') {
            return String.format("%s/%s", str, replace);
        }
        return str + replace;
    }

    public static boolean r(Word word) {
        if (word == null) {
            return false;
        }
        return u(word, word.getAudio());
    }

    public static boolean s(Word word) {
        if (word == null || TextUtils.isEmpty(word.getAudio()) || TextUtils.isEmpty(word.getImage()) || TextUtils.isEmpty(word.getVivid())) {
            return false;
        }
        if (!TextUtils.isEmpty(word.getZpkPath()) && x(word.getBookId(), word.getZpkPath())) {
            return true;
        }
        if (word.isFromCache() && w(word.getId())) {
            return true;
        }
        if (!TextUtils.isEmpty(word.getAudio()) && !PathUtil.isBaicizhanResourceFileExist(word.getAudio())) {
            return false;
        }
        if (TextUtils.isEmpty(word.getImage()) || PathUtil.isBaicizhanResourceFileExist(word.getImage())) {
            return TextUtils.isEmpty(word.getVivid()) || PathUtil.isBaicizhanResourceFileExist(word.getVivid());
        }
        return false;
    }

    public static boolean t(Word word) {
        if (word == null) {
            return false;
        }
        return u(word, word.getImage());
    }

    public static boolean u(Word word, String resName) {
        if (TextUtils.isEmpty(resName)) {
            return false;
        }
        if (TextUtils.isEmpty(word.getZpkPath()) || !x(word.getBookId(), word.getZpkPath())) {
            return (word.isFromCache() && w(word.getId())) || PathUtil.isBaicizhanResourceFileExist(resName);
        }
        return true;
    }

    public static boolean v(Word word) {
        if (word == null) {
            return false;
        }
        return u(word, word.getVivid());
    }

    public static boolean w(String wordId) {
        vb.a aVar = new vb.a(p());
        try {
            try {
                aVar.q(true);
                return aVar.g(wordId);
            } catch (Exception e11) {
                e11.printStackTrace();
                aVar.b();
                return false;
            }
        } finally {
            aVar.b();
        }
    }

    public static boolean x(int bookId, String zpkPath) {
        File zpkFileByName = !TextUtils.isEmpty(zpkPath) ? ZPackUtils.getZpkFileByName(bookId, zpkPath) : null;
        return zpkFileByName != null && zpkFileByName.exists();
    }

    public static void y(IAudioPlayer player, Word word) {
        if (player == null || word == null || z(player, word) || !w(word.getId())) {
            return;
        }
        vb.a aVar = new vb.a(p());
        try {
            aVar.q(true);
            ZPackUtils.playZpkAudio(player, aVar.j(word.getId()).getAbsolutePath(), o(word));
        } catch (Exception e11) {
            e11.printStackTrace();
        } finally {
            aVar.b();
        }
    }

    public static boolean z(IAudioPlayer player, Word word) {
        Throwable th2;
        e eVar;
        String o11 = o(word);
        e eVar2 = null;
        File zpkFileByName = !TextUtils.isEmpty(word.getZpkPath()) ? ZPackUtils.getZpkFileByName(word.getBookId(), word.getZpkPath()) : null;
        if (zpkFileByName == null || !zpkFileByName.exists()) {
            return player.e(PathUtil.getBaicizhanResourceFile(word.getAudio()));
        }
        try {
            eVar = new e(zpkFileByName.getAbsolutePath(), 1);
        } catch (IOException unused) {
        } catch (Throwable th3) {
            th2 = th3;
        }
        try {
            boolean d11 = player.d(eVar.j(), eVar.m(o11).f(), r0.e());
            eVar.d();
            return d11;
        } catch (IOException unused2) {
            eVar2 = eVar;
            if (eVar2 == null) {
                return false;
            }
            eVar2.d();
            return false;
        } catch (Throwable th4) {
            th2 = th4;
            eVar2 = eVar;
            if (eVar2 == null) {
                throw th2;
            }
            eVar2.d();
            throw th2;
        }
    }

    public a A(InterfaceC0935a l11) {
        this.f76617b = l11;
        return this;
    }

    public a B(int mode) {
        this.f76616a = mode;
        return this;
    }

    public a h(int mode) {
        this.f76616a = mode | this.f76616a;
        return this;
    }

    public final void m(final Context context, final Word word, final boolean retry) {
        com.baicizhan.client.business.thrift.c.b().a(new c(context, word, retry, this));
    }

    public a n(Context context, Word word) {
        if (word == null || (s(word) && !word.isBase())) {
            return this;
        }
        m(context, word, true);
        return this;
    }
}

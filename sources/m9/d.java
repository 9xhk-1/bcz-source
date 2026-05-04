package m9;

import android.text.TextUtils;
import com.baicizhan.client.business.dataset.models.TopicRecord;
import com.baicizhan.client.business.dataset.models.UniverseTopicId;
import com.baicizhan.client.business.util.PathUtil;
import com.baicizhan.client.business.util.ZPackUtils;
import com.baicizhan.client.framework.audio.IAudioPlayer;
import i9.l;
import java.io.File;
import java.net.URLEncoder;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public static final String f72686a = "VoiceManager";

    /* renamed from: b, reason: collision with root package name */
    public static final String f72687b = "res/wordlist_voice";

    /* renamed from: c, reason: collision with root package name */
    public static final String f72688c;

    /* renamed from: d, reason: collision with root package name */
    public static final int f72689d = 104857600;

    /* renamed from: e, reason: collision with root package name */
    public static final int f72690e = 2048;

    /* renamed from: f, reason: collision with root package name */
    public static final String f72691f = "r/%s.dat";

    /* renamed from: g, reason: collision with root package name */
    public static final String f72692g;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements Callable<c> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f72693a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ long f72694b;

        public a(final String val$word, final long val$universeTopicId) {
            this.f72693a = val$word;
            this.f72694b = val$universeTopicId;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public c call() throws Exception {
            qb.c.i("VoiceManager", "getVocie item = %s", this.f72693a);
            int bookId = UniverseTopicId.getBookId(this.f72694b);
            int topicId = UniverseTopicId.getTopicId(this.f72694b);
            TopicRecord d11 = l.d(pb.a.a(), bookId, topicId);
            if (d11 == null || !ZPackUtils.isZpkExists(d11)) {
                return new c(m9.b.c(this.f72693a, topicId).t6().b(), null);
            }
            qb.c.i("VoiceManager", "getVocie from TopicRecord, %s", d11.toString());
            return new c(null, d11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements Callable<File> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f72696a;

        public b(final String val$url) {
            this.f72696a = val$url;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public File call() throws Exception {
            try {
                return d.this.h(this.f72696a, URLEncoder.encode(this.f72696a, "UTF-8")).f72698a;
            } catch (Exception e11) {
                qb.c.h("VoiceManager", "", e11);
                throw vb0.a.c(e11);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public File f72698a;

        /* renamed from: b, reason: collision with root package name */
        public TopicRecord f72699b;

        public c(File audio, TopicRecord record) {
            this.f72698a = audio;
            this.f72699b = record;
        }

        public void a(IAudioPlayer player) {
            File file = this.f72698a;
            if (file != null) {
                player.e(file);
                player.play();
            } else {
                TopicRecord topicRecord = this.f72699b;
                if (topicRecord != null) {
                    ZPackUtils.loadAudioCompat(player, topicRecord, topicRecord.wordAudio);
                }
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: m9.d$d, reason: collision with other inner class name */
    public static class C0881d {

        /* renamed from: a, reason: collision with root package name */
        public static d f72700a = new d();
    }

    static {
        File baicizhanFile = PathUtil.getBaicizhanFile(f72687b);
        if (baicizhanFile == null) {
            f72692g = null;
        } else {
            f72692g = baicizhanFile.getAbsolutePath();
        }
        File baicizhanFile2 = PathUtil.getBaicizhanFile("voice_download_cache");
        if (baicizhanFile2 == null) {
            f72688c = null;
        } else {
            f72688c = baicizhanFile2.getAbsolutePath();
        }
    }

    public static vb.a c() {
        return new vb.a(f72692g, gi.e.f53744c, 2048);
    }

    public static d d() {
        return C0881d.f72700a;
    }

    public final String b(String word) {
        StringBuilder sb2 = new StringBuilder(word.toLowerCase());
        for (int i11 = 0; i11 < sb2.length(); i11++) {
            if ((sb2.charAt(i11) > '9' || sb2.charAt(i11) < '0') && ((sb2.charAt(i11) > 'Z' || sb2.charAt(i11) < 'A') && ((sb2.charAt(i11) > 'z' || sb2.charAt(i11) < 'a') && sb2.charAt(i11) != ' '))) {
                sb2.setCharAt(i11, '_');
            }
        }
        return sb2.toString().replaceAll(" ", "%20");
    }

    public rx.c<File> e(final String url) {
        return rx.c.z2(new b(url)).w5(bc0.c.e()).I3(tb0.a.a());
    }

    public rx.c<c> f(final String word, final long universeTopicId) {
        return rx.c.z2(new a(word, universeTopicId)).w5(bc0.c.e());
    }

    public final c g(String word) {
        if (TextUtils.isEmpty(word)) {
            rx.c.T1(new NullPointerException("word may not be null or \"\""));
        }
        String b11 = b(word);
        return h(String.format(f72691f, b11), b11);
    }

    public final c h(String url, String key) {
        vb.a c11 = c();
        qb.c.i("VoiceManager", "voiceFromDownload url = %s , key = %s", url, key);
        try {
            if (!c11.q(true)) {
                throw new RuntimeException("can not open ResourceLibrary");
            }
            if (!c11.g(key)) {
                qb.c.i("VoiceManager", "voiceFromDownload need Download %s", url);
                if (!c11.r(key, new m9.c(700, 1500, 1).a(url, f72688c), true)) {
                    throw new RuntimeException("save file failed");
                }
            }
            return new c(c11.j(key), null);
        } catch (Exception e11) {
            throw vb0.a.c(e11);
        }
    }

    public d() {
    }
}

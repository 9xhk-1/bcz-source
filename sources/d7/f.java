package d7;

import android.content.res.AssetFileDescriptor;
import android.media.AudioAttributes;
import android.media.SoundPool;
import g10.u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import u30.f0;
import u30.k0;
import yz.h1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nAndroidSoundEffectPlayer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidSoundEffectPlayer.kt\ncom/baicizhan/app/biz/platform/audio/AndroidSoundEffectPlayer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,193:1\n1#2:194\n1869#3,2:195\n1869#3,2:211\n382#4,7:197\n382#4,7:204\n*S KotlinDebug\n*F\n+ 1 AndroidSoundEffectPlayer.kt\ncom/baicizhan/app/biz/platform/audio/AndroidSoundEffectPlayer\n*L\n73#1:195,2\n169#1:211,2\n107#1:197,7\n121#1:204,7\n*E\n"})
/* loaded from: classes3.dex */
public final class f implements m {

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public static final a f47285h = new a(null);

    /* renamed from: i, reason: collision with root package name */
    @m80.k
    public static final String f47286i = "SoundEffectPlayer";

    /* renamed from: j, reason: collision with root package name */
    public static final int f47287j = 10;

    /* renamed from: k, reason: collision with root package name */
    @m80.k
    public static final String f47288k = "file:///android_asset/";

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final SoundPool f47289a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final Map<String, Integer> f47290b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final Set<String> f47291c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final Map<String, List<Pair<Integer, Float>>> f47292d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final Map<Integer, Integer> f47293e;

    /* renamed from: f, reason: collision with root package name */
    public int f47294f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f47295g;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        public a() {
        }
    }

    public f() {
        SoundPool build = new SoundPool.Builder().setMaxStreams(10).setAudioAttributes(new AudioAttributes.Builder().setUsage(14).setContentType(4).build()).build();
        g0.o(build, "build(...)");
        this.f47289a = build;
        this.f47290b = new LinkedHashMap();
        this.f47291c = new LinkedHashSet();
        this.f47292d = new LinkedHashMap();
        this.f47293e = new LinkedHashMap();
        this.f47294f = 1;
        build.setOnLoadCompleteListener(new SoundPool.OnLoadCompleteListener() { // from class: d7.e
            @Override // android.media.SoundPool.OnLoadCompleteListener
            public final void onLoadComplete(SoundPool soundPool, int i11, int i12) {
                f.f(f.this, soundPool, i11, i12);
            }
        });
    }

    public static final void f(f fVar, SoundPool soundPool, int i11, int i12) {
        if (i12 == 0) {
            fVar.h(i11);
            return;
        }
        z6.b.f(z6.b.f101032b, f47286i, "Failed to load sound, sampleId=" + i11 + ", status=" + i12, null, 4, null);
    }

    @Override // d7.m
    public int a(@m80.k String source, float f11) {
        g0.p(source, "source");
        if (this.f47295g) {
            z6.b.d(z6.b.f101032b, f47286i, "Player already released, ignoring play request", null, 4, null);
            return -1;
        }
        int i11 = this.f47294f;
        this.f47294f = i11 + 1;
        float H = u.H(f11, 0.0f, 1.0f);
        Integer num = this.f47290b.get(source);
        if (num != null && !this.f47291c.contains(source)) {
            int play = this.f47289a.play(num.intValue(), H, H, 1, 0, 1.0f);
            if (play == 0) {
                return -1;
            }
            this.f47293e.put(Integer.valueOf(i11), Integer.valueOf(play));
            z6.b.d(z6.b.f101032b, f47286i, "Playing cached sound: " + source + ", playId=" + i11 + ", streamId=" + play, null, 4, null);
            return i11;
        }
        if (this.f47291c.contains(source)) {
            Map<String, List<Pair<Integer, Float>>> map = this.f47292d;
            List<Pair<Integer, Float>> list = map.get(source);
            if (list == null) {
                list = new ArrayList<>();
                map.put(source, list);
            }
            list.add(h1.a(Integer.valueOf(i11), Float.valueOf(H)));
            z6.b.d(z6.b.f101032b, f47286i, "Sound loading, queued: " + source + ", playId=" + i11, null, 4, null);
            return i11;
        }
        int g11 = g(source);
        if (g11 == 0) {
            z6.b.f(z6.b.f101032b, f47286i, "Failed to load sound: " + source, null, 4, null);
            return -1;
        }
        this.f47290b.put(source, Integer.valueOf(g11));
        this.f47291c.add(source);
        Map<String, List<Pair<Integer, Float>>> map2 = this.f47292d;
        List<Pair<Integer, Float>> list2 = map2.get(source);
        if (list2 == null) {
            list2 = new ArrayList<>();
            map2.put(source, list2);
        }
        list2.add(h1.a(Integer.valueOf(i11), Float.valueOf(H)));
        z6.b.d(z6.b.f101032b, f47286i, "Loading sound: " + source + ", soundId=" + g11 + ", playId=" + i11, null, 4, null);
        return i11;
    }

    @Override // d7.m
    public void b() {
        if (this.f47295g) {
            return;
        }
        Iterator<T> it = this.f47293e.values().iterator();
        while (it.hasNext()) {
            this.f47289a.stop(((Number) it.next()).intValue());
        }
        this.f47293e.clear();
        this.f47292d.clear();
        z6.b.d(z6.b.f101032b, f47286i, "Stopped all sound effects", null, 4, null);
    }

    @Override // d7.m
    public void c(int i11) {
        Integer num;
        if (this.f47295g || (num = this.f47293e.get(Integer.valueOf(i11))) == null) {
            return;
        }
        int intValue = num.intValue();
        this.f47289a.stop(intValue);
        this.f47293e.remove(Integer.valueOf(i11));
        z6.b.d(z6.b.f101032b, f47286i, "Stopped playId=" + i11 + ", streamId=" + intValue, null, 4, null);
    }

    public final int g(String str) {
        try {
            if (f0.J2(str, "file:///android_asset/", false, 2, null)) {
                AssetFileDescriptor openFd = f7.b.c().getAssets().openFd(k0.x4(str, "file:///android_asset/"));
                g0.o(openFd, "openFd(...)");
                return this.f47289a.load(openFd, 1);
            }
            if (!f0.J2(str, "http://", false, 2, null) && !f0.J2(str, "https://", false, 2, null)) {
                return this.f47289a.load(str, 1);
            }
            z6.b.d(z6.b.f101032b, f47286i, "Network URL not supported yet: " + str, null, 4, null);
            return 0;
        } catch (Exception e11) {
            z6.b.f101032b.e(f47286i, "Error loading sound: " + str, e11);
            return 0;
        }
    }

    public final void h(int i11) {
        Object obj;
        String str;
        Iterator<T> it = this.f47290b.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((Number) ((Map.Entry) obj).getValue()).intValue() == i11) {
                    break;
                }
            }
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry == null || (str = (String) entry.getKey()) == null) {
            return;
        }
        this.f47291c.remove(str);
        List<Pair<Integer, Float>> list = this.f47292d.get(str);
        if (list != null) {
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                Pair pair = (Pair) it2.next();
                int intValue = ((Number) pair.component1()).intValue();
                float floatValue = ((Number) pair.component2()).floatValue();
                int i12 = i11;
                int play = this.f47289a.play(i12, floatValue, floatValue, 1, 0, 1.0f);
                if (play != 0) {
                    this.f47293e.put(Integer.valueOf(intValue), Integer.valueOf(play));
                    z6.b.d(z6.b.f101032b, f47286i, "Playing pending sound: " + str + ", playId=" + intValue + ", streamId=" + play, null, 4, null);
                }
                i11 = i12;
            }
        }
        this.f47292d.remove(str);
    }

    @Override // d7.m
    public void release() {
        if (this.f47295g) {
            return;
        }
        this.f47295g = true;
        b();
        this.f47289a.release();
        this.f47290b.clear();
        this.f47291c.clear();
        z6.b.d(z6.b.f101032b, f47286i, "Released all resources", null, 4, null);
    }
}

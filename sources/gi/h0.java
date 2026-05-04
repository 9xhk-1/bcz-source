package gi;

import android.content.Context;
import android.media.SoundPool;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class h0 {

    /* renamed from: c, reason: collision with root package name */
    public static volatile h0 f53771c;

    /* renamed from: a, reason: collision with root package name */
    public SoundPool f53772a = new SoundPool(3, 3, 0);

    /* renamed from: b, reason: collision with root package name */
    public Map<Integer, Integer> f53773b = new HashMap(3);

    public static h0 a() {
        if (f53771c == null) {
            synchronized (h0.class) {
                try {
                    if (f53771c == null) {
                        f53771c = new h0();
                    }
                } finally {
                }
            }
        }
        return f53771c;
    }

    public void b(Context context, int resId) {
        d(context, resId);
        this.f53772a.play(this.f53773b.get(Integer.valueOf(resId)).intValue(), 1.0f, 1.0f, 0, 0, 1.0f);
    }

    public void c() {
        this.f53772a.release();
        this.f53773b.clear();
    }

    public void d(Context context, int... resIds) {
        for (int i11 : resIds) {
            if (!this.f53773b.containsKey(Integer.valueOf(i11))) {
                this.f53773b.put(Integer.valueOf(i11), Integer.valueOf(this.f53772a.load(context, i11, 1)));
            }
        }
    }
}

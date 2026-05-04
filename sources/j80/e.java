package j80;

import org.greenrobot.eventbus.ThreadMode;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f63888a;

    /* renamed from: b, reason: collision with root package name */
    public final ThreadMode f63889b;

    /* renamed from: c, reason: collision with root package name */
    public final Class<?> f63890c;

    /* renamed from: d, reason: collision with root package name */
    public final int f63891d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f63892e;

    public e(String str, Class<?> cls, ThreadMode threadMode, int i11, boolean z11) {
        this.f63888a = str;
        this.f63889b = threadMode;
        this.f63890c = cls;
        this.f63891d = i11;
        this.f63892e = z11;
    }

    public e(String str, Class<?> cls) {
        this(str, cls, ThreadMode.POSTING, 0, false);
    }

    public e(String str, Class<?> cls, ThreadMode threadMode) {
        this(str, cls, threadMode, 0, false);
    }
}

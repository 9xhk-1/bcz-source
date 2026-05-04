package n20;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public static final k f74370a = new k("BEGINNING", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final k f74371b = new k("MIDDLE", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final k f74372c = new k("AFTER_DOT", 2);

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ k[] f74373d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ m00.a f74374e;

    static {
        k[] a11 = a();
        f74373d = a11;
        f74374e = m00.c.c(a11);
    }

    public k(String str, int i11) {
    }

    public static final /* synthetic */ k[] a() {
        return new k[]{f74370a, f74371b, f74372c};
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) f74373d.clone();
    }
}

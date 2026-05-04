package a90;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class e0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f2377a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2378b;

    public e0(String pattern, String displayName) {
        this.f2377a = pattern;
        this.f2378b = displayName;
    }

    public String a(int currentRepetition, int totalRepetitions) {
        return this.f2377a.replace("{displayName}", this.f2378b).replace(org.junit.jupiter.api.b3.S, String.valueOf(currentRepetition)).replace(org.junit.jupiter.api.b3.T, String.valueOf(totalRepetitions));
    }
}

package xy;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final String f98655a;

    /* renamed from: b, reason: collision with root package name */
    public final int f98656b;

    public u(@m80.k String content) {
        kotlin.jvm.internal.g0.p(content, "content");
        this.f98655a = content;
        int length = content.length();
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12++) {
            i11 = (i11 * 31) + Character.toLowerCase(content.charAt(i12));
        }
        this.f98656b = i11;
    }

    @m80.k
    public final String a() {
        return this.f98655a;
    }

    public boolean equals(@m80.l Object obj) {
        String str;
        u uVar = obj instanceof u ? (u) obj : null;
        return (uVar == null || (str = uVar.f98655a) == null || !u30.f0.c2(str, this.f98655a, true)) ? false : true;
    }

    public int hashCode() {
        return this.f98656b;
    }

    @m80.k
    public String toString() {
        return this.f98655a;
    }
}

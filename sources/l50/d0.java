package l50;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@j0
/* loaded from: classes8.dex */
public abstract class d0 implements c0 {

    /* renamed from: a, reason: collision with root package name */
    @m80.l
    public Character f69956a;

    @Override // l50.c0
    public final int a(@m80.k char[] buffer, int i11, int i12) {
        int i13;
        kotlin.jvm.internal.g0.p(buffer, "buffer");
        Character ch2 = this.f69956a;
        if (ch2 != null) {
            kotlin.jvm.internal.g0.m(ch2);
            buffer[i11] = ch2.charValue();
            this.f69956a = null;
            i13 = 1;
        } else {
            i13 = 0;
        }
        while (i13 < i12 && !b()) {
            int c11 = c();
            if (c11 <= 65535) {
                buffer[i11 + i13] = (char) c11;
                i13++;
            } else {
                char c12 = (char) ((c11 >>> 10) + 55232);
                char c13 = (char) ((c11 & 1023) + 56320);
                buffer[i11 + i13] = c12;
                int i14 = i13 + 1;
                if (i14 < i12) {
                    buffer[i14 + i11] = c13;
                    i13 += 2;
                } else {
                    this.f69956a = Character.valueOf(c13);
                    i13 = i14;
                }
            }
        }
        if (i13 > 0) {
            return i13;
        }
        return -1;
    }

    public abstract boolean b();

    public abstract int c();
}

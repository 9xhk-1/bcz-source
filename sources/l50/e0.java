package l50;

import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@j0
/* loaded from: classes8.dex */
public interface e0 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final a f69985a = a.f69986a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f69986a = new a();

        public final void a(@m80.k String text, @m80.k x00.q<? super String, ? super Integer, ? super Integer, g2> writeImpl) {
            kotlin.jvm.internal.g0.p(text, "text");
            kotlin.jvm.internal.g0.p(writeImpl, "writeImpl");
            int length = text.length();
            int i11 = 0;
            for (int i12 = 0; i12 < length; i12++) {
                char charAt = text.charAt(i12);
                if (charAt < q1.b().length && q1.b()[charAt] != null) {
                    writeImpl.invoke(text, Integer.valueOf(i11), Integer.valueOf(i12));
                    String str = q1.b()[charAt];
                    kotlin.jvm.internal.g0.m(str);
                    writeImpl.invoke(str, 0, Integer.valueOf(str.length()));
                    i11 = i12 + 1;
                }
            }
            writeImpl.invoke(text, Integer.valueOf(i11), Integer.valueOf(text.length()));
        }
    }

    void a(char c11);

    void b(@m80.k String str);

    void c(@m80.k String str);

    void release();

    void writeLong(long j11);
}

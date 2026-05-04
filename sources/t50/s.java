package t50;

import okio.ByteString;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public interface s {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface a {
        @m80.k
        s a(@m80.k okhttp3.l lVar, @m80.k t tVar);
    }

    long b();

    void cancel();

    boolean d(int i11, @m80.l String str);

    boolean f(@m80.k ByteString byteString);

    boolean g(@m80.k String str);

    @m80.k
    okhttp3.l request();
}

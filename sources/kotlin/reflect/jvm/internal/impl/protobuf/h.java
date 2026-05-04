package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f67575a;

    /* renamed from: b, reason: collision with root package name */
    public static final ByteBuffer f67576b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface a {
        int getNumber();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface b<T extends a> {
        T findValueByNumber(int i11);
    }

    static {
        byte[] bArr = new byte[0];
        f67575a = bArr;
        f67576b = ByteBuffer.wrap(bArr);
    }

    public static boolean a(byte[] bArr) {
        return u.e(bArr);
    }

    public static String b(byte[] bArr) {
        try {
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException e11) {
            throw new RuntimeException("UTF-8 not supported?", e11);
        }
    }
}

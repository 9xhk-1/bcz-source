package wk;

import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import kk.u;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class j implements ik.f<InputStream, c> {

    /* renamed from: d, reason: collision with root package name */
    public static final String f96471d = "StreamGifDecoder";

    /* renamed from: a, reason: collision with root package name */
    public final List<ImageHeaderParser> f96472a;

    /* renamed from: b, reason: collision with root package name */
    public final ik.f<ByteBuffer, c> f96473b;

    /* renamed from: c, reason: collision with root package name */
    public final lk.b f96474c;

    public j(List<ImageHeaderParser> list, ik.f<ByteBuffer, c> fVar, lk.b bVar) {
        this.f96472a = list;
        this.f96473b = fVar;
        this.f96474c = bVar;
    }

    public static byte[] e(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr = new byte[16384];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    byteArrayOutputStream.flush();
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
        } catch (IOException e11) {
            if (!Log.isLoggable(f96471d, 5)) {
                return null;
            }
            Log.w(f96471d, "Error reading data from stream", e11);
            return null;
        }
    }

    @Override // ik.f
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public u<c> a(@NonNull InputStream inputStream, int i11, int i12, @NonNull ik.e eVar) throws IOException {
        byte[] e11 = e(inputStream);
        if (e11 == null) {
            return null;
        }
        return this.f96473b.a(ByteBuffer.wrap(e11), i11, i12, eVar);
    }

    @Override // ik.f
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(@NonNull InputStream inputStream, @NonNull ik.e eVar) throws IOException {
        return !((Boolean) eVar.c(i.f96470b)).booleanValue() && com.bumptech.glide.load.a.f(this.f96472a, inputStream, this.f96474c) == ImageHeaderParser.ImageType.GIF;
    }
}

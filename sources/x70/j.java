package x70;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import java.nio.charset.CharacterCodingException;
import org.apache.http.util.CharArrayBuffer;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public interface j {
    boolean a();

    int e(ByteBuffer byteBuffer, int i11);

    int g(WritableByteChannel writableByteChannel, int i11) throws IOException;

    int j(WritableByteChannel writableByteChannel) throws IOException;

    String l(boolean z11) throws CharacterCodingException;

    int length();

    boolean n(CharArrayBuffer charArrayBuffer, boolean z11) throws CharacterCodingException;

    int o(ReadableByteChannel readableByteChannel) throws IOException;

    int read();

    int read(ByteBuffer byteBuffer);
}

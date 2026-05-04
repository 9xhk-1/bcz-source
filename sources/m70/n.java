package m70;

import java.io.IOException;
import java.nio.channels.ReadableByteChannel;
import org.apache.http.HttpException;
import org.apache.http.o;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public interface n<T extends org.apache.http.o> {
    T a() throws IOException, HttpException;

    int b(ReadableByteChannel readableByteChannel) throws IOException;

    void reset();
}

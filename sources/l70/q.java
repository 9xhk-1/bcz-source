package l70;

import org.apache.http.ParseException;
import org.apache.http.ProtocolVersion;
import org.apache.http.RequestLine;
import org.apache.http.util.CharArrayBuffer;
import org.apache.http.x;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public interface q {
    RequestLine a(CharArrayBuffer charArrayBuffer, r rVar) throws ParseException;

    x b(CharArrayBuffer charArrayBuffer, r rVar) throws ParseException;

    boolean c(CharArrayBuffer charArrayBuffer, r rVar);

    org.apache.http.e d(CharArrayBuffer charArrayBuffer) throws ParseException;

    ProtocolVersion e(CharArrayBuffer charArrayBuffer, r rVar) throws ParseException;
}

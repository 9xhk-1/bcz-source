package org.apache.http;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public interface HttpEntity {
    @Deprecated
    void E() throws IOException;

    e Z();

    boolean a0();

    long c0();

    e getContentType();

    boolean n();

    boolean q();

    InputStream w() throws IOException, UnsupportedOperationException;

    void writeTo(OutputStream outputStream) throws IOException;
}

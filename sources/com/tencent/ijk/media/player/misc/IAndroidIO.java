package com.tencent.ijk.media.player.misc;

import java.io.IOException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public interface IAndroidIO {
    int close() throws IOException;

    int open(String str) throws IOException;

    int read(byte[] bArr, int i11) throws IOException;

    long seek(long j11, int i11) throws IOException;
}

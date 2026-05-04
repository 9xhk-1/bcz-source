package com.tencent.liteav.audio.impl.Record;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public interface c {
    void onAudioRecordError(int i11, String str);

    void onAudioRecordPCM(byte[] bArr, int i11, long j11);

    void onAudioRecordStart();

    void onAudioRecordStop();
}

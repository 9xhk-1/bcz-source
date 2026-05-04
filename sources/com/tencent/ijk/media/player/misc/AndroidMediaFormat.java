package com.tencent.ijk.media.player.misc;

import android.annotation.TargetApi;
import android.media.MediaFormat;
import l50.b;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class AndroidMediaFormat implements IMediaFormat {
    private final MediaFormat mMediaFormat;

    public AndroidMediaFormat(MediaFormat mediaFormat) {
        this.mMediaFormat = mediaFormat;
    }

    @Override // com.tencent.ijk.media.player.misc.IMediaFormat
    @TargetApi(16)
    public int getInteger(String str) {
        MediaFormat mediaFormat = this.mMediaFormat;
        if (mediaFormat == null) {
            return 0;
        }
        return mediaFormat.getInteger(str);
    }

    @Override // com.tencent.ijk.media.player.misc.IMediaFormat
    @TargetApi(16)
    public String getString(String str) {
        MediaFormat mediaFormat = this.mMediaFormat;
        if (mediaFormat == null) {
            return null;
        }
        return mediaFormat.getString(str);
    }

    @TargetApi(16)
    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append(getClass().getName());
        sb2.append(b.f69927i);
        MediaFormat mediaFormat = this.mMediaFormat;
        if (mediaFormat != null) {
            sb2.append(mediaFormat.toString());
        } else {
            sb2.append("null");
        }
        sb2.append(b.f69928j);
        return sb2.toString();
    }
}

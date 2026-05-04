package com.tencent.ijk.media.player.misc;

import android.text.TextUtils;
import androidx.media3.common.C;
import com.alipay.sdk.m.u.i;
import com.tencent.ijk.media.player.IjkMediaMeta;
import l50.b;
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class IjkTrackInfo implements ITrackInfo {
    private IjkMediaMeta.IjkStreamMeta mStreamMeta;
    private int mTrackType = 0;

    public IjkTrackInfo(IjkMediaMeta.IjkStreamMeta ijkStreamMeta) {
        this.mStreamMeta = ijkStreamMeta;
    }

    @Override // com.tencent.ijk.media.player.misc.ITrackInfo
    public IMediaFormat getFormat() {
        return new IjkMediaFormat(this.mStreamMeta);
    }

    @Override // com.tencent.ijk.media.player.misc.ITrackInfo
    public String getInfoInline() {
        StringBuilder sb2 = new StringBuilder(128);
        int i11 = this.mTrackType;
        if (i11 == 1) {
            sb2.append("VIDEO");
            sb2.append(j2.O);
            sb2.append(this.mStreamMeta.getCodecShortNameInline());
            sb2.append(j2.O);
            sb2.append(this.mStreamMeta.getBitrateInline());
            sb2.append(j2.O);
            sb2.append(this.mStreamMeta.getResolutionInline());
        } else if (i11 == 2) {
            sb2.append("AUDIO");
            sb2.append(j2.O);
            sb2.append(this.mStreamMeta.getCodecShortNameInline());
            sb2.append(j2.O);
            sb2.append(this.mStreamMeta.getBitrateInline());
            sb2.append(j2.O);
            sb2.append(this.mStreamMeta.getSampleRateInline());
        } else if (i11 == 3) {
            sb2.append("TIMEDTEXT");
            sb2.append(j2.O);
            sb2.append(this.mStreamMeta.mLanguage);
        } else if (i11 != 4) {
            sb2.append("UNKNOWN");
        } else {
            sb2.append("SUBTITLE");
        }
        return sb2.toString();
    }

    @Override // com.tencent.ijk.media.player.misc.ITrackInfo
    public String getLanguage() {
        IjkMediaMeta.IjkStreamMeta ijkStreamMeta = this.mStreamMeta;
        return (ijkStreamMeta == null || TextUtils.isEmpty(ijkStreamMeta.mLanguage)) ? C.LANGUAGE_UNDETERMINED : this.mStreamMeta.mLanguage;
    }

    @Override // com.tencent.ijk.media.player.misc.ITrackInfo
    public int getTrackType() {
        return this.mTrackType;
    }

    public void setMediaMeta(IjkMediaMeta.IjkStreamMeta ijkStreamMeta) {
        this.mStreamMeta = ijkStreamMeta;
    }

    public void setTrackType(int i11) {
        this.mTrackType = i11;
    }

    public String toString() {
        return getClass().getSimpleName() + b.f69927i + getInfoInline() + i.f11099d;
    }
}

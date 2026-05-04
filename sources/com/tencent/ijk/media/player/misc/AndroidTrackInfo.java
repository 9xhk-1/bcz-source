package com.tencent.ijk.media.player.misc;

import android.annotation.TargetApi;
import android.media.MediaFormat;
import android.media.MediaPlayer;
import androidx.media3.common.C;
import l50.b;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class AndroidTrackInfo implements ITrackInfo {
    private final MediaPlayer.TrackInfo mTrackInfo;

    private AndroidTrackInfo(MediaPlayer.TrackInfo trackInfo) {
        this.mTrackInfo = trackInfo;
    }

    public static AndroidTrackInfo[] fromMediaPlayer(MediaPlayer mediaPlayer) {
        return fromTrackInfo(mediaPlayer.getTrackInfo());
    }

    private static AndroidTrackInfo[] fromTrackInfo(MediaPlayer.TrackInfo[] trackInfoArr) {
        if (trackInfoArr == null) {
            return null;
        }
        AndroidTrackInfo[] androidTrackInfoArr = new AndroidTrackInfo[trackInfoArr.length];
        for (int i11 = 0; i11 < trackInfoArr.length; i11++) {
            androidTrackInfoArr[i11] = new AndroidTrackInfo(trackInfoArr[i11]);
        }
        return androidTrackInfoArr;
    }

    @Override // com.tencent.ijk.media.player.misc.ITrackInfo
    @TargetApi(19)
    public IMediaFormat getFormat() {
        MediaFormat format;
        MediaPlayer.TrackInfo trackInfo = this.mTrackInfo;
        if (trackInfo == null || (format = trackInfo.getFormat()) == null) {
            return null;
        }
        return new AndroidMediaFormat(format);
    }

    @Override // com.tencent.ijk.media.player.misc.ITrackInfo
    @TargetApi(16)
    public String getInfoInline() {
        MediaPlayer.TrackInfo trackInfo = this.mTrackInfo;
        return trackInfo != null ? trackInfo.toString() : "null";
    }

    @Override // com.tencent.ijk.media.player.misc.ITrackInfo
    @TargetApi(16)
    public String getLanguage() {
        MediaPlayer.TrackInfo trackInfo = this.mTrackInfo;
        return trackInfo == null ? C.LANGUAGE_UNDETERMINED : trackInfo.getLanguage();
    }

    @Override // com.tencent.ijk.media.player.misc.ITrackInfo
    @TargetApi(16)
    public int getTrackType() {
        MediaPlayer.TrackInfo trackInfo = this.mTrackInfo;
        if (trackInfo == null) {
            return 0;
        }
        return trackInfo.getTrackType();
    }

    @TargetApi(16)
    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append(getClass().getSimpleName());
        sb2.append(b.f69927i);
        MediaPlayer.TrackInfo trackInfo = this.mTrackInfo;
        if (trackInfo != null) {
            sb2.append(trackInfo.toString());
        } else {
            sb2.append("null");
        }
        sb2.append(b.f69928j);
        return sb2.toString();
    }
}

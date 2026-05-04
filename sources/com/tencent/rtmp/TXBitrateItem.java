package com.tencent.rtmp;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class TXBitrateItem implements Comparable<TXBitrateItem> {
    public int bitrate;
    public int height;
    public int index;
    public int width;

    @Override // java.lang.Comparable
    public int compareTo(TXBitrateItem tXBitrateItem) {
        return this.bitrate - tXBitrateItem.bitrate;
    }
}

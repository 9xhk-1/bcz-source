package androidx.media3.extractor.metadata.dvbsi;

import androidx.media3.common.Metadata;
import androidx.media3.common.util.UnstableApi;
import pn.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public final class AppInfoTable implements Metadata.Entry {
    public static final int CONTROL_CODE_AUTOSTART = 1;
    public static final int CONTROL_CODE_PRESENT = 2;
    public final int controlCode;
    public final String url;

    public AppInfoTable(int i11, String str) {
        this.controlCode = i11;
        this.url = str;
    }

    public String toString() {
        return "Ait(controlCode=" + this.controlCode + ",url=" + this.url + j.f81007d;
    }
}

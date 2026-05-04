package androidx.media3.common;

import androidx.media3.common.util.GlUtil;
import androidx.media3.common.util.UnstableApi;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public final class GlTextureInfo {
    public static final GlTextureInfo UNSET = new GlTextureInfo(-1, -1, -1, -1, -1);
    public final int fboId;
    public final int height;
    public final int rboId;
    public final int texId;
    public final int width;

    public GlTextureInfo(int i11, int i12, int i13, int i14, int i15) {
        this.texId = i11;
        this.fboId = i12;
        this.rboId = i13;
        this.width = i14;
        this.height = i15;
    }

    public void release() throws GlUtil.GlException {
        int i11 = this.texId;
        if (i11 != -1) {
            GlUtil.deleteTexture(i11);
        }
        int i12 = this.fboId;
        if (i12 != -1) {
            GlUtil.deleteFbo(i12);
        }
        int i13 = this.rboId;
        if (i13 != -1) {
            GlUtil.deleteRbo(i13);
        }
    }
}

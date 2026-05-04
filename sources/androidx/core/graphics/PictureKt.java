package androidx.core.graphics;

import android.graphics.Canvas;
import android.graphics.Picture;
import kotlin.jvm.internal.d0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class PictureKt {
    @m80.k
    public static final Picture record(@m80.k Picture picture, int i11, int i12, @m80.k x00.l<? super Canvas, g2> lVar) {
        Canvas beginRecording = picture.beginRecording(i11, i12);
        try {
            lVar.invoke(beginRecording);
            return picture;
        } finally {
            d0.d(1);
            picture.endRecording();
            d0.c(1);
        }
    }
}

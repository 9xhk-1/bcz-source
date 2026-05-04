package androidx.core.content;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.AttrRes;
import androidx.annotation.StyleRes;
import androidx.exifinterface.media.ExifInterface;
import kotlin.jvm.internal.g0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class ContextKt {
    public static final /* synthetic */ <T> T getSystemService(Context context) {
        g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
        return (T) ContextCompat.getSystemService(context, Object.class);
    }

    public static final void withStyledAttributes(@m80.k Context context, @m80.l AttributeSet attributeSet, @m80.k int[] iArr, @AttrRes int i11, @StyleRes int i12, @m80.k x00.l<? super TypedArray, g2> lVar) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i11, i12);
        lVar.invoke(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
    }

    public static /* synthetic */ void withStyledAttributes$default(Context context, AttributeSet attributeSet, int[] iArr, int i11, int i12, x00.l lVar, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            attributeSet = null;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = 0;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i11, i12);
        lVar.invoke(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
    }

    public static final void withStyledAttributes(@m80.k Context context, @StyleRes int i11, @m80.k int[] iArr, @m80.k x00.l<? super TypedArray, g2> lVar) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i11, iArr);
        lVar.invoke(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
    }
}

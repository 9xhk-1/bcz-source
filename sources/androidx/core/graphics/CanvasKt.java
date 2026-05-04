package androidx.core.graphics;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import kotlin.jvm.internal.d0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class CanvasKt {
    public static final void withClip(@m80.k Canvas canvas, @m80.k Rect rect, @m80.k x00.l<? super Canvas, g2> lVar) {
        int save = canvas.save();
        canvas.clipRect(rect);
        try {
            lVar.invoke(canvas);
        } finally {
            d0.d(1);
            canvas.restoreToCount(save);
            d0.c(1);
        }
    }

    public static final void withMatrix(@m80.k Canvas canvas, @m80.k Matrix matrix, @m80.k x00.l<? super Canvas, g2> lVar) {
        int save = canvas.save();
        canvas.concat(matrix);
        try {
            lVar.invoke(canvas);
        } finally {
            d0.d(1);
            canvas.restoreToCount(save);
            d0.c(1);
        }
    }

    public static /* synthetic */ void withMatrix$default(Canvas canvas, Matrix matrix, x00.l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            matrix = new Matrix();
        }
        int save = canvas.save();
        canvas.concat(matrix);
        try {
            lVar.invoke(canvas);
        } finally {
            d0.d(1);
            canvas.restoreToCount(save);
            d0.c(1);
        }
    }

    public static final void withRotation(@m80.k Canvas canvas, float f11, float f12, float f13, @m80.k x00.l<? super Canvas, g2> lVar) {
        int save = canvas.save();
        canvas.rotate(f11, f12, f13);
        try {
            lVar.invoke(canvas);
        } finally {
            d0.d(1);
            canvas.restoreToCount(save);
            d0.c(1);
        }
    }

    public static /* synthetic */ void withRotation$default(Canvas canvas, float f11, float f12, float f13, x00.l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = 0.0f;
        }
        if ((i11 & 2) != 0) {
            f12 = 0.0f;
        }
        if ((i11 & 4) != 0) {
            f13 = 0.0f;
        }
        int save = canvas.save();
        canvas.rotate(f11, f12, f13);
        try {
            lVar.invoke(canvas);
        } finally {
            d0.d(1);
            canvas.restoreToCount(save);
            d0.c(1);
        }
    }

    public static final void withSave(@m80.k Canvas canvas, @m80.k x00.l<? super Canvas, g2> lVar) {
        int save = canvas.save();
        try {
            lVar.invoke(canvas);
        } finally {
            d0.d(1);
            canvas.restoreToCount(save);
            d0.c(1);
        }
    }

    public static final void withScale(@m80.k Canvas canvas, float f11, float f12, float f13, float f14, @m80.k x00.l<? super Canvas, g2> lVar) {
        int save = canvas.save();
        canvas.scale(f11, f12, f13, f14);
        try {
            lVar.invoke(canvas);
        } finally {
            d0.d(1);
            canvas.restoreToCount(save);
            d0.c(1);
        }
    }

    public static /* synthetic */ void withScale$default(Canvas canvas, float f11, float f12, float f13, float f14, x00.l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = 1.0f;
        }
        if ((i11 & 2) != 0) {
            f12 = 1.0f;
        }
        if ((i11 & 4) != 0) {
            f13 = 0.0f;
        }
        if ((i11 & 8) != 0) {
            f14 = 0.0f;
        }
        int save = canvas.save();
        canvas.scale(f11, f12, f13, f14);
        try {
            lVar.invoke(canvas);
        } finally {
            d0.d(1);
            canvas.restoreToCount(save);
            d0.c(1);
        }
    }

    public static final void withSkew(@m80.k Canvas canvas, float f11, float f12, @m80.k x00.l<? super Canvas, g2> lVar) {
        int save = canvas.save();
        canvas.skew(f11, f12);
        try {
            lVar.invoke(canvas);
        } finally {
            d0.d(1);
            canvas.restoreToCount(save);
            d0.c(1);
        }
    }

    public static /* synthetic */ void withSkew$default(Canvas canvas, float f11, float f12, x00.l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = 0.0f;
        }
        if ((i11 & 2) != 0) {
            f12 = 0.0f;
        }
        int save = canvas.save();
        canvas.skew(f11, f12);
        try {
            lVar.invoke(canvas);
        } finally {
            d0.d(1);
            canvas.restoreToCount(save);
            d0.c(1);
        }
    }

    public static final void withTranslation(@m80.k Canvas canvas, float f11, float f12, @m80.k x00.l<? super Canvas, g2> lVar) {
        int save = canvas.save();
        canvas.translate(f11, f12);
        try {
            lVar.invoke(canvas);
        } finally {
            d0.d(1);
            canvas.restoreToCount(save);
            d0.c(1);
        }
    }

    public static /* synthetic */ void withTranslation$default(Canvas canvas, float f11, float f12, x00.l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = 0.0f;
        }
        if ((i11 & 2) != 0) {
            f12 = 0.0f;
        }
        int save = canvas.save();
        canvas.translate(f11, f12);
        try {
            lVar.invoke(canvas);
        } finally {
            d0.d(1);
            canvas.restoreToCount(save);
            d0.c(1);
        }
    }

    public static final void withClip(@m80.k Canvas canvas, @m80.k RectF rectF, @m80.k x00.l<? super Canvas, g2> lVar) {
        int save = canvas.save();
        canvas.clipRect(rectF);
        try {
            lVar.invoke(canvas);
        } finally {
            d0.d(1);
            canvas.restoreToCount(save);
            d0.c(1);
        }
    }

    public static final void withClip(@m80.k Canvas canvas, int i11, int i12, int i13, int i14, @m80.k x00.l<? super Canvas, g2> lVar) {
        int save = canvas.save();
        canvas.clipRect(i11, i12, i13, i14);
        try {
            lVar.invoke(canvas);
        } finally {
            d0.d(1);
            canvas.restoreToCount(save);
            d0.c(1);
        }
    }

    public static final void withClip(@m80.k Canvas canvas, float f11, float f12, float f13, float f14, @m80.k x00.l<? super Canvas, g2> lVar) {
        int save = canvas.save();
        canvas.clipRect(f11, f12, f13, f14);
        try {
            lVar.invoke(canvas);
        } finally {
            d0.d(1);
            canvas.restoreToCount(save);
            d0.c(1);
        }
    }

    public static final void withClip(@m80.k Canvas canvas, @m80.k Path path, @m80.k x00.l<? super Canvas, g2> lVar) {
        int save = canvas.save();
        canvas.clipPath(path);
        try {
            lVar.invoke(canvas);
        } finally {
            d0.d(1);
            canvas.restoreToCount(save);
            d0.c(1);
        }
    }
}

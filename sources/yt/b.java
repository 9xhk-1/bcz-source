package yt;

import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.annotation.NonNull;
import com.rd.animation.type.AnimationType;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class b extends a {

    /* renamed from: c, reason: collision with root package name */
    public Paint f100324c;

    public b(@NonNull Paint paint, @NonNull wt.a aVar) {
        super(paint, aVar);
        Paint paint2 = new Paint();
        this.f100324c = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        this.f100324c.setAntiAlias(true);
        this.f100324c.setStrokeWidth(aVar.s());
    }

    public void a(@NonNull Canvas canvas, int i11, boolean z11, int i12, int i13) {
        Paint paint;
        float m11 = this.f100323b.m();
        int s11 = this.f100323b.s();
        float o11 = this.f100323b.o();
        int p11 = this.f100323b.p();
        int t11 = this.f100323b.t();
        int q11 = this.f100323b.q();
        AnimationType b11 = this.f100323b.b();
        if ((b11 == AnimationType.SCALE && !z11) || (b11 == AnimationType.SCALE_DOWN && z11)) {
            m11 *= o11;
        }
        if (i11 != q11) {
            p11 = t11;
        }
        if (b11 != AnimationType.FILL || i11 == q11) {
            paint = this.f100322a;
        } else {
            paint = this.f100324c;
            paint.setStrokeWidth(s11);
        }
        paint.setColor(p11);
        canvas.drawCircle(i12, i13, m11, paint);
    }
}
